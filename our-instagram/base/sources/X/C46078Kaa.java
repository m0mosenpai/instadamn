package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Kaa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46078Kaa extends AbstractC50787Mbx {
    public final C44348Jin A00;

    public C46078Kaa(Context context) {
        super(context, null, 0);
        Resources resources = getResources();
        this.A00 = new C44348Jin(AbstractC166997dE.A07(resources), resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material), context.getColor(R.color.gradient_dark), AbstractC166997dE.A03(context));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C44348Jin c44348Jin = this.A00;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(AbstractC166997dE.A0H(c44348Jin), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(AbstractC166997dE.A0G(c44348Jin), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
    }

    @Override // X.AbstractC50787Mbx
    public void setProgress(String str) {
        this.A00.A00 = str;
        invalidate();
    }
}
