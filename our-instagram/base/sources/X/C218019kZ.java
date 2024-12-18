package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9kZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218019kZ extends ACt {
    public int A00;
    public C22881A7b A01;
    public final C88Y A02;
    public final Context A03;
    public final UserSession A04;

    public C218019kZ(Context context, UserSession userSession, C88Y c88y) {
        this.A04 = userSession;
        this.A02 = c88y;
        this.A03 = context;
    }

    public static void A00(C5GJ c5gj, C218019kZ c218019kZ) {
        String A0w;
        C69659Vt0 A00 = VWC.A00();
        C22881A7b c22881A7b = c218019kZ.A01;
        c22881A7b.getClass();
        A00.A04 = AbstractC166997dE.A0w(c22881A7b.A00);
        if (AnonymousClass483.A04(c218019kZ.A01.A01)) {
            A0w = "";
        } else {
            A0w = AbstractC166997dE.A0w((String) c218019kZ.A01.A01.get(c218019kZ.A00));
        }
        A00.A07 = A0w;
        Context context = c218019kZ.A03;
        A00.A0B = VZ0.A00(context.getResources());
        c218019kZ.A02.A0A(new V9Y(context, c218019kZ.A04, new Wm1(A00.A00())), c5gj, C148276lx.A1L);
    }
}
