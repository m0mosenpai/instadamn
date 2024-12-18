package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class AAB {
    public final AWL A00;
    public final C22973AAr A01;
    public final C22812A4f A02;
    public final AKN A03;
    public final C23088AFw A04;
    public final C22829A4y A05;
    public final C22990ABp A06;
    public final AWI A07;

    /* JADX WARN: Type inference failed for: r6v0, types: [X.83U, java.lang.Object] */
    public AAB(Context context, ViewGroup viewGroup, C150486px c150486px, C23088AFw c23088AFw, C22829A4y c22829A4y, C22990ABp c22990ABp, Integer num, String str, int i) {
        AbstractC167007dF.A1H(viewGroup, 2, c23088AFw);
        this.A06 = c22990ABp;
        this.A05 = c22829A4y;
        this.A04 = c23088AFw;
        AWI awi = new AWI(this);
        this.A07 = awi;
        this.A02 = new C22812A4f();
        this.A00 = new AWL(this);
        this.A01 = new C22973AAr(this);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(A4I.A02, context);
        A1G.put(A4I.A08, str);
        A1G.put(A4I.A0B, viewGroup);
        A1G.put(A4I.A03, awi);
        C224679vs c224679vs = A4I.A0A;
        Integer valueOf = Integer.valueOf(AbstractC167007dF.A1X(num, C05F.A00) ? 1 : 0);
        boolean A1R = AbstractC167007dF.A1R(0, c224679vs, valueOf);
        A1G.put(c224679vs, valueOf);
        C224679vs c224679vs2 = A4I.A00;
        Integer valueOf2 = Integer.valueOf(i);
        C14360o3.A0B(c224679vs2, 0);
        C14360o3.A0B(valueOf2, A1R ? 1 : 0);
        A1G.put(c224679vs2, valueOf2);
        C224679vs c224679vs3 = A4I.A09;
        ?? obj = new Object();
        Context context2 = c22990ABp.A03;
        UserSession userSession = c22990ABp.A06;
        AnonymousClass818 A00 = AbstractC201288vC.A00(context2, obj, null, null, c22990ABp.A04, userSession, 0);
        C14360o3.A0B(c224679vs3, 0);
        C14360o3.A0B(A00, A1R ? 1 : 0);
        A1G.put(c224679vs3, A00);
        C224679vs c224679vs4 = A4I.A05;
        C14360o3.A0B(c224679vs4, 0);
        A1G.put(c224679vs4, c150486px);
        C224679vs c224679vs5 = A4I.A01;
        List A002 = AbstractC224659vq.A00(userSession);
        C14360o3.A0B(c224679vs5, 0);
        A1G.put(c224679vs5, A002);
        HashMap A1G2 = AbstractC166987dD.A1G();
        A1G2.putAll(A1G);
        this.A03 = new AKN(A1G2);
    }
}
