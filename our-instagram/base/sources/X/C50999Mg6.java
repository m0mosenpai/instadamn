package X;

import android.content.Context;
import androidx.paging.PagingDataAdapter;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Mg6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50999Mg6 extends AbstractC52922bZ {
    public C31349DqE A00;
    public boolean A01;
    public boolean A02;
    public final OEC A03;
    public final O6P A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final UserSession A08;

    public C50999Mg6(UserSession userSession, OEC oec, O6P o6p) {
        C14360o3.A0B(userSession, 1);
        this.A08 = userSession;
        this.A03 = oec;
        this.A04 = o6p;
        C24721Ip A0s = MSY.A0s();
        this.A05 = A0s;
        this.A06 = AbstractC07080Za.A03(A0s);
        this.A07 = C10E.A00(null);
        AbstractC166987dD.A1Z(new PXT(this, null, 4), AbstractC141776au.A00(this));
    }

    public static final void A00(Context context, C120985dq c120985dq, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, EnumC77213d7 enumC77213d7, Gt6 gt6, C50999Mg6 c50999Mg6, Map map) {
        Integer num;
        String str;
        String str2;
        C38321qM c38321qM2;
        EnumC77213d7 enumC77213d72 = EnumC77213d7.A04;
        O6P o6p = c50999Mg6.A04;
        ArrayList A12 = AbstractC166997dE.A12(c120985dq, 0);
        C05A c05a = o6p.A00;
        Collection collection = (Collection) c05a.getValue();
        if (enumC77213d7 == enumC77213d72) {
            A12.addAll(collection);
            num = C05F.A00;
        } else {
            A12.addAll(collection);
            num = C05F.A01;
        }
        A12.add(new C51759Mti(c120985dq, num));
        c05a.Egh(A12);
        c38321qM.Ed3(enumC77213d7);
        AbstractC166987dD.A1Z(new MC0(c50999Mg6, enumC77213d7, c38321qM, context, interfaceC60442pS, userSession, null, 11), AbstractC141776au.A00(c50999Mg6));
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (!C14360o3.A0K(A1K.getKey(), "saved")) {
                int size = ((PagingDataAdapter) A1K.getValue()).A01().size();
                for (int i = 0; i < size; i++) {
                    String id = c38321qM.getId();
                    C120985dq c120985dq2 = (C120985dq) AbstractC001800i.A0O(((PagingDataAdapter) A1K.getValue()).A01(), i);
                    if (c120985dq2 != null && (c38321qM2 = c120985dq2.A02) != null) {
                        str = c38321qM2.getId();
                    } else {
                        str = null;
                    }
                    if (C14360o3.A0K(id, str)) {
                        Iterator A13 = AbstractC166997dE.A13(gt6.A01);
                        while (A13.hasNext()) {
                            C38514GwZ c38514GwZ = (C38514GwZ) AbstractC166997dE.A0l(A13);
                            C38321qM c38321qM3 = c38514GwZ.A00;
                            if (c38321qM3 != null) {
                                str2 = c38321qM3.getId();
                            } else {
                                str2 = null;
                            }
                            if (C14360o3.A0K(str2, c38321qM.getId())) {
                                if (enumC77213d7 == enumC77213d72) {
                                    c38514GwZ.A00();
                                } else {
                                    c38514GwZ.A01();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
