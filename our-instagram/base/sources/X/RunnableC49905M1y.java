package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Map;

/* renamed from: X.M1y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49905M1y implements Runnable {
    public final /* synthetic */ C45504KCt A00;

    public RunnableC49905M1y(C45504KCt c45504KCt) {
        this.A00 = c45504KCt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45504KCt c45504KCt = this.A00;
        String str = ((C44537Jmh) c45504KCt.A09.getValue()).A0D.A00;
        FragmentActivity activity = c45504KCt.getActivity();
        if (activity != null) {
            Map map = C47944LFy.A03;
            C47944LFy c47944LFy = (C47944LFy) map.get(activity);
            if (c47944LFy == null) {
                c47944LFy = new C47944LFy(activity);
                map.put(activity, c47944LFy);
            }
            ((L6Y) c45504KCt.A08.getValue()).A00(c47944LFy, AbstractC25227BEk.A0v(c45504KCt, 2131964197), AbstractC25227BEk.A0v(c45504KCt, 2131964256), new MEE(c47944LFy, c45504KCt, activity, AbstractC25227BEk.A0v(c45504KCt, 2131964215), str, AbstractC25227BEk.A0v(c45504KCt, 2131964281), 2));
        }
    }
}
