package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes8.dex */
public final class KF1 extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new FrameLayout(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // X.AbstractC65806TuP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r6, X.C6FG r7, X.C102884kP r8, java.lang.Object r9) {
        /*
            r5 = this;
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            X.AbstractC167027dH.A12(r6, r7, r8)
            android.content.Context r4 = r7.A00
            com.instagram.common.ui.widget.imageview.IgImageView r3 = new com.instagram.common.ui.widget.imageview.IgImageView
            r3.<init>(r4)
            java.lang.String r2 = r8.A0G()
            if (r2 == 0) goto L41
            int r1 = r2.hashCode()
            r0 = -451844079(0xffffffffe5116811, float:-4.2916427E22)
            if (r1 == r0) goto L52
            r0 = -14956424(0xffffffffff1bc878, float:-2.0707123E38)
            if (r1 == r0) goto L46
            r0 = 356806606(0x15446fce, float:3.9670083E-26)
            if (r1 != r0) goto L41
            java.lang.String r0 = "autogen-intro-animation-new-style"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L41
            r0 = 2131230945(0x7f0800e1, float:1.8077957E38)
        L30:
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            X.2mP r0 = (X.AbstractC58662mP) r0
            if (r0 == 0) goto L41
            r0.EH1()
            r0.E4S()
            r3.setImageDrawable(r0)
        L41:
            r6.addView(r3)
            r0 = 0
            return r0
        L46:
            java.lang.String r0 = "autogen-waiting-animation"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L41
            r0 = 2131230946(0x7f0800e2, float:1.807796E38)
            goto L30
        L52:
            java.lang.String r0 = "autogen-intro-animation-kf"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L41
            r0 = 2131230944(0x7f0800e0, float:1.8077955E38)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KF1.A0K(android.view.View, X.6FG, X.4kP, java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        C14360o3.A0B(viewGroup, 0);
        viewGroup.removeAllViews();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }
}
