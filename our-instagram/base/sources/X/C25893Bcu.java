package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Bcu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25893Bcu extends C2UU {
    public List A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        CAY cay = C7Q.values()[getItemViewType(i)].A00;
        List list = this.A00;
        cay.A01(c3oo, this.A01, this.A02, list, i);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return C7Q.values()[i].A00.A00(viewGroup);
    }

    public C25893Bcu(InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list) {
        AbstractC167017dG.A1P(list, userSession);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = list;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-552152904);
        int size = this.A00.size();
        C0f9.A0A(2127948308, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C7Q c7q;
        int A03 = C0f9.A03(1386806774);
        Object obj = this.A00.get(i);
        C14360o3.A0B(obj, 0);
        if (obj instanceof C31335Dq0) {
            c7q = C7Q.A04;
        } else if (obj instanceof GHY) {
            c7q = C7Q.A05;
        } else if (obj instanceof C27834COx) {
            c7q = C7Q.A03;
        } else {
            throw AbstractC166987dD.A12(MSV.A00(18));
        }
        int ordinal = c7q.ordinal();
        C0f9.A0A(452110619, A03);
        return ordinal;
    }
}
