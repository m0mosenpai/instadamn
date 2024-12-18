package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aon, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24221Aon implements BE4 {
    public Boolean A00;
    public String A01;
    public String A02;
    public final EnumC150506pz A03;
    public final List A04 = AbstractC166987dD.A1E();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    @Override // X.BE4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CO6(X.AnonymousClass904 r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L32
            X.6pz r1 = r3.A03
            X.6pz r0 = X.EnumC150506pz.A0a
            if (r1 != r0) goto L32
            X.8zt r1 = X.C9Y4.A03
            boolean r0 = X.AnonymousClass904.A01(r4, r1)
            if (r0 == 0) goto L32
            X.8zs r1 = r4.A02(r1)
        L15:
            X.9Y4 r1 = (X.C9Y4) r1
            if (r1 == 0) goto L30
            java.lang.String r0 = r1.A00
        L1b:
            r3.A01 = r0
            if (r1 == 0) goto L2e
            java.lang.String r0 = r1.A01
        L21:
            r3.A02 = r0
            if (r1 == 0) goto L2b
            boolean r0 = r1.A02
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L2b:
            r3.A00 = r2
            return
        L2e:
            r0 = r2
            goto L21
        L30:
            r0 = r2
            goto L1b
        L32:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24221Aon.CO6(X.904):void");
    }

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167027dH.A09("isFullyAsync", this.A00, AbstractC167007dF.A0o("serviceType", 34), AbstractC166987dD.A1L("initNetPath", this.A01), AbstractC166987dD.A1L("predictNetPath", this.A02));
    }

    @Override // X.BE4
    public final List Epn() {
        List list = this.A04;
        ArrayList A0U = AbstractC001800i.A0U(list);
        list.clear();
        return A0U;
    }

    public C24221Aon(EnumC150506pz enumC150506pz) {
        this.A03 = enumC150506pz;
    }
}
