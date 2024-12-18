package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.save.model.SavedCollection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1iF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33531iF extends AbstractC29011ae {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1iG
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33531iF parseFromJson = F6M.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33531iF c33531iF = (C33531iF) obj;
            anonymousClass182.A0d();
            if (c33531iF.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c33531iF.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    str = "collection";
                    if (c33531iF.A01 != null) {
                        anonymousClass182.A0r("collection");
                        SavedCollection savedCollection = c33531iF.A01;
                        if (savedCollection != null) {
                            C70139W6r.A00(anonymousClass182, savedCollection);
                            String str2 = c33531iF.A02;
                            if (str2 != null) {
                                anonymousClass182.A0S("text", str2);
                            }
                            AbstractC47856LCb.A00(anonymousClass182, c33531iF);
                            anonymousClass182.A0a();
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "threadKey";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public DirectThreadKey A00;
    public SavedCollection A01;
    public String A02;

    @Override // X.C1OW
    public final String A02() {
        return "send_public_collection_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        ExtendedImageUrl extendedImageUrl;
        SavedCollection savedCollection = this.A01;
        if (savedCollection != null) {
            ImageUrl imageUrl = savedCollection.A01;
            if (imageUrl != null) {
                extendedImageUrl = new ExtendedImageUrl(imageUrl);
            } else {
                extendedImageUrl = null;
            }
            List singletonList = Collections.singletonList(AbstractC47996LLi.A0E(extendedImageUrl, null, null, this.A02));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        C14360o3.A0F("collection");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1S;
    }
}
