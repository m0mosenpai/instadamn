package X;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes10.dex */
public final class RRi extends C138966Rd {
    public final C138966Rd A00;

    @Override // X.AbstractC138976Re, X.C18P
    public final /* bridge */ /* synthetic */ C18P BWo() {
        return this.A00;
    }

    public RRi(C138966Rd queue, Object key, ReferenceQueue hash, int next) {
        super(key, hash, next);
        ((C138966Rd) this).A00 = MapMakerInternalMap.A07;
        this.A00 = queue;
    }
}
