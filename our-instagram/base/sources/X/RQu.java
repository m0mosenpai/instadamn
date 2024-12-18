package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class RQu extends AbstractC451425u implements Map.Entry {
    public final /* synthetic */ RSM A00;
    public final /* synthetic */ Map.Entry A01;

    public RQu(final RSM this$2, final Map.Entry val$entry) {
        this.A00 = this$2;
        this.A01 = val$entry;
    }

    @Override // X.AbstractC451425u
    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object object) {
        return this.A01.equals(object);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A01.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A01.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object newValue) {
        RRj rRj = ((RQw) this.A00.A01).A00;
        C18C.A0E(AbstractC58322PtE.A1V(((RRw) rRj).A00, getKey(), newValue));
        return this.A01.setValue(newValue);
    }

    public RQu() {
    }
}
