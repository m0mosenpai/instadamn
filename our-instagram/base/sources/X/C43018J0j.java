package X;

import android.view.View;

/* renamed from: X.J0j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43018J0j implements InterfaceC1119153d {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C120985dq A01;
    public final /* synthetic */ C37599Ggu A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C43018J0j(View view, C120985dq c120985dq, C37599Ggu c37599Ggu, String str) {
        this.A03 = str;
        this.A02 = c37599Ggu;
        this.A00 = view;
        this.A01 = c120985dq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC1119153d
    public final void Czx() {
        String str = this.A03;
        if (str != null && str.equals("clips_action_sheet")) {
            AbstractC25651Mw.A00(this.A02.A06).E4s(new Object());
        }
        C37599Ggu c37599Ggu = this.A02;
        AbstractC25651Mw.A00(c37599Ggu.A06).A02(c37599Ggu.A05, C3MY.class);
        View view = this.A00;
        c37599Ggu.A0D.A00();
        AbstractC56932jR.A06(view, 1000L);
        JI8 ji8 = c37599Ggu.A0E;
        ji8.EJo();
        ji8.Co0(this.A01);
    }
}
