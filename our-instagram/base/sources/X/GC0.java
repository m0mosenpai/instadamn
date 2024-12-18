package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.quickpromotion.model.FilterType;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes6.dex */
public final class GC0 implements C5OV {
    public final int A00;
    public final C55732hE A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        List list;
        C55732hE c55732hE = this.A01;
        String A00 = c55732hE.A00("target_user_ids");
        if (A00 == null || A00.length() == 0) {
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(c55732hE.A00(FilterType.A0T.toString()));
        List A0h = AbstractC31175DnJ.A0h(A00, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        if (!A0h.isEmpty()) {
            ListIterator listIterator = A0h.listIterator(A0h.size());
            while (listIterator.hasPrevious()) {
                if (AbstractC31176DnK.A02(listIterator) != 0) {
                    list = AbstractC31177DnL.A0k(A0h, listIterator);
                    break;
                }
            }
        }
        list = C16930sl.A00;
        if (AbstractC31173DnH.A1b(list, 0).length + (parseBoolean ? 1 : 0) <= this.A00) {
            return true;
        }
        return false;
    }

    public GC0(C55732hE c55732hE, int i) {
        this.A01 = c55732hE;
        this.A00 = i;
    }
}
