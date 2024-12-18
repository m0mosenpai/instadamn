package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GrP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38220GrP {
    public static final ArrayList A00(C120985dq c120985dq) {
        ImmutableList copyOf;
        EnumC41091vH enumC41091vH;
        C84923qg A1V;
        String str;
        HashMap A01;
        C84923qg A1V2;
        EnumC41091vH enumC41091vH2;
        List list = c120985dq.A06().A0k;
        if (list == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        Map A0L = AbstractC41071vF.A0L(copyOf);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A15 = AbstractC166997dE.A15(A0L);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            EnumC41091vH enumC41091vH3 = (EnumC41091vH) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            int ordinal = enumC41091vH3.ordinal();
            if (ordinal != 9) {
                if (ordinal != 16) {
                    if (ordinal != 11) {
                        if (ordinal != 12) {
                            A01 = A01(enumC41091vH3, intValue);
                            A1E.add(A01);
                        } else {
                            enumC41091vH2 = EnumC41091vH.A0O;
                        }
                    } else {
                        enumC41091vH2 = EnumC41091vH.A0N;
                    }
                    A01 = A01(enumC41091vH2, intValue);
                    A1E.add(A01);
                } else {
                    enumC41091vH = EnumC41091vH.A0M;
                    C38321qM c38321qM = c120985dq.A06().A0K;
                    if (c38321qM == null || (A1V2 = c38321qM.A1V()) == null || A1V2.A0f == null) {
                        intValue = 1250001;
                    }
                }
            } else {
                enumC41091vH = EnumC41091vH.A04;
                C38321qM c38321qM2 = c120985dq.A06().A0K;
                if (c38321qM2 == null || (A1V = c38321qM2.A1V()) == null || (str = A1V.A0e) == null || str.length() == 0) {
                    intValue = 840001;
                }
            }
            A01 = A01(enumC41091vH, intValue);
            A1E.add(A01);
        }
        return A1E;
    }

    public static final HashMap A01(EnumC41091vH enumC41091vH, int i) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("optimization_type", String.valueOf(enumC41091vH.A00));
        A1G.put("option_value", String.valueOf(i));
        return A1G;
    }
}
