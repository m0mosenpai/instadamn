package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.CcE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28215CcE {
    public CWI A00;
    public String A01;
    public final Context A02;
    public final FoaUserSession A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16660sJ A06;
    public final C0UO A07;

    public C28215CcE(Context context, FoaUserSession foaUserSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, C0UO c0uo) {
        C14360o3.A0B(c0uo, 3);
        this.A02 = context;
        this.A03 = foaUserSession;
        this.A07 = c0uo;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16660sJ;
        this.A06 = interfaceC16660sJ2;
    }

    public static final CWI A00(C28215CcE c28215CcE) {
        CWI cwi = c28215CcE.A00;
        if (cwi != null) {
            return cwi;
        }
        throw AbstractC166987dD.A14("Bottom sheet container is null. Please call show() first");
    }

    public final InterfaceC72040XGi A01() {
        InterfaceC72040XGi interfaceC72040XGi = A00(this).A02.A00;
        if (interfaceC72040XGi != null) {
            return interfaceC72040XGi;
        }
        throw AbstractC166987dD.A14("Not attached to a fragment!");
    }
}
