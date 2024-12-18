package X;

import android.app.Activity;

/* loaded from: classes4.dex */
public final class AUP implements InterfaceC58362lv {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C8JT A01;

    public AUP(Activity activity, C8JT c8jt) {
        this.A01 = c8jt;
        this.A00 = activity;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C6WQ c6wq;
        C8JT c8jt = this.A01;
        A5G a5g = c8jt.A09;
        if (a5g != null && (c6wq = a5g.A00) != null) {
            c6wq.dismiss();
        }
        Activity activity = this.A00;
        C9GR.A0B(activity, "fetch_media_failed");
        C8e1 c8e1 = c8jt.A0A;
        if (c8e1 != null) {
            c8e1.A02 = true;
        }
        activity.finish();
    }
}
