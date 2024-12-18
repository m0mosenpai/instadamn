package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.LYs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48294LYs implements InterfaceC23471Cj {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1GL A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ Integer A04;

    public C48294LYs(Context context, UserSession userSession, C1GL c1gl, User user, Integer num) {
        this.A03 = user;
        this.A01 = userSession;
        this.A04 = num;
        this.A00 = context;
        this.A02 = c1gl;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        Object obj = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        if (obj == EnumC172127lh.A05) {
            User user = this.A03;
            Integer num = this.A04;
            Context context = this.A00;
            C1GL c1gl = this.A02;
            C121275eQ c121275eQ = new C121275eQ(new M83(context, user, num), 481);
            C43922JbX.A01(c121275eQ, context, 20);
            c1gl.schedule(c121275eQ);
            return;
        }
        if (obj == EnumC172127lh.A04) {
            WGH.A02((Activity) this.A00, 2131974429);
        } else {
            if (obj != EnumC172127lh.A03) {
                return;
            }
            C9GR.A07(this.A00, 2131968168);
        }
    }
}
