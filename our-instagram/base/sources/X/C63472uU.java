package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.2uU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63472uU implements InterfaceC63482uV, InterfaceC13000lm {
    public final C63572ue A00;
    public final UserSession A01;
    public final C63492uW A02;
    public final C63512uY A03;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.2uY] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2ua, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2ud, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2uX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.2uY] */
    public C63472uU(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = new C63492uW(userSession);
        ?? obj = new Object();
        ?? obj2 = new Object();
        C63522uZ c63522uZ = new C63522uZ(new WeakReference(userSession));
        this.A00 = new C63572ue(new Object(), new Object(), obj, c63522uZ, obj2);
        this.A03 = new Object();
    }

    @Override // X.InterfaceC63482uV
    public final InterfaceC82433m7 B3k(String str) {
        C63572ue c63572ue;
        C14360o3.A0B(str, 0);
        if (C18U.A06(C06090Tz.A05, this.A01, 36313424504096767L)) {
            c63572ue = this.A00;
        } else {
            c63572ue = this.A02.A02;
        }
        InterfaceC82423m6 interfaceC82423m6 = (InterfaceC82423m6) c63572ue.A06.get(str);
        if (interfaceC82423m6 != null && !(interfaceC82423m6 instanceof InterfaceC82433m7)) {
            return null;
        }
        return (InterfaceC82433m7) interfaceC82423m6;
    }

    @Override // X.InterfaceC63482uV
    public final C82543mI ECO(final InterfaceC60442pS interfaceC60442pS, C82453m9 c82453m9, final String str, final boolean z) {
        C82543mI A02;
        C14360o3.A0B(str, 1);
        UserSession userSession = this.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36313424504096767L)) {
            return this.A00.A02(c82453m9, new LTS(userSession, interfaceC60442pS, this.A03, c82453m9.A01, str, z));
        }
        final C63492uW c63492uW = this.A02;
        synchronized (c63492uW) {
            C63572ue c63572ue = c63492uW.A02;
            final Integer num = c82453m9.A01;
            A02 = c63572ue.A02(c82453m9, new InterfaceC82483mC(interfaceC60442pS, c63492uW, num, str, z) { // from class: X.3mB
                public final InterfaceC60442pS A00;
                public final Integer A01;
                public final String A02;
                public final boolean A03;
                public final /* synthetic */ C63492uW A04;

                {
                    this.A04 = c63492uW;
                    this.A00 = interfaceC60442pS;
                    this.A02 = str;
                    this.A01 = num;
                    this.A03 = z;
                }

                @Override // X.InterfaceC82483mC
                public final void E11(final C82543mI c82543mI, Boolean bool, String str2) {
                    final boolean z2;
                    final C63492uW c63492uW2 = this.A04;
                    final InterfaceC60442pS interfaceC60442pS2 = this.A00;
                    final String str3 = this.A02;
                    final Integer num2 = this.A01;
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    } else {
                        z2 = this.A03;
                    }
                    if (z2) {
                        C14120nc.A00().ATO(new C124625kQ(new Runnable() { // from class: X.5kP
                            @Override // java.lang.Runnable
                            public final void run() {
                                C63492uW c63492uW3 = c63492uW2;
                                UserSession userSession2 = c63492uW3.A03;
                                InterfaceC60442pS interfaceC60442pS3 = interfaceC60442pS2;
                                C124645kS.A00(c63492uW3.A00, c82543mI, interfaceC60442pS3, userSession2, num2, str3);
                            }
                        }));
                    }
                }
            });
        }
        return A02;
    }

    @Override // X.InterfaceC63482uV
    public final void CpS(C82453m9 c82453m9) {
        C63572ue c63572ue;
        if (C18U.A06(C06090Tz.A05, this.A01, 36313424504096767L)) {
            c63572ue = this.A00;
        } else {
            c63572ue = this.A02.A02;
        }
        synchronized (c63572ue) {
            String BK3 = c82453m9.BK3();
            c63572ue.A08.put(BK3, C82503mE.A00.A04(c82453m9, c63572ue.A03(BK3)));
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C63572ue c63572ue;
        if (C18U.A06(C06090Tz.A05, this.A01, 36313424504096767L)) {
            c63572ue = this.A00;
        } else {
            c63572ue = this.A02.A02;
        }
        synchronized (c63572ue) {
        }
    }
}
