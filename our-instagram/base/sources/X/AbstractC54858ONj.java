package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ONj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54858ONj {
    public static final LinkedHashMap A00(ReelStore reelStore, User user, Integer num, Integer num2, List list) {
        Integer num3;
        C14360o3.A0B(reelStore, 1);
        int i = 3;
        if (num.intValue() != 0) {
            i = 4;
        }
        List<C51665Mrw> A00 = C50583MUt.A00(list, i);
        int i2 = 0;
        if (num2 != null) {
            int intValue = num2.intValue();
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                i2 += ((C51665Mrw) it.next()).A00;
            }
            i2 = intValue - i2;
        }
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (i2 > 0 && num == C05F.A00) {
            A01(A1I, i2);
        }
        for (C51665Mrw c51665Mrw : A00) {
            String str = c51665Mrw.A04;
            if (str != null) {
                C1N9 c1n9 = new C1N9(user);
                int i3 = c51665Mrw.A00;
                ReelType reelType = c51665Mrw.A03;
                Reel A0M = reelStore.A0M(str);
                if (A0M == null || ((num3 = A0M.A0e) != null && !num3.equals(Integer.valueOf(i3)))) {
                    A0M = new Reel((C1NB) c1n9, str, true);
                    A0M.A1W = false;
                    A0M.A0P = reelType;
                    ReelStore.A0B(A0M, reelStore, A0M.getId());
                }
                A1I.put(A0M.getId(), new C3AY(c51665Mrw, A0M));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        if (i2 > 0 && num == C05F.A01) {
            A01(A1I, i2);
        }
        return A1I;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Mrw, java.lang.Object] */
    public static final void A01(Map map, int i) {
        ?? obj = new Object();
        obj.A04 = null;
        obj.A01 = 0L;
        obj.A00 = 0;
        obj.A02 = null;
        obj.A03 = null;
        obj.A00 = i;
        map.put("placeholder", new C3AY(obj, new Reel((C1NB) null, "placeholder", false)));
    }
}
