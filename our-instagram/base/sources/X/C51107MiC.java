package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.FaceEffectLinearLayoutManager;

/* renamed from: X.MiC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51107MiC extends C110814yt {
    public final /* synthetic */ FaceEffectLinearLayoutManager A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51107MiC(Context context, FaceEffectLinearLayoutManager faceEffectLinearLayoutManager) {
        super(context);
        C14360o3.A0B(context, 2);
        this.A00 = faceEffectLinearLayoutManager;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A04(View view, C110834yv c110834yv, C3F5 c3f5) {
        ?? A1b = AbstractC25233BEq.A1b(view, c3f5, c110834yv);
        FaceEffectLinearLayoutManager faceEffectLinearLayoutManager = this.A00;
        AbstractC61802rh abstractC61802rh = faceEffectLinearLayoutManager.A01;
        if (abstractC61802rh == null) {
            super.A04(view, c110834yv, c3f5);
            return;
        }
        int[] A09 = abstractC61802rh.A09(view, faceEffectLinearLayoutManager);
        if (2 <= A1b) {
            return;
        }
        AbstractC50522MSa.A15(this, c110834yv, A09, A1b == true ? 1 : 0, A09[0]);
    }

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        C14360o3.A0B(displayMetrics, 0);
        return this.A00.A00 / displayMetrics.densityDpi;
    }
}
