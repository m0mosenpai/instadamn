package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7Yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164707Yj {
    public C7JV A00;
    public C161887My A01;
    public boolean A02;
    public final AbstractC59962oe A03;
    public final InterfaceC41501vz A04;
    public final InterfaceC41501vz A05;
    public final InterfaceC41501vz A06;
    public final InterfaceC41501vz A07;
    public final InterfaceC41501vz A08;
    public final InterfaceC41501vz A09;
    public final InterfaceC41501vz A0A;
    public final InterfaceC41501vz A0B;
    public final InterfaceC41501vz A0C;
    public final InterfaceC41501vz A0D;
    public final InterfaceC41501vz A0E;
    public final InterfaceC41501vz A0F;
    public final InterfaceC41501vz A0G;
    public final InterfaceC41501vz A0H;
    public final InterfaceC41501vz A0I;
    public final InterfaceC41501vz A0J;
    public final UserSession A0K;
    public final C7XE A0L;
    public final C7XI A0M;
    public final C164817Yu A0N;
    public final C164807Yt A0O;
    public final C164797Ys A0P;
    public final C164047Vt A0Q;
    public final C164607Xz A0R;
    public final C7X0 A0S;
    public final C7X0 A0T;
    public final C7Y7 A0U;
    public final Runnable A0V;
    public final InterfaceC08830cm A0W;
    public final InterfaceC08830cm A0X;
    public final InterfaceC08830cm A0Y;

    /* JADX WARN: Type inference failed for: r0v14, types: [X.7Ys] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.7Yt] */
    public C164707Yj(AbstractC59962oe abstractC59962oe, UserSession userSession, C7XE c7xe, C7XI c7xi, C164047Vt c164047Vt, C164607Xz c164607Xz, C7X0 c7x0, C7X0 c7x02, C7Y7 c7y7, Runnable runnable, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(c7y7, 4);
        C14360o3.A0B(c164607Xz, 5);
        C14360o3.A0B(c7xi, 6);
        C14360o3.A0B(c164047Vt, 7);
        C14360o3.A0B(c7xe, 8);
        this.A03 = abstractC59962oe;
        this.A0K = userSession;
        this.A0W = interfaceC08830cm;
        this.A0U = c7y7;
        this.A0R = c164607Xz;
        this.A0M = c7xi;
        this.A0Q = c164047Vt;
        this.A0L = c7xe;
        this.A0X = interfaceC08830cm2;
        this.A0Y = interfaceC08830cm3;
        this.A0S = c7x0;
        this.A0T = c7x02;
        this.A0V = runnable;
        this.A06 = new InterfaceC41501vz() { // from class: X.7Yk
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1358977993);
                C160937Jc c160937Jc = (C160937Jc) obj;
                int A032 = C0f9.A03(203438471);
                if (c160937Jc != null) {
                    DirectThreadKey directThreadKey = c160937Jc.A00;
                    C164707Yj c164707Yj = C164707Yj.this;
                    if (directThreadKey.equals(C164707Yj.A00(c164707Yj))) {
                        C9GR.A07(c164707Yj.A03.requireContext(), 2131973833);
                    }
                }
                C0f9.A0A(-1320837596, A032);
                C0f9.A0A(-2120735153, A03);
            }
        };
        this.A0A = new InterfaceC41501vz() { // from class: X.7Yl
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1516219358);
                int A032 = C0f9.A03(-1021515216);
                if (obj != null) {
                    C193328hC c193328hC = new C193328hC(C164707Yj.this.A03.requireContext());
                    c193328hC.A0A(2131959289);
                    c193328hC.A09(2131959288);
                    c193328hC.A0S(null, EnumC193348hE.A04, 2131968948);
                    C0fJ.A00(c193328hC.A02());
                }
                C0f9.A0A(-1982451745, A032);
                C0f9.A0A(-461856093, A03);
            }
        };
        this.A04 = new InterfaceC41501vz() { // from class: X.7Ym
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                int A03 = C0f9.A03(1345786145);
                C160957Je c160957Je = (C160957Je) obj;
                int A032 = C0f9.A03(-1461759744);
                C14360o3.A0B(c160957Je, 0);
                C164707Yj c164707Yj = C164707Yj.this;
                DirectThreadKey A00 = C164707Yj.A00(c164707Yj);
                if (A00 != null) {
                    UserSession userSession2 = c164707Yj.A0K;
                    if (C18U.A06(C06090Tz.A05, userSession2, 36324071725936504L)) {
                        C81663kb B3U = AbstractC28761aE.A00(userSession2).B3U(A00);
                        if (B3U != null) {
                            FRk fRk = new FRk(new C19270xB("DirectThreadEventListenerController"), userSession2);
                            String str = A00.A00;
                            C25531Mh A033 = C25531Mh.A03(fRk.A00);
                            if (((AbstractC02600Aj) A033).A00.isSampled()) {
                                A033.A0M(EnumC33511Erk.CAMERA_SHOWN, "action");
                                A033.A0M(EnumC33506Erf.PROMPT_CREATION, CacheBehaviorLogger.SOURCE);
                                A033.A0M(EnumC33458Eqt.A02, "prompt_type");
                                A033.A0R("open_thread_id", str);
                                A033.Cht();
                            }
                            FUa.A01(c164707Yj.A03.requireActivity(), FUa.A00(userSession2, B3U, DirectPromptTypes.A08, 0, c160957Je.A00, c160957Je.A01, true), userSession2, null);
                        }
                        i = -243388994;
                        C0f9.A0A(i, A032);
                        C0f9.A0A(2028580427, A03);
                    }
                }
                i = -1917784106;
                C0f9.A0A(i, A032);
                C0f9.A0A(2028580427, A03);
            }
        };
        this.A0G = new InterfaceC41501vz() { // from class: X.7Yn
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(379759625);
                C7MD c7md = (C7MD) obj;
                int A032 = C0f9.A03(1671580360);
                C14360o3.A0B(c7md, 0);
                C164707Yj c164707Yj = C164707Yj.this;
                String str = c7md.A03;
                String str2 = c7md.A02;
                AbstractC59962oe abstractC59962oe2 = c164707Yj.A03;
                FragmentActivity requireActivity = abstractC59962oe2.requireActivity();
                if (str == null) {
                    Context requireContext = abstractC59962oe2.requireContext();
                    UserSession userSession2 = c164707Yj.A0K;
                    int i = 2131958814;
                    if (C18U.A05(C06090Tz.A05, userSession2)) {
                        i = 2131958813;
                    }
                    str = requireContext.getString(i);
                    C14360o3.A07(str);
                }
                if (str2 == null) {
                    str2 = abstractC59962oe2.requireContext().getString(2131960763);
                    C14360o3.A07(str2);
                }
                C193328hC c193328hC = new C193328hC((Activity) requireActivity);
                c193328hC.A05 = str;
                c193328hC.A0r(str2);
                c193328hC.A0F(new DialogInterfaceOnClickListenerC55260OfZ(requireActivity));
                C0fJ.A00(c193328hC.A02());
                C0f9.A0A(-610431262, A032);
                C0f9.A0A(-868267089, A03);
            }
        };
        this.A0E = new InterfaceC41501vz() { // from class: X.7Yo
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                int i;
                int A03 = C0f9.A03(-1921950321);
                C7ME c7me = (C7ME) obj;
                int A032 = C0f9.A03(-711784189);
                C14360o3.A0B(c7me, 0);
                String str2 = c7me.A01;
                C164707Yj c164707Yj = C164707Yj.this;
                DirectThreadKey A00 = C164707Yj.A00(c164707Yj);
                if (A00 != null) {
                    str = A00.A01;
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str2, str)) {
                    C162307Os c162307Os = (C162307Os) c164707Yj.A0S.get();
                    if (c162307Os == null) {
                        i = -1215036727;
                        C0f9.A0A(i, A032);
                        C0f9.A0A(1186914769, A03);
                    }
                    c162307Os.A05(false, c7me.A00);
                }
                i = -174894790;
                C0f9.A0A(i, A032);
                C0f9.A0A(1186914769, A03);
            }
        };
        this.A0B = new InterfaceC41501vz() { // from class: X.7Yp
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1916589421);
                int A032 = C0f9.A03(584399253);
                ((C7IY) C164707Yj.this.A0Y.get()).AZT().notifyDataSetChanged();
                C0f9.A0A(1524051105, A032);
                C0f9.A0A(-308831085, A03);
            }
        };
        this.A0C = new InterfaceC41501vz() { // from class: X.7Yq
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1826299867);
                C160967Jf c160967Jf = (C160967Jf) obj;
                int A032 = C0f9.A03(1537353894);
                C14360o3.A0B(c160967Jf, 0);
                DirectThreadKey directThreadKey = c160967Jf.A00;
                C164707Yj c164707Yj = C164707Yj.this;
                if (C14360o3.A0K(directThreadKey, C164707Yj.A00(c164707Yj))) {
                    ((C7IY) c164707Yj.A0Y.get()).AZT().notifyDataSetChanged();
                }
                C0f9.A0A(-610475365, A032);
                C0f9.A0A(-1142527545, A03);
            }
        };
        this.A0F = new InterfaceC41501vz() { // from class: X.7Yr
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1950052388);
                C160977Jg c160977Jg = (C160977Jg) obj;
                int A032 = C0f9.A03(1345368166);
                C14360o3.A0B(c160977Jg, 0);
                C164707Yj.this.A0U.A02(c160977Jg.A01, c160977Jg.A00, null, null, c160977Jg.A02);
                C0f9.A0A(-836532018, A032);
                C0f9.A0A(-595618754, A03);
            }
        };
        this.A0P = new InterfaceC42271xH() { // from class: X.7Ys
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C42281xI c42281xI = (C42281xI) obj;
                C14360o3.A0B(c42281xI, 0);
                InterfaceC163837Ux C7r = ((C7U0) C164707Yj.this.A0X.get()).C7r();
                if (C7r.CeQ() && !C7r.CVY() && C7r.C7U().contains(c42281xI.A00.getId())) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1382960711);
                int A032 = C0f9.A03(-1429681485);
                C164707Yj c164707Yj = C164707Yj.this;
                DirectThreadKey A00 = C164707Yj.A00(c164707Yj);
                if (c164707Yj.A0R.A00) {
                    C164707Yj.A01(c164707Yj);
                } else if (A00 != null) {
                    AbstractC25651Mw.A00(c164707Yj.A0K).E4s(new C2Io(A00, C05F.A0L, null, null, null, false));
                }
                C0f9.A0A(-259087201, A032);
                C0f9.A0A(1713085716, A03);
            }
        };
        this.A0O = new InterfaceC42271xH() { // from class: X.7Yt
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C2AS c2as = (C2AS) obj;
                C14360o3.A0B(c2as, 0);
                C164707Yj c164707Yj = C164707Yj.this;
                InterfaceC163837Ux C7r = ((C7U0) c164707Yj.A0X.get()).C7r();
                C2EC Co6 = C7r.Co6();
                if (Co6 == null || Co6.C7g() != 1014) {
                    return false;
                }
                List C7U = C7r.C7U();
                User user = c2as.A00;
                if (!C7U.contains(user.getId()) || !C14360o3.A0K(c164707Yj.A0K.userId, user.A03.Aab())) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-2037876452);
                int A032 = C0f9.A03(1820798245);
                C162307Os c162307Os = (C162307Os) C164707Yj.this.A0S.get();
                if (c162307Os != null) {
                    c162307Os.A0B.reset();
                    C162307Os.A00(c162307Os);
                    c162307Os.A06 = false;
                    C162307Os.A01(c162307Os);
                }
                C0f9.A0A(-42322481, A032);
                C0f9.A0A(659937739, A03);
            }
        };
        this.A0N = new C164817Yu(this);
        this.A0J = new InterfaceC41501vz() { // from class: X.7Yv
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
            
                if (r0 == false) goto L20;
             */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r9) {
                /*
                    r8 = this;
                    r0 = -690917723(0xffffffffd6d16ea5, float:-1.1513657E14)
                    int r6 = X.C0f9.A03(r0)
                    X.2In r9 = (X.C2In) r9
                    r0 = -203062251(0xfffffffff3e58415, float:-3.6368253E31)
                    int r5 = X.C0f9.A03(r0)
                    r0 = 0
                    X.C14360o3.A0B(r9, r0)
                    X.7Yj r7 = X.C164707Yj.this
                    X.2oe r0 = r7.A03
                    boolean r0 = r0.isResumed()
                    if (r0 == 0) goto L96
                    X.0cm r2 = r7.A0X
                    java.lang.Object r0 = r2.get()
                    X.7U0 r0 = (X.C7U0) r0
                    X.7Ux r0 = r0.C7r()
                    boolean r0 = r0.CeQ()
                    if (r0 == 0) goto L96
                    com.instagram.model.direct.DirectThreadKey r1 = r9.A01
                    java.lang.Object r0 = r2.get()
                    X.7U0 r0 = (X.C7U0) r0
                    X.7Ux r0 = r0.C7r()
                    X.3o9 r0 = r0.B90()
                    boolean r0 = X.C14360o3.A0K(r1, r0)
                    if (r0 == 0) goto L96
                    java.lang.String r1 = r9.A02
                    com.instagram.common.session.UserSession r0 = r7.A0K
                    java.lang.String r0 = r0.userId
                    boolean r0 = X.C14360o3.A0K(r1, r0)
                    if (r0 == 0) goto L89
                    boolean r0 = r9.A04
                    if (r0 != 0) goto L89
                    boolean r0 = r9.A03
                    if (r0 != 0) goto L5e
                    boolean r0 = r9.A05
                    if (r0 != 0) goto L89
                L5e:
                    java.lang.Object r1 = r2.get()
                    X.7U0 r1 = (X.C7U0) r1
                    X.7Ts r4 = r1.BT6()
                    X.3jT r3 = r9.A00
                    X.7Uz r0 = r1.Avk()
                    X.7Ls r2 = r0.CDC()
                    X.7Ux r1 = r1.C7r()
                    boolean r0 = r1.CTV()
                    if (r0 == 0) goto L83
                    boolean r0 = r1.CWO()
                    r1 = 1
                    if (r0 != 0) goto L84
                L83:
                    r1 = 0
                L84:
                    X.7XE r0 = r7.A0L
                    r4.FCN(r0, r2, r3, r1)
                L89:
                    r0 = -1251090982(0xffffffffb56dddda, float:-8.8612217E-7)
                L8c:
                    X.C0f9.A0A(r0, r5)
                    r0 = -1555834371(0xffffffffa343d9fd, float:-1.0617132E-17)
                    X.C0f9.A0A(r0, r6)
                    return
                L96:
                    r0 = -1216535886(0xffffffffb77d22b2, float:-1.5088053E-5)
                    goto L8c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C164827Yv.onEvent(java.lang.Object):void");
            }
        };
        this.A08 = new InterfaceC41501vz() { // from class: X.7Yw
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1641688093);
                int A032 = C0f9.A03(-1108544513);
                C56352iT AYT = C164707Yj.this.A0M.A02.AYT();
                if (AYT != null) {
                    AYT.A0T();
                }
                C0f9.A0A(760662529, A032);
                C0f9.A0A(-459403530, A03);
            }
        };
        this.A0D = new InterfaceC41501vz() { // from class: X.7Yx
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                int A03 = C0f9.A03(1420717602);
                C160997Ji c160997Ji = (C160997Ji) obj;
                int A032 = C0f9.A03(-1735750355);
                C14360o3.A0B(c160997Ji, 0);
                C164707Yj c164707Yj = C164707Yj.this;
                C162307Os c162307Os = (C162307Os) c164707Yj.A0S.get();
                if (c162307Os == null) {
                    i = -1444313903;
                } else {
                    String A06 = AbstractC1345466e.A06(c160997Ji.A00);
                    C23031Ai A00 = AbstractC23021Ah.A00(c164707Yj.A0K);
                    if (A06 != null && A00.A01.getBoolean(AnonymousClass001.A0R("unsend_warning_banner_enabled_for_thread_v2/", A06), false)) {
                        c162307Os.A05(false, null);
                    }
                    i = -903614131;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(267103078, A03);
            }
        };
        this.A09 = new InterfaceC41501vz() { // from class: X.7Yy
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-188501532);
                int A032 = C0f9.A03(254756327);
                C164707Yj c164707Yj = C164707Yj.this;
                UserSession userSession2 = c164707Yj.A0K;
                if (!AbstractC23021Ah.A00(userSession2).A01.getBoolean("preference_automatic_rich_preview_nux_shown", false)) {
                    FragmentActivity requireActivity = c164707Yj.A03.requireActivity();
                    C26856BtI c26856BtI = new C26856BtI();
                    AbstractC03240Dh.A00(new Bundle(), userSession2);
                    C189448aO c189448aO = new C189448aO(userSession2);
                    c189448aO.A0a = false;
                    AbstractC140396Wt.A03(requireActivity, c26856BtI, c189448aO.A00(), null);
                    AbstractC23021Ah.A00(userSession2).A13("preference_automatic_rich_preview_nux_shown", true);
                }
                C0f9.A0A(-1600128796, A032);
                C0f9.A0A(1987445825, A03);
            }
        };
        this.A0H = new InterfaceC41501vz() { // from class: X.7Yz
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-403144076);
                int A032 = C0f9.A03(-237751277);
                ((C7IY) C164707Yj.this.A0Y.get()).AZT().notifyDataSetChanged();
                C0f9.A0A(-751958775, A032);
                C0f9.A0A(1178397716, A03);
            }
        };
        this.A0I = new InterfaceC41501vz() { // from class: X.7Z0
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1896272981);
                int A032 = C0f9.A03(1993108063);
                ((C7IY) C164707Yj.this.A0Y.get()).AZT().notifyDataSetChanged();
                C0f9.A0A(2043972130, A032);
                C0f9.A0A(-1050782326, A03);
            }
        };
        this.A05 = new InterfaceC41501vz() { // from class: X.7Z1
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(74142911);
                int A032 = C0f9.A03(-665582432);
                C7L5 c7l5 = (C7L5) C164707Yj.this.A0T.get();
                if (c7l5 != null) {
                    c7l5.A00(true);
                }
                C0f9.A0A(858948259, A032);
                C0f9.A0A(-204254932, A03);
            }
        };
        this.A07 = new InterfaceC41501vz() { // from class: X.7Z2
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(116852770);
                int A032 = C0f9.A03(1983586197);
                C164707Yj c164707Yj = C164707Yj.this;
                final String string = c164707Yj.A03.requireContext().getString(2131957381);
                C14360o3.A07(string);
                AnonymousClass983 anonymousClass983 = c164707Yj.A0Q.A00;
                anonymousClass983.A1I.A00(C7VH.class, new C50269MHy(string, anonymousClass983, 37));
                C7XI c7xi2 = c164707Yj.A0M;
                final C7KL c7kl = c7xi2.A00;
                if (c7kl != null) {
                    final FragmentActivity requireActivity = c7xi2.A03.requireActivity();
                    final TextView textView = c7kl.A0F;
                    if (textView != null) {
                        textView.postDelayed(new Runnable() { // from class: X.GQA
                            @Override // java.lang.Runnable
                            public final void run() {
                                C7KL c7kl2 = c7kl;
                                C5SU A0Q = AbstractC31178DnM.A0Q(requireActivity, textView, string);
                                A0Q.A01();
                                A0Q.A0B = false;
                                A0Q.A0A = true;
                                A0Q.A00().A07(c7kl2.A0Q);
                            }
                        }, 500L);
                    }
                }
                C0f9.A0A(-1921485851, A032);
                C0f9.A0A(-636236476, A03);
            }
        };
    }

    public static final DirectThreadKey A00(C164707Yj c164707Yj) {
        return JRE.A02(((C7U0) c164707Yj.A0X.get()).C7r().Afi());
    }

    public static final void A01(C164707Yj c164707Yj) {
        AbstractC59962oe abstractC59962oe = c164707Yj.A03;
        if (abstractC59962oe.isResumed()) {
            FragmentActivity requireActivity = abstractC59962oe.requireActivity();
            C3DN A00 = C3DN.A00.A00(requireActivity);
            if (A00 == null || !((C3DP) A00).A0h) {
                requireActivity.onBackPressed();
            }
        }
    }
}
