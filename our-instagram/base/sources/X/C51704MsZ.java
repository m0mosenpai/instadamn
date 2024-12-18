package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.MsZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51704MsZ extends C0T6 {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51704MsZ() {
        /*
            r6 = this;
            r4 = 0
            r1 = 0
            r3 = 131071(0x1ffff, float:1.8367E-40)
            r0 = r6
            r2 = r1
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51704MsZ.<init>():void");
    }

    public /* synthetic */ C51704MsZ(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, boolean z, boolean z2) {
        C57312PcY c57312PcY;
        C57314Pca c57314Pca;
        C57315Pcb c57315Pcb;
        C57316Pcc c57316Pcc;
        boolean A1M = AbstractC167007dF.A1M(i & 1);
        boolean A1U = AbstractC25226BEj.A1U(i & 2, z);
        boolean A1M2 = AbstractC167007dF.A1M(i & 8);
        interfaceC16820sZ = (i & 16) != 0 ? C57311PcX.A00 : interfaceC16820sZ;
        boolean A1M3 = AbstractC167007dF.A1M(i & 256);
        if ((i & 1024) != 0) {
            c57312PcY = C57312PcY.A00;
        } else {
            c57312PcY = null;
        }
        interfaceC16820sZ2 = (i & C3OO.FLAG_MOVED) != 0 ? C57313PcZ.A00 : interfaceC16820sZ2;
        boolean z3 = (i & 4096) == 0 ? z2 : true;
        if ((i & 8192) != 0) {
            c57314Pca = C57314Pca.A00;
        } else {
            c57314Pca = null;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            c57315Pcb = C57315Pcb.A00;
        } else {
            c57315Pcb = null;
        }
        if ((32768 & i) != 0) {
            c57316Pcc = C57316Pcc.A00;
        } else {
            c57316Pcc = null;
        }
        C57317Pcd c57317Pcd = (i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? C57317Pcd.A00 : null;
        C14360o3.A0B(interfaceC16820sZ, 5);
        C14360o3.A0B(c57312PcY, 11);
        AbstractC25229BEm.A1N(interfaceC16820sZ2, 12, c57314Pca);
        AbstractC25233BEq.A0z(15, c57315Pcb, c57316Pcc, c57317Pcd);
        this.A08 = A1M;
        this.A07 = A1U;
        this.A0A = A1M2;
        this.A01 = interfaceC16820sZ;
        this.A09 = A1M3;
        this.A06 = c57312PcY;
        this.A00 = interfaceC16820sZ2;
        this.A0B = z3;
        this.A04 = c57314Pca;
        this.A03 = c57315Pcb;
        this.A02 = c57316Pcc;
        this.A05 = c57317Pcd;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51704MsZ) {
                C51704MsZ c51704MsZ = (C51704MsZ) obj;
                if (this.A08 != c51704MsZ.A08 || this.A07 != c51704MsZ.A07 || this.A0A != c51704MsZ.A0A || !C14360o3.A0K(this.A01, c51704MsZ.A01) || this.A09 != c51704MsZ.A09 || !C14360o3.A0K(this.A06, c51704MsZ.A06) || !C14360o3.A0K(this.A00, c51704MsZ.A00) || this.A0B != c51704MsZ.A0B || !C14360o3.A0K(this.A04, c51704MsZ.A04) || !C14360o3.A0K(this.A03, c51704MsZ.A03) || !C14360o3.A0K(this.A02, c51704MsZ.A02) || !C14360o3.A0K(this.A05, c51704MsZ.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A07, AbstractC25225BEi.A08(this.A08));
        int A00 = AbstractC53644Nnp.A00();
        return AbstractC166987dD.A0I(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A06, (AbstractC167007dF.A0D(this.A09, (((AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A0A, (A0D + A00) * 31)) + A00) * 31) + A00) * 31 * 31) + A00) * 31)))))));
    }
}
