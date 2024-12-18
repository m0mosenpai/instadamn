package X;

import android.animation.ValueAnimator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class U7P extends C70623Ez {
    public final LinkedHashMap A02 = new LinkedHashMap();
    public final LinkedHashMap A01 = new LinkedHashMap();
    public final LinkedHashMap A00 = new LinkedHashMap();

    @Override // X.C70623Ez, X.C3F0
    public final boolean A0R(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        this.A01.put(c3oo, new C69348Vlu(c3oo, true));
        return true;
    }

    @Override // X.C70623Ez, X.C3F0
    public final boolean A0S(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C51313Mla) {
            C84743qO c84743qO = (C84743qO) ((C51313Mla) c3oo).A02.getValue();
            ValueAnimator valueAnimator = c84743qO.A01;
            if (valueAnimator != null && valueAnimator.isStarted()) {
                c84743qO.A01.cancel();
            }
            this.A02.put(c3oo, new C69348Vlu(c3oo, false));
            return true;
        }
        return true;
    }

    @Override // X.C70623Ez, X.C3F1
    public final void A0I() {
        LinkedHashMap linkedHashMap = this.A02;
        Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
        while (A14.hasNext()) {
            C69348Vlu c69348Vlu = (C69348Vlu) ((Map.Entry) A14.next()).getValue();
            c69348Vlu.A01.A08();
            c69348Vlu.A02.A08();
            c69348Vlu.A03.A08();
        }
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = this.A01;
        Iterator A142 = AbstractC166997dE.A14(linkedHashMap2);
        while (A142.hasNext()) {
            C69348Vlu c69348Vlu2 = (C69348Vlu) ((Map.Entry) A142.next()).getValue();
            c69348Vlu2.A01.A08();
            c69348Vlu2.A02.A08();
            c69348Vlu2.A03.A08();
        }
        linkedHashMap2.clear();
        LinkedHashMap linkedHashMap3 = this.A00;
        Iterator A143 = AbstractC166997dE.A14(linkedHashMap3);
        while (A143.hasNext()) {
            C69348Vlu c69348Vlu3 = (C69348Vlu) ((Map.Entry) A143.next()).getValue();
            c69348Vlu3.A01.A08();
            c69348Vlu3.A02.A08();
            c69348Vlu3.A03.A08();
        }
        linkedHashMap3.clear();
        super.A0I();
    }

    @Override // X.C70623Ez, X.C3F1
    public final void A0J() {
        LinkedHashMap linkedHashMap = this.A02;
        if (linkedHashMap.isEmpty()) {
            LinkedHashMap linkedHashMap2 = this.A01;
            Iterator A14 = AbstractC166997dE.A14(new HashMap(linkedHashMap2));
            while (A14.hasNext()) {
                Map.Entry entry = (Map.Entry) A14.next();
                linkedHashMap2.remove(entry.getKey());
                super.A0R((C3OO) entry.getKey());
            }
            super.A0J();
            return;
        }
        A00(linkedHashMap);
        A00(this.A01);
    }

    @Override // X.C70623Ez, X.C3F1
    public final void A0K(C3OO c3oo) {
        LinkedHashMap linkedHashMap = this.A01;
        if (linkedHashMap.containsKey(c3oo)) {
            c3oo.itemView.setAlpha(1.0f);
            linkedHashMap.remove(c3oo);
        } else {
            super.A0K(c3oo);
        }
    }

    @Override // X.C70623Ez, X.C3F1
    public final boolean A0L() {
        if ((!this.A02.isEmpty()) || (!this.A01.isEmpty()) || (!this.A00.isEmpty()) || super.A0L()) {
            return true;
        }
        return false;
    }

    private final void A00(HashMap hashMap) {
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            AbstractC31177DnL.A1S(entry, this.A00);
            C69348Vlu c69348Vlu = (C69348Vlu) entry.getValue();
            C68741VbK c68741VbK = new C68741VbK(this);
            C65726Tt0 c65726Tt0 = c69348Vlu.A03;
            c65726Tt0.A05(new WQY(c68741VbK, c69348Vlu));
            C65726Tt0 c65726Tt02 = c69348Vlu.A01;
            float f = c69348Vlu.A00;
            c65726Tt02.A09(f);
            c69348Vlu.A02.A09(f);
            c65726Tt0.A09(f);
        }
        hashMap.clear();
    }
}
