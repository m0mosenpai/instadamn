package X;

/* renamed from: X.0re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16330re implements InterfaceC19390xP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    public C16330re(InterfaceC19390xP interfaceC19390xP, int i) {
        this.A01 = interfaceC19390xP;
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0pQ, java.lang.Object] */
    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        Object collect = this.A01.collect(new C16320rd(new Object(), interfaceC19960yQ, this.A00), interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }
}
