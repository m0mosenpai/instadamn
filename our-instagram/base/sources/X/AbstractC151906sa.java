package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.util.HashMap;

/* renamed from: X.6sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151906sa {
    public final int A00;
    public final C70D A01;
    public final AbstractC151926sc A02;
    public final String A03;
    public final String A04;

    public static final void A00(AbstractC151906sa abstractC151906sa) {
        C70D c70d = abstractC151906sa.A01;
        String str = abstractC151906sa.A04;
        C1571673v.A08(c70d.A07, c70d.A09, EnumC1571773w.A05, str, c70d.A0I, c70d.A0G, c70d.A0H, "bottom_sheet_menu");
    }

    public InterfaceC37108GWt A01() {
        InterfaceC37108GWt interfaceC37108GWt;
        InterfaceC37108GWt interfaceC37108GWt2;
        if (this instanceof C152006sk) {
            UserSession userSession = this.A01.A09;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (!((Boolean) A00.A5h.CES(A00, C23031Ai.A8c[222])).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36317401642112123L)) {
                interfaceC37108GWt2 = C36583GBh.A00;
            } else {
                interfaceC37108GWt2 = C36584GBi.A00;
            }
            return interfaceC37108GWt2;
        }
        if (this instanceof C152016sl) {
            int A02 = this.A01.A02();
            if (A02 > 0) {
                interfaceC37108GWt = new C36585GBj(A02);
            } else {
                interfaceC37108GWt = C36584GBi.A00;
            }
            return interfaceC37108GWt;
        }
        return C36584GBi.A00;
    }

    public void A02() {
        FragmentActivity fragmentActivity;
        C6XJ c6xj;
        C140966Yy c140966Yy;
        if (this instanceof C151976sh) {
            C70D c70d = this.A01;
            FB6.A00().A04(c70d.A06, c70d.A09);
            return;
        }
        if (this instanceof C151986si) {
            C70D c70d2 = this.A01;
            AbstractC86593tX.A0b(c70d2.A06, c70d2.A09, C05F.A1I);
            return;
        }
        if (this instanceof C151896sZ) {
            C70D c70d3 = this.A01;
            UserSession userSession = c70d3.A09;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36316546944471548L)) {
                AbstractC149576oA.A00(userSession).A09(c70d3.A05, userSession, null, "IG_FB_RIGHT_BEFORE_LOGOUT_SSO_UPSELL", null, true, false);
            }
            if (C18U.A06(c06090Tz, userSession, 36324462567829685L)) {
                AbstractC35091Fd2.A02(userSession, "settings", "bloks_settings_entrypoint_click_event");
                OY7.A01(userSession, c70d3.A06);
                return;
            } else {
                AbstractC35091Fd2.A02(userSession, "settings", "settings_2_entrypoint_click_event");
                c140966Yy = new C140966Yy(c70d3.A06, userSession);
                c140966Yy.A0F = true;
                c140966Yy.A0E(FBR.A00(EnumC72365Xc1.A07, null));
                c140966Yy.A0A = "UserOptionsFragment.USER_OPTIONS_FRAGMENT_BACKSTATE_NAME";
            }
        } else {
            if (this instanceof C151966sg) {
                C70D c70d4 = this.A01;
                EnumC33405Epc enumC33405Epc = EnumC33405Epc.A09;
                UserSession userSession2 = c70d4.A09;
                Bundle A00 = AbstractC177607uu.A00(null, enumC33405Epc, false);
                fragmentActivity = c70d4.A06;
                c6xj = new C6XJ(fragmentActivity, A00, userSession2, TransparentModalActivity.class, "nametag");
            } else {
                if (this instanceof C152006sk) {
                    C70D c70d5 = this.A01;
                    UserSession userSession3 = c70d5.A09;
                    C18920wW A01 = AbstractC12220kQ.A01(null, userSession3);
                    InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_native_meta_verified_profile_menu_click");
                    if (A002.isSampled()) {
                        A002.Cht();
                    }
                    FW6.A00(c70d5.A07, new C36027FvP(c70d5), userSession3, "nme_ig_slideout_menu");
                    C23031Ai A003 = AbstractC23021Ah.A00(userSession3);
                    A003.A5h.Egi(A003, true, C23031Ai.A8c[222]);
                    return;
                }
                if (this instanceof C152026sm) {
                    C70D c70d6 = this.A01;
                    c70d6.A08.A04(c70d6.A0A.getModuleName(), c70d6.A0F, "settings");
                    return;
                }
                if (this instanceof C151996sj) {
                    C70D c70d7 = this.A01;
                    UserSession userSession4 = c70d7.A09;
                    C54392et A004 = AbstractC54332en.A00(userSession4).A00();
                    C54432ex c54432ex = new C54432ex(EnumC54222eY.A0L, 0);
                    EnumC58162lY enumC58162lY = EnumC58162lY.A0D;
                    EnumC58122lU enumC58122lU = EnumC58122lU.A05;
                    A004.A01(enumC58122lU, enumC58162lY, c54432ex);
                    C54412ev A012 = AbstractC54332en.A00(userSession4).A01();
                    C54432ex c54432ex2 = new C54432ex(EnumC54222eY.A0b, 0);
                    C14360o3.A0B(enumC58162lY, 0);
                    A012.A03(new C72053Ld(enumC58122lU, enumC58162lY, null, null), c54432ex2, false);
                    Bundle bundle = new Bundle();
                    bundle.putString("referrer", "profile_menu");
                    c140966Yy = new C140966Yy(c70d7.A06, userSession4);
                    c140966Yy.A0E(AbstractC62818SSq.A00(bundle));
                } else {
                    if (this instanceof C152016sl) {
                        C70D c70d8 = this.A01;
                        UserSession userSession5 = c70d8.A09;
                        C54392et A005 = AbstractC54332en.A00(userSession5).A00();
                        C54432ex c54432ex3 = new C54432ex(EnumC54222eY.A0F, c70d8.A02());
                        EnumC58162lY enumC58162lY2 = EnumC58162lY.A0D;
                        EnumC58122lU enumC58122lU2 = EnumC58122lU.A05;
                        A005.A01(enumC58122lU2, enumC58162lY2, c54432ex3);
                        C54412ev A013 = AbstractC54332en.A00(userSession5).A01();
                        C54432ex c54432ex4 = new C54432ex(EnumC54222eY.A0b, c70d8.A02());
                        EnumC58162lY enumC58162lY3 = EnumC58162lY.A0F;
                        C14360o3.A0B(enumC58162lY3, 0);
                        A013.A03(new C72053Ld(enumC58122lU2, enumC58162lY3, null, null), c54432ex4, false);
                        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession5).A01.ARD();
                        ARD.E77("has_tapped_on_favorites_profile_navbar_icon", true);
                        ARD.apply();
                        c70d8.A08.Cgk(EnumC33409Epg.SELF_PROFILE_NAV_BUTTON, false, false);
                        return;
                    }
                    if (this instanceof C151956sf) {
                        C70D c70d9 = this.A01;
                        UserSession userSession6 = c70d9.A09;
                        C1571673v.A08(c70d9.A07, userSession6, EnumC1571773w.A05, "tap_archive", c70d9.A0I, c70d9.A0G, c70d9.A0H, "user_profile_header");
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean(MSV.A00(103), true);
                        if (c70d9.A0C != null) {
                            bundle2.putBoolean(MSV.A00(1328), false);
                        }
                        fragmentActivity = c70d9.A06;
                        c6xj = new C6XJ(fragmentActivity, bundle2, userSession6, ModalActivity.class, "archive_home");
                    } else {
                        C70D c70d10 = this.A01;
                        FragmentActivity fragmentActivity2 = c70d10.A06;
                        String string = fragmentActivity2.getString(2131952200);
                        C14360o3.A07(string);
                        C66277U6x A014 = C66277U6x.A01("com.instagram.privacy.activity_center.activity_center_entry_business_screen", new HashMap());
                        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(c70d10.A09);
                        igBloksScreenConfig.A0U = string;
                        A014.A04(fragmentActivity2, igBloksScreenConfig);
                        return;
                    }
                }
            }
            c6xj.A07();
            c6xj.A0C(fragmentActivity);
            return;
        }
        c140966Yy.A04();
    }

    public AbstractC151906sa(C70D c70d, AbstractC151926sc abstractC151926sc, String str, int i) {
        this.A00 = i;
        this.A02 = abstractC151926sc;
        this.A04 = str;
        this.A01 = c70d;
        this.A03 = AnonymousClass001.A0H(abstractC151926sc.A00(), ':', i);
    }

    public void A03() {
        A02();
    }

    public AbstractC151906sa(C70D c70d, String str, int i, int i2) {
        this(c70d, new C151916sb(i2), str, i);
    }
}
