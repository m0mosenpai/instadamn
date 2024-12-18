package X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Ma4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50709Ma4 {
    public static final void A00(C47Z c47z) {
        ShareType shareType;
        if (AbstractC31177DnL.A1b(c47z.A1u)) {
            shareType = ShareType.A0E;
        } else if (c47z.A5V) {
            shareType = ShareType.A0V;
        } else {
            shareType = ShareType.A0b;
        }
        c47z.A1k = shareType;
    }
}
