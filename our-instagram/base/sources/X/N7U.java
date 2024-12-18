package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N7U extends C38K implements InterfaceC60122ou, InterfaceC58161PqQ {
    public static final String __redex_internal_original_name = "LoginActivityFragment";
    public UserSession A00;
    public C52191N8g A01;
    public C50910Mef A02;
    public boolean A03;
    public final InterfaceC41501vz A05 = C56034Ou6.A00(this, 36);
    public final O6I A04 = new O6I(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131965726);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C52191N8g c52191N8g = this.A01;
        if (c52191N8g == null) {
            C14360o3.A0F("loginHistoryAdapter");
            throw C00O.createAndThrow();
        }
        A0U(c52191N8g);
    }

    public static final void A02(N7U n7u, boolean z) {
        String str;
        if (n7u.A03) {
            C50910Mef c50910Mef = n7u.A02;
            if (c50910Mef == null) {
                str = "loginActivityViewModel";
            } else {
                String A05 = C16030qx.A02.A05(n7u.requireContext());
                C141796aw A00 = AbstractC141776au.A00(c50910Mef);
                int i = 46;
                if (z) {
                    i = 45;
                }
                PZ1.A01(c50910Mef, A05, A00, i);
                return;
            }
        } else {
            UserSession userSession = n7u.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                Activity rootActivity = n7u.getRootActivity();
                C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                A0M.A0B(AbstractC50532MSl.A01(32, 23, 125));
                A0M.A0S(N31.class, C54913OQk.class);
                C1ON A0T = AbstractC31172DnG.A0T(A0M, AbstractC50532MSl.A01(0, 9, 53), C16030qx.A02.A05(rootActivity));
                A0T.A00 = new N9V(n7u);
                n7u.schedule(A0T);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC58161PqQ
    public final void Cyo() {
        if (this.A03) {
            UserSession userSession = this.A00;
            if (userSession == null) {
                AbstractC31171DnF.A0y();
                throw C00O.createAndThrow();
            }
            InterfaceC02590Ai A0I = JQ0.A0I(userSession);
            A0I.AAP(CacheBehaviorLogger.SOURCE, "login_activity");
            AbstractC43594JPz.A1C(A0I, "security_alert_action", "this_was_me");
        }
    }

    @Override // X.InterfaceC58161PqQ
    public final void Cyp(OUX oux) {
        String str = "userSession";
        if (this.A03) {
            String str2 = oux.A06;
            String str3 = str2;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                C50910Mef c50910Mef = this.A02;
                if (c50910Mef == null) {
                    str = "loginActivityViewModel";
                } else {
                    if (str3 == null) {
                        str3 = "";
                    }
                    AbstractC166987dD.A1Z(new PXZ(c50910Mef, str3, null, 17, true), AbstractC141776au.A00(c50910Mef));
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        InterfaceC02590Ai A0I = JQ0.A0I(userSession);
                        A0I.AAP(CacheBehaviorLogger.SOURCE, "login_activity");
                        AbstractC43594JPz.A1C(A0I, "security_alert_action", "confirm_this_was_me");
                        return;
                    }
                }
            } else {
                return;
            }
        } else {
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                String str4 = oux.A06;
                if (str4 == null) {
                    str4 = "";
                }
                long j = oux.A04;
                C25621Ms A0c = AbstractC167017dG.A0c(userSession2);
                A0c.A0B(AbstractC50532MSl.A01(55, 34, 42));
                A0c.A0S(N31.class, C54913OQk.class);
                A0c.A9s(MSZ.A0p(), str4);
                schedule(AbstractC31172DnG.A0T(A0c, AbstractC50532MSl.A01(17, 15, 103), String.valueOf(j)));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58161PqQ
    public final void D6y(OUX oux) {
        String str = "userSession";
        if (this.A03) {
            String str2 = oux.A06;
            String str3 = str2;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                C50910Mef c50910Mef = this.A02;
                if (c50910Mef == null) {
                    str = "loginActivityViewModel";
                } else {
                    if (str3 == null) {
                        str3 = "";
                    }
                    AbstractC166987dD.A1Z(new PXZ(c50910Mef, str3, null, 17, false), AbstractC141776au.A00(c50910Mef));
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        InterfaceC02590Ai A0I = JQ0.A0I(userSession);
                        A0I.AAP(CacheBehaviorLogger.SOURCE, "login_activity");
                        AbstractC43594JPz.A1C(A0I, "security_alert_action", "undo_this_was_me");
                        return;
                    }
                }
            } else {
                return;
            }
        } else {
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                String str4 = oux.A06;
                if (str4 == null) {
                    str4 = "";
                }
                long j = oux.A04;
                C25621Ms A0c = AbstractC167017dG.A0c(userSession2);
                A0c.A0B(AbstractC50532MSl.A01(158, 39, 35));
                A0c.A0S(N31.class, C54913OQk.class);
                A0c.A9s(MSZ.A0p(), str4);
                schedule(AbstractC31172DnG.A0T(A0c, AbstractC50532MSl.A01(17, 15, 103), String.valueOf(j)));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58161PqQ
    public final void DAU(OUX oux) {
        String str;
        if (oux.A0B) {
            str = oux.A06;
        } else {
            str = oux.A08;
        }
        if (str == null) {
            str = "";
        }
        A01(this, str);
        if (this.A03) {
            UserSession userSession = this.A00;
            if (userSession == null) {
                AbstractC31171DnF.A0y();
                throw C00O.createAndThrow();
            }
            InterfaceC02590Ai A0I = JQ0.A0I(userSession);
            A0I.AAP(CacheBehaviorLogger.SOURCE, "login_activity");
            AbstractC43594JPz.A1C(A0I, "security_alert_action", "this_was_not_me");
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "loginactivity";
    }

    public static final void A01(N7U n7u, String str) {
        C3BH.A00().A01();
        UserSession userSession = n7u.A00;
        if (userSession != null) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("change_password_entrypoint", "suspicious");
            A0b.putString("change_password_login_id", str);
            AbstractC31173DnH.A1C(A0b, userSession);
            C32369ENt c32369ENt = new C32369ENt();
            FragmentActivity A0J = AbstractC31173DnH.A0J(A0b, c32369ENt, n7u);
            UserSession userSession2 = n7u.A00;
            if (userSession2 != null) {
                C140966Yy A0N = AbstractC31174DnI.A0N(c32369ENt, A0J, userSession2);
                A0N.A0F(n7u, 11);
                A0N.A04();
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 11 && i2 == -1 && intent != null) {
            AbstractC31173DnH.A13(requireContext(), this, 2131965731);
            C52191N8g c52191N8g = this.A01;
            if (c52191N8g == null) {
                str = "loginHistoryAdapter";
            } else {
                c52191N8g.A06();
                boolean z = true;
                A02(this, true);
                String stringExtra = intent.getStringExtra("change_password_login_id");
                if (stringExtra != null && stringExtra.length() != 0) {
                    z = false;
                }
                str = "userSession";
                if (!z) {
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                        A0c.A0B(AbstractC50532MSl.A01(89, 31, 51));
                        A0c.A0S(C40781ul.class, C55702hA.class);
                        schedule(AbstractC31172DnG.A0T(A0c, MSZ.A0p(), stringExtra));
                    }
                }
                if (this.A03) {
                    UserSession userSession2 = this.A00;
                    if (userSession2 != null) {
                        InterfaceC02590Ai A0I = JQ0.A0I(userSession2);
                        A0I.AAP(CacheBehaviorLogger.SOURCE, "login_activity");
                        AbstractC43594JPz.A1C(A0I, "security_alert_action", "change_password_success");
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (r1 == false) goto L17;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 1224987671(0x4903d417, float:539969.44)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r6)
            com.instagram.common.session.UserSession r0 = X.AbstractC31176DnK.A0S(r5)
            r5.A00 = r0
            android.content.Context r1 = r5.requireContext()
            X.N8g r0 = new X.N8g
            r0.<init>(r1, r5, r5)
            r5.A01 = r0
            com.instagram.common.session.UserSession r0 = r5.A00
            java.lang.String r4 = "userSession"
            if (r0 == 0) goto L34
            X.KFr r1 = new X.KFr
            r1.<init>(r0)
            java.lang.Class<X.Mef> r0 = X.C50910Mef.class
            X.2bZ r0 = r1.create(r0)
            X.Mef r0 = (X.C50910Mef) r0
            r5.A02 = r0
            if (r0 != 0) goto L3c
            java.lang.String r4 = "loginActivityViewModel"
        L34:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3c:
            X.2GT r2 = r0.A00
            r0 = 44
            X.Pji r1 = X.C57755Pji.A02(r5, r0)
            r0 = 40
            X.AbstractC37301Gc2.A0w(r5, r2, r1, r0)
            com.instagram.common.session.UserSession r0 = r5.A00
            if (r0 == 0) goto L34
            boolean r0 = X.AbstractC120975dp.A00(r0)
            if (r0 == 0) goto L62
            com.instagram.common.session.UserSession r0 = r5.A00
            if (r0 == 0) goto L34
            X.4wb r0 = X.AbstractC109484wa.A00(r0)
            boolean r1 = r0.A02()
            r0 = 1
            if (r1 != 0) goto L63
        L62:
            r0 = 0
        L63:
            r5.A03 = r0
            r0 = -949329969(0xffffffffc76a5fcf, float:-59999.81)
            X.C0f9.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N7U.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-892183967);
        super.onPause();
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        AbstractC25651Mw.A00(userSession).A02(this.A05, C56005Otc.class);
        C0f9.A09(-1513357077, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1170533408);
        super.onResume();
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        AbstractC25651Mw.A00(userSession).A01(this.A05, C56005Otc.class);
        C0f9.A09(1398678323, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-827768263);
        super.onStart();
        A02(this, false);
        C0f9.A09(1948630461, A02);
    }
}
