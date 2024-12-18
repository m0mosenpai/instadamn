package X;

import com.instagram.api.schemas.ClipsCameraCommandAction;

/* loaded from: classes5.dex */
public final class BWX extends C0T6 implements InterfaceC30893Di6 {
    public final C22P A00;
    public final ClipsCameraCommandAction A01;
    public final InterfaceC88553xD A02;
    public final C38321qM A03;
    public final C26135BhM A04;

    public BWX(C22P c22p, ClipsCameraCommandAction clipsCameraCommandAction, C26135BhM c26135BhM, InterfaceC88553xD interfaceC88553xD, C38321qM c38321qM) {
        C14360o3.A0B(clipsCameraCommandAction, 4);
        this.A04 = c26135BhM;
        this.A00 = c22p;
        this.A03 = c38321qM;
        this.A01 = clipsCameraCommandAction;
        this.A02 = interfaceC88553xD;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BWX) {
                BWX bwx = (BWX) obj;
                if (!C14360o3.A0K(this.A04, bwx.A04) || this.A00 != bwx.A00 || !C14360o3.A0K(this.A03, bwx.A03) || this.A01 != bwx.A01 || !C14360o3.A0K(this.A02, bwx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0M(this.A04) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
