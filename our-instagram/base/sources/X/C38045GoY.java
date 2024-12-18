package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.GoY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38045GoY extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Map A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38045GoY(UserSession userSession, Map map) {
        super(332, 3, false, false);
        this.A00 = userSession;
        this.A01 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C82113lX c82113lX = C82103lW.A02;
        C82103lW A00 = C82113lX.A00(this.A00);
        Map map = this.A01;
        map.size();
        C96494Vi c96494Vi = A00.A00;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            LinkedList linkedList = new LinkedList();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                String str = (String) entry.getKey();
                java.util.Set set = (java.util.Set) entry.getValue();
                C14360o3.A0B(set, 0);
                String A0P = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", C96504Vj.A00(set), null);
                ArrayList arrayList = new ArrayList(set);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C17z A0A = AbstractC221915u.A00.A0A(new OutputStreamWriter(byteArrayOutputStream));
                try {
                    A0A.A0d();
                    C16V.A03(A0A, "medias");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C38321qM c38321qM = (C38321qM) it.next();
                        if (c38321qM != null) {
                            C38801rC c38801rC = C38321qM.A0h;
                            C38801rC.A07(A0A, c38321qM);
                        }
                    }
                    A0A.A0Z();
                    A0A.A0a();
                    A0A.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C14360o3.A07(byteArray);
                    linkedList.add(new C97084Xt(str, A0P, byteArray, currentTimeMillis));
                } finally {
                }
            }
            c96494Vi.A06.runInTransaction(new RunnableC38050God(c96494Vi, linkedList, map));
            map.size();
        } catch (Exception e) {
            C0K8.A0F("UserReelMediasRoom", "Failed to store user reel blob", e);
            C0w9.A03("UserReelMediasRoom", AnonymousClass001.A0R("Failed to store user reel blob: ", e.getMessage()));
        }
    }
}
