package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UJU extends C3OO {
    public final ViewGroup A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJU(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC31176DnK.A0C(view, R.id.header_container);
        this.A05 = AbstractC167007dF.A0N(view, R.id.header_text);
        this.A03 = AbstractC31176DnK.A0D(view, R.id.header_info_icon);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.meta_ai_snippet_thumbs_up);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.meta_ai_snippet_thumbs_down);
        this.A04 = AbstractC167007dF.A0N(view, R.id.header_action_button);
    }
}
