package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.2Nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49132Nk implements InterfaceC12870lZ {
    public final C2Ne A00;
    public final /* synthetic */ C2NX A01;

    public C49132Nk(C2Ne c2Ne, C2NX c2nx) {
        C14360o3.A0B(c2Ne, 2);
        this.A01 = c2nx;
        this.A00 = c2Ne;
    }

    public static final void A00(C49132Nk c49132Nk) {
        final C2NX c2nx = c49132Nk.A01;
        CallerContext callerContext = C2NX.A08;
        UserSession userSession = c2nx.A04;
        if (AbstractC54472f1.A01()) {
            C2Ne c2Ne = c49132Nk.A00;
            if (c2Ne.A00.A01.A00 + (C18U.A01(C06090Tz.A05, userSession, 36596686184974934L) * 3600 * 1000) <= System.currentTimeMillis()) {
                c2Ne.A02(C2NX.A08, new InterfaceC196048lu() { // from class: X.9Hp
                    @Override // X.InterfaceC196048lu
                    public final void onFailure() {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [X.1vw, java.lang.Object] */
                    @Override // X.InterfaceC196048lu
                    public final void onSuccess() {
                        C2NX c2nx2 = C2NX.this;
                        CallerContext callerContext2 = C2NX.A08;
                        AbstractC54332en.A00(c2nx2.A04).A04(EnumC54222eY.A0Z);
                        C41451vu.A01.E4s(new Object());
                    }
                }, "app_start");
            }
        }
        if (AbstractC54472f1.A05(userSession)) {
            C14360o3.A0B(userSession, 0);
            ((C23654Ado) userSession.A01(C23654Ado.class, new C50152MDf(userSession, 15))).A00(CallerContext.A01(C2NX.__redex_internal_original_name), userSession);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(-2057007673, C0f9.A03(-151084132));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1256512517);
        C2NX c2nx = this.A01;
        CallerContext callerContext = C2NX.A08;
        if (C18U.A06(C06090Tz.A05, c2nx.A04, 36326816209975438L)) {
            C19L c19l = c2nx.A07;
            AbstractC23641Du.A05(AnonymousClass191.A00, new PYs(this, null, 45), c19l);
        } else {
            A00(this);
        }
        C0f9.A0A(1103249138, A03);
    }
}
