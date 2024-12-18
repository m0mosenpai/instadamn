package X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1bP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29481bP extends AbstractC29011ae implements InterfaceC29491bQ, InterfaceC29501bR {
    public static final C1OZ A07 = new C1OZ() { // from class: X.1bU
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29481bP c29481bP = (C29481bP) obj;
            anonymousClass182.A0d();
            if (c29481bP.A00 != null) {
                anonymousClass182.A0r("link");
                AbstractC1122154p.A00(c29481bP.A00, anonymousClass182);
            }
            String str = c29481bP.A04;
            if (str != null) {
                anonymousClass182.A0S("after_post_action", str);
            }
            if (c29481bP.A02 != null) {
                anonymousClass182.A0r("replied_to_message");
                AbstractC43642JSa.A01(anonymousClass182, c29481bP.A02);
            }
            if (c29481bP.A01 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c29481bP.A01);
            }
            if (c29481bP.A03 != null) {
                anonymousClass182.A0r("private_reply_info");
                AbstractC47855LCa.A00(anonymousClass182, c29481bP.A03);
            }
            anonymousClass182.A0T("is_channel_invite_link", c29481bP.A05);
            anonymousClass182.A0T("is_x_transport_forward", c29481bP.A06);
            AbstractC47856LCb.A00(anonymousClass182, c29481bP);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46964Kpj.parseFromJson(c16l);
        }
    };
    public C206409Bx A00;

    @Deprecated
    public DirectForwardingParams A01;
    public AnonymousClass442 A02;
    public C47588Kzy A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public C29481bP(C206409Bx c206409Bx, AnonymousClass442 anonymousClass442, JTa jTa, C47588Kzy c47588Kzy, DirectThreadKey directThreadKey, Long l, String str, long j, boolean z, boolean z2) {
        super(jTa, directThreadKey, l, j);
        this.A00 = c206409Bx;
        this.A04 = str;
        this.A02 = anonymousClass442;
        this.A03 = c47588Kzy;
        this.A05 = z;
        this.A06 = z2;
    }

    @Override // X.C1OW
    public final String A02() {
        return "send_link_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        if (this.A00.A01 == null) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A19;
    }

    @Override // X.InterfaceC29511bS
    public final Object BSj() {
        String str = this.A00.A01;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC29511bS
    public final C2EY BSm() {
        return C2EY.A1i;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A1u;
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return Collections.emptyList();
    }

    public C29481bP() {
        this.A06 = false;
    }
}
