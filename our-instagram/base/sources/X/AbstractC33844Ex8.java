package X;

import android.os.Bundle;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Ex8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33844Ex8 {
    public static final Object A00(C6FQ c6fq) {
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        RegFlowExtras regFlowExtras = (RegFlowExtras) A0B.A01(RegFlowExtras.class, GTN.A00);
        AbstractC31172DnG.A1A();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        AbstractC31175DnJ.A0r(A0b, A0B);
        EKC ekc = new EKC();
        ekc.setArguments(A0b);
        return AbstractC31180DnO.A0X(ekc, AbstractC25225BEi.A0r(C6BQ.A04(c6fq), A0B));
    }
}
