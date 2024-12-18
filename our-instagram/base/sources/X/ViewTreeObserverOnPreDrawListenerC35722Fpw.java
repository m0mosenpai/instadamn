package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.util.regex.Pattern;

/* renamed from: X.Fpw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC35722Fpw implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ E72 A01;
    public final /* synthetic */ String A02;

    public ViewTreeObserverOnPreDrawListenerC35722Fpw(TextView textView, E72 e72, String str) {
        this.A00 = textView;
        this.A02 = str;
        this.A01 = e72;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.CharSequence] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        TextView textView = this.A00;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        String str = this.A02;
        E72 e72 = this.A01;
        boolean z = e72.A01;
        boolean z2 = e72.A02;
        Context A0L = AbstractC166997dE.A0L(textView);
        Drawable A00 = FVH.A00(A0L, z2);
        if (A00 != null) {
            i = A00.getIntrinsicWidth();
        } else {
            i = 0;
        }
        float measureText = textView.getPaint().measureText(" ");
        Rect rect = new Rect();
        TextPaint paint = textView.getPaint();
        Pattern pattern = AbstractC13670mt.A01;
        paint.getTextBounds(str, 0, str.length(), rect);
        String str2 = str;
        if (z) {
            float f = i;
            str2 = str;
            if (rect.width() + measureText + f > textView.getWidth()) {
                str2 = TextUtils.ellipsize(str, textView.getPaint(), (textView.getWidth() - measureText) - f, TextUtils.TruncateAt.END, false, null);
            }
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str2);
        FVH.A01(A0L, A0H, true, true, z2);
        textView.setText(A0H);
        return true;
    }
}
