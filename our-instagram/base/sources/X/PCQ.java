package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;

/* loaded from: classes9.dex */
public final class PCQ implements InterfaceC57985PnV {
    public OHM A00;
    public C51906Mwo A01;
    public Integer A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A0A = C57520Pfu.A00(this, 2);
    public final InterfaceC09390do A0B = C57520Pfu.A00(this, 3);
    public final InterfaceC09390do A09 = C57520Pfu.A00(this, 1);
    public final InterfaceC09390do A07 = C57513Pfn.A00(this, 49);
    public final InterfaceC09390do A06 = C57513Pfn.A00(this, 48);

    public PCQ(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = interfaceC11380iw;
        this.A04 = userSession;
        this.A05 = AbstractC56372iV.A01(view.findViewById(R.id.carousel_stub), false, false);
        this.A08 = C57520Pfu.A00(view, 0);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0pQ, java.lang.Object] */
    @Override // X.InterfaceC57985PnV
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void ADV(C51906Mwo c51906Mwo) {
        C14360o3.A0B(c51906Mwo, 0);
        this.A01 = c51906Mwo;
        List list = c51906Mwo.A0J;
        int i = 0;
        if (list != null) {
            ((MediaFrameLayout) this.A0B.getValue()).A00 = c51906Mwo.A00;
            InterfaceC09390do interfaceC09390do = this.A0A;
            AbstractC43593JPy.A1W(interfaceC09390do, 0);
            AbstractC43593JPy.A1W(this.A09, 0);
            if (!c51906Mwo.A0R) {
                i = 8;
            }
            ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(AbstractC166987dD.A0d(interfaceC09390do));
            ?? obj = new Object();
            obj.A00 = A0G.topMargin;
            obj.A00 = AbstractC167027dH.A01(this.A08);
            AbstractC166987dD.A0d(interfaceC09390do).post(new RunnableC57051PSq(this, obj, i));
            ((AbstractC155316yK) this.A06.getValue()).submitList(list);
            A01(this, c51906Mwo, true);
            return;
        }
        if (!this.A05.CWW()) {
            return;
        }
        A02();
        ((AbstractC155316yK) this.A06.getValue()).submitList(C16930sl.A00);
        AbstractC43593JPy.A1W(this.A0A, 8);
    }

    public static final C51265Mko A00(PCQ pcq, int i) {
        C3OO c3oo;
        RecyclerView recyclerView = ((C51117MiM) pcq.A06.getValue()).A00;
        if (recyclerView != null) {
            c3oo = recyclerView.A0V(i);
        } else {
            c3oo = null;
        }
        return (C51265Mko) c3oo;
    }

    public static final void A01(PCQ pcq, C51906Mwo c51906Mwo, boolean z) {
        List list = c51906Mwo.A0J;
        if (list != null) {
            int i = c51906Mwo.A03;
            InterfaceC09390do interfaceC09390do = pcq.A09;
            if (i != ((ViewPager2) interfaceC09390do.getValue()).A00) {
                View childAt = MSW.A0B(interfaceC09390do).getChildAt(0);
                C14360o3.A0C(childAt, AbstractC111324zv.A00(9));
                ((RecyclerView) childAt).A0k();
                ((ViewPager2) interfaceC09390do.getValue()).A03(i, z);
            }
            ((C41L) pcq.A07.getValue()).A01(i, list.size());
        }
    }

    public final void A02() {
        int itemCount = ((C2UU) this.A06.getValue()).getItemCount();
        if (itemCount >= 0) {
            int i = 0;
            while (true) {
                C51265Mko A00 = A00(this, i);
                if (A00 != null) {
                    A00.A00.A00();
                }
                if (i != itemCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
