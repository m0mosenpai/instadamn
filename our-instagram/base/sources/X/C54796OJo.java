package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OJo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54796OJo {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final SZ2 A03;
    public final String A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16620sF A07;
    public final boolean A08;
    public final boolean A09;

    public final void A00(String str, boolean z) {
        AbstractC63317ShP.A04(this.A02, new P47(this, str, z), str, true, z);
    }

    public C54796OJo(Context context, FragmentActivity fragmentActivity, UserSession userSession, SZ2 sz2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2) {
        AbstractC167017dG.A1P(userSession, str);
        C14360o3.A0B(sz2, 5);
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = sz2;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = interfaceC16620sF;
        this.A05 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
    }
}
