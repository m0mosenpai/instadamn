package X;

import android.view.View;
import com.instagram.camera.effect.models.CameraAREffect;

/* loaded from: classes4.dex */
public final class ARO implements View.OnClickListener {
    public final /* synthetic */ C183498Bw A00;
    public final /* synthetic */ C9UW A01;

    public ARO(C183498Bw c183498Bw, C9UW c9uw) {
        this.A01 = c9uw;
        this.A00 = c183498Bw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-37460229);
        C183498Bw c183498Bw = this.A00;
        C81Z c81z = c183498Bw.A01;
        if (c81z.A1p.A03) {
            c81z.A0G.A00(c81z.A09, c81z.A00);
        } else {
            CameraAREffect cameraAREffect = c81z.A0M.A00().A05.A09;
            if (cameraAREffect != null && cameraAREffect.A0Z.get("galleryPicker") != null) {
                C4T4.A00(c81z.A0Q).Cj0(c81z.A01, cameraAREffect.A0K, cameraAREffect.A0M);
            }
            AbstractC166987dD.A0u(c81z.A0Q).A02(c183498Bw.A00.A0N(), "gallery_picker_effect_button_adapter");
            c81z.A1M.A00().A08().A0k(true);
        }
        C0f9.A0C(-1568827176, A05);
    }
}
