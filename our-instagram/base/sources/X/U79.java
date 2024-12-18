package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class U79 {
    public C189478aR A00;
    public boolean A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final C69503VpY A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C3DN A07;
    public final C34722FRj A08;
    public final Boolean A09;
    public final String A0A;
    public final String A0B;
    public final Map A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final C18920wW A0I;
    public final Integer A0J;

    public U79(FragmentActivity fragmentActivity, C69503VpY c69503VpY, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C189478aR c189478aR, C34722FRj c34722FRj, Boolean bool, Integer num, String str, String str2, Map map) {
        int A06 = AbstractC167007dF.A06(1, userSession, fragmentActivity);
        this.A06 = userSession;
        this.A03 = fragmentActivity;
        this.A0C = map;
        this.A0A = str;
        this.A0J = num;
        this.A05 = interfaceC11380iw;
        this.A08 = c34722FRj;
        this.A0B = str2;
        this.A00 = c189478aR;
        this.A09 = bool;
        this.A04 = c69503VpY;
        this.A0I = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A07 = C3DN.A00.A00(fragmentActivity);
        this.A0G = AbstractC09440dt.A01(new C57511Pfl(this, 1));
        this.A0H = AbstractC09440dt.A01(new C57511Pfl(this, A06));
        this.A0D = AbstractC09440dt.A01(new C57517Pfr(this, 48));
        this.A0E = AbstractC09440dt.A01(new C57517Pfr(this, 49));
        this.A0F = AbstractC09440dt.A01(new C57511Pfl(this, 0));
    }

    public static final void A00(XPI xpi, U79 u79) {
        String str;
        C18920wW c18920wW = u79.A0I;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ufix_ig_ixt_trigger");
        if (A00.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            Map map = u79.A0C;
            Object obj = map.get("trigger_session_id");
            if (obj != null) {
                c0Zx.A06(AbstractC50532MSl.A00(), (String) obj);
                c0Zx.A01(xpi, "event_step");
                c0Zx.A01(EnumC31716DwL.IXT, "event_source");
                if (C14360o3.A0K(map.get("is_e2ee"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                    str = "0";
                } else {
                    str = (String) map.get("ig_object_value");
                }
                c0Zx.A06("entity_id", str);
                A00.AAQ(c0Zx, "core");
                A00.AAQ((C0Zx) AbstractC166987dD.A17(u79.A0G), "ig");
                A00.AAQ((C0Zx) AbstractC166987dD.A17(u79.A0H), "ixt_trigger");
                A00.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A01(AbstractC115105If abstractC115105If, U79 u79) {
        String str;
        C18920wW c18920wW = u79.A0I;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ufix_ig_ixt_trigger_fetching_failed");
        if (A00.isSampled()) {
            Throwable A01 = abstractC115105If.A01();
            if (A01 == null || (str = A01.getMessage()) == null) {
                C68858VdE c68858VdE = (C68858VdE) abstractC115105If.A00();
                if (c68858VdE != null) {
                    str = c68858VdE.A00;
                } else {
                    str = null;
                }
            }
            A00.AAQ((C0Zx) AbstractC166987dD.A17(u79.A0D), "core");
            A00.AAQ((C0Zx) AbstractC166987dD.A17(u79.A0E), "ig");
            A00.AAQ((C0Zx) AbstractC166987dD.A17(u79.A0F), "ixt_trigger");
            if (str == null) {
                str = "";
            }
            A00.AAP("error_message", str);
            A00.Cht();
        }
    }

    public static final void A02(U79 u79) {
        AbstractC192798gL A05 = C192108fB.A05(u79.A06, u79.A0A, u79.A0C);
        A05.A00(new C32392EOt(u79, 23));
        C1GJ.A03(A05);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Uzv, X.2oe] */
    public static final void A03(U79 u79) {
        C189448aO c189448aO = new C189448aO(u79.A06);
        AbstractC25225BEi.A1Q(c189448aO, true);
        c189448aO.A0x = true;
        c189448aO.A03 = 0.7f;
        String str = u79.A0B;
        if (str != null) {
            c189448aO.A0d = str;
        }
        ?? abstractC59962oe = new AbstractC59962oe();
        C3DN c3dn = u79.A07;
        if (c3dn != null) {
            c3dn.A0R(new C68091VAh(u79, 2));
        }
        C11T.A02(new RunnableC71582WwZ(c189448aO, u79, abstractC59962oe));
    }

    public final C72743Nv A04() {
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(this.A06);
        igBloksScreenConfig.A05 = new C67903V1r(this);
        igBloksScreenConfig.A0R = this.A05.getModuleName();
        C69503VpY c69503VpY = this.A04;
        if (c69503VpY != null) {
            igBloksScreenConfig.A03 = c69503VpY;
        }
        return W6d.A02(igBloksScreenConfig, C66277U6x.A01(this.A0A, this.A0C));
    }

    public final void A05() {
        if (this.A0J.intValue() != 0) {
            UserSession userSession = this.A06;
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
            igBloksScreenConfig.A05 = new C67903V1r(this);
            igBloksScreenConfig.A0R = this.A05.getModuleName();
            String str = this.A0B;
            if (str != null) {
                igBloksScreenConfig.A0U = str;
            }
            C69503VpY c69503VpY = this.A04;
            if (c69503VpY != null) {
                igBloksScreenConfig.A03 = c69503VpY;
            }
            C140966Yy A0P = AbstractC31173DnH.A0P(this.A03, userSession);
            String str2 = this.A0A;
            AbstractMap abstractMap = (AbstractMap) this.A0C;
            A0P.A0D(W6d.A02(igBloksScreenConfig, C66277U6x.A01(str2, abstractMap)));
            String str3 = (String) abstractMap.get(AbstractC111324zv.A00(228));
            if (str3 != null) {
                A0P.A0A = str3;
            }
            A0P.A04();
            return;
        }
        if (AbstractC31177DnL.A1b(this.A09)) {
            new V44(this).A02(new Void[0]);
        } else {
            A02(this);
        }
    }
}
