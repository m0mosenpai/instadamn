package X;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MiL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51116MiL extends AbstractC155316yK {
    public static final C51090Mhp A04 = new C51090Mhp(2);
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C51620MrD A02;
    public final C54841OMk A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A00;
        EnumC53189Nfl enumC53189Nfl = EnumC53189Nfl.values()[i];
        AbstractC167007dF.A1D(userSession, 0, enumC53189Nfl);
        switch (enumC53189Nfl.ordinal()) {
            case 0:
                return new NOQ(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_short_answer_question, false), userSession);
            case 1:
            case 3:
            case 4:
                return new NOO(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_multiple_choice_question, false), userSession);
            case 2:
                return new NOL(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_slider, false), userSession);
            case 5:
                return new NOP(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_viewholder_customer_info, false), userSession);
            case 6:
                return new NOM(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_store_locator, false), userSession);
            case 7:
                return new NOR(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_date_time_question, false), userSession);
            case 8:
                return new AbstractC51367MmS(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_loading, false), userSession);
            case 9:
                return new NON(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_disqualified_lead, false), userSession);
            case 10:
                return new AbstractC51367MmS(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_single_screen_privacy_policy, false), userSession);
            case 11:
                return new NOK(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lead_gen_view_holder_error, false), userSession);
            default:
                throw B4Z.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0572, code lost:
    
        if (r10 == false) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0368  */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.NO5, X.NNz] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.NO5, X.NNy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0Zx, X.Mno] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r29, int r30) {
        /*
            Method dump skipped, instructions count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51116MiL.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        AbstractC51367MmS abstractC51367MmS = (AbstractC51367MmS) c3oo;
        C14360o3.A0B(abstractC51367MmS, 0);
        abstractC51367MmS.A02();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51116MiL(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C51620MrD c51620MrD, C54841OMk c54841OMk) {
        super(A04);
        AbstractC167017dG.A1Q(userSession, interfaceC60442pS);
        this.A00 = userSession;
        this.A03 = c54841OMk;
        this.A01 = interfaceC60442pS;
        this.A02 = c51620MrD;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(1647839108);
        int ordinal = ((C51654Mrl) getItem(i)).A03.ordinal();
        C0f9.A0A(1423493045, A03);
        return ordinal;
    }

    @Override // X.AbstractC155316yK
    public final void onCurrentListChanged(List list, List list2) {
        EnumC53189Nfl enumC53189Nfl;
        AbstractC167017dG.A1N(list, list2);
        AbstractC52562NNi abstractC52562NNi = this.A03.A00;
        ViewPager2 viewPager2 = abstractC52562NNi.A00;
        if (viewPager2 != null) {
            int i = viewPager2.A00;
            C51654Mrl c51654Mrl = (C51654Mrl) AbstractC001800i.A0O(list, i);
            EnumC53189Nfl enumC53189Nfl2 = null;
            if (c51654Mrl != null) {
                enumC53189Nfl = c51654Mrl.A03;
            } else {
                enumC53189Nfl = null;
            }
            C51654Mrl c51654Mrl2 = (C51654Mrl) AbstractC001800i.A0O(list2, i);
            if (c51654Mrl2 != null) {
                enumC53189Nfl2 = c51654Mrl2.A03;
            }
            EnumC53189Nfl enumC53189Nfl3 = EnumC53189Nfl.A07;
            if (enumC53189Nfl == enumC53189Nfl3 && enumC53189Nfl2 != enumC53189Nfl3) {
                MSW.A0d(abstractC52562NNi).A02(i);
            }
        }
    }
}
