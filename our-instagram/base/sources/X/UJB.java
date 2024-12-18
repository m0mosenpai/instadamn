package X;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UJB extends C3OO {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final /* synthetic */ UuT A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJB(LinearLayout linearLayout, UuT uuT) {
        super(linearLayout);
        C14360o3.A0B(linearLayout, 2);
        this.A03 = uuT;
        this.A01 = linearLayout;
        this.A02 = AbstractC167007dF.A0N(linearLayout, R.id.description);
        this.A00 = AbstractC31176DnK.A0D(linearLayout, R.id.back_button);
    }
}
