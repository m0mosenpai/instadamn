package com.instagram.business.onelink.cache;

import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.AnonymousClass001;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C71736X0b;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class AdAccountCacheInfo extends C0T6 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71736X0b.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdAccountCacheInfo) {
                AdAccountCacheInfo adAccountCacheInfo = (AdAccountCacheInfo) obj;
                if (!C14360o3.A0K(this.A01, adAccountCacheInfo.A01) || !C14360o3.A0K(this.A00, adAccountCacheInfo.A00) || !C14360o3.A0K(this.A02, adAccountCacheInfo.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A14("AdAccountCacheInfo(accountName=", this.A01, ", accountId=", this.A00, ", legacyAccountId=", this.A02, ')');
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public AdAccountCacheInfo(String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public /* synthetic */ AdAccountCacheInfo(String str, String str2, String str3, int i) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71736X0b.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }
}
