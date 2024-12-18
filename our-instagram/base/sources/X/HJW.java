package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

/* loaded from: classes7.dex */
public final class HJW extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C139366Sr A02;
    public final /* synthetic */ IgShowreelNativeAnimationIntf A03;
    public final /* synthetic */ EnumC140736Yb A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJW(Context context, UserSession userSession, C139366Sr c139366Sr, IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf, EnumC140736Yb enumC140736Yb) {
        super(584, 3, false, false);
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = igShowreelNativeAnimationIntf;
        this.A02 = c139366Sr;
        this.A04 = enumC140736Yb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A01;
        new C37414Gdu(this.A00, userSession, this.A02, this.A03, new C6YZ(), this.A04, 0, 1, -1, -1).run();
    }
}
