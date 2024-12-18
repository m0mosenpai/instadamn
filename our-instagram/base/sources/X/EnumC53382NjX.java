package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated(message = "Use SharingAccoCrosspostingAccountLinkingManager instead")
/* renamed from: X.NjX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53382NjX implements CallerContextable {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53382NjX[] A04;
    public static final EnumC53382NjX A05;
    public static final EnumC53382NjX A06;
    public static final String __redex_internal_original_name = "SharingAccount";
    public final int A00;
    public final int A01;
    public final String A02;

    public abstract String A03(UserSession userSession);

    public void A04(Fragment fragment, UserSession userSession) {
    }

    public final void A05(Fragment fragment, UserSession userSession, InterfaceC914447a interfaceC914447a, GZR gzr, Boolean bool, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        boolean A0A;
        FragmentActivity requireActivity;
        boolean z2 = false;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (bool != null && z) {
            A0A = bool.booleanValue();
        } else {
            A0A = A0A(interfaceC914447a);
        }
        if (A0A) {
            if (interfaceC16820sZ != null) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36328336628137431L) || C18U.A06(c06090Tz, userSession, 36328336628202968L)) {
                    requireActivity = fragment.requireActivity();
                }
            }
            if (z) {
                AbstractC25651Mw.A00(userSession).A05(new C56000OtX(false));
            } else {
                A08(interfaceC914447a, false);
            }
            if (!C18U.A06(C06090Tz.A05, userSession, 36312505378669717L)) {
                return;
            }
            AbstractC31171DnF.A1S(A00, "off", A00.A7l, C23031Ai.A8c, 241);
            return;
        }
        if (A09(userSession)) {
            if (interfaceC16820sZ != null && C18U.A06(C06090Tz.A05, userSession, 36328336628137431L)) {
                requireActivity = fragment.requireActivity();
                z2 = true;
            } else if (z) {
                AbstractC25651Mw.A00(userSession).A05(new C56000OtX(true));
                return;
            } else {
                A08(interfaceC914447a, true);
                return;
            }
        } else {
            A06(fragment, userSession, gzr, EnumC72412Xd8.A0k);
            return;
        }
        A00(requireActivity, userSession, interfaceC914447a, interfaceC16820sZ, z2, z);
    }

    public void A07(Fragment fragment, UserSession userSession, GZR gzr, String str) {
        C14360o3.A0B(userSession, 1);
        A04(fragment, userSession);
    }

    public abstract void A08(InterfaceC914447a interfaceC914447a, boolean z);

    public abstract boolean A09(UserSession userSession);

    public abstract boolean A0A(InterfaceC914447a interfaceC914447a);

    static {
        EnumC53382NjX enumC53382NjX = new EnumC53382NjX() { // from class: X.Ek9
            public static final String __redex_internal_original_name = "SharingAccount$FACEBOOK";

            @Override // X.EnumC53382NjX
            public final String A03(UserSession userSession) {
                C14360o3.A0B(userSession, 0);
                return C196068lw.A00(userSession).A00(CallerContext.A00(EnumC53382NjX.class)).A04;
            }

            @Override // X.EnumC53382NjX
            public final void A08(InterfaceC914447a interfaceC914447a, boolean z) {
                C14360o3.A0B(interfaceC914447a, 0);
                interfaceC914447a.EU4(z);
            }

            @Override // X.EnumC53382NjX
            public final boolean A09(UserSession userSession) {
                C14360o3.A0B(userSession, 0);
                return C196058lv.A08.A04(CallerContext.A00(EnumC53382NjX.class), userSession);
            }

            @Override // X.EnumC53382NjX
            public final boolean A0A(InterfaceC914447a interfaceC914447a) {
                C14360o3.A0B(interfaceC914447a, 0);
                return interfaceC914447a.CUC();
            }

            @Override // X.EnumC53382NjX
            public final void A07(Fragment fragment, UserSession userSession, GZR gzr, String str) {
                AbstractC167017dG.A1P(userSession, str);
                C14360o3.A0B(gzr, 3);
                if (AbstractC196078lx.A02(userSession)) {
                    Integer num = C05F.A00;
                    C35930Fto c35930Fto = new C35930Fto(gzr, str);
                    FragmentActivity requireActivity = fragment.requireActivity();
                    requireActivity.getSupportFragmentManager().A0u(new C35758Fqv(c35930Fto, 3), requireActivity, "page_linking_request");
                    FragmentActivity requireActivity2 = fragment.requireActivity();
                    EIM eim = new EIM();
                    eim.setArguments(AbstractC34027F0g.A00(null, num, "share_table"));
                    AbstractC31177DnL.A0w(null, eim, requireActivity2, userSession);
                    return;
                }
                AbstractC34213F7l.A00().A01(fragment, userSession, new C36783GJg(gzr, 7)).A06(str, AbstractC149576oA.A00(userSession).A08(AbstractC111324zv.A00(3639)));
            }
        };
        A05 = enumC53382NjX;
        EnumC53382NjX enumC53382NjX2 = new EnumC53382NjX() { // from class: X.EkA
            public static final String __redex_internal_original_name = "SharingAccount$WHATSAPP";

            @Override // X.EnumC53382NjX
            public final void A08(InterfaceC914447a interfaceC914447a, boolean z) {
            }

            @Override // X.EnumC53382NjX
            public final boolean A0A(InterfaceC914447a interfaceC914447a) {
                return false;
            }

            @Override // X.EnumC53382NjX
            public final void A04(Fragment fragment, UserSession userSession) {
                String A00;
                String A032 = A03(userSession);
                if (A032 != null && A032.length() != 0) {
                    A00 = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
                } else {
                    A00 = AbstractC111324zv.A00(46);
                }
                C66277U6x A01 = C66277U6x.A01(A00, AbstractC31180DnO.A0p("ShareToOtherAppsEntryPoint", "whatsapp_linking_in_sharing_to_other_apps"));
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
                AbstractC31171DnF.A17(fragment, A0C, 2131977078);
                C72743Nv A02 = W6d.A02(A0C, A01);
                C140966Yy A0C2 = AbstractC31175DnJ.A0C(fragment, userSession);
                A0C2.A0A = "ShareToOtherAppsEntryPoint";
                A0C2.A0F = true;
                A0C2.A0D(A02);
                A0C2.A04();
            }

            @Override // X.EnumC53382NjX
            public final String A03(UserSession userSession) {
                C208059Im c208059Im;
                if (!AbstractC31178DnM.A0T(userSession).A1a()) {
                    return "";
                }
                A9M A01 = C97F.A01(C97F.A00(EnumC53382NjX.class), userSession);
                if (A01 != null && (c208059Im = A01.A00) != null) {
                    return c208059Im.A00(C97F.A00(EnumC53382NjX.class), userSession);
                }
                return null;
            }

            @Override // X.EnumC53382NjX
            public final boolean A09(UserSession userSession) {
                return AbstractC31178DnM.A0T(userSession).A1a();
            }
        };
        A06 = enumC53382NjX2;
        EnumC53382NjX[] enumC53382NjXArr = {enumC53382NjX, enumC53382NjX2};
        A04 = enumC53382NjXArr;
        A03 = AbstractC12190kN.A00(enumC53382NjXArr);
    }

    @Deprecated(message = "For Fb Feed xpost use SharingAccount.FACEBOOK.isSharingAllowedForMedia")
    public static final boolean A01(InterfaceC914447a interfaceC914447a) {
        if (interfaceC914447a != null) {
            if (interfaceC914447a.AdS() == EnumC76383bi.A06 && !interfaceC914447a.CL0() && !interfaceC914447a.CKm() && !interfaceC914447a.BuB()) {
                return true;
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    public static EnumC53382NjX valueOf(String str) {
        return (EnumC53382NjX) Enum.valueOf(EnumC53382NjX.class, str);
    }

    public static EnumC53382NjX[] values() {
        return (EnumC53382NjX[]) A04.clone();
    }

    public final String A02(Context context, User user) {
        String Bb3;
        int i = this.A01;
        if (i == 2131962025 && (Bb3 = user.A03.Bb3()) != null && Bb3.length() != 0 && user.CQw()) {
            String Bb32 = user.A03.Bb3();
            if (Bb32 == null) {
                throw AbstractC166997dE.A0g();
            }
            return Bb32;
        }
        return AbstractC166997dE.A0p(context, i);
    }

    public EnumC53382NjX(String str, int i, int i2, int i3, String str2) {
        this.A01 = i2;
        this.A02 = str2;
        this.A00 = i3;
    }

    private final void A00(Activity activity, UserSession userSession, InterfaceC914447a interfaceC914447a, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        int i;
        int i2 = z ? 2131958595 : 2131958603;
        C131975xX c131975xX = C131965xW.A05;
        String A0b = AbstractC31177DnL.A0b(activity, C131975xX.A00(userSession).A05(activity, userSession), 2131958596);
        int i3 = 2131958582;
        if (z) {
            i3 = 2131958593;
            i = 2131958564;
        } else {
            i = 2131958600;
        }
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0A(i2);
        if (z) {
            A0H.A0r(A0b);
        }
        A0H.A0J(new DialogInterfaceOnClickListenerC55290OgB(userSession, interfaceC914447a, this, interfaceC16820sZ, 0, z2, z), i3);
        A0H.A0H(new DialogInterfaceOnClickListenerC55290OgB(userSession, interfaceC914447a, this, interfaceC16820sZ, 1, z2, z), i);
        AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC55309OgX.A00, A0H, 2131958581);
    }

    public final void A06(Fragment fragment, UserSession userSession, GZR gzr, EnumC72412Xd8 enumC72412Xd8) {
        AbstractC167027dH.A12(fragment, userSession, enumC72412Xd8);
        A07(fragment, userSession, gzr, enumC72412Xd8.A01());
    }
}
