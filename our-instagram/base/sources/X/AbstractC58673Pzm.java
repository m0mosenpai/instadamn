package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Pzm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58673Pzm {
    public final String A00;
    public final Map A02 = new LinkedHashMap();
    public final Map A01 = new LinkedHashMap();

    public final void A01(String str, String str2) {
        this.A01.put(AnonymousClass001.A0T(this.A00, str, '_'), str2);
    }

    public AbstractC58673Pzm(String str) {
        this.A00 = str;
    }

    public final void A00(String str, long j) {
        this.A02.put(AnonymousClass001.A0T(this.A00, str, '_'), Long.valueOf(j));
    }
}
