package X;

import java.util.Map;

/* renamed from: X.M7g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50043M7g implements Map.Entry {
    public final C6C2 A00;
    public final Object A01;

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A01;
    }

    public C50043M7g(C6C2 c6c2, Object obj) {
        this.A00 = c6c2;
        this.A01 = obj;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw JQ0.A0d();
    }
}
