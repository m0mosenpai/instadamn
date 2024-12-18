package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* loaded from: classes9.dex */
public abstract class OXw {
    public static final CharSequence A00(Context context, C51624MrH c51624MrH) {
        Resources resources;
        int i;
        CharSequence A0H;
        int ordinal = c51624MrH.A01.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            A0H = "";
                            return A0H;
                        }
                        resources = context.getResources();
                        i = 2131972052;
                    } else {
                        resources = context.getResources();
                        i = 2131972051;
                    }
                } else {
                    resources = context.getResources();
                    i = 2131972050;
                }
            } else {
                resources = context.getResources();
                i = 2131972049;
            }
        } else {
            resources = context.getResources();
            i = 2131972053;
        }
        A0H = MSZ.A0H(resources, c51624MrH.A04, i);
        return A0H;
    }

    public static final void A01(Context context, UserSession userSession, Integer num, Integer num2, Integer num3, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4;
        String str5;
        C14360o3.A0B(userSession, 1);
        String str6 = null;
        Integer num4 = null;
        if (AbstractC08690cX.A01(userSession) == EnumC222416a.A06) {
            num4 = num3;
        }
        Integer num5 = C05F.A01;
        if (num2 == num5) {
            str2 = "ccp";
        } else {
            str2 = "xar";
        }
        if (num4 != null) {
            str6 = C9H5.A00(num4);
        }
        if (!AbstractC001800i.A0u(AbstractC43592JPx.A13("CAL", "BPL"), str6)) {
            str6 = null;
        }
        C09530e4 A1L = AbstractC166987dD.A1L("share_type", str2);
        if (str == null) {
            str = "";
        }
        C09530e4 A1L2 = AbstractC166987dD.A1L("camera_id", str);
        if (z) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        C09530e4 A1L3 = AbstractC166987dD.A1L("is_clientside_on", str3);
        if (z2) {
            str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str4 = "0";
        }
        C09530e4 A1L4 = AbstractC166987dD.A1L("is_panavision", str4);
        if (num.intValue() != 0) {
            str5 = "v2";
        } else {
            str5 = "v1";
        }
        C66277U6x A01 = C66277U6x.A01("com.instagram.family_sharing.reels_ccp_xar_setting.ReelsCCPXARSetting", AbstractC06930Yk.A02(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L(AbstractC111324zv.A00(4257), str5), AbstractC166987dD.A1L("linkage_destination_type_string", str6)));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        int i = 2131955747;
        if (num2 == num5) {
            i = 2131972012;
        }
        AbstractC31171DnF.A10(context, A0C, i);
        A01.A04(context, A0C);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.MnJ] */
    public static final void A02(MU0 mu0, UserSession userSession, boolean z) {
        ?? c0Zx = new C0Zx();
        c0Zx.A03("is_xpost_enabled", Boolean.valueOf(z));
        AbstractC50568MTz.A00(mu0, MU1.REELS, C82G.A0N, c0Zx, userSession);
    }
}
