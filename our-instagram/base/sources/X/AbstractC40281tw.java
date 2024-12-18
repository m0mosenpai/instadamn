package X;

import com.instagram.model.reels.ReelType;

/* renamed from: X.1tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40281tw {
    public static final ReelType A00(String str) {
        ReelType reelType = (ReelType) ReelType.A01.get(str);
        if (reelType == null) {
            return ReelType.A0m;
        }
        return reelType;
    }
}
