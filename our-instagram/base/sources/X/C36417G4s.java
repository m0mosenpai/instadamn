package X;

import android.view.MotionEvent;

/* renamed from: X.G4s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36417G4s implements C7QJ {
    public final /* synthetic */ C7Q6 A00;
    public final /* synthetic */ C7Q8 A01;
    public final /* synthetic */ FGK A02;
    public final /* synthetic */ Object A03;

    @Override // X.C7QJ
    public final boolean DT5(MotionEvent motionEvent, Object obj) {
        C14360o3.A0B(motionEvent, 1);
        return this.A00.DT4(motionEvent, obj, this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r1 == 0) goto L10;
     */
    @Override // X.C7QJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DTA(android.view.MotionEvent r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 1
            X.C14360o3.A0B(r9, r0)
            X.FGK r2 = r8.A02
            java.lang.Object r1 = r8.A03
            X.FyP r10 = (X.C36211FyP) r10
            X.3OO r1 = (X.C3OO) r1
            X.AbstractC25230BEn.A15(r0, r10, r1)
            boolean r0 = r10.A0E
            if (r0 != 0) goto L46
            com.instagram.user.model.User r5 = r10.A03
            if (r5 == 0) goto L46
            X.FKd r0 = r2.A00
            X.Dyp r2 = r0.A02
            android.view.View r4 = X.AbstractC31171DnF.A06(r1)
            float r1 = r9.getX()
            float r0 = r9.getY()
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r1, r0)
            java.lang.String r6 = r10.A06
            java.lang.String r0 = r10.A07
            if (r0 == 0) goto L39
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L3a
        L39:
            r0 = 1
        L3a:
            r7 = r0 ^ 1
            X.05A r0 = r2.A07
            X.E9J r2 = new X.E9J
            r2.<init>(r3, r4, r5, r6, r7)
            r0.Egh(r2)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36417G4s.DTA(android.view.MotionEvent, java.lang.Object, boolean):void");
    }

    @Override // X.C7QJ
    public final boolean Dtz(MotionEvent motionEvent, Object obj) {
        return false;
    }

    public C36417G4s(C7Q6 c7q6, C7Q8 c7q8, FGK fgk, Object obj) {
        this.A00 = c7q6;
        this.A03 = obj;
        this.A01 = c7q8;
        this.A02 = fgk;
    }

    @Override // X.C7QJ
    public final boolean DBa(Object obj) {
        return this.A01.DBb(obj, this.A03);
    }
}
