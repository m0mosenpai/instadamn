package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.BnT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26508BnT extends AbstractC51572Yf {
    public final C25547BRj A00;
    public final C2Y0 A01;
    public final C51722Yv A02;
    public final C51722Yv A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final SocialContextBubbleUiState A06;
    public final InterfaceC80043ht A07;
    public final boolean A08;
    public final boolean A09;

    public C26508BnT(C25547BRj c25547BRj, C2Y0 c2y0, C51722Yv c51722Yv, C51722Yv c51722Yv2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, InterfaceC80043ht interfaceC80043ht, boolean z, boolean z2) {
        AbstractC167007dF.A1I(userSession, 6, c2y0);
        this.A02 = c51722Yv;
        this.A04 = interfaceC11380iw;
        this.A00 = c25547BRj;
        this.A06 = socialContextBubbleUiState;
        this.A09 = z;
        this.A05 = userSession;
        this.A07 = interfaceC80043ht;
        this.A01 = c2y0;
        this.A03 = c51722Yv2;
        this.A08 = z2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        C14360o3.A0B(c76223bS, 0);
        boolean z = this.A08;
        int i = R.attr.igds_color_primary_text;
        int i2 = R.attr.igds_color_link;
        int i3 = R.attr.textColorBoldLink;
        if (z) {
            i = R.attr.igds_color_primary_text_on_media;
            i2 = R.attr.igds_color_primary_text_on_media;
            i3 = R.attr.igds_color_primary_text_on_media;
        }
        UserSession userSession = this.A05;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36329586463949218L)) {
            C75933ay c75933ay = C51722Yv.A02;
            C09530e4 A0t = AbstractC25233BEq.A0t(0.0f, 100.0f);
            c51722Yv = c75933ay.A00(C9CV.A00(null, C05F.A00, new C77843eC(new C78043eW(new C29025CrE(A0t), "PivotPercent"), new Object[]{A0t}), 2));
        } else {
            c51722Yv = null;
        }
        C51722Yv c51722Yv2 = this.A02;
        C9CU A0n = AbstractC25225BEi.A0n(C05F.A1I, 0, AbstractC25229BEm.A0G());
        if (c51722Yv2 == C51722Yv.A02) {
            c51722Yv2 = null;
        }
        C51722Yv A00 = AbstractC25230BEn.A0d(AbstractC25225BEi.A0h(c51722Yv2, A0n), C05F.A0N, 100.0f, 0).A00(c51722Yv).A00(this.A03);
        InterfaceC80043ht interfaceC80043ht = this.A07;
        SocialContextBubbleUiState socialContextBubbleUiState = this.A06;
        String str = socialContextBubbleUiState.A08;
        String str2 = str;
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        C51722Yv A002 = A00.A00(interfaceC80043ht.Apk(str3));
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
        C3e8 c3e8 = C3e8.FLEX_START;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C25547BRj c25547BRj = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A04;
        C2XE c2xe = A12.A00;
        Context context = c2xe.A0C;
        A12.A00(new BR2(null, null, c25547BRj, null, null, null, interfaceC11380iw, userSession, null, AbstractC25228BEl.A06(context, A12, R.attr.igds_color_photo_border), 3, 2, false, false, false));
        Integer num = C05F.A00;
        C51722Yv A003 = C9CU.A00(C9CV.A00(null, num, enumC77683ds, 3), C05F.A0u, 0, AbstractC25230BEn.A0K());
        Integer num2 = C05F.A01;
        C51722Yv A004 = AbstractC25230BEn.A0d(A003, num2, 1.0f, 1).A00(interfaceC80043ht.B5a());
        C28359CfJ c28359CfJ = C28359CfJ.A00;
        C14360o3.A07(context);
        SpannableStringBuilder A01 = c28359CfJ.A01(context, this.A01, userSession, socialContextBubbleUiState, interfaceC80043ht, i2, i3);
        int A06 = AbstractC25228BEl.A06(context, A12, i);
        Typeface A0Q = AbstractC25226BEj.A0Q(context, num);
        long A05 = AbstractC77623dm.A05(A12);
        long A08 = AbstractC77623dm.A08(A12);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A01, 0);
        AbstractC25233BEq.A1B(A12, A0a, A06, A05);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(A0Q, A12, A0a, A0D);
        A0a.A0X(num);
        AbstractC25233BEq.A1E(A0a, num2, 1.0f, false);
        A0a.A0M(2);
        A0a.A01.A00 = AbstractC25228BEl.A08(A12, A08);
        A0a.A0c(true);
        A0a.A0Z(false);
        A0a.A0a(false);
        A0a.A0D();
        AbstractC25233BEq.A1A(A12, A004, A0a);
        if (this.A09) {
            if (str2 == null) {
                str2 = "";
            }
            String str4 = socialContextBubbleUiState.A07;
            if (str4 == null) {
                str4 = "";
            }
            A12.A00(new C212089ad(C9CV.A00(null, num, EnumC77683ds.CENTER, 3), str2, str4, new C29642D5f(interfaceC80043ht, 6), socialContextBubbleUiState.A0D));
        }
        return AbstractC76963ci.A0K(A12, c76223bS, A002, enumC77683ds, c3e8);
    }
}
