package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8qJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198688qJ implements InterfaceC198698qK {
    public final ArrayList A00 = new ArrayList();

    @Override // X.InterfaceC198698qK
    public final void FAd(Long l) {
        long longValue;
        float f;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue() / 1000000;
        }
        Iterator it = this.A00.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            AAC aac = (AAC) next;
            TransitionFilter transitionFilter = aac.A05;
            if (aac.A07) {
                long j = aac.A04;
                if (longValue >= j && longValue < aac.A03) {
                    if (aac.A06) {
                        f = 0.5f;
                    } else {
                        f = aac.A01 + ((((float) (longValue - j)) * aac.A02) / aac.A00);
                    }
                    transitionFilter.EgD(f);
                }
            }
            f = 0.0f;
            transitionFilter.EgD(f);
        }
    }
}
