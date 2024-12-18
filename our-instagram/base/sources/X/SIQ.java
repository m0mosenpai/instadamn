package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SIQ {
    public long A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final boolean A04;

    public SIQ(String str, String str2, Map map, long j, boolean z) {
        Map emptyMap;
        C3U5.A04(str);
        C3U5.A04(str2);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = j;
        if (map != null) {
            emptyMap = AbstractC58318PtA.A10(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A03 = emptyMap;
    }
}
