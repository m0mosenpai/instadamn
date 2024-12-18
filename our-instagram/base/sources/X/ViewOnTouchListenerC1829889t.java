package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.89t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC1829889t implements View.OnTouchListener {
    public float A00;
    public float A01;
    public Bitmap A02;
    public FrameLayout A03;
    public ImageView A04;
    public boolean A05;
    public int A06;
    public final View A07;
    public final C1830089v A08;
    public final List A09;
    public final boolean A0A;
    public final ViewStub A0B;
    public final FrameLayout A0C;
    public final C1N8 A0D;
    public final C008102v A0E;
    public final C57012jc A0F;
    public final EyedropperColorPickerTool A0G;

    public ViewOnTouchListenerC1829889t(View view, ViewStub viewStub, FrameLayout frameLayout, C1N8 c1n8, C57012jc c57012jc, EyedropperColorPickerTool eyedropperColorPickerTool, boolean z) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(viewStub, 4);
        C14360o3.A0B(eyedropperColorPickerTool, 5);
        this.A07 = view;
        this.A0C = frameLayout;
        this.A0F = c57012jc;
        this.A0B = viewStub;
        this.A0G = eyedropperColorPickerTool;
        this.A0D = c1n8;
        this.A0A = z;
        this.A09 = new ArrayList();
        this.A06 = -1;
        Resources resources = view.getResources();
        C008102v c008102v = new C008102v(view.getContext(), new C5SZ() { // from class: X.89u
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                float f;
                float f2;
                C14360o3.A0B(motionEvent, 0);
                ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = ViewOnTouchListenerC1829889t.this;
                viewOnTouchListenerC1829889t.A05 = true;
                float x = motionEvent.getX();
                ImageView imageView = viewOnTouchListenerC1829889t.A04;
                if (imageView != null) {
                    float x2 = imageView.getX();
                    C1830089v c1830089v = viewOnTouchListenerC1829889t.A08;
                    f = x2 + (c1830089v.A05 / 2) + c1830089v.A04 + c1830089v.A02;
                } else {
                    f = 0.0f;
                }
                float f3 = x - f;
                float y = motionEvent.getY();
                ImageView imageView2 = viewOnTouchListenerC1829889t.A04;
                if (imageView2 != null) {
                    f2 = imageView2.getY() + (r2.A03 - viewOnTouchListenerC1829889t.A08.A01);
                } else {
                    f2 = 0.0f;
                }
                viewOnTouchListenerC1829889t.A00 = 0.0f;
                viewOnTouchListenerC1829889t.A01 = 0.0f;
                ViewOnTouchListenerC1829889t.A02(viewOnTouchListenerC1829889t, f3);
                ViewOnTouchListenerC1829889t.A03(viewOnTouchListenerC1829889t, y - f2);
                ViewOnTouchListenerC1829889t.A01(viewOnTouchListenerC1829889t);
                List list = viewOnTouchListenerC1829889t.A09;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC185958Mp) it.next()).DFM();
                    arrayList.add(C0eB.A00);
                }
                return true;
            }

            @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = ViewOnTouchListenerC1829889t.this;
                if (viewOnTouchListenerC1829889t.A05) {
                    viewOnTouchListenerC1829889t.A05 = false;
                    return true;
                }
                ViewOnTouchListenerC1829889t.A02(viewOnTouchListenerC1829889t, viewOnTouchListenerC1829889t.A00 - f);
                ViewOnTouchListenerC1829889t.A03(viewOnTouchListenerC1829889t, viewOnTouchListenerC1829889t.A01 - f2);
                ViewOnTouchListenerC1829889t.A01(viewOnTouchListenerC1829889t);
                return true;
            }
        }, new Handler(Looper.getMainLooper()));
        this.A0E = c008102v;
        c008102v.A00.setIsLongpressEnabled(false);
        this.A08 = new C1830089v(resources);
        C0fQ.A00(new View.OnClickListener() { // from class: X.89w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int A05 = C0f9.A05(-1225267755);
                ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = ViewOnTouchListenerC1829889t.this;
                FrameLayout frameLayout2 = viewOnTouchListenerC1829889t.A03;
                if (frameLayout2 != null && frameLayout2.getVisibility() == 0) {
                    viewOnTouchListenerC1829889t.A04();
                } else {
                    viewOnTouchListenerC1829889t.A05();
                }
                C0f9.A0C(-267921456, A05);
            }
        }, eyedropperColorPickerTool);
    }

    public final void A06(InterfaceC185958Mp interfaceC185958Mp) {
        C14360o3.A0B(interfaceC185958Mp, 0);
        List list = this.A09;
        if (!list.contains(interfaceC185958Mp)) {
            list.add(interfaceC185958Mp);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            List list = this.A09;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC185958Mp) it.next()).DFK(this.A06);
                arrayList.add(C0eB.A00);
            }
            A00();
        }
        this.A0E.A00.onTouchEvent(motionEvent);
        return true;
    }

    private final void A00() {
        FrameLayout frameLayout = this.A03;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            FrameLayout frameLayout2 = this.A03;
            if (frameLayout2 != null) {
                C150956qv.A08(new View[]{frameLayout2}, true);
            }
            ((C55982hj) this.A0G.A04.getValue()).A04();
        }
    }

    public static final void A01(ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t) {
        float f;
        float f2;
        float f3;
        Bitmap bitmap = viewOnTouchListenerC1829889t.A02;
        if (bitmap != null) {
            ImageView imageView = viewOnTouchListenerC1829889t.A04;
            if (imageView != null) {
                float x = imageView.getX();
                C1830089v c1830089v = viewOnTouchListenerC1829889t.A08;
                f = x + (c1830089v.A05 / 2) + c1830089v.A04 + c1830089v.A02;
            } else {
                f = 0.0f;
            }
            float width = bitmap.getWidth() - 1;
            if (f > width) {
                f = width;
            }
            float f4 = 0.0f;
            if (0.0f < f) {
                f4 = f;
            }
            ImageView imageView2 = viewOnTouchListenerC1829889t.A04;
            if (imageView2 != null) {
                f2 = imageView2.getY() + (r2.A03 - viewOnTouchListenerC1829889t.A08.A01);
            } else {
                f2 = 0.0f;
            }
            if (viewOnTouchListenerC1829889t.A0A) {
                f3 = viewOnTouchListenerC1829889t.A07.getY();
            } else {
                f3 = 0.0f;
            }
            float f5 = f2 - f3;
            float height = bitmap.getHeight() - 1;
            if (f5 > height) {
                f5 = height;
            }
            float f6 = 0.0f;
            if (0.0f < f5) {
                f6 = f5;
            }
            int pixel = bitmap.getPixel((int) f4, (int) f6);
            viewOnTouchListenerC1829889t.A06 = pixel;
            C1830089v c1830089v2 = viewOnTouchListenerC1829889t.A08;
            c1830089v2.A07.setColor(pixel);
            c1830089v2.invalidateSelf();
            viewOnTouchListenerC1829889t.A0G.setColor(viewOnTouchListenerC1829889t.A06);
            List list = viewOnTouchListenerC1829889t.A09;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC185958Mp) it.next()).DFN(viewOnTouchListenerC1829889t.A06);
                arrayList.add(C0eB.A00);
            }
        }
    }

    public static final void A02(ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t, float f) {
        FrameLayout frameLayout = viewOnTouchListenerC1829889t.A03;
        if (frameLayout != null) {
            float f2 = (-frameLayout.getWidth()) / 2;
            float width = frameLayout.getWidth() / 2;
            if (f > width) {
                f = width;
            }
            if (f2 < f) {
                f2 = f;
            }
            viewOnTouchListenerC1829889t.A00 = f2;
            ImageView imageView = viewOnTouchListenerC1829889t.A04;
            if (imageView != null) {
                imageView.setTranslationX(f2);
            }
            ImageView imageView2 = viewOnTouchListenerC1829889t.A04;
            if (imageView2 != null) {
                imageView2.setTranslationY(viewOnTouchListenerC1829889t.A01);
            }
        }
    }

    public static final void A03(ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t, float f) {
        FrameLayout frameLayout = viewOnTouchListenerC1829889t.A03;
        if (frameLayout != null) {
            float f2 = (-frameLayout.getHeight()) / 2;
            C1830089v c1830089v = viewOnTouchListenerC1829889t.A08;
            float f3 = c1830089v.A03 - c1830089v.A01;
            float intrinsicHeight = c1830089v.getIntrinsicHeight() / 2;
            float f4 = (f2 - f3) + intrinsicHeight;
            float height = ((frameLayout.getHeight() / 2) - f3) + intrinsicHeight;
            if (f > height) {
                f = height;
            }
            if (f4 < f) {
                f4 = f;
            }
            viewOnTouchListenerC1829889t.A01 = f4;
            ImageView imageView = viewOnTouchListenerC1829889t.A04;
            if (imageView != null) {
                imageView.setTranslationX(viewOnTouchListenerC1829889t.A00);
            }
            ImageView imageView2 = viewOnTouchListenerC1829889t.A04;
            if (imageView2 != null) {
                imageView2.setTranslationY(viewOnTouchListenerC1829889t.A01);
            }
        }
    }

    public final void A04() {
        FrameLayout frameLayout = this.A03;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            A00();
            List list = this.A09;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC185958Mp) it.next()).DFI();
                arrayList.add(C0eB.A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r8 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1829889t.A05():void");
    }
}
