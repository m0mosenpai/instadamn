package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1iB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33491iB extends AbstractC29011ae {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1iC
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33491iB parseFromJson = F62.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33491iB c33491iB = (C33491iB) obj;
            anonymousClass182.A0d();
            if (c33491iB.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c33491iB.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    c33491iB.A07();
                    anonymousClass182.A0r("collection");
                    C70139W6r.A00(anonymousClass182, c33491iB.A07());
                    String str = c33491iB.A02;
                    if (str != null) {
                        anonymousClass182.A0S("text", str);
                    }
                    AbstractC47856LCb.A00(anonymousClass182, c33491iB);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("threadKey");
            throw C00O.createAndThrow();
        }
    };
    public DirectThreadKey A00;
    public SavedCollection A01;
    public String A02;

    @Override // X.C1OW
    public final String A02() {
        return "send_collection_share_message";
    }

    public final SavedCollection A07() {
        SavedCollection savedCollection = this.A01;
        if (savedCollection != null) {
            return savedCollection;
        }
        C14360o3.A0F("collection");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0a;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str;
        String str2 = A07().A0G;
        User user = A07().A08;
        ExtendedImageUrl extendedImageUrl = null;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        ImageUrl imageUrl = A07().A01;
        if (imageUrl != null) {
            extendedImageUrl = new ExtendedImageUrl(imageUrl);
        }
        List singletonList = Collections.singletonList(AbstractC47996LLi.A0E(extendedImageUrl, str2, str, this.A02));
        C14360o3.A07(singletonList);
        List unmodifiableList = Collections.unmodifiableList(singletonList);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }
}
