package X;

import android.content.Context;
import com.facebook.rsys.tslog.gen.TslogApi;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N00 extends TslogProxy {
    public TslogApi A00;
    public C54615OAq A01;
    public final Context A02;
    public final UserSession A03;

    @Override // com.facebook.rsys.tslog.gen.TslogProxy
    public final void setApi(TslogApi tslogApi) {
        C14360o3.A0B(tslogApi, 0);
        tslogApi.getEngine(new C52027Mzx(this));
        this.A00 = tslogApi;
    }

    public N00(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
    }
}
