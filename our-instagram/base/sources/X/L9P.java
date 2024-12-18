package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class L9P {
    public final C23031Ai A00;

    public L9P(C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 1);
        this.A00 = c23031Ai;
    }

    public final List A02() {
        try {
            C23031Ai c23031Ai = this.A00;
            String str = (String) AbstractC31171DnF.A0Y(c23031Ai, c23031Ai.A0Q, C23031Ai.A8c, 47);
            if (str != null) {
                List A0R = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                ArrayList A0q = AbstractC167017dG.A0q(A0R);
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A0q);
                }
                return A0q;
            }
            return C16930sl.A00;
        } catch (Exception unused) {
            return C16930sl.A00;
        }
    }

    public final Boolean A00() {
        long currentTimeMillis = System.currentTimeMillis();
        long A0L = AbstractC166987dD.A0L(currentTimeMillis - (currentTimeMillis % 3600000));
        if (A02().isEmpty()) {
            return null;
        }
        List A02 = A02();
        boolean z = true;
        if (!(A02 instanceof Collection) || !A02.isEmpty()) {
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                long A0N = AbstractC166987dD.A0N(it.next());
                if (A0N - (A0N % 3600) == A0L) {
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public final Long A01() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList A0U = AbstractC001800i.A0U(A02());
        C01T.A1C(A0U);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            long A0N = AbstractC166987dD.A0N(it.next());
            if (A0N > AbstractC166987dD.A0L(currentTimeMillis)) {
                return Long.valueOf(A0N);
            }
        }
        return null;
    }
}
