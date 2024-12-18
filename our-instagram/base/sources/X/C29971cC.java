package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.ReelType;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29971cC extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A07 = new C1OZ() { // from class: X.1cD
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29971cC c29971cC = (C29971cC) obj;
            anonymousClass182.A0d();
            String str = c29971cC.A02;
            if (str != null) {
                anonymousClass182.A0S("reel_id", str);
            }
            if (c29971cC.A01 != null) {
                anonymousClass182.A0r("story_share");
                LCC.A00(anonymousClass182, c29971cC.A01);
            }
            String str2 = c29971cC.A03;
            if (str2 != null) {
                anonymousClass182.A0S("reel_viewer_module_name", str2);
            }
            anonymousClass182.A0T("is_story_group_reply", c29971cC.A05);
            anonymousClass182.A0T("is_story_group_reaction", c29971cC.A04);
            if (c29971cC.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c29971cC.A00);
            }
            anonymousClass182.A0T("is_x_transport_forward", c29971cC.A06);
            AbstractC47856LCb.A00(anonymousClass182, c29971cC);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46979Kpy.parseFromJson(c16l);
        }
    };

    @Deprecated
    public DirectForwardingParams A00;
    public C7QP A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7QP] */
    public C29971cC(JTa jTa, C38321qM c38321qM, DirectThreadKey directThreadKey, ReelType reelType, Long l, String str, String str2, long j, boolean z) {
        super(jTa, directThreadKey, l, j);
        this.A06 = false;
        this.A02 = str;
        ?? obj = new Object();
        obj.A01 = c38321qM;
        obj.A08 = null;
        obj.A02 = reelType;
        this.A01 = obj;
        this.A03 = str2;
        this.A05 = false;
        this.A04 = false;
        this.A06 = z;
    }

    @Override // X.C1OW
    public final String A02() {
        return "send_story_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A01;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1g;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A22;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A1g, this.A01);
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return Collections.singletonList(AbstractC46893Koa.A00().A00(C2EY.A1g, this.A01));
    }

    public C29971cC() {
        this.A06 = false;
    }
}
