package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import java.util.List;

/* loaded from: classes11.dex */
public final class WOV implements Animation.AnimationListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ U8O A02;
    public final /* synthetic */ C7L1 A03;
    public final /* synthetic */ UAT A04;
    public final /* synthetic */ boolean A05;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public WOV(Context context, View view, U8O u8o, C7L1 c7l1, UAT uat, boolean z) {
        this.A05 = z;
        this.A00 = context;
        this.A04 = uat;
        this.A01 = view;
        this.A02 = u8o;
        this.A03 = c7l1;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.A05) {
            Context context = this.A00;
            C14360o3.A0A(context);
            Object systemService = context.getSystemService("vibrator");
            C14360o3.A0C(systemService, AbstractC111324zv.A00(1134));
            ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(50L, 150));
        }
        UAT uat = this.A04;
        View view = this.A01;
        U8O u8o = this.A02;
        List A0a = AbstractC001800i.A0a(u8o.A0H);
        uat.getLocationInWindow(new int[2]);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        uat.A01.add(new C68926VeQ(new RectF(iArr[0], iArr[1] - r10[1], r2 + view.getWidth(), (iArr[1] + view.getHeight()) - r10[1]), AbstractC001800i.A0a(A0a)));
        uat.invalidate();
        view.startAnimation(C7L1.A00(this.A03.A00, 0.95f, 1.0f));
        u8o.A0G.clear();
        u8o.invalidateSelf();
    }
}
