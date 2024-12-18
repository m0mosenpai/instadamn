package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.instagram.common.session.UserSession;

/* renamed from: X.98p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2056598p {
    public InterfaceC41521w1 A00;
    public final UserSession A01;
    public final Object A02;
    public final C2056498o A03;

    public C2056598p(UserSession userSession, C2056498o c2056498o) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = c2056498o;
        this.A02 = new Object();
    }

    public final void A02(MP0 mp0, Integer num, EnumC44104JeT[] enumC44104JeTArr) {
        C14360o3.A0B(enumC44104JeTArr, 1);
        final UserSession userSession = this.A01;
        if (!C18U.A06(C06090Tz.A05, userSession, 36319660794191429L)) {
            mp0.DN0(null);
        } else {
            final JZV jzv = new JZV(mp0, this, num, enumC44104JeTArr);
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9Hc
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1238804958, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserSession userSession2 = UserSession.this;
                    if (!userSession2.isStopped()) {
                        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", "SafetyInterventions");
                        C14360o3.A07(newPrivacyContextNative);
                        C131225wA.A01.A02(new C50364MLq(18, newPrivacyContextNative, jzv, userSession2), userSession2);
                    }
                }
            });
        }
    }

    public final void A00() {
        if (C18U.A06(C06090Tz.A05, this.A01, 36319660794191429L)) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9IU
                {
                    super(1238804958, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2056598p c2056598p = C2056598p.this;
                    synchronized (c2056598p.A02) {
                        C131235wB.A00(c2056598p.A00, c2056598p.A01);
                        c2056598p.A00 = null;
                    }
                }
            });
        }
    }

    public final void A01(final InterfaceC50439MOt interfaceC50439MOt) {
        if (C18U.A06(C06090Tz.A05, this.A01, 36319660794191429L)) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9Hd
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1238804958, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2056598p c2056598p = this;
                    Object obj = c2056598p.A02;
                    InterfaceC50439MOt interfaceC50439MOt2 = interfaceC50439MOt;
                    synchronized (obj) {
                        InterfaceC41521w1 interfaceC41521w1 = c2056598p.A00;
                        if (interfaceC41521w1 != null) {
                            C131235wB.A00(interfaceC41521w1, c2056598p.A01);
                        }
                        UserSession userSession = c2056598p.A01;
                        JUZ juz = new JUZ(interfaceC50439MOt2);
                        if (!userSession.isStopped()) {
                            C131225wA.A01.A02(new C50367MLu(juz, 28), userSession);
                        }
                        c2056598p.A00 = juz;
                    }
                }
            });
        }
    }
}
