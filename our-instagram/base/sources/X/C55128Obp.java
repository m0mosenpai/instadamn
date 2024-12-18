package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.slidecontentlayout.SlideContentLayout;

/* renamed from: X.Obp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55128Obp {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final View A0D;
    public final AbstractC125325le A0E;
    public final AbstractC125325le A0F;
    public final AbstractC125325le A0G;
    public final AbstractC125325le A0H;
    public final AbstractC125325le A0I;
    public final SlideContentLayout A0J;
    public final int A0K;
    public final View A0L;
    public final RecyclerView A0M;

    public static final int A00(C55128Obp c55128Obp) {
        int i;
        if (c55128Obp.A03) {
            i = AbstractC167017dG.A0A(c55128Obp.A04) * 2;
        } else {
            i = 0;
        }
        int A09 = AbstractC13880nE.A09(c55128Obp.A04);
        int A0A = (int) ((AbstractC13880nE.A0A(r0) - i) / 0.5625f);
        if (A0A > A09) {
            A0A = A09;
        }
        return A09 - A0A;
    }

    public static final void A01(C55128Obp c55128Obp) {
        int dimensionPixelSize;
        boolean A1M = AbstractC167007dF.A1M(c55128Obp.A03 ? 1 : 0);
        SlideContentLayout slideContentLayout = c55128Obp.A0J;
        if (A1M) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = slideContentLayout.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        }
        slideContentLayout.setPadding(0, 0, 0, dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams = slideContentLayout.getLayoutParams();
        int i = 0;
        if (slideContentLayout.getChildCount() != 0) {
            i = SlideContentLayout.A00(slideContentLayout.getChildAt(0), slideContentLayout);
        }
        layoutParams.height = i;
        boolean A1Q = AbstractC167007dF.A1Q(A00(c55128Obp), c55128Obp.A0K);
        C110964z8 c110964z8 = new C110964z8();
        View view = c55128Obp.A0A;
        ViewParent parent = view.getParent();
        C14360o3.A0C(parent, AbstractC111324zv.A00(14));
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        c110964z8.A0I(constraintLayout);
        c110964z8.A09(R.id.iglive_reactions_composer, 3);
        c110964z8.A09(R.id.iglive_reactions_composer, 4);
        if (A1Q) {
            c110964z8.A0C(R.id.iglive_reactions_composer, 4, R.id.iglive_surface_view_frame_container, 4);
        } else {
            c110964z8.A0C(R.id.iglive_reactions_composer, 3, R.id.iglive_surface_view_frame_container, 4);
        }
        if (view.getTranslationY() == 0.0f) {
            AbstractC66022TyK.A02(constraintLayout, null);
        }
        c110964z8.A0G(constraintLayout);
        A02(c55128Obp, C05F.A00, false);
    }

    public static final void A02(C55128Obp c55128Obp, Integer num, boolean z) {
        float f;
        int A00;
        if (c55128Obp.A02) {
            f = AbstractC166987dD.A04(c55128Obp.A04.getResources(), R.dimen.asset_picker_redesign_sticker_height);
        } else {
            f = 0.0f;
        }
        float max = Math.max(c55128Obp.A00, Math.max(c55128Obp.A01, f));
        int i = c55128Obp.A0K;
        if (A00(c55128Obp) < i) {
            A00 = A00(c55128Obp);
        } else {
            A00 = A00(c55128Obp) - i;
        }
        float A06 = (max - (AbstractC25230BEn.A06(A00, A00) / 2)) * (-1.0f);
        if (A06 > 0.0f) {
            A06 = 0.0f;
        }
        View view = c55128Obp.A05;
        if ((view != null && view.getVisibility() == 0) || (((view = c55128Obp.A0D) != null && view.getVisibility() == 0) || ((view = c55128Obp.A08) != null && view.getVisibility() == 0))) {
            view.setTranslationY(A06);
        }
        c55128Obp.A06.setTranslationY(A06 - AbstractC166987dD.A04(c55128Obp.A04.getResources(), R.dimen.ad_not_delivering_thumbnail_height));
        if (z) {
            AbstractC50522MSa.A1V(c55128Obp.A0E, A06);
            AbstractC50522MSa.A1V(c55128Obp.A0G, A06);
            AbstractC50522MSa.A1V(c55128Obp.A0H, A06);
            if (num != C05F.A01) {
                AbstractC50522MSa.A1V(c55128Obp.A0F, A06);
            }
            AbstractC125325le abstractC125325le = c55128Obp.A0I;
            if (abstractC125325le != null) {
                AbstractC50522MSa.A1V(abstractC125325le, A06);
                return;
            }
            return;
        }
        c55128Obp.A09.setTranslationY(A06);
        c55128Obp.A0B.setTranslationY(A06);
        if (num != C05F.A01) {
            c55128Obp.A0A.setTranslationY(A06);
        }
        View view2 = c55128Obp.A0C;
        if (view2 == null) {
            return;
        }
        view2.setTranslationY(A06);
    }

    public C55128Obp(Context context, View view, boolean z) {
        AbstractC125325le abstractC125325le;
        this.A0L = view;
        this.A04 = context;
        this.A03 = z;
        View findViewById = view.findViewById(R.id.iglive_reactions_shadow_bottom);
        this.A0C = findViewById;
        View A0S = AbstractC166997dE.A0S(view, R.id.iglive_reactions_comments);
        this.A09 = A0S;
        View A0S2 = AbstractC166997dE.A0S(view, R.id.iglive_reactions_extensions);
        this.A0B = A0S2;
        View A0S3 = AbstractC166997dE.A0S(view, R.id.iglive_reactions_composer);
        this.A0A = A0S3;
        this.A06 = AbstractC166997dE.A0S(view, R.id.dismiss_view_background);
        this.A05 = view.findViewById(R.id.avatar_likes_container);
        this.A0D = view.findViewById(R.id.self_likes_container);
        this.A08 = view.findViewById(R.id.mixed_reactions_host_view_container);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.iglive_mention_suggestions_recycler_view);
        this.A0M = recyclerView;
        View A0c = AbstractC166987dD.A0c(view, R.id.iglive_reactions_extensions);
        this.A07 = A0c;
        this.A0J = (SlideContentLayout) AbstractC166997dE.A0R(view, R.id.interactivity_question_sticker_container);
        this.A0K = AbstractC43594JPz.A03(context) + (AbstractC167017dG.A06(context) * 2);
        if (findViewById != null) {
            abstractC125325le = AbstractC125325le.A00(findViewById);
        } else {
            abstractC125325le = null;
        }
        this.A0I = abstractC125325le;
        AbstractC125325le A00 = AbstractC125325le.A00(A0S);
        C14360o3.A07(A00);
        this.A0E = A00;
        AbstractC125325le A002 = AbstractC125325le.A00(A0S2);
        C14360o3.A07(A002);
        this.A0G = A002;
        AbstractC125325le A003 = AbstractC125325le.A00(recyclerView);
        C14360o3.A07(A003);
        this.A0H = A003;
        AbstractC125325le A004 = AbstractC125325le.A00(A0S3);
        C14360o3.A07(A004);
        this.A0F = A004;
        A01(this);
        ViewOnLayoutChangeListenerC55476OkV.A00(A0c, 10, this);
    }
}
