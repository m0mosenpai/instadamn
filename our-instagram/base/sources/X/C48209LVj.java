package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* renamed from: X.LVj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48209LVj implements C5OM {
    public final String A00;
    public final java.util.Set A01;

    @Override // X.C5OM
    public final ImmutableMap AEd() {
        ImmutableMap of;
        java.util.Set set = this.A01;
        if (set.isEmpty()) {
            of = RegularImmutableMap.A02;
        } else {
            of = ImmutableMap.of((Object) this.A00, (Object) AbstractC31175DnJ.A0a(", ", set));
        }
        C14360o3.A07(of);
        return of;
    }

    public C48209LVj(String str, java.util.Set set) {
        this.A00 = str;
        this.A01 = set;
    }
}
