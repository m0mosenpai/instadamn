package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FOV {
    public C35783FrL A00;
    public InterfaceC169517hR A01;
    public final Context A02;
    public final C66362zD A03;
    public final C61972ry A04;
    public final UserSession A05;
    public final C32324ELs A06;
    public final G2A A07;
    public final G27 A08;
    public final IgdsInlineSearchBox A09;
    public final C169487hO A0A;
    public final Map A0B;
    public final RecyclerView A0C;
    public final InterfaceC11380iw A0D;

    /* JADX WARN: Type inference failed for: r2v6, types: [X.2zJ, java.lang.Object] */
    public FOV(Context context, RecyclerView recyclerView, InterfaceC11380iw interfaceC11380iw, C61972ry c61972ry, UserSession userSession, C32324ELs c32324ELs, IgdsInlineSearchBox igdsInlineSearchBox, Map map) {
        String BjQ;
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A05 = userSession;
        this.A0C = recyclerView;
        this.A0D = interfaceC11380iw;
        this.A04 = c61972ry;
        this.A09 = igdsInlineSearchBox;
        this.A06 = c32324ELs;
        this.A0B = map;
        this.A0A = new C169487hO();
        G2A g2a = new G2A(this);
        this.A07 = g2a;
        this.A08 = new G27();
        C66392zG A00 = C66362zD.A00(context);
        AbstractC31177DnL.A1I(A00, new Object());
        A00.A01(new EXO(context, null));
        A00.A01(new C32606EXg(context, interfaceC11380iw, userSession, g2a));
        C66362zD A0R = AbstractC31173DnH.A0R(A00, new EXD(new C36737GHg()));
        this.A03 = A0R;
        recyclerView.setAdapter(A0R);
        AbstractC31174DnI.A16(context, recyclerView, 1, false);
        Context context2 = this.A02;
        UserSession userSession2 = this.A05;
        InterfaceC169517hR interfaceC169517hR = this.A01;
        this.A00 = new C35783FrL(context2, this.A03, userSession2, this.A08, this.A07, C41951wl.A00(userSession2), this.A0A, (interfaceC169517hR == null || (BjQ = interfaceC169517hR.BjQ()) == null) ? "" : BjQ, false, false, false, true, false, false);
        InterfaceC169357h9 A03 = AbstractC31674Dvf.A03(this.A02, this.A05, this.A04, "raven", "direct_user_search_nullstate", null, 0, 0, false, false);
        this.A01 = A03;
        A03.EYJ(new C36681GFb(this, 0));
        InterfaceC169517hR interfaceC169517hR2 = this.A01;
        if (interfaceC169517hR2 != null) {
            interfaceC169517hR2.Eby("");
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A09;
        igdsInlineSearchBox2.A02 = new C36509G8h(this, 2);
        igdsInlineSearchBox2.A04();
    }
}
