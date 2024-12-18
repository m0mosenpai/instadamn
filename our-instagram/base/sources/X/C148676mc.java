package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.6mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148676mc {
    public String A00;
    public final EnumC143386dd A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final boolean A04;

    public final void A00() {
        String str = this.A00;
        if (str != null && this.A04) {
            C18920wW c18920wW = this.A02;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "aud_block_impression");
            A00.A8R(this.A01, "qp_position");
            A00.A8R(EnumC33475ErA.NOT_NOW, "button_action");
            A00.AAP(AbstractC50529MSi.A01(), str);
            A00.Cht();
        }
    }

    public final void A01() {
        String str = this.A00;
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.A00 = str;
            if (str == null) {
                return;
            }
        }
        if (this.A04) {
            C18920wW c18920wW = this.A02;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "aud_block_impression");
            A00.A8R(this.A01, "qp_position");
            A00.A8R(EnumC33475ErA.VIEW, "button_action");
            A00.AAP(AbstractC50529MSi.A01(), str);
            A00.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (X.C18U.A06(r2, r5, 36322418163329247L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C148676mc(X.EnumC143386dd r4, com.instagram.common.session.UserSession r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A03 = r5
            r3.A01 = r4
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317990052960010(0x8107050010170a, double:3.030981378075194E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L20
            r0 = 36322418163329247(0x810b0c000228df, double:3.033781732903269E-306)
            boolean r1 = X.C18U.A06(r2, r5, r0)
            r0 = 0
            if (r1 == 0) goto L21
        L20:
            r0 = 1
        L21:
            r3.A04 = r0
            java.lang.String r1 = "aud_block_impression"
            X.0xB r0 = new X.0xB
            r0.<init>(r1)
            X.0wW r0 = X.AbstractC12220kQ.A01(r0, r5)
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148676mc.<init>(X.6dd, com.instagram.common.session.UserSession):void");
    }
}
