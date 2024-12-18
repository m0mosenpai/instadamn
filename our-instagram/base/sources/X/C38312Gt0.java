package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.R;
import java.text.NumberFormat;

/* renamed from: X.Gt0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38312Gt0 extends RelativeLayout {
    public Paint A00;
    public Paint A01;
    public TextView A02;
    public TextView A03;
    public int A04;
    public C41101IHs A05;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        canvas.drawLine(getLeftBound(), getPositionLineY(), getLeftBound() + getBarFullWidthPx(), getPositionLineY(), this.A00);
        canvas.drawLine(getLeftBound(), getPositionLineY(), getLeftBound() + getResultBarEndPositionX(), getPositionLineY(), this.A01);
    }

    private final int getPositionLineY() {
        return this.A03.getBottom() + getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
    }

    private final int getResponders() {
        C41101IHs c41101IHs = this.A05;
        if (c41101IHs != null) {
            return c41101IHs.A00;
        }
        return 0;
    }

    public final void setAnswer(C41101IHs c41101IHs) {
        String str;
        this.A05 = c41101IHs;
        TextView textView = this.A03;
        if (c41101IHs == null || (str = c41101IHs.A01) == null) {
            str = "";
        }
        textView.setText(str);
    }

    public final void setTotalQuestionResponders(int i) {
        this.A04 = i;
        TextView textView = this.A02;
        textView.setText(getPercentageRounded());
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        C14360o3.A0C(layoutParams, MSV.A00(58));
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(8, this.A03.getId());
        textView.setLayoutParams(layoutParams2);
    }

    private final int getBarFullWidthPx() {
        return getWidth() - (getLeftBound() * 2);
    }

    private final int getLeftBound() {
        return getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
    }

    private final String getPercentageRounded() {
        String format = NumberFormat.getPercentInstance().format(getResponders() / this.A04);
        C14360o3.A07(format);
        return format;
    }

    private final int getResultBarEndPositionX() {
        return Math.round((getBarFullWidthPx() * getResponders()) / this.A04);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-144233644);
        super.onSizeChanged(i, i2, i3, i4);
        setMinimumHeight(i2 + getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material));
        C0f9.A0D(1542421653, A06);
    }
}
