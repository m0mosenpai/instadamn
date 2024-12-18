package com.instagram.creation.video.ui;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.C00O;
import X.C05F;
import X.C14360o3;
import X.C54403O2j;
import X.C9KJ;
import X.C9KW;
import X.KB4;
import X.NLH;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes9.dex */
public class FilmstripScrollView extends HorizontalScrollView {
    public C54403O2j A00;
    public boolean A01;

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        C9KW c9kw;
        Integer num;
        C54403O2j c54403O2j = this.A00;
        if (c54403O2j != null) {
            int i5 = i - i3;
            NLH nlh = c54403O2j.A00;
            if (((KB4) nlh).A07 != null) {
                if (i5 >= 0) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                NLH.A09(nlh, num);
            }
            if (!AbstractC31172DnG.A1a(AbstractC166987dD.A0x(nlh.A0A()), "import_scroll_education")) {
                AbstractC31177DnL.A1N(AbstractC166987dD.A0x(nlh.A0A()), "import_scroll_education", true);
            }
            ClipInfo clipInfo = nlh.A0H;
            if (clipInfo != null) {
                FilmstripScrollView filmstripScrollView = nlh.A0F;
                if (filmstripScrollView != null) {
                    clipInfo.A08 = filmstripScrollView.getScrollX();
                    ClipInfo clipInfo2 = nlh.A0H;
                    if (clipInfo2 != null) {
                        clipInfo2.A07 = (int) NLH.A02(nlh);
                        ClipInfo clipInfo3 = nlh.A0H;
                        if (clipInfo3 != null) {
                            clipInfo3.A05 = (int) NLH.A01(nlh);
                            ClipInfo clipInfo4 = nlh.A0H;
                            if (clipInfo4 != null) {
                                clipInfo4.A0H = true;
                                C9KJ c9kj = nlh.A0G;
                                if (c9kj != null && (c9kw = c9kj.A08) != null) {
                                    c9kw.A0C();
                                }
                            }
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            C14360o3.A0F("clipInfo");
            throw C00O.createAndThrow();
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r1 != 3) goto L10;
     */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = -1028381742(0xffffffffc2b423d2, float:-90.06996)
            int r3 = X.C0f9.A05(r0)
            int r1 = r5.getAction()
            r2 = 0
            if (r1 == 0) goto L5d
            r2 = 1
            if (r1 == r2) goto L22
            r0 = 2
            if (r1 == r0) goto L49
            r0 = 3
            if (r1 == r0) goto L22
        L17:
            boolean r1 = super.onTouchEvent(r5)
            r0 = -512609737(0xffffffffe1723237, float:-2.7923315E20)
            X.C0f9.A0C(r0, r3)
            return r1
        L22:
            boolean r0 = r4.A01
            if (r0 == 0) goto L17
            X.O2j r0 = r4.A00
            if (r0 == 0) goto L17
            X.NLH r2 = r0.A00
            android.view.View r0 = r2.A0A
            if (r0 == 0) goto L33
            r0.clearAnimation()
        L33:
            android.view.View r1 = r2.A0A
            if (r1 == 0) goto L17
            android.view.animation.Animation r0 = r2.A0D
            if (r0 != 0) goto L45
            java.lang.String r0 = "playIndicatorFadeOutAnimation"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L45:
            r1.startAnimation(r0)
            goto L17
        L49:
            boolean r0 = r4.A01
            if (r0 != 0) goto L17
            X.O2j r0 = r4.A00
            if (r0 == 0) goto L17
            X.NLH r1 = r0.A00
            X.9KJ r0 = r1.A0G
            if (r0 == 0) goto L60
            r0.A09(r2)
            X.NLH.A06(r1)
        L5d:
            r4.A01 = r2
            goto L17
        L60:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.video.ui.FilmstripScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public FilmstripScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FilmstripScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilmstripScrollView(Context context) {
        super(context);
    }
}
