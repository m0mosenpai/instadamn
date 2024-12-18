package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GpQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38097GpQ extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC65702y7 A03;
    public final AbstractC42425IqS A04;
    public final JPS A05;
    public final InterfaceC43406JFw A06;
    public final JIG A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C38097GpQ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC65702y7 interfaceC65702y7, AbstractC42425IqS abstractC42425IqS, JPS jps, InterfaceC43406JFw interfaceC43406JFw, JIG jig, boolean z, boolean z2) {
        AbstractC25229BEm.A1I(jig, 4, userSession);
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A04 = abstractC42425IqS;
        this.A07 = jig;
        this.A06 = interfaceC43406JFw;
        this.A02 = userSession;
        this.A03 = interfaceC65702y7;
        this.A05 = jps;
        this.A09 = z;
        this.A0A = z2;
        this.A08 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0154, code lost:
    
        if (r1 == 0) goto L51;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r32, X.C3OO r33) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38097GpQ.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C127935qM.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        C0YR[] c0yrArr = C38164GqV.A0B;
        return new C38164GqV(C50802Vb.A02(layoutInflater, viewGroup, R.layout.layout_grid_item_clips));
    }
}
