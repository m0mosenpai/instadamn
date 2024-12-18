package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UIV extends C3OO {
    public final TextView A00;
    public final ViewGroup A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIV(ViewGroup viewGroup) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A01 = viewGroup;
        this.A00 = AbstractC167007dF.A0N(viewGroup, R.id.header_row_text);
    }
}
