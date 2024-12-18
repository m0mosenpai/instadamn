package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.JXi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43769JXi implements InterfaceC50477MQf {
    public ViewGroup A00;
    public GradientSpinner A01;
    public SlideInAndOutIconView A02;
    public final ViewStub A03;
    public final C4ZF A04;

    public C43769JXi(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A03 = viewStub;
        this.A04 = new C4ZF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (X.C14640oc.A0B() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C43769JXi r5) {
        /*
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = r5.A01
            if (r1 == 0) goto Lc
            r1.A08()
            r0 = 8
            r1.setVisibility(r0)
        Lc:
            X.1QL r1 = X.C1QI.A0E()
            X.1QL r0 = X.C1QL.A04
            r4 = 0
            if (r1 != r0) goto L1c
            boolean r1 = X.C14640oc.A0B()
            r0 = 1
            if (r1 != 0) goto L1d
        L1c:
            r0 = 0
        L1d:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r3 = r5.A02
            if (r3 == 0) goto L3d
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setIconScale(r2)
            if (r0 == 0) goto L36
            android.content.Context r1 = r3.getContext()
            r0 = 2131100425(0x7f060309, float:1.7813231E38)
            int r0 = r1.getColor(r0)
            r3.A02(r0, r0)
        L36:
            r0 = -1
            r3.setIconColor(r0)
            r3.setBackgroundAlpha(r2)
        L3d:
            android.view.ViewGroup r0 = r5.A00
            if (r0 == 0) goto L44
            r0.setVisibility(r4)
        L44:
            X.4ZF r1 = r5.A04
            X.4Cv r0 = X.EnumC92614Cv.FULLTEXT
            r1.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43769JXi.A00(X.JXi):void");
    }

    public static final void A01(C43769JXi c43769JXi) {
        C4ZF c4zf = c43769JXi.A04;
        LLs lLs = new LLs(c43769JXi, 7);
        if (c4zf.A05 == EnumC92614Cv.FULLTEXT) {
            float[] A1b = AbstractC43592JPx.A1b();
            // fill-array-data instruction
            A1b[0] = 1.0f;
            A1b[1] = 0.0f;
            ValueAnimator duration = ValueAnimator.ofFloat(A1b).setDuration(250L);
            c4zf.A04 = duration;
            C30Q c30q = C30Q.SLIDE_OUT;
            duration.addUpdateListener(new C130425un(c4zf));
            c4zf.A04.addListener(new C130435uo(c30q, c4zf));
            c4zf.A04.addListener(lLs);
            c4zf.A04.start();
        }
    }

    @Override // X.InterfaceC50477MQf
    public final void DQ6() {
        this.A04.A01();
        A00(this);
    }

    @Override // X.InterfaceC50477MQf
    public final void DS5() {
        this.A04.A01();
        A00(this);
    }

    @Override // X.InterfaceC50477MQf
    public final void DQ7() {
        A01(this);
    }
}
