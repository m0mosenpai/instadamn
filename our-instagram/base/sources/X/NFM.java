package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Timer;

/* loaded from: classes9.dex */
public final class NFM extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public NFM(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51290MlD(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.iglive_reactions_picker_item, false));
    }

    private final void A00(IgImageView igImageView, C51822MvQ c51822MvQ) {
        if (c51822MvQ.A00) {
            igImageView.setScaleX(0.0f);
            igImageView.setScaleY(0.0f);
            igImageView.setAlpha(0.0f);
            igImageView.setVisibility(0);
            c51822MvQ.A00 = false;
            new Timer().schedule(new PW9(igImageView), c51822MvQ.A01);
            return;
        }
        igImageView.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0116, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r26, X.C3OO r27) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NFM.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51822MvQ.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C51290MlD c51290MlD = (C51290MlD) c3oo;
        C14360o3.A0B(c51290MlD, 0);
        IgImageView igImageView = c51290MlD.A01;
        igImageView.setVisibility(8);
        igImageView.clearAnimation();
        IgImageView igImageView2 = c51290MlD.A00;
        igImageView2.setVisibility(8);
        igImageView2.clearAnimation();
    }
}
