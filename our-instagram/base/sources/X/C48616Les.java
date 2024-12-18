package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Les, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48616Les implements InterfaceC50447MPb {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C8Y3 A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public C48616Les(Context context, UserSession userSession, C8Y3 c8y3, List list, boolean z) {
        this.A04 = z;
        this.A00 = context;
        this.A03 = list;
        this.A01 = userSession;
        this.A02 = c8y3;
    }

    @Override // X.InterfaceC50447MPb
    public final void DqF(List list) {
        if (this.A04) {
            Context context = this.A00;
            List list2 = this.A03;
            UserSession userSession = this.A01;
            C48617Let c48617Let = new C48617Let(this.A02, list);
            C121275eQ c121275eQ = new C121275eQ(new M85(context, userSession, list2, true), 468);
            c121275eQ.A00 = new C45684KJv(c48617Let);
            C1GJ.A03(c121275eQ);
            return;
        }
        C11T.A02(new M3Q(this.A02, list));
    }

    @Override // X.InterfaceC50447MPb
    public final void onFailure(Exception exc) {
        C11T.A02(new M3P(this.A02, exc));
    }
}
