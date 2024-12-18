package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class L9B {
    public C7IK A00;
    public C7CC A01;
    public Integer A02;
    public final View A03;
    public final RecyclerView A04;
    public final View A05;
    public final InterfaceC11380iw A06;
    public final C66362zD A07;
    public final C49320LrE A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    public L9B(View view, View view2, RecyclerView recyclerView, InterfaceC11380iw interfaceC11380iw, C7IK c7ik, C7CC c7cc, Integer num) {
        this.A03 = view;
        this.A05 = view2;
        this.A04 = recyclerView;
        this.A02 = num;
        this.A00 = c7ik;
        this.A01 = c7cc;
        this.A06 = interfaceC11380iw;
        C49320LrE c49320LrE = new C49320LrE(this);
        this.A08 = c49320LrE;
        ViewOnTouchListenerC48084LQj.A01(view, 16, this);
        Context context = recyclerView.getContext();
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new C45611KHa(c49320LrE));
        A00.A01(new KI0(interfaceC11380iw, c49320LrE));
        A00.A01(new Object());
        A00.A09 = true;
        C66362zD A002 = A00.A00();
        this.A07 = A002;
        recyclerView.setAdapter(A002);
        AbstractC31174DnI.A16(context, recyclerView, 1, false);
        recyclerView.setItemAnimator(null);
        C7IK c7ik2 = this.A00;
        if (c7ik2 != null) {
            this.A00 = c7ik2;
            this.A04.setBackgroundColor(c7ik2.A01);
        }
        Integer num2 = this.A02;
        if (num2 != null) {
            A00(num2.intValue());
        }
    }

    public final void A01(List list) {
        C14360o3.A0B(list, 0);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        ArrayList A1E4 = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC160207Gg abstractC160207Gg = (AbstractC160207Gg) it.next();
            Integer A03 = abstractC160207Gg.A03();
            if (A03 != null && A03.intValue() == 5) {
                A1E.add(new C45187JzT(abstractC160207Gg));
            } else if (abstractC160207Gg instanceof C1575075i) {
                A1E2.add(new C45189JzV((C1575075i) abstractC160207Gg));
            } else {
                C7FY A02 = abstractC160207Gg.A02();
                if (A02 == C7FY.A04) {
                    A1E3.add(new C45187JzT(abstractC160207Gg));
                } else if (A02 == C7FY.A03) {
                    A1E4.add(new C45187JzT(abstractC160207Gg));
                }
            }
        }
        A0E.A01(A1E);
        A0E.A01(A1E2);
        A0E.A01(A1E3);
        if (A1E4.size() > 2 && list.size() > A1E4.size()) {
            A0E.A00(new C45188JzU());
        }
        A0E.A01(A1E4);
        this.A07.A05(A0E);
        if (A0E.A00.size() > 0) {
            this.A03.setVisibility(0);
        } else {
            this.A03.setVisibility(8);
        }
    }

    public final void A00(int i) {
        this.A02 = Integer.valueOf(i);
        View view = this.A05;
        C14360o3.A0C(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int dimensionPixelSize = (int) (4.5d * AbstractC25228BEl.A0M(this.A04).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
        if (i > dimensionPixelSize) {
            i = dimensionPixelSize;
        }
        constraintLayout.setMaxHeight(i);
    }
}
