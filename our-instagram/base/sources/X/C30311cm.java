package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30311cm extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1cn
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C30311cm parseFromJson = AbstractC46959Kpe.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C30311cm c30311cm = (C30311cm) obj;
            anonymousClass182.A0d();
            if (c30311cm.A00 != null) {
                anonymousClass182.A0r(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                L3X l3x = c30311cm.A00;
                if (l3x != null) {
                    LC8.A00(anonymousClass182, l3x);
                    AbstractC47856LCb.A00(anonymousClass182, c30311cm);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("commentData");
            throw C00O.createAndThrow();
        }
    };
    public L3X A00;

    @Override // X.C1OW
    public final String A02() {
        return "send_comment_mention_message";
    }

    @Override // X.AbstractC29011ae
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final List A05() {
        L3X l3x = this.A00;
        if (l3x != null) {
            List singletonList = Collections.singletonList(AbstractC47996LLi.A02(EnumC910243u.SINGLE, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, l3x.A03, null, null, null, null, null, null, null, null, 0, 0, 0, false));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        C14360o3.A0F("commentData");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        L3X l3x = this.A00;
        if (l3x != null) {
            String A0R = AnonymousClass001.A0R("https://www.instagram.com/p/", l3x.A01);
            return new C29481bP(new C206409Bx(A0R), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
        }
        C14360o3.A0F("commentData");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return A05();
    }
}
