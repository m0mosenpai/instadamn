package X;

/* renamed from: X.E8r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32093E8r extends C0T6 implements InterfaceC66482zP {
    public final C60492R0s A00;
    public final InterfaceC16660sJ A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32093E8r) {
                C32093E8r c32093E8r = (C32093E8r) obj;
                if (!C14360o3.A0K(this.A00, c32093E8r.A00) || this.A02 != c32093E8r.A02 || !C14360o3.A0K(this.A01, c32093E8r.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00.A07("sticker_pack_id"));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00)));
    }

    public C32093E8r(C60492R0s c60492R0s, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A00 = c60492R0s;
        this.A02 = z;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AvatarPoseGridItemViewModel(poseOption=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(22));
        A1C.append(this.A02);
        A1C.append(", onPoseSelected=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
