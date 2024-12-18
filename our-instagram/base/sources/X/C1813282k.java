package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.82k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1813282k {
    public C23454AaR A00;
    public InterfaceC176367st A01;
    public InterfaceC174767qC A02;
    public C22986ABl A03;
    public InterfaceC174857qL A04;
    public boolean A05;
    public final C2GS A06;
    public final C1813382l A07;
    public final Context A08;
    public final InterfaceC1813182j A09;
    public final UserSession A0A;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.82l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2GT, X.2GS] */
    public C1813282k(Context context, InterfaceC1813182j interfaceC1813182j, UserSession userSession) {
        C14360o3.A0B(context, 1);
        this.A08 = context;
        this.A0A = userSession;
        this.A09 = interfaceC1813182j;
        this.A07 = new Object();
        this.A06 = new C2GT(false);
    }

    public final InterfaceC175497rP A00(View view, InterfaceC174767qC interfaceC174767qC, String str, boolean z) {
        C23454AaR c23454AaR;
        InterfaceC176367st interfaceC176367st;
        InterfaceC174857qL yep;
        C174757qB c174757qB;
        int i;
        this.A02 = interfaceC174767qC;
        UserSession userSession = this.A0A;
        C178597wX c178597wX = new C178597wX(new C178317w5(userSession));
        InterfaceC174767qC interfaceC174767qC2 = this.A02;
        if ((interfaceC174767qC2 instanceof C174757qB) && (c174757qB = (C174757qB) interfaceC174767qC2) != null && ((i = c174757qB.A0E) == 1 || i == 3)) {
            C14360o3.A0C(interfaceC174767qC2, "null cannot be cast to non-null type com.instagram.camera.capture.OneCameraController");
            yep = new C174847qK(view, c178597wX, (C174757qB) interfaceC174767qC2, this.A07, userSession, z);
        } else {
            Context context = this.A08;
            InterfaceC176367st interfaceC176367st2 = null;
            boolean z2 = false;
            if (C8Li.A00(context)) {
                interfaceC176367st = AbstractC176357ss.A00(context, false);
                if (interfaceC176367st.isARCoreSupported() && C56D.A00(context) >= 223040000) {
                    z2 = true;
                }
                c23454AaR = new C23454AaR();
            } else {
                c23454AaR = null;
                interfaceC176367st = null;
            }
            AbstractC177217uH.A01 = z2;
            if (z2) {
                interfaceC176367st2 = interfaceC176367st;
            }
            this.A01 = interfaceC176367st2;
            this.A00 = c23454AaR;
            InterfaceC174767qC interfaceC174767qC3 = this.A02;
            if (interfaceC174767qC3 != null) {
                C22986ABl c22986ABl = new C22986ABl(interfaceC174767qC3, new A51(this));
                this.A03 = c22986ABl;
                yep = new YEP(context, view, c178597wX, interfaceC174767qC.B4Z(), this.A00, this.A01, interfaceC174767qC3, new A52(this), c22986ABl, this.A07, this.A09, userSession, str);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A04 = yep;
        if (this.A05) {
            yep.E1D();
            InterfaceC174767qC interfaceC174767qC4 = this.A02;
            if (interfaceC174767qC4 != null) {
                interfaceC174767qC4.E1D();
            }
            this.A05 = false;
        }
        this.A06.A0B(true);
        InterfaceC174857qL interfaceC174857qL = this.A04;
        if (interfaceC174857qL == null) {
            return null;
        }
        return interfaceC174857qL.C4Q();
    }
}
