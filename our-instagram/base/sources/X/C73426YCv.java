package X;

import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Iterator;

/* renamed from: X.YCv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73426YCv implements YNw {
    public final C72742XmE A00;

    @Override // X.YNw
    public final /* bridge */ /* synthetic */ void CuU(YNq yNq, Object obj) {
        String str;
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj;
        if (abstractC72503XfI instanceof XYP) {
            UserFlowLogger userFlowLogger = this.A00.A00;
            long generateNewFlowId = userFlowLogger.generateNewFlowId(866984261);
            userFlowLogger.flowStart(generateNewFlowId, new UserFlowConfig("ZERO_BALANCE_DETECTION", false));
            yNq.APm(new XYY((XYP) abstractC72503XfI, new C72694XlN(generateNewFlowId)));
            return;
        }
        if (abstractC72503XfI instanceof XY6) {
            XY6 xy6 = (XY6) abstractC72503XfI;
            C72742XmE c72742XmE = this.A00;
            C72694XlN c72694XlN = xy6.A01;
            String str2 = xy6.A02;
            C72863XpS c72863XpS = xy6.A00;
            if (c72863XpS != null && !c72863XpS.A00.isEmpty()) {
                PointEditor markPointWithEditor = c72742XmE.A00.markPointWithEditor(c72694XlN.A00, str2);
                Iterator it = c72863XpS.A00().iterator();
                while (it.hasNext()) {
                    C72494Xf7 c72494Xf7 = (C72494Xf7) it.next();
                    Object obj2 = c72494Xf7.A00;
                    if (obj2 != null) {
                        String str3 = (String) obj2;
                        Object obj3 = c72494Xf7.A01;
                        if (obj3 != null) {
                            str = obj3.toString();
                        } else {
                            str = null;
                        }
                        markPointWithEditor.addPointData(str3, str);
                    }
                }
                markPointWithEditor.markerEditingCompleted();
                return;
            }
            c72742XmE.A00.flowMarkPoint(c72694XlN.A00, str2);
            return;
        }
        if (!(abstractC72503XfI instanceof XY7)) {
            return;
        }
        XY7 xy7 = (XY7) abstractC72503XfI;
        boolean z = xy7.A02;
        C72742XmE c72742XmE2 = this.A00;
        C72694XlN c72694XlN2 = xy7.A00;
        if (z) {
            c72742XmE2.A00.flowEndSuccess(c72694XlN2.A00);
        } else {
            c72742XmE2.A00.flowEndFail(c72694XlN2.A00, xy7.A01, null);
        }
    }

    public C73426YCv(C72742XmE c72742XmE) {
        this.A00 = c72742XmE;
    }
}
