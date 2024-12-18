package X;

import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;

/* renamed from: X.E8q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32092E8q extends C0T6 implements InterfaceC66482zP {
    public final AvatarCoinFlipBackgroundOptionResponse A00;
    public final InterfaceC16660sJ A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32092E8q) {
                C32092E8q c32092E8q = (C32092E8q) obj;
                if (!C14360o3.A0K(this.A00, c32092E8q.A00) || this.A02 != c32092E8q.A02 || !C14360o3.A0K(this.A01, c32092E8q.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00)));
    }

    public C32092E8q(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A00 = avatarCoinFlipBackgroundOptionResponse;
        this.A02 = z;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AvatarBackgroundGridItemViewModel(backgroundOption=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(22));
        A1C.append(this.A02);
        A1C.append(", onBackgroundSelected=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
