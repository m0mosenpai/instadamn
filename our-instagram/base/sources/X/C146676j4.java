package X;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.6j4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146676j4 implements C18H {
    public static final C146676j4 A00 = new Object();

    /* JADX WARN: Type inference failed for: r1v2, types: [X.RRc, X.6Re] */
    @Override // X.C18H
    public final /* bridge */ /* synthetic */ C18P AKq(C18P c18p, C18P c18p2, MapMakerInternalMap.Segment segment) {
        RRh rRh;
        MapMakerInternalMap.WeakKeyStrongValueSegment weakKeyStrongValueSegment = (MapMakerInternalMap.WeakKeyStrongValueSegment) segment;
        RRc rRc = (RRc) c18p;
        RRc rRc2 = (RRc) c18p2;
        T t = rRc.get();
        if (t == 0) {
            return null;
        }
        int i = ((AbstractC138976Re) rRc).A00;
        ReferenceQueue referenceQueue = weakKeyStrongValueSegment.queueForKeys;
        if (rRc2 == null) {
            ?? abstractC138976Re = new AbstractC138976Re(t, referenceQueue, i);
            abstractC138976Re.A00 = null;
            rRh = abstractC138976Re;
        } else {
            rRh = new RRh(rRc2, t, referenceQueue, i);
        }
        ((RRc) rRh).A00 = rRc.A00;
        return rRh;
    }

    @Override // X.C18H
    public final MapMakerInternalMap.Strength CgX() {
        return MapMakerInternalMap.Strength.A01;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.RRc, X.6Re, X.18P] */
    @Override // X.C18H
    public final /* bridge */ /* synthetic */ C18P CsK(C18P segment, MapMakerInternalMap.Segment key, Object hash, int next) {
        RRc rRc = (RRc) segment;
        ReferenceQueue referenceQueue = ((MapMakerInternalMap.WeakKeyStrongValueSegment) key).queueForKeys;
        if (rRc == null) {
            ?? abstractC138976Re = new AbstractC138976Re(hash, referenceQueue, next);
            abstractC138976Re.A00 = null;
            return abstractC138976Re;
        }
        return new RRh(rRc, hash, referenceQueue, next);
    }

    @Override // X.C18H
    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment CsX(MapMakerInternalMap map, int initialCapacity) {
        return new MapMakerInternalMap.WeakKeyStrongValueSegment(map, initialCapacity);
    }

    @Override // X.C18H
    public final /* bridge */ /* synthetic */ void Egj(C18P segment, MapMakerInternalMap.Segment entry, Object value) {
        ((RRc) segment).A00 = value;
    }

    @Override // X.C18H
    public final MapMakerInternalMap.Strength FDY() {
        return MapMakerInternalMap.Strength.A00;
    }
}
