package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedHashMap;

/* renamed from: X.GUz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37065GUz extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7QY A01;
    public final /* synthetic */ G5C A02;
    public final /* synthetic */ E9A A03;
    public final /* synthetic */ G5D A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37065GUz(C7QY c7qy, G5C g5c, E9A e9a, G5D g5d, int i, boolean z) {
        super(1);
        this.A02 = g5c;
        this.A00 = i;
        this.A01 = c7qy;
        this.A04 = g5d;
        this.A05 = z;
        this.A03 = e9a;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        G5C g5c = this.A02;
        C7Ze c7Ze = g5c.A02;
        if (!((InterfaceC165507ad) c7Ze).CQu()) {
            int i = this.A00;
            EnumC33494ErT enumC33494ErT = null;
            C77Z c77z = new C77Z((InterfaceC164887Zb) c7Ze, i, i, false);
            C7QY c7qy = this.A01;
            String str = null;
            c77z.A00(c7qy, this.A04);
            if (this.A05) {
                E9A e9a = this.A03;
                C83403nh c83403nh = e9a.A02.A0e;
                C14360o3.A07(c83403nh);
                C7F3 A0c = AbstractC31172DnG.A0c(g5c.A04);
                String A0h = c83403nh.A0h();
                String str2 = c83403nh.A1u;
                C14360o3.A07(str2);
                Long A0j = AbstractC166997dE.A0j(str2);
                C7BW c7bw = c83403nh.A0Q;
                if (c7bw != null) {
                    str = c7bw.A05;
                }
                String C7d = ((InterfaceC164917Zg) c7Ze).C7d();
                String A00 = G5C.A00(e9a);
                String queryParameter = android.net.Uri.parse(c7qy.A08.A01).getQueryParameter("subscription_id");
                String str3 = null;
                if (C14360o3.A0K(A00, "GENAI_SUBSCRIPTION")) {
                    enumC33494ErT = EnumC33494ErT.META_AI_SUBSCRIPTION;
                    str3 = "ai_bot_subscriptions";
                } else if (C14360o3.A0K(A00, "GENAI_REMINDER")) {
                    enumC33494ErT = EnumC33494ErT.META_AI_REMINDER;
                    str3 = "ai_bot_reminders";
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0c.A01, "direct_thread_link_tap");
                if (A0f.isSampled()) {
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    if (str3 != null) {
                        A1I.put(TraceFieldType.ContentType, str3);
                    }
                    AbstractC31181DnP.A0h(A0f, A0j, A0h, str, C7d);
                    C32017E4t A002 = C32017E4t.A00(i);
                    A002.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, queryParameter);
                    A002.A01(enumC33494ErT, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    A0f.AAQ(A002, "content");
                    A0f.AAP("tap_surface", "subscription");
                    AbstractC31174DnI.A1F(A0f, A1I);
                }
            }
        }
        return C0eB.A00;
    }
}
