package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Dw3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31698Dw3 extends AbstractC66422zJ {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C65921TwS A03;

    /* JADX WARN: Type inference failed for: r12v0, types: [X.38O, java.lang.Object] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        VA8 va8 = (VA8) interfaceC66482zP;
        C31979E3h c31979E3h = (C31979E3h) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, va8, c31979E3h);
        C35964FuO c35964FuO = FEH.A00;
        UserSession userSession = this.A02;
        Context context = this.A00;
        Fragment fragment = this.A01;
        C65921TwS c65921TwS = this.A03;
        C14360o3.A0B(userSession, 0);
        AbstractC25233BEq.A0x(A1R ? 1 : 0, context, fragment, c65921TwS);
        ViewOnClickListenerC35684FpJ.A00(c31979E3h.A00, c65921TwS, va8, fragment, 51);
        ViewOnClickListenerC35687FpM.A00(c31979E3h.A01, 33, c65921TwS, va8);
        int i = 0;
        for (Object obj : c31979E3h.A02) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            C14360o3.A0B(viewGroup, A1R ? 1 : 0);
            View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_recommended_user, false);
            A0C.setTag(new C34644FOb(A0C));
            A0C.setId(R.id.recommended_user_row_content_identifier);
            viewGroup.removeAllViews();
            viewGroup.addView(A0C);
            Object tag = A0C.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.follow.chaining.binder.RecommendedUserRowViewBinder.Holder");
            C34644FOb c34644FOb = (C34644FOb) tag;
            User user = (User) AbstractC001800i.A0O(va8.A01, i);
            if (user == null) {
                viewGroup.setVisibility(8);
            } else {
                viewGroup.setVisibility(0);
                Map map = GIY.A03;
                Object obj2 = map.get(user);
                Object obj3 = obj2;
                if (obj2 == null) {
                    GIY giy = new GIY(user);
                    map.put(user, giy);
                    obj3 = giy;
                }
                F7Z.A00(context, c35964FuO, userSession, new Object(), c34644FOb, c65921TwS, (GIY) obj3, "search_typeahead", "search_typeahead", i, A1R, A1R, A1R, A1R, A1R, false);
            }
            i = i2;
        }
    }

    public C31698Dw3(Context context, Fragment fragment, UserSession userSession, C65921TwS c65921TwS) {
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = c65921TwS;
        this.A01 = fragment;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31979E3h(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.follow_chaining_search_unit, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA8.class;
    }
}
