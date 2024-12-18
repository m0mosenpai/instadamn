package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes9.dex */
public final class OAQ {
    public final ImmutableList A00;
    public final O85 A01;
    public final String A02;

    public OAQ(C54644OBv c54644OBv) {
        this.A02 = c54644OBv.A01;
        List list = c54644OBv.A03;
        C14360o3.A07(list);
        this.A01 = new O85((C54542O7u) AbstractC001800i.A0O(list, 0));
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (C54643OBu c54643OBu : c54644OBv.A02) {
            C14360o3.A0A(c54643OBu);
            builder.add((Object) new C54647OBz(c54643OBu));
        }
        this.A00 = builder.build();
    }
}
