package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1iJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33571iJ extends AbstractC29011ae implements InterfaceC29511bS, InterfaceC29521bT, InterfaceC29491bQ {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1iK
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33571iJ parseFromJson = AbstractC46951KpW.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33571iJ c33571iJ = (C33571iJ) obj;
            anonymousClass182.A0d();
            c33571iJ.A07();
            anonymousClass182.A0r("note_reply");
            AbstractC47852LBv.A00(anonymousClass182, c33571iJ.A07());
            AbstractC47856LCb.A00(anonymousClass182, c33571iJ);
            anonymousClass182.A0a();
        }
    };
    public C47813L9v A00;
    public String A01;
    public String A02;
    public final C2EY A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.L9v] */
    public C33571iJ(ImageUrl imageUrl, JTa jTa, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, User user, Long l, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2) {
        super(jTa, directThreadKey, l, j2);
        this.A03 = C2EY.A0z;
        ?? obj = new Object();
        obj.A00 = j;
        obj.A05 = str;
        obj.A07 = str2;
        obj.A06 = str3;
        obj.A02 = extendedImageUrl;
        obj.A03 = user;
        obj.A04 = str4;
        obj.A01 = imageUrl;
        this.A00 = obj;
        this.A01 = str6;
        this.A02 = str5;
    }

    @Override // X.C1OW
    public final String A02() {
        return "notes_send_text_response";
    }

    public final C47813L9v A07() {
        C47813L9v c47813L9v = this.A00;
        if (c47813L9v != null) {
            return c47813L9v;
        }
        C14360o3.A0F("noteReply");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String str = this.A02;
        if (str != null) {
            return new C29481bP(new C206409Bx(str), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
        }
        return null;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29511bS
    public final C2EY BSm() {
        return C2EY.A1i;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return this.A03;
    }

    @Override // X.AbstractC29011ae
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final List A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A02(EnumC910243u.SINGLE, null, null, A07().A02, false, false, null, null, null, null, null, null, null, null, null, null, null, null, A07().A02(), A07().A01(), null, null, null, null, null, null, null, 0, 0, 0, false));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC29511bS
    public final /* bridge */ /* synthetic */ Object BSj() {
        return A07().A00();
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return A05();
    }

    public C33571iJ() {
        this.A03 = C2EY.A0z;
    }
}
