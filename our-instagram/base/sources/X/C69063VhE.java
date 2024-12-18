package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.VhE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69063VhE {
    public Long A00;
    public final C68920VeK A01;
    public final Map A02;

    public C69063VhE(C68920VeK c68920VeK, String str, Map map) {
        Long l;
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        this.A01 = c68920VeK;
        hashMap.put("composer_session_id", str);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (c68920VeK != null) {
            l = Long.valueOf(c68920VeK.A01.generateNewFlowId(c68920VeK.A00));
        } else {
            l = null;
        }
        this.A00 = l;
    }
}
