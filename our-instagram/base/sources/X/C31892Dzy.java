package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dzy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31892Dzy extends C2UU {
    public List A00;
    public boolean A01;
    public final InterfaceC11380iw A02;
    public final C36753GIa A03;
    public final C57582kX A04;
    public final InterfaceC62602sz A05;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3OO, X.E0f] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.3OO, X.E0g] */
    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            View A00 = LoadMoreButton.A00(viewGroup.getContext(), R.layout.thread_message_load_more_empty, viewGroup);
            ?? c3oo = new C3OO(A00);
            c3oo.A00 = (LoadMoreButton) AbstractC166987dD.A0c(A00, R.id.row_load_more_button);
            return c3oo;
        }
        View A002 = FY8.A00(viewGroup);
        ?? c3oo2 = new C3OO(A002);
        Object tag = A002.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.user.userlist.adapter.SelectableUserBinder.UserRowWithCheckboxHolder");
        c3oo2.A00 = (C31953E2h) tag;
        return c3oo2;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        String fullName;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C31899E0f) {
            Context A05 = AbstractC31172DnG.A05(c3oo);
            User user = (User) this.A00.get(i);
            C36753GIa c36753GIa = this.A03;
            C32282EJt c32282EJt = c36753GIa.A00;
            c32282EJt.A02.getClass();
            Object A0r = AbstractC31174DnI.A0r(user, c32282EJt.A02.A03);
            if (this.A04.A0N(user) == FollowStatus.A05) {
                str = A05.getString(2131962780);
            } else {
                str = null;
            }
            C31953E2h c31953E2h = ((C31899E0f) c3oo).A00;
            String username = user.getUsername();
            if (A0r != null) {
                fullName = AbstractC167007dF.A0f(A05, A0r, 2131972446);
            } else {
                fullName = user.getFullName();
            }
            FNI fni = new FNI(user, username, fullName, str, c32282EJt.A0C.contains(user));
            InterfaceC11380iw interfaceC11380iw = this.A02;
            C14360o3.A0B(c31953E2h, 0);
            FY8.A01(null, interfaceC11380iw, c36753GIa, c31953E2h, fni, true, false, false);
            return;
        }
        if (!(c3oo instanceof C31900E0g)) {
            return;
        }
        ((C31900E0g) c3oo).A00.A04(this.A05, null);
    }

    public C31892Dzy(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C36753GIa c36753GIa, InterfaceC62602sz interfaceC62602sz) {
        AbstractC167027dH.A13(userSession, interfaceC62602sz, c36753GIa);
        this.A00 = AbstractC166987dD.A1E();
        this.A05 = interfaceC62602sz;
        this.A03 = c36753GIa;
        this.A02 = interfaceC11380iw;
        this.A04 = C57582kX.A00(userSession);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-188002636);
        int size = this.A00.size() + (this.A01 ? 1 : 0);
        C0f9.A0A(-1767617751, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1425456461);
        int i2 = 1;
        if (i < this.A00.size()) {
            i2 = 0;
        }
        C0f9.A0A(636604919, A03);
        return i2;
    }
}
