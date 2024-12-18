package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.FgS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35234FgS {
    public static final void A02(Context context, DialogInterface.OnDismissListener onDismissListener, ProductType productType, String str) {
        int i;
        int ordinal = productType.ordinal();
        if (ordinal != 9) {
            if (ordinal != 1) {
                if (ordinal == 13) {
                    i = 2131961972;
                } else {
                    throw new UnsupportedOperationException("Unknown product type");
                }
            } else {
                i = 2131961970;
            }
        } else {
            i = 2131961977;
        }
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        AbstractC31173DnH.A15(context, A0I, R.drawable.ig_illustrations_illo_subscriber_crown_badge_refresh);
        A0I.A0A(2131961978);
        AbstractC31177DnL.A0v(context, A0I, str, i);
        A0I.A0J(DialogInterfaceOnClickListenerC35421Fje.A00, 2131961124);
        A0I.A0g(onDismissListener);
        AbstractC166987dD.A1W(A0I);
    }

    public static final void A03(Context context, User user, int i, boolean z) {
        C14360o3.A0B(user, 1);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0D = AbstractC166997dE.A0r(context.getResources(), user.getUsername(), i);
        A0K.A0B(EnumC142006bJ.A03);
        A0K.A09 = user.Bhu();
        A0K.A06();
        if (z) {
            A0K.A0I = context.getResources().getString(2131976508);
        }
        AbstractC31178DnM.A1S(A0K);
    }

    public static final void A04(UserSession userSession, Context context) {
        AbstractC167007dF.A1K(userSession, context);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131968059);
        A0I.A09(2131968058);
        EnumC193348hE enumC193348hE = EnumC193348hE.A04;
        A0I.A0R(null, enumC193348hE, 2131968948);
        A0I.A0X(new DialogInterfaceOnClickListenerC35455FkC(context, userSession, 34), enumC193348hE, AbstractC166997dE.A0q(context.getResources(), 2131965052), false);
        AbstractC166987dD.A1W(A0I);
        C99694dm A00 = AbstractC99684dl.A00(userSession);
        long parseLong = Long.parseLong(userSession.userId);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A00, "instagram_fan_club_music_attempted");
        AbstractC31178DnM.A1C(A0f, "camera", parseLong);
        A0f.Cht();
    }

    public static final boolean A05(Context context) {
        String installerPackageName;
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installerPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
            } else {
                installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
            z = C14360o3.A0K(installerPackageName, "com.amazon.venezia");
            return z;
        } catch (PackageManager.NameNotFoundException unused) {
            return z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r8.A02 == X.C17Q.A06) goto L6;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.instagram.fanclub.intf.UserPayFanclubUpsellParams, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.fanclub.intf.UserPayFanclubUpsellParams A00(com.instagram.common.session.UserSession r7, com.instagram.user.model.User r8) {
        /*
            java.lang.String r1 = r7.userId
            java.lang.String r0 = r8.getId()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L13
            X.17Q r1 = r8.A02
            X.17Q r0 = X.C17Q.A06
            r6 = 1
            if (r1 != r0) goto L14
        L13:
            r6 = 0
        L14:
            java.lang.String r1 = r8.getId()
            java.lang.String r0 = r8.getUsername()
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r5 = new com.instagram.fanclub.intf.UserPayFanclubUpsellParams
            r5.<init>()
            r5.A00 = r1
            r5.A01 = r0
            r5.A02 = r6
            X.4dm r0 = X.AbstractC99684dl.A00(r7)
            long r3 = X.AbstractC31174DnI.A08(r8)
            X.0wW r1 = r0.A00
            java.lang.String r0 = "viewer_profile_fanclub_banner_impression"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            java.lang.String r0 = "profile"
            X.AbstractC31178DnM.A1C(r2, r0, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r0 = 5365(0x14f5, float:7.518E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A7v(r0, r1)
            r2.Cht()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35234FgS.A00(com.instagram.common.session.UserSession, com.instagram.user.model.User):com.instagram.fanclub.intf.UserPayFanclubUpsellParams");
    }

    public static final void A01(Context context) {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0H = "fan_club_error";
        AbstractC25226BEj.A1N(context, A0j, 2131974293);
        AbstractC31178DnM.A1N(c41451vu, A0j);
    }
}
