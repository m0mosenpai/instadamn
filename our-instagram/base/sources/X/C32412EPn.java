package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32412EPn extends C7E1 implements InterfaceC169507hQ {
    public final ERV A00;
    public final int A01;
    public final UserSession A02;
    public final C31545DtV A03;
    public final ERQ A04;
    public final C31699Dw4 A05;
    public final C34707FQs A06;
    public final String A07;
    public final String A08;

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        C14360o3.A0B(interfaceC169517hR, 0);
        A06();
        List A0m = AbstractC31171DnF.A0m(interfaceC169517hR);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            if (!C2TN.A04(this.A02, A15)) {
                A09(this.A00, A15, Boolean.valueOf(A15.isRestricted()));
            }
        }
        String BjQ = interfaceC169517hR.BjQ();
        if (interfaceC169517hR.isLoading()) {
            C31699Dw4 c31699Dw4 = this.A05;
            String str = this.A07;
            int i = this.A01;
            c31699Dw4.A01 = str;
            c31699Dw4.A00 = i;
            C34707FQs c34707FQs = this.A06;
            c34707FQs.A00 = true;
            A09(this.A04, c31699Dw4, c34707FQs);
        } else if (BjQ != null && BjQ.length() != 0 && A0m.isEmpty()) {
            A08(this.A03, this.A08);
        }
        A07();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FQs] */
    public C32412EPn(Context context, UserSession userSession, GZX gzx, boolean z) {
        AbstractC167017dG.A1P(context, userSession);
        this.A02 = userSession;
        ERV erv = new ERV(gzx, z);
        this.A00 = erv;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A03 = c31545DtV;
        ERQ erq = new ERQ(context, null);
        this.A04 = erq;
        this.A06 = new Object();
        this.A05 = new C31699Dw4();
        this.A08 = AbstractC166997dE.A0p(context, 2131968660);
        this.A07 = AbstractC166997dE.A0p(context, 2131973064);
        this.A01 = context.getColor(R.color.grey_5);
        A0B(erv, c31545DtV, erq);
    }
}
