package com.facebook.superpack;

import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AssetDecompressor {
    public static final AssetDecompressor INSTANCE = new Object();

    public static final native String[] decompress(AssetManager assetManager, String str, String str2, String str3);

    public static final native String[] decompress_legacy(InputStream inputStream, String str, String str2);

    public static final native String[] decompress_range(AssetManager assetManager, String str, String str2, String str3, int i, int i2);

    public static final native int get_architecture();

    public static final native int sync_file_to_disk(String str);

    public static final native void testDecompressorLibraryUsable(byte[] bArr);
}
