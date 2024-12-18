package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;

/* renamed from: X.W5v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70131W5v {
    public final UserSession A00;
    public final C68980VfI A01;

    public C70131W5v(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C68980VfI(userSession, interfaceC60442pS);
    }

    public final View A01(Context context, ViewGroup viewGroup) {
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(context), viewGroup, R.layout.tombstone_ad_break_persistent, false);
        Integer num = C05F.A0C;
        String string = context.getString(2131975663);
        C14360o3.A0A(string);
        A0C.setTag(new C69433VnI(A0C, num, string, null));
        return A0C;
    }

    public final View A02(Context context, ViewGroup viewGroup) {
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(context), viewGroup, R.layout.tombstone_ad_break_redesign, false);
        UserSession userSession = this.A00;
        Integer num = C05F.A01;
        int i = 2131975655;
        if (C18U.A06(C06090Tz.A05, userSession, 36325416051029049L)) {
            i = 2131975654;
        }
        String string = context.getString(i);
        C14360o3.A0A(string);
        A0C.setTag(new C69433VnI(A0C, num, string, context.getString(2131975656)));
        return A0C;
    }

    public final View A03(Context context, ViewGroup viewGroup) {
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(context), viewGroup, R.layout.tombstone_ad_break, false);
        UserSession userSession = this.A00;
        Integer num = C05F.A00;
        int i = 2131975652;
        if (C18U.A06(C06090Tz.A05, userSession, 36325416051029049L)) {
            i = 2131975654;
        }
        String string = context.getString(i);
        C14360o3.A0A(string);
        A0C.setTag(new C69433VnI(A0C, num, string, context.getString(2131975657)));
        return A0C;
    }

    public final void A04(C51760Mtj c51760Mtj, InterfaceC11380iw interfaceC11380iw, C69433VnI c69433VnI) {
        C38321qM c38321qM;
        long j;
        String str;
        String str2;
        Long A0k;
        AbstractC167007dF.A1D(c69433VnI, 0, interfaceC11380iw);
        c69433VnI.A01.setVisibility(0);
        C0fQ.A00(new WNR(6, interfaceC11380iw, this, c69433VnI, c51760Mtj), c69433VnI.A02);
        IgTextView igTextView = c69433VnI.A03;
        if (igTextView != null) {
            C0fQ.A00(new WNR(7, interfaceC11380iw, this, c69433VnI, c51760Mtj), igTextView);
        }
        IgdsButton igdsButton = c69433VnI.A06;
        if (igdsButton != null) {
            C0fQ.A00(new WNR(8, interfaceC11380iw, this, c69433VnI, c51760Mtj), igdsButton);
        }
        IgTextView igTextView2 = c69433VnI.A04;
        if (igTextView2 != null) {
            igTextView2.setText(c69433VnI.A08);
        }
        IgTextView igTextView3 = c69433VnI.A05;
        if (igTextView3 != null) {
            igTextView3.setText(c69433VnI.A09);
        }
        if (c51760Mtj != null && (c38321qM = (C38321qM) c51760Mtj.A01) != null && !C14360o3.A0K(c69433VnI.A00, c38321qM.getId())) {
            C68980VfI c68980VfI = this.A01;
            Integer num = c69433VnI.A07;
            long j2 = ((C75113Zb) c51760Mtj.A02).A0c;
            C14360o3.A0B(num, 1);
            UserSession userSession = c68980VfI.A00;
            InterfaceC60442pS interfaceC60442pS = c68980VfI.A01;
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_delayed_skip_tombstone_impression");
            if (A00.isSampled()) {
                C11520jB A012 = AbstractC82703mY.A03(userSession, c38321qM, interfaceC60442pS, "instagram_delayed_skip_tombstone_impression").A01();
                String A07 = AbstractC41071vF.A07(userSession, c38321qM);
                if (A07 != null && (A0k = AbstractC003100w.A0k(10, A07)) != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                AbstractC37301Gc2.A0z(A00, j);
                A00.AAP("tracking_token", AbstractC128985sJ.A07(userSession, c38321qM, interfaceC60442pS));
                A00.AAP("m_pk", AbstractC128985sJ.A09(c38321qM));
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    str = A2E.getId();
                } else {
                    str = null;
                }
                A00.AAP("a_pk", str);
                A00.AAP("carousel_media_id", (String) A012.A01(C5I8.A10));
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        str2 = "persistent";
                    } else {
                        str2 = "redesigned";
                    }
                } else {
                    str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                }
                A00.AAP("tombstone_type", str2);
                A00.A9K(AbstractC111324zv.A00(443), Long.valueOf(j2));
                A00.A8R(EnumC72429XdZ.A02, "page_type");
                A00.Cht();
            }
            c69433VnI.A00 = c38321qM.getId();
        }
    }

    public static final void A00(C70131W5v c70131W5v, C38321qM c38321qM, Integer num, Integer num2) {
        long j;
        String str;
        String str2;
        String str3;
        Long A0k;
        if (c38321qM != null) {
            C68980VfI c68980VfI = c70131W5v.A01;
            C14360o3.A0B(num, 1);
            UserSession userSession = c68980VfI.A00;
            InterfaceC60442pS interfaceC60442pS = c68980VfI.A01;
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_delayed_skip_tombstone_click");
            if (A00.isSampled()) {
                C11520jB A012 = AbstractC82703mY.A03(userSession, c38321qM, interfaceC60442pS, "instagram_delayed_skip_tombstone_click").A01();
                String A07 = AbstractC41071vF.A07(userSession, c38321qM);
                if (A07 != null && (A0k = AbstractC003100w.A0k(10, A07)) != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                AbstractC37301Gc2.A0z(A00, j);
                A00.AAP("tracking_token", AbstractC128985sJ.A07(userSession, c38321qM, interfaceC60442pS));
                A00.AAP("m_pk", AbstractC128985sJ.A09(c38321qM));
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    str = A2E.getId();
                } else {
                    str = null;
                }
                A00.AAP("a_pk", str);
                A00.AAP("carousel_media_id", (String) A012.A01(C5I8.A10));
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        str2 = "persistent";
                    } else {
                        str2 = "redesigned";
                    }
                } else {
                    str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                }
                A00.AAP("tombstone_type", str2);
                if (num2.intValue() != 0) {
                    str3 = "learn_more";
                } else {
                    str3 = "dismiss";
                }
                A00.AAP("click_type", str3);
                A00.A8R(EnumC72429XdZ.A02, "page_type");
                A00.Cht();
            }
        }
    }
}
