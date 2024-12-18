package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public abstract class SQX {
    static {
        C14360o3.A07(C48442Kl.A01("DiagnosticsWrkr"));
    }

    public static final void A00(C2M6 c2m6, C2M9 c2m9, C2M5 c2m5, List list) {
        Integer num;
        String string;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AnonymousClass001.A0g("\n Id \t Class Name\t ", "Job Id", "\t State\t Unique Name\t Tags\t"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C48412Ki c48412Ki = (C48412Ki) it.next();
            C2WT C4j = c2m6.C4j(C2WN.A00(c48412Ki));
            if (C4j != null) {
                num = Integer.valueOf(C4j.A01);
            } else {
                num = null;
            }
            String str = c48412Ki.A0M;
            TreeMap treeMap = C37581ov.A08;
            C37581ov A00 = AbstractC37591ow.A00("SELECT name FROM workname WHERE work_spec_id=?", 1);
            A00.ADp(1, str);
            C1YP c1yp = ((C1120653v) c2m9).A01;
            c1yp.assertNotSuspendingTransaction();
            Cursor query = c1yp.query(A00, (CancellationSignal) null);
            try {
                ArrayList A11 = AbstractC43593JPy.A11(query);
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    A11.add(string);
                }
                query.close();
                A00.A00();
                String A0P = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A11, null);
                String A0P2 = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", c2m5.C55(str), null);
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                A1C2.append('\n');
                A1C2.append(str);
                A1C2.append("\t ");
                A1C2.append(c48412Ki.A0I);
                A1C2.append("\t ");
                A1C2.append(num);
                A1C2.append("\t ");
                AbstractC58320PtC.A1N(c48412Ki.A0E.name(), "\t ", A0P, A1C2);
                A1C2.append("\t ");
                A1C2.append(A0P2);
                A1C.append(MSX.A0l(A1C2, '\t'));
            } catch (Throwable th) {
                query.close();
                A00.A00();
                throw th;
            }
        }
        C14360o3.A07(A1C.toString());
    }
}
