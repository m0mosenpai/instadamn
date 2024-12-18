package X;

import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.G7r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36493G7r implements GXl {
    public final /* synthetic */ C3CZ A00;
    public final /* synthetic */ String A01;

    public C36493G7r(C3CZ c3cz, String str) {
        this.A01 = str;
        this.A00 = c3cz;
    }

    @Override // X.GXl
    public final void D6t() {
        android.net.Uri fromFile = android.net.Uri.fromFile(new File(this.A01));
        C3CZ c3cz = this.A00;
        C3CZ.A01(fromFile, c3cz, 1);
        C36290Fzk A00 = AbstractC34220F7s.A00(c3cz.A04);
        UserSession userSession = A00.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((C18U.A06(c06090Tz, userSession, 2342155956973995573L) && A00.A00.A03 && !C36290Fzk.A00(A00, false) && C18U.A06(c06090Tz, userSession, 36312939170629170L)) || (C18U.A06(c06090Tz, userSession, 2342155956973995573L) && A00.A00.A04 && !C36290Fzk.A00(A00, false) && C18U.A06(c06090Tz, userSession, 36312943465596468L))) {
            c3cz.A00 = true;
        }
    }
}
