package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Vre, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69575Vre {
    public final String A00;
    public final boolean A01;
    public final List A02;

    public C69575Vre(String str, List list, boolean z) {
        C14360o3.A0B(list, 3);
        this.A00 = str;
        this.A01 = z;
        this.A02 = list;
    }

    public final ImmutableList A00() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(this.A02);
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }
}
