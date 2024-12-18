package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Aom, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24220Aom implements BE4 {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C90m.A04;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                C90m c90m = (C90m) anonymousClass904.A02(c203848zt);
                this.A01 = c90m.A01;
                this.A03 = c90m.A03;
                this.A02 = c90m.A02;
                this.A00 = Integer.valueOf(AbstractC224859wA.A00(c90m.A00));
            }
        }
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
        return AbstractC61636Rr0.A00(AbstractC167007dF.A0o("serviceType", 32), AbstractC166987dD.A1L("accessToken", this.A01), AbstractC166987dD.A1L("userAgent", this.A03), AbstractC166987dD.A1L("sandbox", this.A02), AbstractC166987dD.A1L("schemaType", this.A00));
    }
}
