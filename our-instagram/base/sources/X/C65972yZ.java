package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.2yZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65972yZ implements InterfaceC65982ya {
    public static C54971OTd A05;
    public static String A06;
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final Integer A04;
    public static final java.util.Set A08 = new HashSet();
    public static final java.util.Set A07 = new HashSet();

    public C65972yZ(Context context, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Integer num) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = interfaceC60442pS;
        this.A04 = num;
    }

    public final void A01(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        if (c47z.A5P || c47z.A0u()) {
            EnumC915447k enumC915447k = c47z.A6J;
            EnumC915447k enumC915447k2 = EnumC915447k.A02;
            if (enumC915447k == enumC915447k2 && c47z.A1f != enumC915447k2) {
                java.util.Set set = A08;
                if (!set.contains(c47z.A35)) {
                    A00();
                    C49500LuD c49500LuD = new C49500LuD(this.A00, this.A02, this, c47z, this.A04);
                    c47z.A0W(c49500LuD);
                    C54971OTd c54971OTd = new C54971OTd((C49490Lu3) null, c49500LuD);
                    A05 = c54971OTd;
                    C41451vu.A01.E4s(new C3KH(c54971OTd));
                    set.add(c47z.A35);
                    A06 = c47z.A35;
                }
            }
            AbstractC25651Mw.A00(this.A02).A01(new LYQ(this), C70083Cs.class);
        }
    }

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        A01(c47z);
    }

    public static final void A00() {
        C54971OTd c54971OTd = A05;
        if (c54971OTd != null) {
            C41451vu.A01.E4s(new C3KI(c54971OTd));
        }
    }
}
