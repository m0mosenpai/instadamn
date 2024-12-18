package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GFd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36683GFd implements InterfaceC169507hQ {
    public UserSession A00;
    public String A01;
    public Context A02;
    public C5e4 A03;
    public final int A04;
    public final boolean A05;
    public final int A06;
    public final C66362zD A07;
    public final C41951wl A08;
    public final String A09;

    private void A00(List list, List list2, int i, int i2, int i3) {
        UserSession userSession = this.A00;
        C41951wl c41951wl = this.A08;
        boolean A1U = AbstractC167007dF.A1U(list);
        list2.addAll(F3Q.A00(userSession, c41951wl, list, i, i2, -1, i3, A1U, A1U, A1U));
    }

    public C36683GFd(Context context, C5e4 c5e4, C66362zD c66362zD, UserSession userSession, int i, boolean z) {
        this.A07 = c66362zD;
        this.A02 = context;
        this.A00 = userSession;
        this.A03 = c5e4;
        this.A06 = AbstractC31174DnI.A03(context);
        this.A09 = this.A02.getString(2131973064);
        this.A05 = z;
        this.A04 = i <= 0 ? Integer.MAX_VALUE : i;
        this.A08 = C41951wl.A00(this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        if (r13.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    @Override // X.InterfaceC169507hQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DcI(X.InterfaceC169517hR r22) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36683GFd.DcI(X.7hR):void");
    }
}
