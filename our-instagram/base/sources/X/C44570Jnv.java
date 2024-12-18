package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jnv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44570Jnv extends C2UU {
    public RecyclerView A00;
    public C47K A01 = new C47K(null);
    public final C25671My A02;
    public final InterfaceC63682up A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C63712us A07;

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C47O A00;
        TextView textView;
        String username;
        C14360o3.A0B(c3oo, 0);
        C47L A02 = this.A01.A02(i);
        if (A02 != null && (A00 = A02.A00()) != null) {
            User user = A00.A03;
            C44751JrY c44751JrY = (C44751JrY) c3oo;
            FollowButton followButton = c44751JrY.A08;
            ((FollowButtonBase) followButton).A0A = true;
            if (user != null) {
                C19260xA c19260xA = new C19260xA();
                C19260xA.A00(c19260xA, true, "can_show_follow_back");
                C19260xA.A00(c19260xA, Boolean.valueOf(user.A27()), "following_current_user");
                String str = this.A01.A0C;
                if (str != null && str.length() != 0) {
                    C19260xA.A00(c19260xA, str, AbstractC111324zv.A00(447));
                }
                C19260xA.A00(c19260xA, "profile", "format");
                C19260xA.A00(c19260xA, this.A01.getId(), AbstractC111324zv.A00(3267));
                ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
                viewOnAttachStateChangeListenerC110564yT.A0Q = false;
                viewOnAttachStateChangeListenerC110564yT.A08(new C46081Kaf(0, this, A00));
                viewOnAttachStateChangeListenerC110564yT.A03 = c19260xA;
                UserSession userSession = c44751JrY.A05;
                InterfaceC11380iw interfaceC11380iw = this.A05;
                viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
                String fullName = user.getFullName();
                if (fullName != null && fullName.length() != 0) {
                    textView = c44751JrY.A04;
                    username = user.getFullName();
                } else {
                    textView = c44751JrY.A04;
                    username = user.getUsername();
                }
                textView.setText(username);
                TextView textView2 = c44751JrY.A03;
                textView2.setText(A00.A05);
                C06090Tz c06090Tz = C06090Tz.A06;
                int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36598034804575318L);
                if (A07 < 2) {
                    textView2.setMaxLines(A07);
                } else {
                    textView2.post(new RunnableC49900M1t(c3oo));
                }
                C0fQ.A00(new LPM(8, this, c3oo, c44751JrY, A00), c44751JrY.A01);
                ViewOnClickListenerC48068LPt.A00(c44751JrY.A06, this, c3oo, A00, 26);
                ExtendedImageUrl extendedImageUrl = A00.A01;
                CircularImageView circularImageView = c44751JrY.A07;
                if (extendedImageUrl != null) {
                    circularImageView.setUrl(extendedImageUrl, interfaceC11380iw);
                } else {
                    AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, user);
                }
                if (C18U.A06(c06090Tz, userSession, 36316559828062729L)) {
                    ImmutableList socialContextFacepileUsers = A00.getSocialContextFacepileUsers();
                    if (socialContextFacepileUsers != null && !socialContextFacepileUsers.isEmpty()) {
                        textView2.setGravity(8388611);
                        ImageView imageView = c44751JrY.A02;
                        Context context = c44751JrY.A00;
                        imageView.setImageDrawable(AbstractC89513yr.A06(context, Float.valueOf(0.6f), Integer.valueOf(AbstractC166987dD.A0C(context, 1)), null, interfaceC11380iw.getModuleName(), socialContextFacepileUsers, AbstractC166987dD.A0C(context, 18)));
                        imageView.setVisibility(0);
                    } else {
                        textView2.setGravity(17);
                        c44751JrY.A02.setVisibility(8);
                    }
                }
            }
            C63712us c63712us = this.A07;
            c63712us.A00(this.A01, A00);
            c63712us.A00.A05(c44751JrY.A01, c63712us.A01.A00(A00.getId()));
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A04;
        return new C44751JrY(context, AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.immersive_suggested_users_layout, false), this.A06);
    }

    public final void A00(C47K c47k) {
        ArrayList arrayList;
        this.A01 = c47k;
        C47R c47r = C47R.A0A;
        List list = c47k.A0P;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((C47L) obj).A07 == c47r) {
                    A1E.add(obj);
                }
            }
            arrayList = AbstractC001800i.A0U(A1E);
        } else {
            arrayList = null;
        }
        c47k.A0P = arrayList;
        notifyDataSetChanged();
    }

    public C44570Jnv(Context context, UserSession userSession, InterfaceC63682up interfaceC63682up, C63712us c63712us) {
        this.A04 = context;
        this.A06 = userSession;
        this.A03 = interfaceC63682up;
        this.A07 = c63712us;
        this.A05 = interfaceC63682up.Abd();
        this.A02 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(409398533);
        int A0I = AbstractC25231BEo.A0I(this.A01.A0P);
        C0f9.A0A(1026767955, A03);
        return A0I;
    }
}
