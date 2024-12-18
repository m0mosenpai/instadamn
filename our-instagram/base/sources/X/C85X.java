package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.ml.bodytracking.BodyTrackerJni;

/* renamed from: X.85X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85X {
    public AbstractC203508z9 A00;
    public InterfaceC203488z7 A01;
    public BodyTrackerJni A02;
    public String A03;
    public String A04;
    public final C85O A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r5.A04 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r5 = this;
            java.lang.String r3 = r5.A03
            if (r3 == 0) goto L9
            java.lang.String r0 = r5.A04
            r1 = 1
            if (r0 != 0) goto La
        L9:
            r1 = 0
        La:
            r0 = 0
            if (r1 == 0) goto L65
            com.instagram.ml.bodytracking.BodyTrackerJni r4 = r5.A02
            if (r4 != 0) goto L1f
            if (r3 == 0) goto L1f
            java.lang.String r2 = r5.A04
            if (r2 == 0) goto L1f
            r1 = 1
            com.instagram.ml.bodytracking.BodyTrackerJni r4 = new com.instagram.ml.bodytracking.BodyTrackerJni
            r4.<init>(r3, r2, r1)
            r5.A02 = r4
        L1f:
            X.8z9 r2 = r5.A00
            boolean r1 = r2 instanceof X.C203498z8
            if (r1 == 0) goto L65
            if (r4 == 0) goto L65
            boolean r1 = r4.isReady()
            if (r1 == 0) goto L65
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.onecamera.components.ml.intf.MlInputBitmap"
            X.C14360o3.A0C(r2, r0)
            X.8z8 r2 = (X.C203498z8) r2
            android.graphics.Bitmap r3 = r2.A00
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            int r1 = r1 * r0
            int r0 = r1 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r0)
            r3.copyPixelsToBuffer(r2)
            X.C14360o3.A0A(r2)
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            r4.updateFrameByteBuffer(r1, r0, r2)
            r2.clear()
            int r0 = r4.getDetectedPeopleCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L65:
            X.8z7 r1 = r5.A01
            if (r1 == 0) goto L6c
            r1.DaC(r0)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85X.A00():void");
    }

    public C85X(C85N c85n) {
        C85O c85o = new C85O(c85n, "body_tracking");
        this.A05 = c85o;
        c85o.A00(new C85Q() { // from class: X.85Y
            @Override // X.C85Q
            public final void D6S(C1825788b c1825788b, Exception exc) {
                if (c1825788b != null) {
                    C85X c85x = C85X.this;
                    ModelPathsHolder modelPathsHolder = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.BodyTracking);
                    if (modelPathsHolder != null) {
                        String modelPath = modelPathsHolder.getModelPath(EnumC1825988f.A03);
                        String modelPath2 = modelPathsHolder.getModelPath(EnumC1825988f.A04);
                        if (modelPath != null && modelPath2 != null) {
                            c85x.A03 = modelPath;
                            c85x.A04 = modelPath2;
                        }
                    }
                }
            }
        });
    }
}
