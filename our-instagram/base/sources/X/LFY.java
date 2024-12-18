package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class LFY {
    public static final LFY A00 = new Object();
    public static final Map A01 = AbstractC166987dD.A1I();

    public final synchronized long A00(EnumC117355Su enumC117355Su, String str, String str2) {
        long j;
        Long l = (Long) A01.remove(new MUD(enumC117355Su, str, str2));
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return j;
    }
}
