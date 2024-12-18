package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;

/* renamed from: X.HlR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39817HlR {
    public static final ClipsMidCardSubtype A00(String str) {
        ClipsMidCardSubtype clipsMidCardSubtype = (ClipsMidCardSubtype) ClipsMidCardSubtype.A01.get(str);
        if (clipsMidCardSubtype == null) {
            return ClipsMidCardSubtype.A0v;
        }
        return clipsMidCardSubtype;
    }
}
