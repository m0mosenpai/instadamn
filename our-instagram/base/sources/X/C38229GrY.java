package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GrY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38229GrY implements InterfaceC30988Djn {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC43589JPu A03;
    public final String A04;
    public final InterfaceC09390do A05 = J8Z.A00(this, 10);
    public final InterfaceC09390do A06 = J8Z.A00(this, 11);
    public final InterfaceC09390do A07 = J8Z.A00(this, 12);
    public final int A08;
    public final C57112jm A09;

    @Override // X.InterfaceC30988Djn
    public final void F9W(View view) {
        C14360o3.A0B(view, 0);
        this.A09.A04(view);
    }

    public C38229GrY(Context context, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, String str, int i) {
        this.A00 = context;
        this.A09 = c57112jm;
        this.A04 = str;
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A03 = interfaceC43589JPu;
        this.A08 = i;
    }

    @Override // X.InterfaceC30988Djn
    public final void EDB(View view, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        List list;
        C75113Zb c75113Zb;
        AbstractC167027dH.A12(view, c120985dq, c37644Ghd);
        if (c120985dq.A0J == EnumC40111tc.A09 && (list = c120985dq.A0R) != null) {
            int i = this.A08;
            C38321qM c38321qM = (C38321qM) AbstractC001800i.A0O(list, i);
            if (c38321qM != null && (c75113Zb = c37644Ghd.A0E) != null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(c120985dq.getId());
                A1C.append(":carousel_item:");
                A1C.append(c38321qM.getId());
                A1C.append(':');
                A1C.append(i);
                C59072n8 A00 = C59062n7.A00(c120985dq, new C42C(c75113Zb, i), A1C.toString());
                A00.A00((AbstractC64162vb) this.A05.getValue());
                A00.A00((AbstractC64412w0) this.A06.getValue());
                A00.A00((C38232Grb) this.A07.getValue());
                this.A09.A05(view, A00.A01());
            }
        }
    }
}
