/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.ide.eclipse.adt;

import com.android.SdkConstants;

import java.io.File;
import java.util.regex.Pattern;

/**
 * Constant definition class.<br>
 * <br>
 * Most constants have a prefix defining the content.
 * <ul>
 * <li><code>WS_</code> Workspace path constant. Those are absolute paths,
 * from the project root.</li>
 * <li><code>OS_</code> OS path constant. These paths are different depending on the platform.</li>
 * <li><code>FN_</code> File name constant.</li>
 * <li><code>FD_</code> Folder name constant.</li>
 * <li><code>MARKER_</code> Resource Marker Ids constant.</li>
 * <li><code>EXT_</code> File extension constant. This does NOT include a dot.</li>
 * <li><code>DOT_</code> File extension constant. This start with a dot.</li>
 * <li><code>RE_</code> Regexp constant.</li>
 * <li><code>NS_</code> Namespace constant.</li>
 * <li><code>CLASS_</code> Fully qualified class name.</li>
 * </ul>
 *
 */
public class AndroidConstants {
    /**
     * The old Editors Plugin ID. It is still used in some places for compatibility.
     * Please do not use for new features.
     */
    public static final String EDITORS_NAMESPACE = "com.android.ide.eclipse.editors"; // $NON-NLS-1$

    /** Nature of default Android projects */
    public final static String NATURE_DEFAULT = "com.android.ide.eclipse.adt.AndroidNature"; //$NON-NLS-1$
    /** Nature of Android export projects */
    public final static String NATURE_EXPORT = "com.android.ide.eclipse.adt.AndroidExportNature"; //$NON-NLS-1$

    /** Separator for workspace path, i.e. "/". */
    public final static String WS_SEP = "/"; //$NON-NLS-1$
    /** Separator character for workspace path, i.e. '/'. */
    public final static char WS_SEP_CHAR = '/';

    /** Extension of the Application package Files, i.e. "apk". */
    public final static String EXT_ANDROID_PACKAGE = "apk"; //$NON-NLS-1$
    /** Extension of java files, i.e. "java" */
    public final static String EXT_JAVA = "java"; //$NON-NLS-1$
    /** Extension of compiled java files, i.e. "class" */
    public final static String EXT_CLASS = "class"; //$NON-NLS-1$
    /** Extension of xml files, i.e. "xml" */
    public final static String EXT_XML = "xml"; //$NON-NLS-1$
    /** Extension of jar files, i.e. "jar" */
    public final static String EXT_JAR = "jar"; //$NON-NLS-1$
    /** Extension of aidl files, i.e. "aidl" */
    public final static String EXT_AIDL = "aidl"; //$NON-NLS-1$
    /** Extension of native libraries, i.e. "so" */
    public final static String EXT_NATIVE_LIB = "so"; //$NON-NLS-1$

    private final static String DOT = "."; //$NON-NLS-1$

    /** Dot-Extension of the Application package Files, i.e. ".apk". */
    public final static String DOT_ANDROID_PACKAGE = DOT + EXT_ANDROID_PACKAGE;
    /** Dot-Extension of java files, i.e. ".java" */
    public final static String DOT_JAVA = DOT + EXT_JAVA;
    /** Dot-Extension of compiled java files, i.e. ".class" */
    public final static String DOT_CLASS = DOT + EXT_CLASS;
    /** Dot-Extension of xml files, i.e. ".xml" */
    public final static String DOT_XML = DOT + EXT_XML;
    /** Dot-Extension of jar files, i.e. ".jar" */
    public final static String DOT_JAR = DOT + EXT_JAR;
    /** Dot-Extension of aidl files, i.e. ".aidl" */
    public final static String DOT_AIDL = DOT + EXT_AIDL;

    /** Name of the android sources directory */
    public static final String FD_ANDROID_SOURCES = "sources"; //$NON-NLS-1$

    /** Resource base name for java files and classes */
    public final static String FN_RESOURCE_BASE = "R"; //$NON-NLS-1$
    /** Resource java class  filename, i.e. "R.java" */
    public final static String FN_RESOURCE_CLASS = FN_RESOURCE_BASE + DOT_JAVA;
    /** Resource class file  filename, i.e. "R.class" */
    public final static String FN_COMPILED_RESOURCE_CLASS = FN_RESOURCE_BASE + DOT_CLASS;
    /** Manifest java class filename, i.e. "Manifest.java" */
    public final static String FN_MANIFEST_CLASS = "Manifest.java"; //$NON-NLS-1$
    /** Temporary packaged resources file name, i.e. "resources.ap_" */
    public final static String FN_RESOURCES_AP_ = "resources.ap_"; //$NON-NLS-1$
    /** Temporary packaged resources file name for a specific set of configuration */
    public final static String FN_RESOURCES_S_AP_ = "resources-%s.ap_"; //$NON-NLS-1$
    public final static Pattern PATTERN_RESOURCES_S_AP_ =
        Pattern.compile("resources-.*\\.ap_", Pattern.CASE_INSENSITIVE); //$NON-NLS-1$

    public final static String FN_TRACEVIEW =
        (SdkConstants.CURRENT_PLATFORM == SdkConstants.PLATFORM_WINDOWS) ?
            "traceview.exe" : "traceview"; //$NON-NLS-1$ //$NON-NLS-2$

    /** Absolute path of the workspace root, i.e. "/" */
    public final static String WS_ROOT = WS_SEP;

    /** Absolute path of the resource folder, eg "/res".<br> This is a workspace path. */
    public final static String WS_RESOURCES = WS_SEP + SdkConstants.FD_RESOURCES;

    /** Absolute path of the resource folder, eg "/assets".<br> This is a workspace path. */
    public final static String WS_ASSETS = WS_SEP + SdkConstants.FD_ASSETS;

