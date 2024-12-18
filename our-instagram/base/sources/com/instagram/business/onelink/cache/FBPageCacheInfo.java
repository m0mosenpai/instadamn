package com.instagram.business.onelink.cache;

import X.AbstractC111324zv;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C66012Ty7;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class FBPageCacheInfo extends C0T6 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C66012Ty7.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPageCacheInfo) {
                FBPageCacheInfo fBPageCacheInfo = (FBPageCacheInfo) obj;
                if (!C14360o3.A0K(this.A03, fBPageCacheInfo.A03) || !C14360o3.A0K(this.A02, fBPageCacheInfo.A02) || !C14360o3.A0K(this.A01, fBPageCacheInfo.A01) || !C14360o3.A0K(this.A00, fBPageCacheInfo.A00) || this.A05 != fBPageCacheInfo.A05 || !C14360o3.A0K(this.A04, fBPageCacheInfo.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ FBPageCacheInfo(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(C66012Ty7.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A05 = (i & 16) == 0 ? true : z;
        if ((i & 32) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str5;
        }
    }

    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A05, ((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31);
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return A0D + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FBPageCacheInfo(pageName=");
        sb.append(this.A03);
        sb.append(AbstractC111324zv.A00(1441));
        sb.append(this.A02);
        sb.append(", adsPageName=");
        sb.append(this.A01);
        sb.append(", adsPageId=");
        sb.append(this.A00);
        sb.append(", isBPLAndAdsPageConsistent=");
        sb.append(this.A05);
        sb.append(", pageProfilePicUri=");
        return AbstractC25236BEt.A0Y(this.A04, sb);
    }

    public FBPageCacheInfo(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A05 = z;
        this.A04 = str5;
    }
}
