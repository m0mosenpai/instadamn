package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.CqD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28962CqD implements InterfaceC51522Ya {
    public final /* synthetic */ C77993eR A00;

    public C28962CqD(C77993eR c77993eR) {
        this.A00 = c77993eR;
    }

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        EmptyStateView emptyStateView = new EmptyStateView(context);
        emptyStateView.setId(R.id.comment_empty_state_view);
        emptyStateView.A0M(AbstractC167007dF.A09(AbstractC77363dM.A00(this.A00), R.attr.igds_color_elevated_background));
        return emptyStateView;
    }
}
