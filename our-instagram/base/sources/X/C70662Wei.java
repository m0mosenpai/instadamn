package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wei, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70662Wei implements XCR {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC018607g A01;
    public final /* synthetic */ XCQ A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ boolean A04;

    public C70662Wei(Context context, AbstractC018607g abstractC018607g, XCQ xcq, UserSession userSession, boolean z) {
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A03 = userSession;
        this.A04 = z;
        this.A02 = xcq;
    }

    @Override // X.XCR
    public final void DFf() {
        this.A02.Dwe();
    }

    @Override // X.XCR
    public final void DqL(boolean z, boolean z2) {
        if (!z && !z2) {
            this.A02.Dwe();
            return;
        }
        C70187WFq.A02(this.A00, this.A01, this.A02, this.A03, this.A04);
    }
}
