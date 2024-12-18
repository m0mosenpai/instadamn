package X;

import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.EnumSet;

/* renamed from: X.OqB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55800OqB implements InterfaceC28041Xi {
    public final /* synthetic */ EnumSet A00;

    public C55800OqB(EnumSet enumSet) {
        this.A00 = enumSet;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        ShareType shareType;
        InterfaceC40171tl interfaceC40171tl = (InterfaceC40171tl) obj;
        EnumSet enumSet = this.A00;
        if (interfaceC40171tl != null) {
            shareType = interfaceC40171tl.BuN();
        } else {
            shareType = null;
        }
        return enumSet.contains(shareType);
    }
}
