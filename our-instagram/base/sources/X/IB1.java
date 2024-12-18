package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IB1 {
    public static final LinkedHashMap A00(C42284Io8 c42284Io8, Integer num) {
        String str;
        Boolean bool = null;
        C5KZ A00 = C5KX.A00(JEX.A00, AbstractC73763Sg.A03);
        Collection values = c42284Io8.A0B.values();
        C14360o3.A07(values);
        List A0a = AbstractC001800i.A0a(values);
        X1F x1f = X1F.A00;
        C09530e4 A1L = AbstractC166987dD.A1L("ads", A00.A02(A0a, new C3SG(x1f)));
        C09530e4 A1L2 = AbstractC166987dD.A1L("seedItemInfo", A00.A02(c42284Io8.A09, AbstractC192698gB.A00(x1f)));
        C09530e4 A1L3 = AbstractC166987dD.A1L("exitItemInfo", A00.A02(c42284Io8.A08, AbstractC192698gB.A00(x1f)));
        C09530e4 A1L4 = AbstractC166987dD.A1L("totalSessionDwell", String.valueOf(c42284Io8.A05));
        C09530e4 A1L5 = AbstractC166987dD.A1L("totalOrganicImpressions", String.valueOf(c42284Io8.A03));
        UQH uqh = c42284Io8.A09;
        if (uqh != null) {
            bool = Boolean.valueOf(uqh.A05);
        }
        C09530e4 A1L6 = AbstractC166987dD.A1L("isMMCSeed", String.valueOf(bool));
        C09530e4 A1L7 = AbstractC166987dD.A1L("depth", String.valueOf(c42284Io8.A02));
        ClipsViewerSource clipsViewerSource = c42284Io8.A06;
        if (clipsViewerSource != ClipsViewerSource.A1S && clipsViewerSource != ClipsViewerSource.A1W && clipsViewerSource != ClipsViewerSource.A1U) {
            if (clipsViewerSource != ClipsViewerSource.A1T && clipsViewerSource != ClipsViewerSource.A1X) {
                if (clipsViewerSource == ClipsViewerSource.A0V) {
                    str = "RIFU";
                } else if (clipsViewerSource != ClipsViewerSource.A0s && clipsViewerSource != ClipsViewerSource.A0t) {
                    if (!clipsViewerSource.A01() && clipsViewerSource != ClipsViewerSource.A0w) {
                        str = AbstractC167007dF.A0h(clipsViewerSource.name());
                    } else {
                        str = "explore";
                    }
                } else {
                    str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
                }
            } else {
                str = "feed_suggested";
            }
        } else {
            str = "feed_connected";
        }
        LinkedHashMap A07 = AbstractC06930Yk.A07(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, AbstractC166987dD.A1L("entryPoint", str), AbstractC166987dD.A1L("appSessionId", String.valueOf(c42284Io8.A0A)));
        if (num != null) {
            A07.put("huntAndPeckThreshold", String.valueOf(num.intValue()));
        }
        return A07;
    }
}
