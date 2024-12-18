package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jnu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44569Jnu extends C2UU {
    public List A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final L9S A04;
    public final Long A05;

    public C44569Jnu(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, L9S l9s, Long l) {
        C14360o3.A0B(userSession, 2);
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = l9s;
        this.A05 = l;
        this.A00 = C16930sl.A00;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C44737JrK(AbstractC25227BEk.A0D(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.direct_card_recs_from_friends, false));
    }

    public final void A00(int i, String str) {
        this.A04.A00(this.A05, AbstractC31171DnF.A0V(i), "follow_user", this.A02.getModuleName(), str, getItemCount());
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        User user;
        C44737JrK c44737JrK = (C44737JrK) c3oo;
        C14360o3.A0B(c44737JrK, 0);
        C47G c47g = ((C47I) this.A00.get(i)).A06;
        if (c47g != null && (user = c47g.A02) != null) {
            CircularImageView circularImageView = c44737JrK.A02;
            ImageUrl Bhu = user.Bhu();
            InterfaceC11380iw interfaceC11380iw = this.A02;
            circularImageView.setUrl(Bhu, interfaceC11380iw);
            c44737JrK.A01.setText(user.B8y());
            String fullName = user.getFullName();
            if (fullName != null && fullName.length() != 0) {
                IgTextView igTextView = c44737JrK.A00;
                AbstractC31173DnH.A1F(igTextView, user);
                igTextView.setVisibility(0);
            } else {
                c44737JrK.A00.setVisibility(8);
            }
            ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = c44737JrK.A04.A0J;
            viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, this.A03, user);
            viewOnAttachStateChangeListenerC110564yT.A08(new C46081Kaf(1, this, c44737JrK));
            ViewOnClickListenerC48068LPt.A00(c44737JrK.A03, this, c44737JrK, user, 35);
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(486766869);
        int size = this.A00.size();
        C0f9.A0A(993203307, A03);
        return size;
    }
}
