package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ed0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32858Ed0 extends AbstractC35044FcH {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final AbstractC10360h2 A02;
    public final AbstractC018607g A03;
    public final EnumC33510Erj A04;
    public final UserSession A05;
    public final InterfaceC60442pS A06;
    public final C75113Zb A07;
    public final Runnable A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32858Ed0(Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, EnumC33510Erj enumC33510Erj, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C2EY c2ey, Object obj, Runnable runnable, String str, String str2, String str3) {
        super(c2ey, obj, "system_share_sheet", R.drawable.instagram_share_android_pano_outline_24, C18U.A06(C06090Tz.A05, userSession, 36314837546961747L) ? 2131960180 : 2131960186);
        C14360o3.A0B(abstractC018607g, 8);
        this.A05 = userSession;
        this.A07 = c75113Zb;
        this.A00 = fragment;
        this.A01 = fragmentActivity;
        this.A02 = abstractC10360h2;
        this.A03 = abstractC018607g;
        this.A06 = interfaceC60442pS;
        this.A08 = runnable;
        this.A04 = enumC33510Erj;
        this.A0A = str;
        this.A0B = str2;
        this.A09 = str3;
    }
}
