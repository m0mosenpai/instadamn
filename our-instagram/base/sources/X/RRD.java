package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableBiMap;

/* loaded from: classes10.dex */
public final class RRD extends ImmutableMap.Builder {
    public RRD() {
        super(4);
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ ImmutableMap buildOrThrow() {
        int i = this.size;
        if (i == 0) {
            return RegularImmutableBiMap.A04;
        }
        this.entriesUsed = true;
        return new RegularImmutableBiMap(this.alternatingKeysAndValues, i);
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    public final /* bridge */ /* synthetic */ ImmutableMap buildOrThrow() {
        int i = this.size;
        if (i == 0) {
            return RegularImmutableBiMap.A04;
        }
        this.entriesUsed = true;
        return new RegularImmutableBiMap(this.alternatingKeysAndValues, i);
    }

    public final void A00(Object key, Object value) {
        super.put(key, value);
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    public final /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object key, Object value) {
        super.put(key, value);
        return this;
    }
}
