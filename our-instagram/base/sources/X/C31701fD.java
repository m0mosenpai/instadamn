package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31701fD extends AbstractC31611f4 {
    public static final C1OZ A07 = new C1OZ() { // from class: X.1fE
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31701fD c31701fD = (C31701fD) obj;
            anonymousClass182.A0d();
            if (c31701fD.A01 != null) {
                anonymousClass182.A0r("seen_marker");
                KVZ kvz = c31701fD.A01;
                anonymousClass182.A0d();
                AbstractC81023jW.A00(anonymousClass182, kvz);
                anonymousClass182.A0a();
            }
            anonymousClass182.A0T("is_shh_mode_message", c31701fD.A06);
            anonymousClass182.A0T("is_ae", c31701fD.A04);
            anonymousClass182.A0T("is_ae_open_eb", c31701fD.A05);
            EnumC159397Cz enumC159397Cz = c31701fD.A00;
            if (enumC159397Cz != null) {
                anonymousClass182.A0Q("send_mode", enumC159397Cz.A00);
            }
            String str = c31701fD.A02;
            if (str != null) {
                anonymousClass182.A0S("mime_type", str);
            }
            String str2 = c31701fD.A03;
            if (str2 != null) {
                anonymousClass182.A0S("object_id", str2);
            }
            AbstractC43669JTd.A00(anonymousClass182, c31701fD);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46944KpP.parseFromJson(c16l);
        }
    };
    public EnumC159397Cz A00;
    public KVZ A01;
    public String A02;
    public String A03;

    @Deprecated
    public boolean A04;

    @Deprecated
    public boolean A05;
    public boolean A06;

    @Override // X.C1OW
    public final String A02() {
        return "send_visual_item_seen_marker";
    }

    @Override // X.AbstractC31611f4
    public final /* bridge */ /* synthetic */ AbstractC81003jU A03() {
        return this.A01;
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A01.A04;
        str.getClass();
        return new DirectThreadKey(str);
    }
}
