package X;

import com.instagram.api.schemas.ACRType;

/* renamed from: X.9JF, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9JF {
    public static final ACRType A00(String str) {
        ACRType aCRType = (ACRType) ACRType.A01.get(str);
        if (aCRType == null) {
            return ACRType.A0A;
        }
        return aCRType;
    }
}
