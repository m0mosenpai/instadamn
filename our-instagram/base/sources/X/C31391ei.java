package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31391ei extends C1OW implements InterfaceC29171au {
    public static final C1OZ A07 = new C1OZ() { // from class: X.1ej
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31391ei c31391ei = (C31391ei) obj;
            anonymousClass182.A0d();
            if (c31391ei.A02 != null) {
                anonymousClass182.A0r("thread_key");
                AbstractC83623o5.A00(anonymousClass182, c31391ei.A02);
            }
            String str = c31391ei.A03;
            if (str != null) {
                anonymousClass182.A0S("message_id", str);
            }
            if (c31391ei.A01 != null) {
                anonymousClass182.A0r("reaction_mutation");
                C47948LGd c47948LGd = c31391ei.A01;
                anonymousClass182.A0d();
                String str2 = c47948LGd.A09;
                if (str2 != null) {
                    anonymousClass182.A0S("reaction_type", str2);
                }
                String str3 = c47948LGd.A07;
                if (str3 != null) {
                    anonymousClass182.A0S("reaction_status", str3);
                }
                String str4 = c47948LGd.A02;
                if (str4 != null) {
                    anonymousClass182.A0S("item_id", str4);
                }
                String str5 = c47948LGd.A04;
                if (str5 != null) {
                    anonymousClass182.A0S("original_message_client_context", str5);
                }
                String str6 = c47948LGd.A06;
                if (str6 != null) {
                    anonymousClass182.A0S("reaction_client_context", str6);
                }
                String str7 = c47948LGd.A03;
                if (str7 != null) {
                    anonymousClass182.A0S("message_content_type_id", str7);
                }
                String str8 = c47948LGd.A01;
                if (str8 != null) {
                    anonymousClass182.A0S("emoji", str8);
                }
                String str9 = c47948LGd.A08;
                if (str9 != null) {
                    anonymousClass182.A0S("super_react_type", str9);
                }
                String str10 = c47948LGd.A05;
                if (str10 != null) {
                    anonymousClass182.A0S("reaction_action_source", str10);
                }
                if (c47948LGd.A00 != null) {
                    anonymousClass182.A0r("avatar_reaction");
                    LC7.A00(anonymousClass182, c47948LGd.A00);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0T("is_shh_mode_message", c31391ei.A06);
            anonymousClass182.A0T("is_ae", c31391ei.A05);
            anonymousClass182.A0T("is_ae_open_eb", c31391ei.A04);
            EnumC159397Cz enumC159397Cz = c31391ei.A00;
            if (enumC159397Cz != null) {
                anonymousClass182.A0Q("send_mode", enumC159397Cz.A00);
            }
            AbstractC43669JTd.A00(anonymousClass182, c31391ei);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46970Kpp.parseFromJson(c16l);
        }
    };
    public EnumC159397Cz A00;
    public C47948LGd A01;
    public DirectThreadKey A02;
    public String A03;

    @Deprecated
    public boolean A04;

    @Deprecated
    public boolean A05;
    public boolean A06;

    @Override // X.C1OW
    public final String A02() {
        return "send_reaction";
    }

    @Override // X.C1OW
    public final DirectThreadKey A01() {
        return this.A02;
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return this.A02;
    }
}
