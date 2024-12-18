package X;

/* renamed from: X.0rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16460rr implements InterfaceC19390xP {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16620sF A01;
    public final InterfaceC19390xP A02;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        ?? obj = new Object();
        obj.A00 = AbstractC20780zy.A01;
        Object collect = this.A02.collect(new C16470rs(obj, this, interfaceC19960yQ), interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }

    public C16460rr(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        this.A02 = interfaceC19390xP;
        this.A00 = interfaceC16660sJ;
        this.A01 = interfaceC16620sF;
    }
}
