package com.facebook.rsys.mediasync.gen;

import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class InstagramContentOwner {
    public static C2N9 CONVERTER = C55648OnZ.A00(46);
    public static long sMcfTypeId;
    public final String avatarUrl;
    public final String userId;
    public final String username;

    public static native InstagramContentOwner createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstagramContentOwner)) {
            return false;
        }
        InstagramContentOwner instagramContentOwner = (InstagramContentOwner) obj;
        return this.userId.equals(instagramContentOwner.userId) && this.username.equals(instagramContentOwner.username) && this.avatarUrl.equals(instagramContentOwner.avatarUrl);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.avatarUrl, AbstractC166997dE.A0K(this.username, AbstractC50523MSb.A02(this.userId)));
    }

    public String toString() {
        return AnonymousClass001.A15("InstagramContentOwner{userId=", this.userId, ",username=", this.username, ",avatarUrl=", this.avatarUrl, "}");
    }

    public InstagramContentOwner(String str, String str2, String str3) {
        AbstractC31180DnO.A1U(str, str2, str3);
        this.userId = str;
        this.username = str2;
        this.avatarUrl = str3;
    }
}
