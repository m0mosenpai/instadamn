package X;

import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.0v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18180v3 {
    public static final C14460oI A01 = new Object();
    public final C07130Zk A00 = C07130Zk.A00;

    public void A00(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        int i;
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null && (i = abstractRunnableC14200nk.runnableId) != 401 && i != 311 && i != 615 && i != 621) {
            int hashCode = abstractRunnableC14200nk.hashCode();
            c006802i.markerStart(628497193, hashCode);
            MarkerEditor withMarker = c006802i.withMarker(628497193, hashCode);
            withMarker.annotate("taskId", abstractRunnableC14200nk.runnableId);
            withMarker.annotate("priority", abstractRunnableC14200nk.priority);
            withMarker.annotate("taskIdName", AbstractC14450oH.A00(abstractRunnableC14200nk.runnableId));
            withMarker.point("queue_start", C07130Zk.A00());
            withMarker.markerEditingCompleted();
        }
    }

    public void A01(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null && C14460oI.A00(c006802i, abstractRunnableC14200nk)) {
            int hashCode = abstractRunnableC14200nk.hashCode();
            c006802i.withMarker(628497193, hashCode).point("execution_failed", C07130Zk.A00());
            c006802i.markerEnd(628497193, hashCode, (short) 3);
        }
    }

    public void A02(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null && C14460oI.A00(c006802i, abstractRunnableC14200nk)) {
            int hashCode = abstractRunnableC14200nk.hashCode();
            c006802i.withMarker(628497193, hashCode).point("execution_end", C07130Zk.A00());
            c006802i.markerEnd(628497193, hashCode, (short) 467);
        }
    }

    public void A03(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null && C14460oI.A00(c006802i, abstractRunnableC14200nk)) {
            String A00 = C07130Zk.A00();
            MarkerEditor withMarker = c006802i.withMarker(628497193, abstractRunnableC14200nk.hashCode());
            withMarker.annotate("currentMarker", A00);
            withMarker.point("queue_end", A00);
            withMarker.point("execution_start", A00);
            withMarker.markerEditingCompleted();
        }
    }
}
