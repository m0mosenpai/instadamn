package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Jql, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44702Jql extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgdsButton A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44702Jql(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.header);
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.body);
        this.A02 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.action);
    }
}
