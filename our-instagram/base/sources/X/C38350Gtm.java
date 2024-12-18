package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectSearchResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Gtm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38350Gtm extends C2UU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Context A04;
    public InterfaceC11380iw A05;
    public UserSession A06;
    public InterfaceC132405yL A07;
    public C125595m5 A08;
    public String A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public List A0D;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        List list = this.A0C;
        List list2 = this.A0B;
        List list3 = this.A0D;
        InterfaceC132405yL interfaceC132405yL = this.A07;
        if ((c3oo instanceof C101544hP) && interfaceC132405yL != null && list3 != null && list2 != null && !list2.isEmpty() && ((C120985dq) list2.get(i)).A02 != null && list != null && !list.isEmpty() && this.A08 != null) {
            interfaceC132405yL.Dqk(c3oo.itemView, null, (DirectSearchResult) list3.get(i), AbstractC111324zv.A00(4662), this.A00, this.A01 + i, i, this.A02, false);
            C120985dq c120985dq = (C120985dq) list2.get(i);
            ArrayList A1F = AbstractC166987dD.A1F((Collection) list.get(i));
            c120985dq.A08 = A1F;
            C38321qM c38321qM = ((C120985dq) list2.get(i)).A02;
            Context context = this.A04;
            UserSession userSession = this.A06;
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            C62812tK c62812tK = new C62812tK(userSession, context);
            InterfaceC11380iw interfaceC11380iw = this.A05;
            Integer num = C05F.A00;
            AbstractC130345ue.A01(context, null, c120985dq, interfaceC11380iw, userSession, A0E, new C38625GyS((DirectSearchResharedContent) list3.get(i), this.A00, this.A01 + i, i, this.A03, this.A02), (C101544hP) c3oo, c62812tK, C60S.A04, num, A1F, false, false);
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C125595m5 c125595m5 = this.A08;
        if (c125595m5 != null) {
            return AbstractC130345ue.A00(this.A04, viewGroup, RIXUCoverSize.A04, this.A05, this.A06, c125595m5, C60S.A04, false, true, false);
        }
        throw AbstractC166987dD.A12("Delegate is null");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(-1870002883);
        List list = this.A0B;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C0f9.A0A(20740818, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(1455558879, C0f9.A03(-18049669));
        return 1;
    }
}
