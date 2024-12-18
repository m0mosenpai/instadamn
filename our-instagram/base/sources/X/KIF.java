package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class KIF extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC144946gE A03;
    public final boolean A04;

    public KIF(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC144946gE interfaceC144946gE, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = interfaceC144946gE;
        this.A04 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44744JrR(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.trending_prompt_single_card_item, false), this.A04);
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [X.0pO, java.lang.Object] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C0eB c0eB;
        C38321qM c38321qM;
        C45213Jzt c45213Jzt = (C45213Jzt) interfaceC66482zP;
        C44744JrR c44744JrR = (C44744JrR) c3oo;
        int i = 0;
        boolean A1R = AbstractC167007dF.A1R(0, c45213Jzt, c44744JrR);
        StoryPromptTappableData storyPromptTappableData = c45213Jzt.A01;
        PromptStickerModel promptStickerModel = new PromptStickerModel(storyPromptTappableData);
        c44744JrR.A03.setText(storyPromptTappableData.A0Q);
        ImageView imageView = c44744JrR.A02;
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        imageView.setImageDrawable(new C180547zi(context, promptStickerModel, C05F.A0C, interfaceC11380iw.getModuleName(), i, i, 240));
        View view = c44744JrR.A01;
        ViewOnClickListenerC48068LPt.A00(view, this, c45213Jzt, promptStickerModel, 33);
        ViewOnClickListenerC48068LPt.A00(c44744JrR.A04, this, c45213Jzt, promptStickerModel, 34);
        List list = c45213Jzt.A03;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((C56302iJ) layoutParams).A0G = R.id.prompts_featured_prompt_preview_image;
            ViewGroup.LayoutParams layoutParams2 = c44744JrR.A00.getLayoutParams();
            C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((C56302iJ) layoutParams2).A0t = R.id.prompts_featured_prompt_preview_image;
            View view2 = c44744JrR.A05.getView();
            C14360o3.A0B(view2, 0);
            List A1Q = AbstractC16960so.A1Q(new C49576LvV(AbstractC167007dF.A0T(view2, R.id.image_start)), new C49576LvV(AbstractC167007dF.A0T(view2, R.id.image_center)), new C49576LvV(AbstractC167007dF.A0T(view2, R.id.image_end)));
            ?? obj = new Object();
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                List list2 = c45213Jzt.A04;
                if (list2 != null && (c38321qM = (C38321qM) list2.get(i2)) != null) {
                    C49576LvV c49576LvV = (C49576LvV) A1Q.get(i2);
                    float A0m = c38321qM.A0m();
                    float f = obj.A00;
                    if (A0m > f) {
                        f = c38321qM.A0m();
                    }
                    obj.A00 = f;
                    IgImageView igImageView = c49576LvV.A00;
                    ImageUrl A1S = c38321qM.A1S();
                    if (A1S != null) {
                        igImageView.setUrl(A1S, interfaceC11380iw);
                        C0fQ.A00(new LPM(11, this, c49576LvV, obj2, c45213Jzt), c49576LvV.A00);
                        c0eB = C0eB.A00;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    c0eB = null;
                }
                A0q.add(c0eB);
                i2 = i3;
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            C14360o3.A0C(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            ((AnonymousClass807) layoutParams3).A01 = A1R;
            AbstractC13880nE.A0q(view, new RunnableC50005M5u(c44744JrR, A1Q, obj));
        } else {
            c44744JrR.A05.setVisibility(8);
        }
        InterfaceC144946gE interfaceC144946gE = this.A03;
        C59072n8 A00 = C59062n7.A00(c45213Jzt, C0eB.A00, promptStickerModel.A03);
        A00.A00(new C45734KMm(this.A02, interfaceC144946gE));
        interfaceC144946gE.DeR(view, A00.A01());
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45213Jzt.class;
    }
}
