package X;

import android.os.Handler;
import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.GUw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37062GUw extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9CP A01;
    public final /* synthetic */ G5C A02;
    public final /* synthetic */ E9A A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37062GUw(C9CP c9cp, G5C g5c, E9A e9a, int i, boolean z) {
        super(1);
        this.A01 = c9cp;
        this.A02 = g5c;
        this.A03 = e9a;
        this.A00 = i;
        this.A04 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2 = this.A01.A06;
        String str3 = null;
        boolean z = true;
        if (str2 != null && AbstractC002300n.A0h(str2, "instagram://gen_ai_accounts", false)) {
            C34599FMi c34599FMi = (C34599FMi) this.A02.A01.A01(C34599FMi.class, GTU.A00);
            List list = this.A03.A03;
            C14360o3.A0B(list, 0);
            synchronized (c34599FMi.A03) {
                c34599FMi.A01 = null;
                c34599FMi.A00 = null;
                Handler handler = c34599FMi.A02;
                Runnable runnable = c34599FMi.A04;
                handler.removeCallbacks(runnable);
                c34599FMi.A01 = list;
                handler.postDelayed(runnable, 1000L);
            }
        }
        G5C g5c = this.A02;
        C7Ze c7Ze = g5c.A02;
        E9A e9a = this.A03;
        AbstractC46804Kmz.A00(c7Ze, e9a.A01, this.A00);
        if (this.A04) {
            C83403nh c83403nh = e9a.A02.A0e;
            C14360o3.A07(c83403nh);
            C7F3 A0c = AbstractC31172DnG.A0c(g5c.A04);
            String A0h = c83403nh.A0h();
            String str4 = c83403nh.A1u;
            C14360o3.A07(str4);
            Long A0j = AbstractC166997dE.A0j(str4);
            C7BW c7bw = c83403nh.A0Q;
            if (c7bw != null) {
                str3 = c7bw.A05;
            }
            String C7d = ((InterfaceC164917Zg) c7Ze).C7d();
            String A00 = G5C.A00(e9a);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A0c.A01, "direct_thread_link_tap");
            if (A0f.isSampled()) {
                if (C14360o3.A0K(A00, "GENAI_SUBSCRIPTION")) {
                    str = "ai_bot_subscriptions";
                } else if (C14360o3.A0K(A00, "GENAI_REMINDER")) {
                    str = "ai_bot_reminders";
                } else {
                    str = null;
                }
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                if (str != null) {
                    A1I.put(TraceFieldType.ContentType, str);
                }
                AbstractC31181DnP.A0h(A0f, A0j, A0h, str3, C7d);
                A0f.AAP("tap_surface", AbstractC43591JPw.A00(203));
                AbstractC31174DnI.A1F(A0f, A1I);
            }
        }
        if (str2 == null || !AbstractC002300n.A0h(str2, "instagram://gen_ai_accounts", false)) {
            z = false;
        }
        G5C.A01(g5c, e9a, z);
        return C0eB.A00;
    }
}
