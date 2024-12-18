package X;

import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.PUd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57090PUd implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C57090PUd(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        if (2 - this.A00 != 0) {
            MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) this.A01;
            mediaCaptureActivity.runOnUiThread(new RunnableC56977PPs(mediaCaptureActivity, this.A02));
        } else {
            DirectShareSheetFragment.A0O((DirectShareSheetFragment) this.A01, this.A02);
        }
        return C0eB.A00;
    }
}
