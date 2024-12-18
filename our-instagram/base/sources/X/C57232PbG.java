package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.PbG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57232PbG extends C03E implements InterfaceC16620sF {
    public static final C57232PbG A00 = new C57232PbG();

    public C57232PbG() {
        super(2, AbstractC54231NyC.class, "renderReplyBarPlaceHolder", "renderReplyBarPlaceHolder(Lcom/instagram/stories/messagecomposer/domain/StoriesMessageComposerViewModel$UiState$ComposerInactive;Landroid/view/View;)V", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C51943MxQ c51943MxQ = (C51943MxQ) obj;
        View view = (View) obj2;
        AbstractC167017dG.A1N(c51943MxQ, view);
        View A0R = AbstractC166997dE.A0R(view, R.id.message_composer_container);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.composer_text);
        AbstractC166997dE.A18(A0R.getContext(), A0R, 2131971749);
        AbstractC54231NyC.A00(A0R, A0N, c51943MxQ, C57472Pf8.A00);
        return C0eB.A00;
    }
}
