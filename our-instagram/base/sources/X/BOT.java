package X;

import com.facebook.R;

/* loaded from: classes5.dex */
public final class BOT extends AbstractC51572Yf {
    public final C120985dq A00;

    public BOT(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 1);
        this.A00 = c120985dq;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C84793qT c84793qT = (C84793qT) AbstractC77183d4.A00(c76223bS, C29902DGq.A01(c76223bS, 25), new Object[0]);
        C2XE c2xe = c76223bS.A05;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        C75933ay c75933ay = C51722Yv.A02;
        long A0B = AbstractC77623dm.A0B(A0P);
        Integer num = C05F.A0A;
        C51722Yv A00 = C9CU.A00(null, num, 0, A0B);
        C2Z0 A13 = AbstractC25232BEp.A13(A0P);
        int A03 = AbstractC77623dm.A03(A13, R.color.baseline_neutral_80);
        int A0F = AbstractC25231BEo.A0F(A13, R.dimen.ad4ad_button_bottom_margin);
        long A0D = AbstractC77623dm.A0D(A13, R.dimen.album_preview_add_item_margin);
        Integer num2 = C05F.A00;
        C51722Yv A002 = C9CU.A00(null, num2, 0, A0D);
        long A0D2 = AbstractC77623dm.A0D(A13, R.dimen.album_preview_add_item_margin);
        Integer num3 = C05F.A01;
        A13.A00(new C167857ef(C9CU.A00(A002, num3, 0, A0D2), A03, A0F));
        int A02 = A13.BoZ().A02(R.color.baseline_neutral_80);
        int A08 = AbstractC25228BEl.A08(A13, AbstractC77623dm.A08(A13));
        C51722Yv A003 = C9CV.A00(C9CU.A00(AbstractC25233BEq.A0Y(null, A13, num2, R.dimen.ai_agent_embodiment_video_container_size, 0), num3, 0, AbstractC77623dm.A07(A13)), num2, EnumC77683ds.CENTER, 3);
        long A0B2 = AbstractC77623dm.A0B(A13);
        Integer num4 = C05F.A07;
        AbstractC25231BEo.A1A(new C167857ef(C9CU.A00(A003, num4, 0, A0B2), A02, A08), A13, A0P, A00);
        A0P.A00(new C167857ef(C9CU.A00(C9CU.A00(AbstractC25233BEq.A0Y(null, A0P, num2, R.dimen.avatar_sticker_max_height, 0), num3, 0, AbstractC77623dm.A07(A0P)), num, 0, AbstractC77623dm.A0B(A0P)), AbstractC77623dm.A03(A0P, R.color.baseline_neutral_80), AbstractC25228BEl.A08(A0P, AbstractC77623dm.A08(A0P))));
        A0P.A00(new C167857ef(C9CU.A00(AbstractC25233BEq.A0Y(null, A0P, num2, R.dimen.ar_effect_picker_background_height, 0), num3, 0, AbstractC77623dm.A07(A0P)), A0P.BoZ().A02(R.color.baseline_neutral_80), AbstractC25228BEl.A08(A0P, AbstractC77623dm.A08(A0P))));
        C2WF c2wf = new C2WF(null, null, null, A0P.A01, false);
        C51722Yv A004 = C9CV.A00(null, num2, EnumC77683ds.FLEX_END, 3);
        long A0C = AbstractC77623dm.A0C(c76223bS);
        C51722Yv A005 = C9CU.A00(C9CU.A00(A004, num4, 0, A0C), num, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_dialog_padding_top_material));
        return AbstractC25227BEk.A0W(new C167877eh(c2wf, null, c84793qT), AbstractC167007dF.A0P(c2xe), c76223bS, A005);
    }
}
