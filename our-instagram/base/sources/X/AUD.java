package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes4.dex */
public final class AUD implements InterfaceC58362lv {
    public final /* synthetic */ C8JT A00;

    public AUD(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C6WQ c6wq;
        C8JT c8jt = this.A00;
        A5G a5g = c8jt.A09;
        if (a5g != null && (c6wq = a5g.A00) != null) {
            c6wq.dismiss();
        }
        FragmentActivity fragmentActivity = c8jt.A15;
        C9GR.A0B(fragmentActivity, "fetch_media_failed");
        C8e1 c8e1 = c8jt.A0A;
        if (c8e1 != null) {
            c8e1.A00 = "";
            c8e1.A01 = true;
        }
        fragmentActivity.finish();
    }
}
