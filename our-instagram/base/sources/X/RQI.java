package X;

/* loaded from: classes10.dex */
public final class RQI extends AbstractC918149h {
    public RQI A00;
    public RQI A01;
    public RQI A02;
    public RQI A03;
    public Object A04;
    public final Object A05;

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object getKey() {
        return this.A05;
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object getValue() {
        return this.A04;
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object setValue(Object newValue) {
        Object obj = this.A04;
        this.A04 = newValue;
        return obj;
    }

    public RQI(Object key, Object value) {
        this.A05 = key;
        this.A04 = value;
    }
}
