package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1iZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33731iZ extends AbstractC29011ae implements InterfaceC29501bR {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1ia
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33731iZ parseFromJson = AbstractC46949KpU.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33731iZ c33731iZ = (C33731iZ) obj;
            anonymousClass182.A0d();
            c33731iZ.A07();
            anonymousClass182.A0r("note_reply");
            CSD A07 = c33731iZ.A07();
            anonymousClass182.A0d();
            anonymousClass182.A0R("note_id", A07.A00);
            String str = A07.A02;
            if (str != null) {
                anonymousClass182.A0S("note_author_username", str);
                String str2 = A07.A03;
                if (str2 != null) {
                    anonymousClass182.A0S("note_text", str2);
                }
                if (A07.A01 != null) {
                    anonymousClass182.A0r("profile_pic_url");
                    C17Y.A00(anonymousClass182, A07.A01);
                }
                anonymousClass182.A0a();
                c33731iZ.BSj();
                anonymousClass182.A0r("direct_pending_media");
                AbstractC47865LCl.A00(anonymousClass182, c33731iZ.BSj());
                AbstractC47856LCb.A00(anonymousClass182, c33731iZ);
                anonymousClass182.A0a();
                return;
            }
            C14360o3.A0F("noteAuthorUsername");
            throw C00O.createAndThrow();
        }
    };
    public CSD A00;
    public C7Q4 A01;
    public String A02;
    public final C2EY A03;
    public final C2EY A04;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.CSD, java.lang.Object] */
    public C33731iZ(JTa jTa, C7Q4 c7q4, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, Long l, String str, String str2, String str3, long j, long j2) {
        super(jTa, directThreadKey, l, j2);
        this.A04 = C2EY.A0z;
        this.A03 = C2EY.A1C;
        ?? obj = new Object();
        obj.A00 = j;
        obj.A02 = str;
        obj.A03 = str2;
        obj.A01 = extendedImageUrl;
        this.A00 = obj;
        C14360o3.A0B(c7q4, 0);
        this.A01 = c7q4;
        this.A02 = str3;
    }

    @Override // X.C1OW
    public final String A02() {
        return "notes_send_media_response";
    }

    public final CSD A07() {
        CSD csd = this.A00;
        if (csd != null) {
            return csd;
        }
        C14360o3.A0F("noteReply");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29511bS
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final C7Q4 BSj() {
        C7Q4 c7q4 = this.A01;
        if (c7q4 != null) {
            return c7q4;
        }
        C14360o3.A0F("pendingMedia");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29511bS
    public final C2EY BSm() {
        return this.A03;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return this.A04;
    }

    @Override // X.AbstractC29011ae
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    public final List A05() {
        ExtendedImageUrl extendedImageUrl = A07().A01;
        String str = A07().A02;
        if (str != null) {
            List singletonList = Collections.singletonList(AbstractC47996LLi.A0C(extendedImageUrl, str, A07().A03));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        C14360o3.A0F("noteAuthorUsername");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return A05();
    }

    public C33731iZ() {
        this.A04 = C2EY.A0z;
        this.A03 = C2EY.A1C;
    }
}
