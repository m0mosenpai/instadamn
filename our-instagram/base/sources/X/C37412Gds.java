package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

/* renamed from: X.Gds, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37412Gds extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Context A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C139366Sr A06;
    public final /* synthetic */ IgShowreelNativeAnimationIntf A07;
    public final /* synthetic */ InterfaceC140726Ya A08;
    public final /* synthetic */ EnumC140736Yb A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37412Gds(Context context, UserSession userSession, C139366Sr c139366Sr, IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf, InterfaceC140726Ya interfaceC140726Ya, EnumC140736Yb enumC140736Yb, int i, int i2, int i3, int i4) {
        super(584, 3, false, false);
        this.A05 = userSession;
        this.A04 = context;
        this.A07 = igShowreelNativeAnimationIntf;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A06 = c139366Sr;
        this.A08 = interfaceC140726Ya;
        this.A09 = enumC140736Yb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A05;
        new C37414Gdu(this.A04, userSession, this.A06, this.A07, this.A08, this.A09, this.A00, this.A01, this.A02, this.A03).run();
    }
}
