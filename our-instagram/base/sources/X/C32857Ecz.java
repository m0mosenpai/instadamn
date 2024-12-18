package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ecz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32857Ecz extends AbstractC35044FcH {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC37290Gbr A03;
    public final InterfaceC60442pS A04;
    public final C75113Zb A05;
    public final C2EY A06;
    public final Object A07;
    public final FragmentActivity A08;
    public final AbstractC10360h2 A09;
    public final AbstractC018607g A0A;
    public final Runnable A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32857Ecz(Context context, Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC37290Gbr interfaceC37290Gbr, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C2EY c2ey, Object obj, Runnable runnable) {
        super(c2ey, obj, "add_to_channel", R.drawable.instagram_channels_broadcast_pano_outline_24, 2131960168);
        C14360o3.A0B(abstractC018607g, 9);
        this.A00 = context;
        this.A06 = c2ey;
        this.A02 = userSession;
        this.A07 = obj;
        this.A05 = c75113Zb;
        this.A01 = fragment;
        this.A08 = fragmentActivity;
        this.A09 = abstractC10360h2;
        this.A0A = abstractC018607g;
        this.A04 = interfaceC60442pS;
        this.A0B = runnable;
        this.A03 = interfaceC37290Gbr;
    }
}
