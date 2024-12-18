package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppUserFavoriteNotificationPostType;

/* renamed from: X.H6i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38793H6i extends C0T6 implements InterfaceC43518JKe {
    public final TextAppUserFavoriteNotificationPostType A00;
    public final Boolean A01;

    @Override // X.InterfaceC43518JKe
    public final C38793H6i F34() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38793H6i) {
                C38793H6i c38793H6i = (C38793H6i) obj;
                if (!C14360o3.A0K(this.A01, c38793H6i.A01) || this.A00 != c38793H6i.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43518JKe
    public final TextAppUserFavoriteNotificationPostType BXO() {
        return this.A00;
    }

    @Override // X.InterfaceC43518JKe
    public final Boolean CbN() {
        return this.A01;
    }

    @Override // X.InterfaceC43518JKe
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextAppUserFavoriteNotificationSetting", AbstractC40399Hvm.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38793H6i(TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType, Boolean bool) {
        this.A01 = bool;
        this.A00 = textAppUserFavoriteNotificationPostType;
    }
}
