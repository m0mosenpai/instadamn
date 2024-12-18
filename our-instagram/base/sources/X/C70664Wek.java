package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wek, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70664Wek implements XCS {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC018607g A01;
    public final /* synthetic */ C68725Vb4 A02;
    public final /* synthetic */ XCQ A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;

    public C70664Wek(Context context, AbstractC018607g abstractC018607g, C68725Vb4 c68725Vb4, XCQ xcq, UserSession userSession, String str) {
        this.A03 = xcq;
        this.A05 = str;
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A04 = userSession;
        this.A02 = c68725Vb4;
    }

    @Override // X.XCS
    public final void DFf() {
        this.A03.Dwe();
    }

    @Override // X.XCS
    public final void DqJ(boolean z) {
        if (z) {
            this.A03.E65(this.A05);
            return;
        }
        C70187WFq.A00(this.A00, this.A01, new C70657Wed(3, this.A02, this.A03), this.A04);
    }
}
