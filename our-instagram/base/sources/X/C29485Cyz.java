package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cyz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29485Cyz implements InterfaceC30961DjI {
    public C05A A00 = AbstractC25225BEi.A1H(new C31(C05F.A0C, C16930sl.A00));
    public final UserSession A01;

    @Override // X.InterfaceC30961DjI
    public final void E5P() {
        C40921uz A00 = AbstractC40751ui.A00(this.A01);
        if (A00.A0C()) {
            A00.A0K(C31518Dt2.A00, new C29534Czm(1, A00, this), AbstractC111324zv.A00(115), true, false);
            return;
        }
        this.A00.Egh(new C31(C05F.A00, A00(A00, this)));
    }

    public C29485Cyz(FoaUserSession foaUserSession) {
        this.A01 = AbstractC28057CYl.A00(foaUserSession);
    }

    public static final List A00(C40921uz c40921uz, C29485Cyz c29485Cyz) {
        ArrayList A1E = AbstractC166987dD.A1E();
        CallerContext callerContext = C31518Dt2.A00;
        A1E.addAll(c40921uz.A02(callerContext, "FACEBOOK"));
        if (AbstractC54472f1.A04(18312632449120520L, true) && AbstractC54472f1.A04(18314797112115325L, false)) {
            A1E.addAll(c40921uz.A02(callerContext, "THREADS"));
        }
        ArrayList A00 = C31518Dt2.A00(c29485Cyz.A01, A1E);
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            C14360o3.A0A(map);
            A0q.add(AbstractC34363FDf.A00(map));
        }
        return A0q;
    }
}
