package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30261ch extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1ci
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C30261ch parseFromJson = AbstractC46972Kpr.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C30261ch c30261ch = (C30261ch) obj;
            anonymousClass182.A0d();
            if (c30261ch.A00 != null) {
                anonymousClass182.A0r("story_share");
                C7QP c7qp = c30261ch.A00;
                if (c7qp != null) {
                    LCC.A00(anonymousClass182, c7qp);
                    AbstractC47856LCb.A00(anonymousClass182, c30261ch);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("storyShare");
            throw C00O.createAndThrow();
        }
    };
    public C7QP A00;
    public final C2EY A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.7QP] */
    public C30261ch(JTa jTa, C38321qM c38321qM, DirectThreadKey directThreadKey, Long l, long j) {
        super(jTa, directThreadKey, l, j);
        C14360o3.A0B(directThreadKey, 2);
        C14360o3.A0B(c38321qM, 3);
        this.A01 = C2EY.A0z;
        ?? obj = new Object();
        obj.A01 = c38321qM;
        obj.A08 = null;
        obj.A02 = null;
        this.A00 = obj;
    }

    @Override // X.C1OW
    public final String A02() {
        return "send_reels_mention_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        C7QP c7qp = this.A00;
        if (c7qp != null) {
            return c7qp;
        }
        C14360o3.A0F("storyShare");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1z;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return this.A01;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        LGP A00 = C47842LBj.A00();
        C2EY c2ey = C2EY.A1g;
        C7QP c7qp = this.A00;
        if (c7qp != null) {
            String A01 = A00.A01(c2ey, c7qp);
            return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
        }
        C14360o3.A0F("storyShare");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        C47939LFp A00 = AbstractC46893Koa.A00();
        C2EY c2ey = C2EY.A1g;
        C7QP c7qp = this.A00;
        if (c7qp != null) {
            List singletonList = Collections.singletonList(A00.A00(c2ey, c7qp));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        C14360o3.A0F("storyShare");
        throw C00O.createAndThrow();
    }

    public C30261ch() {
        this.A01 = C2EY.A0z;
    }
}
