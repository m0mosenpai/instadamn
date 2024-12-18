package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EXe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32604EXe extends AbstractC66412zI {
    public final Context A00;
    public final C8SB A01;
    public final UserSession A02;
    public final C57112jm A03;
    public final InterfaceC1569372x A04;
    public final Integer A05;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32077E8b c32077E8b = (C32077E8b) interfaceC66482zP;
        E30 e30 = (E30) c3oo;
        AbstractC167017dG.A1N(c32077E8b, e30);
        Context context = this.A00;
        UserSession userSession = this.A02;
        Integer num = this.A05;
        F8N.A00(context, userSession, this.A03, this.A04, e30, c32077E8b, num);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E30(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.subinterest_round_pill, false), this.A01);
    }

    public C32604EXe(Context context, C8SB c8sb, UserSession userSession, C57112jm c57112jm, InterfaceC1569372x interfaceC1569372x, Integer num) {
        this.A02 = userSession;
        this.A00 = context;
        this.A05 = num;
        this.A04 = interfaceC1569372x;
        this.A01 = c8sb;
        this.A03 = c57112jm;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32077E8b.class;
    }
}
