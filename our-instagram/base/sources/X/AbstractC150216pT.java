package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.6pT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC150216pT {
    public java.util.Set A03() {
        C148196lp c148196lp = (C148196lp) this;
        return AbstractC001800i.A0j(AbstractC001800i.A0X(C1AT.A01(c148196lp.A01).A04(C1AV.A37, c148196lp.getClass()).C2v("story_quick_reactions_recent_emojis")));
    }

    public void A06(java.util.Set set) {
        C148196lp c148196lp = (C148196lp) this;
        InterfaceC19610xo ARD = C1AT.A01(c148196lp.A01).A04(C1AV.A37, c148196lp.getClass()).ARD();
        ARD.E7L("story_quick_reactions_recent_emojis", set);
        ARD.apply();
    }

    public int A01() {
        if (this instanceof C148196lp) {
            return 37;
        }
        return 32;
    }

    public boolean A07() {
        if (this instanceof C148196lp) {
            return true;
        }
        return false;
    }

    public final ArrayList A02() {
        java.util.Set A03 = A03();
        ArrayList arrayList = new ArrayList();
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(ADX.parseFromJson(C16V.A00((String) it.next())));
            } catch (IOException unused) {
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final void A04(C23726Aez c23726Aez) {
        String A00;
        String A002;
        HashSet hashSet = new HashSet(A03());
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList A02 = A02();
        String str = null;
        for (int i = 0; i < A02.size(); i++) {
            C23726Aez c23726Aez2 = (C23726Aez) A02.get(i);
            if (c23726Aez2 != null) {
                try {
                    String A003 = ADX.A00(c23726Aez2);
                    if (A07()) {
                        C148336m3 c148336m3 = c23726Aez2.A04;
                        c148336m3.getClass();
                        C148336m3 c148336m32 = c23726Aez.A04;
                        c148336m32.getClass();
                        if (AbstractC170297ii.A01(c148336m3, c148336m32)) {
                            if ((this instanceof C148196lp) && i < 7) {
                                c23726Aez.A00 = c23726Aez2.A00;
                            }
                            A002 = ADX.A00(c23726Aez);
                            hashSet.remove(A003);
                            hashSet.add(A002);
                            A06(hashSet);
                            return;
                        }
                    }
                    if (new C71473Il(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A02(c23726Aez2.A00()).equals(new C71473Il(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A02(c23726Aez.A00()))) {
                        A002 = ADX.A00(c23726Aez);
                        hashSet.remove(A003);
                        hashSet.add(A002);
                        A06(hashSet);
                        return;
                    }
                    if (c23726Aez2.A00 < currentTimeMillis) {
                        currentTimeMillis = c23726Aez2.A00;
                        str = A003;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        try {
            if (hashSet.size() >= A01()) {
                if (str != null) {
                    A00 = ADX.A00(c23726Aez);
                    hashSet.remove(str);
                } else {
                    return;
                }
            } else {
                A00 = ADX.A00(c23726Aez);
            }
            hashSet.add(A00);
            A06(hashSet);
        } catch (IOException unused2) {
        }
    }

    public final void A05(C148336m3 c148336m3) {
        A04(new C23726Aez(c148336m3, System.currentTimeMillis()));
    }
}
