package X;

import com.google.common.collect.MapMakerInternalMap;

/* renamed from: X.18G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C18G implements C18H {
    public static final C18G A00 = new Object();

    /* JADX WARN: Type inference failed for: r2v2, types: [X.18R, X.18Q] */
    @Override // X.C18H
    public final /* bridge */ /* synthetic */ C18P AKq(C18P c18p, C18P c18p2, MapMakerInternalMap.Segment segment) {
        C18X c18x;
        MapMakerInternalMap.StrongKeyWeakValueSegment strongKeyWeakValueSegment = (MapMakerInternalMap.StrongKeyWeakValueSegment) segment;
        C18Q c18q = (C18Q) c18p;
        C18Q c18q2 = (C18Q) c18p2;
        if (c18q.A00.get() == null) {
            return null;
        }
        Object obj = c18q.A01;
        int i = ((C18R) c18q).A00;
        if (c18q2 == null) {
            ?? c18r = new C18R(obj, i);
            c18r.A00 = MapMakerInternalMap.A07;
            c18x = c18r;
        } else {
            c18x = new C18X(c18q2, obj, i);
        }
        ((C18Q) c18x).A00 = c18q.A00.AKu(c18x, strongKeyWeakValueSegment.queueForValues);
        return c18x;
    }

    @Override // X.C18H
    public final MapMakerInternalMap.Strength CgX() {
        return MapMakerInternalMap.Strength.A00;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.18R, X.18Q, X.18P] */
    @Override // X.C18H
    public final /* bridge */ /* synthetic */ C18P CsK(C18P segment, MapMakerInternalMap.Segment key, Object hash, int next) {
        C18Q c18q = (C18Q) segment;
        if (c18q == null) {
            ?? c18r = new C18R(hash, next);
            c18r.A00 = MapMakerInternalMap.A07;
            return c18r;
        }
        return new C18X(c18q, hash, next);
    }

    @Override // X.C18H
    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment CsX(MapMakerInternalMap map, int initialCapacity) {
        return new MapMakerInternalMap.StrongKeyWeakValueSegment(map, initialCapacity);
    }

    @Override // X.C18H
    public final /* bridge */ /* synthetic */ void Egj(C18P segment, MapMakerInternalMap.Segment entry, Object value) {
        C18Q c18q = (C18Q) segment;
        C18K c18k = c18q.A00;
        c18q.A00 = new C18T(c18q, value, ((MapMakerInternalMap.StrongKeyWeakValueSegment) entry).queueForValues);
        c18k.clear();
    }

    @Override // X.C18H
    public final MapMakerInternalMap.Strength FDY() {
        return MapMakerInternalMap.Strength.A01;
    }
}
