package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1eS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31231eS extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1eT
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31231eS c31231eS = (C31231eS) obj;
            anonymousClass182.A0d();
            if (c31231eS.A00 != null) {
                anonymousClass182.A0r("status_reply");
                LCE.A00(anonymousClass182, c31231eS.A00);
            }
            String str = c31231eS.A01;
            if (str != null) {
                anonymousClass182.A0S("status_author_id", str);
            }
            AbstractC47856LCb.A00(anonymousClass182, c31231eS);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46976Kpv.parseFromJson(c16l);
        }
    };
    public L93 A00;
    public String A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_status_reply_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1e;
    }

    @Override // X.AbstractC29011ae, X.InterfaceC29021af
    public final List C7R() {
        return Collections.unmodifiableList(((AbstractC29011ae) this).A04);
    }
}
