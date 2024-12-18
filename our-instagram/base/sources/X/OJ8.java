package X;

import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public abstract class OJ8 {
    public static int A04;
    public final int A00;
    public final long A01;
    public final Reel A02;
    public final C41181vS A03;

    public final String A00() {
        C38321qM c38321qM;
        if (this instanceof N3Z) {
            return ((N3Z) this).A00;
        }
        if (this instanceof C52100N3a) {
            return ((C52100N3a) this).A00;
        }
        C41181vS c41181vS = this.A03;
        if (c41181vS != null) {
            c38321qM = c41181vS.A0b;
        } else {
            c38321qM = null;
        }
        if (c38321qM != null) {
            String id = c38321qM.getId();
            if (id != null) {
                return id;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public OJ8(Reel reel, C41181vS c41181vS, int i, long j) {
        this.A03 = c41181vS;
        this.A02 = reel;
        this.A00 = i;
        this.A01 = j;
    }
}
