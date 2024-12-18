package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AUC implements InterfaceC58362lv {
    public final /* synthetic */ C8JT A00;

    public AUC(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C6WQ c6wq;
        List list = (List) obj;
        C8JT c8jt = this.A00;
        A5G a5g = c8jt.A09;
        if (a5g != null && (c6wq = a5g.A00) != null) {
            c6wq.dismiss();
        }
        if (list != null && !list.isEmpty()) {
            c8jt.A1o.A06.A0B(new C8A8(new C8A9(c8jt.A19, c8jt.A1z, c8jt.A0R, list, null, 930, false, true, false)));
        }
    }
}
