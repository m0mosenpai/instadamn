package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Iv8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42713Iv8 implements InterfaceC81453kF {
    public final View A00;
    public final ConstraintLayout A01;
    public final RecyclerView A02;
    public final ViewPager2 A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final UserSession A09;

    public C42713Iv8(View view, UserSession userSession) {
        C14360o3.A0B(view, 2);
        this.A09 = userSession;
        this.A01 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_container);
        this.A08 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_pivot_see_all_button);
        this.A02 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_carousel);
        this.A03 = (ViewPager2) AbstractC166997dE.A0R(view, R.id.intent_aware_ad_pivot_view_pager);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_pivot_header_title);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_pivot_sub_header_label);
        this.A04 = AbstractC31176DnK.A0T(view, R.id.intent_aware_ad_pivot_dismiss_button);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.intent_aware_ad_pivot_title_see_all_button);
        this.A00 = AbstractC166997dE.A0S(view, R.id.carousel_page_indicator);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[RETURN] */
    @Override // X.InterfaceC81443kE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BEG(X.C38321qM r7) {
        /*
            r6 = this;
            r4 = 0
            com.instagram.common.session.UserSession r3 = r6.A09
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36312874753131954(0x81025e006f05b2, double:3.0277464418662724E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L45
            androidx.viewpager2.widget.ViewPager2 r0 = r6.A03
            int r2 = r0.A00
            android.view.View r1 = X.AnonymousClass040.A00(r0, r4)
            boolean r0 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            r5 = 0
            if (r0 == 0) goto L43
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L43
            X.3Fe r0 = r1.A0D
            if (r0 == 0) goto L43
            android.view.View r0 = r0.A0d(r2)
            if (r0 == 0) goto L43
            java.lang.Object r1 = r0.getTag()
        L2f:
            boolean r0 = r1 instanceof X.C38521Gwh
            if (r0 == 0) goto L40
            X.Gwh r1 = (X.C38521Gwh) r1
            if (r1 == 0) goto L41
            X.1qM r0 = r1.A00
        L39:
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 == 0) goto L9a
            return r1
        L40:
            r1 = r5
        L41:
            r0 = r5
            goto L39
        L43:
            r1 = r5
            goto L2f
        L45:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A02
            X.2UU r4 = r0.A0A
            X.3Fe r3 = r0.A0D
            boolean r0 = r4 instanceof X.C38373GuA
            r5 = 0
            if (r0 == 0) goto L9a
            if (r3 == 0) goto L9a
            boolean r0 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L9a
            X.GuA r4 = (X.C38373GuA) r4
            r2 = r7
            boolean r0 = r7.A5N()
            java.util.List r1 = r4.A04
            if (r0 == 0) goto L67
            com.instagram.common.session.UserSession r0 = r4.A08
            X.1qM r2 = r7.A1g(r0)
        L67:
            int r1 = r1.indexOf(r2)
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            int r0 = r3.A1a()
            int r1 = r1 - r0
            if (r1 < 0) goto L9a
            int r0 = r3.A0T()
            if (r1 >= r0) goto L9a
            android.view.View r0 = r3.A0e(r1)
            if (r0 == 0) goto L98
            java.lang.Object r1 = r0.getTag()
        L84:
            boolean r0 = r1 instanceof X.C38521Gwh
            if (r0 == 0) goto L95
            X.Gwh r1 = (X.C38521Gwh) r1
            if (r1 == 0) goto L96
            X.1qM r0 = r1.A00
        L8e:
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 == 0) goto L9a
            return r1
        L95:
            r1 = r5
        L96:
            r0 = r5
            goto L8e
        L98:
            r1 = r5
            goto L84
        L9a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42713Iv8.BEG(X.1qM):java.lang.Object");
    }

    @Override // X.InterfaceC81443kE
    public final Map BRm() {
        Object obj;
        RecyclerView recyclerView;
        AbstractC70663Fe abstractC70663Fe;
        View A0d;
        if (C18U.A06(C06090Tz.A05, this.A09, 36312874753131954L)) {
            ViewPager2 viewPager2 = this.A03;
            C2UU c2uu = viewPager2.A04.A0A;
            if (c2uu instanceof C38373GuA) {
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                C38373GuA c38373GuA = (C38373GuA) c2uu;
                int itemCount = c38373GuA.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    View A00 = AnonymousClass040.A00(viewPager2, 0);
                    Object obj2 = null;
                    if ((A00 instanceof RecyclerView) && (recyclerView = (RecyclerView) A00) != null && (abstractC70663Fe = recyclerView.A0D) != null && (A0d = abstractC70663Fe.A0d(i)) != null) {
                        obj = A0d.getTag();
                    } else {
                        obj = null;
                    }
                    if (obj instanceof C38521Gwh) {
                        obj2 = obj;
                    }
                    Object A0O = AbstractC001800i.A0O(c38373GuA.A04, i);
                    if (obj2 != null && A0O != null) {
                        A1I.put(A0O, obj2);
                    }
                }
                return A1I;
            }
        } else {
            RecyclerView recyclerView2 = this.A02;
            C2UU c2uu2 = recyclerView2.A0A;
            AbstractC70663Fe abstractC70663Fe2 = recyclerView2.A0D;
            if ((c2uu2 instanceof C38373GuA) && abstractC70663Fe2 != null && (abstractC70663Fe2 instanceof LinearLayoutManager)) {
                LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                C38373GuA c38373GuA2 = (C38373GuA) c2uu2;
                int itemCount2 = c38373GuA2.getItemCount();
                for (int i2 = 0; i2 < itemCount2; i2++) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe2;
                    Object A0X = AbstractC37302Gc3.A0X(linearLayoutManager.A0d(linearLayoutManager.A1a() + i2));
                    Object A0O2 = AbstractC001800i.A0O(c38373GuA2.A04, i2);
                    if (A0X != null && A0O2 != null) {
                        A1I2.put(A0O2, A0X);
                    }
                }
                return A1I2;
            }
        }
        return AbstractC166987dD.A1I();
    }
}
