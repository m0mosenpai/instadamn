package X;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class AD9 {
    public static C178577wV A00(Context context, C178017va c178017va) {
        C178577wV A01 = A01(context, new C178027vb(c178017va));
        C14360o3.A0B(A01, 0);
        return A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C178577wV A01(android.content.Context r4, X.C178027vb r5) {
        /*
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode> r2 = com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode.class
            r3 = 0
            java.lang.Class<com.facebook.onecamera.configurations.AppSpecific> r0 = com.facebook.onecamera.configurations.AppSpecific.class
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L30
            java.lang.Class<com.facebook.onecamera.configurations.ArDelivery> r0 = com.facebook.onecamera.configurations.ArDelivery.class
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L33
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureMediaPipeline> r0 = com.facebook.onecamera.configurations.PostCaptureMediaPipeline.class
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L30
            boolean r0 = r2.equals(r2)
            if (r0 != 0) goto L33
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "No qualified list for key %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L30:
            int[] r1 = new int[r3]
            goto L37
        L33:
            int[] r1 = new int[]{r3}
        L37:
            int r0 = r1.length
            if (r0 <= 0) goto L61
            r0 = r1[r3]
            if (r0 != 0) goto L4e
            X.7vp r1 = X.C178167vp.A00
            X.7vr r0 = new X.7vr
            r0.<init>(r2)
            X.7vo[] r0 = new X.InterfaceC178157vo[]{r0}
            X.7wV r0 = r1.A00(r4, r5, r0)
            return r0
        L4e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L61:
            java.lang.String r1 = "CameraService not found! Missing configuration for "
            java.lang.String r0 = r2.getSimpleName()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AD9.A01(android.content.Context, X.7vb):X.7wV");
    }
}
