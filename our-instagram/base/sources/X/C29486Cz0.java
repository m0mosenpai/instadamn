package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cz0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29486Cz0 implements InterfaceC30961DjI {
    public C05A A00;
    public final Context A01;
    public final UserSession A02;

    public static final ArrayList A00(C40921uz c40921uz, C29486Cz0 c29486Cz0) {
        CallerContext callerContext = C31518Dt2.A00;
        List A02 = c40921uz.A02(callerContext, "FACEBOOK");
        UserSession userSession = c29486Cz0.A02;
        ArrayList A00 = C31518Dt2.A00(userSession, A02);
        ArrayList A0i = AbstractC167007dF.A0i(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            C14360o3.A0A(map);
            A0i.add(AbstractC34363FDf.A00(map));
        }
        List<FxCalAccountWithSwitcherInfo> A022 = c40921uz.A02(callerContext, "INSTAGRAM");
        ArrayList A0i2 = AbstractC167007dF.A0i(A022);
        for (FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo : A022) {
            AbstractC166997dE.A1R(fxCalAccountWithSwitcherInfo.A0B, fxCalAccountWithSwitcherInfo.A07, A0i2);
        }
        Map A08 = AbstractC06930Yk.A08(A0i2);
        ArrayList A01 = C105894q0.A01.A01(c29486Cz0.A01, userSession);
        ArrayList A0i3 = AbstractC167007dF.A0i(A01);
        Iterator it2 = A01.iterator();
        while (it2.hasNext()) {
            A0i3.add(AbstractC34363FDf.A00((Map) it2.next()));
        }
        ArrayList<UserAccountInfo> A1E = AbstractC166987dD.A1E();
        for (Object obj : A0i3) {
            UserAccountInfo userAccountInfo = (UserAccountInfo) obj;
            if (C14360o3.A0K(userAccountInfo.A09, "CURRENT") || A08.containsKey(userAccountInfo.A0A)) {
                A1E.add(obj);
            }
        }
        ArrayList A0i4 = AbstractC167007dF.A0i(A1E);
        for (UserAccountInfo userAccountInfo2 : A1E) {
            userAccountInfo2.A00 = (String) A08.get(userAccountInfo2.A0A);
            A0i4.add(userAccountInfo2);
        }
        return AbstractC001800i.A0S(A0i, A0i4);
    }

    public static final List A01(C29486Cz0 c29486Cz0, List list) {
        String str = c29486Cz0.A02.userId;
        if (str != null) {
            ArrayList A00 = CJ6.A00(str);
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (AbstractC001800i.A0u(A00, ((UserAccountInfo) obj).A00)) {
                    A1E.add(obj);
                }
            }
            return AbstractC001800i.A0g(A1E, new C31460Ds4(A00, 21));
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC30961DjI
    public final void E5P() {
        C40921uz A00 = AbstractC40751ui.A00(this.A02);
        if (A00.A0C()) {
            A00.A0K(C31518Dt2.A00, new C29534Czm(2, A00, this), AbstractC111324zv.A00(115), true, false);
            return;
        }
        ArrayList A002 = A00(A00, this);
        this.A00.Egh(new C33(A002, A01(this, A002), 0));
    }

    public C29486Cz0(Context context, FoaUserSession foaUserSession) {
        this.A01 = context;
        this.A02 = AbstractC28057CYl.A00(foaUserSession);
        C16930sl c16930sl = C16930sl.A00;
        this.A00 = AbstractC25225BEi.A1H(new C33(c16930sl, c16930sl, 0));
    }
}
