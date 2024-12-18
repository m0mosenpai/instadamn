package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2JV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2JV implements InterfaceC12870lZ, InterfaceC13000lm {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC14020nS A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final C19L A0A;

    public /* synthetic */ C2JV(Context context, UserSession userSession) {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "IgBgFetchScheduler";
        C18240vB c18240vB = new C18240vB(A00);
        C19K A02 = AnonymousClass194.A02(new C12M(c18240vB).AOT(177144224, 3));
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(A02, 4);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = c18240vB;
        this.A0A = A02;
        this.A06 = AbstractC09440dt.A01(new C9EX(this, 7));
        this.A04 = AbstractC09440dt.A01(new C9EX(this, 5));
        this.A08 = AbstractC09440dt.A01(new C9EX(this, 9));
        this.A07 = AbstractC09440dt.A01(new C9EX(this, 8));
        this.A05 = AbstractC09440dt.A01(new C9EX(this, 6));
        this.A09 = AbstractC09440dt.A01(new C9EX(this, 10));
        C218914p.A03(EnumC220415e.A03, this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(56958680, C0f9.A03(-719802205));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int i;
        int A03 = C0f9.A03(1011580423);
        if (this.A00) {
            i = -1429681088;
        } else {
            this.A00 = true;
            C19L c19l = this.A0A;
            C206629Ct c206629Ct = new C206629Ct(this, null, 29);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, c19l);
            i = -1272354439;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
