package X;

import android.view.View;
import com.facebook.R;
import java.util.LinkedList;

/* renamed from: X.Grj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38240Grj extends H8E {
    public final View A00;
    public final View A01;
    public final LinkedList A02;

    public C38240Grj(View view) {
        super(view);
        LinkedList linkedList = new LinkedList();
        this.A02 = linkedList;
        this.A00 = AbstractC166987dD.A0c(view, R.id.dismiss_button);
        this.A01 = AbstractC166987dD.A0c(view, R.id.shuffle_button);
        linkedList.add(new C38241Grk(AbstractC166987dD.A0c(view, R.id.top_start_card)));
        linkedList.add(new C38241Grk(AbstractC166987dD.A0c(view, R.id.top_end_card)));
        linkedList.add(new C38241Grk(AbstractC166987dD.A0c(view, R.id.bottom_start_card)));
        linkedList.add(new C38241Grk(AbstractC166987dD.A0c(view, R.id.bottom_end_card)));
    }
}
