package X;

import com.instagram.api.schemas.IGUserHighlightsTrayType;

/* renamed from: X.3kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81803kw {
    public static final IGUserHighlightsTrayType A00(String str) {
        IGUserHighlightsTrayType iGUserHighlightsTrayType = (IGUserHighlightsTrayType) IGUserHighlightsTrayType.A01.get(str);
        if (iGUserHighlightsTrayType == null) {
            return IGUserHighlightsTrayType.A08;
        }
        return iGUserHighlightsTrayType;
    }
}
