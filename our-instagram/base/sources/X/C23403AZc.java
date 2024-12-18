package X;

/* renamed from: X.AZc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23403AZc implements InterfaceC175577rX {
    public final /* synthetic */ C196518mh A00;

    public C23403AZc(C196518mh c196518mh) {
        this.A00 = c196518mh;
    }

    @Override // X.InterfaceC175577rX
    public final void EGZ(Long l) {
        C196518mh c196518mh = this.A00;
        InterfaceC178817wt interfaceC178817wt = c196518mh.A00;
        if (interfaceC178817wt == null) {
            C14360o3.A0F("mediaGraphController");
            throw C00O.createAndThrow();
        }
        interfaceC178817wt.getHandler().post(new RunnableC24268ApZ(c196518mh));
    }
}
