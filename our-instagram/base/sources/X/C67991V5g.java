package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V5g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67991V5g extends AbstractC66422zJ {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final String A03;
    public final List A04;
    public final InterfaceC16610sE A05;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.avatar_mentions_user_list_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        FollowStatus followStatus;
        Integer num;
        Object obj;
        URY ury = (URY) interfaceC66482zP;
        AbstractC167007dF.A1K(ury, c3oo);
        View view = c3oo.itemView;
        C14360o3.A0C(view, MSV.A00(12));
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.user_list_avatar_profile_pic);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.user_list_username);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.user_list_name);
        ViewStub A0M = AbstractC167007dF.A0M(view, R.id.user_list_large_follow_button_stub);
        ViewStub A0M2 = AbstractC167007dF.A0M(view, R.id.user_list_send_button_stub);
        List list = this.A04;
        ImageUrl imageUrl = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((User) obj).getId(), ury.A00.A02)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                imageUrl = user.Bhu();
            }
        }
        UPK upk = ury.A00;
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(upk.A00);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        A0T.setUrl(simpleImageUrl, interfaceC11380iw);
        String str = upk.A03;
        A0N.setText(str);
        A0N2.setText(upk.A01);
        WNP.A00(view, 61, ury, this);
        boolean z = upk.A06;
        if (z) {
            WNX.A00(A0M2.inflate(), ury, this, imageUrl, 46);
            return;
        }
        UserSession userSession = this.A02;
        String str2 = userSession.userId;
        String str3 = upk.A02;
        if (C14360o3.A0K(str2, str3)) {
            return;
        }
        User user2 = new User(str3, str);
        user2.A0v(false);
        if (upk.A04) {
            followStatus = FollowStatus.A07;
        } else {
            followStatus = FollowStatus.A06;
        }
        user2.A0k(followStatus);
        user2.A10(z);
        if (upk.A05) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        user2.A0n(num);
        if (imageUrl != null) {
            user2.A0i(imageUrl);
        }
        View inflate = A0M.inflate();
        C14360o3.A0C(inflate, AbstractC111324zv.A00(2801));
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = ((FollowButtonBase) inflate).A0J;
        viewOnAttachStateChangeListenerC110564yT.A0I = "ig_avatar_mention_user_list";
        viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user2);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return URY.class;
    }

    public C67991V5g(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, List list, InterfaceC16610sE interfaceC16610sE) {
        AbstractC167017dG.A1R(userSession, str);
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = activity;
        this.A04 = list;
        this.A05 = interfaceC16610sE;
    }
}
