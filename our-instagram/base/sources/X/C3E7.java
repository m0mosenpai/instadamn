package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Map;

/* renamed from: X.3E7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3E7 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C12N A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC70363Du A04;
    public final /* synthetic */ C3E1 A05;
    public final /* synthetic */ PendingMediaStore A06;
    public final /* synthetic */ Map A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3E7(Context context, C12N c12n, UserSession userSession, InterfaceC70363Du interfaceC70363Du, C3E1 c3e1, PendingMediaStore pendingMediaStore, Map map, int i) {
        super(0);
        this.A00 = i;
        this.A01 = context;
        this.A04 = interfaceC70363Du;
        this.A06 = pendingMediaStore;
        this.A05 = c3e1;
        this.A03 = userSession;
        this.A07 = map;
        this.A02 = c12n;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        Context context = this.A01;
        C14360o3.A0A(context);
        InterfaceC70363Du interfaceC70363Du = this.A04;
        PendingMediaStore pendingMediaStore = this.A06;
        C3E1 c3e1 = this.A05;
        return new ConcurrentUploadQueueProcessor(context, this.A02, this.A03, interfaceC70363Du, c3e1, pendingMediaStore, this.A07, i);
    }
}
