package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;

/* loaded from: classes8.dex */
public final class JSH extends AbstractC46439Kgz {
    public final DirectThreadKey A00;
    public final Reel A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JSH) {
                JSH jsh = (JSH) obj;
                if (!C14360o3.A0K(this.A00, jsh.A00) || !C14360o3.A0K(this.A01, jsh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public JSH(DirectThreadKey directThreadKey, Reel reel) {
        this.A00 = directThreadKey;
        this.A01 = reel;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OpenReel(threadKey=");
        A1C.append(this.A00);
        A1C.append(", reelForThread=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
