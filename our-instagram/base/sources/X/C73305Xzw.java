package X;

import androidx.media3.common.Timeline;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* renamed from: X.Xzw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73305Xzw {
    public C72851Xp7 A00;
    public ImmutableList A01 = ImmutableList.of();
    public ImmutableMap A02 = RegularImmutableMap.A02;
    public final C72843Xop A03;

    /* JADX WARN: Multi-variable type inference failed */
    public static C72851Xp7 A00(YNE yne, ImmutableList immutableList) {
        int A05;
        Y8T y8t = (Y8T) yne;
        Timeline A04 = AbstractC72048XLo.A04(y8t);
        Y8T.A02(y8t);
        Y4C y4c = y8t.A0A;
        Timeline timeline = y4c.A06;
        if (AbstractC167007dF.A1N(timeline.A02())) {
            A05 = 0;
        } else {
            A05 = timeline.A05(y4c.A09.A04);
        }
        if (AbstractC167007dF.A1N(A04.A02())) {
            Y8T.A02(y8t);
            for (int i = 0; i < immutableList.size(); i++) {
                C72851Xp7 c72851Xp7 = (C72851Xp7) immutableList.get(i);
                Y8T.A02(y8t);
                Y8T.A02(y8t);
                Y8T.A02(y8t);
                MSY.A1S(-1, -1);
                Y8T.A02(y8t);
                Y8T.A02(y8t);
                MSY.A1S(-1, -1);
                if (c72851Xp7.A04.equals(null)) {
                    return c72851Xp7;
                }
            }
            immutableList.isEmpty();
            return null;
        }
        A04.A08(A05);
        throw C00O.createAndThrow();
    }

    public C73305Xzw(C72843Xop c72843Xop) {
        this.A03 = c72843Xop;
    }
}
