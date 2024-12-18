package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class KKG extends IgFrameLayout {
    public JWE A00;
    public final Context A01;
    public final C45064Jwt A02;

    private final void setIcon(IgFrameLayout igFrameLayout) {
        TextView textView;
        Context context;
        Drawable A02;
        C45064Jwt c45064Jwt = this.A02;
        String str = c45064Jwt.A06;
        if (str != null) {
            View childAt = igFrameLayout.getChildAt(0);
            if ((childAt instanceof IgTextView) && (textView = (TextView) childAt) != null && (A02 = AbstractC65877Tvg.A02((context = this.A01), str)) != null) {
                AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, A02, context.getColor(c45064Jwt.A01));
                if (c45064Jwt.A08) {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A02, (Drawable) null);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(A02, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                textView.setCompoundDrawablePadding(c45064Jwt.A02);
            }
        }
    }

    public KKG(Context context, C45064Jwt c45064Jwt) {
        super(context);
        IgFrameLayout igFrameLayout;
        TextView textView;
        this.A01 = context;
        this.A02 = c45064Jwt;
        JWE jwe = new JWE(context);
        C45064Jwt c45064Jwt2 = this.A02;
        jwe.setLabel(c45064Jwt2.A07);
        View childAt = jwe.getChildAt(0);
        if ((childAt instanceof IgFrameLayout) && (igFrameLayout = (IgFrameLayout) childAt) != null) {
            Drawable drawable = context.getDrawable(c45064Jwt2.A00);
            RectF rectF = AbstractC13880nE.A01;
            igFrameLayout.setBackground(drawable);
            Integer num = c45064Jwt2.A05;
            if (num != null) {
                AbstractC13880nE.A0g(igFrameLayout, num.intValue());
            }
            AbstractC13880nE.A0k(igFrameLayout, 0, 0, 0, 0);
            AbstractC13880nE.A0e(igFrameLayout, 0);
            AbstractC13880nE.A0V(igFrameLayout, c45064Jwt2.A03);
            View childAt2 = igFrameLayout.getChildAt(0);
            if ((childAt2 instanceof IgTextView) && (textView = (TextView) childAt2) != null) {
                textView.setTextAppearance(c45064Jwt2.A04);
                textView.setGravity(16);
            }
            setIcon(igFrameLayout);
        }
        this.A00 = jwe;
        addView(jwe);
    }
}
