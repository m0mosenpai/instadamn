package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;

/* renamed from: X.7T5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7T5 extends AbstractC162927Rd {
    @Override // X.AbstractC162927Rd
    /* renamed from: A01 */
    public final C7SP createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        return super.createViewHolder(layoutInflater, viewGroup);
    }

    @Override // X.AbstractC162927Rd, X.AbstractC66422zJ
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void bind(C7SP c7sp, C43705JUq c43705JUq) {
        C14360o3.A0B(c43705JUq, 0);
        C14360o3.A0B(c7sp, 1);
        super.bind(c43705JUq, c7sp);
        AbstractC163037Ro abstractC163037Ro = c7sp.A07;
        if (abstractC163037Ro instanceof C163027Rn) {
            C14360o3.A0C(abstractC163037Ro, "null cannot be cast to non-null type com.instagram.direct.messagethread.commondecorations.RootSwitcher.Frame");
            LinearLayout linearLayout = ((C163027Rn) abstractC163037Ro).A00;
            View requireViewById = linearLayout.requireViewById(R.id.message_content_horizontal_placeholder_container);
            C14360o3.A07(requireViewById);
            C7N9.A01(requireViewById);
            if (((AbstractC129515tG) c43705JUq.A00).A00.CVC()) {
                View requireViewById2 = linearLayout.requireViewById(R.id.message_pills_container);
                C14360o3.A07(requireViewById2);
                ViewGroup.LayoutParams layoutParams = requireViewById2.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams).gravity = 8388613;
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C43705JUq.class;
    }
}
