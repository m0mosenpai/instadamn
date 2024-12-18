package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gq4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38137Gq4 {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final InterfaceC41501vz A02;
    public final InterfaceC41501vz A03;
    public final InterfaceC41501vz A04;
    public final InterfaceC12870lZ A05;
    public final UserSession A06;
    public final C38083GpC A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16820sZ A09;
    public final Context A0A;

    public C38137Gq4(Context context, FragmentActivity fragmentActivity, UserSession userSession, C38083GpC c38083GpC, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(userSession, 3);
        this.A0A = context;
        this.A00 = fragmentActivity;
        this.A06 = userSession;
        this.A07 = c38083GpC;
        this.A09 = interfaceC16820sZ;
        this.A08 = interfaceC16820sZ2;
        this.A01 = AbstractC31171DnF.A0D(str);
        this.A04 = C37816GkW.A00(this, 6);
        this.A02 = C37816GkW.A00(this, 5);
        this.A03 = new C31650DvG(this, 44);
        this.A05 = new C38138Gq5(this);
    }
}
