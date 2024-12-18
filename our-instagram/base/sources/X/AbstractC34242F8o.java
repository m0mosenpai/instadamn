package X;

import android.os.Bundle;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.intf.DirectShareSheetAppearance;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.F8o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34242F8o {
    public static final void A00(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58279PsX interfaceC58279PsX, EnumC53311Nhn enumC53311Nhn, EnumC53214NgC enumC53214NgC, InterfaceC58258Ps2 interfaceC58258Ps2, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        Integer num;
        String str;
        C14360o3.A0B(userSession, 1);
        AbstractC25233BEq.A0w(2, interfaceC58279PsX, enumC53214NgC, enumC53311Nhn);
        AbstractC167007dF.A1I(interfaceC16660sJ, 7, interfaceC16820sZ);
        Integer num2 = C05F.A08;
        HashMap A1G = AbstractC166987dD.A1G();
        int ordinal = enumC53214NgC.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
        } else {
            num = C05F.A00;
        }
        C14360o3.A0B(num, 0);
        switch (num.intValue()) {
            case 0:
                str = "direct_message";
                break;
            case 1:
                str = "system_tray";
                break;
            default:
                str = "copy_link";
                break;
        }
        A1G.put("share_mode", str);
        A1G.put(CacheBehaviorLogger.SOURCE, enumC53311Nhn.A00());
        AbstractC55033OXz.A02(interfaceC58279PsX, num2, A1G);
        if (ordinal != 2) {
            C51851Mvt c51851Mvt = (C51851Mvt) interfaceC58258Ps2;
            if (ordinal != 1) {
                String str2 = c51851Mvt.A03;
                if (str2 != null) {
                    Integer num3 = C05F.A0k;
                    HashMap A1G2 = AbstractC166987dD.A1G();
                    A1G2.put("suggested_thread_ids", AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, null));
                    AbstractC55033OXz.A02(interfaceC58279PsX, num3, A1G2);
                    C34726FRp A07 = C28531Zo.A04.A02.A07(abstractC59962oe, userSession, C2EY.A1D);
                    A07.A06(str2);
                    Bundle bundle = A07.A07;
                    bundle.putBoolean("DirectShareSheetConstants.disable_send_to_group", true);
                    bundle.putBoolean("DirectShareSheetConstants.disable_group_creation", true);
                    A07.A08(false);
                    bundle.putStringArrayList("DirectShareSheetConstants.multiple_prioritized_thread_ids", AbstractC166987dD.A1F(list));
                    bundle.putParcelable("DirectShareSheetConstants.appearance", new DirectShareSheetAppearance(null, null, Integer.MIN_VALUE, false, false, false, true, false, false, false, false, false, false, false, false, false, false));
                    A07.A01 = new C36388G3o(interfaceC58279PsX, interfaceC16820sZ);
                    interfaceC16660sJ.invoke(A07.A00());
                    return;
                }
                return;
            }
            AbstractC31510Dsu.A0Q(abstractC59962oe.requireActivity(), AbstractC31178DnM.A06("android.intent.extra.TEXT", c51851Mvt.A04), abstractC59962oe, userSession, "share_to_system_sheet", AbstractC166987dD.A1G());
            return;
        }
        AbstractC13900nG.A00(abstractC59962oe.requireActivity(), ((C51851Mvt) interfaceC58258Ps2).A04);
        interfaceC16820sZ.invoke();
    }
}
