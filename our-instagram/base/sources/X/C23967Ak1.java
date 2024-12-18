package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.List;

/* renamed from: X.Ak1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23967Ak1 implements BDT {
    public C73513Rc A00;
    public Integer A01;
    public final C23383AYh A02;
    public final InterfaceC09390do A03;
    public final UserSession A04;

    private final Integer A00() {
        Integer num = this.A01;
        if (num == C05F.A00) {
            File A00 = AH5.A00((AH5) this.A03.getValue());
            if (A00.exists() && A00.canRead()) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
            this.A01 = num;
        }
        return num;
    }

    public C23967Ak1(UserSession userSession, C23383AYh c23383AYh) {
        AbstractC167017dG.A1P(userSession, c23383AYh);
        this.A04 = userSession;
        this.A02 = c23383AYh;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57241PbP(this, 27));
        this.A01 = C05F.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r2 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            r6 = this;
            java.lang.Integer r0 = r6.A00()
            java.lang.Integer r5 = X.C05F.A0N
            if (r0 == r5) goto Lc4
            X.3Rc r0 = r6.A00
            if (r0 != 0) goto Lc4
            X.0do r0 = r6.A03     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L19
            X.AH5 r0 = (X.AH5) r0     // Catch: java.lang.Throwable -> L19
            X.3SN r1 = r0.A01()     // Catch: java.lang.Throwable -> L19
            goto L1f
        L19:
            r0 = move-exception
            X.0e5 r1 = new X.0e5
            r1.<init>(r0)
        L1f:
            boolean r0 = r1 instanceof X.C09540e5
            if (r0 == 0) goto L24
            r1 = 0
        L24:
            X.3SN r1 = (X.C3SN) r1
            r4 = 1
            if (r1 == 0) goto L46
            boolean r0 = r1.A02
            if (r0 != r4) goto L46
            java.lang.Object r2 = r1.A00
            if (r2 == 0) goto L46
            com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams r2 = (com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams) r2
            if (r2 == 0) goto L41
        L35:
            X.AYg r1 = new X.AYg
            r1.<init>(r2)
            X.3Rc r0 = new X.3Rc
            r0.<init>(r1)
            r6.A00 = r0
        L41:
            java.lang.Integer r0 = X.C05F.A0C
            r6.A01 = r0
            return
        L46:
            com.instagram.common.session.UserSession r3 = r6.A04
            X.94h r1 = X.AbstractC2046994d.A00(r3)
            X.AYh r2 = r6.A02
            java.util.List r0 = X.AbstractC166987dD.A1J(r2)
            X.3SN r1 = r1.A01(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto Laf
            X.OKP r1 = X.AbstractC53716Np5.A00(r3)
            r0 = 2
            X.C14360o3.A0B(r1, r0)     // Catch: java.lang.Exception -> L9f
            X.B6K r0 = X.B6K.A00     // Catch: java.lang.Exception -> L9f
            X.0sx r0 = X.AbstractC09440dt.A01(r0)     // Catch: java.lang.Exception -> L9f
            X.3SN r3 = X.AHQ.A00(r1, r2, r0)     // Catch: java.lang.Exception -> L9f
            boolean r0 = r3.A02
            if (r0 == 0) goto L8c
            java.lang.Object r2 = r3.A00
            if (r2 == 0) goto L8c
            X.3Tc r2 = (X.InterfaceC73913Tc) r2
            if (r2 == 0) goto L41
            X.0do r0 = r6.A03     // Catch: java.lang.Exception -> L87
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L87
            X.AH5 r1 = (X.AH5) r1     // Catch: java.lang.Exception -> L87
            r0 = r2
            com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams r0 = (com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams) r0     // Catch: java.lang.Exception -> L87
            r1.A02(r0)     // Catch: java.lang.Exception -> L87
            goto L35
        L87:
            r0 = move-exception
            r0.getMessage()
            goto L35
        L8c:
            java.lang.String r1 = "Failed to parse lite nn params from loaded model: "
            java.lang.String r0 = r3.A01
            r6.A01 = r5
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            X.C14360o3.A0B(r1, r4)
            X.5J4 r0 = new X.5J4
            r0.<init>(r1)
            throw r0
        L9f:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse nn params with exception: "
            java.lang.String r1 = X.AbstractC166997dE.A0y(r0, r1)
            X.C14360o3.A0B(r1, r4)
            X.5J4 r0 = new X.5J4
            r0.<init>(r1)
            throw r0
        Laf:
            java.lang.String r2 = "Failed to load pyTroch module and model "
            java.lang.String r1 = r1.A01
            java.lang.Integer r0 = X.C05F.A01
            r6.A01 = r0
            java.lang.String r1 = X.AnonymousClass001.A0R(r2, r1)
            X.C14360o3.A0B(r1, r4)
            X.5J4 r0 = new X.5J4
            r0.<init>(r1)
            throw r0
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23967Ak1.A01():void");
    }

    @Override // X.BDT
    public final void ChG() {
        A01();
    }

    @Override // X.BDT
    public final boolean Cpl() {
        return AbstractC167007dF.A1X(A00(), C05F.A0C);
    }

    @Override // X.BDT
    public final C3SN EJG(List list) {
        A01();
        C73513Rc c73513Rc = this.A00;
        if (c73513Rc != null) {
            return c73513Rc.E5A(null, list);
        }
        throw new Exception("LiteNN predictor was not ready");
    }
}
