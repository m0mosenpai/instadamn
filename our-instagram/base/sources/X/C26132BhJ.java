package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;

/* renamed from: X.BhJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26132BhJ extends C0T6 implements InterfaceC31122Dm5 {
    public final C26142BhT A00;
    public final MidCardClipsClickedAction A01;
    public final InterfaceC31121Dm3 A02;

    public C26132BhJ(MidCardClipsClickedAction midCardClipsClickedAction, InterfaceC31121Dm3 interfaceC31121Dm3, C26142BhT c26142BhT) {
        C14360o3.A0B(midCardClipsClickedAction, 1);
        this.A01 = midCardClipsClickedAction;
        this.A02 = interfaceC31121Dm3;
        this.A00 = c26142BhT;
    }

    @Override // X.InterfaceC31122Dm5
    public final C26132BhJ Ewj() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26132BhJ) {
                C26132BhJ c26132BhJ = (C26132BhJ) obj;
                if (this.A01 != c26132BhJ.A01 || !C14360o3.A0K(this.A02, c26132BhJ.A02) || !C14360o3.A0K(this.A00, c26132BhJ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    @Override // X.InterfaceC31122Dm5
    public final MidCardClipsClickedAction AYN() {
        return this.A01;
    }

    @Override // X.InterfaceC31122Dm5
    public final InterfaceC31121Dm3 BZ7() {
        return this.A02;
    }

    @Override // X.InterfaceC31122Dm5
    public final /* bridge */ /* synthetic */ InterfaceC31124Dm7 BZB() {
        return this.A00;
    }
}
