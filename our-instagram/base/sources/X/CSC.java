package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class CSC {
    public List A00;
    public final UserSession A01;
    public final C0UO A02;
    public final C05A A03;

    public CSC(Bundle bundle, UserSession userSession) {
        this.A01 = userSession;
        C16930sl c16930sl = C16930sl.A00;
        this.A00 = c16930sl;
        C008002u A1H = AbstractC25225BEi.A1H(new C51755Mte((List) c16930sl, 3));
        this.A03 = A1H;
        this.A02 = AbstractC208910l.A02(A1H);
        if (bundle != null) {
            List parcelableArrayList = bundle.getParcelableArrayList(AbstractC111324zv.A00(310));
            parcelableArrayList = parcelableArrayList == null ? c16930sl : parcelableArrayList;
            this.A00 = parcelableArrayList;
            A1H.F8m(new C51755Mte(parcelableArrayList, 3));
        }
    }
}
