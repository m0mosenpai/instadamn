package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.receiverfetch.graphql.IGDReceiverFetchFragmentImpl;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.LEi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47914LEi {
    public final UserSession A00;
    public final C44913JuR A01;
    public final C40701ud A02;
    public final ExecutorService A03;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C1346766r c1346766r, IGDReceiverFetchFragmentImpl iGDReceiverFetchFragmentImpl, L94 l94, List list) {
        Integer num;
        if (iGDReceiverFetchFragmentImpl == null) {
            if (l94 != null) {
                l94.A00("failed");
                l94.A01("fetch failed", null);
            }
            C48496Lcn.A01(c1346766r, "Receiver Fetch fields were not in the response");
        } else {
            C4OF c4of = C2JS.Companion;
            ImmutableList A06 = iGDReceiverFetchFragmentImpl.A06(IGDReceiverFetchFragmentImpl.Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 1622975823);
            if (A06.size() != list.size()) {
                if (l94 != null) {
                    l94.A00("failed");
                    l94.A01("fetch failed", null);
                }
                A06.size();
                C48496Lcn.A01(c1346766r, "Number of results returned did not match the number of results fetched for");
            } else {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                int size = A06.size();
                for (int i = 0; i < size; i++) {
                    String A1I = AbstractC25226BEj.A1I(list, i);
                    String A07 = ((C2JS) A06.get(i)).A07("preview_data");
                    if (((TreeJNI) A06.get(i)).hasFieldValue(TraceFieldType.ErrorCode)) {
                        num = AbstractC37304Gc5.A0Z((C2JS) A06.get(i), TraceFieldType.ErrorCode, 1);
                    } else {
                        num = null;
                    }
                    builder.add((Object) new C47622L1h(A1I, num, A07));
                }
                if (l94 != null) {
                    l94.A00("succeeded");
                    l94.A01.markerEnd(20132336, l94.A00, (short) 2);
                }
                c1346766r.A02(new C132955zK(builder.build()));
            }
        }
        c1346766r.A00();
    }

    public C47914LEi(UserSession userSession, C44913JuR c44913JuR, C40701ud c40701ud, ExecutorService executorService) {
        this.A00 = userSession;
        this.A02 = c40701ud;
        this.A03 = executorService;
        this.A01 = c44913JuR;
    }
}
