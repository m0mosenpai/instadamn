package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36596GBu implements C5OV {
    public final UserSession A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        UserSession userSession = this.A00;
        if (AbstractC166987dD.A0x(userSession).getBoolean("has_used_shopping_bag", false) && !AbstractC166987dD.A0x(userSession).getBoolean("has_tapped_on_shopping_bag_menu_option", false)) {
            return true;
        }
        return false;
    }

    public C36596GBu(UserSession userSession) {
        this.A00 = userSession;
    }
}
