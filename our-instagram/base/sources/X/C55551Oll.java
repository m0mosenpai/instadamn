package X;

/* renamed from: X.Oll, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55551Oll implements C06N {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55551Oll(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r2 == com.instagram.creation.state.CreationState.A0H) goto L22;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C06N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackStackChanged() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L10;
                case 1: goto L44;
                case 2: goto L21;
                case 3: goto L32;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A02
            X.0h2 r0 = (X.AbstractC10360h2) r0
            int r0 = r0.A0L()
            if (r0 <= 0) goto L3c
        Lf:
            return
        L10:
            java.lang.Object r1 = r3.A01
            X.Fbk r1 = (X.C35013Fbk) r1
            java.lang.Object r0 = r3.A02
            X.0h2 r0 = (X.AbstractC10360h2) r0
            int r0 = r0.A0L()
            if (r0 != 0) goto Lf
            androidx.fragment.app.FragmentActivity r0 = r1.A0G
            goto L40
        L21:
            java.lang.Object r0 = r3.A01
            X.0h2 r0 = (X.AbstractC10360h2) r0
            int r0 = r0.A0L()
            if (r0 > 0) goto Lf
            java.lang.Object r0 = r3.A02
            X.GCl r0 = (X.C36613GCl) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            goto L40
        L32:
            java.lang.Object r0 = r3.A02
            X.0h2 r0 = (X.AbstractC10360h2) r0
            int r0 = r0.A0L()
            if (r0 != 0) goto Lf
        L3c:
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
        L40:
            r0.finish()
            return
        L44:
            java.lang.Object r0 = r3.A02
            X.MZt r0 = (X.C50698MZt) r0
            com.instagram.creation.state.CreationState r2 = r0.A01
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A04
            if (r2 == r0) goto L53
            com.instagram.creation.state.CreationState r1 = com.instagram.creation.state.CreationState.A0H
            r0 = 1
            if (r2 != r1) goto L54
        L53:
            r0 = 0
        L54:
            java.lang.Object r1 = r3.A01
            com.instagram.creation.activity.MediaCaptureActivity r1 = (com.instagram.creation.activity.MediaCaptureActivity) r1
            com.instagram.creation.activity.MediaCaptureActivity.A04(r1, r0)
            X.0h2 r0 = r1.getSupportFragmentManager()
            java.util.ArrayList r0 = r0.A0F
            r0.remove(r3)
            r0 = 0
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55551Oll.onBackStackChanged():void");
    }
}
