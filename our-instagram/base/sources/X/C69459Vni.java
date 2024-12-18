package X;

import android.animation.Animator;
import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.R;

/* renamed from: X.Vni, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69459Vni {
    public float A00;
    public float A01;
    public A58 A03;
    public Float A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public final float A08;
    public final int A09;
    public final VelocityTracker A0B;
    public final View A0C;
    public final View A0D;
    public float A02 = 2.0f;
    public final Animator.AnimatorListener A0A = new C70203WGv(this, 1);

    public C69459Vni(View view, View view2, Integer num) {
        this.A0D = view;
        this.A0C = view2;
        this.A05 = num;
        Context context = view.getContext();
        this.A0B = VelocityTracker.obtain();
        this.A08 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
        this.A09 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
