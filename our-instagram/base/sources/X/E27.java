package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class E27 extends C3OO {
    public final RecyclerView A00;
    public final C66362zD A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E27(View view, InterfaceC11380iw interfaceC11380iw) {
        super(view);
        C14360o3.A0B(view, 1);
        C66362zD A0R = AbstractC31173DnH.A0R(C66362zD.A00(AbstractC31172DnG.A05(this)), new EXC(interfaceC11380iw));
        this.A01 = A0R;
        RecyclerView recyclerView = (RecyclerView) view;
        AbstractC31174DnI.A17(recyclerView.getContext(), recyclerView, false);
        recyclerView.A10(new C3YB(this.itemView.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), this.itemView.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material)));
        recyclerView.setAdapter(A0R);
        this.A00 = recyclerView;
    }
}
