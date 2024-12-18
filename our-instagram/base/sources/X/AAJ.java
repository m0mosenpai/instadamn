package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AAJ {
    public final Context A00;
    public final View A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C219949ng A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public AAJ(Context context, View view, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(view, 4);
        this.A00 = context;
        this.A02 = fragmentActivity;
        this.A03 = userSession;
        this.A01 = view;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        C219949ng c219949ng = new C219949ng(context, view, fragmentActivity, userSession);
        this.A04 = c219949ng;
        c219949ng.A04();
    }
}
