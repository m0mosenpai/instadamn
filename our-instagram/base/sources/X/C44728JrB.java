package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.JrB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44728JrB extends C3OO {
    public final ViewStub A00;
    public final TextView A01;
    public final TextView A02;
    public final Integer A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44728JrB(View view, Integer num) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = num;
        this.A00 = AbstractC31171DnF.A07(view, R.id.info_icon);
        this.A02 = AbstractC166987dD.A0e(view, R.id.info_header);
        this.A01 = AbstractC166987dD.A0e(view, R.id.info_text);
    }
}
