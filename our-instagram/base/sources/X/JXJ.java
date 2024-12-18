package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JXJ implements MR7 {
    public View A00;
    public RecyclerView A01;
    public AbstractC42425IqS A02;
    public C38196Gr1 A03;
    public Gt7 A04;
    public int A05;
    public InterfaceC65252xN A06;
    public final ViewTreeObserver.OnGlobalLayoutListener A07 = new JXP(this, 5);

    @Override // X.MR7
    public final void D8U(ViewGroup viewGroup, Fragment fragment, UserSession userSession) {
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        C14360o3.A0B(viewGroup, 2);
        View inflate = AbstractC31175DnJ.A06(fragment).inflate(R.layout.explore_pill_bar_view_holder, viewGroup);
        this.A00 = inflate;
        if (inflate != null && (viewTreeObserver = inflate.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A07);
        }
        View view = this.A00;
        if (view != null) {
            recyclerView = AbstractC43592JPx.A0B(view, R.id.pill_bar_rv);
        } else {
            recyclerView = null;
        }
        this.A01 = recyclerView;
        if (recyclerView != null) {
            C38196Gr1 c38196Gr1 = this.A03;
            if (c38196Gr1 != null) {
                recyclerView.setAdapter(c38196Gr1);
                Context context = recyclerView.getContext();
                AbstractC31174DnI.A17(context, recyclerView, false);
                recyclerView.A10(new C44221JgR(context.getResources().getDimension(R.dimen.account_discovery_bottom_gap)));
                C44220JgP.A00(recyclerView, this, 10);
            }
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        C38196Gr1 c38196Gr12 = this.A03;
        if (c38196Gr12 != null) {
            c38196Gr12.registerAdapterDataObserver(new C44225JgV(0, fragment, this));
            C44220JgP.A00(AbstractC43592JPx.A0B(fragment.requireView(), R.id.recycler_view), this, 11);
            AbstractC166987dD.A1Z(new PZG(this, (InterfaceC23621Ds) null, 6), AbstractC25235BEs.A0S(fragment));
            return;
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // X.MR7
    public final void FBA(InterfaceC65252xN interfaceC65252xN, float f) {
        C14360o3.A0B(interfaceC65252xN, 1);
        this.A06 = interfaceC65252xN;
        View view = this.A00;
        if (view != null) {
            AbstractC31177DnL.A0x(view, view.getPaddingLeft(), (int) f);
            A00(this);
        }
    }

    @Override // X.MR7
    public final void onDestroyView() {
        this.A01 = null;
        this.A00 = null;
        this.A06 = null;
    }

    public static final void A00(JXJ jxj) {
        InterfaceC65252xN interfaceC65252xN;
        View view = jxj.A00;
        if (view != null && (interfaceC65252xN = jxj.A06) != null) {
            int height = view.getHeight();
            if (height > 0) {
                interfaceC65252xN.EVk(height);
                jxj.A05 = height;
            } else {
                int i = jxj.A05;
                if (i <= 0) {
                    i = (int) view.getContext().getResources().getDimension(R.dimen.alt_text_carousel_card_width);
                }
                interfaceC65252xN.EVk(i);
            }
        }
    }

    @Override // X.MR7
    public final Integer CAt() {
        return C05F.A00;
    }

    @Override // X.MR7
    public final void D82(UserSession userSession, AbstractC42425IqS abstractC42425IqS, Gt7 gt7) {
        this.A02 = abstractC42425IqS;
        this.A04 = gt7;
        this.A03 = new C38196Gr1(abstractC42425IqS);
    }
}
