package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.WoY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71137WoY implements InterfaceC72018XFg {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C68251VJn A02;
    public final /* synthetic */ C1V4 A03;

    public C71137WoY(Context context, UserSession userSession, C68251VJn c68251VJn, C1V4 c1v4) {
        this.A03 = c1v4;
        this.A02 = c68251VJn;
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC72018XFg
    public final /* bridge */ /* synthetic */ Object DV9(C69427VnC c69427VnC, Object obj, int i) {
        C68251VJn c68251VJn = this.A02;
        C69026Vg2 c69026Vg2 = c68251VJn.A02;
        Context context = this.A00;
        UserSession userSession = this.A01;
        Bitmap bitmap = c69026Vg2.A00;
        boolean z = c69026Vg2.A01;
        AbstractC33774Ew0.A00(context, bitmap, new C67954V3t(14, this, c69427VnC), userSession, c68251VJn.A03, z);
        return null;
    }
}
