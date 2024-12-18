package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.9Td, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Td extends FrameLayout {
    public float A00;
    public InterfaceC25212BDk A01;
    public boolean A02;
    public final float A03;
    public final int A04;
    public final Paint A05;
    public final Path A06;
    public final RectF A07;

    public C9Td(Context context) {
        super(context, null, 0);
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A05 = A0S;
        this.A06 = AbstractC166987dD.A0T();
        this.A07 = AbstractC166987dD.A0X();
        setWillNotDraw(false);
        AbstractC166987dD.A1N(getContext(), A0S, R.color.igds_secondary_button_on_media);
        Resources resources = getResources();
        this.A03 = resources.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) / 2.0f;
        this.A04 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) / 2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        Object obj = this.A01;
        if (obj != null) {
            Path path = this.A06;
            path.reset();
            boolean z = this.A02;
            RectF rectF = this.A07;
            if (z) {
                View view = (View) obj;
                rectF.set(0.0f, this.A00, AbstractC166987dD.A07(view) - this.A00, AbstractC166987dD.A08(view));
            } else {
                float f = this.A00;
                View view2 = (View) obj;
                rectF.set(f, f, AbstractC166987dD.A07(view2), AbstractC166987dD.A08(view2));
            }
            path.setFillType(Path.FillType.INVERSE_WINDING);
            float f2 = this.A04;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            Paint paint = this.A05;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSecondaryMenu(InterfaceC25212BDk interfaceC25212BDk) {
        C14360o3.A0B(interfaceC25212BDk, 0);
        A00(0.0f);
        setIsOnRightSide(false);
        this.A01 = interfaceC25212BDk;
        removeAllViews();
        addView((View) interfaceC25212BDk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(float f) {
        InterfaceC25212BDk interfaceC25212BDk = this.A01;
        if (interfaceC25212BDk != 0 && interfaceC25212BDk.AFq()) {
            setAlpha(f);
            float menuWidth = interfaceC25212BDk.getMenuWidth() * f;
            float menuHeight = interfaceC25212BDk.getMenuHeight() * f;
            float f2 = menuWidth;
            if (menuWidth > menuHeight) {
                f2 = menuHeight;
            }
            float f3 = this.A03 - (f2 / 2.0f);
            this.A00 = f3;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            this.A00 = f3;
            View view = (View) interfaceC25212BDk;
            int i = (int) menuWidth;
            AbstractC13880nE.A0g(view, i);
            int i2 = (int) menuHeight;
            AbstractC13880nE.A0W(view, i2);
            AbstractC13880nE.A0g(this, i);
            AbstractC13880nE.A0W(this, i2);
            interfaceC25212BDk.DWs(f);
            invalidate();
        }
    }

    public final void setIsOnRightSide(boolean z) {
        this.A02 = z;
        InterfaceC25212BDk interfaceC25212BDk = this.A01;
        if (interfaceC25212BDk != null) {
            interfaceC25212BDk.setIsOnRightSide(z);
        }
    }

    public final void setSecondaryMenuBackgroundColor(int i) {
        AbstractC166987dD.A1N(getContext(), this.A05, i);
        invalidate();
    }
}
