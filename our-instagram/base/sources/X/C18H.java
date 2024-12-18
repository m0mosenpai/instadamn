package X;

import com.google.common.collect.MapMakerInternalMap;

/* renamed from: X.18H, reason: invalid class name */
/* loaded from: classes.dex */
public interface C18H {
    C18P AKq(C18P segment, C18P entry, MapMakerInternalMap.Segment newNext);

    MapMakerInternalMap.Strength CgX();

    C18P CsK(C18P segment, MapMakerInternalMap.Segment key, Object hash, int next);

    MapMakerInternalMap.Segment CsX(MapMakerInternalMap map, int initialCapacity);

    void Egj(C18P segment, MapMakerInternalMap.Segment entry, Object value);

    MapMakerInternalMap.Strength FDY();
}
