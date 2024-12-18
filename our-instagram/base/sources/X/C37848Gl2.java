package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gl2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37848Gl2 implements C5R5 {
    public final C9CJ A02;
    public final InterfaceC116925Qy A03;
    public final AbstractC39459Hbl A04;
    public final C5Qu A05;
    public final C37671Gi4 A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public InterfaceC120815dY A01 = null;
    public Context A00 = null;

    public C37848Gl2(C9CJ c9cj, InterfaceC116925Qy interfaceC116925Qy, AbstractC39459Hbl abstractC39459Hbl, C5Qu c5Qu, C37671Gi4 c37671Gi4, Integer num, String str, String str2) {
        this.A09 = str;
        this.A06 = c37671Gi4;
        this.A05 = c5Qu;
        this.A08 = str2;
        this.A03 = interfaceC116925Qy;
        this.A04 = abstractC39459Hbl;
        this.A07 = num;
        this.A02 = c9cj;
    }

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        String str;
        C14360o3.A0B(userSession, 0);
        C37787Gk2 c37787Gk2 = C37787Gk2.A01;
        String str2 = this.A09;
        C37671Gi4 c37671Gi4 = this.A06;
        if (c37671Gi4 != null) {
            str = c37671Gi4.A01();
        } else {
            str = null;
        }
        String A00 = this.A05.A00();
        String str3 = this.A08;
        InterfaceC116925Qy interfaceC116925Qy = this.A03;
        InterfaceC120815dY interfaceC120815dY = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        return c37787Gk2.A08(this.A00, this.A02, interfaceC116925Qy, userSession, interfaceC120815dY, this.A04, this.A07, str2, null, str, A00, str3, AbstractC37792Gk7.A00(C18U.A04(c06090Tz, userSession, 36876357275418723L), String.valueOf(C18U.A06(c06090Tz, userSession, 2342156416535562165L)), String.valueOf(C18U.A06(c06090Tz, userSession, 2342156416535627702L)), C18U.A04(c06090Tz, userSession, 36876357275484260L), C18U.A06(c06090Tz, userSession, 2342156416535496628L)), null, null, null, null, -1.0d, false, false, false, z, true);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        String str2;
        C14360o3.A0B(userSession, 0);
        C37787Gk2 c37787Gk2 = C37787Gk2.A01;
        String str3 = this.A09;
        C37671Gi4 c37671Gi4 = this.A06;
        if (c37671Gi4 != null) {
            str2 = c37671Gi4.A01();
        } else {
            str2 = null;
        }
        return c37787Gk2.A08(this.A00, this.A02, this.A03, userSession, this.A01, this.A04, this.A07, str3, str, str2, this.A05.A00(), this.A08, null, null, null, null, null, -1.0d, false, false, false, false, false);
    }

    @Override // X.C5R5
    public final /* synthetic */ void ERc(C37682GiJ c37682GiJ) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void EcO(String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }

    @Override // X.C5R5
    public final void ES6(Context context) {
        this.A00 = context;
    }

    @Override // X.C5R5
    public final void Eee(InterfaceC120815dY interfaceC120815dY) {
        this.A01 = interfaceC120815dY;
    }
}
