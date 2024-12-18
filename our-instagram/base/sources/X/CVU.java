package X;

import com.facebook.R;

/* loaded from: classes5.dex */
public final class CVU {
    public final C51722Yv A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVU) {
                CVU cvu = (CVU) obj;
                if (!C14360o3.A0K(this.A01, cvu.A01) || !C14360o3.A0K(this.A00, cvu.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public CVU(C51722Yv c51722Yv, Integer num) {
        this.A01 = num;
        this.A00 = c51722Yv;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, ((-686228842) + AbstractC167017dG.A0M(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LottieAnimationViewArgs(rawRes=");
        A1C.append(R.raw.white_sparkle_anim);
        A1C.append(", animationControl=");
        A1C.append("PLAY");
        A1C.append(", repeatCount=");
        A1C.append(-1);
        A1C.append(", repeatMode=");
        A1C.append(1);
        A1C.append(", minFrame=");
        A1C.append((Object) null);
        A1C.append(", maxFrame=");
        A1C.append((Object) null);
        A1C.append(", animatorListener=");
        A1C.append((Object) null);
        A1C.append(", tintColor=");
        A1C.append(this.A01);
        A1C.append(", style=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
