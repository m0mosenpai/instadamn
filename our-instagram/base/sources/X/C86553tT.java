package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3tT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86553tT {
    public static final C86553tT A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r5 <= 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(final X.C9C6 r2, X.C86043sb r3, final X.C75113Zb r4, int r5) {
        /*
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            if (r3 == 0) goto L26
            if (r2 == 0) goto L26
            android.view.View r1 = r3.A00
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L12
            r0.height = r5
        L12:
            boolean r0 = r2.A04
            if (r0 == 0) goto L19
            r0 = 0
            if (r5 > 0) goto L1b
        L19:
            r0 = 8
        L1b:
            r1.setVisibility(r0)
            X.3tU r0 = new X.3tU
            r0.<init>()
            r1.setOnTouchListener(r0)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86553tT.A00(X.9C6, X.3sb, X.3Zb, int):void");
    }

    public final boolean A01(MotionEvent motionEvent, View view, C9C6 c9c6, C75113Zb c75113Zb) {
        Integer num;
        View view2;
        View view3;
        View findViewWithTag;
        C14360o3.A0B(c9c6, 0);
        C14360o3.A0B(c75113Zb, 1);
        Integer num2 = null;
        if (Boolean.valueOf(C18U.A06(C06090Tz.A05, (AbstractC12990ll) c9c6.A02, 36317204082398136L)).booleanValue()) {
            Object parent = view.getParent();
            if ((parent instanceof View) && (view2 = (View) parent) != null && (view2.getParent() instanceof View)) {
                Object parent2 = view2.getParent();
                if ((parent2 instanceof View) && (view3 = (View) parent2) != null && (findViewWithTag = view3.findViewWithTag("audio_toggle_button")) != null) {
                    int[] iArr = new int[2];
                    findViewWithTag.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int width = findViewWithTag.getWidth() + i;
                    int i2 = iArr[1];
                    int height = findViewWithTag.getHeight() + i2;
                    if (i2 <= motionEvent.getRawY() && height >= motionEvent.getRawY() && i <= motionEvent.getRawX() && width >= motionEvent.getRawX()) {
                        return false;
                    }
                }
            }
        }
        ((InterfaceC16620sF) ((C9BH) c9c6.A06).A00).invoke(view, motionEvent);
        String str = c9c6.A03;
        if (str != null) {
            if (str.equals("cta_extension_tap_on_media")) {
                num2 = C05F.A00;
            } else if (str.equals("cta_extension_tap_on_ufi")) {
                num2 = C05F.A01;
            }
            if (c75113Zb.A12 != null && c75113Zb.A11 != num2) {
                c75113Zb.A11 = num2;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        num = C05F.A0C;
                    }
                    c75113Zb.A0e = motionEvent;
                } else {
                    num = C05F.A01;
                }
            } else {
                num = C05F.A00;
            }
            if (c75113Zb.A12 != num) {
                c75113Zb.A12 = num;
                C75113Zb.A00(c75113Zb, 56);
            }
            c75113Zb.A0e = motionEvent;
        }
        return true;
    }
}
