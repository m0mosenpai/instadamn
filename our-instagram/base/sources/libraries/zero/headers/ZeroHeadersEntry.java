package libraries.zero.headers;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25236BEt;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.PVm;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes9.dex */
public final class ZeroHeadersEntry {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return PVm.A01;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ZeroHeadersEntry) {
                ZeroHeadersEntry zeroHeadersEntry = (ZeroHeadersEntry) obj;
                if (!C14360o3.A0K(this.A03, zeroHeadersEntry.A03) || !C14360o3.A0K(this.A05, zeroHeadersEntry.A05) || !C14360o3.A0K(this.A06, zeroHeadersEntry.A06) || this.A00 != zeroHeadersEntry.A00 || this.A01 != zeroHeadersEntry.A01 || !C14360o3.A0K(this.A02, zeroHeadersEntry.A02) || !C14360o3.A0K(this.A04, zeroHeadersEntry.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ZeroHeadersEntry(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        if (31 != (i & 31)) {
            AbstractC68612VXn.A00(PVm.A00, i, 31);
            throw C00O.createAndThrow();
        }
        this.A03 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = i2;
        this.A01 = i3;
        if ((i & 32) == 0) {
            this.A02 = "";
        } else {
            this.A02 = str4;
        }
        if ((i & 64) == 0) {
            this.A04 = "";
        } else {
            this.A04 = str5;
        }
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, AbstractC166997dE.A0K(this.A02, (((AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A03))) + this.A00) * 31) + this.A01) * 31));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ZeroHeadersEntry(encryptedMsisdn=");
        A1C.append(this.A03);
        A1C.append(", maskedMsisdn=");
        A1C.append(this.A05);
        A1C.append(", storageId=");
        A1C.append(this.A06);
        A1C.append(", createdAt=");
        A1C.append(this.A00);
        A1C.append(", expiredAt=");
        A1C.append(this.A01);
        A1C.append(", cursor=");
        A1C.append(this.A02);
        A1C.append(", internal=");
        return AbstractC25236BEt.A0Y(this.A04, A1C);
    }

    public ZeroHeadersEntry(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        AbstractC167017dG.A1P(str, str2);
        AbstractC167017dG.A1U(str4, str5);
        this.A03 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str4;
        this.A04 = str5;
    }
}
