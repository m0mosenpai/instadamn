package X;

import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.HxZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40491HxZ {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        UserFlowLogger A00;
        String valueOf;
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A002 = c6fw.A00();
        AbstractC25225BEi.A1S(A002);
        String str = (String) A002;
        Map map = (Map) c6fw.A00.get(3);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A0B instanceof UserSession) && A0B != null) {
            A00 = C1QS.A00(A0B);
        } else {
            A00 = AbstractC39723Hjt.A00();
        }
        long generateFlowId = A00.generateFlowId(A0D, A0D2);
        if (map == null) {
            A00.flowMarkPoint(generateFlowId, str);
            return null;
        }
        PointEditor markPointWithEditor = A00.markPointWithEditor(generateFlowId, str);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object value = A1K.getValue();
            if (value instanceof Number) {
                markPointWithEditor.addPointData(AbstractC31172DnG.A17(A1K), AbstractC166987dD.A0H(A1K.getValue()));
            } else {
                boolean z = value instanceof Boolean;
                String A17 = AbstractC31172DnG.A17(A1K);
                Object value2 = A1K.getValue();
                if (z) {
                    markPointWithEditor.addPointData(A17, AbstractC166987dD.A1a(value2));
                } else {
                    if (value2 instanceof Number) {
                        valueOf = value2.toString();
                    } else {
                        valueOf = String.valueOf(value2);
                    }
                    markPointWithEditor.addPointData(A17, valueOf);
                }
            }
        }
        markPointWithEditor.markerEditingCompleted();
        return null;
    }
}
