package X;

/* renamed from: X.6wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154026wB implements InterfaceC66482zP, InterfaceC154036wC {
    public boolean A00;
    public boolean A01;
    public final C37867GlM A02;
    public final C120985dq A03;
    public final C69749Vuj A04;
    public final String A05;

    public C154026wB(C37867GlM c37867GlM, C120985dq c120985dq, C69749Vuj c69749Vuj) {
        String str;
        C14360o3.A0B(c120985dq, 1);
        this.A03 = c120985dq;
        this.A04 = c69749Vuj;
        this.A02 = c37867GlM;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            str = c38321qM.A2u();
        } else {
            str = null;
        }
        this.A05 = str;
    }

    @Override // X.InterfaceC154036wC
    public final int Bsu() {
        return 0;
    }

    @Override // X.InterfaceC154036wC
    public final boolean Cce() {
        return this.A01;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C37867GlM c37867GlM;
        C37867GlM c37867GlM2;
        C154026wB c154026wB = (C154026wB) obj;
        C14360o3.A0B(c154026wB, 0);
        if (C14360o3.A0K(this.A05, c154026wB.A05) && (((c37867GlM = this.A02) == null || (c37867GlM2 = c154026wB.A02) == null || c37867GlM.equals(c37867GlM2)) && C14360o3.A0K(this.A04, c154026wB.A04) && this.A01 == c154026wB.A01 && this.A00 == c154026wB.A00)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC154036wC
    public final boolean isEnabled() {
        return this.A00;
    }

    @Override // X.InterfaceC154036wC
    public final void EdT(boolean z, int i) {
        this.A01 = z;
    }
}
