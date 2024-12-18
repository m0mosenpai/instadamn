package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.OWb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55014OWb {
    public String A00;
    public boolean A01;
    public long A02;
    public String A03;
    public boolean A04;
    public final FrameLayout A05;
    public final int A06;
    public final C170797jW A07;
    public final C3BD A08;
    public final Runnable A09 = new PNI(this);
    public final String A0A;

    public static void A00(C55014OWb c55014OWb) {
        C170797jW c170797jW;
        C3BD c3bd = c55014OWb.A08;
        if (c3bd.A02 != null) {
            if (c55014OWb.A01) {
                String str = c55014OWb.A00;
                if (str == null) {
                    str = c55014OWb.A03;
                }
                TextView textView = c3bd.A07;
                if (textView != null) {
                    textView.setText(str);
                }
                c170797jW = null;
            } else {
                String str2 = c55014OWb.A0A;
                TextView textView2 = c3bd.A07;
                if (textView2 != null) {
                    textView2.setText(str2);
                }
                c170797jW = c55014OWb.A07;
            }
            c3bd.A04(c170797jW);
        }
    }

    public final void A01() {
        if (this.A04) {
            long currentTimeMillis = System.currentTimeMillis() - this.A02;
            FrameLayout frameLayout = this.A05;
            Runnable runnable = this.A09;
            frameLayout.removeCallbacks(runnable);
            if (currentTimeMillis <= 1000) {
                frameLayout.postDelayed(runnable, 1000 - currentTimeMillis);
                return;
            }
            C3BD c3bd = this.A08;
            c3bd.A05(c3bd.A04);
            C170797jW c170797jW = this.A07;
            if (c170797jW.isRunning()) {
                c170797jW.stop();
            }
            this.A04 = false;
        }
    }

    public final void A02() {
        C3BD c3bd = this.A08;
        if (!AbstractC167007dF.A1W(c3bd.A02)) {
            FrameLayout frameLayout = this.A05;
            c3bd.A07(frameLayout);
            c3bd.A02(this.A06 | 1);
            c3bd.A04(this.A07);
            ImageView imageView = c3bd.A05;
            C18C.A07(imageView, "accessoryView is null");
            int round = Math.round(AbstractC13880nE.A00(frameLayout.getContext(), 24.5f));
            AbstractC13880nE.A0h(imageView, round, round);
            A00(this);
        }
        c3bd.A06(c3bd.A03);
        this.A04 = true;
        this.A02 = System.currentTimeMillis();
        C170797jW c170797jW = this.A07;
        if (!c170797jW.isRunning()) {
            c170797jW.start();
        }
    }

    public C55014OWb(View.OnClickListener onClickListener, FrameLayout frameLayout, int i) {
        this.A05 = frameLayout;
        this.A06 = i;
        Context context = frameLayout.getContext();
        Resources resources = context.getResources();
        this.A00 = this.A05.getResources().getString(2131973061);
        this.A03 = frameLayout.getResources().getString(2131973061);
        String string = resources.getString(2131965663);
        this.A0A = string;
        if (onClickListener != null) {
            C3BD c3bd = new C3BD(context, ViewOnClickListenerC55465OkK.A00(this, onClickListener, 62), string, R.style.map_search_pill_style, false);
            this.A08 = c3bd;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.fbpay_ui_text_button_width);
            if (dimensionPixelSize != c3bd.A00) {
                c3bd.A00 = dimensionPixelSize;
                C3BD.A00(c3bd.A02, c3bd);
            }
        } else {
            this.A08 = new C3BD(context, null, string, R.style.map_search_pill_style, true);
        }
        C170797jW c170797jW = new C170797jW(context);
        this.A07 = c170797jW;
        c170797jW.A00(AbstractC13880nE.A00(context, 2.5f));
        c170797jW.A02(Paint.Cap.ROUND);
        AbstractC25231BEo.A0x(context, c170797jW, AbstractC53242c7.A08(context));
    }
}
