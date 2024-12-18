package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gid, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37702Gid {
    public static boolean A0C;
    public InterfaceC670130s A00;
    public Integer A01 = C05F.A00;
    public java.util.Set A02;
    public InterfaceC16820sZ A03;
    public final Context A04;
    public final InterfaceC116925Qy A05;
    public final C37682GiJ A06;
    public final UserSession A07;
    public final InterfaceC60442pS A08;
    public final C37526Gfi A09;
    public final AbstractC39459Hbl A0A;
    public final C1M1 A0B;

    public C37702Gid(Context context, InterfaceC116925Qy interfaceC116925Qy, C37682GiJ c37682GiJ, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC670130s interfaceC670130s, C1M1 c1m1, AbstractC39459Hbl abstractC39459Hbl, InterfaceC16820sZ interfaceC16820sZ) {
        this.A04 = context;
        this.A07 = userSession;
        this.A0B = c1m1;
        this.A08 = interfaceC60442pS;
        this.A0A = abstractC39459Hbl;
        this.A06 = c37682GiJ;
        this.A00 = interfaceC670130s;
        this.A03 = interfaceC16820sZ;
        this.A05 = interfaceC116925Qy;
        this.A09 = new C37526Gfi(interfaceC60442pS, userSession, c1m1);
    }
}
