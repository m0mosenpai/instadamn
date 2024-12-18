package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.GvX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38450GvX extends C3OO {
    public final IgdsButton A00;
    public final IgdsListCell A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38450GvX(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.upcoming_event_cta_row_text_cell);
        this.A00 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.button);
    }
}
