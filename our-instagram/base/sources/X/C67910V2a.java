package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V2a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67910V2a extends C7E1 {
    public String A00;
    public boolean A01;
    public final V39 A02;
    public final V3E A03;
    public final InterfaceC62602sz A04;
    public final C65842yM A05;
    public final List A06;

    public C67910V2a(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, XLQ xlq, XLU xlu) {
        InterfaceC72020XFi interfaceC72020XFi = InterfaceC72020XFi.A01;
        Integer num = C05F.A00;
        C14360o3.A0B(interfaceC72020XFi, 5);
        V3E v3e = new V3E(context, interfaceC11380iw, userSession, xlu, interfaceC72020XFi, num, null, false, false, false, false, false, false);
        this.A03 = v3e;
        V39 v39 = new V39(context, interfaceC11380iw, userSession, xlq, interfaceC72020XFi);
        this.A02 = v39;
        C65842yM c65842yM = new C65842yM(context);
        this.A05 = c65842yM;
        this.A06 = new ArrayList();
        this.A04 = new C36745GHo(this, 8);
        A0B(v3e, v39, c65842yM);
    }
}
