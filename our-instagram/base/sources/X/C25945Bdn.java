package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.Bdn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25945Bdn extends C3OO {
    public final BYL A00;
    public final int A01;
    public final int A02;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2.getRight() > r3) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r5 = this;
            X.BYL r4 = r5.A00
            int r0 = r5.A02
            int r3 = r5.A01
            android.view.View r2 = r5.itemView
            X.C14360o3.A06(r2)
            int r1 = X.AbstractC25233BEq.A00(r0, r3)
            int r3 = r3 + r1
            int r0 = r2.getLeft()
            if (r1 > r0) goto L1d
            int r0 = r2.getRight()
            r1 = 1
            if (r0 <= r3) goto L1e
        L1d:
            r1 = 0
        L1e:
            boolean r0 = r4.A01
            if (r0 == r1) goto L27
            r4.A01 = r1
            X.BYL.A00(r4)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25945Bdn.A00():void");
    }

    public C25945Bdn(View view) {
        super(view);
        Context context = view.getContext();
        C14360o3.A0A(context);
        this.A02 = AbstractC13880nE.A0A(context);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.messaging_ads_multi_suggestions_thumbnail_height);
        BYL byl = new BYL(context);
        this.A00 = byl;
        ((ImageView) view).setImageDrawable(byl);
    }
}
