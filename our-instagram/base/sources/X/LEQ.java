package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LEQ {
    public static final List A02 = AbstractC16960so.A1Q(EnumC46248KdP.A0C, EnumC46248KdP.A07, EnumC46248KdP.A06, EnumC46248KdP.A0B);
    public final C2056398n A00;
    public final java.util.Set A01;

    public LEQ(UserSession userSession) {
        EnumC46248KdP[] enumC46248KdPArr = (EnumC46248KdP[]) A02.toArray(new EnumC46248KdP[0]);
        this.A01 = AbstractC16830sb.A06(Arrays.copyOf(enumC46248KdPArr, enumC46248KdPArr.length));
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        this.A00 = A00;
        java.util.Set A002 = C2056398n.A00(A00, "pending_inbox_customized_top_filters", new HashSet(0));
        if (AbstractC31171DnF.A1b(A002)) {
            java.util.Set set = this.A01;
            set.clear();
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                Integer valueOf = Integer.valueOf(AbstractC166987dD.A1B(it));
                C14360o3.A0A(valueOf);
                Object obj = EnumC46248KdP.A03.get(valueOf);
                if (obj != null) {
                    set.add(obj);
                }
            }
        }
    }
}
