package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class NU2 extends AbstractC54988OTw {
    public C51876MwK A00;
    public C51879MwN A01;
    public C51879MwN A02;
    public InterfaceC19390xP A03;
    public final UserSession A04;
    public final List A05;
    public final Map A06;
    public final C05A A07;

    public static final C51879MwN A01(NU2 nu2) {
        return new C51879MwN(A00(C17060sy.A01.A01(nu2.A04)), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), 0L, false, false, false, true, false, false, false, true, false, false, false, false, false);
    }

    public static final void A02(NU2 nu2) {
        LinkedHashMap A03 = AbstractC06930Yk.A03(nu2.A02.A03);
        C51876MwK c51876MwK = nu2.A02.A01;
        C51876MwK c51876MwK2 = nu2.A00;
        boolean z = c51876MwK.A04;
        boolean z2 = c51876MwK.A07;
        String str = c51876MwK2.A02;
        String str2 = c51876MwK2.A03;
        String str3 = c51876MwK2.A01;
        ImageUrl imageUrl = c51876MwK2.A00;
        boolean z3 = c51876MwK2.A05;
        boolean z4 = c51876MwK2.A06;
        AbstractC167027dH.A12(str, str2, str3);
        C14360o3.A0B(imageUrl, 5);
        nu2.A00 = new C51876MwK(imageUrl, str, str2, str3, z, z2, z3, z4);
        int size = A03.size() + 2;
        Iterator it = nu2.A05.iterator();
        while (it.hasNext()) {
            A03.put(String.valueOf(size), it.next());
            size++;
        }
        LinkedHashMap A032 = AbstractC06930Yk.A03(nu2.A02.A02);
        A032.putAll(nu2.A06);
        C51879MwN c51879MwN = nu2.A01;
        C51876MwK c51876MwK3 = nu2.A00;
        Map A0B = AbstractC06930Yk.A0B(A03);
        boolean z5 = c51879MwN.A0G;
        boolean z6 = c51879MwN.A05;
        boolean z7 = c51879MwN.A06;
        boolean z8 = c51879MwN.A0E;
        boolean z9 = c51879MwN.A0B;
        boolean z10 = c51879MwN.A0C;
        boolean z11 = c51879MwN.A08;
        long j = c51879MwN.A00;
        boolean z12 = c51879MwN.A09;
        boolean z13 = c51879MwN.A04;
        boolean z14 = c51879MwN.A07;
        boolean z15 = c51879MwN.A0F;
        boolean z16 = c51879MwN.A0A;
        boolean z17 = c51879MwN.A0D;
        C14360o3.A0B(c51876MwK3, 0);
        C51879MwN c51879MwN2 = new C51879MwN(c51876MwK3, A0B, A032, j, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17);
        if (!C14360o3.A0K(nu2.A01, c51879MwN2)) {
            C05A c05a = nu2.A07;
            C14360o3.A0B(c05a, 0);
            c05a.F8m(c51879MwN2);
            nu2.A01 = c51879MwN2;
        }
    }

    public NU2(UserSession userSession, C54446O4a c54446O4a) {
        super(c54446O4a);
        this.A04 = userSession;
        this.A07 = C10E.A00(A01(this));
        this.A01 = A01(this);
        this.A00 = A00(AbstractC166997dE.A0Y(userSession));
        this.A02 = A01(this);
        this.A05 = AbstractC166987dD.A1E();
        this.A06 = AbstractC166987dD.A1I();
    }

    public static final C51876MwK A00(User user) {
        return new C51876MwK(user.Bhu(), user.getId(), user.getUsername(), user.B8y(), true, true, false, false);
    }
}
