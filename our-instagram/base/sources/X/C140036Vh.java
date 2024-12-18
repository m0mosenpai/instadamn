package X;

import java.util.Map;

/* renamed from: X.6Vh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140036Vh {
    public final C18590vm A00;

    public C140036Vh(Map map) {
        C18590vm c18590vm = new C18590vm(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c18590vm.A09(entry.getKey(), entry.getValue());
        }
        this.A00 = c18590vm;
    }
}
