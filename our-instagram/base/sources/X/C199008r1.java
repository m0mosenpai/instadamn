package X;

/* renamed from: X.8r1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199008r1 extends C0T6 {
    public boolean A00;
    public final C198968qw A01;
    public final C198998qz A02;
    public final C8r2 A03;
    public final C198908qq A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199008r1) {
                C199008r1 c199008r1 = (C199008r1) obj;
                if (!C14360o3.A0K(this.A04, c199008r1.A04) || !C14360o3.A0K(this.A01, c199008r1.A01) || !C14360o3.A0K(this.A02, c199008r1.A02) || !C14360o3.A0K(this.A03, c199008r1.A03) || this.A05 != c199008r1.A05) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r0.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r0 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        if (r0.size() <= 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00() {
        /*
            r5 = this;
            X.8r2 r4 = r5.A03
            r3 = 1
            if (r4 == 0) goto L5f
            X.8qy r1 = r4.A04
            if (r1 == 0) goto L1d
            boolean r0 = r1.A00
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.A00()
            X.8yz r0 = (X.C203428yz) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r0.A00
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            if (r0 != 0) goto L55
        L1d:
            X.47m r1 = X.C8r2.A0E
            X.47m r0 = r4.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L55
            java.lang.String r0 = r4.A09
            if (r0 != 0) goto L55
            com.instagram.camera.effect.models.CameraAREffect r0 = r4.A00
            if (r0 != 0) goto L55
            X.9IV r0 = r4.A03
            if (r0 == 0) goto L3d
            java.util.List r0 = r0.A05
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L55
        L3d:
            X.8Qv r2 = r4.A05
            if (r2 == 0) goto L56
            java.util.Map r0 = r2.A0K
            if (r0 == 0) goto L4c
            int r0 = r0.size()
            r1 = 1
            if (r0 > 0) goto L4d
        L4c:
            r1 = 0
        L4d:
            boolean r0 = r2.A00()
            if (r1 != 0) goto L55
            if (r0 == 0) goto L56
        L55:
            return r3
        L56:
            X.A9n r0 = r4.A02
            if (r0 == 0) goto L5f
            boolean r0 = r0.A00
            if (r0 == 0) goto L5f
            return r3
        L5f:
            X.8qz r2 = r5.A02
            if (r2 == 0) goto L9c
            X.8qy r1 = r2.A04
            if (r1 == 0) goto L7b
            boolean r0 = r1.A00
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r1.A00()
            X.8yz r0 = (X.C203428yz) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r0.A00
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            if (r0 != 0) goto L55
        L7b:
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A01
            if (r0 != 0) goto L55
            int r0 = r2.A00
            if (r0 != 0) goto L55
            X.8Qv r2 = r2.A05
            if (r2 == 0) goto L9c
            java.util.Map r0 = r2.A0K
            if (r0 == 0) goto L92
            int r0 = r0.size()
            r1 = 1
            if (r0 > 0) goto L93
        L92:
            r1 = 0
        L93:
            boolean r0 = r2.A00()
            if (r1 != 0) goto L55
            if (r0 == 0) goto L9c
            return r3
        L9c:
            X.8qw r0 = r5.A01
            X.9BH r0 = r0.A00
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r0.A00
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = (com.instagram.reels.fragment.model.ReelMoreOptionsModel) r0
            if (r0 == 0) goto Laf
            boolean r0 = r0.A01()
            if (r0 != r3) goto Laf
            return r3
        Laf:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199008r1.A00():boolean");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        C198908qq c198908qq = this.A04;
        int i = 0;
        if (c198908qq == null) {
            hashCode = 0;
        } else {
            hashCode = c198908qq.hashCode();
        }
        int hashCode3 = ((hashCode * 31) + this.A01.hashCode()) * 31;
        C198998qz c198998qz = this.A02;
        if (c198998qz == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c198998qz.hashCode();
        }
        int i2 = (hashCode3 + hashCode2) * 31;
        C8r2 c8r2 = this.A03;
        if (c8r2 != null) {
            i = c8r2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        int i4 = 1237;
        if (this.A05) {
            i4 = 1231;
        }
        return i3 + i4;
    }

    public C199008r1(C198968qw c198968qw, C198998qz c198998qz, C8r2 c8r2, C198908qq c198908qq, boolean z) {
        this.A04 = c198908qq;
        this.A01 = c198968qw;
        this.A02 = c198998qz;
        this.A03 = c8r2;
        this.A05 = z;
    }
}
