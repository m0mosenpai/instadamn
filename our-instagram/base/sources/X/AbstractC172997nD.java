package X;

import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7nD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC172997nD {
    public static final List A00(String str) {
        ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling;
        C14360o3.A0B(str, 0);
        if (str.equals("")) {
            return C16930sl.A00;
        }
        List A0R = AbstractC001900j.A0R(str, new String[]{"␞"}, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            try {
                aRCapabilityMinVersionModeling = AbstractC120345ca.parseFromJson(C16V.A00((String) it.next()));
            } catch (C90173zy unused) {
                aRCapabilityMinVersionModeling = null;
            }
            if (aRCapabilityMinVersionModeling != null) {
                arrayList.add(aRCapabilityMinVersionModeling);
            }
        }
        return arrayList;
    }

    public static final List A01(String str) {
        AGB agb;
        if (str == null) {
            return null;
        }
        if (str.equals("")) {
            return C16930sl.A00;
        }
        List A0R = AbstractC001900j.A0R(str, new String[]{"␞"}, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            try {
                agb = ADM.parseFromJson(C16V.A00((String) it.next()));
            } catch (C90173zy unused) {
                agb = null;
            }
            if (agb != null) {
                arrayList.add(agb);
            }
        }
        return arrayList;
    }

    public static final List A02(String str) {
        C173027nG c173027nG;
        C14360o3.A0B(str, 0);
        if (str.equals("")) {
            return C16930sl.A00;
        }
        List A0R = AbstractC001900j.A0R(str, new String[]{"␞"}, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            try {
                c173027nG = AbstractC173017nF.parseFromJson(C16V.A00((String) it.next()));
            } catch (C90173zy unused) {
                c173027nG = null;
            }
            if (c173027nG != null) {
                arrayList.add(c173027nG);
            }
        }
        return arrayList;
    }

    public static final List A03(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals("")) {
            return C16930sl.A00;
        }
        return AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
    }

    public static final java.util.Set A04(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals("")) {
            return C16910sj.A00;
        }
        return new HashSet(AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0));
    }
}
