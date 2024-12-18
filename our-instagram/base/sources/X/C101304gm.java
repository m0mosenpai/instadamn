package X;

import com.instagram.trust.noncemanager.NonceTypeMap;
import com.instagram.trust.noncemanager.NonceUserMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4gm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101304gm {
    public final Map A00 = new HashMap();

    public final String A00(String str) {
        C14360o3.A0B(str, 0);
        NonceUserMap nonceUserMap = (NonceUserMap) this.A00.get(str);
        if (nonceUserMap == null) {
            return null;
        }
        C73773Sh c73773Sh = AbstractC73763Sg.A03;
        Map map = nonceUserMap.A00;
        C3RD c3rd = C3RD.A01;
        return c73773Sh.A02(map, new C3RL(c3rd, c3rd));
    }

    public C101304gm() {
        String string = AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("client_nonces", null);
        if (string != null && string.length() != 0) {
            C73773Sh c73773Sh = AbstractC73763Sg.A03;
            C3R9[] c3r9Arr = NonceTypeMap.A01;
            this.A00.putAll(((NonceTypeMap) c73773Sh.A00(string, C106784rc.A00)).A00);
        }
    }
}
