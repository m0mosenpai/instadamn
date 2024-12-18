package X;

/* renamed from: X.5gA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122155gA extends C58J implements C5DW {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public long A05;
    public long A06;
    public long A07;
    public C5AH A08;
    public InterfaceC16660sJ A09;
    public boolean A0A;

    @Override // X.C5DW
    public final /* synthetic */ int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A00(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A01(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.A03);
        sb.append(", scaleY=");
        sb.append(this.A04);
        sb.append(", alpha = ");
        sb.append(this.A00);
        sb.append(", translationX=");
        sb.append(0.0f);
        sb.append(", translationY=");
        sb.append(0.0f);
        sb.append(", shadowElevation=");
        sb.append(0.0f);
        sb.append(", rotationX=");
        sb.append(0.0f);
        sb.append(", rotationY=");
        sb.append(0.0f);
        sb.append(", rotationZ=");
        sb.append(this.A02);
        sb.append(", cameraDistance=");
        sb.append(this.A01);
        sb.append(", transformOrigin=");
        long j = this.A07;
        long j2 = C5AD.A01;
        sb.append((Object) AnonymousClass001.A0K("TransformOrigin(packedValue=", ')', j));
        sb.append(", shape=");
        sb.append(this.A08);
        sb.append(", clip=");
        sb.append(this.A0A);
        sb.append(", renderEffect=");
        sb.append((Object) null);
        sb.append(", ambientShadowColor=");
        sb.append((Object) C1132359l.A06(this.A05));
        sb.append(", spotShadowColor=");
        sb.append((Object) C1132359l.A06(this.A06));
        sb.append(", compositingStrategy=");
        sb.append((Object) AnonymousClass001.A0I("CompositingStrategy(value=", ')', 0));
        sb.append(')');
        return sb.toString();
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        C59W CpF = interfaceC1131559d.CpF(j);
        int i = CpF.A01;
        int i2 = CpF.A00;
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C9F3(11, this, CpF), i, i2);
    }
}
