package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.UIn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66463UIn extends C3OO {
    public final TextView A00;
    public final View A01;
    public final /* synthetic */ Uu0 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66463UIn(View view, Uu0 uu0) {
        super(view);
        this.A02 = uu0;
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.A00 = textView;
        View findViewById = view.findViewById(R.id.divider);
        this.A01 = findViewById;
        C14360o3.A05(textView);
        WF7.A02(textView, VEP.A0v);
        Context A0L = AbstractC166997dE.A0L(view);
        C14360o3.A07(findViewById);
        C70161WEa.A00(A0L, findViewById, 19, false);
    }
}
