package com.instagram.business.onelink.cache;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C57115PVe;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class WhatsAppBusinessCacheInfo extends C0T6 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C57115PVe.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppBusinessCacheInfo) {
                WhatsAppBusinessCacheInfo whatsAppBusinessCacheInfo = (WhatsAppBusinessCacheInfo) obj;
                if (!C14360o3.A0K(this.A01, whatsAppBusinessCacheInfo.A01) || !C14360o3.A0K(this.A00, whatsAppBusinessCacheInfo.A00) || this.A03 != whatsAppBusinessCacheInfo.A03 || this.A04 != whatsAppBusinessCacheInfo.A04 || this.A02 != whatsAppBusinessCacheInfo.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC25227BEk.A07(this.A00)) * 31)));
    }

    public WhatsAppBusinessCacheInfo(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WhatsAppBusinessCacheInfo(linkedPhoneNumber=");
        A1C.append(this.A01);
        A1C.append(", linkedAccountType=");
        A1C.append(this.A00);
        A1C.append(", isRiskyTierAccountForCtwa=");
        A1C.append(this.A03);
        A1C.append(", isWhatsAppNumberBanned=");
        A1C.append(this.A04);
        A1C.append(", isBusinessVerificationEligible=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }

    public /* synthetic */ WhatsAppBusinessCacheInfo(String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        if (31 != (i & 31)) {
            AbstractC68612VXn.A00(C57115PVe.A01, i, 31);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
    }
}
