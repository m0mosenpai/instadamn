package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Aol, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24219Aol implements BE4 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // X.BE4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CO6(X.AnonymousClass904 r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L22
            X.911 r2 = r4.A02
            if (r2 == 0) goto L23
            java.lang.String r1 = r2.A00
        L9:
            r3.A00 = r1
            if (r2 == 0) goto L20
            java.lang.String r1 = r2.A01
        Lf:
            r3.A01 = r1
            if (r2 == 0) goto L1e
            java.lang.String r1 = r2.A02
        L15:
            r3.A02 = r1
            if (r2 == 0) goto L1b
            java.lang.String r0 = r2.A03
        L1b:
            r3.A03 = r0
            return
        L1e:
            r1 = r0
            goto L15
        L20:
            r1 = r0
            goto Lf
        L22:
            r2 = r0
        L23:
            r1 = r0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24219Aol.CO6(X.904):void");
    }

    @Override // X.BE4
    public final List Epn() {
        return null;
    }

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC61636Rr0.A00(AbstractC167007dF.A0o("serviceType", 36), AbstractC166987dD.A1L("detectionInitNetPath", this.A00), AbstractC166987dD.A1L("detectionPredictNetPath", this.A01), AbstractC166987dD.A1L("pointerInitNetPath", this.A02), AbstractC166987dD.A1L("pointerPredictNetPath", this.A03));
    }
}
