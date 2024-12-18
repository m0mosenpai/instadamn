package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes11.dex */
public final class WFJ {
    public static final int A0A;
    public static final int A0B = Color.parseColor("#33FF0000");
    public static final int A0C;
    public static final int A0D;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A04;
    public final View A06;
    public final String A09;
    public int A03 = -1;
    public final Runnable A07 = new RunnableC71320Wro(this);
    public final Runnable A08 = new RunnableC71321Wrp(this);
    public final ColorDrawable A05 = new ColorDrawable(A0C);

    static {
        int parseColor = Color.parseColor("#330000FF");
        A0A = parseColor;
        A0C = Color.parseColor("#3300FF00");
        A0D = parseColor;
    }

    public static void A01(View view, AnonymousClass303 anonymousClass303, int i, boolean z) {
        if (z) {
            int A00 = anonymousClass303.A00(i);
            WFJ wfj = new WFJ(view, anonymousClass303.A02(A00), A0A);
            if (view.getTag(947501445) != null) {
                wfj.A01 = true;
            }
            view.setTag(-4848503, wfj);
        }
        A00(view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.U8G, android.graphics.drawable.Drawable] */
    public static void A02(WFJ wfj) {
        String str;
        String str2 = wfj.A09;
        int i = wfj.A03;
        if (i != -1) {
            str = AnonymousClass001.A0O(" ", i);
        } else {
            str = "";
        }
        SpannableString spannableString = new SpannableString(AnonymousClass001.A0R(str2, str));
        spannableString.setSpan(new BackgroundColorSpan(-1140850689), 0, spannableString.length(), 17);
        View view = wfj.A06;
        Context context = view.getContext();
        int A07 = AbstractC13880nE.A07(context);
        view.getOverlay().clear();
        ViewOverlay overlay = view.getOverlay();
        ?? drawable = new Drawable();
        TextPaint textPaint = new TextPaint();
        textPaint.density = AbstractC65702TsY.A00(context);
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        textPaint.setColor(-65536);
        textPaint.setTextSize(48.0f);
        drawable.A00 = new StaticLayout(spannableString, textPaint, A07, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        overlay.add(drawable);
    }

    public WFJ(View view, String str, int i) {
        this.A06 = view;
        this.A04 = i;
        this.A09 = str;
        if (AbstractC65482xk.A00()) {
            view.post(new Runnable() { // from class: X.Wrn
                @Override // java.lang.Runnable
                public final void run() {
                    WFJ.A02(WFJ.this);
                }
            });
        }
    }

    public static void A00(View view, int i) {
        int i2;
        View view2;
        WFJ wfj = (WFJ) view.getTag(-4848503);
        if (wfj != null) {
            if (AbstractC65482xk.A00()) {
                wfj.A03 = i;
                A02(wfj);
            }
            if (AbstractC65482xk.A01() || C2US.sDebugHeadViewBinds) {
                if (wfj.A02) {
                    ColorDrawable colorDrawable = wfj.A05;
                    int color = colorDrawable.getColor();
                    int A02 = AbstractC167017dG.A02(color, Math.min(Color.alpha(color) * 2, AbstractC62862SUj.MAX_FACTORIAL));
                    view2 = wfj.A06;
                    view2.removeCallbacks(wfj.A07);
                    colorDrawable.setColor(A02);
                } else {
                    if (wfj.A00) {
                        i2 = wfj.A04;
                    } else if (wfj.A01) {
                        wfj.A01 = false;
                        i2 = A0D;
                    } else {
                        i2 = A0C;
                    }
                    wfj.A05.setColor(i2);
                    view2 = wfj.A06;
                }
                view2.post(wfj.A08);
            }
        }
    }
}
