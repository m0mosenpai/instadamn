package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;

/* renamed from: X.C0u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27254C0u extends C17T implements InterfaceC31122Dm5 {
    @Override // X.InterfaceC31122Dm5
    public final MidCardClipsClickedAction AYN() {
        return (MidCardClipsClickedAction) A0M(-1422950858, C30000DKm.A00);
    }

    @Override // X.InterfaceC31122Dm5
    public final InterfaceC31121Dm3 BZ7() {
        return (InterfaceC31121Dm3) A05(677356396, C17.class);
    }

    @Override // X.InterfaceC31122Dm5
    public final InterfaceC31124Dm7 BZB() {
        return (InterfaceC31124Dm7) A05(-34328026, C19.class);
    }

    @Override // X.InterfaceC31122Dm5
    public final C26132BhJ Ewj() {
        C26140BhR c26140BhR;
        MidCardClipsClickedAction AYN = AYN();
        InterfaceC31121Dm3 BZ7 = BZ7();
        C26142BhT c26142BhT = null;
        if (BZ7 != null) {
            c26140BhR = BZ7.Exa();
        } else {
            c26140BhR = null;
        }
        InterfaceC31124Dm7 BZB = BZB();
        if (BZB != null) {
            c26142BhT = BZB.Exe();
        }
        return new C26132BhJ(AYN, c26140BhR, c26142BhT);
    }
}
