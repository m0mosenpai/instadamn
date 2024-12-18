package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Jqv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44712Jqv extends C3OO {
    public L8Z A00;
    public final ImageView A01;
    public final TextView A02;
    public final /* synthetic */ KNR A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44712Jqv(View view, KNR knr) {
        super(view);
        this.A03 = knr;
        this.A01 = AbstractC31171DnF.A08(view, R.id.album_filter_icon);
        this.A02 = AbstractC166987dD.A0e(view, R.id.album_filter_title);
    }
}
