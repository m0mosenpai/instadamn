package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import com.instagram.ui.widget.nestablescrollingview.NestableHorizontalRecyclerPager;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import com.instagram.ui.widget.triangleshape.TriangleShape;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;

/* renamed from: X.DsN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31478DsN extends C3OO {
    public E0K A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final NestableHorizontalRecyclerPager A05;
    public final NestableRecyclerView A06;
    public InterfaceC41501vz onContactImportCardRemovalListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31478DsN(Context context, View view, View view2, boolean z, boolean z2, boolean z3) {
        super(view);
        int id;
        C14360o3.A0B(view, 2);
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.similar_accounts_carousel_header);
        TriangleShape triangleShape = (TriangleShape) AbstractC166997dE.A0R(view, R.id.similar_accounts_notch);
        if (view2 != null) {
            triangleShape.A00 = view2;
        } else {
            triangleShape.setVisibility(8);
        }
        TextView A0T = AbstractC166997dE.A0T(view, R.id.similar_accounts_carousel_title);
        this.A04 = A0T;
        ViewStub A0M = AbstractC167007dF.A0M(view, R.id.similar_accounts_carousel_cta);
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.similar_accounts_carousel_title_separator);
        this.A03 = A0T2;
        View A0E = AbstractC31173DnH.A0E(A0M, R.layout.netego_carousel_text_cta);
        C14360o3.A0C(A0E, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) A0E;
        this.A02 = textView;
        if (z) {
            if (z3) {
                id = A0T2.getId();
                A0T2.setVisibility(0);
            } else {
                id = A0T.getId();
            }
            C110964z8 c110964z8 = new C110964z8();
            c110964z8.A0I(constraintLayout);
            AbstractC13880nE.A0g(A0T, -2);
            c110964z8.A0C(textView.getId(), 6, id, 7);
            c110964z8.A08(textView.getId(), 0.0f);
            C110964z8.A02(c110964z8, id).A03.A0Y = 2;
            c110964z8.A0G(constraintLayout);
            this.A01 = AbstractC31173DnH.A0E(AbstractC167007dF.A0M(view, R.id.similar_accounts_button_stub), R.layout.netego_carousel_dismiss_button);
        }
        NestableHorizontalRecyclerPager nestableHorizontalRecyclerPager = (NestableHorizontalRecyclerPager) view.requireViewById(R.id.similar_accounts_carousel_view);
        this.A05 = nestableHorizontalRecyclerPager;
        NestableRecyclerView nestableRecyclerView = (NestableRecyclerView) view.requireViewById(R.id.similar_accounts_carousel_recycler_view);
        this.A06 = nestableRecyclerView;
        int A04 = AbstractC167017dG.A04(context);
        C3YB c3yb = new C3YB(A04, A04);
        if (z2) {
            nestableRecyclerView.setVisibility(0);
            nestableHorizontalRecyclerPager.setVisibility(8);
            nestableRecyclerView.setPassThroughToParentOverride(true);
            nestableRecyclerView.A10(c3yb);
            AbstractC31174DnI.A17(context, nestableRecyclerView, false);
            nestableRecyclerView.A00 = 0.7d;
            return;
        }
        nestableRecyclerView.setVisibility(8);
        nestableHorizontalRecyclerPager.setVisibility(0);
        nestableHorizontalRecyclerPager.A10(c3yb);
        ((HorizontalRecyclerPager) nestableHorizontalRecyclerPager).A01 = AbstractC167017dG.A0E(context);
        LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 = new LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1(context, null);
        linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1.A12(true);
        nestableHorizontalRecyclerPager.setLayoutManager(linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1);
    }
}
