package X;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.Mbf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50773Mbf extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ NLH A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C50773Mbf(NLH nlh) {
        this.A00 = nlh;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        NLH nlh = this.A00;
        int i = nlh.A09;
        double d = i - f;
        double d2 = ((500.0d * 1.0d) / (nlh.A01 * 1000)) * nlh.A03;
        double d3 = nlh.A08;
        if (d3 - d < d2) {
            d = d3 - d2;
        }
        int max = (int) Math.max(0.0d, d);
        int i2 = nlh.A02;
        int max2 = Math.max(i2, max);
        if (i > max2) {
            int i3 = i - i2;
            View view = nlh.A0B;
            if (view != null) {
                Drawable background = view.getBackground();
                if (background != null) {
                    if (i3 < background.getIntrinsicWidth() / 2) {
                        max2 = nlh.A02;
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        NLH.A08(nlh, max2);
        ClipInfo clipInfo = nlh.A0H;
        if (clipInfo != null) {
            clipInfo.A07 = (int) NLH.A02(nlh);
            ClipInfo clipInfo2 = nlh.A0H;
            if (clipInfo2 != null) {
                clipInfo2.A0H = true;
                nlh.A0I = true;
                return true;
            }
        }
        C14360o3.A0F("clipInfo");
        throw C00O.createAndThrow();
    }
}
