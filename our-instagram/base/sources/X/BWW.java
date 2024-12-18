package X;

import com.instagram.api.schemas.ClipsCameraCommandAction;

/* loaded from: classes5.dex */
public final class BWW extends C0T6 implements InterfaceC31119Dm1 {
    public final int A00;
    public final ClipsCameraCommandAction A01;

    public BWW(ClipsCameraCommandAction clipsCameraCommandAction, int i) {
        C14360o3.A0B(clipsCameraCommandAction, 1);
        this.A01 = clipsCameraCommandAction;
        this.A00 = i;
    }

    @Override // X.InterfaceC31119Dm1
    public final BWW ExY() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BWW) {
                BWW bww = (BWW) obj;
                if (this.A01 != bww.A01 || this.A00 != bww.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    @Override // X.InterfaceC31119Dm1
    public final ClipsCameraCommandAction AYL() {
        return this.A01;
    }

    @Override // X.InterfaceC31119Dm1
    public final int B2P() {
        return this.A00;
    }
}
