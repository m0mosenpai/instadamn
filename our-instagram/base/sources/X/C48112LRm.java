package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LRm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48112LRm implements InterfaceC43397JFm {
    public final /* synthetic */ C206209Bd A00;
    public final /* synthetic */ C45510KCz A01;

    public C48112LRm(C206209Bd c206209Bd, C45510KCz c45510KCz) {
        this.A01 = c45510KCz;
        this.A00 = c206209Bd;
    }

    @Override // X.InterfaceC43397JFm
    public final void Cwn() {
        String str;
        String str2;
        C45510KCz c45510KCz = this.A01;
        C45510KCz.A03(c45510KCz).A00();
        int A00 = C45510KCz.A00(c45510KCz);
        C66362zD c66362zD = c45510KCz.A0D;
        LZV lzv = null;
        if (c66362zD == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        List AuX = c66362zD.A04.AuX();
        C14360o3.A07(AuX);
        Object A0O = AbstractC001800i.A0O(AuX, A00);
        if (A0O instanceof LZV) {
            lzv = (LZV) A0O;
        }
        C26086BgF A01 = C45510KCz.A01(lzv, c45510KCz);
        C26086BgF c26086BgF = (C26086BgF) this.A00.A00;
        User user = null;
        if (c26086BgF != null) {
            str = c26086BgF.A04;
        } else {
            str = null;
        }
        if (A01 != null) {
            str2 = A01.A04;
        } else {
            str2 = null;
        }
        if (!C14360o3.A0K(str, str2)) {
            C3CY A03 = C45510KCz.A03(c45510KCz);
            if (lzv != null) {
                user = lzv.A00;
            }
            A03.A03(A01, user);
        }
    }
}
