package X;

import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderContextType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class Hx8 {
    public static final C45051Jwg A00(C38634Gyb c38634Gyb) {
        C38615GyI c38615GyI;
        User user;
        JJ2 jj2;
        C14360o3.A0B(c38634Gyb, 0);
        String str = c38634Gyb.A04;
        String str2 = c38634Gyb.A03;
        ThreadHeaderStyle threadHeaderStyle = c38634Gyb.A02;
        List list = c38634Gyb.A05;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC46633KkA.A00((C45150Jyq) it.next()));
        }
        ThreadContainerType threadContainerType = c38634Gyb.A00;
        JJ1 jj1 = c38634Gyb.A01;
        if (jj1 != null) {
            C38802H6r c38802H6r = (C38802H6r) jj1;
            ThreadHeaderContextType threadHeaderContextType = c38802H6r.A01;
            String str3 = c38802H6r.A02;
            String str4 = c38802H6r.A03;
            JJ3 jj3 = c38802H6r.A00;
            if (jj3 != null && (jj2 = ((C38804H6t) jj3).A00) != null) {
                user = ((C38803H6s) jj2).A00;
            } else {
                user = null;
            }
            c38615GyI = new C38615GyI(threadHeaderContextType, user, str3, str4);
        } else {
            c38615GyI = null;
        }
        return new C45051Jwg(threadContainerType, threadHeaderStyle, c38615GyI, str, str2, A0q);
    }
}
