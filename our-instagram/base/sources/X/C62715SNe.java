package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.SNe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62715SNe {
    public final Object A00;
    public final List A01 = AbstractC166987dD.A1E();

    public final String toString() {
        StringBuilder A0q = AbstractC58318PtA.A0q(100);
        A0q.append(AbstractC31173DnH.A0q(this.A00));
        A0q.append('{');
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0q.append(AbstractC25226BEj.A1I(list, i));
            if (i < size - 1) {
                AbstractC58318PtA.A1S(A0q);
            }
        }
        return AbstractC167027dH.A0R(A0q);
    }

    public /* synthetic */ C62715SNe(Object obj) {
        this.A00 = obj;
    }

    public final void A00(Object obj, String str) {
        this.A01.add(AnonymousClass001.A0g(str, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(obj)));
    }
}
