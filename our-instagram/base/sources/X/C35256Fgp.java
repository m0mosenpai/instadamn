package X;

import android.content.Context;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fgp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35256Fgp {
    public static final C35256Fgp A00 = new Object();

    public static final void A01(Context context, UserSession userSession, long j) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC1565371b.A00(userSession)) {
            AbstractC35176FfT.A02(context, userSession, "account_center");
            return;
        }
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A03 = U6H.A08;
        C65981Txa A03 = c35205Ffx.A03();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        BitSet A0j = AbstractC31171DnF.A0j(0);
        A1I.put("entrypoint", "app_settings");
        A1I.put("caller_name", null);
        if (A0j.nextClearBit(0) >= 0) {
            LinkedHashMap A1I2 = AbstractC166987dD.A1I();
            Iterator A14 = AbstractC166997dE.A14(A1I);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                if (AbstractC35772FrA.A00.contains(A1K.getKey())) {
                    A1I2.put(A1K.getKey(), A1K.getValue());
                }
            }
            C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.fxcal.settings.FXAccountsCenterHomeScreenQuery", null, null, AbstractC06930Yk.A0B(A1I), A1I2, 857801770, j, true);
            AnonymousClass637 A002 = VRA.A00(userSession, false);
            AbstractC167007dF.A1D(A002, 1, A03);
            c63719SsZ.E2V(context, A03, A002);
            return;
        }
        throw AbstractC31172DnG.A0v();
    }

    public static final void A02(AbstractC59962oe abstractC59962oe, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        A03(abstractC59962oe, userSession, str, str2, true);
    }

    public static final void A03(AbstractC59962oe abstractC59962oe, UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (AbstractC1565371b.A00(userSession)) {
            AbstractC35176FfT.A02(abstractC59962oe.requireContext(), userSession, "account_center");
        } else {
            abstractC59962oe.scheduleAndGetLoaderId(A00.A00(AbstractC31172DnG.A0N(abstractC59962oe, userSession), userSession, str, str2, z));
        }
    }

    public static final void A04(UserSession userSession, long j) {
        C14360o3.A0B(userSession, 0);
        if (!AbstractC1565371b.A00(userSession)) {
            C35205Ffx c35205Ffx = new C35205Ffx();
            c35205Ffx.A03 = U6H.A08;
            C65981Txa A03 = c35205Ffx.A03();
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36321391667455372L);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            BitSet A0j = AbstractC31171DnF.A0j(0);
            A1I.put("entrypoint", "app_settings");
            A1I.put("caller_name", null);
            if (A0j.nextClearBit(0) >= 0) {
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.fxcal.settings.FXAccountsCenterHomeScreenQuery", null, null, AbstractC06930Yk.A0B(A1I), c16920sk, 719983200, j, true);
                AnonymousClass637 A002 = VRA.A00(userSession, false);
                AbstractC167007dF.A1D(A03, 0, A002);
                c63719SsZ.E5D(A03, A002, null, A06);
                return;
            }
            throw AbstractC31172DnG.A0v();
        }
    }

    public static final boolean A05(IgFragmentActivity igFragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(igFragmentActivity, 0);
        boolean A1V = AbstractC167007dF.A1V(userSession);
        if (AbstractC1565371b.A00(userSession)) {
            AbstractC167007dF.A0J().postDelayed(new RunnableC36864GMl(AbstractC35176FfT.A00(igFragmentActivity, userSession, "account_center", null)), 1000L);
            return false;
        }
        igFragmentActivity.schedule(A00.A00(AbstractC31172DnG.A0O(igFragmentActivity, interfaceC11380iw, userSession), userSession, str, str2, z));
        return A1V;
    }

    private final AbstractC192798gL A00(C62862tP c62862tP, UserSession userSession, String str, String str2, boolean z) {
        Long A0j;
        C913045j c913045j = C913045j.A00;
        C54s c54s = new C54s(c913045j);
        if (z) {
            c54s.A0D("platform", 1);
            String fbidV2 = AbstractC166997dE.A0Y(userSession).A03.getFbidV2();
            if (fbidV2 != null && (A0j = AbstractC166997dE.A0j(fbidV2)) != null) {
                c54s.A0F("identity_id", A0j.toString());
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C54s c54s2 = new C54s(c913045j);
        c54s2.A0F("entrypoint", str);
        c54s2.A0F("node_identifier", str2);
        c54s2.A0C(c54s, "deeplink_params");
        AbstractC192798gL A05 = C192108fB.A05(userSession, AbstractC111324zv.A00(101), new C25020B4x(AbstractC31177DnL.A0K(c54s2, c913045j), 2));
        C32392EOt.A00(A05, c62862tP, 12);
        return A05;
    }
}
