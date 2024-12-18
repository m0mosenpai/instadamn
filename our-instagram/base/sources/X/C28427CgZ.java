package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.CgZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28427CgZ {
    public final Context A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final InterfaceC30933Din A06;
    public final String A07;
    public final String A08;
    public final GradientDrawable A09;
    public final View A0A;
    public final View A0B;

    public C28427CgZ(View view, InterfaceC30933Din interfaceC30933Din, String str, String str2) {
        Drawable drawable;
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = interfaceC30933Din;
        this.A00 = view.getContext();
        View A0c = AbstractC166987dD.A0c(view, R.id.option_row);
        this.A0B = A0c;
        View A0c2 = AbstractC166987dD.A0c(view, R.id.option_row_filled);
        this.A0A = A0c2;
        this.A03 = AbstractC25230BEn.A0Q(A0c, R.id.option_row_text);
        this.A02 = AbstractC25230BEn.A0Q(A0c2, R.id.option_row_text_filled);
        TextView A0Q = AbstractC25230BEn.A0Q(A0c, R.id.option_row_vote_percentage);
        this.A05 = A0Q;
        TextView A0Q2 = AbstractC25230BEn.A0Q(A0c2, R.id.option_row_vote_percentage_filled);
        this.A04 = A0Q2;
        Drawable background = A0c2.getBackground();
        if (background != null) {
            drawable = background.mutate();
        } else {
            drawable = null;
        }
        this.A09 = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        A0Q2.setAlpha(0.0f);
        A0Q.setAlpha(0.0f);
    }

    public final void A03(int i) {
        TextView textView = this.A05;
        Context context = this.A00;
        AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A07(context));
        AbstractC166987dD.A1O(context, this.A04, AbstractC53242c7.A0D(context));
        AbstractC166987dD.A1O(context, this.A03, AbstractC53242c7.A07(context));
        AbstractC166987dD.A1O(context, this.A02, AbstractC53242c7.A0D(context));
        A00(1.0f, 0.0f, true);
        View view = this.A01;
        view.setEnabled(true);
        AbstractC13880nE.A0q(view, new D2H(this, (i * view.getWidth()) / 100, 0, context.getColor(AbstractC53242c7.A07(context))));
    }

    public final void A04(int i) {
        A02(this, i, true);
        Context context = this.A00;
        int color = context.getColor(AbstractC53242c7.A07(context));
        View view = this.A01;
        AbstractC13880nE.A0q(view, new D2H(this, 0, (i * view.getWidth()) / 100, color));
    }

    private final void A00(float f, float f2, boolean z) {
        TextView textView = this.A04;
        if (z) {
            textView.setAlpha(f);
            C14360o3.A07(textView.animate().setDuration(350L).alpha(f2));
            TextView textView2 = this.A05;
            textView2.setAlpha(f);
            C14360o3.A07(textView2.animate().setDuration(350L).alpha(f2));
            return;
        }
        textView.setAlpha(1.0f);
        this.A05.setAlpha(1.0f);
    }

    public static final void A01(C28427CgZ c28427CgZ, int i, int i2) {
        GradientDrawable gradientDrawable = c28427CgZ.A09;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(new int[]{i2, i2});
        }
        c28427CgZ.A0A.setClipBounds(new Rect(0, 0, i, c28427CgZ.A01.getHeight()));
    }

    public static final void A02(C28427CgZ c28427CgZ, int i, boolean z) {
        TextView textView = c28427CgZ.A05;
        Integer valueOf = Integer.valueOf(i);
        textView.setText(AbstractC13670mt.A06("%d%%", valueOf));
        Context context = c28427CgZ.A00;
        AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A07(context));
        TextView textView2 = c28427CgZ.A04;
        textView2.setText(AbstractC13670mt.A06("%d%%", valueOf));
        AbstractC166987dD.A1O(context, textView2, AbstractC53242c7.A0D(context));
        AbstractC166987dD.A1O(context, c28427CgZ.A03, AbstractC53242c7.A07(context));
        AbstractC166987dD.A1O(context, c28427CgZ.A02, AbstractC53242c7.A0D(context));
        c28427CgZ.A00(0.0f, 1.0f, z);
        c28427CgZ.A01.setEnabled(false);
    }
}
