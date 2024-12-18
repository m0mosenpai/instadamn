package X;

import android.content.Context;
import com.facebook.onecamera.configurations.AppSpecific;
import com.facebook.onecamera.configurations.ArDelivery;
import com.facebook.onecamera.configurations.PostCaptureMediaPipeline;
import com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode;

/* renamed from: X.7vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178177vr implements InterfaceC178157vo {
    public final Class A00;

    public static C178577wV A00(Context context, C178027vb c178027vb, InterfaceC178157vo interfaceC178157vo) {
        C178167vp c178167vp = C178167vp.A00;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        return c178167vp.A00(applicationContext, c178027vb, new C178177vr(AppSpecific.class), interfaceC178157vo);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC178157vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ChI(X.InterfaceC178207vu r7, X.C178637wb r8) {
        /*
            r6 = this;
            java.lang.Class r1 = r6.A00
            java.lang.Class<com.facebook.onecamera.configurations.AppSpecific> r0 = com.facebook.onecamera.configurations.AppSpecific.class
            boolean r0 = r0.equals(r1)
            r2 = 0
            if (r0 != 0) goto L68
            java.lang.Class<com.facebook.onecamera.configurations.ArDelivery> r0 = com.facebook.onecamera.configurations.ArDelivery.class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            int[] r5 = new int[]{r2}
        L17:
            int r4 = r5.length
            r3 = 0
        L19:
            if (r3 >= r4) goto L7f
            r1 = r5[r3]
            if (r1 == 0) goto L48
            r0 = 1
            if (r1 == r0) goto L3f
            r0 = 2
            if (r1 == r0) goto L36
            r0 = 3
            if (r1 != r0) goto L6b
            X.C14360o3.A0B(r7, r2)
            X.7wr r0 = new X.7wr
            r0.<init>(r7)
        L30:
            r8.A00(r0)
            int r3 = r3 + 1
            goto L19
        L36:
            X.C14360o3.A0B(r7, r2)
            X.8rg r0 = new X.8rg
            r0.<init>(r7)
            goto L30
        L3f:
            X.C14360o3.A0B(r7, r2)
            X.7xy r0 = new X.7xy
            r0.<init>(r7)
            goto L30
        L48:
            X.C14360o3.A0B(r7, r2)
            X.AZj r0 = new X.AZj
            r0.<init>(r7)
            goto L30
        L51:
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureMediaPipeline> r0 = com.facebook.onecamera.configurations.PostCaptureMediaPipeline.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L68
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode> r0 = com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode.class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L80
            r0 = 3
            int[] r5 = new int[r0]
            r5 = {x0090: FILL_ARRAY_DATA , data: [3, 2, 1} // fill-array
            goto L17
        L68:
            int[] r5 = new int[r2]
            goto L17
        L6b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L7f:
            return
        L80:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "No qualified list for key %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178177vr.ChI(X.7vu, X.7wb):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC178157vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ChJ(X.InterfaceC178207vu r5, X.C179677yH r6) {
        /*
            r4 = this;
            java.lang.Class r3 = r4.A00
            java.lang.Class<com.facebook.onecamera.configurations.AppSpecific> r0 = com.facebook.onecamera.configurations.AppSpecific.class
            boolean r0 = r0.equals(r3)
            r2 = 0
            if (r0 != 0) goto L4c
            java.lang.Class<com.facebook.onecamera.configurations.ArDelivery> r0 = com.facebook.onecamera.configurations.ArDelivery.class
            boolean r0 = r0.equals(r3)
            r1 = 1
            if (r0 == 0) goto L37
            int[] r1 = new int[]{r2}
        L18:
            int r0 = r1.length
            if (r2 >= r0) goto L2d
            r1 = r1[r2]
            if (r1 == 0) goto L2e
            r0 = 1
            if (r1 != r0) goto L4f
            X.C14360o3.A0B(r5, r2)
            X.9NN r0 = new X.9NN
            r0.<init>(r5)
        L2a:
            r6.A00(r0)
        L2d:
            return
        L2e:
            X.C14360o3.A0B(r5, r2)
            X.9az r0 = new X.9az
            r0.<init>(r5)
            goto L2a
        L37:
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureMediaPipeline> r0 = com.facebook.onecamera.configurations.PostCaptureMediaPipeline.class
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L4c
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode> r0 = com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode.class
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L63
            int[] r1 = new int[]{r1}
            goto L18
        L4c:
            int[] r1 = new int[r2]
            goto L18
        L4f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L63:
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "No qualified list for key %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178177vr.ChJ(X.7vu, X.7yH):void");
    }

    @Override // X.InterfaceC178157vo
    public final void ChK(InterfaceC178207vu interfaceC178207vu, C179757yP c179757yP) {
        Class cls = this.A00;
        if (!AppSpecific.class.equals(cls) && !ArDelivery.class.equals(cls) && !PostCaptureMediaPipeline.class.equals(cls) && !PostCaptureStoriesVideoTranscode.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("No qualified list for key %s", cls));
        }
    }

    @Override // X.InterfaceC178157vo
    public final void ChL(InterfaceC178207vu interfaceC178207vu, C179787yS c179787yS) {
        int[] iArr;
        InterfaceC179817yV c199418ri;
        Class cls = this.A00;
        if (!AppSpecific.class.equals(cls) && !ArDelivery.class.equals(cls) && !PostCaptureMediaPipeline.class.equals(cls)) {
            if (PostCaptureStoriesVideoTranscode.class.equals(cls)) {
                iArr = new int[]{1, 2, 0};
            } else {
                throw new IllegalArgumentException(String.format("No qualified list for key %s", cls));
            }
        } else {
            iArr = new int[0];
        }
        for (int i : iArr) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C14360o3.A0B(interfaceC178207vu, 0);
                        c199418ri = new C9NM(interfaceC178207vu);
                    } else {
                        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
                    }
                } else {
                    C14360o3.A0B(interfaceC178207vu, 0);
                    c199418ri = new AbstractC179807yU(interfaceC178207vu);
                }
            } else {
                C14360o3.A0B(interfaceC178207vu, 0);
                c199418ri = new C199418ri(interfaceC178207vu);
            }
            c179787yS.A00(c199418ri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.7wE] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.7w2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.7w5] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.7w0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.8vY] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.7w1, java.lang.Object] */
    @Override // X.InterfaceC178157vo
    public final void ChM(InterfaceC178207vu interfaceC178207vu, C178257vz c178257vz) {
        int[] iArr;
        ?? A01;
        Class cls = this.A00;
        if (AppSpecific.class.equals(cls)) {
            iArr = new int[]{2, 1, 0};
        } else if (ArDelivery.class.equals(cls)) {
            iArr = new int[]{2, 4, 3};
        } else if (PostCaptureMediaPipeline.class.equals(cls)) {
            iArr = new int[0];
        } else if (PostCaptureStoriesVideoTranscode.class.equals(cls)) {
            iArr = new int[]{2, 1, 0};
        } else {
            throw new IllegalArgumentException(String.format("No qualified list for key %s", cls));
        }
        for (int i : iArr) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                C14360o3.A0B(interfaceC178207vu, 0);
                                A01 = new Object();
                                A01.A00 = interfaceC178207vu;
                            } else {
                                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
                            }
                        } else {
                            C14360o3.A0B(interfaceC178207vu, 0);
                            A01 = new C201438vY(interfaceC178207vu);
                        }
                    } else {
                        C14360o3.A0B(interfaceC178207vu, 0);
                        A01 = new C178267w0(interfaceC178207vu);
                    }
                } else {
                    C14360o3.A0B(interfaceC178207vu, 0);
                    A01 = new C178317w5(interfaceC178207vu);
                }
            } else {
                A01 = C178347w8.A00.A01(interfaceC178207vu);
            }
            c178257vz.A02.put(A01.BKX(), A01);
            c178257vz.A01.add(A01);
        }
    }

    public C178177vr(Class cls) {
        this.A00 = cls;
    }
}
