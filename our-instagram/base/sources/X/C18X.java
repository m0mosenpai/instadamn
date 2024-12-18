package X;

import com.google.common.collect.MapMakerInternalMap;

/* renamed from: X.18X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C18X extends C18Q {
    public final C18Q A00;

    @Override // X.C18R, X.C18P
    public final /* bridge */ /* synthetic */ C18P BWo() {
        return this.A00;
    }

    public C18X(C18Q key, Object hash, int next) {
        super(hash, next);
        ((C18Q) this).A00 = MapMakerInternalMap.A07;
        this.A00 = key;
    }
}
