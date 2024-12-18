package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;

/* renamed from: X.Acx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23603Acx implements C1NJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1815783k A02;
    public final /* synthetic */ C23108AGw A03;
    public final /* synthetic */ InteractiveDrawableContainer A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.8FD] */
    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            Context context = this.A00;
            UserSession userSession = this.A01;
            C1815783k c1815783k = this.A02;
            User user = c1815783k.A09;
            if (user == null) {
                user = c1815783k.A0A;
            }
            String str = c1815783k.A0C;
            String A01 = AbstractC202808xy.A01(context, c1815783k);
            Drawable A00 = AbstractC202808xy.A00(context, userSession, c1815783k, this.A05);
            AbstractC167007dF.A1F(user, 3, str);
            C8FY c8fy = new C8FY(context.getResources(), bitmap);
            c8fy.A02(c1815783k.A01 * 0.04f);
            C216259hi c216259hi = new C216259hi(context, c8fy, A00, userSession, c1815783k, user, str, A01);
            C23108AGw c23108AGw = this.A03;
            boolean A1Z = AbstractC166997dE.A1Z(c1815783k.A05.A02(), true);
            C24152Anb c24152Anb = new C24152Anb(c216259hi.A00, null, c1815783k);
            Integer num = C05F.A00;
            ?? obj = new Object();
            obj.A00 = 0.0f;
            obj.A01 = 1.0f;
            obj.A04 = A1Z;
            obj.A02 = c24152Anb;
            obj.A03 = num;
            c23108AGw.A07 = obj;
            this.A04.A0J(c216259hi, new C8FC(c23108AGw), false, false, false);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C23603Acx(Context context, UserSession userSession, C1815783k c1815783k, C23108AGw c23108AGw, InteractiveDrawableContainer interactiveDrawableContainer, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c1815783k;
        this.A05 = str;
        this.A03 = c23108AGw;
        this.A04 = interactiveDrawableContainer;
    }
}
