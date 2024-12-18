package X;

import java.util.Map;

/* renamed from: X.TTd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64769TTd implements Map.Entry, InterfaceC16550s0 {
    public Object A00;
    public final Object A01;
    public final /* synthetic */ Q62 A02;

    public C64769TTd(Q62 q62) {
        this.A02 = q62;
        Map.Entry entry = q62.A01;
        C14360o3.A0A(entry);
        this.A01 = entry.getKey();
        Map.Entry entry2 = q62.A01;
        C14360o3.A0A(entry2);
        this.A00 = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Q62 q62 = this.A02;
        C64770TTe c64770TTe = q62.A03;
        if (c64770TTe.A00().A00 == q62.A00) {
            Object value = getValue();
            c64770TTe.put(getKey(), obj);
            this.A00 = obj;
            return value;
        }
        throw AbstractC58318PtA.A0z();
    }
}
