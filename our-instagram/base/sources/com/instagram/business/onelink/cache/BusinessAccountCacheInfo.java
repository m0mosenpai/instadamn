package com.instagram.business.onelink.cache;

import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.AnonymousClass001;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C71737X0c;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class BusinessAccountCacheInfo extends C0T6 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71737X0c.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BusinessAccountCacheInfo) {
                BusinessAccountCacheInfo businessAccountCacheInfo = (BusinessAccountCacheInfo) obj;
                if (!C14360o3.A0K(this.A01, businessAccountCacheInfo.A01) || !C14360o3.A0K(this.A00, businessAccountCacheInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("BusinessAccountCacheInfo(businessName=", this.A01, ", businessId=", this.A00, ')');
    }

    public /* synthetic */ BusinessAccountCacheInfo(String str, String str2, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C71737X0c.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = AbstractC167017dG.A0O(this.A01) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public BusinessAccountCacheInfo(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
