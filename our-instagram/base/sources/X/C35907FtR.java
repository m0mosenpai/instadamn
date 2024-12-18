package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FtR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35907FtR implements InterfaceC114785Gl {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ C6FW A02;
    public final /* synthetic */ UserSession A03;

    public C35907FtR(Fragment fragment, C6FQ c6fq, C6FW c6fw, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = fragment;
        this.A02 = c6fw;
        this.A01 = c6fq;
    }

    @Override // X.InterfaceC114785Gl
    public final void FAY(android.net.Uri uri) {
        if (EnumC69993Ci.IG_EDIT_PROFILE.equals(C3CZ.A0B)) {
            MUK.A02(this.A03).A00 = true;
            AbstractC25226BEj.A1Q(this.A00);
        }
        Object obj = this.A02.A00.get(0);
        if (obj instanceof C1344465q) {
            InterfaceC103384lE interfaceC103384lE = ((C1344465q) obj).A00;
            C6FQ c6fq = this.A01;
            SUY.A00 = c6fq;
            C131845xK.A00(c6fq, AbstractC25225BEi.A0s().A00(), interfaceC103384lE);
        }
    }
}
