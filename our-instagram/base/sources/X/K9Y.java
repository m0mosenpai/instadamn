package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* loaded from: classes8.dex */
public final class K9Y extends L8D implements MO8 {
    public static final void A00(K9Y k9y) {
        try {
            ViewGroup viewGroup = k9y.A06;
            Bitmap A0F = AbstractC167007dF.A0F(viewGroup.getWidth(), (viewGroup.getHeight() - k9y.A01) - k9y.A00);
            Canvas A06 = AbstractC43592JPx.A06(A0F);
            A06.translate(0.0f, -k9y.A02);
            k9y.A01();
            viewGroup.draw(A06);
            View view = k9y.A05;
            if (view != null) {
                view.setVisibility(0);
            }
            CirclePageIndicator circlePageIndicator = k9y.A0B;
            if (circlePageIndicator != null) {
                circlePageIndicator.setVisibility(0);
            }
            View view2 = k9y.A04;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            C121275eQ c121275eQ = new C121275eQ(new CallableC43825JZn(1, A0F, k9y), 1775937301);
            c121275eQ.A00 = k9y.A0A;
            C1GJ.A03(c121275eQ);
        } catch (Exception unused) {
        }
    }

    @Override // X.MO8
    public final void FEH() {
        if (Build.VERSION.SDK_INT < 33) {
            Context context = this.A03;
            if (!AbstractC23451Ch.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C48291LYp c48291LYp = new C48291LYp(0, new CallableC44082Je7(this, 2), this);
                C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                AbstractC43592JPx.A1C((Activity) context, c48291LYp, "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        A00(this);
    }
}
