package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U1G extends AbstractC66412zI {
    public final int A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final XLQ A03;
    public final InterfaceC72020XFi A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public U1G(InterfaceC11380iw interfaceC11380iw, UserSession userSession, XLQ xlq, InterfaceC72020XFi interfaceC72020XFi, int i, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = xlq;
        this.A04 = interfaceC72020XFi;
        this.A05 = z;
        this.A07 = z2;
        this.A00 = i;
        this.A06 = C18U.A06(C06090Tz.A05, userSession, 36323350171102393L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r0 != r12) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r23, X.C3OO r24) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1G.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUW.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JQ0.A1M(viewGroup);
        View A00 = C70182WFk.A00(viewGroup.getContext(), viewGroup);
        Boolean valueOf = Boolean.valueOf(this.A05);
        C3OO c3oo = new C3OO(A00);
        if (A00.getTag() instanceof C69652Vst) {
            if (AbstractC166997dE.A1Z(valueOf, true)) {
                A00.setBackgroundDrawable(A00.getContext().getDrawable(R.drawable.bg_elevated_simple_row));
            }
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }
}
