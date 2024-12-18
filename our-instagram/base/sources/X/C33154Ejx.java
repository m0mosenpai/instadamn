package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Ejx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33154Ejx extends GFg {
    public final Context A00;
    public final AbstractC018607g A01;
    public final UserSession A02;
    public final InterfaceC169327h6 A03;
    public final View A04;
    public final IgdsInlineSearchBox A05;
    public final EQ8 A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33154Ejx(Context context, View view, AbstractC018607g abstractC018607g, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox, InterfaceC169327h6 interfaceC169327h6, EQ8 eq8) {
        super(context, view, abstractC018607g, userSession, igdsInlineSearchBox, eq8, null);
        AbstractC25233BEq.A0w(2, userSession, igdsInlineSearchBox, view);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = igdsInlineSearchBox;
        this.A04 = view;
        this.A01 = abstractC018607g;
        this.A06 = eq8;
        this.A03 = interfaceC169327h6;
    }
}
