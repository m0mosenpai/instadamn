package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33691iV extends AbstractC29011ae implements InterfaceC29521bT {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1iW
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33691iV parseFromJson = AbstractC46936KpH.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33691iV c33691iV = (C33691iV) obj;
            anonymousClass182.A0d();
            c33691iV.A07();
            anonymousClass182.A0r("note_reply");
            AbstractC47852LBv.A00(anonymousClass182, c33691iV.A07());
            AbstractC47856LCb.A00(anonymousClass182, c33691iV);
            anonymousClass182.A0a();
        }
    };
    public C47813L9v A00;

    @Override // X.C1OW
    public final String A02() {
        return "content_notes_send_mention_message";
    }

    public final C47813L9v A07() {
        C47813L9v c47813L9v = this.A00;
        if (c47813L9v != null) {
            return c47813L9v;
        }
        C14360o3.A0F("noteReply");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A0z;
    }

    @Override // X.AbstractC29011ae
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final List A05() {
        ExtendedImageUrl extendedImageUrl;
        ExtendedImageUrl extendedImageUrl2 = A07().A02;
        ImageUrl imageUrl = A07().A01;
        if (imageUrl != null) {
            extendedImageUrl = new ExtendedImageUrl(imageUrl);
        } else {
            extendedImageUrl = null;
        }
        List singletonList = Collections.singletonList(AbstractC47996LLi.A06(extendedImageUrl, extendedImageUrl2, A07().A02(), A07().A01()));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return A05();
    }
}
