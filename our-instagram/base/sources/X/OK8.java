package X;

import android.os.Bundle;
import com.instagram.api.schemas.IGRevShareProductType;
import java.util.List;

/* loaded from: classes9.dex */
public final class OK8 {
    public final C52140N5p A00(List list) {
        C52140N5p c52140N5p = new C52140N5p();
        AbstractC25233BEq.A15(c52140N5p, "ARGUMENT_PRODUCT_ELIGIBILITY_LIST", list);
        return c52140N5p;
    }

    public final NQ4 A01(IGRevShareProductType iGRevShareProductType, String str, String str2) {
        NQ4 nq4 = new NQ4();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("ARGUMENT_ENTRY_POINT", str);
        A0b.putString("ARGUMENT_ENTRY_EXTRA", str2);
        A0b.putParcelable("ARGUMENT_PRODUCT_TYPE", iGRevShareProductType);
        nq4.setArguments(A0b);
        return nq4;
    }
}
