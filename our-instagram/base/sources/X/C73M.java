package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.facebook.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.73M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73M {
    public int A00;
    public boolean A01;
    public final ViewGroup A02;
    public final LinearLayout A03;
    public final LinearLayout A04;
    public final C57012jc A05;
    public final C57012jc A06;
    public final Map A07 = new HashMap();
    public final Map A08;

    public C73M(View view, boolean z) {
        HashMap hashMap = new HashMap();
        this.A08 = hashMap;
        ViewGroup viewGroup = (ViewGroup) view;
        this.A02 = viewGroup;
        this.A04 = (LinearLayout) view.requireViewById(R.id.profile_header_actions_top_row);
        this.A06 = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_actions_prominent_messaging_row));
        this.A05 = new C57012jc((ViewStub) view.findViewById(R.id.profile_header_actions_bottom_row_stub));
        this.A03 = (LinearLayout) view.requireViewById(R.id.similar_accounts_container);
        this.A01 = z;
        Context context = viewGroup.getContext();
        int A01 = AbstractC13890nF.A01(context);
        this.A00 = A01;
        C73N.A01(context, hashMap, A01);
    }
}
