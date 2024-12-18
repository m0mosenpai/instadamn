package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.P0e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56343P0e implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final InterfaceC58310Pt2 A04;
    public final C52477NJv A05;
    public final C54970OTc A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        String str;
        EnumC124565kK enumC124565kK;
        AbstractC59962oe abstractC59962oe = this.A02;
        String A0p = AbstractC166997dE.A0p(abstractC59962oe.requireContext(), 2131965827);
        SpannableStringBuilder A0B = MSY.A0B(new NY0(this, AbstractC31179DnN.A01(abstractC59962oe)), AbstractC166997dE.A0p(abstractC59962oe.requireContext(), 2131965828), A0p);
        Context requireContext = abstractC59962oe.requireContext();
        int i = 2131965829;
        if (C124575kL.A01(this.A03)) {
            i = 2131965830;
        }
        C52369NFj A01 = OOy.A01(requireContext, AbstractC166997dE.A0b(), A0B, Integer.valueOf(R.drawable.instagram_third_party_gen_ai_pano_outline_24), i);
        this.A00 = A01;
        C52369NFj.A02(A01, this, 13);
        ViewOnClickListenerC55466OkL.A02(A01, 29, this);
        C52477NJv c52477NJv = this.A05;
        UserSession userSession = c52477NJv.A01;
        String str2 = c52477NJv.A03;
        C47Z c47z = c52477NJv.A00;
        if (c47z != null) {
            str = c47z.A3t;
        } else {
            str = null;
        }
        if (c52477NJv.A02.A03() == EnumC53117NeU.A02) {
            enumC124565kK = EnumC124565kK.REEL;
        } else {
            enumC124565kK = EnumC124565kK.POST;
        }
        AbstractC86593tX.A0e(enumC124565kK, (MediaGenAIDetectionMethod) ((C51756Mtf) c52477NJv.A05.getValue()).A00, userSession, null, str2, "ig_gen_ai_self_disclosure_sharesheet_impression", str);
        C52369NFj c52369NFj = this.A00;
        if (c52369NFj == null) {
            C14360o3.A0F("labelGenAIOption");
            throw C00O.createAndThrow();
        }
        return c52369NFj;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        C54970OTc c54970OTc = this.A06;
        C52369NFj c52369NFj = this.A00;
        if (c52369NFj == null) {
            C14360o3.A0F("labelGenAIOption");
            throw C00O.createAndThrow();
        }
        IgSimpleImageView igSimpleImageView = c52369NFj.A0M;
        UserSession userSession = c54970OTc.A01;
        if (igSimpleImageView != null && !c54970OTc.A00) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A4Y;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 221)) {
                c54970OTc.A00 = true;
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A002, A002.A4Y, c0yrArr, 221, true);
                C54970OTc.A00(igSimpleImageView, c54970OTc, null, EnumC58132lV.A02, AbstractC166997dE.A0q(igSimpleImageView.getResources(), 2131971979));
            }
        }
        AbstractC59962oe abstractC59962oe = this.A02;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 39), C07Y.A00(viewLifecycleOwner));
    }

    public C56343P0e(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, C54970OTc c54970OTc, C52477NJv c52477NJv) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, c54970OTc);
        C14360o3.A0B(interfaceC58310Pt2, 5);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A05 = c52477NJv;
        this.A06 = c54970OTc;
        this.A04 = interfaceC58310Pt2;
        this.A01 = C81X.A1I;
    }
}
