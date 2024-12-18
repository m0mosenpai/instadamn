package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.KLr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45714KLr extends AbstractRunnableC14200nk {
    public final /* synthetic */ C120125cB A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45714KLr(C120125cB c120125cB, String str) {
        super(1656425846, 3, false, false);
        this.A01 = str;
        this.A00 = c120125cB;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L42 l42;
        try {
            String string = new JSONObject(this.A01).getString("client_context");
            if (string == null) {
                return;
            }
            C120115cA c120115cA = this.A00.A00;
            java.util.Set set = c120115cA.A04;
            if (!set.contains(string) && (l42 = (L42) c120115cA.A02.get(string)) != null) {
                c120115cA.A01.markerPoint(814299525, l42.A02, "text_sent");
                set.add(string);
            }
        } catch (JSONException unused) {
        }
    }
}
