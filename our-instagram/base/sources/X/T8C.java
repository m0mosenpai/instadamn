package X;

import com.google.common.collect.MapMakerInternalMap;

/* loaded from: classes10.dex */
public final class T8C implements C18H {
    public static final T8C A00 = new Object();

    /* JADX WARN: Type inference failed for: r1v2, types: [X.RRb, X.18R] */
    @Override // X.C18H
    public final /* bridge */ /* synthetic */ C18P AKq(C18P c18p, C18P c18p2, MapMakerInternalMap.Segment segment) {
        RRg rRg;
        RRb rRb = (RRb) c18p;
        RRb rRb2 = (RRb) c18p2;
        Object obj = rRb.A01;
        int i = ((C18R) rRb).A00;
        if (rRb2 == null) {
            ?? c18r = new C18R(obj, i);
            c18r.A00 = null;
            rRg = c18r;
        } else {
            rRg = new RRg(rRb2, obj, i);
        }
        ((RRb) rRg).A00 = rRb.A00;
        return rRg;
    }

    @Override // X.C18H
    public final MapMakerInternalMap.Strength CgX() {
        return MapMakerInternalMap.Strength.A00;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.RRb, X.18R, X.18P] */
    @Override // X.C18H
    public final /* bridge */ /* synthetic */ C18P CsK(C18P segment, MapMakerInternalMap.Segment key, Object hash, int next) {
        RRb rRb = (RRb) segment;
        if (rRb == null) {
            ?? c18r = new C18R(hash, next);
            c18r.A00 = null;
            return c18r;
        }
        return new RRg(rRb, hash, next);
    }

    @Override // X.C18H
    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment CsX(MapMakerInternalMap map, int initialCapacity) {
        return new MapMakerInternalMap.Segment(map, initialCapacity);
    }

    @Override // X.C18H
    public final /* bridge */ /* synthetic */ void Egj(C18P segment, MapMakerInternalMap.Segment entry, Object value) {
        ((RRb) segment).A00 = value;
    }

    @Override // X.C18H
    public final MapMakerInternalMap.Strength FDY() {
        return MapMakerInternalMap.Strength.A00;
    }
}
