package X;

import android.util.SparseArray;

/* renamed from: X.RgX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61171RgX {
    MANIFEST_FETCH_END(1),
    PREFETCH_CACHE_EVICT(4),
    QUALITY_CHANGED(5),
    SPAN_CHANGED(6),
    QUALITY_SUMMARY(7),
    CACHE_ERROR(8),
    PREFETCH_START(10),
    DATABASE_FULL(12),
    MANIFEST_PARSE_ERROR(13),
    SUGGEST_UNBIND(14),
    /* JADX INFO: Fake field, exist only in values array */
    CACHED(16);

    public static final SparseArray A01 = AbstractC58318PtA.A0G();
    public final int A00;

    static {
        for (EnumC61171RgX enumC61171RgX : values()) {
            A01.put(enumC61171RgX.A00, enumC61171RgX);
        }
    }

    EnumC61171RgX(int i) {
        this.A00 = i;
    }
}
