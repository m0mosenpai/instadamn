package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Wmw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71041Wmw implements InterfaceC150976qx {
    public final int A00;
    public final Object A01;

    public C71041Wmw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        TextView textView;
        String str;
        float alpha;
        int i;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        float f2;
        switch (this.A00) {
            case 0:
                C70185WFo c70185WFo = (C70185WFo) this.A01;
                textView = c70185WFo.A03;
                str = "instructionTextView";
                if (textView != null) {
                    alpha = textView.getAlpha();
                    i = c70185WFo.A00;
                    C13680mu.A04(textView, (int) (alpha * i));
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = (ViewOnKeyListenerC67976V4r) this.A01;
                int intValue = viewOnKeyListenerC67976V4r.A09.intValue();
                str = "rootView";
                if (intValue != 1) {
                    if (intValue == 2 && !viewOnKeyListenerC67976V4r.A0U) {
                        touchInterceptorFrameLayout = viewOnKeyListenerC67976V4r.A07;
                        if (touchInterceptorFrameLayout != null) {
                            f2 = (1.0f - f) * 256.0f;
                            touchInterceptorFrameLayout.setBackgroundColor(((int) f2) << 24);
                            return;
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    return;
                }
                if (!viewOnKeyListenerC67976V4r.A0U) {
                    touchInterceptorFrameLayout = viewOnKeyListenerC67976V4r.A07;
                    if (touchInterceptorFrameLayout != null) {
                        f2 = f * 256.0f;
                        touchInterceptorFrameLayout.setBackgroundColor(((int) f2) << 24);
                        return;
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return;
            case 2:
                textView = (TextView) this.A01;
                alpha = textView.getAlpha();
                i = Color.alpha(textView.getShadowColor());
                C13680mu.A04(textView, (int) (alpha * i));
                return;
            default:
                if (f > 0.6f) {
                    WXc wXc = ((RunnableC71632Wxe) this.A01).A06;
                    if (!wXc.A09) {
                        wXc.A09 = true;
                        C69338Vlk c69338Vlk = wXc.A03;
                        if (c69338Vlk == null) {
                            ViewGroup viewGroup = wXc.A00;
                            viewGroup.getClass();
                            c69338Vlk = new C69338Vlk(viewGroup, new int[]{R.drawable.confetti_glyph, R.drawable.confetti_party});
                            Context context = c69338Vlk.A02.getContext();
                            float A00 = AbstractC13880nE.A00(context, 0.06f);
                            float A002 = AbstractC13880nE.A00(context, 0.1f);
                            ArrayList arrayList = c69338Vlk.A03;
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C69466Vnp c69466Vnp = (C69466Vnp) it.next();
                                c69466Vnp.A05 = A00;
                                c69466Vnp.A04 = A002;
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                C69466Vnp c69466Vnp2 = (C69466Vnp) it2.next();
                                double A003 = AbstractC13880nE.A00(context, 7.0E-6f);
                                double d = (float) ((90.0d * 3.141592653589793d) / 180.0d);
                                c69466Vnp2.A00 = (float) (Math.cos(d) * A003);
                                c69466Vnp2.A01 = (float) (A003 * Math.sin(d));
                            }
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                ((C69466Vnp) it3.next()).A09 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
                            }
                            wXc.A03 = c69338Vlk;
                        }
                        ViewGroup viewGroup2 = wXc.A00;
                        viewGroup2.getClass();
                        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                        int[] iArr = new int[2];
                        viewGroup2.getLocationInWindow(iArr);
                        int width = iArr[0] + (viewGroup2.getWidth() / 2);
                        int[] iArr2 = c69338Vlk.A05;
                        int i2 = width - iArr2[0];
                        int height = (iArr[1] + (viewGroup2.getHeight() / 2)) - iArr2[1];
                        ArrayList arrayList2 = c69338Vlk.A03;
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            C69466Vnp c69466Vnp3 = (C69466Vnp) it4.next();
                            Random random = c69338Vlk.A04;
                            Bitmap bitmap = c69466Vnp3.A0C;
                            c69466Vnp3.A0A = i2 - (bitmap.getWidth() / 2);
                            int height2 = height - (bitmap.getHeight() / 2);
                            c69466Vnp3.A0B = height2;
                            c69466Vnp3.A02 = c69466Vnp3.A0A;
                            c69466Vnp3.A03 = height2;
                            c69466Vnp3.A08 = 255;
                            float nextFloat = random.nextFloat();
                            float f3 = c69466Vnp3.A04;
                            float f4 = c69466Vnp3.A05;
                            double d2 = (nextFloat * (f3 - f4)) + f4;
                            double nextInt = (float) ((random.nextInt(360) * 3.141592653589793d) / 180.0d);
                            c69466Vnp3.A06 = (float) (Math.cos(nextInt) * d2);
                            c69466Vnp3.A07 = (float) (d2 * Math.sin(nextInt));
                        }
                        ViewGroup viewGroup3 = c69338Vlk.A02;
                        UAK uak = new UAK(viewGroup3.getContext(), c69338Vlk, arrayList2);
                        c69338Vlk.A01 = uak;
                        viewGroup3.addView(uak);
                        ValueAnimator ofInt = ValueAnimator.ofInt(0, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                        c69338Vlk.A00 = ofInt;
                        ofInt.setDuration(2000L);
                        C65759TtZ.A00(c69338Vlk.A00, c69338Vlk, 13);
                        c69338Vlk.A00.addListener(new C70203WGv(c69338Vlk, 3));
                        c69338Vlk.A00.setInterpolator(decelerateInterpolator);
                        c69338Vlk.A00.start();
                        ViewGroup viewGroup4 = wXc.A00;
                        viewGroup4.getClass();
                        viewGroup4.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
