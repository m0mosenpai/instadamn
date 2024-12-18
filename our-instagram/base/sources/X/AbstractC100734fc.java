package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC100734fc {
    public static final String A01(List list) {
        Long l;
        String str;
        if (list.isEmpty()) {
            return "empty";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        C2ZV c2zv = null;
        String str2 = null;
        while (it.hasNext()) {
            C2ZV c2zv2 = (C2ZV) it.next();
            if (c2zv != null) {
                l = Long.valueOf(c2zv.A03.A00);
            } else {
                l = null;
            }
            String A03 = c2zv2.A03(l);
            List A0R = AbstractC001900j.A0R(A03, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
            if (str2 != null) {
                List A0R2 = AbstractC001900j.A0R(str2, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                if (A0R.size() >= 2 && A0R2.size() >= 2) {
                    if (C14360o3.A0K(AbstractC001800i.A0c(A0R, 1), AbstractC001800i.A0c(A0R2, 1))) {
                        str = AnonymousClass001.A0R((String) A0R.get(0), ", same above");
                    } else if (C14360o3.A0K(A0R.get(1), A0R2.get(1))) {
                        str = AnonymousClass001.A0g((String) A0R.get(0), ", same action, ", AbstractC001800i.A0P(", ", "", "", AbstractC001800i.A0c(A0R, 2), null));
                    }
                    arrayList.add(str);
                    str2 = A03;
                    c2zv = c2zv2;
                }
            }
            str = A03;
            arrayList.add(str);
            str2 = A03;
            c2zv = c2zv2;
        }
        return AbstractC001800i.A0P("\n", "", "", arrayList, null);
    }

    public static final String A00(List list) {
        int i;
        String obj;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C2ZX) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            C2ZX c2zx = (C2ZX) obj3;
            if (!c2zx.A02 && c2zx.A00 != null) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list) {
            if (obj4 instanceof C51782Zb) {
                arrayList3.add(obj4);
            }
        }
        if (!arrayList2.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i2 = 0;
                if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((C2ZX) it.next()).A01 && (i2 = i2 + 1) < 0) {
                            break;
                        }
                    }
                    if (i2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append('(');
                        sb3.append(i2);
                        sb3.append(" failed)");
                        obj = sb3.toString();
                        sb2.append(AnonymousClass001.A05(size, "showed ", " Images", obj));
                    }
                }
                obj = "";
                sb2.append(AnonymousClass001.A05(size, "showed ", " Images", obj));
            }
            String obj5 = sb2.toString();
            C14360o3.A07(obj5);
            sb.append(obj5);
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        if (!arrayList3.isEmpty()) {
            String str = "videos";
            StringBuilder sb4 = new StringBuilder();
            if (!arrayList3.isEmpty()) {
                if ((arrayList3 instanceof Collection) && arrayList3.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = arrayList3.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((C51782Zb) it2.next()).A01 && (i = i + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                int size2 = arrayList3.size() - i;
                if (i > 0) {
                    if (i == 1) {
                        str = MediaStreamTrack.VIDEO_TRACK_KIND;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("played ");
                    sb5.append(i);
                    sb5.append(' ');
                    sb5.append(str);
                    sb5.append(',');
                    sb4.append(sb5.toString());
                }
                if (size2 > 0) {
                    sb4.append(AnonymousClass001.A03(size2, " videos are loading,"));
                }
            }
            if (sb4.length() > 0) {
                sb4.deleteCharAt(sb4.length() - 1);
            }
            String obj6 = sb4.toString();
            C14360o3.A07(obj6);
            sb.append(obj6);
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        String obj7 = sb.toString();
        C14360o3.A07(obj7);
        return obj7;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[LOOP:4: B:46:0x0112->B:48:0x0118, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.json.JsonArray A02(java.util.List r16) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC100734fc.A02(java.util.List):kotlinx.serialization.json.JsonArray");
    }
}
