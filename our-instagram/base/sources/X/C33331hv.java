package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.List;

/* renamed from: X.1hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33331hv implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A06 = C33341hw.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    public C33331hv(UserSession userSession, C2DS c2ds, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3, InterfaceC09390do interfaceC09390do4) {
        C14360o3.A0B(c2ds, 2);
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A04 = interfaceC09390do;
        this.A05 = interfaceC09390do2;
        this.A02 = interfaceC09390do3;
        this.A03 = interfaceC09390do4;
    }

    private final void A00(InterfaceC37261GbE interfaceC37261GbE, C33311ht c33311ht, String str) {
        String str2;
        String str3;
        JTa jTa = ((C1OW) c33311ht).A02;
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = c33311ht.A05;
        if (directThreadKey != null) {
            String str4 = c33311ht.A08;
            if (str4 != null) {
                String A062 = c33311ht.A06();
                String str5 = ((C1OW) c33311ht).A05;
                boolean z = c33311ht.A09;
                boolean z2 = c33311ht.A0A;
                boolean z3 = jTa.A09;
                String str6 = jTa.A04;
                L1W l1w = jTa.A00;
                boolean z4 = jTa.A07;
                AnonymousClass442 anonymousClass442 = c33311ht.A03;
                if (z) {
                    str3 = "animated_avatar_sticker";
                } else {
                    str3 = "static_avatar_sticker";
                }
                C25621Ms c25621Ms = new C25621Ms(userSession);
                c25621Ms.A05();
                c25621Ms.A0B("direct_v2/threads/broadcast/share_avatar_sticker/");
                c25621Ms.A9s("sticker_id", str);
                c25621Ms.A9s("sticker_template", str4);
                c25621Ms.A9s("avatar_sticker_media_type", str3);
                c25621Ms.A0S(C40781ul.class, C55702hA.class);
                if (z2) {
                    c25621Ms.A9s("send_silently", "true");
                }
                AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A062, str5, str6, z3, z4, z2);
                if (anonymousClass442 != null) {
                    c25621Ms.A9s("replied_to_action_source", anonymousClass442.A0Q);
                    c25621Ms.A9s("replied_to_client_context", anonymousClass442.A0R);
                    c25621Ms.A9s("replied_to_item_id", anonymousClass442.A0T);
                    c25621Ms.A9s("replied_to_target_type", anonymousClass442.A0F.A00);
                    c25621Ms.A9s("replied_to_user_id", anonymousClass442.A0U);
                }
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            str2 = "stickerTemplate";
        } else {
            str2 = "threadKey";
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31091eE
    public final /* bridge */ /* synthetic */ void AJE(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47Z c47z) {
        boolean A00;
        String str;
        String str2;
        CommonMediaTransport A03;
        String str3;
        C33311ht c33311ht = (C33311ht) c1ow;
        C14360o3.A0B(c33311ht, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        C7Q4 c7q4 = c33311ht.A04;
        if (c7q4 != null) {
            A00 = c7q4.A0B;
        } else {
            A00 = AbstractC159387Cy.A01(this.A00, c33311ht).A00();
        }
        if (A00) {
            C47586Kzw c47586Kzw = (C47586Kzw) this.A02.getValue();
            C7Q4 c7q42 = c33311ht.A04;
            if (c7q42 != null) {
                str = c7q42.A06;
            } else {
                str = null;
            }
            UserSession userSession = c47586Kzw.A00;
            C47Z A032 = C25A.A00(userSession).A03(str);
            if (A032 != null && (str2 = A032.A2N) != null && (A03 = LLT.A03(str2)) != null) {
                C7Q4 A002 = AbstractC47064KrL.A00(A032);
                C45377K6k A003 = CommonMediaTransport.A00(A03);
                A003.A06("image/webp");
                CommonMediaTransport commonMediaTransport = (CommonMediaTransport) A003.A02();
                C45384K6r c45384K6r = (C45384K6r) AvatarSticker.DEFAULT_INSTANCE.A0I();
                c45384K6r.A06(commonMediaTransport);
                c45384K6r.A09(c33311ht.A09);
                if (AbstractC159387Cy.A01(userSession, c33311ht) == EnumC159397Cz.A05) {
                    String str4 = c33311ht.A07;
                    if (str4 != null) {
                        c45384K6r.A07(str4);
                        String str5 = c33311ht.A08;
                        if (str5 != null) {
                            c45384K6r.A08(str5);
                        } else {
                            str3 = "stickerTemplate";
                        }
                    } else {
                        str3 = "stickerId";
                    }
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                Integer num = c33311ht.A06;
                if (num != null) {
                    int intValue = num.intValue();
                    c45384K6r.A04();
                    AvatarSticker avatarSticker = (AvatarSticker) c45384K6r.A00;
                    avatarSticker.bitField0_ |= 16;
                    avatarSticker.nuxType_ = intValue;
                }
                LGK lgk = LGK.A00;
                C45376K6j A004 = AddMessageContent.A00();
                C45380K6n c45380K6n = (C45380K6n) Media.DEFAULT_INSTANCE.A0I();
                c45380K6n.A06(c45384K6r);
                A004.A06(c45380K6n);
                RYn A02 = A004.A02();
                C14360o3.A07(A02);
                TransportPayload A01 = lgk.A01(userSession, (AddMessageContent) A02, null, null, c33311ht);
                C14360o3.A0A(commonMediaTransport);
                C49240Lpv A012 = LCY.A01(userSession, commonMediaTransport, interfaceC37261GbE, A002);
                C47977LIp c47977LIp = c47586Kzw.A01;
                List C7R = c33311ht.C7R();
                C14360o3.A07(C7R);
                Object A0I = AbstractC001800i.A0I(C7R);
                C14360o3.A07(A0I);
                c47977LIp.A02(A01, A012, c33311ht, (DirectThreadKey) A0I, 4);
                return;
            }
            interfaceC37261GbE.DUq(AbstractC47202Ktb.A00, null);
            return;
        }
        A00(interfaceC37261GbE, c33311ht, String.valueOf(c47z.A2I));
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        boolean A00;
        boolean A002;
        String str2;
        C148286ly c148286ly;
        ImmutableList A02;
        C33311ht c33311ht = (C33311ht) c1ow;
        C14360o3.A0B(c33311ht, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        C47744L6l c47744L6l = (C47744L6l) this.A03.getValue();
        DirectThreadKey directThreadKey = c33311ht.A05;
        if (directThreadKey != null) {
            C7Q4 c7q4 = c33311ht.A04;
            if (c7q4 != null) {
                A00 = c7q4.A0B;
            } else {
                A00 = AbstractC159387Cy.A01(this.A00, c33311ht).A00();
            }
            if (c47744L6l.A00(directThreadKey, A00)) {
                interfaceC37261GbE.DUq(new C114675Fx(EnumC46247KdO.A0C, "12", "na", "Avatar Sticker send is blocked in this thread", false, false), null);
                return;
            }
            C7Q4 c7q42 = c33311ht.A04;
            if (c7q42 != null) {
                A002 = c7q42.A0B;
            } else {
                A002 = AbstractC159387Cy.A01(this.A00, c33311ht).A00();
            }
            if (!A002 && ((c148286ly = c33311ht.A02) == null || (A02 = c148286ly.A02()) == null || A02.isEmpty())) {
                String str3 = c33311ht.A07;
                if (str3 != null) {
                    A00(interfaceC37261GbE, c33311ht, str3);
                    return;
                }
                str = "stickerId";
            } else {
                C7Q4 c7q43 = c33311ht.A04;
                if (c7q43 != null && (str2 = c7q43.A06) != null) {
                    LHD.A00(c19260xA, this.A00, interfaceC37261GbE, c33311ht, this, (DirectThreadKey) c33311ht.C7R().get(0), (PendingMediaStore) this.A04.getValue(), (PendingMediaStoreSerializer) this.A05.getValue(), str2);
                    return;
                } else {
                    interfaceC37261GbE.DUq(C114675Fx.A0Q, null);
                    return;
                }
            }
        } else {
            str = "threadKey";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
