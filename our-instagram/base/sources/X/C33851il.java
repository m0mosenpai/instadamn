package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33851il extends AbstractC29011ae implements InterfaceC29501bR {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1im
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33851il parseFromJson = AbstractC46948KpT.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33851il c33851il = (C33851il) obj;
            anonymousClass182.A0d();
            c33851il.A07();
            anonymousClass182.A0r("note_reply");
            L4V A07 = c33851il.A07();
            anonymousClass182.A0d();
            anonymousClass182.A0R("note_igid", A07.A00);
            String str = A07.A02;
            if (str != null) {
                anonymousClass182.A0S("avatar_sticker_id", str);
            }
            String str2 = A07.A04;
            if (str2 != null) {
                anonymousClass182.A0S("avatar_sticker_template", str2);
            }
            String str3 = A07.A03;
            if (str3 != null) {
                anonymousClass182.A0S("avatar_sticker_media_type", str3);
            }
            String str4 = A07.A05;
            if (str4 != null) {
                anonymousClass182.A0S("note_author_username", str4);
            }
            String str5 = A07.A06;
            if (str5 != null) {
                anonymousClass182.A0S("note_text", str5);
            }
            if (A07.A01 != null) {
                anonymousClass182.A0r("profile_pic_url");
                C17Y.A00(anonymousClass182, A07.A01);
            }
            anonymousClass182.A0a();
            if (c33851il.A00 != null) {
                anonymousClass182.A0r("avatar_sticker");
                C148286ly c148286ly = c33851il.A00;
                if (c148286ly != null) {
                    AbstractC201088uq.A00(anonymousClass182, c148286ly);
                    AbstractC47856LCb.A00(anonymousClass182, c33851il);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("avatarSticker");
            throw C00O.createAndThrow();
        }
    };
    public C148286ly A00;
    public L4V A01;
    public String A02;
    public String A03;
    public final C2EY A04;
    public final C2EY A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.L4V, java.lang.Object] */
    public C33851il(C148286ly c148286ly, JTa jTa, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, Long l, String str, String str2, String str3, long j, long j2) {
        super(jTa, directThreadKey, l, j);
        String str4;
        C14360o3.A0B(jTa, 1);
        this.A05 = C2EY.A0z;
        this.A04 = C2EY.A0O;
        this.A00 = c148286ly;
        if (c148286ly.A04() == C05F.A0N) {
            str4 = "animated";
        } else {
            str4 = "static";
        }
        this.A03 = str4;
        String str5 = c148286ly.A0S;
        C14360o3.A07(str5);
        String A0F = AbstractC001900j.A0F("bloks_tappable_avatar_sticker_id_", str5);
        String str6 = c148286ly.A0a;
        C14360o3.A07(str6);
        String str7 = this.A03;
        if (str7 == null) {
            C14360o3.A0F("stickerType");
            throw C00O.createAndThrow();
        }
        ?? obj = new Object();
        obj.A00 = j2;
        obj.A02 = A0F;
        obj.A04 = str6;
        obj.A03 = str7;
        obj.A05 = str;
        obj.A06 = str2;
        obj.A01 = extendedImageUrl;
        this.A01 = obj;
        this.A02 = str3;
    }

    @Override // X.C1OW
    public final String A02() {
        return "notes_send_note_reply_avatar";
    }

    public final L4V A07() {
        L4V l4v = this.A01;
        if (l4v != null) {
            return l4v;
        }
        C14360o3.A0F("noteReply");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29511bS
    public final /* bridge */ /* synthetic */ Object BSj() {
        C148286ly c148286ly = this.A00;
        if (c148286ly != null) {
            return c148286ly;
        }
        C14360o3.A0F("avatarSticker");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29511bS
    public final C2EY BSm() {
        return this.A04;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return this.A05;
    }

    @Override // X.AbstractC29011ae
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final List A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A0C(A07().A01, A07().A05, A07().A06));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return A05();
    }

    public C33851il() {
        this.A05 = C2EY.A0z;
        this.A04 = C2EY.A0O;
    }
}
