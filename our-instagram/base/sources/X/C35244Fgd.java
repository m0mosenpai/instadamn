package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Fgd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35244Fgd {
    public static final C35244Fgd A00 = new Object();

    public static final boolean A03(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, AbstractC46972Dl abstractC46972Dl, int i, boolean z) {
        boolean A1R = AbstractC167007dF.A1R(0, context, activity);
        C14360o3.A0B(userSession, 2);
        BizUserInboxState A0E = AbstractC31179DnN.A0E(userSession);
        if ((i == A1R || C14360o3.A0K(abstractC46972Dl, C46962Dk.A00) || ((C14360o3.A0K(abstractC46972Dl, C47032Dr.A00) || i == 0) && z)) && A0E == BizUserInboxState.A04) {
            if (AbstractC159067Bs.A00(userSession)) {
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                AbstractC31172DnG.A1C(context, A0I, 2131963185);
                AbstractC31173DnH.A16(context, A0I, 2131963187);
                A0I.A0e(DialogInterfaceOnClickListenerC35412FjV.A00, AbstractC166997dE.A0p(context, 2131968948));
                A0I.A0b(DialogInterfaceOnClickListenerC35455FkC.A00(activity, userSession, 23), AbstractC166997dE.A0p(context, 2131963190));
                AbstractC166987dD.A1W(A0I);
                C162337Ov.A0P(interfaceC11380iw, userSession, null, "business_inbox_hmps_thread_action_blocked_dialog_impression", 2);
                return A1R;
            }
            if (z && C18U.A06(C06090Tz.A05, userSession, 36312694357230808L)) {
                A00(activity, context, userSession);
                return A1R;
            }
        }
        return false;
    }

    public final void A04(Context context, C32071E6x c32071E6x, UserSession userSession, C2DS c2ds, DirectThreadKey directThreadKey, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        int i;
        boolean z2;
        AbstractC167017dG.A1R(c2ds, directThreadKey);
        C2DU c2du = (C2DU) c2ds;
        C81663kb A03 = C2DU.A03(c2du, directThreadKey);
        if (A03 != null) {
            boolean CaK = C2DU.A00(A03, c2du).CaK();
            i = A03.C7g();
            z2 = A03.isPending();
            if (CaK && !z && 3 <= c2ds.BdL(c32071E6x.A00, true)) {
                GT1 gt1 = new GT1(context, c32071E6x, userSession, c2ds, directThreadKey, interfaceC16820sZ, i, z2);
                String A01 = JUR.A01(context, userSession, AbstractC1121354g.A00(EnumC46982Dm.A05, c32071E6x.A00), false);
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                A0I.A05 = AbstractC167007dF.A0f(context, A01, 2131960771);
                AbstractC31177DnL.A0v(context, A0I, A01, 2131960770);
                String A0p = AbstractC166997dE.A0p(context, 2131960769);
                DialogInterfaceOnClickListenerC35452Fk9 A002 = DialogInterfaceOnClickListenerC35452Fk9.A00(gt1, 67);
                EnumC193348hE enumC193348hE = EnumC193348hE.A04;
                A0I.A0Z(A002, enumC193348hE, A0p, true);
                A0I.A0X(DialogInterfaceOnClickListenerC35413FjW.A00, enumC193348hE, AbstractC166997dE.A0p(context, 2131954754), true);
                AbstractC166987dD.A1W(A0I);
                return;
            }
        } else {
            i = 0;
            z2 = false;
        }
        A01(context, c32071E6x, userSession, directThreadKey, interfaceC16820sZ, i, z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1kE, X.1OW] */
    public static final void A01(Context context, C32071E6x c32071E6x, UserSession userSession, DirectThreadKey directThreadKey, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        String str;
        if (i == 29) {
            ?? c1ow = new C1OW(AbstractC31277Doz.A09(userSession, C31891fZ.class, 1));
            c1ow.A00 = directThreadKey;
            c1ow.A01 = z;
            AbstractC31173DnH.A1U(userSession, c1ow);
            C35267Fh2 A002 = F3T.A00(userSession);
            String str2 = directThreadKey.A00;
            if (str2 != null) {
                InterfaceC02590Ai A003 = C35267Fh2.A00(A002);
                if (A003.isSampled()) {
                    C35267Fh2.A04(A003, A002);
                    if (z) {
                        str = "channel_hide_in_messages";
                    } else {
                        str = "channel_show_in_messages";
                    }
                    AbstractC31177DnL.A1D(A003, str);
                    AbstractC25232BEp.A1K(A003, "channel");
                    A003.AAP("ig_thread_id", str2);
                    A003.Cht();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            String str3 = directThreadKey.A00;
            if (str3 != null) {
                AbstractC31278Dp0.A01(c32071E6x, userSession, str3);
                FUF.A01(context, c32071E6x, userSession, null, 1, !z2);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        interfaceC16820sZ.invoke();
    }

    public static final void A00(Activity activity, Context context, UserSession userSession) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        AbstractC31172DnG.A1C(context, A0I, 2131963184);
        AbstractC31173DnH.A16(context, A0I, 2131963186);
        A0I.A0e(DialogInterfaceOnClickListenerC35410FjT.A00, AbstractC166997dE.A0p(context, 2131968948));
        A0I.A0b(DialogInterfaceOnClickListenerC35455FkC.A00(activity, userSession, 22), AbstractC166997dE.A0p(context, 2131963190));
        AbstractC166987dD.A1W(A0I);
    }

    public static final void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        AbstractC31172DnG.A1C(context, A0I, 2131954435);
        AbstractC31173DnH.A16(context, A0I, 2131954434);
        A0I.A0d(new DialogInterfaceOnClickListenerC35363Fie(interfaceC11380iw, userSession, str, str2, str3, 1), AbstractC166997dE.A0p(context, 2131968948));
        AbstractC166987dD.A1W(A0I);
        C162337Ov.A0R(interfaceC11380iw, userSession, "unsupported_dialog_impression", str, str2, str3);
    }
}
