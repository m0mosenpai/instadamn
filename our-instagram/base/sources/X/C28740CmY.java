package X;

/* renamed from: X.CmY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28740CmY implements InterfaceC31142Dmh, InterfaceC30783DgK {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final InterfaceC118275Wp A04;
    public final InterfaceC118305Ws A05;
    public final AbstractC119735bX A06;
    public final CWV A07;
    public final InterfaceC16610sE A08 = C30595DdH.A00;
    public final InterfaceC16610sE A0B = C30594DdG.A00;
    public final InterfaceC16610sE A09 = C30596DdI.A00;
    public final InterfaceC16610sE A0A = C30597DdJ.A00;

    @Override // X.C5X1
    public final /* synthetic */ long ALp(int i, int i2, int i3, int i4, boolean z) {
        if (!z) {
            return C5AU.A04(i, i3, 0, i4);
        }
        return AbstractC119035aK.A04(i, i3, 0, i4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28740CmY) {
                C28740CmY c28740CmY = (C28740CmY) obj;
                if (!C14360o3.A0K(this.A04, c28740CmY.A04) || !C14360o3.A0K(this.A05, c28740CmY.A05) || !C119145aW.A01(this.A01, c28740CmY.A01) || !C14360o3.A0K(this.A06, c28740CmY.A06) || !C119145aW.A01(this.A00, c28740CmY.A00) || this.A02 != c28740CmY.A02 || this.A03 != c28740CmY.A03 || !C14360o3.A0K(this.A07, c28740CmY.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5X1
    public final /* synthetic */ InterfaceC119205ac E4R(C59Z c59z, int[] iArr, int[] iArr2, C59W[] c59wArr, int i, int i2, int i3, int i4, int i5, int i6) {
        return AbstractC25229BEm.A0Z(c59z, new DIN(this, c59z, iArr2, iArr, c59wArr, i4, i5, i6, i3, i), i2, i3);
    }

    @Override // X.C5X1
    public final /* synthetic */ void E4i(C59Z c59z, int[] iArr, int[] iArr2, int i) {
        this.A04.ACX(c59z, c59z.getLayoutDirection(), iArr, iArr2, i);
    }

    public C28740CmY(InterfaceC118275Wp interfaceC118275Wp, InterfaceC118305Ws interfaceC118305Ws, AbstractC119735bX abstractC119735bX, CWV cwv, float f, float f2, int i, int i2) {
        this.A04 = interfaceC118275Wp;
        this.A05 = interfaceC118305Ws;
        this.A01 = f;
        this.A06 = abstractC119735bX;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
        this.A07 = cwv;
    }

    @Override // X.C5X1
    public final /* synthetic */ int ANa(C59W c59w) {
        return c59w.A0F();
    }

    @Override // X.C5X1
    public final /* synthetic */ int Cmc(C59W c59w) {
        return c59w.A0G();
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A07, (((AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, 38161)), this.A01)), this.A00) + this.A02) * 31) + this.A03) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FlowMeasurePolicy(isHorizontal=");
        A1C.append(true);
        A1C.append(", horizontalArrangement=");
        A1C.append(this.A04);
        A1C.append(", verticalArrangement=");
        A1C.append(this.A05);
        A1C.append(", mainAxisSpacing=");
        A1C.append((Object) C119145aW.A00(this.A01));
        A1C.append(AbstractC111324zv.A00(3367));
        A1C.append(this.A06);
        A1C.append(", crossAxisArrangementSpacing=");
        A1C.append((Object) C119145aW.A00(this.A00));
        A1C.append(", maxItemsInMainAxis=");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(571));
        A1C.append(this.A03);
        A1C.append(", overflow=");
        return AbstractC167017dG.A0o(this.A07, A1C);
    }
}
