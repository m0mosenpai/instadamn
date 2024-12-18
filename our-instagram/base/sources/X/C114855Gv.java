package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import java.util.List;

/* renamed from: X.5Gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114855Gv extends C0T6 implements InterfaceC114865Gw {
    public final PendingShareToFriendsStoryBadgePreviewState A00;
    public final String A01;
    public final List A02;

    @Override // X.InterfaceC114865Gw
    public final C114855Gv Exu(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114855Gv) {
                C114855Gv c114855Gv = (C114855Gv) obj;
                if (this.A00 != c114855Gv.A00 || !C14360o3.A0K(this.A01, c114855Gv.A01) || !C14360o3.A0K(this.A02, c114855Gv.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState = this.A00;
        int hashCode = (pendingShareToFriendsStoryBadgePreviewState == null ? 0 : pendingShareToFriendsStoryBadgePreviewState.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.A02;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // X.InterfaceC114865Gw
    public final PendingShareToFriendsStoryBadgePreviewState AfG() {
        return this.A00;
    }

    @Override // X.InterfaceC114865Gw
    public final String AvB() {
        return this.A01;
    }

    @Override // X.InterfaceC114865Gw
    public final List BRB() {
        return this.A02;
    }

    @Override // X.InterfaceC114865Gw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPendingShareToFriendsStoryMediaResponse", AbstractC40138Hr6.A00(this));
    }

    public C114855Gv(PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState, String str, List list) {
        this.A00 = pendingShareToFriendsStoryBadgePreviewState;
        this.A01 = str;
        this.A02 = list;
    }
}
