package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.user.model.Product;

/* renamed from: X.Hxi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40500Hxi {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP = (C102884kP) c6fw.A00.get(0);
        if (c102884kP == null) {
            AbstractC25241Le.A02("IgBloksExtensions", "missing parameter: product in bk.action.ig.cxf.ShareProduct");
        } else {
            Product A01 = AbstractC41287IPc.A01(c102884kP);
            UserSession A0W = AbstractC31172DnG.A0W(c6fq);
            FragmentActivity A04 = C6BQ.A04(c6fq);
            InterfaceC11380iw A08 = C6BQ.A08(c6fq);
            C14360o3.A0B(A0W, 0);
            AbstractC167007dF.A1D(A04, 1, A08);
            C34726FRp A07 = C28531Zo.A04.A02.A07(new C42581Isz(A08), A0W, C2EY.A1a);
            A07.A07.putParcelable(MSV.A00(25), A01);
            DirectShareSheetFragment A00 = A07.A00();
            C3DN A0r = AbstractC31172DnG.A0r(A04);
            if (A0r != null) {
                A0r.A0K(A00);
                return null;
            }
        }
        return null;
    }
}
