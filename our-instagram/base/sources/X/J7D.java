package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes7.dex */
public final /* synthetic */ class J7D extends C03E implements InterfaceC16620sF {
    public static final J7D A00 = new J7D();

    public J7D() {
        super(2, AbstractC39672Hj1.class, "renderHeaderPlaceHolder", "renderHeaderPlaceHolder(Lcom/instagram/stories/header/domain/StoriesHeaderViewModel$UiState;Landroid/view/View;)V", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C38677GzI c38677GzI = (C38677GzI) obj;
        View view = (View) obj2;
        AbstractC167017dG.A1N(c38677GzI, view);
        View A0S = AbstractC166997dE.A0S(view, R.id.reel_viewer_header);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.reel_viewer_text_container);
        IgTextView igTextView = (IgTextView) AbstractC166997dE.A0S(view, R.id.reel_viewer_title);
        IgTextView igTextView2 = (IgTextView) AbstractC166997dE.A0S(view, R.id.reel_viewer_timestamp);
        Context A0L = AbstractC166997dE.A0L(view);
        Resources resources = view.getResources();
        C14360o3.A07(resources);
        AbstractC40893I9r.A00(A0L, resources, A0S, A0S2, igTextView, igTextView2, c38677GzI);
        return C0eB.A00;
    }
}
