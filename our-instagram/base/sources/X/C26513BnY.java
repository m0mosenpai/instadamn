package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BnY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26513BnY extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC31070DlC A02;
    public final InterfaceC30859DhY A03;
    public final C37616GhB A04;
    public final boolean A05;
    public final int A06;
    public final C51722Yv A07;
    public final UserSession A08;
    public final InterfaceC60442pS A09;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        EnumC27400C7d enumC27400C7d;
        C51722Yv c51722Yv;
        InterfaceC60442pS interfaceC60442pS;
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        int A00 = C76493bt.A00(AbstractC166997dE.A0M(context));
        int i = this.A06;
        if (i > A00 * 0.25f) {
            InterfaceC30859DhY interfaceC30859DhY = this.A03;
            C14360o3.A0B(interfaceC30859DhY, 0);
            if (interfaceC30859DhY instanceof C5L) {
                enumC27400C7d = EnumC27400C7d.A05;
            } else if (interfaceC30859DhY instanceof C5K) {
                enumC27400C7d = EnumC27400C7d.A04;
            } else if (interfaceC30859DhY instanceof D02) {
                enumC27400C7d = EnumC27400C7d.A06;
            } else {
                enumC27400C7d = EnumC27400C7d.A07;
            }
            long A07 = AbstractC77623dm.A07(c76223bS);
            int i2 = enumC27400C7d.A00;
            InterfaceC16620sF interfaceC16620sF = enumC27400C7d.A01;
            C120985dq c120985dq = this.A00;
            String str = (String) interfaceC16620sF.invoke(c120985dq, context);
            if (str != null) {
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv A002 = C9CU.A00(null, C05F.A00, 0, A07);
                Integer num = C05F.A01;
                C51722Yv A003 = C9CV.A00(C9CU.A00(A002, num, 0, A07), C05F.A0D, "clips_more_info_label_glyph_tag", 4);
                Drawable A0N = AbstractC25228BEl.A0N(c76223bS, i2);
                AbstractC25233BEq.A10(A0N, c76223bS, R.color.audio_bar_action_color_enabled);
                BNU bnu = new BNU(A0N, null, A003, false);
                C51722Yv A004 = BPH.A00(c76223bS);
                C9CV A0o = AbstractC25225BEi.A0o(num, AbstractC166997dE.A0b(), 4);
                if (A004 == c75933ay) {
                    A004 = null;
                }
                C51722Yv A0Y = AbstractC25231BEo.A0Y(AbstractC25225BEi.A0h(A004, A0o), DRX.A00(this, 24));
                if ((interfaceC30859DhY instanceof D02) && (interfaceC60442pS = this.A09) != null) {
                    c51722Yv = AbstractC25396BLn.A01(EnumC71343Hv.A06, c75933ay, c120985dq, this.A08, interfaceC60442pS);
                } else {
                    c51722Yv = null;
                }
                C51722Yv A005 = AbstractC25230BEn.A0e(A0Y, C05F.A0Y, DRX.A00(this, 25), null).A00(c51722Yv);
                C51722Yv A006 = this.A07.A00(C9CU.A00(null, C05F.A0N, 0, AbstractC25229BEm.A0K(i)));
                C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
                C2Z0 A11 = AbstractC25232BEp.A11(bnu, A0P.A00);
                AbstractC25230BEn.A1G(BPH.A02(A11, null, str, false), A11, A0P, A005);
                return AbstractC76963ci.A0I(A0P, c76223bS, A006);
            }
        }
        return null;
    }

    public C26513BnY(C51722Yv c51722Yv, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC31070DlC interfaceC31070DlC, InterfaceC30859DhY interfaceC30859DhY, C37616GhB c37616GhB, int i, boolean z) {
        AbstractC25234BEr.A1P(interfaceC30859DhY, interfaceC31070DlC, c37644Ghd);
        C14360o3.A0B(userSession, 5);
        this.A03 = interfaceC30859DhY;
        this.A02 = interfaceC31070DlC;
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A08 = userSession;
        this.A07 = c51722Yv;
        this.A06 = i;
        this.A05 = z;
        this.A04 = c37616GhB;
        this.A09 = interfaceC60442pS;
    }
}
