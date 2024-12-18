package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* loaded from: classes11.dex */
public final class VBH extends RoundedCornerMediaFrameLayout {
    public IgSimpleImageView A00;
    public C47298Kv9 A01;
    public X8O A02;
    public Integer A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VBH(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 0
            boolean r2 = X.AbstractC25229BEm.A1Y(r4)
            r3.<init>(r4, r0, r2)
            r0 = 33
            X.0do r0 = X.C37050GUg.A00(r3, r0)
            r3.A07 = r0
            r0 = 30
            X.0do r0 = X.C37050GUg.A00(r3, r0)
            r3.A05 = r0
            r0 = 31
            X.0do r0 = X.C37050GUg.A00(r3, r0)
            r3.A06 = r0
            r0 = 29
            X.0do r0 = X.C37050GUg.A00(r3, r0)
            r3.A04 = r0
            r0 = 32
            X.0do r0 = X.C37050GUg.A00(r3, r0)
            r3.A08 = r0
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setRadius(r0)
            r3.setCornerBackgroundColor(r2)
            r0 = 1061158912(0x3f400000, float:0.75)
            r3.A00 = r0
            r0 = 0
            r3.setAlpha(r0)
            r0 = 8
            r3.setVisibility(r0)
            r1 = 40
            X.WNO r0 = new X.WNO
            r0.<init>(r3, r1)
            r3.setOnClickListener(r0)
            r1 = 4
            X.LQL r0 = new X.LQL
            r0.<init>(r3, r1)
            r3.setOnLongClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VBH.<init>(android.content.Context):void");
    }

    public final void setClickCallback(X8O x8o) {
        C14360o3.A0B(x8o, 0);
        this.A02 = x8o;
    }

    private final int getDecorMarginBottom() {
        return AbstractC167027dH.A01(this.A04);
    }

    private final int getDecorMarginHorizontal() {
        return AbstractC167027dH.A01(this.A05);
    }

    private final int getDecorMarginTop() {
        return AbstractC167027dH.A01(this.A06);
    }

    private final UMD getDraggableTouchListener() {
        return (UMD) this.A08.getValue();
    }

    private final int getSize() {
        return AbstractC167027dH.A01(this.A07);
    }

    public final ViewGroup.LayoutParams getDesiredContextAvatarLayoutParams() {
        InterfaceC09390do interfaceC09390do = this.A07;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC167027dH.A01(interfaceC09390do), AbstractC167027dH.A01(interfaceC09390do));
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public final FrameLayout.LayoutParams getDesiredDecorLayoutParams() {
        InterfaceC09390do interfaceC09390do = this.A07;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC167027dH.A01(interfaceC09390do), AbstractC167027dH.A01(interfaceC09390do));
        InterfaceC09390do interfaceC09390do2 = this.A05;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = AbstractC167027dH.A01(interfaceC09390do2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AbstractC167027dH.A01(this.A06);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = AbstractC167027dH.A01(interfaceC09390do2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AbstractC167027dH.A01(this.A04);
        layoutParams.gravity = 53;
        return layoutParams;
    }

    public final void setBottomBounds(Integer num) {
        this.A03 = num;
        A00();
    }

    private final void A00() {
        View view;
        int i;
        int i2;
        int i3;
        Object parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        int i4 = 0;
        if (view != null) {
            i = view.getWidth();
            i4 = view.getHeight();
        } else {
            i = 0;
        }
        UMD draggableTouchListener = getDraggableTouchListener();
        InterfaceC09390do interfaceC09390do = this.A05;
        int A01 = AbstractC167027dH.A01(interfaceC09390do);
        int A012 = AbstractC167027dH.A01(this.A06);
        int A013 = i - AbstractC167027dH.A01(interfaceC09390do);
        Integer num = this.A03;
        if (num != null) {
            i4 = num.intValue();
        }
        int A014 = i4 - AbstractC167027dH.A01(this.A04);
        if (A01 != draggableTouchListener.A01 || A012 != draggableTouchListener.A03 || A013 != draggableTouchListener.A02 || A014 != draggableTouchListener.A00) {
            draggableTouchListener.A01 = A01;
            draggableTouchListener.A03 = A012;
            draggableTouchListener.A02 = A013;
            draggableTouchListener.A00 = A014;
            View view2 = draggableTouchListener.A0A;
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                Integer num2 = draggableTouchListener.A05;
                Integer num3 = draggableTouchListener.A06;
                UQ7 A00 = UMD.A00(draggableTouchListener);
                draggableTouchListener.A05 = num2;
                draggableTouchListener.A06 = num3;
                Integer num4 = C05F.A00;
                if (num2 == num4) {
                    i2 = A00.A01;
                } else {
                    i2 = A00.A02;
                }
                if (num3 == num4) {
                    i3 = A00.A03;
                } else {
                    i3 = A00.A00;
                }
                draggableTouchListener.A0C.A08(view2.getTranslationX() + (i2 - AbstractC50524MSc.A01(view2)), true);
                draggableTouchListener.A0D.A08(view2.getTranslationY() + (i3 - AbstractC50524MSc.A02(view2)), true);
            }
        }
    }

    public final void A02() {
        UMD draggableTouchListener = getDraggableTouchListener();
        C55982hj c55982hj = draggableTouchListener.A0C;
        Ut2 ut2 = draggableTouchListener.A0B;
        c55982hj.A0B(ut2);
        draggableTouchListener.A0D.A0B(ut2);
        setOnTouchListener(null);
        getDraggableTouchListener().A04 = null;
    }

    public final void A03() {
        clearAnimation();
        ViewPropertyAnimator withStartAction = animate().alpha(1.0f).withStartAction(new RunnableC71345WsG(this));
        withStartAction.setDuration(350L);
        withStartAction.setStartDelay(50L);
        withStartAction.start();
    }

    public final void A04(C68742VbL c68742VbL) {
        A00();
        UMD draggableTouchListener = getDraggableTouchListener();
        C55982hj c55982hj = draggableTouchListener.A0C;
        Ut2 ut2 = draggableTouchListener.A0B;
        c55982hj.A0A(ut2);
        draggableTouchListener.A0D.A0A(ut2);
        getDraggableTouchListener().A04 = c68742VbL;
        setOnTouchListener(getDraggableTouchListener());
    }

    public final void A05(InterfaceC16820sZ interfaceC16820sZ) {
        clearAnimation();
        ViewPropertyAnimator withEndAction = AbstractC43594JPz.A0G(this).withEndAction(new RunnableC71495Wuz(this, interfaceC16820sZ));
        withEndAction.setDuration(300L);
        withEndAction.start();
    }

    public final String getCurrentDecorAvatarPosition() {
        UMD draggableTouchListener = getDraggableTouchListener();
        Integer num = draggableTouchListener.A05;
        Integer num2 = draggableTouchListener.A06;
        Integer num3 = C05F.A00;
        if (num2 == num3) {
            if (num == num3) {
                return "top_left";
            }
            if (num == C05F.A01) {
                return "top_right";
            }
        }
        if (num2 == C05F.A01 && num == num3) {
            return "bottom_left";
        }
        return "bottom_right";
    }
}
