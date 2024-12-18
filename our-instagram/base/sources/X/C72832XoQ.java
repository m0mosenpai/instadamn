package X;

import java.nio.FloatBuffer;
import java.util.Map;

/* renamed from: X.XoQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72832XoQ {
    public final XOB A00;
    public final C72236XZn A01;
    public final FloatBuffer A02;
    public final XO3 A03;

    public C72832XoQ(XO3 xo3) {
        XOB xob;
        C14360o3.A0B(xo3, 1);
        this.A03 = xo3;
        this.A02 = FloatBuffer.allocate(16);
        Map map = xo3.A03;
        AbstractC72243XZy A09 = AbstractC72046XLm.A09("u_enableModelViewMatrix", map);
        if (A09 instanceof XOB) {
            xob = (XOB) A09;
        } else {
            xob = null;
        }
        AbstractC72243XZy A092 = AbstractC72046XLm.A09("u_modelViewMatrix", map);
        C72236XZn c72236XZn = A092 instanceof C72236XZn ? (C72236XZn) A092 : null;
        if (xob != null && c72236XZn != null) {
            this.A00 = xob;
            this.A01 = c72236XZn;
        } else {
            String A0R = AnonymousClass001.A0R("Could not initialize ", AbstractC31173DnH.A0q(this));
            C14360o3.A0B(A0R, 1);
            throw new Exception(A0R);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (X.C209089Mq.A05("glViewport") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (X.C209089Mq.A05("prepareToRender") != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(X.C72783Xn3 r24) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72832XoQ.A00(X.Xn3):boolean");
    }
}
