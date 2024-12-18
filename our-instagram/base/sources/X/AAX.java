package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes4.dex */
public final class AAX {
    public BDU A00;
    public final Context A01;
    public final Bundle A02;
    public final FragmentActivity A03;
    public final C57312k6 A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public AAX(Context context, Bundle bundle, FragmentActivity fragmentActivity, C57312k6 c57312k6, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 6);
        this.A01 = context;
        this.A08 = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A02 = bundle;
        this.A06 = userSession;
        this.A03 = fragmentActivity;
        this.A05 = interfaceC11380iw;
        this.A04 = c57312k6;
        this.A0A = AbstractC166987dD.A1E();
    }
}
