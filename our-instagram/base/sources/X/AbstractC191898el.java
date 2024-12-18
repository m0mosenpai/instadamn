package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.8el, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191898el {
    public static final String A00() {
        StringBuilder sb = new StringBuilder();
        if (AbstractC25291Lj.A00.EpO()) {
            String lowerCase = AbstractC25291Lj.A00.C73().name().toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            List singletonList = Collections.singletonList(lowerCase);
            C14360o3.A07(singletonList);
            sb.append(AnonymousClass001.A0T(AbstractC001800i.A0P("_", "", "", singletonList, null), "XMDS", '_'));
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final ArrayList A01(InterfaceC16620sF interfaceC16620sF) {
        ArrayList arrayList = new ArrayList();
        if (AbstractC25291Lj.A00.EpO()) {
            String lowerCase = AbstractC25291Lj.A00.C73().name().toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            List singletonList = Collections.singletonList(lowerCase);
            C14360o3.A07(singletonList);
            arrayList.add(interfaceC16620sF.invoke(singletonList, "XMDS"));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
