package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.BlZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26390BlZ extends AbstractC51572Yf {
    public final UserSession A00;
    public final C76893cb A01;
    public final InterfaceC60442pS A02;
    public final FragmentActivity A03;

    public C26390BlZ(FragmentActivity fragmentActivity, UserSession userSession, C76893cb c76893cb, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167007dF.A1F(userSession, 3, interfaceC60442pS);
        this.A01 = c76893cb;
        this.A03 = fragmentActivity;
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C32967Eey c32967Eey;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, new DGY(this, 9));
        C168127f7 c168127f7 = (C168127f7) AbstractC77073ct.A00(c76223bS, C167227db.A00).A03;
        C76893cb c76893cb = this.A01;
        Integer num = c76893cb.A06;
        if (num != null) {
            UserSession userSession = this.A00;
            FragmentActivity fragmentActivity = this.A03;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            InterfaceC75603aR interfaceC75603aR = c76893cb.A05;
            c32967Eey = new C32967Eey(fragmentActivity, interfaceC60442pS, c76893cb.A01, userSession, c76893cb.A02, c76893cb.A03, c76893cb.A04, interfaceC75603aR, num);
        } else {
            c32967Eey = null;
        }
        InterfaceC16620sF A02 = AbstractC85303rL.A02(c76223bS, new C30495Dbe(c32967Eey, 41));
        InterfaceC16620sF A022 = AbstractC85303rL.A02(c76223bS, new DSA(23, c32967Eey, A00));
        InterfaceC16620sF A023 = AbstractC85303rL.A02(c76223bS, new DT0(16, this, c32967Eey, c76223bS, c168127f7));
        InterfaceC16620sF A024 = AbstractC85303rL.A02(c76223bS, new C30495Dbe(c32967Eey, 42));
        C89803zM c89803zM = new C89803zM(200);
        EnumC76913cd enumC76913cd = EnumC76913cd.GLOBAL;
        C89813zN A002 = AbstractC51432Xq.A00(enumC76913cd, "follow_chaining_bound");
        A002.A03(AbstractC79463gt.A01);
        A002.A02 = c89803zM;
        C89813zN A0f = AbstractC25233BEq.A0f(enumC76913cd, "follow_chaining_alpha");
        A0f.A02 = c89803zM;
        AbstractC89903zW.A00(c76223bS, new AbstractC51462Xt(A002, A0f));
        C75933ay c75933ay = C51722Yv.A02;
        C2XE c2xe = c76223bS.A05;
        C51722Yv A0W = AbstractC25231BEo.A0W(c2xe, null, enumC76913cd, "follow_chaining_alpha");
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        int A03 = AbstractC77623dm.A03(A0P, R.color.direct_widget_primary_background);
        Integer num2 = C05F.A00;
        C51722Yv A0D = AbstractC25234BEr.A0D(C9CU.A00(C9CU.A00(C9CV.A00(null, num2, AbstractC25225BEi.A0i(A03), 4), C05F.A0Y, 0, AbstractC77623dm.A0D(A0P, R.dimen.account_group_management_clickable_width)), C05F.A04, 0, AbstractC77623dm.A04(A0P)), AbstractC25227BEk.A0c(AbstractC77623dm.A0A(A0P)), 0, AbstractC77623dm.A0D(A0P, R.dimen.abc_edit_text_inset_top_material));
        C2Z0 A0K = AbstractC25233BEq.A0K(A0P);
        C2XE c2xe2 = A0K.A00;
        C77723dw A032 = C51682Yq.A03(c2xe2, R.style.NetEgoTitle);
        A032.A0W(AbstractC77623dm.A0F(A0K, 2131974883));
        A032.A0D();
        A032.A0M(2);
        Integer num3 = C05F.A01;
        AbstractC77743dy.A00(A032, AbstractC25230BEn.A0d(null, num3, 1.0f, 1));
        AbstractC25227BEk.A1J(A0K, A032);
        C77723dw A033 = C51682Yq.A03(c2xe2, R.style.NetEgoCTA);
        A033.A0W(AbstractC77623dm.A0F(A0K, 2131973168));
        A033.A0D();
        A033.A0M(1);
        AbstractC25231BEo.A1A(AbstractC25227BEk.A0X(AbstractC25231BEo.A0Y(C9CU.A00(null, C05F.A0u, 0, AbstractC77623dm.A07(A0K)), new C50268MHx(22, c32967Eey, this)), A033), A0K, A0P, A0D);
        C70623Ez c70623Ez = new C70623Ez();
        C25906Bd9 A003 = CCM.A00(A0P, AbstractC25225BEi.A0p(AbstractC77623dm.A06(A0P)), AbstractC25225BEi.A0p(AbstractC77623dm.A07(A0P)), AbstractC25225BEi.A0p(AbstractC77623dm.A07(A0P)));
        long A07 = AbstractC77623dm.A07(A0P);
        C51722Yv A0b = AbstractC25233BEq.A0b(AbstractC25233BEq.A0Z(null, num3, 217.0d, 0), num2, 0);
        C2XE c2xe3 = A0P.A00;
        C2V3 c2v3 = c2xe3.A02.A01;
        C2VF c2vf = c2v3.A02;
        boolean z = c2v3.A0W;
        C168887gN c168887gN = new C168887gN();
        int i = 0;
        for (Object obj : (Iterable) A00.A03) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (!(obj instanceof C36480G7e)) {
                if (obj instanceof User) {
                    User user = (User) obj;
                    String id = user.getId();
                    UserSession userSession2 = this.A00;
                    C14360o3.A0A(obj);
                    c168887gN.A00(new C26644Bpf(this.A02, userSession2, user, null, A02, A022, A024, A023, i), id, -1.0f, -1.0f, false);
                } else if (obj instanceof C47O) {
                    C47O c47o = (C47O) obj;
                    c168887gN.A00(new C26644Bpf(this.A02, this.A00, c47o.A03, c47o.A05, A02, A022, A024, A023, i), c47o.A03.getId(), -1.0f, -1.0f, false);
                } else if (obj instanceof FOC) {
                    C14360o3.A0A(obj);
                    FOC foc = (FOC) obj;
                    Integer A004 = FVZ.A00(foc);
                    if (A004 != null && A004.intValue() == 1) {
                        User user2 = foc.A02;
                        if (user2 != null) {
                            c168887gN.A00(new C26644Bpf(this.A02, this.A00, user2, null, A02, A022, A024, A023, i), user2.getId(), -1.0f, -1.0f, false);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                } else {
                    continue;
                }
            }
            i = i2;
        }
        A0P.A00(new C168977gW(c70623Ez, A003, null, null, A0b, null, AbstractC168947gT.A01(c2xe3, c2vf, num2, 0, -1, AbstractC25232BEp.A0n(A0P, A07), false, z), c168887gN, c168127f7, null, null, null, null, null, null, null, null, null, null, null, null, true, false));
        return AbstractC25227BEk.A0V(AbstractC76963ci.A0M(A0P, C9CV.A00(C9CU.A00(null, num3, 0, AbstractC77623dm.A0B(A0P)), num2, AbstractC25225BEi.A0i(A0P.BoZ().A02(R.color.direct_widget_primary_background)), 4)), A0P, c76223bS, A0W);
    }
}
