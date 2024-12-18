package X;

import android.content.Context;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.LpG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49199LpG implements InterfaceC50438MOs {
    public final BJF A00;
    public final AnonymousClass988 A01;
    public final C7IM A02;

    @Override // X.InterfaceC50438MOs
    public final ArrayList AWt(Context context, C51760Mtj c51760Mtj, C99E c99e, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, InterfaceC50520MRx interfaceC50520MRx2, Map map, java.util.Set set, java.util.Set set2) {
        C45273K2b A00;
        Integer num;
        ArrayList A1E = AbstractC166987dD.A1E();
        int count = interfaceC50520MRx.getCount();
        for (int i = 0; i < count; i++) {
            if (interfaceC50520MRx.BTA(i) == 0) {
                C45273K2b A002 = Ko7.A00(c99e, interfaceC50520MRx, i);
                if (i == 0) {
                    A00 = null;
                } else {
                    A00 = Ko7.A00(c99e, interfaceC50520MRx, i - 1);
                }
                boolean A003 = AbstractC162567Pt.A00(A002, A00, C7P5.A00().A01(LIQ.A00(c99e, interfaceC50520MRx, i)));
                boolean A0K = C14360o3.A0K(this.A00.A01, interfaceC50520MRx.BSx(i));
                if (A003 || A0K) {
                    long A004 = InterfaceC50520MRx.A00(interfaceC50520MRx, i);
                    String A005 = AbstractC162607Px.A00(context, A004);
                    String BSx = interfaceC50520MRx.BSx(i);
                    if (A003) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    C7IM c7im = this.A02;
                    C47908LEc.A00(C05F.A0C, MessageFormat.format("timestamp_{0}", BSx), new C161397La(null, new C162297Or(A004, 0L), num, BSx, A005, c7im.A00, A004, false, c7im.A00()), BSx, A1E);
                }
            }
        }
        return A1E;
    }

    public C49199LpG(BJF bjf, AnonymousClass988 anonymousClass988, C7IM c7im) {
        this.A01 = anonymousClass988;
        this.A00 = bjf;
        this.A02 = c7im;
    }
}
