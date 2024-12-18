package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3aM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75553aM extends AbstractC65902yS {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC75403a7 A02;
    public final InterfaceC60442pS A03;
    public final InterfaceC75453aC A04;
    public final InterfaceC75543aL A05;
    public final String A06;
    public final InterfaceC09390do A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75553aM(Context context, FragmentActivity fragmentActivity, C07X c07x, UserSession userSession, InterfaceC75403a7 interfaceC75403a7, InterfaceC60442pS interfaceC60442pS, InterfaceC75453aC interfaceC75453aC, InterfaceC75543aL interfaceC75543aL, String str, boolean z) {
        super(context, c07x, userSession, null, null, null, 248);
        C14360o3.A0B(interfaceC75453aC, 7);
        C14360o3.A0B(interfaceC75543aL, 8);
        C14360o3.A0B(interfaceC75403a7, 9);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
        this.A08 = z;
        this.A04 = interfaceC75453aC;
        this.A05 = interfaceC75543aL;
        this.A02 = interfaceC75403a7;
        this.A06 = str;
        this.A07 = AbstractC09440dt.A01(new C206939Dy(context, 14));
    }
}
