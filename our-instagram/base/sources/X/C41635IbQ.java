package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IbQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41635IbQ {
    public InterfaceC56362iU A00;
    public User A01;
    public JGW A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;
    public final Context A07;
    public final C42261Inl A08;
    public final InterfaceC11380iw A09;
    public final C1563970j A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public C41635IbQ(Context context, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JGW jgw, C1563970j c1563970j, String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(str3, 3);
        this.A05 = str;
        this.A0C = str2;
        this.A06 = str4;
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A0A = c1563970j;
        this.A02 = jgw;
        this.A0D = z;
        this.A07 = context;
        this.A09 = interfaceC11380iw;
        this.A0B = str5;
        this.A08 = new C42261Inl(this, 2);
    }

    public final void A02(InterfaceC56362iU interfaceC56362iU) {
        long j;
        String str;
        this.A00 = interfaceC56362iU;
        interfaceC56362iU.EkS(true);
        this.A01 = AnonymousClass189.A00(this.A04).A02(this.A05);
        A00(this);
        C1563970j c1563970j = this.A0A;
        if (c1563970j != null) {
            String str2 = this.A06;
            UserSession userSession = c1563970j.A09;
            IFY ify = new IFY(c1563970j, str2);
            String str3 = c1563970j.A0G;
            C14360o3.A0B(userSession, 0);
            String str4 = "all_merchants";
            String str5 = str3;
            if (str3 == null) {
                str5 = "all_merchants";
            }
            if (str5.equals("all_merchants")) {
                j = C18U.A01(C06090Tz.A06, userSession, 36594620305770292L) / 60;
            } else {
                j = 10;
            }
            HashMap hashMap = IBM.A00;
            Number number = (Number) hashMap.get(str5);
            if (number != null) {
                if (TimeUnit.MILLISECONDS.toMinutes(AbstractC37300Gc1.A00(number.longValue())) <= j) {
                    return;
                }
            }
            if (str3 != null) {
                str4 = str3;
            }
            hashMap.put(str4, AbstractC31173DnH.A0g());
            if (str3 != null) {
                str = AnonymousClass001.A0g("commerce/merchants/", str3, "/tooltip/");
            } else {
                str = "commerce/shop_tab/cart/tooltip/";
            }
            C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
            A0M.A0B(str);
            C1ON A0e = AbstractC25227BEk.A0e(A0M, HAC.class, ISJ.class);
            C39030HGg.A00(A0e, ify, 16);
            C1GJ.A03(A0e);
        }
    }

    public static final void A00(C41635IbQ c41635IbQ) {
        InterfaceC56362iU interfaceC56362iU = c41635IbQ.A00;
        if (interfaceC56362iU != null) {
            Context context = c41635IbQ.A07;
            InterfaceC11380iw interfaceC11380iw = c41635IbQ.A09;
            User user = c41635IbQ.A01;
            JGW jgw = c41635IbQ.A02;
            boolean z = c41635IbQ.A0D;
            String str = c41635IbQ.A0C;
            String str2 = c41635IbQ.A0B;
            if (user == null) {
                if (str == null) {
                    str = "";
                }
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
                if (!z) {
                    interfaceC56362iU.EaW(A0H, str2);
                    return;
                }
                CircularImageView circularImageView = new CircularImageView(context, null, 0);
                AbstractC31172DnG.A1B(context, circularImageView, AbstractC53242c7.A0H(context, R.attr.igds_color_stroke));
                interfaceC56362iU.EaX(A0H, circularImageView, str2);
                return;
            }
            SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(user.getUsername());
            if (user.isVerified()) {
                C85963sQ.A08(context, A0H2, true);
            }
            if (!z) {
                if (str2 == null) {
                    str2 = user.A03.getStorefrontAttributionUsername();
                }
                interfaceC56362iU.EaW(A0H2, str2);
            } else {
                CircularImageView circularImageView2 = new CircularImageView(context, null, 0);
                circularImageView2.A0H(1, AbstractC167007dF.A09(context, R.attr.igds_color_stroke));
                circularImageView2.A02 = true;
                AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView2, user);
                AbstractC166997dE.A18(context, circularImageView2, 2131970234);
                if (str2 == null) {
                    str2 = user.A03.getStorefrontAttributionUsername();
                }
                interfaceC56362iU.EaX(A0H2, circularImageView2, str2);
            }
            interfaceC56362iU.Efw(ViewOnClickListenerC38053Gog.A02(jgw, user, 8));
        }
    }

    public final void A01() {
        C1563970j c1563970j = this.A0A;
        if (c1563970j != null) {
            c1563970j.onDestroy();
        }
        AbstractC25651Mw.A00(this.A04).A02(this.A08, C70073Cr.class);
    }
}
