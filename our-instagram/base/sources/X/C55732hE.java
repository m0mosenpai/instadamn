package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Map;

/* renamed from: X.2hE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55732hE {
    public final ImmutableMap A00;

    public final String A00(String str) {
        C14360o3.A0B(str, 0);
        return (String) this.A00.get(str);
    }

    public final String toString() {
        String obj = this.A00.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C55732hE(Map map) {
        ImmutableMap immutableMap;
        if (map == null || (immutableMap = ImmutableMap.copyOf(map)) == null) {
            immutableMap = RegularImmutableMap.A02;
            C14360o3.A07(immutableMap);
        }
        this.A00 = immutableMap;
    }

    public C55732hE() {
        this.A00 = RegularImmutableMap.A02;
    }
}
