package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.JqT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44684JqT extends C3OO {
    public final RecyclerView A00;
    public final IgTextView A01;
    public final SpinnerImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44684JqT(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.avatar_mentionable_friends_tray);
        this.A02 = (SpinnerImageView) AbstractC166997dE.A0R(view, R.id.avatar_mentionable_friends_loading_spinner);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.error_label);
    }
}
