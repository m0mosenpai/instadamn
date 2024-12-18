package com.facebook.cameracore.ardelivery.scripting;

/* loaded from: classes11.dex */
public class ScriptingPackageMetadata {
    public String mCdnUrl;
    public String mIdentifier;
    public int mRevision;

    public String getCdnUrl() {
        return this.mCdnUrl;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public int getRevision() {
        return this.mRevision;
    }

    public ScriptingPackageMetadata(String str, int i, String str2) {
        this.mIdentifier = str;
        this.mRevision = i;
        this.mCdnUrl = str2;
    }
}
