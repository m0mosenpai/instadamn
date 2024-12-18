package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes9.dex */
public final class O85 {
    public final ImmutableList A00;
    public final String A01;

    public O85(C54542O7u c54542O7u) {
        String str;
        ImmutableList of;
        if (c54542O7u != null) {
            str = c54542O7u.A00;
        } else {
            str = null;
        }
        this.A01 = str;
        if (c54542O7u != null) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (OAH oah : c54542O7u.A01) {
                C14360o3.A0A(oah);
                builder.add((Object) new OAP(oah));
            }
            of = builder.build();
        } else {
            of = ImmutableList.of();
        }
        this.A00 = of;
    }
}
