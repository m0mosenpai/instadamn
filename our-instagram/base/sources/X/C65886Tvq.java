package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Tvq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65886Tvq {
    public final XNX A00;
    public final C18920wW A01;
    public final String A02;

    public C65886Tvq(XNX xnx, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = xnx;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A02 = AbstractC25231BEo.A0p();
    }

    public final void A03(UserSession userSession, C38321qM c38321qM, Long l, String str, String str2) {
        long j;
        Long A0k;
        C14360o3.A0B(userSession, 4);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "faqs_sticker_icebreaker_click");
        if (A00.isSampled()) {
            long j2 = 0;
            if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            AbstractC37301Gc2.A0z(A00, j);
            if (l != null) {
                j2 = l.longValue();
            }
            A00.A9K("page_id", Long.valueOf(j2));
            A00.AAP(AbstractC111324zv.A00(186), A00(userSession, c38321qM));
            A02(A00, this, AbstractC37307Gc9.A00(), this.A02, str2);
        }
    }

    public final void A06(Long l, String str, String str2, String str3, long j) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "on_feed_messages_send_button_click");
        if (A00.isSampled()) {
            AbstractC37301Gc2.A0z(A00, Long.parseLong(str));
            A00.A9K("page_id", Long.valueOf(j));
            A00.A9K("position", l);
            A00.AAP("icebreaker_message_key", str2);
            A02(A00, this, AbstractC37307Gc9.A00(), this.A02, str3);
        }
    }

    public final void A08(String str, String str2, String str3, long j, long j2) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "icebreaker_click");
        if (A00.isSampled()) {
            AbstractC37301Gc2.A0z(A00, Long.parseLong(str));
            A00.A9K("page_id", Long.valueOf(j));
            A00.A9K("position", Long.valueOf(j2));
            A00.AAP(AbstractC37307Gc9.A00(), this.A02);
            A02(A00, this, "icebreaker_message_key", str2, str3);
        }
    }

    public final void A04(UserSession userSession, C38321qM c38321qM, Long l, String str, String str2) {
        long j;
        Long A0k;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "faqs_sticker_send_button_click");
        if (A00.isSampled()) {
            long j2 = 0;
            if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            AbstractC37301Gc2.A0z(A00, j);
            if (l != null) {
                j2 = l.longValue();
            }
            A00.A9K("page_id", Long.valueOf(j2));
            A00.AAP(AbstractC111324zv.A00(186), A00(userSession, c38321qM));
            A02(A00, this, AbstractC37307Gc9.A00(), this.A02, str2);
        }
    }

    public final void A05(Long l, String str, String str2) {
        long j;
        Long A0k;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "faqs_sticker_impression");
        if (A00.isSampled()) {
            long j2 = 0;
            if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            AbstractC37301Gc2.A0z(A00, j);
            if (l != null) {
                j2 = l.longValue();
            }
            A00.A9K("page_id", Long.valueOf(j2));
            A02(A00, this, AbstractC37307Gc9.A00(), this.A02, str2);
        }
    }

    public final void A07(String str, long j, String str2) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "custom_message_click");
        if (A00.isSampled()) {
            A01(A00, this, str, j);
            A00.AAP("message_destination", str2);
            A00.Cht();
        }
    }

    public static final String A00(UserSession userSession, C38321qM c38321qM) {
        String A06 = AbstractC41071vF.A06(userSession, c38321qM);
        if (A06 == null) {
            if (c38321qM != null) {
                return c38321qM.A0C.getOrganicTrackingToken();
            }
            return null;
        }
        return A06;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C65886Tvq c65886Tvq, String str, long j) {
        interfaceC02590Ai.A9K("ad_id", Long.valueOf(Long.parseLong(str)));
        interfaceC02590Ai.A9K("page_id", Long.valueOf(j));
        interfaceC02590Ai.AAP(AbstractC37307Gc9.A00(), c65886Tvq.A02);
        interfaceC02590Ai.A8R(c65886Tvq.A00, AbstractC111324zv.A00(247));
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C65886Tvq c65886Tvq, String str, String str2, String str3) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.A8R(c65886Tvq.A00, AbstractC111324zv.A00(247));
        interfaceC02590Ai.AAP("message_destination", str3);
        interfaceC02590Ai.Cht();
    }
}
