package X;

/* renamed from: X.0po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15340po implements InterfaceC19390xP {
    public final /* synthetic */ InterfaceC16620sF A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    public C15340po(InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        this.A01 = interfaceC19390xP;
        this.A00 = interfaceC16620sF;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        Object collect = this.A01.collect(new C15360pr(this.A00, interfaceC19960yQ), interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }
}
