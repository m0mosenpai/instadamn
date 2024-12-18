package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HxP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40485HxP {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Ila, X.3hF, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        View view;
        C102884kP c102884kP;
        List list = c6fw.A00;
        Object obj = list.get(0);
        if ((obj instanceof C102884kP) && (c102884kP = (C102884kP) obj) != null) {
            view = c102884kP.A05(c6fq.A03);
        } else {
            view = null;
        }
        String A0s = AbstractC31173DnH.A0s(list, 1);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        AbstractC12990ll abstractC12990ll = null;
        if (A0B instanceof UserSession) {
            abstractC12990ll = A0B;
        }
        if (view != null && abstractC12990ll != null) {
            C71313Hs A07 = AbstractC37301Gc2.A07(abstractC12990ll);
            C14360o3.A0A(A0s);
            C14360o3.A0B(A0s, 1);
            ?? obj2 = new Object();
            obj2.A00 = A0s;
            obj2.A01 = true;
            A07.A0A(view, obj2);
            A07.A0B(view, new String[0]);
        }
        return null;
    }
}
