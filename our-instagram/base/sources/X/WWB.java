package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class WWB implements InterfaceC70433Ec {
    public static PandoGraphQLRequest A00(C2JM c2jm, C2JM c2jm2, boolean z, boolean z2) {
        C18C.A0E(z);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(z2), "AiAgentSubscriptionDelete", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C66957Uds.class, true, null, 0, null, "xfb_delete_thread_subscriptions", new ArrayList());
    }
}
