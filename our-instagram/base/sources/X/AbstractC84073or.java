package X;

import com.instagram.api.schemas.MusicCanonicalType;

/* renamed from: X.3or, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84073or {
    public static final MusicCanonicalType A00(String str) {
        MusicCanonicalType musicCanonicalType = (MusicCanonicalType) MusicCanonicalType.A01.get(str);
        if (musicCanonicalType == null) {
            return MusicCanonicalType.A06;
        }
        return musicCanonicalType;
    }
}
