package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ez2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33961Ez2 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        Object obj = list.get(0);
        String A0s = AbstractC31173DnH.A0s(list, 1);
        String A0s2 = AbstractC31173DnH.A0s(list, 2);
        String A0l = AbstractC31180DnO.A0l(list);
        String A0s3 = AbstractC31173DnH.A0s(list, 4);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        if (C28321Yt.A01 != null && obj != null) {
            VEB A00 = VVB.A00(A0s);
            if (AbstractC43591JPw.A00(1403).equals(obj)) {
                F8K.A00().A00(A04, A0K, A00, A0s2, A0l, A0s3);
                return null;
            }
            return null;
        }
        return null;
    }
}
