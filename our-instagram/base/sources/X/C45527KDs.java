package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.KDs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45527KDs extends AbstractC61152qd {
    public C05A A00;
    public final C2GT A01;
    public final C05A A02;
    public final C05A A03;
    public final C0UO A04;
    public final C0UO A05;
    public final C0UO A06;

    public C45527KDs(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C10E.A00(AbstractC46782Kmd.A00(userSession).A00.A02);
        C008002u A00 = C10E.A00(AbstractC001800i.A0j(C4I4.A00(userSession).A00));
        this.A02 = A00;
        C4I3 c4i3 = C4I3.A03;
        Object value = this.A00.getValue();
        String str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        C09530e4 A1L = AbstractC166987dD.A1L("all", value == c4i3 ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : "0");
        EnumC46248KdP enumC46248KdP = EnumC46248KdP.A06;
        C09530e4 A1L2 = AbstractC166987dD.A1L(enumC46248KdP.A02, ((java.util.Set) A00.getValue()).contains(enumC46248KdP) ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : "0");
        EnumC46248KdP enumC46248KdP2 = EnumC46248KdP.A07;
        C09530e4 A1L3 = AbstractC166987dD.A1L(enumC46248KdP2.A02, ((java.util.Set) A00.getValue()).contains(enumC46248KdP2) ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : "0");
        C09530e4 A1L4 = AbstractC166987dD.A1L("relevant", this.A00.getValue() == C4I3.A0M ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : "0");
        EnumC46248KdP enumC46248KdP3 = EnumC46248KdP.A0B;
        C09530e4 A1L5 = AbstractC166987dD.A1L(enumC46248KdP3.A02, ((java.util.Set) A00.getValue()).contains(enumC46248KdP3) ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : "0");
        EnumC46248KdP enumC46248KdP4 = EnumC46248KdP.A0C;
        C008002u A002 = C10E.A00(AbstractC06930Yk.A05(A1L, A1L2, A1L3, A1L4, A1L5, AbstractC166987dD.A1L(enumC46248KdP4.A02, ((java.util.Set) A00.getValue()).contains(enumC46248KdP4) ? str : "0")));
        this.A03 = A002;
        C05A c05a = this.A00;
        this.A06 = AbstractC208910l.A02(c05a);
        this.A04 = AbstractC208910l.A02(A00);
        this.A05 = AbstractC208910l.A02(A002);
        this.A01 = AbstractC43594JPz.A0J(new L07(c4i3, C16910sj.A00), AbstractC141776au.A00(this), AbstractC43593JPy.A16(c05a, A00, 25), C10I.A01);
    }

    public static final void A00(C4I3 c4i3, C45527KDs c45527KDs) {
        if (c4i3 == C4I3.A03) {
            C05A c05a = c45527KDs.A03;
            AbstractC43592JPx.A15(c05a).put("all", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            AbstractC43592JPx.A15(c05a).put("relevant", "0");
        } else {
            if (c4i3 != C4I3.A0M) {
                return;
            }
            C05A c05a2 = c45527KDs.A03;
            AbstractC43592JPx.A15(c05a2).put("all", "0");
            AbstractC43592JPx.A15(c05a2).put("relevant", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
    }
}
