package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U1w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66155U1w {
    public int A00;
    public final int A01;
    public final UserSession A02;
    public final C195218kN A03;

    public final ArrayList A00(String str) {
        ArrayList arrayList = new ArrayList();
        if (this.A00 != 0) {
            List A00 = U32.A00(this.A02, this.A03, str);
            int i = this.A00;
            if (i != -1) {
                U33.A00(A00, i);
            }
            arrayList.addAll(A00);
        }
        return arrayList;
    }

    public C66155U1w(UserSession userSession, int i) {
        this.A02 = userSession;
        this.A01 = i;
        C195218kN A00 = C195218kN.A00(userSession);
        C14360o3.A07(A00);
        this.A03 = A00;
        this.A00 = i;
    }
}
