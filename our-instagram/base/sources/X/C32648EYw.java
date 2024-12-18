package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.EYw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32648EYw extends AbstractC66422zJ {
    public final long A00;
    public final long A01;
    public final Context A02;
    public final FG2 A03;
    public final InterfaceC132405yL A04;
    public final boolean A05;
    public final boolean A06;

    public C32648EYw(Context context, FG2 fg2, InterfaceC132405yL interfaceC132405yL, long j, long j2, boolean z, boolean z2) {
        AbstractC167007dF.A1H(context, 1, interfaceC132405yL);
        this.A02 = context;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = fg2;
        this.A04 = interfaceC132405yL;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32623EXx c32623EXx = (C32623EXx) interfaceC66482zP;
        C31931E1l c31931E1l = (C31931E1l) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c32623EXx, c31931E1l);
        List list = c32623EXx.A01;
        int i = c32623EXx.A00;
        C14360o3.A0B(list, A1a ? 1 : 0);
        C2UU c2uu = c31931E1l.A00.A0A;
        C14360o3.A0C(c2uu, "null cannot be cast to non-null type com.instagram.ui.search.recyclerview.DirectInboxSearchPillPromptAdapter");
        C31884Dzq c31884Dzq = (C31884Dzq) c2uu;
        c31884Dzq.A01 = list;
        c31884Dzq.A00 = i;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context context = this.A02;
        boolean z = this.A06;
        boolean z2 = this.A05;
        long j = this.A00;
        long j2 = this.A01;
        FG2 fg2 = this.A03;
        InterfaceC132405yL interfaceC132405yL = this.A04;
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1T(fg2, interfaceC132405yL);
        C51384Mmk c51384Mmk = new C51384Mmk(context, C16930sl.A00, (int) j2, 1000L, j, z2);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), null, R.layout.meta_ai_pill_keyword, false);
        E3A e3a = new E3A(A0D);
        AbstractC13350mL.A00(A0D, new C57751Pje(17, (Object) null, e3a), C36H.A03(C36G.A09, 1));
        e3a.itemView.measure(View.MeasureSpec.makeMeasureSpec(c51384Mmk.getWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), 0);
        AbstractC31174DnI.A1D(c51384Mmk, -1, (int) (e3a.itemView.getMeasuredHeight() * r14 * 1.5f));
        c51384Mmk.setAdapter(new C31884Dzq(context, fg2, interfaceC132405yL, z));
        c51384Mmk.setVisibility(0);
        return new C31931E1l(c51384Mmk);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32623EXx.class;
    }
}
