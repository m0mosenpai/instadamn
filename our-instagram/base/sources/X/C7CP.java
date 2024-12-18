package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* renamed from: X.7CP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7CP {
    public final Context A00;
    public final C7CX A01;
    public final C25671My A02;
    public final InterfaceC41501vz A03;
    public final UserSession A04;
    public final C159147Ca A05;
    public final C7XI A06;
    public final C7CY A07;
    public final String A08;
    public final C7U0 A09;
    public final Executor A0A;

    public static final void A00(C7CP c7cp, String str, boolean z) {
        if (C14360o3.A0K(str, c7cp.A08)) {
            c7cp.A09.BDF().DPO(z);
            c7cp.A0A.execute(new RunnableC29574D1b(c7cp, z));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.7Ca, java.lang.Object] */
    public C7CP(Context context, UserSession userSession, C7XI c7xi, C7U0 c7u0, String str) {
        this.A00 = context;
        this.A04 = userSession;
        this.A06 = c7xi;
        this.A08 = str;
        this.A09 = c7u0;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        this.A02 = A00;
        this.A0A = C7CQ.A00;
        this.A01 = new C7CR(context, userSession).A00();
        C7CY c7cy = (C7CY) userSession.A01(C7CY.class, new MHM(userSession, 49));
        this.A07 = c7cy;
        ?? r2 = new InterfaceC159157Cb() { // from class: X.7Ca
            @Override // X.InterfaceC159157Cb
            public final void DPN(long j, String str2, boolean z, String str3) {
                C7CP.A00(C7CP.this, str2, z);
            }
        };
        this.A05 = r2;
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.7Cc
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1838935497);
                C160997Ji c160997Ji = (C160997Ji) obj;
                int A032 = C0f9.A03(-1124111595);
                C14360o3.A0B(c160997Ji, 0);
                if (c160997Ji.A02) {
                    C7CP c7cp = C7CP.this;
                    c7cp.A01.AYs(new QDO(c7cp, true), c7cp.A08);
                }
                C0f9.A0A(-480412810, A032);
                C0f9.A0A(1923575595, A03);
            }
        };
        this.A03 = interfaceC41501vz;
        A00.A01(interfaceC41501vz, C160997Ji.class);
        c7cy.A01.add(r2);
    }
}
