package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.39a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C691439a {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public C691439a(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(fragmentActivity, 2);
        C14360o3.A0B(userSession, 3);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C206909Dv(this, 6));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C206909Dv(this, 8));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C206909Dv(this, 7));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C206909Dv(this, 9));
    }
}
