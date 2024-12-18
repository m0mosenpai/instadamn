package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;

/* renamed from: X.Duu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31628Duu extends AbstractC66412zI {
    public String A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC132405yL A03;

    public C31628Duu(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC132405yL interfaceC132405yL) {
        AbstractC25234BEr.A1P(userSession, interfaceC132405yL, interfaceC11380iw);
        this.A02 = userSession;
        this.A03 = interfaceC132405yL;
        this.A00 = "inbox_recent";
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C36200FyE c36200FyE = (C36200FyE) interfaceC66482zP;
        C31964E2s c31964E2s = (C31964E2s) c3oo;
        if (c36200FyE != null) {
            DirectShareTarget directShareTarget = c36200FyE.A02;
            int i = c36200FyE.A01;
            Integer valueOf = Integer.valueOf(i);
            String A08 = directShareTarget.A08();
            if ((A08 != null || (A08 = directShareTarget.A09()) != null) && valueOf != null && c31964E2s != null) {
                ArrayList A0B = directShareTarget.A0B();
                c31964E2s.getBindingAdapterPosition();
                C31446Drq c31446Drq = new C31446Drq(i, A08, null, A0B);
                if (directShareTarget.A0Q()) {
                    str = AbstractC111324zv.A00(1001);
                } else {
                    str = this.A00;
                }
                this.A00 = str;
                UserSession userSession = this.A02;
                InterfaceC11380iw interfaceC11380iw = this.A01;
                InterfaceC132405yL interfaceC132405yL = this.A03;
                C14360o3.A0B(userSession, 7);
                AbstractC167007dF.A1J(interfaceC11380iw, 8, interfaceC132405yL);
                C14360o3.A0B(str, 10);
                ViewGroup viewGroup = c31964E2s.A00;
                Context context = viewGroup.getContext();
                String A03 = AbstractC101904i3.A03(directShareTarget, AbstractC166997dE.A0Y(userSession));
                C14360o3.A07(A03);
                IgTextView igTextView = c31964E2s.A02;
                AbstractC31326Dpo.A00(igTextView, null, A03, directShareTarget.A0U());
                if (directShareTarget.A0F()) {
                    IgTextView igTextView2 = c31964E2s.A01;
                    igTextView2.setVisibility(0);
                    Resources resources = context.getResources();
                    AbstractC31265Don.A00();
                    igTextView2.setText(AbstractC25225BEi.A0H(AbstractC166997dE.A0q(resources, 2131960401)));
                } else {
                    boolean A04 = C4GR.A04(directShareTarget.A01);
                    IgTextView igTextView3 = c31964E2s.A01;
                    if (A04) {
                        igTextView3.setVisibility(0);
                        igTextView3.setText(AbstractC25225BEi.A0H(AbstractC166997dE.A0q(context.getResources(), 2131959687)));
                    } else {
                        igTextView3.setVisibility(8);
                    }
                }
                C14360o3.A0A(context);
                AbstractC34098F3a.A00(context, interfaceC11380iw, userSession, null, c31964E2s.A03, directShareTarget, false, false);
                C0fQ.A00(new ViewOnClickListenerC35623FoE(c31446Drq, interfaceC132405yL, directShareTarget, str, i, i), viewGroup);
                viewGroup.setAlpha(1.0f);
                viewGroup.setBackgroundResource(R.drawable.bg_simple_row);
                igTextView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC35716Fpq(2, directShareTarget, c31964E2s));
                interfaceC132405yL.Dqk(AbstractC31171DnF.A06(c31964E2s), c31446Drq, directShareTarget, str, 7, i, i, 0, false);
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_inbox_search_horizontal_row_layout);
        if (A0A != null) {
            return new C31964E2s(A0A);
        }
        return null;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36200FyE.class;
    }
}
