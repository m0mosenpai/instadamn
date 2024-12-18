package X;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: X.2YR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YR implements C2YS {
    public final C78473fD A00;
    public final Object A01;

    @Override // X.C2YS
    public final C2XH BoZ() {
        Context context = this.A00.A04;
        C75683aZ c75683aZ = C2XF.A01;
        Configuration configuration = context.getResources().getConfiguration();
        C14360o3.A07(configuration);
        return new C2XH(context, c75683aZ.A00(configuration));
    }

    public C2YR(C78473fD c78473fD, Object obj) {
        this.A00 = c78473fD;
        this.A01 = obj;
    }
}
