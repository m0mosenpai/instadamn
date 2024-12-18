package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.Uxt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67777Uxt extends AbstractC69084Vha {
    public long A00;
    public ValueAnimator A01;
    public ValueAnimator A02;
    public StateListDrawable A03;
    public AccessibilityManager A04;
    public C65O A05;
    public boolean A06;
    public boolean A07;
    public final TextWatcher A08;
    public final View.OnFocusChangeListener A09;
    public final UEH A0A;
    public final InterfaceC71913X9x A0B;
    public final InterfaceC71914X9y A0C;

    public static C65O A00(C67777Uxt c67777Uxt, float f, float f2, float f3, int i) {
        C72G c72g = new C72G();
        c72g.A02 = new C65T(f);
        c72g.A03 = new C65T(f);
        c72g.A00 = new C65T(f2);
        c72g.A01 = new C65T(f2);
        C65Q c65q = new C65Q(c72g);
        Context context = ((AbstractC69084Vha) c67777Uxt).A00;
        Paint paint = C65O.A0M;
        int A00 = AbstractC1343565e.A00(context, AbstractC111324zv.A00(3671), R.attr.colorSurface);
        C65O c65o = new C65O();
        c65o.A0E(context);
        c65o.A0F(ColorStateList.valueOf(A00));
        c65o.A0A(f3);
        c65o.setShapeAppearanceModel(c65q);
        C65W c65w = c65o.A00;
        if (c65w.A0I == null) {
            c65w.A0I = new Rect();
        }
        c65o.A00.A0I.set(0, i, 0, i);
        c65o.invalidateSelf();
        return c65o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4 > 300) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.widget.AutoCompleteTextView r6, X.C67777Uxt r7) {
        /*
            if (r6 == 0) goto L31
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r7.A00
            long r4 = r4 - r0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L16
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L17
        L16:
            r0 = 1
        L17:
            r1 = 0
            if (r0 == 0) goto L1c
            r7.A06 = r1
        L1c:
            boolean r0 = r7.A06
            if (r0 != 0) goto L36
            boolean r0 = r7.A07
            r0 = r0 ^ 1
            A02(r7, r0)
            boolean r0 = r7.A07
            if (r0 == 0) goto L32
            r6.requestFocus()
            r6.showDropDown()
        L31:
            return
        L32:
            r6.dismissDropDown()
            return
        L36:
            r7.A06 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67777Uxt.A01(android.widget.AutoCompleteTextView, X.Uxt):void");
    }

    public static void A02(C67777Uxt c67777Uxt, boolean z) {
        if (c67777Uxt.A07 != z) {
            c67777Uxt.A07 = z;
            c67777Uxt.A01.cancel();
            c67777Uxt.A02.start();
        }
    }

    public C67777Uxt(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.A08 = new C67753UxS(this);
        this.A09 = new WNY(this, 3);
        this.A0A = new C67778Uxu(this, super.A02);
        this.A0B = new C70541WcX(this);
        this.A0C = new C70544Wca(this);
        this.A06 = false;
        this.A07 = false;
        this.A00 = Long.MAX_VALUE;
    }
}
