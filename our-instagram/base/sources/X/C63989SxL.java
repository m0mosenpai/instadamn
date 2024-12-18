package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.SxL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63989SxL implements C0LR {
    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0G;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        JSONObject A0q;
        long j;
        String str;
        long j2;
        SOI soi;
        ConcurrentLinkedQueue concurrentLinkedQueue = C63160SeI.A04;
        if (!concurrentLinkedQueue.isEmpty()) {
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            A0q2.put("uptimeMillis", SystemClock.uptimeMillis());
            A0q2.put("currentTimeMillis", System.currentTimeMillis());
            ArrayList A0q3 = AbstractC167017dG.A0q(concurrentLinkedQueue);
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                AbstractC58570Pxo abstractC58570Pxo = (AbstractC58570Pxo) it.next();
                C14360o3.A0A(abstractC58570Pxo);
                if (abstractC58570Pxo instanceof R6Z) {
                    R6Z r6z = (R6Z) abstractC58570Pxo;
                    A0q = AbstractC31171DnF.A0q();
                    Map map = r6z.A03;
                    Iterator A15 = AbstractC166997dE.A15(map);
                    while (A15.hasNext()) {
                        AbstractC50523MSb.A1T(A15, A0q);
                    }
                    A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r6z.A02);
                    A0q.put("thread", ((AbstractC58570Pxo) r6z).A01);
                    A0q.put("renderStateId", ((AbstractC58570Pxo) r6z).A00);
                    A0q.put("timestamp", r6z.A01);
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    str = "duration";
                    Object obj = map.get("duration");
                    if ((obj instanceof SOI) && (soi = (SOI) obj) != null) {
                        j2 = soi.A00;
                    } else {
                        j2 = 0;
                    }
                    j = timeUnit.toMillis(j2);
                } else if (abstractC58570Pxo instanceof C58571Pxp) {
                    C58571Pxp c58571Pxp = (C58571Pxp) abstractC58570Pxo;
                    A0q = AbstractC31171DnF.A0q();
                    Iterator A152 = AbstractC166997dE.A15(c58571Pxp.A03);
                    while (A152.hasNext()) {
                        AbstractC50523MSb.A1T(A152, A0q);
                    }
                    A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c58571Pxp.A02);
                    A0q.put("thread", c58571Pxp.A01);
                    A0q.put("renderStateId", ((AbstractC58570Pxo) c58571Pxp).A00);
                    j = c58571Pxp.A00;
                    str = "timestamp";
                } else {
                    A0q = AbstractC31171DnF.A0q();
                    A0q3.add(A0q);
                }
                A0q.put(str, j);
                A0q3.add(A0q);
            }
            A0q2.put("events", new JSONArray((Collection) A0q3));
            String obj2 = A0q2.toString();
            if (obj2 != null && c024209q != null) {
                c024209q.A03(C0LK.A6j, obj2);
            }
        }
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }
}
