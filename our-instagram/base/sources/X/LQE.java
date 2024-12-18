package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class LQE implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LQE(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r2.isValid() != true) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onLongClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            if (r0 == 0) goto L13
            java.lang.Object r0 = r8.A01
            X.Jnr r0 = (X.C44567Jnr) r0
            X.MQa r1 = r0.A02
            java.lang.Object r0 = r8.A02
            X.Jfh r0 = (X.C44178Jfh) r0
            boolean r1 = r1.DNY(r0)
        L12:
            return r1
        L13:
            java.lang.Object r3 = r8.A02
            X.JrM r3 = (X.C44739JrM) r3
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.A03
            android.content.Context r7 = X.AbstractC166997dE.A0L(r0)
            X.8lV r2 = r3.A02
            r1 = 1
            if (r2 == 0) goto L29
            boolean r0 = r2.isValid()
            r6 = 1
            if (r0 == r1) goto L54
        L29:
            r6 = 0
            if (r2 != 0) goto L54
            r5 = 0
        L2d:
            X.7vV r0 = r3.A05
            boolean r4 = r0.A06
            X.Jho r0 = r3.A04
            com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView r0 = r0.A00
            X.Ji1 r0 = r0.A03
            r2 = 0
            int r1 = X.AbstractC25227BEk.A05(r0, r2)
            r3 = 1
            r0 = 2
            if (r1 == r0) goto L52
            if (r1 == r2) goto L52
        L42:
            java.lang.Object r2 = r8.A01
            r1 = 47
            X.MDj r0 = new X.MDj
            r0.<init>(r2, r1)
            r1 = 0
            if (r6 != 0) goto L57
            X.AbstractC44294Jhk.A01(r7, r5)
            return r1
        L52:
            r3 = 0
            goto L42
        L54:
            boolean r5 = r2.A04
            goto L2d
        L57:
            if (r3 == 0) goto L12
            if (r4 == 0) goto L12
            java.lang.Object r0 = r0.invoke()
            boolean r1 = X.AbstractC166987dD.A1a(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LQE.onLongClick(android.view.View):boolean");
    }
}
