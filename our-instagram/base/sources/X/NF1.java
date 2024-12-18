package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NF1 extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C51286Ml9(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.meta_ai_pill_shimmer_keyword, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56087Ov4 c56087Ov4 = (C56087Ov4) interfaceC66482zP;
        C51286Ml9 c51286Ml9 = (C51286Ml9) c3oo;
        AbstractC167017dG.A1N(c56087Ov4, c51286Ml9);
        View view = c51286Ml9.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources A0M = AbstractC25228BEl.A0M(view);
        boolean z = c56087Ov4.A00;
        int i = R.dimen.avatar_powerups_avatar_height;
        if (z) {
            i = R.dimen.search_pill_long_shimmer_width;
        }
        layoutParams.width = A0M.getDimensionPixelSize(i);
        c51286Ml9.A01.A02();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56087Ov4.class;
    }
}
