package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ed1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32859Ed1 extends AbstractC35044FcH {
    public final FragmentActivity A00;
    public final AbstractC10360h2 A01;
    public final AbstractC018607g A02;
    public final EnumC33510Erj A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final C75113Zb A06;
    public final Long A07;
    public final Runnable A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32859Ed1(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, EnumC33510Erj enumC33510Erj, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C2EY c2ey, Long l, Object obj, Runnable runnable, String str, String str2, String str3) {
        super(c2ey, obj, "user_sms", R.drawable.instagram_sms_pano_outline_24, 2131960182);
        C14360o3.A0B(abstractC018607g, 8);
        this.A04 = userSession;
        this.A05 = interfaceC60442pS;
        this.A06 = c75113Zb;
        this.A00 = fragmentActivity;
        this.A01 = abstractC10360h2;
        this.A02 = abstractC018607g;
        this.A08 = runnable;
        this.A03 = enumC33510Erj;
        this.A0A = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A07 = l;
    }
}
