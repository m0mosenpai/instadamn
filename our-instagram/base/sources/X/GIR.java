package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIR implements GZU {
    public final /* synthetic */ C36006Fv4 A00;

    @Override // X.GZU
    public final void Ddb(User user, boolean z) {
    }

    public GIR(C36006Fv4 c36006Fv4) {
        this.A00 = c36006Fv4;
    }

    @Override // X.GZU
    public final void Dda() {
        String str;
        C36006Fv4 c36006Fv4 = this.A00;
        if (c36006Fv4.A0C.A1t()) {
            str = "hide_story";
        } else {
            str = "unhide_story";
        }
        C36006Fv4.A01(c36006Fv4, str);
    }
}
