package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Vlq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69344Vlq {
    public C66084TzL A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final RecyclerView A04;
    public final InterfaceC09390do A05;

    public C69344Vlq(View view) {
        C14360o3.A0B(view, 1);
        this.A03 = AbstractC31176DnK.A0C(view, R.id.root);
        this.A04 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.listview);
        this.A01 = AbstractC166997dE.A0S(view, R.id.footer_container);
        this.A02 = AbstractC166997dE.A0S(view, R.id.header_container);
        this.A05 = AbstractC09440dt.A01(new X32(this, 30));
    }
}
