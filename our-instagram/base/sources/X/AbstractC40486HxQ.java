package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HxQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40486HxQ {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C120985dq c120985dq;
        List list;
        C38321qM c38321qM;
        C37771pE c37771pE;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, AbstractC111324zv.A00(8));
        List list2 = (List) A02;
        int A0D = AbstractC25230BEn.A0D(c6fw.A00(), "null cannot be cast to non-null type kotlin.Number");
        Object A032 = c6fw.A03(4);
        AbstractC25225BEi.A1S(A032);
        String str = (String) A032;
        if (A0D >= 0 && A0D < list2.size()) {
            UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
            ArrayList<C37771pE> A0i = AbstractC167007dF.A0i(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                try {
                    c37771pE = AbstractC38741r6.parseFromJson(C07950bF.A04.A01(userSession, AbstractC166987dD.A1B(it)));
                } catch (IOException unused) {
                    c37771pE = null;
                }
                A0i.add(c37771pE);
            }
            ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
            for (C37771pE c37771pE2 : A0i) {
                if (c37771pE2 != null && (list = c37771pE2.A1k) != null && (c38321qM = (C38321qM) AbstractC001800i.A0J(list)) != null) {
                    c120985dq = C128085qc.A02(c38321qM);
                } else {
                    c120985dq = null;
                }
                A0i2.add(c120985dq);
            }
            C120985dq c120985dq2 = (C120985dq) A0i2.get(A0D);
            if (c120985dq2 != null) {
                List A0X = AbstractC001800i.A0X(A0i2);
                String moduleName = C6BQ.A07(c6fg).getModuleName();
                String str2 = C1M3.A00().A00;
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A2N, userSession);
                c116875Qr.A1D = AbstractC25231BEo.A0s(c120985dq2.A02);
                c116875Qr.A1G = str2;
                c116875Qr.A1S = false;
                c116875Qr.A1N = false;
                c116875Qr.A1d = false;
                c116875Qr.A0q = moduleName;
                c116875Qr.A16 = str;
                ClipsViewerConfig A00 = c116875Qr.A00();
                C62832tM A002 = AbstractC62822tL.A00(userSession);
                C14360o3.A07(A002);
                A002.A02(str2);
                A002.A08(str2, A0X, false, false);
                AbstractC86593tX.A0X(C6BQ.A03(c6fg), A00, userSession);
            }
        }
        return null;
    }
}