    /** Leaf of the javaDoc folder. Does not start with a separator. */
    public final static String WS_JAVADOC_FOLDER_LEAF = SdkConstants.FD_DOCS + "/" + //$NON-NLS-1$
            SdkConstants.FD_DOCS_REFERENCE;

    /** Path of the samples directory relative to the sdk folder.
     *  This is an OS path, ending with a separator.
     *  FIXME: remove once the NPW is fixed. */
    public final static String OS_SDK_SAMPLES_FOLDER = SdkConstants.FD_SAMPLES + File.separator;

    public final static String RE_DOT = "\\."; //$NON-NLS-1$
    /** Regexp for java extension, i.e. "\.java$" */
    public final static String RE_JAVA_EXT = "\\.java$"; //$NON-NLS-1$
    /** Regexp for aidl extension, i.e. "\.aidl$" */
    public final static String RE_AIDL_EXT = "\\.aidl$"; //$NON-NLS-1$

    /**
     * Namespace pattern for the custom resource XML, i.e. "http://schemas.android.com/apk/res/%s"
     * <p/>
     * This string contains a %s. It must be combined with the desired Java package, e.g.:
     * <pre>
     *    String.format(AndroidConstants.NS_CUSTOM_RESOURCES, "android");
     *    String.format(AndroidConstants.NS_CUSTOM_RESOURCES, "com.test.mycustomapp");
     * </pre>
     *
     * Note: if you need an URI specifically for the "android" namespace, consider using
     * {@link SdkConstants#NS_RESOURCES} instead.
     */
    // TODO rename NS_CUSTOM_RESOURCES to NS_CUSTOM_RESOURCES_S (denoting it takes a %s) in
    // another CL.
    public final static String NS_CUSTOM_RESOURCES = "http://schemas.android.com/apk/res/%1$s"; //$NON-NLS-1$

    /** The old common plug-in ID. Please do not use for new features. */
    private static final String LEGACY_PLUGIN_ID = "com.android.ide.eclipse.common"; //$NON-NLS-1$

    /** Generic marker for ADT errors, only to be used in the {@link ResourceManagerBuilder} */
    //public final static String MARKER_ADT = AdtPlugin.PLUGIN_ID + ".adtProblem"; //$NON-NLS-1$

    /** Marker for Android Target errors.
     * This is not cleared on each like other markers. Instead, it's cleared
     * when an AndroidClasspathContainerInitializer has succeeded in creating an
     * AndroidClasspathContainer */
    //public final static String MARKER_TARGET = AdtPlugin.PLUGIN_ID + ".targetProblem"; //$NON-NLS-1$

    /** aapt marker error when running the compile command, only to be used
     * in {@link PreCompilerBuilder} */
    public final static String MARKER_AAPT_COMPILE = LEGACY_PLUGIN_ID + ".aaptProblem"; //$NON-NLS-1$

    /** XML marker error, only to be used in {@link PreCompilerBuilder} */
    public final static String MARKER_XML = LEGACY_PLUGIN_ID + ".xmlProblem"; //$NON-NLS-1$

    /** aidl marker error, only to be used in {@link PreCompilerBuilder} */
    public final static String MARKER_AIDL = LEGACY_PLUGIN_ID + ".aidlProblem"; //$NON-NLS-1$

    /** android marker error, only to be used in the Manifest parsing
     * from the {@link PreCompilerBuilder} */
    public final static String MARKER_ANDROID = LEGACY_PLUGIN_ID + ".androidProblem"; //$NON-NLS-1$

    /** aapt marker error when running the package command, only to be used in {@link PostCompilerBuilder} */
    public final static String MARKER_AAPT_PACKAGE = LEGACY_PLUGIN_ID + ".aapt2Problem"; //$NON-NLS-1$

    /** final packaging error marker, only to be used in {@link PostCompilerBuilder} */
  //  public final static String MARKER_PACKAGING = AdtPlugin.PLUGIN_ID + ".packagingProblem"; //$NON-NLS-1$


    /** Name for the "type" marker attribute */
    public final static String MARKER_ATTR_TYPE = "android.type"; //$NON-NLS-1$
    /** Name for the "class" marker attribute */
    public final static String MARKER_ATTR_CLASS = "android.class"; //$NON-NLS-1$
    /** activity value for marker attribute "type" */
    public final static String MARKER_ATTR_TYPE_ACTIVITY = "activity"; //$NON-NLS-1$
    /** service value for marker attribute "type" */
    public final static String MARKER_ATTR_TYPE_SERVICE = "service"; //$NON-NLS-1$
    /** receiver value for marker attribute "type" */
    public final static String MARKER_ATTR_TYPE_RECEIVER = "receiver"; //$NON-NLS-1$
    /** provider value for marker attribute "type" */
    public final static String MARKER_ATTR_TYPE_PROVIDER = "provider"; //$NON-NLS-1$

    public final static String CLASS_BRIDGE = "com.android.layoutlib.bridge.Bridge"; //$NON-NLS-1$

    /**
     * Prefered compiler level, i.e. "1.5".
     */
    public final static String COMPILER_COMPLIANCE_PREFERRED = "1.5"; //$NON-NLS-1$
    /**
     * List of valid compiler level, i.e. "1.5" and "1.6"
     */
    public final static String[] COMPILER_COMPLIANCE = {
        "1.5", //$NON-NLS-1$
        "1.6", //$NON-NLS-1$
    };

    /** The base URL where to find the Android class & manifest documentation */
    public static final String CODESITE_BASE_URL = "http://code.google.com/android";  //$NON-NLS-1$

    public static final String LIBRARY_TEST_RUNNER = "android.test.runner"; // $NON-NLS-1$
}
