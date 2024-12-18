package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Lgx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48729Lgx implements InterfaceC50473MQb {
    public final /* synthetic */ C47770L7s A00;

    public C48729Lgx(C47770L7s c47770L7s) {
        this.A00 = c47770L7s;
    }

    @Override // X.InterfaceC50473MQb
    public final void DqG(List list, String str) {
        C47770L7s c47770L7s = this.A00;
        if (c47770L7s.A00 == EnumC46159Kbx.A05) {
            LIE.A01(c47770L7s.A02.A00, str, list, 2131968594);
        }
    }

    @Override // X.InterfaceC50473MQb
    public final void onFail(AbstractC115105If abstractC115105If) {
        LIE lie = this.A00.A02.A00;
        View view = lie.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        RecyclerView recyclerView = lie.A01;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        View view2 = lie.A00;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        AbstractC167007dF.A0w(lie.A02);
        IgTextView igTextView = lie.A02;
        if (igTextView != null) {
            AbstractC31173DnH.A12(lie.A05, igTextView, 2131968594);
        }
    }

    @Override // X.InterfaceC50473MQb
    public final void onStart() {
        LIE lie = this.A00.A02.A00;
        RecyclerView recyclerView = lie.A01;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        IgTextView igTextView = lie.A02;
        if (igTextView != null) {
            igTextView.setVisibility(8);
        }
        AbstractC167007dF.A0w(lie.A00);
    }
}
