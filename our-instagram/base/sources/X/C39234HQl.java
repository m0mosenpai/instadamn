package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;

/* renamed from: X.HQl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39234HQl extends C17T implements InterfaceC43538JKy {
    @Override // X.InterfaceC43538JKy
    public final IGLiveFriendChatGuestStatus C0H() {
        Object A0M = A0M(-892481550, JA6.A00);
        if (A0M != null) {
            return (IGLiveFriendChatGuestStatus) A0M;
        }
        throw AbstractC166987dD.A14("Required field 'status' was either missing or null for LiveChatInfo.");
    }

    @Override // X.InterfaceC43538JKy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40045HpX.A00(this));
    }

    @Override // X.InterfaceC43538JKy
    public final long AnH() {
        Long A0L = A0L(739114850);
        if (A0L != null) {
            return A0L.longValue();
        }
        throw AbstractC166987dD.A14("Required field 'chat_id' was either missing or null for LiveChatInfo.");
    }

    @Override // X.InterfaceC43538JKy
    public final long BJW() {
        Long A0L = A0L(1198966417);
        if (A0L != null) {
            return A0L.longValue();
        }
        throw AbstractC166987dD.A14("Required field 'inviter_id' was either missing or null for LiveChatInfo.");
    }

    @Override // X.InterfaceC43538JKy
    public final H45 Evz() {
        return new H45(C0H(), AnH(), BJW());
    }
}
