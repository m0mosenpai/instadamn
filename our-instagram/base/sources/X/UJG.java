package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UJG extends C3OO {
    public final ViewGroup A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJG(ViewGroup viewGroup) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A02 = AbstractC167007dF.A0N(viewGroup, R.id.primary_text);
        this.A03 = AbstractC167007dF.A0N(viewGroup, R.id.secondary_text);
        this.A01 = AbstractC31176DnK.A0D(viewGroup, R.id.chevron_icon);
    }
}
