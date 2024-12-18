package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dve, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31673Dve implements InterfaceC169117gk {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC169117gk
    public final Object E7Q(String str) {
        C14360o3.A0B(str, 0);
        boolean z = this.A02;
        if (!z && str.length() == 0) {
            return "";
        }
        C31675Dvg c31675Dvg = new C31675Dvg(this.A00, this.A01, "coefficient_direct_recipients_ranking_variant_2", new C31680Dvl(this, 5), z, this.A03, this.A04);
        c31675Dvg.A04(str);
        return c31675Dvg;
    }

    @Override // X.InterfaceC169117gk
    public final /* bridge */ /* synthetic */ Object AIV(Object obj, Object obj2) {
        List list = (List) obj2;
        Context context = this.A00;
        UserSession userSession = this.A01;
        if (list == null) {
            list = C16930sl.A00;
        }
        ArrayList A01 = AbstractC31677Dvi.A01(context, userSession, list);
        C31675Dvg c31675Dvg = (C31675Dvg) obj;
        if (c31675Dvg != null) {
            c31675Dvg.A02(A01);
            return c31675Dvg.A02(A01);
        }
        return new C31671Dvc(C16930sl.A00, A01);
    }

    @Override // X.InterfaceC169117gk
    public final /* bridge */ /* synthetic */ Object ARP() {
        C16930sl c16930sl = C16930sl.A00;
        return new C31671Dvc(c16930sl, c16930sl);
    }

    public C31673Dve(Context context, UserSession userSession, boolean z, boolean z2, boolean z3) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
    }
}
