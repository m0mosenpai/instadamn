package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.MxF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51932MxF extends C0T6 implements InterfaceC57873Pld {
    public final Reel A00;
    public final C41181vS A01;
    public final C51625MrI A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51932MxF) {
                C51932MxF c51932MxF = (C51932MxF) obj;
                if (!C14360o3.A0K(this.A00, c51932MxF.A00) || !C14360o3.A0K(this.A01, c51932MxF.A01) || !C14360o3.A0K(this.A02, c51932MxF.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public C51932MxF(Reel reel, C41181vS c41181vS, C51625MrI c51625MrI) {
        this.A00 = reel;
        this.A01 = c41181vS;
        this.A02 = c51625MrI;
    }
}
