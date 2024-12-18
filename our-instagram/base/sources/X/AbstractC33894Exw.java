package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.AbstractMap;

/* renamed from: X.Exw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33894Exw {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0y;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            FragmentActivity A03 = C6BQ.A03(c6fg);
            Object obj = c6fw.A00.get(0);
            C14360o3.A0C(obj, AbstractC43591JPw.A00(435));
            AbstractMap abstractMap = (AbstractMap) obj;
            Object obj2 = abstractMap.get("permalink");
            AbstractC25225BEi.A1S(obj2);
            String str = (String) obj2;
            UserSession A0L = AbstractC31179DnN.A0L(c6fq);
            try {
                C38821rE parseFromJson = AbstractC38811rD.parseFromJson(C16V.A00(AbstractC31175DnJ.A0d(abstractMap)));
                C38801rC c38801rC = C38321qM.A0h;
                C14360o3.A0A(parseFromJson);
                C38321qM c38321qM = new C38321qM(new C37761pD(null), parseFromJson);
                String id = c38321qM.getId();
                if (id != null) {
                    C34726FRp A08 = C28531Zo.A04.A02.A08(A0L, C2EY.A1j, AbstractC111324zv.A00(2509));
                    A08.A04 = c38321qM;
                    A08.A07(str);
                    A08.A06(id);
                    AbstractC31176DnK.A0x(A03, A08.A00(), C3DN.A00);
                }
                return null;
            } catch (IOException e) {
                C18950wb c18950wb = C18950wb.A01;
                if (e.getMessage() == null) {
                    A0y = "Failed to parse media dict";
                } else {
                    A0y = AbstractC166997dE.A0y("Failed to parse media dict: ", e);
                }
                AbstractC166987dD.A1T(c18950wb, A0y, 817905368);
                return null;
            }
        }
        throw AbstractC166997dE.A0g();
    }
}
