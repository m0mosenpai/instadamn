package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30221cd extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1ce
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C30221cd parseFromJson = F6G.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C30221cd c30221cd = (C30221cd) obj;
            anonymousClass182.A0d();
            c30221cd.A05();
            anonymousClass182.A0r("direct_media_share");
            FUV.A00(c30221cd.A05(), anonymousClass182);
            AbstractC47856LCb.A00(anonymousClass182, c30221cd);
            anonymousClass182.A0a();
        }
    };
    public C9CL A00;
    public final C2EY A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30221cd(JTa jTa, C38321qM c38321qM, DirectThreadKey directThreadKey, Long l, long j) {
        super(jTa, directThreadKey, l, j);
        C14360o3.A0B(directThreadKey, 2);
        C14360o3.A0B(c38321qM, 3);
        this.A01 = C2EY.A0z;
        this.A00 = new C9CL(c38321qM);
    }

    @Override // X.C1OW
    public final String A02() {
        return "send_media_mention_message";
    }

    @Override // X.AbstractC29011ae
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final C9CL A05() {
        C9CL c9cl = this.A00;
        if (c9cl != null) {
            return c9cl;
        }
        C14360o3.A0F("mediaShare");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1F;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return this.A01;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A1F, A05());
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        List singletonList = Collections.singletonList(AbstractC46893Koa.A00().A00(C2EY.A1F, A05()));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    public C30221cd() {
        this.A01 = C2EY.A0z;
    }
}
