package X;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.35r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C682935r implements C18H {
    public static final C682935r A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v4, types: [X.6Re, X.6Rd] */
    @Override // X.C18H
    public final /* bridge */ /* synthetic */ C18P AKq(C18P c18p, C18P c18p2, MapMakerInternalMap.Segment segment) {
        RRi rRi;
        MapMakerInternalMap.WeakKeyWeakValueSegment weakKeyWeakValueSegment = (MapMakerInternalMap.WeakKeyWeakValueSegment) segment;
        C138966Rd c138966Rd = (C138966Rd) c18p;
        C138966Rd c138966Rd2 = (C138966Rd) c18p2;
        T t = c138966Rd.get();
        RRi rRi2 = null;
        rRi2 = null;
        if (t != 0 && c138966Rd.getValue() != null) {
            int i = ((AbstractC138976Re) c138966Rd).A00;
            ReferenceQueue referenceQueue = weakKeyWeakValueSegment.queueForKeys;
            if (c138966Rd2 == null) {
                ?? abstractC138976Re = new AbstractC138976Re(t, referenceQueue, i);
                abstractC138976Re.A00 = MapMakerInternalMap.A07;
                rRi = abstractC138976Re;
            } else {
                rRi = new RRi(c138966Rd2, t, referenceQueue, i);
            }
            ((C138966Rd) rRi).A00 = c138966Rd.A00.AKu(rRi, weakKeyWeakValueSegment.queueForValues);
            rRi2 = rRi;
        }
        return rRi2;
    }

    @Override // X.C18H
    public final MapMakerInternalMap.Strength CgX() {
        return MapMakerInternalMap.Strength.A01;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6Re, X.18P, X.6Rd] */
    @Override // X.C18H
    public final /* bridge */ /* synthetic */ C18P CsK(C18P segment, MapMakerInternalMap.Segment key, Object hash, int next) {
        C138966Rd c138966Rd = (C138966Rd) segment;
        ReferenceQueue referenceQueue = ((MapMakerInternalMap.WeakKeyWeakValueSegment) key).queueForKeys;
        if (c138966Rd == null) {
            ?? abstractC138976Re = new AbstractC138976Re(hash, referenceQueue, next);
            abstractC138976Re.A00 = MapMakerInternalMap.A07;
            return abstractC138976Re;
        }
        return new RRi(c138966Rd, hash, referenceQueue, next);
    }

    @Override // X.C18H
    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment CsX(MapMakerInternalMap map, int initialCapacity) {
        return new MapMakerInternalMap.WeakKeyWeakValueSegment(map, initialCapacity);
    }

    @Override // X.C18H
    public final /* bridge */ /* synthetic */ void Egj(C18P segment, MapMakerInternalMap.Segment entry, Object value) {
        C138966Rd c138966Rd = (C138966Rd) segment;
        C18K c18k = c138966Rd.A00;
        c138966Rd.A00 = new C18T(c138966Rd, value, ((MapMakerInternalMap.WeakKeyWeakValueSegment) entry).queueForValues);
        c18k.clear();
    }

    @Override // X.C18H
    public final MapMakerInternalMap.Strength FDY() {
        return MapMakerInternalMap.Strength.A01;
    }
}
