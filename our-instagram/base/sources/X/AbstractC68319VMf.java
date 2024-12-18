package X;

import android.content.Context;

/* renamed from: X.VMf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68319VMf {
    public static final C66213U4j A00(Context context, EnumC191908em enumC191908em, String str, boolean z) {
        AbstractC167017dG.A1R(str, enumC191908em);
        float A01 = C6BE.A01(str);
        int A03 = AbstractC25291Lj.A03(EnumC72394Xcg.A2M, z);
        C71174WpD c71174WpD = new C71174WpD(z);
        EnumC68205VFx enumC68205VFx = EnumC68205VFx.A08;
        float[] fArr = new float[8];
        fArr[0] = A01;
        AbstractC43594JPz.A1U(fArr, A01, 1);
        AbstractC167017dG.A1X(fArr, A01);
        return new C66213U4j(context, enumC191908em, enumC68205VFx, c71174WpD, fArr, 0.08f, A03);
    }
}
