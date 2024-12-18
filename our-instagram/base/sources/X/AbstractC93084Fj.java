package X;

import com.instagram.api.schemas.ClipsTextFormatType;

/* renamed from: X.4Fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93084Fj {
    public static final ClipsTextFormatType A00(String str) {
        ClipsTextFormatType clipsTextFormatType = (ClipsTextFormatType) ClipsTextFormatType.A01.get(str);
        if (clipsTextFormatType == null) {
            return ClipsTextFormatType.A0e;
        }
        return clipsTextFormatType;
    }
}
