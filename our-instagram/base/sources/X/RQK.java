package X;

import com.google.common.collect.HashBiMap;

/* loaded from: classes10.dex */
public final class RQK extends AbstractC918149h {
    public int A00;
    public final HashBiMap A01;
    public final Object A02;

    private void A00() {
        int i = this.A00;
        if (i != -1) {
            HashBiMap hashBiMap = this.A01;
            if (i <= hashBiMap.A02 && AbstractC50102Ry.A00(this.A02, hashBiMap.A0C[i])) {
                return;
            }
        }
        HashBiMap hashBiMap2 = this.A01;
        Object obj = this.A02;
        this.A00 = hashBiMap2.A0B(obj, C1Jk.A02(obj));
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object getKey() {
        return this.A02;
    }

    public RQK(HashBiMap biMap, int index) {
        this.A01 = biMap;
        this.A02 = biMap.A0C[index];
        this.A00 = index;
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object getValue() {
        A00();
        int i = this.A00;
        if (i == -1) {
            return null;
        }
        return this.A01.A0B[i];
    }

    @Override // X.AbstractC918149h, java.util.Map.Entry
    public final Object setValue(Object key) {
        A00();
        int i = this.A00;
        HashBiMap hashBiMap = this.A01;
        if (i == -1) {
            hashBiMap.A0C(this.A02, key);
            return null;
        }
        Object obj = hashBiMap.A0B[i];
        if (AbstractC50102Ry.A00(obj, key)) {
            return key;
        }
        HashBiMap.A08(hashBiMap, key, this.A00);
        return obj;
    }
}
