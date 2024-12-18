package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4vU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109054vU extends C0T6 implements InterfaceC109064vV {
    public final InterfaceC108954vK A00;
    public final C108584uj A01;
    public final C109004vP A02;
    public final InterfaceC108804v5 A03;
    public final InterfaceC108864vB A04;
    public final InterfaceC108894vE A05;
    public final InterfaceC108714uw A06;
    public final InterfaceC108744uz A07;
    public final InterfaceC109044vT A08;
    public final InterfaceC108774v2 A09;
    public final InterfaceC108984vN A0A;
    public final InterfaceC108834v8 A0B;
    public final InterfaceC108654uq A0C;
    public final InterfaceC108624un A0D;
    public final InterfaceC108924vH A0E;
    public final InterfaceC108684ut A0F;

    public C109054vU(InterfaceC108954vK interfaceC108954vK, C108584uj c108584uj, C109004vP c109004vP, InterfaceC108804v5 interfaceC108804v5, InterfaceC108864vB interfaceC108864vB, InterfaceC108894vE interfaceC108894vE, InterfaceC108714uw interfaceC108714uw, InterfaceC108744uz interfaceC108744uz, InterfaceC109044vT interfaceC109044vT, InterfaceC108774v2 interfaceC108774v2, InterfaceC108984vN interfaceC108984vN, InterfaceC108834v8 interfaceC108834v8, InterfaceC108654uq interfaceC108654uq, InterfaceC108624un interfaceC108624un, InterfaceC108924vH interfaceC108924vH, InterfaceC108684ut interfaceC108684ut) {
        C14360o3.A0B(interfaceC108954vK, 1);
        C14360o3.A0B(interfaceC109044vT, 2);
        C14360o3.A0B(c108584uj, 3);
        C14360o3.A0B(interfaceC108804v5, 4);
        C14360o3.A0B(c109004vP, 5);
        C14360o3.A0B(interfaceC108864vB, 6);
        C14360o3.A0B(interfaceC108894vE, 7);
        C14360o3.A0B(interfaceC108714uw, 8);
        C14360o3.A0B(interfaceC108744uz, 9);
        C14360o3.A0B(interfaceC108774v2, 10);
        C14360o3.A0B(interfaceC108984vN, 11);
        C14360o3.A0B(interfaceC108834v8, 12);
        C14360o3.A0B(interfaceC108654uq, 13);
        C14360o3.A0B(interfaceC108624un, 14);
        C14360o3.A0B(interfaceC108924vH, 15);
        C14360o3.A0B(interfaceC108684ut, 16);
        this.A00 = interfaceC108954vK;
        this.A08 = interfaceC109044vT;
        this.A01 = c108584uj;
        this.A03 = interfaceC108804v5;
        this.A02 = c109004vP;
        this.A04 = interfaceC108864vB;
        this.A05 = interfaceC108894vE;
        this.A06 = interfaceC108714uw;
        this.A07 = interfaceC108744uz;
        this.A09 = interfaceC108774v2;
        this.A0A = interfaceC108984vN;
        this.A0B = interfaceC108834v8;
        this.A0C = interfaceC108654uq;
        this.A0D = interfaceC108624un;
        this.A0E = interfaceC108924vH;
        this.A0F = interfaceC108684ut;
    }

    @Override // X.InterfaceC109064vV
    public final C109054vU Euu() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109054vU) {
                C109054vU c109054vU = (C109054vU) obj;
                if (!C14360o3.A0K(this.A00, c109054vU.A00) || !C14360o3.A0K(this.A08, c109054vU.A08) || !C14360o3.A0K(this.A01, c109054vU.A01) || !C14360o3.A0K(this.A03, c109054vU.A03) || !C14360o3.A0K(this.A02, c109054vU.A02) || !C14360o3.A0K(this.A04, c109054vU.A04) || !C14360o3.A0K(this.A05, c109054vU.A05) || !C14360o3.A0K(this.A06, c109054vU.A06) || !C14360o3.A0K(this.A07, c109054vU.A07) || !C14360o3.A0K(this.A09, c109054vU.A09) || !C14360o3.A0K(this.A0A, c109054vU.A0A) || !C14360o3.A0K(this.A0B, c109054vU.A0B) || !C14360o3.A0K(this.A0C, c109054vU.A0C) || !C14360o3.A0K(this.A0D, c109054vU.A0D) || !C14360o3.A0K(this.A0E, c109054vU.A0E) || !C14360o3.A0K(this.A0F, c109054vU.A0F)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((this.A00.hashCode() * 31) + this.A08.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A0B.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0D.hashCode()) * 31) + this.A0E.hashCode()) * 31) + this.A0F.hashCode();
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108954vK BFS() {
        return this.A00;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC109044vT BFl() {
        return this.A08;
    }

    @Override // X.InterfaceC109064vV
    public final /* bridge */ /* synthetic */ InterfaceC108594uk BFm() {
        return this.A01;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108804v5 BFn() {
        return this.A03;
    }

    @Override // X.InterfaceC109064vV
    public final /* bridge */ /* synthetic */ InterfaceC109014vQ BFo() {
        return this.A02;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108864vB BFp() {
        return this.A04;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108894vE BFq() {
        return this.A05;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108714uw BFr() {
        return this.A06;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108744uz BFs() {
        return this.A07;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108774v2 BFt() {
        return this.A09;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108984vN BFu() {
        return this.A0A;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108834v8 BFv() {
        return this.A0B;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108654uq BFw() {
        return this.A0C;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108624un BFx() {
        return this.A0D;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108924vH BFy() {
        return this.A0E;
    }

    @Override // X.InterfaceC109064vV
    public final InterfaceC108684ut BFz() {
        return this.A0F;
    }

    @Override // X.InterfaceC109064vV
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveBroadcastExperiments", AbstractC39987HoT.A00(this));
    }
}
