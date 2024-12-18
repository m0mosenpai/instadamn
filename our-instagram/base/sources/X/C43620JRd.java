package X;

import com.facebook.msys.mci.AuthData;

/* renamed from: X.JRd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43620JRd extends C0T6 implements InterfaceC37093GWc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final AuthData A05;
    public final InterfaceC50517MRu A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43620JRd) {
                C43620JRd c43620JRd = (C43620JRd) obj;
                if (this.A08 != c43620JRd.A08 || this.A07 != c43620JRd.A07 || this.A09 != c43620JRd.A09 || !C14360o3.A0K(this.A06, c43620JRd.A06) || this.A01 != c43620JRd.A01 || this.A02 != c43620JRd.A02 || this.A04 != c43620JRd.A04 || !C14360o3.A0K(this.A05, c43620JRd.A05) || this.A00 != c43620JRd.A00 || this.A03 != c43620JRd.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC25236BEt.A01(this.A04, (((((AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A07, AbstractC25225BEi.A08(this.A08))) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A01) * 31) + this.A02) * 31) + AbstractC166997dE.A0I(this.A05)) * 31) + this.A00) * 31) + this.A03;
    }

    public C43620JRd(AuthData authData, InterfaceC50517MRu interfaceC50517MRu, int i, int i2, int i3, int i4, long j, boolean z, boolean z2, boolean z3) {
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A06 = interfaceC50517MRu;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = j;
        this.A05 = authData;
        this.A00 = i3;
        this.A03 = i4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SecureThreadListLoadingState(isLoading=");
        A1C.append(this.A08);
        A1C.append(", isFirstLoadComplete=");
        A1C.append(this.A07);
        A1C.append(", isLoadingFromMsysUpdate=");
        A1C.append(this.A09);
        A1C.append(", threadList=");
        A1C.append(this.A06);
        A1C.append(", initialLimit=");
        A1C.append(this.A01);
        A1C.append(", pageSize=");
        A1C.append(this.A02);
        A1C.append(", oldestThreadLoadTimestamp=");
        A1C.append(this.A04);
        A1C.append(", authData=");
        A1C.append(this.A05);
        A1C.append(", folderType=");
        A1C.append(this.A00);
        A1C.append(", threadFolder=");
        return AbstractC25236BEt.A0Z(A1C, this.A03);
    }
}
