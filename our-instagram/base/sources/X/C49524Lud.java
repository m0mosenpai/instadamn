package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.nido.impl.NidoFeatureProviderImpl;
import com.instagram.nido.impl.explore.NidoExploreViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Lud, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49524Lud implements MR7 {
    public View A00;
    public TextView A01;
    public RecyclerView A02;
    public AbstractC42425IqS A03;
    public IgdsButton A04;
    public C38196Gr1 A05;
    public Gt7 A06;
    public SpinnerImageView A07;
    public InterfaceC19390xP A08;
    public int A09;
    public InterfaceC65252xN A0A;
    public final ViewTreeObserver.OnGlobalLayoutListener A0B = new JXP(this, 6);

    @Override // X.MR7
    public final void D82(UserSession userSession, AbstractC42425IqS abstractC42425IqS, Gt7 gt7) {
        NidoExploreViewModel nidoExploreViewModel;
        C14360o3.A0B(userSession, 2);
        this.A03 = abstractC42425IqS;
        this.A06 = gt7;
        this.A05 = new C38196Gr1(abstractC42425IqS);
        C0UO c0uo = null;
        if ((gt7 instanceof NidoExploreViewModel) && (nidoExploreViewModel = (NidoExploreViewModel) gt7) != null) {
            c0uo = nidoExploreViewModel.A09;
        }
        this.A08 = c0uo;
        A00(this);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        int A01 = AbstractC31172DnG.A01(A0x, "explore_topic_picker_impressions") + 1;
        InterfaceC19610xo ARD = A0x.ARD();
        ARD.E7G("explore_topic_picker_last_shown_time_ms", System.currentTimeMillis());
        ARD.apply();
        AbstractC167007dF.A18(A0x, "explore_topic_picker_impressions", A01);
        NidoFeatureProviderImpl.A00 = true;
    }

    @Override // X.MR7
    public final void D8U(ViewGroup viewGroup, Fragment fragment, UserSession userSession) {
        RecyclerView recyclerView;
        IgdsButton igdsButton;
        SpinnerImageView spinnerImageView;
        TextView textView;
        View findViewById;
        View findViewById2;
        ViewTreeObserver viewTreeObserver;
        int A06 = AbstractC167007dF.A06(0, userSession, viewGroup);
        boolean A0A = C14640oc.A0A();
        View inflate = AbstractC31175DnJ.A06(fragment).inflate(R.layout.explore_qp_topic_picker, viewGroup);
        this.A00 = inflate;
        if (inflate != null && (viewTreeObserver = inflate.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0B);
        }
        View view = this.A00;
        if (view != null) {
            recyclerView = AbstractC43592JPx.A0B(view, R.id.topic_picker_rv);
        } else {
            recyclerView = null;
        }
        this.A02 = recyclerView;
        if (recyclerView != null) {
            C38196Gr1 c38196Gr1 = this.A05;
            if (c38196Gr1 != null) {
                recyclerView.setAdapter(c38196Gr1);
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getRootView().getContext());
                int i = 2;
                if (A0A) {
                    i = 0;
                }
                if (flexboxLayoutManager.A04 != i) {
                    flexboxLayoutManager.A04 = i;
                    flexboxLayoutManager.A0i();
                }
                recyclerView.setLayoutManager(flexboxLayoutManager);
                recyclerView.A10(new JoB(AbstractC25228BEl.A0M(recyclerView).getDimension(R.dimen.abc_action_bar_elevation_material)));
                C44220JgP.A00(recyclerView, this, 12);
            }
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        View view2 = this.A00;
        if (view2 != null) {
            igdsButton = (IgdsButton) view2.findViewById(R.id.more_topics_btn);
        } else {
            igdsButton = null;
        }
        this.A04 = igdsButton;
        if (igdsButton != null) {
            igdsButton.setText(2131968552);
        }
        View view3 = this.A00;
        if (view3 != null) {
            spinnerImageView = (SpinnerImageView) view3.findViewById(R.id.topic_picker_spinner);
        } else {
            spinnerImageView = null;
        }
        this.A07 = spinnerImageView;
        View view4 = this.A00;
        if (view4 != null) {
            textView = AbstractC166987dD.A0e(view4, R.id.topic_picker_body_text);
        } else {
            textView = null;
        }
        this.A01 = textView;
        View view5 = this.A00;
        if (view5 != null && (findViewById2 = view5.findViewById(R.id.topic_picker_close_btn)) != null) {
            C0fQ.A00(new ViewOnClickListenerC42032Ik1(this, 42), findViewById2);
        }
        if (A0A) {
            View view6 = this.A00;
            if (view6 != null && (findViewById = view6.findViewById(R.id.topic_picker_header_text)) != null) {
                findViewById.setTextAlignment(A06);
            }
            TextView textView2 = this.A01;
            if (textView2 != null) {
                textView2.setTextAlignment(A06);
            }
        }
        C38196Gr1 c38196Gr12 = this.A05;
        if (c38196Gr12 != null) {
            c38196Gr12.registerAdapterDataObserver(new C44225JgV(1, fragment, this));
            C44220JgP.A00(AbstractC43592JPx.A0B(fragment.requireView(), R.id.recycler_view), this, 13);
            AbstractC166987dD.A1Z(new C50119MBt(this, userSession, null, 42), AbstractC25235BEs.A0S(fragment));
            return;
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // X.MR7
    public final void FBA(InterfaceC65252xN interfaceC65252xN, float f) {
        C14360o3.A0B(interfaceC65252xN, 1);
        this.A0A = interfaceC65252xN;
        View view = this.A00;
        if (view != null) {
            AbstractC31177DnL.A0x(view, view.getPaddingLeft(), (int) f);
            A01(this);
        }
    }

    public static final void A00(C49524Lud c49524Lud) {
        Gt7 gt7 = c49524Lud.A06;
        if (gt7 == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        if (gt7 instanceof NidoExploreViewModel) {
            AbstractC166987dD.A1Z(new PZP(gt7, null, 45), AbstractC141776au.A00(gt7));
        }
    }

    public static final void A01(C49524Lud c49524Lud) {
        InterfaceC65252xN interfaceC65252xN;
        View view = c49524Lud.A00;
        if (view != null && (interfaceC65252xN = c49524Lud.A0A) != null) {
            int height = view.getHeight();
            if (height > 0) {
                interfaceC65252xN.EVk(height);
                c49524Lud.A09 = height;
            } else {
                int i = c49524Lud.A09;
                if (i <= 0) {
                    i = AbstractC31171DnF.A02(AbstractC25228BEl.A0M(view), R.dimen.alt_text_carousel_card_width);
                }
                interfaceC65252xN.EVk(i);
            }
        }
    }

    @Override // X.MR7
    public final Integer CAt() {
        return C05F.A01;
    }

    @Override // X.MR7
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        View view = this.A00;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0B);
        }
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        this.A0A = null;
        this.A07 = null;
    }
}
