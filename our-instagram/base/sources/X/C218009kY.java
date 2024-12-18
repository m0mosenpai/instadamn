package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218009kY extends ACt {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final View A06;
    public final AbstractC59962oe A07;
    public final UserSession A08;
    public final C88Y A09;
    public final C214879fP A0A;
    public final InterfaceC1810081c A0B;
    public final AlB A0C;
    public final C202438xN A0D;

    /* JADX WARN: Type inference failed for: r1v3, types: [X.9fP, X.2oe] */
    public C218009kY(Context context, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C88Y c88y, InterfaceC1810081c interfaceC1810081c, AlB alB) {
        AbstractC167007dF.A1F(userSession, 3, view);
        AbstractC167017dG.A1U(abstractC59962oe, interfaceC1810081c);
        this.A09 = c88y;
        this.A02 = AbstractC166987dD.A1E();
        this.A05 = context;
        this.A08 = userSession;
        this.A06 = view;
        this.A07 = abstractC59962oe;
        this.A0B = interfaceC1810081c;
        int[] iArr = AlB.A03;
        C189138Ze c189138Ze = new C189138Ze(AJu.A00(), null, null, "", "", null, null, "", "", "", "", "", "", 0);
        C44I c44i = c189138Ze.A01;
        User user = c189138Ze.A02;
        String string = context.getString(2131962993);
        C14360o3.A0B(string, 0);
        AbstractC167017dG.A0x();
        this.A0D = new C202438xN(context, userSession, new AlB(new C189138Ze(c44i.F55(), user, null, "", "", "DEFAULT", null, "", "CREATE_MODE_NULLSTATE", "", "", string, "", 0)));
        ?? abstractC59962oe2 = new AbstractC59962oe();
        this.A0A = abstractC59962oe2;
        this.A0C = alB;
        abstractC59962oe2.A00 = new A5K(this);
    }
}
