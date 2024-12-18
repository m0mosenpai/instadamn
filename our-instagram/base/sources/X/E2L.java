package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class E2L extends C3OO {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;

    public E2L(View view) {
        super(view);
        this.A02 = AbstractC166987dD.A0e(view, R.id.general_folder_banner_title);
        this.A01 = AbstractC166987dD.A0e(view, R.id.general_folder_banner_secondary_text);
        this.A00 = view.getContext();
    }
}
