package X;

import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LdD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48515LdD implements InterfaceC13000lm {
    public static final C46789Kmk A04 = new Object();
    public final UserSession A00;
    public final C23031Ai A01;
    public final List A02;
    public final List A03;

    public static final void A00(C48515LdD c48515LdD) {
        List<C45113Jxi> list = c48515LdD.A02;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (C45113Jxi c45113Jxi : list) {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            String str = c45113Jxi.A04;
            if (str != null) {
                A0S.A0S("draft_id", str);
            }
            if (c45113Jxi.A01 != null) {
                A0S.A0r("media_edits");
                AbstractC203258yi.A00(A0S, (C203248yh) c45113Jxi.A01);
            }
            if (c45113Jxi.A02 != null) {
                A0S.A0r("persisted_media_info");
                AbstractC196968nR.A00(A0S, (C196948nP) c45113Jxi.A02);
            }
            A0S.A0R("date_created", c45113Jxi.A00);
            String str2 = c45113Jxi.A03;
            if (str2 != null) {
                A0S.A0S("cover_file_path", str2);
            }
            A0q.add(AbstractC167017dG.A0l(A0S, stringWriter));
        }
        java.util.Set A0k = AbstractC001800i.A0k(A0q);
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(c48515LdD.A01);
        A0w.E7L("magic_media_drafts", A0k);
        A0w.apply();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.clear();
    }

    public C48515LdD(C23031Ai c23031Ai, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, c23031Ai);
        this.A00 = userSession;
        this.A01 = c23031Ai;
        this.A02 = AbstractC166987dD.A1E();
        this.A03 = AbstractC166987dD.A1E();
    }
}
