package X;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.Mbg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50774Mbg extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ NLH A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C50774Mbg(NLH nlh) {
        this.A00 = nlh;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C9KW c9kw;
        NLH nlh = this.A00;
        double d = nlh.A08 - f;
        double d2 = ((500.0d * 1.0d) / (nlh.A01 * 1000)) * nlh.A03;
        double d3 = nlh.A09;
        if (d - d3 < d2) {
            d = d3 + d2;
        }
        int min = (int) Math.min(d, nlh.A02 + NLH.A00(nlh));
        int i = nlh.A03 + nlh.A02;
        int min2 = Math.min(min, i);
        if (nlh.A08 < min2) {
            int i2 = i - min2;
            View view = nlh.A0C;
            if (view != null) {
                Drawable background = view.getBackground();
                if (background != null) {
                    if (i2 < background.getIntrinsicWidth() / 2) {
                        min2 = nlh.A03 + nlh.A02;
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        NLH.A07(nlh, min2);
        ClipInfo clipInfo = nlh.A0H;
        if (clipInfo != null) {
            clipInfo.A05 = (int) NLH.A01(nlh);
            ClipInfo clipInfo2 = nlh.A0H;
            if (clipInfo2 != null) {
                clipInfo2.A0H = true;
                C9KJ c9kj = nlh.A0G;
                if (c9kj != null && (c9kw = c9kj.A08) != null) {
                    c9kw.A0B();
                }
                nlh.A0I = true;
                return true;
            }
        }
        C14360o3.A0F("clipInfo");
        throw C00O.createAndThrow();
    }
}
