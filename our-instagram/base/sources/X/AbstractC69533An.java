package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3An, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC69533An extends C2UU implements InterfaceC69543Ao {
    public static long A06 = 1;
    public final List A04 = new ArrayList();
    public final List A03 = new ArrayList();
    public final HashMap A02 = new HashMap();
    public final Map A05 = new HashMap();
    public Reel A00 = null;
    public C70873Fz A01 = null;

    public final C3G2 A01() {
        int intValue = ((C69523Am) this).A08.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 4) {
                    if (intValue != 3) {
                        return C3G2.A1L;
                    }
                    return C3G2.A1H;
                }
                return C3G2.A06;
            }
            return C3G2.A1F;
        }
        return C3G2.A1G;
    }

    public int CNP(Reel reel) {
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i < list.size()) {
                String str = reel.A1o;
                String str2 = ((C3G4) list.get(i)).A03.A1o;
                C14360o3.A07(str2);
                if (!str.equals(str2)) {
                    i++;
                } else {
                    return i;
                }
            } else {
                return -1;
            }
        }
    }

    public final C70873Fz A00(UserSession userSession) {
        C70873Fz c70873Fz = this.A01;
        if (c70873Fz == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3G4) it.next()).A03);
            }
            return new C70873Fz(userSession, arrayList);
        }
        return c70873Fz;
    }

    public final ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            Reel reel = ((C3G4) it.next()).A03;
            if (!reel.A0a()) {
                arrayList.add(reel);
            }
        }
        return arrayList;
    }

    public final ArrayList A03(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3G4 c3g4 = (C3G4) this.A02.get(it.next());
            if (c3g4 != null) {
                arrayList.add(c3g4.A03);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC69543Ao
    public final Object Bla(int i) {
        List list = this.A04;
        if (i >= list.size()) {
            return null;
        }
        return ((C3G4) list.get(i)).A03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC69543Ao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EcN(java.util.List r15, boolean r16, com.instagram.common.session.UserSession r17) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69533An.EcN(java.util.List, boolean, com.instagram.common.session.UserSession):void");
    }

    @Override // X.InterfaceC69543Ao
    public final int CNQ(Reel reel, C41181vS c41181vS) {
        return CNP(reel);
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long longValue;
        int i2;
        int A03 = C0f9.A03(-1302744933);
        List list = this.A04;
        if (i >= list.size()) {
            C0w9.A03("MainFeedTrayAdapter#getItemId", "Item position is larger than the # of known viewModels");
            longValue = i;
            i2 = -2008603130;
        } else {
            String str = ((C3G4) list.get(i)).A03.A1o;
            Map map = this.A05;
            Number number = (Number) map.get(str);
            if (number == null) {
                long j = A06;
                A06 = 1 + j;
                number = Long.valueOf(j);
                map.put(str, number);
            }
            longValue = number.longValue();
            i2 = 356829308;
        }
        C0f9.A0A(i2, A03);
        return longValue;
    }
}
