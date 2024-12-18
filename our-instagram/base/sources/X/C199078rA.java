package X;

import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.8rA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199078rA {
    public C9C4 A00;
    public final EphemeralMediaToggleView A01;
    public final List A02;

    public final void A00(Integer num) {
        boolean z;
        List<C9C4> list = this.A02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (num == ((C9C4) it.next()).A01) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            for (C9C4 c9c4 : list) {
                if (num == c9c4.A01) {
                    this.A00 = c9c4;
                    this.A01.A00(c9c4);
                    return;
                }
            }
            throw new NoSuchElementException(MSV.A00(1));
        }
        if (!(!list.isEmpty())) {
            return;
        }
        EphemeralMediaToggleView ephemeralMediaToggleView = this.A01;
        C9C4 c9c42 = this.A00;
        if (c9c42 == null) {
            C14360o3.A0F("currentState");
            throw C00O.createAndThrow();
        }
        ephemeralMediaToggleView.A00(c9c42);
    }

    public C199078rA(EphemeralMediaToggleView ephemeralMediaToggleView, List list) {
        this.A02 = list;
        this.A01 = ephemeralMediaToggleView;
        if (!list.isEmpty()) {
            C9C4 c9c4 = (C9C4) list.get(0);
            this.A00 = c9c4;
            if (c9c4 == null) {
                C14360o3.A0F("currentState");
                throw C00O.createAndThrow();
            }
            ephemeralMediaToggleView.A00(c9c4);
        }
    }
}
