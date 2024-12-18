package X;

import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* loaded from: classes7.dex */
public final /* synthetic */ class J7E extends C03E implements InterfaceC16620sF {
    public static final J7E A00 = new J7E();

    public J7E() {
        super(2, AbstractC40895I9t.class, "renderLikePlaceHolder", "renderLikePlaceHolder(Lcom/instagram/stories/like/domain/StoryViewerLikeViewModel$UiState;Landroid/view/View;)V", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C50525MSe c50525MSe = (C50525MSe) obj;
        View view = (View) obj2;
        AbstractC167017dG.A1N(c50525MSe, view);
        AbstractC40895I9t.A00(c50525MSe, (IgBouncyUfiButtonImageView) AbstractC166997dE.A0R(view, R.id.toolbar_like_button), null);
        return C0eB.A00;
    }
}
