package X;

import java.util.Map;

/* renamed from: X.6PR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PR implements Map.Entry, InterfaceC16550s0 {
    public Object A00;
    public String A01;

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object value = getValue();
        this.A00 = obj;
        return value;
    }
}
