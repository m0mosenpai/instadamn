package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Scroller;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class W9A {
    public C68829Vck A00;
    public Runnable A02;
    public boolean A03;
    public int A04;
    public final View A05;
    public final Scroller A06;
    public final C66303U8b A07;
    public final C70993Wm9 A09;
    public final Runnable A08 = new RunnableC71364WsZ(this);
    public Integer A01 = C05F.A00;

    public static final void A00(W9A w9a, int i) {
        C66303U8b c66303U8b = w9a.A07;
        c66303U8b.A04(i);
        int i2 = c66303U8b.A04;
        if (i2 != w9a.A04) {
            C68829Vck c68829Vck = w9a.A00;
            if (c68829Vck != null) {
                boolean z = w9a.A03;
                C24026AlJ c24026AlJ = c68829Vck.A00;
                C70993Wm9 c70993Wm9 = c24026AlJ.A01;
                if (c70993Wm9 != null) {
                    if (i2 >= 0 && i2 < c70993Wm9.Bd3()) {
                        if (z) {
                            C70993Wm9 c70993Wm92 = c24026AlJ.A01;
                            if (c70993Wm92 != null) {
                                c24026AlJ.A06.Dj7(c24026AlJ, c70993Wm92.Bzm(i2));
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    } else {
                        throw AbstractC31172DnG.A0u();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            w9a.A04 = i2;
        }
    }

    public static final void A01(W9A w9a, int i, boolean z) {
        if (!w9a.A03) {
            if (i >= 0 && i < w9a.A09.Bd3()) {
                C66303U8b c66303U8b = w9a.A07;
                int A03 = c66303U8b.A03(i);
                if (z) {
                    int i2 = A03 - c66303U8b.A0A;
                    Scroller scroller = w9a.A06;
                    scroller.forceFinished(true);
                    scroller.startScroll(0, c66303U8b.A0A, 0, i2);
                    w9a.A01 = C05F.A0C;
                    View view = w9a.A05;
                    Runnable runnable = w9a.A08;
                    view.removeCallbacks(runnable);
                    view.post(runnable);
                    return;
                }
                c66303U8b.A04(A03);
                return;
            }
            throw AbstractC31172DnG.A0u();
        }
    }

    public W9A(View view, C70993Wm9 c70993Wm9, C68829Vck c68829Vck, boolean z) {
        this.A05 = view;
        this.A09 = c70993Wm9;
        this.A00 = c68829Vck;
        Context context = view.getContext();
        C66303U8b c66303U8b = new C66303U8b(c70993Wm9, r1.getDimensionPixelSize(R.dimen.avatar_search_sticker_tray_text_size), context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material), false);
        this.A07 = c66303U8b;
        c66303U8b.A00 = AbstractC13600mm.A00(0.3f, 0.0f, 1.0f);
        c66303U8b.invalidateSelf();
        if (z) {
            c66303U8b.A05(AbstractC167007dF.A09(context, R.attr.igdsPrimaryText));
        }
        view.setBackground(c66303U8b);
        AbstractC13880nE.A0q(view, new RunnableC71363WsY(this));
        this.A04 = c66303U8b.A04;
        this.A06 = new Scroller(context);
        view.setOnTouchListener(new ViewOnTouchListenerC70251WNw(9, new GestureDetector(context, new UMB(this, 2)), this));
    }
}
