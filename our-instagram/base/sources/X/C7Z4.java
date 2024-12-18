package X;

import android.os.Build;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Z4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Z4 {
    public boolean A00;
    public final InterfaceC41501vz A01;
    public final UserSession A02;
    public final InterfaceC08830cm A03;
    public final InterfaceC16820sZ A04;

    public C7Z4(UserSession userSession, InterfaceC08830cm interfaceC08830cm, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A04 = interfaceC16820sZ;
        this.A02 = userSession;
        this.A03 = interfaceC08830cm;
        this.A01 = new InterfaceC41501vz() { // from class: X.7Z5
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(914835731);
                C2Io c2Io = (C2Io) obj;
                int A032 = C0f9.A03(-505700094);
                C14360o3.A0B(c2Io, 0);
                C7Z4.A00(C7Z4.this, c2Io);
                C0f9.A0A(-1803278518, A032);
                C0f9.A0A(949198821, A03);
            }
        };
    }

    public static final void A00(C7Z4 c7z4, C2Io c2Io) {
        InterfaceC08830cm interfaceC08830cm = c7z4.A03;
        Object obj = interfaceC08830cm.get();
        C14360o3.A07(obj);
        if (((C7U0) obj).C7r().CPl() && !A01(c7z4)) {
            Integer num = c2Io.A01;
            if (num == C05F.A0D) {
                C16930sl c16930sl = C16930sl.A00;
                Object obj2 = interfaceC08830cm.get();
                C14360o3.A07(obj2);
                ((C7U0) obj2).AkT().Cuz(c16930sl);
            }
            if (Build.VERSION.SDK_INT >= 30 && c7z4.A00 && num == C05F.A01) {
                if (C18U.A06(C06090Tz.A05, c7z4.A02, 36325081046004438L)) {
                    ((View) c7z4.A04.invoke()).performHapticFeedback(16);
                }
            }
        }
    }

    public static final boolean A01(C7Z4 c7z4) {
        Object obj = c7z4.A03.get();
        C14360o3.A07(obj);
        List list = ((C7U0) obj).C7r().C7W().A0b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((User) it.next()).A1U()) {
                    return true;
                }
            }
        }
        return false;
    }
}
