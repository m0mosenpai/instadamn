package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.4Dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92824Dy {
    public C3YB A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final ConstraintLayout A08;
    public final ColorFilterAlphaImageView A09;
    public final HorizontalRecyclerPager A0A;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C92824Dy(android.content.Context r6, android.view.View r7, com.instagram.common.session.UserSession r8) {
        /*
            r5 = this;
            r0 = 3
            X.C14360o3.A0B(r7, r0)
            r5.<init>()
            android.content.res.Resources r3 = r6.getResources()
            r0 = 2131436892(0x7f0b255c, float:1.8495667E38)
            android.view.View r4 = r7.requireViewById(r0)
            r5.A02 = r4
            boolean r0 = X.AbstractC72723Nt.A00(r6)
            if (r0 == 0) goto L2a
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36316559827800583(0x8105b800001207, double:3.030076897925318E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            r2 = 2130970129(0x7f040611, float:1.754896E38)
            if (r0 != 0) goto L2d
        L2a:
            r2 = 2130970132(0x7f040614, float:1.7548965E38)
        L2d:
            int r0 = X.AbstractC53242c7.A0H(r6, r2)
            int r0 = r6.getColor(r0)
            r4.setBackgroundColor(r0)
            r0 = 2131436895(0x7f0b255f, float:1.8495673E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A07 = r0
            r0 = 2131436894(0x7f0b255e, float:1.8495671E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A06 = r0
            r0 = 2131436889(0x7f0b2559, float:1.8495661E38)
            android.view.View r1 = r7.requireViewById(r0)
            X.C14360o3.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131436893(0x7f0b255d, float:1.849567E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A05 = r0
            r0 = 2131628009(0x7f0e0fe9, float:1.8883299E38)
            r1.setLayoutResource(r0)
            android.view.View r1 = r1.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.C14360o3.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.A04 = r1
            r0 = 2131436891(0x7f0b255b, float:1.8495665E38)
            android.view.View r0 = r7.requireViewById(r0)
            X.C14360o3.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.C14360o3.A0C(r1, r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r5.A08 = r1
            r0 = 2131428927(0x7f0b063f, float:1.8479512E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A03 = r0
            r0 = 2131436896(0x7f0b2560, float:1.8495675E38)
            android.view.View r4 = r7.requireViewById(r0)
            com.instagram.ui.recyclerpager.HorizontalRecyclerPager r4 = (com.instagram.ui.recyclerpager.HorizontalRecyclerPager) r4
            r5.A0A = r4
            int r0 = X.AbstractC53242c7.A0H(r6, r2)
            int r0 = r6.getColor(r0)
            r4.setBackgroundColor(r0)
            r0 = 2131433119(0x7f0b169f, float:1.8488015E38)
            android.view.View r1 = r7.requireViewById(r0)
            r5.A01 = r1
            int r0 = X.AbstractC53242c7.A0H(r6, r2)
            int r0 = r6.getColor(r0)
            r1.setBackgroundColor(r0)
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r2 = r3.getDimensionPixelSize(r0)
            r0 = 2131436887(0x7f0b2557, float:1.8495657E38)
            android.view.View r1 = r7.requireViewById(r0)
            X.C14360o3.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131628007(0x7f0e0fe7, float:1.8883295E38)
            r1.setLayoutResource(r0)
            android.view.View r1 = r1.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView"
            X.C14360o3.A0C(r1, r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r1
            r5.A09 = r1
            r0 = 8
            r1.setVisibility(r0)
            X.3YB r0 = new X.3YB
            r0.<init>(r2, r2)
            r5.A00 = r0
            r4.A10(r0)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r4.A01 = r0
            X.3F1 r1 = r4.A0C
            if (r1 == 0) goto L10d
            X.3F0 r1 = (X.C3F0) r1
            r0 = 0
            r1.A00 = r0
        L10d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92824Dy.<init>(android.content.Context, android.view.View, com.instagram.common.session.UserSession):void");
    }
}
