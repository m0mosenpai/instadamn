package com.facebook.superpack;

import com.facebook.common.dextricks.DalvikInternals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class SuperpackUnloader {
    public static final Set COLD_START_LIBS;
    public static final Set HOLDOUT_LIBRARIES;
    public static final List sInMemoryLibraries;

    public static native long getProcessMappings(String str);

    public static native void releaseProcessMappings(long j);

    public static native void unload(long j, String str);

    static {
        String[] strArr = new String[34];
        System.arraycopy(new String[]{"libbreakpad.so", "libliger.so", DalvikInternals.LIBCOLDSTART_BASE_NAME, "libdexload.so", "libreliabilitymerged.so", "libsigquit.so", "libappstatelogger2.so", "libnative_allocation_hooks_installer_jni.so", "libforker.so", "libgrimsey.so", "libfb_mboost.so", "libplthooks.so", "libfbandroid_native_cppdistract_cppdistract.so", "libbreakpad_extra.so", "libfbandroid_native_sigmuxutils_sigmuxutils.so", "libxplat_pvd_segmentation_model_holder_plc_pytorch_model_holdersAndroid.so", "libdistractutil.so", "libchipsetmerged.so", "libvmasaver.so", "libdalvikdistract.so", "libfbandroid_native_museum_museum.so", "libglog.so", "libpando-core.so", "libpando-engine.so", "libxplat_third-party_jsoncpp_jsoncppAndroid.so", "libxplat_mobilenetwork_fbdomainsAndroid.so", "libfmt.so"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"libthird-party_boost_boost_contextAndroid.so", "libthird-party_boost_boostAndroid.so", "liblinkerutils.so", "libmem_alloc_marker.so", "libfbunwindstack.so", "liblive-query-jni.so", "libaospbugfixmerged.so"}, 0, strArr, 27, 7);
        HOLDOUT_LIBRARIES = new HashSet(Arrays.asList(strArr));
        String[] strArr2 = new String[35];
        System.arraycopy(new String[]{"libfbandroid_native_cppdistract_cppdistract.so", "libfbandroid_native_museum_museum.so", "libglog.so", "libfbandroid_native_sigmuxutils_sigmuxutils.so", "libbreakpad.so", "libdexload.so", "libxplat_third-party_jsoncpp_jsoncppAndroid.so", "libappstatelogger2.so", "libpreconnector.so", "libxplat_mobilenetwork_fbdomainsAndroid.so", "libfmt.so", "libthird-party_boost_boost_contextAndroid.so", "libthird-party_boost_boostAndroid.so", "liblinkerutils.so", "libplthooks.so", "libmem_alloc_marker.so", "libfbunwindstack.so", "liblive-query-jni.so", DalvikInternals.LIBCOLDSTART_BASE_NAME, "libaospbugfixmerged.so", "libsigquit.so", "libreliabilitymerged.so", "libfb_mboost.so", "libtigonnativeauthedservice.so", "libimagepipeline.so", "libxplat_arfx_versioning_sdk_version_constants_constantsAndroid.so", "libard-upload.so"}, 0, strArr2, 0, 27);
        System.arraycopy(new String[]{"libIGL.so", "libimagesmerged.so", "libthreadutils-jni.so", "libclasstracing.so", "libunwindstack_stream.so", "libbreakpad_extra.so", "libfbnightwatch.so", "libreliablemediamonitor.so"}, 0, strArr2, 27, 8);
        COLD_START_LIBS = new HashSet(Arrays.asList(strArr2));
        sInMemoryLibraries = Collections.synchronizedList(new ArrayList());
    }
}
