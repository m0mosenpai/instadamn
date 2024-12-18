package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30141cU extends AbstractC29011ae implements InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1cV
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30141cU c30141cU = (C30141cU) obj;
            anonymousClass182.A0d();
            if (c30141cU.A00 != null) {
                anonymousClass182.A0r("clip");
                IQG.A00(anonymousClass182, c30141cU.A00);
            }
            String str = c30141cU.A01;
            if (str != null) {
                anonymousClass182.A0S("text", str);
            }
            String str2 = c30141cU.A02;
            if (str2 != null) {
                anonymousClass182.A0S("clipsSpinId", str2);
            }
            String str3 = c30141cU.A03;
            if (str3 != null) {
                anonymousClass182.A0S("social_context_share_type", str3);
            }
            anonymousClass182.A0T("is_x_transport_forward", c30141cU.A04);
            anonymousClass182.A0T("should_skip_genai_eval", c30141cU.A05);
            AbstractC47856LCb.A00(anonymousClass182, c30141cU);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F61.parseFromJson(c16l);
        }
    };
    public C1575375n A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.75n, java.lang.Object] */
    public C30141cU(SocialContextType socialContextType, JTa jTa, C38321qM c38321qM, DirectThreadKey directThreadKey, Long l, String str, String str2, long j, boolean z, boolean z2) {
        super(jTa, directThreadKey, l, j);
        this.A04 = false;
        this.A05 = false;
        ?? obj = new Object();
        obj.A01 = c38321qM;
        obj.A03 = null;
        this.A00 = obj;
        this.A01 = str;
        String str3 = null;
        if (socialContextType != null) {
            int ordinal = socialContextType.ordinal();
            if (ordinal != 9) {
                if (ordinal != 7) {
                    if (ordinal != 1) {
                        if (ordinal == 11) {
                            str3 = "REEL_EXTERNAL_SHARE";
                        }
                    } else {
                        str3 = "BLEND";
                    }
                } else {
                    str3 = "FOLLOWED_BY";
                }
            } else {
                str3 = "LIKED_BY";
            }
        }
        this.A03 = str3;
        this.A04 = z;
        this.A02 = str2;
        this.A05 = z2;
    }

    @Override // X.C1OW
    public final String A02() {
        String str = this.A03;
        if (str != null && str.equals("LIKED_BY")) {
            return "send_social_context_reply_text";
        }
        return "send_clips_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0W;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A1r;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A00 = C47842LBj.A00().A00(new C47308KvJ(false), C2EY.A1r, this.A00);
        return new C29481bP(new C206409Bx(A00), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return Collections.singletonList(AbstractC46893Koa.A00().A00(C2EY.A0W, this.A00));
    }

    public C30141cU() {
        this.A04 = false;
        this.A05 = false;
    }
}
