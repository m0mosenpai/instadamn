package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.instagram.ui.widget.tooltippopup.MaskingFrameLayout;

/* loaded from: classes8.dex */
public final class LR3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C51622Yk A02;
    public final /* synthetic */ boolean A03;

    public LR3(C51622Yk c51622Yk, int i, int i2, boolean z) {
        this.A02 = c51622Yk;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int paddingBottom;
        MaskingFrameLayout maskingFrameLayout;
        MaskingFrameLayout maskingFrameLayout2;
        float A08;
        C51622Yk c51622Yk = this.A02;
        JXE jxe = c51622Yk.A0G;
        jxe.getViewTreeObserver().removeOnPreDrawListener(this);
        int i = this.A00;
        int i2 = this.A01;
        boolean z = this.A03;
        if (!z) {
            i2 -= jxe.getHeight();
        }
        int[] iArr = new int[2];
        FrameLayout frameLayout = c51622Yk.A0C;
        frameLayout.getLocationOnScreen(iArr);
        int paddingTop = (i2 - iArr[1]) - frameLayout.getPaddingTop();
        if (z) {
            paddingBottom = -jxe.getPaddingTop();
        } else {
            paddingBottom = jxe.getPaddingBottom();
        }
        jxe.setTranslationY(paddingTop + paddingBottom);
        if (z) {
            maskingFrameLayout = jxe.A04;
        } else {
            maskingFrameLayout = jxe.A03;
        }
        int width = jxe.getWidth();
        int width2 = i - (maskingFrameLayout.getWidth() / 2);
        int paddingLeft = (width2 - (width / 2)) + (jxe.getPaddingLeft() / 2);
        Rect rect = c51622Yk.A0A;
        int i3 = paddingLeft - rect.left;
        Integer num = c51622Yk.A0J;
        Integer num2 = C05F.A01;
        int i4 = 0;
        if (num.equals(num2) && i3 < 0) {
            i3 = -jxe.getPaddingLeft();
        }
        int A0A = AbstractC13880nE.A0A(jxe.getContext());
        if (c51622Yk.A0K.equals(num2) && i3 + width > A0A) {
            i3 = (A0A - width) + jxe.getPaddingRight();
        }
        jxe.setX(i3);
        int x = (width2 - rect.left) - ((int) jxe.getX());
        c51622Yk.A02 = x;
        maskingFrameLayout.setX(x);
        jxe.A04.setVisibility(AbstractC43593JPy.A01(z ? 1 : 0));
        MaskingFrameLayout maskingFrameLayout3 = jxe.A03;
        if (z) {
            i4 = 4;
        }
        maskingFrameLayout3.setVisibility(i4);
        if (z) {
            maskingFrameLayout2 = jxe.A04;
        } else {
            maskingFrameLayout2 = jxe.A03;
        }
        int width3 = c51622Yk.A02 + (maskingFrameLayout2.getWidth() / 2);
        InterfaceC147206jw interfaceC147206jw = c51622Yk.A03;
        c51622Yk.A02 = width3;
        c51622Yk.A07 = z;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A0o = AbstractC43592JPx.A0o(jxe, 0);
        A0o.A0U(0.0f, 1.0f, width3);
        if (z) {
            A08 = 0.0f;
        } else {
            A08 = AbstractC166987dD.A08(jxe);
        }
        A0o.A0V(0.0f, 1.0f, A08);
        A0o.A0M(0.0f, 1.0f);
        A0o.A04 = 0;
        A0o.A06 = new C49608Lw1(c51622Yk, 6);
        A0o.A05 = new C49602Lvv(4, c51622Yk, interfaceC147206jw);
        A0o.A0H();
        return false;
    }
}
