package X;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129165sd {
    public C5H3 A00;
    public Long A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final A6S A09;
    public final EnumC129155sc A0A;
    public final EnumC129155sc A0B;
    public final C0JO A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final Map A0H;
    public final MotionEvent A0I;
    public final C129165sd A0J;

    public C129165sd(MotionEvent motionEvent, C129165sd c129165sd, A6S a6s, EnumC129155sc enumC129155sc, C0JO c0jo, long j) {
        EnumC129155sc enumC129155sc2;
        long j2;
        C14360o3.A0B(enumC129155sc, 2);
        this.A0C = c0jo;
        this.A0B = enumC129155sc;
        this.A0I = motionEvent;
        this.A06 = j;
        this.A0J = c129165sd;
        this.A09 = a6s;
        this.A0G = new ArrayList();
        this.A0F = new ArrayList();
        this.A0E = new ArrayList();
        this.A0H = new HashMap();
        this.A03 = motionEvent.getRawX();
        this.A04 = motionEvent.getRawY();
        if (c129165sd != null) {
            enumC129155sc2 = c129165sd.A0B;
        } else {
            enumC129155sc2 = EnumC129155sc.UNDEFINED;
        }
        this.A0A = enumC129155sc2;
        if (c129165sd != null) {
            j2 = c129165sd.A07;
        } else {
            j2 = 0;
        }
        this.A08 = j2;
        this.A0D = C0HM.A00().toString();
        this.A05 = c0jo.now();
        this.A07 = motionEvent.getEventTime();
    }

    public final ArrayList A00() {
        List list = this.A0E;
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C129205si) it.next()).A09);
        }
        return arrayList;
    }
}
