package X;

import com.google.common.collect.HashBiMap;

/* loaded from: classes10.dex */
public final class RQJ extends AbstractC918149h {
    public int A00;
    public final Object A01;
    public final /* synthetic */ HashBiMap A02;

    public RQJ(final HashBiMap this$0, int index) {
        this.A02 = this$0;
        this.A01 = this$0.A0B[index];
        this.A00 = index;
    }

    public final void A00() {
        int i = this.A00;
        if (i != -1) {
            HashBiMap hashBiMap = this.A02;
            if (i <= hashBiMap.A02 && AbstractC50102Ry.A00(hashBiMap.A0B[i], this.A01)) {
                return;
            }
        }
        HashBiMap hashBiMap2 = this.A02;
        Object obj = this.A01;
        this.A00 = hashBiMap2.A0A(obj, C1Jk.A02(obj));
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object getKey() {
        return this.A01;
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object getValue() {
        A00();
        int i = this.A00;
        if (i == -1) {
            return null;
        }
        return this.A02.A0C[i];
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object setValue(Object value) {
        A00();
        int i = this.A00;
        HashBiMap hashBiMap = this.A02;
        if (i == -1) {
            hashBiMap.put(this.A01, value);
            return null;
        }
        Object obj = hashBiMap.A0C[i];
        if (AbstractC50102Ry.A00(obj, value)) {
            return value;
        }
        HashBiMap.A09(hashBiMap, value, this.A00, false);
        return obj;
    }
}
