package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTK extends AbstractC55206OeJ {
    public O8Q A00;
    public boolean A01;
    public boolean A02;
    public final Activity A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C55177Odh A06;
    public final O5C A07;
    public final PCM A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTK(Activity activity, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55177Odh c55177Odh) {
        super(AbstractC25225BEi.A1D(C51861Mw5.class));
        C14360o3.A0B(c55177Odh, 5);
        this.A03 = activity;
        this.A04 = interfaceC11380iw;
        this.A05 = userSession;
        this.A06 = c55177Odh;
        this.A08 = new PCM(view, new O5B(this));
        A0J(new C51889MwX("", "", 0));
        this.A09 = C1XM.A00(C57446Pei.A00);
        this.A0A = C57543PgH.A01(this, 4);
        this.A07 = new O5C(this);
        this.A0B = C57543PgH.A01(this, 5);
    }
}
