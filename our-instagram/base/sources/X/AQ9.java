package X;

import android.view.View;
import com.instagram.camera.effect.models.CameraAREffect;

/* loaded from: classes4.dex */
public final class AQ9 implements View.OnClickListener {
    public final /* synthetic */ C8ZD A00;

    public AQ9(C8ZD c8zd) {
        this.A00 = c8zd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        int A05 = C0f9.A05(849919097);
        C8ZD c8zd = this.A00;
        C8ZC c8zc = c8zd.A03;
        Object obj2 = null;
        if (c8zc != null) {
            obj = AbstractC191638eL.A03.getValue();
            obj2 = AbstractC191638eL.A05.getValue();
        } else {
            obj = null;
        }
        if (!C14360o3.A0K(obj, obj2) && c8zc != null) {
            C9U6 c9u6 = c8zc.A00.A00;
            CameraAREffect cameraAREffect = (CameraAREffect) AbstractC191638eL.A05.getValue();
            if (cameraAREffect == null) {
                c9u6.A00();
            } else {
                c9u6.A01(cameraAREffect);
            }
        }
        c8zd.A03();
        C0f9.A0C(709260302, A05);
    }
}
