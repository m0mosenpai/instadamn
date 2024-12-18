package X;

import android.content.Context;
import com.facebook.onecamera.configurations.AppSpecific;
import com.instagram.common.session.UserSession;
import org.webrtc.EglBase;

/* loaded from: classes4.dex */
public final class B2N implements InterfaceC08830cm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ B3R A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public B2N(B3R b3r, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = b3r;
        this.A00 = i;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A05 = z4;
        this.A06 = z5;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, X.AWC] */
    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        C174647py c174647py;
        B3R b3r = this.A01;
        Context context = b3r.A00;
        final UserSession userSession = b3r.A02;
        C23324AVj c23324AVj = b3r.A01;
        int i = this.A00;
        Object obj = EglBase.lock;
        boolean z = this.A04;
        boolean z2 = this.A03;
        boolean z3 = this.A02;
        boolean z4 = this.A05;
        String str = b3r.A03;
        if (this.A06) {
            c174647py = new C174647py(userSession) { // from class: X.9bP
                public final UserSession A00;

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.7q2] */
                /* JADX WARN: Type inference failed for: r6v0, types: [X.7px, java.lang.Object] */
                {
                    /*
                        r10 = this;
                        r0 = 1
                        X.7q0 r4 = X.EnumC174667q0.HIGH
                        X.AaL r6 = new X.AaL
                        r6.<init>()
                        X.7q2 r3 = new X.7q2
                        r3.<init>()
                        r7 = 0
                        r2 = r10
                        r5 = r4
                        r8 = r7
                        r9 = r7
                        r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                        r10.A00 = r11
                        X.7q3 r1 = X.InterfaceC174657pz.A06
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        r10.A00(r1, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C212569bP.<init>(com.instagram.common.session.UserSession):void");
                }

                @Override // X.C174647py, X.InterfaceC174657pz
                public final Object AXQ(C7q3 c7q3) {
                    UserSession userSession2;
                    C14360o3.A0B(c7q3, 0);
                    int i2 = c7q3.A00;
                    if (i2 != 10) {
                        if (i2 != 31) {
                            return super.AXQ(c7q3);
                        }
                        userSession2 = this.A00;
                    } else {
                        userSession2 = this.A00;
                        C14360o3.A0B(userSession2, 0);
                        if (!C18U.A06(C06090Tz.A05, userSession2, 36313141033830191L)) {
                            return false;
                        }
                    }
                    Boolean A0c = AbstractC166997dE.A0c(C06090Tz.A05, userSession2, 36327898541538240L);
                    C14360o3.A0C(A0c, "null cannot be cast to non-null type T of com.instagram.rtc.rsys.impl.IgCameraProxyProvider.CustomRuntimeParameters.get");
                    return A0c;
                }
            };
        } else {
            c174647py = null;
        }
        boolean z5 = b3r.A04;
        boolean A1U = AbstractC167007dF.A1U(c23324AVj);
        C178017va c178017va = new C178017va("instagram_vc");
        c178017va.A02(InterfaceC178047vd.A00, userSession);
        C178037vc c178037vc = InterfaceC180067yw.A01;
        Boolean valueOf = Boolean.valueOf(A1U);
        c178017va.A02(c178037vc, valueOf);
        C178017va.A00(c178017va, InterfaceC180067yw.A02, z3);
        C178017va.A00(c178017va, InterfaceC180067yw.A03, !z3);
        C178017va.A00(c178017va, BE1.A05, z);
        c178017va.A02(BE1.A01, true);
        c178017va.A02(InterfaceC179497xz.A00, true);
        c178017va.A02(InterfaceC178107vj.A02, obj);
        c178017va.A02(C178027vb.A03, str);
        C178017va.A00(c178017va, C178027vb.A01, z5);
        c178017va.A02(InterfaceC175747ro.A01, valueOf);
        C178027vb c178027vb = new C178027vb(c178017va);
        AbstractC177217uH.A02 = true;
        ?? obj2 = new Object();
        C23384AYi A00 = AGW.A00.A00(context, c178027vb, new C178177vr(AppSpecific.class), new C23431Aa4(obj2, c178027vb, c174647py, c23324AVj, i, z4, z2));
        obj2.A00 = A00;
        C23432Aa5 c23432Aa5 = new C23432Aa5(A00);
        C23432Aa5.A00(c23432Aa5).EeT(new C23449AaM());
        return c23432Aa5;
    }
}
