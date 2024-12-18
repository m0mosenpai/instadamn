package X;

import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Gl1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC37847Gl1 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC37847Gl1(ReelDashboardFragment reelDashboardFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 26:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                this.A01 = reelDashboardFragment;
                return;
            case 27:
            default:
                this.A01 = reelDashboardFragment;
                return;
        }
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC37847Gl1(obj, i), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x08cb, code lost:
    
        if (r7 != null) goto L263;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0888  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r50) {
        /*
            Method dump skipped, instructions count: 2674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC37847Gl1.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC37847Gl1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
