package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import java.util.List;

/* loaded from: classes8.dex */
public final class KIE extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC50464MPs A03;
    public final C48742LhA A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36322516949543210L)) {
            inflate = C50802Vb.A02(layoutInflater, viewGroup, R.layout.direct_inbox_row_layout);
        } else {
            inflate = layoutInflater.inflate(R.layout.direct_inbox_row_layout, viewGroup, false);
        }
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        C14360o3.A0B(userSession, 0);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36328332333235667L);
        C14360o3.A0B(inflate, A1R ? 1 : 0);
        return new C43767JXg(inflate, null, A06);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        String A01;
        String A15;
        C48316LZp c48316LZp = (C48316LZp) interfaceC66482zP;
        C43767JXg c43767JXg = (C43767JXg) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c48316LZp, c43767JXg);
        Context context = this.A00;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C48742LhA c48742LhA = this.A04;
        InterfaceC50464MPs interfaceC50464MPs = this.A03;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, A1R ? 1 : 0);
        AbstractC25233BEq.A0x(2, interfaceC11380iw, c48742LhA, interfaceC50464MPs);
        InterfaceC50518MRv interfaceC50518MRv = c48316LZp.A07;
        C3o9 CCb = interfaceC50518MRv.CCb();
        c43767JXg.A06 = CCb;
        ViewGroup viewGroup = c43767JXg.A07;
        viewGroup.setAlpha(c48316LZp.A00);
        viewGroup.setClickable(c48316LZp.A0C);
        String str2 = c48316LZp.A09;
        C83403nh c83403nh = c48316LZp.A06;
        if (c83403nh != null) {
            str = c83403nh.A0h();
        } else {
            str = null;
        }
        List list = c48316LZp.A0B;
        int i = c48316LZp.A01;
        c43767JXg.getBindingAdapterPosition();
        C31446Drq c31446Drq = new C31446Drq(i, str2, str, list);
        boolean z = c48316LZp.A0D;
        if (!z) {
            c43767JXg.A0C.A02();
            C0fQ.A00(new LPM(7, CCb, c48742LhA, interfaceC50518MRv, c31446Drq), viewGroup);
            viewGroup.setOnLongClickListener(new LQJ(c31446Drq, c43767JXg, interfaceC50518MRv, c48316LZp, c48742LhA, CCb));
        } else {
            viewGroup.setOnLongClickListener(null);
            C57012jc c57012jc = c43767JXg.A0C;
            C31228DoB A00 = JS7.A00(c48316LZp.A03, interfaceC50518MRv);
            boolean CX1 = interfaceC50518MRv.CX1();
            interfaceC50518MRv.isPending();
            boolean z2 = interfaceC50518MRv.CCb() instanceof MsysThreadId;
            boolean z3 = true;
            if (!C2E7.A02(AbstractC166997dE.A0Y(userSession))) {
                if (!z2 || C18U.A06(C06090Tz.A05, userSession, 36313153919321907L)) {
                    if (CX1) {
                        z3 = AbstractC31177DnL.A1U(C06090Tz.A06, userSession, 2342153620511916222L);
                    }
                }
                AbstractC46783Kme.A00(viewGroup, c57012jc, interfaceC50464MPs, A00, z3);
            }
            z3 = false;
            AbstractC46783Kme.A00(viewGroup, c57012jc, interfaceC50464MPs, A00, z3);
        }
        IgTextView igTextView = c43767JXg.A0A;
        int A012 = AbstractC31174DnI.A01(AbstractC31173DnH.A06(igTextView, 0));
        igTextView.setTypeface(null);
        igTextView.setTextColor(A012);
        JUM jum = c48316LZp.A03;
        List Bl6 = interfaceC50518MRv.Bl6();
        C31447Drr c31447Drr = c43767JXg.A0O;
        C57012jc c57012jc2 = c43767JXg.A0H;
        JXY.A00(jum, interfaceC11380iw, c57012jc2, c31446Drq, c48742LhA, c31447Drr, c43767JXg.A05, Bl6, z, false);
        JXZ.A01(c43767JXg.A09, c43767JXg.A08, userSession, c48316LZp.A04);
        AbstractC43762JXb.A01(userSession, c43767JXg.A0M, interfaceC50518MRv.Axh());
        String str3 = c48316LZp.A0A;
        if (str3 != null && str3.length() != 0) {
            c57012jc2.A03(0);
            ((TextView) c57012jc2.A01()).setText(str3);
        } else {
            c57012jc2.A02();
        }
        JXa.A00(context, c43767JXg.A01, igTextView, userSession, c43767JXg.A0F, c43767JXg.A03, c43767JXg.A04, c48316LZp.A05);
        AbstractC31448Drs.A00(c43767JXg.A0K, c43767JXg.A0R, c48316LZp.A08);
        c43767JXg.A0E.A02();
        if (!(CCb instanceof DirectThreadKey) && !(CCb instanceof DirectMsysMixedThreadKey)) {
            A01 = String.valueOf(JRE.A03(CCb).A00);
        } else {
            A01 = JRE.A01(CCb).A01();
            C14360o3.A07(A01);
        }
        if (c83403nh != null) {
            c83403nh.A0h();
        }
        c43767JXg.getBindingAdapterPosition();
        C14360o3.A0B(A01, A1R ? 1 : 0);
        int i2 = c31446Drq.A00;
        LLk lLk = c48742LhA.A00;
        if ((interfaceC50518MRv.CCb() instanceof DirectThreadKey) && (A15 = AbstractC31172DnG.A15(interfaceC50518MRv.CCb())) != null && lLk.A16.add(A15)) {
            LEW lew = lLk.A0m;
            String obj = lLk.A02.A01.toString();
            C14360o3.A0B(obj, 2);
            UserSession userSession2 = lew.A01;
            List Bl3 = interfaceC50518MRv.Bl3();
            boolean CdS = interfaceC50518MRv.CdS();
            boolean Cf6 = interfaceC50518MRv.Cf6();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(lew.A00, userSession2, Bl3, A1R ? 1 : 0), "direct_candidates_impression");
            if (AbstractC166987dD.A1b(Bl3)) {
                A0f.A9T("recipient_ids", Bl3);
                if (Bl3.size() == A1R) {
                    A0f.A9K("a_pk", AbstractC25231BEo.A0j(0, AbstractC25226BEj.A1I(Bl3, 0)));
                }
                AbstractC31171DnF.A1F(A0f, A15);
                AbstractC31175DnJ.A0z(A0f, i2);
                A0f.A7v("is_spam", AbstractC31173DnH.A0e(A0f, "selected_filter", obj, CdS));
                A0f.A7v(AbstractC111324zv.A00(2643), Boolean.valueOf(Cf6));
                A0f.Cht();
            }
            if (InterfaceC50518MRv.A00(interfaceC50518MRv) && C28151Xt.A02 != null) {
                C18920wW c18920wW = lLk.A0e;
                String B5E = interfaceC50518MRv.B5E();
                List Bl32 = interfaceC50518MRv.Bl3();
                AbstractC167007dF.A1E(c18920wW, 0, Bl32);
                C75R.A06(c18920wW, null, null, "impression", "restricted_account_thread", B5E, Bl32);
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48316LZp.class;
    }

    public KIE(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC50464MPs interfaceC50464MPs, C48742LhA c48742LhA) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = c48742LhA;
        this.A03 = interfaceC50464MPs;
    }
}
