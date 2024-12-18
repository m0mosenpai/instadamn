package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.List;

/* loaded from: classes9.dex */
public final class NFS extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public NFS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            C55908Orz c55908Orz = (C55908Orz) this.A02;
            C55908Orz.A02(c55908Orz);
            C9GR.A0A(c55908Orz.A01, "share_error");
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            File file = (File) obj;
            C14360o3.A0B(file, 0);
            InterfaceC69973Cg interfaceC69973Cg = (InterfaceC69973Cg) this.A01;
            C55908Orz c55908Orz = (C55908Orz) this.A02;
            C55908Orz.A02(c55908Orz);
            android.net.Uri fromFile = android.net.Uri.fromFile(file);
            C38321qM c38321qM = c55908Orz.A08;
            if (c38321qM != null) {
                if (c38321qM.Cff()) {
                    UserSession userSession = c55908Orz.A07;
                    if (C18U.A06(C06090Tz.A05, userSession, 36323942876589776L)) {
                        Activity activity = c55908Orz.A01;
                        List A1J = AbstractC166987dD.A1J(C8IU.A03(file, 3, 0));
                        AbstractC86593tX.A0L(activity, C22P.A4I, userSession, null, null, null, c38321qM.getId(), A1J, false);
                        return;
                    }
                    C14360o3.A0A(fromFile);
                    interfaceC69973Cg.Eo7(fromFile, C22P.A4I, c38321qM.getId(), null, 3, false);
                    return;
                }
                C14360o3.A0A(fromFile);
                interfaceC69973Cg.EnC(fromFile, C22P.A4I, c38321qM.getId(), 3, 10004);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C183978Ee c183978Ee = (C183978Ee) obj;
        C14360o3.A0B(c183978Ee, 0);
        C1825187q c1825187q = (C1825187q) this.A02;
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
        c1825187q.A02.A01(c183978Ee.A07, c183978Ee.A06(), true);
        MSX.A1A(c1825187q.A00, true);
        if (!C18U.A06(C06090Tz.A05, abstractC12990ll, 36327533469448864L)) {
            return;
        }
        AbstractC166987dD.A1Z(new MCD(c1825187q, null, 47), AbstractC141776au.A00(c1825187q));
    }
}
