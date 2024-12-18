package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31741fH extends AbstractC31611f4 {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1fI
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31741fH c31741fH = (C31741fH) obj;
            anonymousClass182.A0d();
            if (c31741fH.A01 != null) {
                anonymousClass182.A0r("seen_marker");
                C45949KVa c45949KVa = c31741fH.A01;
                anonymousClass182.A0d();
                AbstractC81023jW.A00(anonymousClass182, c45949KVa);
                anonymousClass182.A0a();
            }
            anonymousClass182.A0T("is_shh_mode_message", c31741fH.A03);
            anonymousClass182.A0T("is_ae", c31741fH.A02);
            EnumC159397Cz enumC159397Cz = c31741fH.A00;
            if (enumC159397Cz != null) {
                anonymousClass182.A0Q("send_mode", enumC159397Cz.A00);
            }
            AbstractC43669JTd.A00(anonymousClass182, c31741fH);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46945KpQ.parseFromJson(c16l);
        }
    };
    public EnumC159397Cz A00;
    public C45949KVa A01;

    @Deprecated
    public boolean A02;
    public boolean A03;

    @Override // X.C1OW
    public final String A02() {
        return "send_voice_item_seen_marker";
    }

    @Override // X.AbstractC31611f4
    public final /* bridge */ /* synthetic */ AbstractC81003jU A03() {
        return this.A01;
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return new DirectThreadKey(this.A01.A04);
    }
}
