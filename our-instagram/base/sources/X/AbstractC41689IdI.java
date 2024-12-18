package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.IdI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41689IdI {
    public static final Map A01 = AbstractC06930Yk.A02(AbstractC167007dF.A1b(EnumC39562HdY.A04, EnumC39639HiU.REELS, AbstractC166987dD.A1L(EnumC39562HdY.A03, EnumC39639HiU.FEED), AbstractC166987dD.A1L(EnumC39562HdY.A05, EnumC39639HiU.STORIES)));
    public static final Map A00 = AbstractC06930Yk.A02(AbstractC167007dF.A1b(IGAdTransparencyDisclaimerPlacement.A06, EnumC39638HiT.OVERFLOW_MENU, AbstractC166987dD.A1L(IGAdTransparencyDisclaimerPlacement.A04, EnumC39638HiT.ABOVE_IMAGE), AbstractC166987dD.A1L(IGAdTransparencyDisclaimerPlacement.A05, EnumC39638HiT.BELOW_IMAGE)));

    public static final void A00(FragmentActivity fragmentActivity, IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement, UserSession userSession, C38321qM c38321qM, EnumC39562HdY enumC39562HdY, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167007dF.A1D(fragmentActivity, 1, c38321qM);
        C14360o3.A0B(enumC39562HdY, 4);
        C62862tP A04 = C62862tP.A04(fragmentActivity, AbstractC31171DnF.A0D("political_ad_info_sheet"), userSession);
        String A07 = AbstractC41071vF.A07(userSession, c38321qM);
        if (A07 != null) {
            String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            BitSet bitSet = new BitSet(1);
            A1I.put("ad_id", A07);
            bitSet.set(0);
            A1I.put("ad_client_token", A0F);
            A1I.put("disclaimer_placement", iGAdTransparencyDisclaimerPlacement.toString());
            A1I.put("source_surface", enumC39562HdY.A00);
            A1I.put("dismiss_callback", new C66237U5h(new C57560PgY(new MEB(32, iGAdTransparencyDisclaimerPlacement, interfaceC16820sZ, userSession, enumC39562HdY, c38321qM), 37)));
            if (bitSet.nextClearBit(0) >= 1) {
                C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.ig.ad_transparency_disclaimer.info_sheet", null, null, AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E(), 719983200, 0L, true);
                A01(EnumC39635HiQ.DISCLAIMER_LABEL_CLICKED, iGAdTransparencyDisclaimerPlacement, userSession, c38321qM, enumC39562HdY);
                FragmentActivity fragmentActivity2 = A04.A03;
                AnonymousClass637 A002 = VRA.A00(userSession, false);
                WTZ wtz = new WTZ(null, null, null, null, 1.0f, false, false, false, true);
                C14360o3.A0B(A002, 1);
                c63719SsZ.E2V(fragmentActivity2, wtz, A002);
                return;
            }
            throw AbstractC166987dD.A14("Missing required params");
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(EnumC39635HiQ enumC39635HiQ, IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement, UserSession userSession, C38321qM c38321qM, EnumC39562HdY enumC39562HdY) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_ad_transparency_disclaimer_client");
        if (A0f.isSampled()) {
            String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
            A0f.A8R(enumC39635HiQ, "event");
            A0f.A8R((EnumC39639HiU) AbstractC06930Yk.A01(enumC39562HdY, A01), "source_surface");
            A0f.AAP("ad_client_token", A0F);
            A0f.A8R((EnumC39638HiT) AbstractC06930Yk.A01(iGAdTransparencyDisclaimerPlacement, A00), "disclaimer_placement");
            A0f.Cht();
        }
    }
}
