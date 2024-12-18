package X;

import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.OqF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55804OqF implements InterfaceC28041Xi {
    public static final C55804OqF A00 = new C55804OqF();

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        InterfaceC40171tl interfaceC40171tl = (InterfaceC40171tl) obj;
        if (!(interfaceC40171tl instanceof C122005fs)) {
            return false;
        }
        UserStoryTarget A01 = ((C122005fs) interfaceC40171tl).A01();
        if (A01 != null) {
            if (A01 != UserStoryTarget.A01 && A01 != UserStoryTarget.A02 && A01 != UserStoryTarget.A09) {
                String CBn = A01.CBn();
                if (CBn == null) {
                    return false;
                }
                if (!CBn.equals("ALL_WITH_BLACKLIST") && !CBn.equals("CLOSE_FRIENDS_WITH_BLACKLIST")) {
                    return false;
                }
            }
            return true;
        }
        throw AbstractC166997dE.A0g();
    }
}
