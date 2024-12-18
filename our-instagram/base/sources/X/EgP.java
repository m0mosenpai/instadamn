package X;

import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class EgP extends GAU {
    public final C34649FOh A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC37225Gaa
    public final String AY9() {
        return "facebook_account";
    }

    @Override // X.InterfaceC37225Gaa
    public final boolean EJP() {
        return true;
    }

    @Override // X.InterfaceC37225Gaa
    public final String B1C() {
        return this.A00.A0D;
    }

    @Override // X.InterfaceC37225Gaa
    public final ImageUrl BGs() {
        return this.A00.A05;
    }

    @Override // X.InterfaceC37225Gaa
    public final String Bck() {
        return this.A00.A0M;
    }

    @Override // X.InterfaceC37225Gaa
    public final String getFullName() {
        return this.A00.A0F;
    }

    @Override // X.InterfaceC37225Gaa
    public final String getUserId() {
        return this.A00.A0G;
    }

    @Override // X.InterfaceC37225Gaa
    public final String getUsername() {
        return this.A00.A0O;
    }

    public EgP(C34649FOh c34649FOh, String str, String str2) {
        this.A01 = str;
        this.A00 = c34649FOh;
        this.A02 = str2;
    }

    @Override // X.InterfaceC37225Gaa
    public final int AdK() {
        return R.drawable.instagram_facebook_circle_filled_12;
    }
}
