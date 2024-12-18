package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jrk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44763Jrk extends C3OO {
    public final View A00;
    public final ViewGroup A01;
    public final TextView A02;
    public final TextView A03;
    public final ChoreographerFrameCallbackC45694KKg A04;
    public final ImageView A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r9.A00 <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r7, X.C44763Jrk r8, X.C46503Ki2 r9) {
        /*
            r6 = 0
            if (r9 == 0) goto Le
            long r4 = r9.A00
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r5 = 1
            r0 = 360(0x168, float:5.04E-43)
            if (r1 > 0) goto L11
        Le:
            r5 = 0
            r0 = 270(0x10e, float:3.78E-43)
        L11:
            int r1 = X.AbstractC166987dD.A0C(r7, r0)
            android.view.View r4 = r8.A00
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            if (r3 == 0) goto L2c
            int r0 = r3.height
            if (r1 == r0) goto L2c
            double r0 = (double) r1
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            r3.height = r0
            r4.setLayoutParams(r3)
        L2c:
            android.widget.ImageView r0 = r8.A05
            if (r5 != 0) goto L32
            r6 = 8
        L32:
            r0.setVisibility(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44763Jrk.A00(android.content.Context, X.Jrk, X.Ki2):void");
    }

    public C44763Jrk(View view, UserSession userSession) {
        super(view);
        this.A00 = view.requireViewById(R.id.vic_background_image);
        this.A01 = AbstractC31173DnH.A0F(view, R.id.vic_text_container);
        this.A03 = AbstractC166997dE.A0T(view, R.id.vic_title);
        this.A02 = AbstractC166997dE.A0T(view, R.id.vic_subtitle);
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.countdown_timer_image_view);
        this.A05 = A0I;
        Context context = view.getContext();
        int color = context.getColor(AbstractC53242c7.A0E(context));
        int color2 = context.getColor(AbstractC53242c7.A0E(context));
        C14360o3.A0B(userSession, 1);
        ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg = new ChoreographerFrameCallbackC45694KKg(userSession, context);
        choreographerFrameCallbackC45694KKg.A01 = color;
        choreographerFrameCallbackC45694KKg.A0B.A0F(color);
        choreographerFrameCallbackC45694KKg.A00 = color2;
        choreographerFrameCallbackC45694KKg.A0A.A0F(color2);
        this.A04 = choreographerFrameCallbackC45694KKg;
        A0I.setImageDrawable(choreographerFrameCallbackC45694KKg);
        A00(context, this, null);
    }
}
