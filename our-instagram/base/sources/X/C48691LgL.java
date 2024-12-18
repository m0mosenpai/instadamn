package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LgL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48691LgL implements InterfaceC50514MRr {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final boolean A03;

    @Override // X.InterfaceC50514MRr
    public final C09530e4 Brh(C45104JxY c45104JxY) {
        C45214Jzu c45214Jzu;
        ArrayList A12 = AbstractC166997dE.A12(c45104JxY, 0);
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, this.A02, 36609704232097742L);
        if (A07 > 0) {
            int i = this.A00;
            int i2 = -1;
            if (AbstractC167007dF.A1X(c45104JxY.A00, C05F.A00)) {
                i2 = i * A07;
            }
            List list = c45104JxY.A02;
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0i.add(new C45194Jza((C148286ly) ((JWd) it.next()).A00));
            }
            A12.addAll(A0i);
            return AbstractC47846LBo.A01(new C45214Jzu(null, null, EnumC46170Kc8.A03, false, null, 2131960406, false), new C45214Jzu(null, null, EnumC46170Kc8.A04, false, 2131960510, 2131960406, false), c45104JxY, A12, i2);
        }
        List A0d = AbstractC001800i.A0d(c45104JxY.A02, this.A00);
        ArrayList A0i2 = AbstractC167007dF.A0i(A0d);
        Iterator it2 = A0d.iterator();
        while (it2.hasNext()) {
            A0i2.add(new C45194Jza((C148286ly) ((JWd) it2.next()).A00));
        }
        A12.addAll(A0i2);
        if (c45104JxY.A06) {
            c45214Jzu = new C45214Jzu(null, null, EnumC46170Kc8.A04, false, 2131960510, 2131960406, false);
        } else {
            c45214Jzu = new C45214Jzu(null, null, EnumC46170Kc8.A03, false, null, 2131960406, false);
        }
        return AbstractC166987dD.A1L(c45214Jzu, A12);
    }

    @Override // X.InterfaceC50514MRr
    public final boolean Ei7(C45104JxY c45104JxY) {
        C14360o3.A0B(c45104JxY, 0);
        if (this.A03 && AbstractC166987dD.A1b(c45104JxY.A02)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50514MRr
    public final C51753Mtc BEM(int i) {
        return KQB.A00(C05F.A01, C05F.A0C, this.A01.getString(2131960406), R.drawable.instagram_sticker_pano_outline_24, i);
    }

    public C48691LgL(Context context, UserSession userSession, int i, boolean z) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = z;
        this.A00 = i;
    }
}
