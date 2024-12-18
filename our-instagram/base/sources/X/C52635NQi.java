package X;

import android.os.Parcelable;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.NQi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52635NQi extends C17T implements InterfaceC128135qh {
    public User A00;

    @Override // X.InterfaceC128135qh
    public final C128125qg F3d(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return A0q(new C1DY(c1dv, 6, false));
    }

    @Override // X.InterfaceC128135qh
    public final InterfaceC58262Ps6 Afp() {
        return (InterfaceC58262Ps6) getTreeValueByHashCode(3138, Eh0.class);
    }

    @Override // X.InterfaceC128135qh
    public final InterfaceC58263Ps7 BlD() {
        return (InterfaceC58263Ps7) getTreeValueByHashCode(2008168156, HSZ.class);
    }

    @Override // X.InterfaceC128135qh
    public final User CDj() {
        return this.A00;
    }

    public final C128125qg A0q(C1DY c1dy) {
        E7Y e7y;
        C38756H4w c38756H4w;
        InterfaceC58262Ps6 Afp = Afp();
        User user = null;
        if (Afp != null) {
            e7y = Afp.ErD();
        } else {
            e7y = null;
        }
        InterfaceC58263Ps7 BlD = BlD();
        if (BlD != null) {
            c38756H4w = BlD.Ez1();
        } else {
            c38756H4w = null;
        }
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) c1dy.A00(A01);
            }
        }
        return new C128125qg(e7y, c38756H4w, user);
    }
}
