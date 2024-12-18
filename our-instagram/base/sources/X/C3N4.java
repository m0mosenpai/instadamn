package X;

/* renamed from: X.3N4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3N4 implements InterfaceC13050lr, C3N5 {
    public final C3N7 A00;
    public final AbstractC12990ll A01;
    public final C3NA A02;
    public final C3N8 A03;
    public final C3N9 A04;

    @Override // X.C3N6
    public final String Ary() {
        return this.A04.Ary();
    }

    @Override // X.C3N5
    public final void DV7() {
        C3N9 c3n9 = this.A04;
        c3n9.A01++;
        c3n9.A00 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0ls, X.3NA] */
    public C3N4(AbstractC12990ll abstractC12990ll) {
        this.A01 = abstractC12990ll;
        C3N7 c3n7 = new C3N7();
        this.A00 = c3n7;
        C14360o3.A0B(abstractC12990ll, 0);
        C3N8 c3n8 = new C3N8((int) C18U.A01(C06090Tz.A05, abstractC12990ll, 36598661869997313L));
        this.A03 = c3n8;
        this.A04 = new C3N9(c3n8, c3n7);
        ?? r1 = new InterfaceC13060ls() { // from class: X.3NA
            @Override // X.InterfaceC13060ls
            public final void Cww(AbstractC12990ll abstractC12990ll2) {
            }

            @Override // X.InterfaceC13060ls
            public final void Cwy(AbstractC12990ll abstractC12990ll2) {
                C3N4.this.A00.A00 = C0HM.A00().toString();
            }
        };
        this.A02 = r1;
        C24231Gs.A00().A01(r1);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C24231Gs.A00().A02(this.A02);
    }
}
