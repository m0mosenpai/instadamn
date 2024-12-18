package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.mediaactions.LikeActionView;
import java.lang.ref.WeakReference;
import java.util.EnumMap;

/* renamed from: X.OJv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54801OJv {
    public C57012jc A00;
    public C64842wi A01;
    public C64742wY A02;
    public LikeActionView A03;
    public OEA A04;
    public Integer A05;
    public String A06;
    public WeakReference A07;
    public final Context A08;
    public final AbstractC59962oe A09;
    public final UserSession A0A;
    public final InterfaceC16660sJ A0B;

    public final void A00(Integer num) {
        Context context;
        int i;
        if (this.A05 != C05F.A0Y) {
            this.A05 = num;
            int intValue = num.intValue();
            if (intValue != 4) {
                if (intValue != 5) {
                    if (intValue == 3) {
                        Context context2 = this.A08;
                        C14360o3.A07(AbstractC167007dF.A0f(context2, this.A06, 2131965588));
                        context2.getString(2131965589);
                    }
                    NRG A00 = AbstractC54273Nyt.A00(this.A0A);
                    String A002 = AbstractC54275Nyv.A00(this.A05);
                    String A003 = AbstractC54275Nyv.A00(this.A05);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A00, "ig_user_pay_viewer_payment_bar_updated");
                    OCW ocw = A00.A01;
                    MSW.A1S(A0f, ocw.A02);
                    A0f.AAP("product_type", ocw.A03);
                    AbstractC31171DnF.A1I(A0f, ocw.A01);
                    A0f.AAP(DevServerEntity.COLUMN_DESCRIPTION, A002);
                    A0f.AAP("button_text", A003);
                    A0f.Cht();
                }
                context = this.A08;
                i = 2131965585;
            } else {
                context = this.A08;
                i = 2131965599;
            }
            C14360o3.A07(context.getString(i));
            NRG A004 = AbstractC54273Nyt.A00(this.A0A);
            String A0022 = AbstractC54275Nyv.A00(this.A05);
            String A0032 = AbstractC54275Nyv.A00(this.A05);
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(A004.A00, "ig_user_pay_viewer_payment_bar_updated");
            OCW ocw2 = A004.A01;
            MSW.A1S(A0f2, ocw2.A02);
            A0f2.AAP("product_type", ocw2.A03);
            AbstractC31171DnF.A1I(A0f2, ocw2.A01);
            A0f2.AAP(DevServerEntity.COLUMN_DESCRIPTION, A0022);
            A0f2.AAP("button_text", A0032);
            A0f2.Cht();
        }
    }

    public C54801OJv(Context context, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC43594JPz.A1P(userSession, view);
        this.A09 = abstractC59962oe;
        this.A0A = userSession;
        this.A08 = context;
        this.A0B = interfaceC16660sJ;
        this.A05 = C05F.A00;
        this.A06 = "";
        C27961Xa A00 = AbstractC54912fq.A00();
        EnumMap enumMap = new EnumMap(QPTooltipAnchor.class);
        QPTooltipAnchor qPTooltipAnchor = QPTooltipAnchor.A0o;
        enumMap.put((EnumMap) qPTooltipAnchor, (QPTooltipAnchor) new P7F());
        C64742wY A05 = A00.A05(userSession, enumMap);
        this.A02 = A05;
        C27961Xa A002 = AbstractC54912fq.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0c;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A01(new P73(this, 7), A05);
        this.A01 = AbstractC31175DnJ.A0T(abstractC59962oe, userSession, A0S, A002, quickPromotionSlot);
        abstractC59962oe.registerLifecycleListener(this.A02);
        if (EnumC142806cg.A05 == enumC142806cg) {
            C64742wY c64742wY = this.A02;
            C64842wi c64842wi = this.A01;
            if (c64842wi == null) {
                C14360o3.A0F("quickPromotionDelegate");
                throw C00O.createAndThrow();
            }
            c64742wY.A00(null, qPTooltipAnchor, c64842wi);
        }
    }
}
