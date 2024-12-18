package X;

import com.instagram.user.model.User;
import java.util.BitSet;

/* renamed from: X.2EM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EM extends C2EN {
    @Override // X.C2EO
    public final /* bridge */ /* synthetic */ BitSet A00(Object obj, int i) {
        C2EC c2ec = (C2EC) obj;
        C14360o3.A0B(c2ec, 0);
        BitSet bitSet = new BitSet(30);
        if (c2ec.CZH()) {
            C4H8.A00(C4H7.A00(c2ec.C7l()), bitSet);
        }
        for (User user : c2ec.BSH()) {
            C4H8.A00(C4H7.A00(user.getUsername()), bitSet);
            C4H8.A00(C4H7.A00(user.A03.getFullName()), bitSet);
        }
        return bitSet;
    }
}
