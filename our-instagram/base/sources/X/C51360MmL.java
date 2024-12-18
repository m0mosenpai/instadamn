package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MmL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51360MmL extends C3OO {
    public final View A00;
    public final RecyclerView A01;
    public final IgTextView A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final O4D A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51360MmL(View view, O4D o4d) {
        super(view);
        C14360o3.A0B(o4d, 2);
        this.A00 = view;
        this.A06 = o4d;
        this.A02 = AbstractC25231BEo.A0d(view, R.id.story_template_discovery_surface_section_header);
        this.A05 = C1XM.A00(new C57527Pg1(this, 18));
        this.A03 = C1XM.A00(new C57527Pg1(this, 16));
        this.A04 = C1XM.A00(new C57527Pg1(this, 17));
        View requireViewById = view.requireViewById(R.id.story_template_discovery_surface_section_content);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setLayoutManager((AbstractC70663Fe) this.A05.getValue());
        recyclerView.A10(new C51184MjS(AbstractC166997dE.A08(recyclerView.getResources()), 6));
        recyclerView.A14((C1I4) this.A04.getValue());
        C14360o3.A07(requireViewById);
        this.A01 = recyclerView;
    }

    public final void A00(int i) {
        int A1c;
        if (this.A00.getVisibility() == 0 && (A1c = ((LinearLayoutManager) this.A05.getValue()).A1c()) != -1) {
            C3OO A0V = this.A01.A0V(A1c);
            if (A0V != null && (A0V instanceof C51361MmM)) {
                this.A06.A00.updateActiveViewHolder(i, A1c);
            } else {
                this.A06.A00.updateActiveViewHolder(i, -1);
            }
        }
    }
}
