package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LKK {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public IgTextView A05;
    public TouchInterceptorLinearLayout A06;
    public boolean A07;
    public int A08;
    public int A09;
    public final int A0A;
    public final Context A0B;
    public final ViewGroup A0C;
    public final FrameLayout A0D;
    public final InterfaceC11380iw A0E;
    public final UserSession A0F;
    public final LES A0G;
    public final AvatarReactionsRepository A0H;
    public final MR4 A0I;
    public final L54 A0J;
    public final List A0K;
    public final boolean A0L;

    public final void A04() {
        this.A03 = 0;
        List list = this.A0K;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C47660L2t) it.next()).A02.setAlpha(1.0f);
            A0q.add(C0eB.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x011a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0267, code lost:
    
        if (r1 != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LKK(android.content.Context r19, android.view.ViewGroup r20, X.InterfaceC11380iw r21, com.instagram.common.session.UserSession r22, X.MR4 r23, X.L54 r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKK.<init>(android.content.Context, android.view.ViewGroup, X.0iw, com.instagram.common.session.UserSession, X.MR4, X.L54, boolean):void");
    }

    private final void A00(LayoutInflater layoutInflater, View view, LinearLayout linearLayout, float f) {
        if (view != null && this.A0L) {
            View A0A = AbstractC31172DnG.A0A(layoutInflater, linearLayout, R.layout.reactions_creation_drag_overlay);
            C14360o3.A0C(A0A, "null cannot be cast to non-null type android.view.View");
            A0A.setOnDragListener(new LQ2(this.A0B, view, this.A0F, f));
            linearLayout.addView(A0A);
            return;
        }
        linearLayout.setVisibility(8);
    }

    public static final void A01(LKK lkk) {
        Context context = lkk.A0B;
        int A01 = AbstractC13890nF.A01(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
        Resources resources = context.getResources();
        int i = R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size;
        if (A01 < dimensionPixelSize) {
            i = R.dimen.abc_dropdownitem_icon_width;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
        List list = lkk.A0K;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C47660L2t) list.get(i2)).A02.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17));
        }
    }

    public static final void A02(LKK lkk, String str, int i) {
        C47660L2t c47660L2t = (C47660L2t) lkk.A0K.get(i);
        C14360o3.A0B(str, 0);
        c47660L2t.A00 = str;
        c47660L2t.A02.setUrl(C148336m3.A04.A04(str), lkk.A0E);
        List list = lkk.A0J.A02;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C14360o3.A0K(next, str)) {
                    if (next != null) {
                        FrameLayout frameLayout = c47660L2t.A01;
                        frameLayout.setForeground(lkk.A0B.getDrawable(R.drawable.emoji_reaction_dot_indicator));
                        frameLayout.setForegroundGravity(81);
                        return;
                    }
                }
            }
        }
        c47660L2t.A01.setForeground(null);
    }

    public final List A03() {
        List list = this.A0K;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((C47660L2t) it.next()).A00);
        }
        return A0q;
    }

    public final void A05(float f) {
        int i = this.A08;
        if (i == 0) {
            i = this.A0D.getWidth();
            this.A08 = i;
            this.A09 = (int) (i * 0.85714287f);
        }
        float f2 = i - this.A09;
        FrameLayout frameLayout = this.A0D;
        frameLayout.getLayoutParams().width = this.A09 + ((int) (f2 * f));
        View view = this.A04;
        if (view != null) {
            int i2 = this.A01;
            if (i2 == 0) {
                i2 = view.getWidth();
                this.A01 = i2;
            }
            float f3 = i2 * f;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) f3;
            }
        }
        frameLayout.requestLayout();
    }

    public final void A06(int i) {
        this.A03 = i;
        List list = this.A0K;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstrainedImageView constrainedImageView = ((C47660L2t) list.get(i2)).A02;
            float f = 0.3f;
            if (i2 == i) {
                f = 1.0f;
            }
            constrainedImageView.setAlpha(f);
        }
    }
}
