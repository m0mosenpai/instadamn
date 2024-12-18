package X;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes11.dex */
public abstract class WO8 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int A00;
    public Runnable A01;
    public Runnable A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final int[] A08 = new int[2];

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A03 = false;
        this.A00 = -1;
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
    }

    public static void A00(WO8 wo8) {
        Runnable runnable = wo8.A02;
        if (runnable != null) {
            wo8.A07.removeCallbacks(runnable);
        }
        Runnable runnable2 = wo8.A01;
        if (runnable2 != null) {
            wo8.A07.removeCallbacks(runnable2);
        }
    }

    public final XDX A01() {
        C69725VuK c69725VuK;
        if (this instanceof C66370UDn) {
            return ((C66370UDn) this).A00;
        }
        if (this instanceof C66369UDm) {
            c69725VuK = ((C66369UDm) this).A00.A00.A0D;
            if (c69725VuK == null) {
                return null;
            }
        } else {
            VIK vik = ((C66368UDl) this).A00.A00;
            if (vik == null || (c69725VuK = ((UDF) vik).A00.A09) == null) {
                return null;
            }
        }
        return c69725VuK.A00();
    }

    public final boolean A02() {
        XDX A01;
        if (this instanceof C66370UDn) {
            UCx uCx = ((C66370UDn) this).A01;
            InterfaceC71999XEn interfaceC71999XEn = uCx.A02;
            if (!interfaceC71999XEn.CdI()) {
                interfaceC71999XEn.Ek9(uCx.getTextDirection(), uCx.getTextAlignment());
            }
        } else if (this instanceof C66369UDm) {
            ((C66369UDm) this).A00.A00.A04();
        } else {
            C66368UDl c66368UDl = (C66368UDl) this;
            ActionMenuItemView actionMenuItemView = c66368UDl.A00;
            InterfaceC71869X8c interfaceC71869X8c = actionMenuItemView.A01;
            if (interfaceC71869X8c == null || !interfaceC71869X8c.CP9(actionMenuItemView.A02) || (A01 = c66368UDl.A01()) == null || !A01.CdI()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r2 == 3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (r1 != 3) goto L44;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WO8.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public WO8(View view) {
        this.A07 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A04 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.A06 = tapTimeout;
        this.A05 = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
}
