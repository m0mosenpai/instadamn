package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.OptimisticNetworkOperation;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BxU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27105BxU extends OptimisticNetworkOperation {
    public final InterfaceC103524lS A00;
    public final UserSession A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    /* JADX WARN: Multi-variable type inference failed */
    public C27105BxU(UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        List A3j;
        AbstractC25233BEq.A0w(2, str, str2, str3);
        C14360o3.A0B(str7, 9);
        this.A01 = userSession;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A09 = str5;
        this.A04 = str6;
        this.A02 = num;
        this.A05 = str7;
        C38321qM A00 = BSQ.A00(userSession, str);
        InterfaceC103524lS interfaceC103524lS = null;
        if (A00 != null && (A3j = A00.A3j()) != null) {
            Iterator it = A3j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C14360o3.A0K(((InterfaceC103524lS) next).getId(), str2)) {
                    interfaceC103524lS = next;
                    break;
                }
            }
            interfaceC103524lS = interfaceC103524lS;
        }
        this.A00 = interfaceC103524lS;
    }
}
