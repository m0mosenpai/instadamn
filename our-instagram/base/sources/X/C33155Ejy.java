package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Ejy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33155Ejy extends GFg {
    public final Context A00;
    public final View A01;
    public final AbstractC018607g A02;
    public final UserSession A03;
    public final IgdsInlineSearchBox A04;
    public final InterfaceC169327h6 A05;
    public final EQ8 A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33155Ejy(Context context, View view, AbstractC018607g abstractC018607g, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox, InterfaceC169327h6 interfaceC169327h6, EQ8 eq8) {
        super(context, view, abstractC018607g, userSession, igdsInlineSearchBox, eq8, null);
        AbstractC25233BEq.A0w(2, userSession, igdsInlineSearchBox, view);
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = igdsInlineSearchBox;
        this.A01 = view;
        this.A02 = abstractC018607g;
        this.A06 = eq8;
        this.A05 = interfaceC169327h6;
    }

    public final void A02() {
        UserSession userSession = this.A03;
        C61972ry c61972ry = new C61972ry(this.A00, this.A02, null);
        InterfaceC169327h6 interfaceC169327h6 = this.A05;
        C14360o3.A0B(userSession, 0);
        boolean A1a = AbstractC31175DnJ.A1a(interfaceC169327h6);
        C169127gl c169127gl = new C169127gl(c61972ry, new AlQ(userSession), new C169337h7(c61972ry, interfaceC169327h6, A1a), false, A1a);
        super.A00 = c169127gl;
        c169127gl.EYJ(this);
    }
}
