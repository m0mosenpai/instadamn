package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;

/* loaded from: classes7.dex */
public final class H45 extends C0T6 implements InterfaceC43538JKy {
    public final long A00;
    public final long A01;
    public final IGLiveFriendChatGuestStatus A02;

    public H45(IGLiveFriendChatGuestStatus iGLiveFriendChatGuestStatus, long j, long j2) {
        C14360o3.A0B(iGLiveFriendChatGuestStatus, 3);
        this.A00 = j;
        this.A01 = j2;
        this.A02 = iGLiveFriendChatGuestStatus;
    }

    @Override // X.InterfaceC43538JKy
    public final H45 Evz() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H45) {
                H45 h45 = (H45) obj;
                if (this.A00 != h45.A00 || this.A01 != h45.A01 || this.A02 != h45.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43538JKy
    public final long AnH() {
        return this.A00;
    }

    @Override // X.InterfaceC43538JKy
    public final long BJW() {
        return this.A01;
    }

    @Override // X.InterfaceC43538JKy
    public final IGLiveFriendChatGuestStatus C0H() {
        return this.A02;
    }

    @Override // X.InterfaceC43538JKy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTLiveChatInfo", AbstractC40045HpX.A00(this));
    }

    public final int hashCode() {
        long j = this.A00;
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A07(this.A01, ((int) (j ^ (j >>> 32))) * 31));
    }
}
