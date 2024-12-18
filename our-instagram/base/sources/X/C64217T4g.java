package X;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.T4g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64217T4g implements InterfaceC65245Tgb {
    public static final C64217T4g A02 = new C64217T4g(Collections.emptyMap());
    public int A00;
    public final Map A01;

    public final C64217T4g A01(SEO seo) {
        Map map = this.A01;
        HashMap A10 = AbstractC58318PtA.A10(map);
        List A102 = AbstractC58322PtE.A10(seo.A00);
        for (int i = 0; i < A102.size(); i++) {
            A10.remove(A102.get(i));
        }
        HashMap A103 = AbstractC58318PtA.A10(seo.A01);
        Iterator A14 = AbstractC166997dE.A14(A103);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Object value = A1K.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                A1K.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        Iterator A15 = AbstractC166997dE.A15(Collections.unmodifiableMap(A103));
        while (A15.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A15);
            Object key = A1K2.getKey();
            Object value2 = A1K2.getValue();
            if (value2 instanceof Long) {
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putLong(AbstractC166987dD.A0N(value2));
                value2 = allocate.array();
            } else if (value2 instanceof String) {
                value2 = ((String) value2).getBytes(AbstractC50482Ts.A05);
            } else if (!(value2 instanceof byte[])) {
                throw AbstractC58318PtA.A0Y();
            }
            A10.put(key, value2);
        }
        if (A00(map, A10)) {
            return this;
        }
        return new C64217T4g(A10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return A00(this.A01, ((C64217T4g) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            i = 0;
            Iterator A15 = AbstractC166997dE.A15(this.A01);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                i += Arrays.hashCode((byte[]) A1K.getValue()) ^ AbstractC31172DnG.A17(A1K).hashCode();
            }
            this.A00 = i;
        }
        return i;
    }

    public C64217T4g(Map map) {
        this.A01 = Collections.unmodifiableMap(map);
    }

    public static boolean A00(Map map, Map map2) {
        if (map.size() == map2.size()) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (!Arrays.equals((byte[]) A1K.getValue(), (byte[]) map2.get(A1K.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public C64217T4g() {
        this(Collections.emptyMap());
    }
}
