package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.session.UserSession;

/* renamed from: X.8rK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC199178rK {
    public static final boolean A00(UserSession userSession, C55U c55u, C1816783z c1816783z) {
        ImmersiveMediaFields immersiveMediaFields;
        C14360o3.A0B(c55u, 1);
        C14360o3.A0B(c1816783z, 2);
        C183978Ee A03 = c1816783z.A01.A03();
        if (A03 != null && (immersiveMediaFields = A03.A01().A00) != null && immersiveMediaFields.A00 != null && A34.A00(userSession, c55u, c1816783z.A0C())) {
            return true;
        }
        return false;
    }
}
