package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43161yj implements InterfaceC13000lm {
    public InterfaceC19630xq A00;
    public final InterfaceC43191ym A01;
    public final Map A02;

    public static void A01(AbstractC43161yj abstractC43161yj, Object obj) {
        char lowerCase = Character.toLowerCase(((String) obj).charAt(0));
        Map map = abstractC43161yj.A02;
        Character valueOf = Character.valueOf(lowerCase);
        if (!map.containsKey(valueOf)) {
            map.put(valueOf, new HashSet());
        }
        if (map.get(valueOf) != null) {
            ((java.util.Set) map.get(valueOf)).add(obj);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
    }

    public AbstractC43161yj(InterfaceC43191ym interfaceC43191ym, UserSession userSession) {
        HashMap hashMap = new HashMap();
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(interfaceC43191ym.BfP());
        this.A01 = interfaceC43191ym;
        this.A02 = hashMap;
        this.A00 = A03;
    }

    public final void A03() {
        this.A02.clear();
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.1yo
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC19610xo ARD = AbstractC43161yj.this.A00.ARD();
                ARD.AHW();
                ARD.apply();
            }

            {
                super(2048002197);
            }
        });
    }

    public final ArrayList A02(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence != null && charSequence.length() > 0) {
            Character valueOf = Character.valueOf(Character.toLowerCase(charSequence.charAt(0)));
            Map map = this.A02;
            if (map.containsKey(valueOf)) {
                for (Object obj : (java.util.Set) map.get(valueOf)) {
                    if (((String) obj).toLowerCase(Locale.getDefault()).startsWith(charSequence.toString().toLowerCase(Locale.getDefault()))) {
                        arrayList.add(obj);
                        if (arrayList.size() == Integer.MAX_VALUE) {
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
