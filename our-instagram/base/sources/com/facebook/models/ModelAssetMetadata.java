package com.facebook.models;

/* loaded from: classes4.dex */
public class ModelAssetMetadata {
    public final boolean fromCache;
    public final String md5Hash;
    public final String name;
    public final String path;

    public ModelAssetMetadata(String str, String str2, String str3, boolean z) {
        this.name = str;
        this.md5Hash = str2;
        this.path = str3;
        this.fromCache = z;
    }
}
