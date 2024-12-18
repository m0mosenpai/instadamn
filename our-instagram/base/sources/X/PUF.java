package X;

import java.util.Map;

/* loaded from: classes9.dex */
public final class PUF implements Map.Entry, InterfaceC16550s0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Object[] A01;
    public final /* synthetic */ String[] A02;

    public PUF(Object[] objArr, String[] strArr, int i) {
        this.A02 = strArr;
        this.A00 = i;
        this.A01 = objArr;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02[this.A00];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A01[this.A00];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw AbstractC166987dD.A1D("Can't set a value while iterating over a ReadableNativeMap");
    }
}
