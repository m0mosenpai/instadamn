package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Bdk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25943Bdk extends C3OO {
    public final View A00;
    public final RecyclerView A01;
    public final IgTextView A02;
    public final InterfaceC31005Dk4 A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25943Bdk(View view, InterfaceC31005Dk4 interfaceC31005Dk4) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = interfaceC31005Dk4;
        this.A02 = AbstractC25231BEo.A0d(view, R.id.creator_inspiration_hub_reels_section_header_title);
        this.A01 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.creator_inspiration_hub_reels_hscroll_recycler_view);
        this.A06 = C1XM.A00(new D88(this, 29));
        this.A05 = C1XM.A00(C57502Pfc.A00);
        this.A04 = C1XM.A00(new D88(this, 28));
    }
}
