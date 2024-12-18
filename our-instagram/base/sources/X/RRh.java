package X;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes10.dex */
public final class RRh extends RRc {
    public final RRc A00;

    @Override // X.AbstractC138976Re, X.C18P
    public final /* bridge */ /* synthetic */ C18P BWo() {
        return this.A00;
    }

    public RRh(RRc queue, Object key, ReferenceQueue hash, int next) {
        super(key, hash, next);
        ((RRc) this).A00 = null;
        this.A00 = queue;
    }
}
