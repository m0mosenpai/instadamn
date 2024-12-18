package X;

import android.graphics.Color;
import android.graphics.Typeface;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import java.util.List;

/* renamed from: X.BnF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26494BnF extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C75113Zb A01;
    public final InterfaceC30968DjP A02;
    public final InterfaceC30988Djn A03;
    public final C37644Ghd A04;
    public final UserSession A05;
    public final Boolean A06;
    public final boolean A07;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean z;
        ClipsShoppingCTABarIntf clipsShoppingCTABarIntf;
        int A09;
        float f;
        Integer Azv;
        String str;
        C2XE ArD;
        CSL csl;
        String dominantColor;
        C14360o3.A0B(c76223bS, 0);
        UserSession userSession = this.A05;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36323040933587837L) && !this.A00.CdW()) {
            z = true;
            if (AbstractC166997dE.A1Z(this.A06, false)) {
                return new C2WH(null, null, null, null, null, null, false);
            }
        } else {
            z = false;
        }
        C120985dq c120985dq = this.A00;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            clipsShoppingCTABarIntf = AbstractC37667Gi0.A00(c38321qM);
        } else {
            clipsShoppingCTABarIntf = null;
        }
        EnumC76913cd enumC76913cd = EnumC76913cd.GLOBAL;
        int i = 0;
        if (z) {
            i = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
        }
        EnumC76913cd enumC76913cd2 = AbstractC51432Xq.A04;
        C89803zM c89803zM = new C89803zM(i);
        C89813zN A00 = AbstractC51432Xq.A00(enumC76913cd, "trans_key_dwell_cta");
        InterfaceC79483gv interfaceC79483gv = AbstractC79463gt.A04;
        InterfaceC79483gv interfaceC79483gv2 = AbstractC79463gt.A01;
        InterfaceC79483gv interfaceC79483gv3 = AbstractC79463gt.A03;
        A00.A06(interfaceC79483gv, interfaceC79483gv2, interfaceC79483gv3);
        float A02 = AbstractC25230BEn.A02(A00, AbstractC79463gt.A00);
        A00.A02 = c89803zM;
        C89813zN A002 = AbstractC51432Xq.A00(enumC76913cd, "trans_key_dwell_cta");
        A002.A06(interfaceC79483gv, interfaceC79483gv2, interfaceC79483gv3);
        A002.A03(AbstractC79463gt.A05);
        AbstractC89903zW.A00(c76223bS, AbstractC25234BEr.A09(c76223bS.A05.A0C, c89803zM, A002, A00, 10));
        if (clipsShoppingCTABarIntf != null && (dominantColor = clipsShoppingCTABarIntf.getDominantColor()) != null) {
            A09 = Color.parseColor(dominantColor);
        } else {
            A09 = AbstractC25228BEl.A09(c76223bS, R.color.badge_color);
        }
        if (z) {
            f = 2.0f;
        } else if (clipsShoppingCTABarIntf != null && (Azv = clipsShoppingCTABarIntf.Azv()) != null) {
            f = Azv.intValue();
        } else {
            f = 4.0f;
        }
        C37644Ghd c37644Ghd = this.A04;
        C29902DGq A01 = C29902DGq.A01(this, 49);
        InterfaceC30988Djn interfaceC30988Djn = this.A03;
        AbstractC77363dM.A00(c76223bS);
        if (clipsShoppingCTABarIntf != null) {
            str = clipsShoppingCTABarIntf.getTitle();
        } else {
            str = null;
        }
        C51682Yq c51682Yq = null;
        if (clipsShoppingCTABarIntf != null) {
            List BhF = clipsShoppingCTABarIntf.BhF();
            if (BhF != null && BhF.size() > 1) {
                String A0F = AbstractC77623dm.A0F(c76223bS, 2131969282);
                String A0D = AnonymousClass001.A0D(AbstractC77623dm.A0F(c76223bS, 2131969281), ' ');
                ArD = c76223bS.ArD();
                csl = new CSL(A0F, A0D, AbstractC25232BEp.A02(ArD.A0C, c76223bS), 1);
            } else {
                String subtitle = clipsShoppingCTABarIntf.getSubtitle();
                if (subtitle != null && subtitle.length() != 0) {
                    String subtitle2 = clipsShoppingCTABarIntf.getSubtitle();
                    String subtitle3 = clipsShoppingCTABarIntf.getSubtitle();
                    ArD = c76223bS.ArD();
                    csl = new CSL(subtitle2, subtitle3, AbstractC25232BEp.A03(ArD.A0C, c76223bS, R.attr.igds_color_secondary_text_on_media), 0);
                }
            }
            C75933ay c75933ay = C51722Yv.A02;
            EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
            Integer num = C05F.A00;
            C51722Yv A003 = C9CV.A00(null, num, enumC77683ds, 3);
            Integer num2 = C05F.A0C;
            C51722Yv A004 = C9CU.A00(AbstractC25230BEn.A0d(A003, num2, A02, 1), C05F.A0u, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_edit_text_inset_bottom_material));
            String str2 = csl.A02;
            if (str2 != null) {
                A004 = C9CV.A00(A004, C05F.A0N, str2, 0);
            }
            String str3 = csl.A03;
            int i2 = csl.A00;
            long A05 = AbstractC77623dm.A05(c76223bS);
            int i3 = csl.A01;
            Typeface typeface = Typeface.DEFAULT;
            long A0D2 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(ArD, null, str3, 0);
            AbstractC25233BEq.A19(c76223bS, A0a, i2, A05);
            A0a.A0S(i3);
            AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D2);
            A0a.A0X(num2);
            AbstractC25234BEr.A1E(A0a, num, 0, true);
            AbstractC25234BEr.A17(A004, A0a, false);
            c51682Yq = A0a.A0A();
        }
        return AbstractC28341CeT.A00(c51682Yq, c76223bS, interfaceC30988Djn, c120985dq, c37644Ghd, userSession, str, A01, f, A09, true, false, this.A07);
    }

    public C26494BnF(InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C75113Zb c75113Zb, InterfaceC30968DjP interfaceC30968DjP, Boolean bool, boolean z) {
        AbstractC167017dG.A1R(c37644Ghd, c75113Zb);
        AbstractC167017dG.A1T(interfaceC30968DjP, userSession);
        this.A00 = c120985dq;
        this.A04 = c37644Ghd;
        this.A01 = c75113Zb;
        this.A03 = interfaceC30988Djn;
        this.A02 = interfaceC30968DjP;
        this.A05 = userSession;
        this.A07 = z;
        this.A06 = bool;
    }
}
