package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Bwj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27060Bwj extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final InterfaceC30941Div A01;
    public final UserSession A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C29157CtO c29157CtO = (C29157CtO) interfaceC66482zP;
        C25929BdW c25929BdW = (C25929BdW) c3oo;
        AbstractC167017dG.A1N(c29157CtO, c25929BdW);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        InterfaceC30941Div interfaceC30941Div = this.A01;
        AbstractC167017dG.A1R(interfaceC11380iw, interfaceC30941Div);
        IgTextView igTextView = c25929BdW.A01;
        Achievement achievement = c29157CtO.A00;
        igTextView.setText(achievement.A0A);
        IgImageView igImageView = c25929BdW.A02;
        ViewOnClickListenerC28668ClG.A02(igImageView, 23, interfaceC30941Div, c29157CtO);
        if (achievement.C8L() != null) {
            Integer num = achievement.A05;
            if (num != null) {
                c25929BdW.A00.setText(AbstractC25235BEs.A0o(num.intValue()));
            }
            str = achievement.A09;
        } else {
            c25929BdW.A00.setVisibility(8);
            str = achievement.A0B;
        }
        AbstractC25235BEs.A1I(interfaceC11380iw, igImageView, str);
    }

    public C27060Bwj(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC30941Div interfaceC30941Div) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC30941Div;
        this.A02 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.achievement_list_item, false);
        A0D.setTag(new C25929BdW(A0D));
        Object tag = A0D.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creator.achievements.modules.adapter.AchievementsItemViewBinder.Holder");
        return (C3OO) tag;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C29157CtO.class;
    }
}
