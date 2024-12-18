package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fef, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35138Fef {
    public static final C35138Fef A00 = new Object();

    public static final EnumC33469Er4 A00(String str) {
        if (str.equals("ig_django")) {
            return EnumC33469Er4.IG_DJANGO;
        }
        if (str.equals("ig_advanced_crypto_transport")) {
            return EnumC33469Er4.IG_ADVANCED_CRYPTO_TRANSPORT;
        }
        return null;
    }

    public final void A01(UserSession userSession, Boolean bool, Long l, Long l2, Long l3, Long l4, Long l5, String str) {
        EnumC33469Er4 enumC33469Er4;
        if (l != null && l5 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "direct_disappearing_messages_expired");
            AbstractC31171DnF.A1H(A0f, str);
            if (AbstractC31177DnL.A1b(bool)) {
                enumC33469Er4 = EnumC33469Er4.IG_ADVANCED_CRYPTO_TRANSPORT;
            } else {
                enumC33469Er4 = EnumC33469Er4.IG_DJANGO;
            }
            A0f.A8R(enumC33469Er4, TraceFieldType.TransportType);
            if (l2 != null) {
                long longValue = l2.longValue();
                if (longValue <= l5.longValue() && longValue <= l.longValue()) {
                    A0f.A9K("after_view_lifetime_ms", l4);
                    A0f.Cht();
                }
            }
            if (l.longValue() <= l5.longValue()) {
                A0f.A9K("ephemeral_lifetime_ms", l3);
                if (l4 != null) {
                    A0f.A9K("after_view_lifetime_ms", Long.valueOf(l4.longValue()));
                }
            }
            A0f.Cht();
        }
    }
}
