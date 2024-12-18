package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ibb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41645Ibb {
    public final FragmentActivity A00;
    public final C25671My A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final String A04;
    public final C1M1 A05;

    public final void A01(Fragment fragment, C38321qM c38321qM, int i, int i2) {
        A00(c38321qM, i, i2);
        EUT eut = new EUT(i, 2, c38321qM, this);
        if (fragment != null) {
            Context applicationContext = this.A00.getApplicationContext();
            UserSession userSession = this.A02;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            interfaceC60442pS.getClass();
            AbstractC35273Fh8.A02(applicationContext, eut, userSession, c38321qM, interfaceC60442pS, EnumC77213d7.A04, this.A04, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.ICf, java.lang.Object] */
    private void A00(C38321qM c38321qM, int i, int i2) {
        UserSession userSession = this.A02;
        if (!SaveApiUtil.A09(userSession, c38321qM)) {
            C172077lc A00 = C172077lc.A00(userSession);
            Integer num = C05F.A01;
            String A002 = AbstractC111324zv.A00(3038);
            InterfaceC60442pS interfaceC60442pS = this.A03;
            interfaceC60442pS.getClass();
            A00.A01(AbstractC123975jB.A02(interfaceC60442pS, c38321qM, num, A002, true));
            EnumC77213d7 enumC77213d7 = EnumC77213d7.A04;
            FragmentActivity fragmentActivity = this.A00;
            C1M1 c1m1 = this.A05;
            C14360o3.A0B(userSession, 6);
            SaveApiUtil.A04(fragmentActivity, fragmentActivity, userSession, c38321qM, interfaceC60442pS, null, enumC77213d7, null, c1m1, null, null, null, i2, i, -1);
            C25671My c25671My = this.A01;
            ?? obj = new Object();
            obj.A00 = c38321qM;
            c25671My.E4s(AbstractC40790I5s.A00(obj));
            C1VN c1vn = C1VN.A00;
            if (c1vn != null) {
                c1vn.A02(userSession, fragmentActivity, AbstractC111324zv.A00(1477));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r5.isEmpty() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(androidx.fragment.app.Fragment r34, X.C38321qM r35, com.instagram.save.model.SavedCollection r36, java.lang.String r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41645Ibb.A02(androidx.fragment.app.Fragment, X.1qM, com.instagram.save.model.SavedCollection, java.lang.String, int, int):void");
    }

    public final void A03(Fragment fragment, C38321qM c38321qM, String str, String str2, int i, int i2, int i3) {
        InterfaceC60442pS interfaceC60442pS = this.A03;
        interfaceC60442pS.getClass();
        UserSession userSession = this.A02;
        List asList = Arrays.asList(c38321qM);
        AbstractC25233BEq.A0v(1, userSession, str, asList);
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it);
            C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, A0i, interfaceC60442pS, "add_to_collection");
            A0F.A6x = str;
            C32U.A0E(userSession, A0F, A0i, interfaceC60442pS, 0);
        }
        A00(c38321qM, i, i2);
        try {
            String moduleName = interfaceC60442pS.getModuleName();
            List asList2 = Arrays.asList(c38321qM.getId());
            HG9 hg9 = new HG9(fragment, c38321qM, this, str2, str, i, i2, i3);
            C25621Ms A00 = AbstractC35217FgA.A00(null, userSession, null, false, str, moduleName, null, null, null, null, asList2);
            A00.A0B(AbstractC111324zv.A00(4125));
            C1ON A0N = A00.A0N();
            A0N.A00 = new C31456Ds0(44, hg9, userSession);
            C1GJ.A03(A0N);
        } catch (IOException unused) {
            FragmentActivity fragmentActivity = this.A00;
            C9GR.A03(fragmentActivity, AbstractC166997dE.A0r(fragmentActivity.getResources(), str, 2131956945), "create_collection_failure_notification", 1);
        }
    }

    public C41645Ibb(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        String str;
        this.A00 = fragment.requireActivity();
        this.A01 = AbstractC25651Mw.A00(userSession);
        this.A03 = interfaceC60442pS;
        this.A02 = userSession;
        this.A05 = c1m1;
        if (userSession != null && interfaceC60442pS != null) {
            str = AbstractC61112qZ.A00(fragment.mArguments);
        } else {
            str = null;
        }
        this.A04 = str;
    }
}
