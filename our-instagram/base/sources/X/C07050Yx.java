package X;

/* renamed from: X.0Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07050Yx implements InterfaceC16530ry {
    public final /* synthetic */ Object A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16620sF A02;
    public final /* synthetic */ InterfaceC16620sF A03;
    public final /* synthetic */ boolean A04;

    public C07050Yx(Object obj, String str, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
        this.A02 = interfaceC16620sF;
        this.A01 = str;
        this.A00 = obj;
        this.A03 = interfaceC16620sF2;
        this.A04 = z;
    }

    @Override // X.InterfaceC16530ry, X.InterfaceC16130rD
    public final Object CES(Object obj, C0YR c0yr) {
        return this.A02.invoke(this.A01, this.A00);
    }

    @Override // X.InterfaceC16530ry
    public final void Egi(Object obj, Object obj2, C0YR c0yr) {
        InterfaceC19610xo interfaceC19610xo = (InterfaceC19610xo) this.A03.invoke(this.A01, obj2);
        if (this.A04) {
            interfaceC19610xo.commit();
        } else {
            interfaceC19610xo.apply();
        }
    }
}
