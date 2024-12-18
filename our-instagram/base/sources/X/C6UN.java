package X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.6UN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UN {
    public View A00;
    public LinearLayout A01;
    public IgTextView A02;
    public IgdsButton A03;
    public final InterfaceC56392iX A04;

    public C6UN(InterfaceC56392iX interfaceC56392iX) {
        this.A04 = interfaceC56392iX;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6UO
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6UN c6un = C6UN.this;
                IgTextView igTextView = (IgTextView) view.requireViewById(R.id.question_title);
                C14360o3.A0B(igTextView, 0);
                c6un.A02 = igTextView;
                IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.action_button_v2);
                C14360o3.A0B(igdsButton, 0);
                c6un.A03 = igdsButton;
                LinearLayout linearLayout = (LinearLayout) view.requireViewById(R.id.question_list);
                C14360o3.A0B(linearLayout, 0);
                c6un.A01 = linearLayout;
                View requireViewById = view.requireViewById(R.id.answer_options_container);
                C14360o3.A0B(requireViewById, 0);
                c6un.A00 = requireViewById;
            }
        });
    }
}
