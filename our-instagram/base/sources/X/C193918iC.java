package X;

import android.view.ViewGroup;

/* renamed from: X.8iC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193918iC {
    public final ViewGroup A00;
    public final C193908iB A01;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C9ET(this, 30));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C9ET(this, 31));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C9ET(this, 29));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C9ET(this, 34));
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C9ET(this, 33));
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C9ET(this, 32));

    public C193918iC(ViewGroup viewGroup, C193908iB c193908iB) {
        this.A00 = viewGroup;
        this.A01 = c193908iB;
        C184708Hl Csh = ((AnonymousClass835) this.A07.getValue()).Csh();
        Csh.A00 = new InterfaceC184728Hn() { // from class: X.8iD
            @Override // X.InterfaceC184728Hn
            public final boolean D3S() {
                C8YY c8yy = C193918iC.this.A01.A00.A0w;
                AnonymousClass229.A01(c8yy.A0E).A1c((C55U) c8yy.A0F.A08.A00);
                c8yy.A0J.A0P();
                return true;
            }
        };
        Csh.A00();
        C184708Hl Csh2 = ((AnonymousClass835) this.A02.getValue()).Csh();
        Csh2.A00 = new InterfaceC184728Hn() { // from class: X.8iE
            @Override // X.InterfaceC184728Hn
            public final boolean D3S() {
                C193838i4 c193838i4 = C193918iC.this.A01.A00;
                if (!C193838i4.A0U(c193838i4)) {
                    C8YY c8yy = c193838i4.A0w;
                    boolean A0T = C193838i4.A0T(c193838i4);
                    C22P c22p = c193838i4.A03;
                    C14360o3.A0B(c22p, 2);
                    if (A0T) {
                        c8yy.A0L(true);
                        return true;
                    }
                    if (c22p == C22P.A1l) {
                        c8yy.A08.finish();
                        return true;
                    }
                    AnonymousClass229.A01(c8yy.A0E).A0b();
                    c8yy.A08.onBackPressed();
                    c8yy.A0K.A0M.DIs();
                    return true;
                }
                return true;
            }
        };
        Csh2.A00();
    }
}
