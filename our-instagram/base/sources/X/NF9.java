package X;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* loaded from: classes9.dex */
public final class NF9 extends AbstractC66422zJ {
    public final Context A00;
    public final O3O A01;

    public NF9(Context context, O3O o3o) {
        C14360o3.A0B(o3o, 2);
        this.A00 = context;
        this.A01 = o3o;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.immersive_catch_up_summary_item_layout, viewGroup, false);
        Drawable background = inflate.getBackground();
        C14360o3.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) background;
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
        return new C51339Mm0(this.A00, inflate, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51818MvM c51818MvM = (C51818MvM) interfaceC66482zP;
        C51339Mm0 c51339Mm0 = (C51339Mm0) c3oo;
        AbstractC167017dG.A1N(c51818MvM, c51339Mm0);
        IgdsMediaButton igdsMediaButton = c51339Mm0.A01;
        Context context = c51339Mm0.A00;
        AbstractC50523MSb.A0h(context, igdsMediaButton, c51818MvM.A02, 2131964324);
        AbstractC50523MSb.A0h(context, c51339Mm0.A02, c51818MvM.A00, 2131964326);
        AbstractC50523MSb.A0h(context, c51339Mm0.A04, c51818MvM.A03, 2131964328);
        AbstractC50523MSb.A0h(context, c51339Mm0.A03, c51818MvM.A01, 2131964327);
        AbstractC50523MSb.A0h(context, c51339Mm0.A05, c51818MvM.A04, 2131964325);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51818MvM.class;
    }
}
