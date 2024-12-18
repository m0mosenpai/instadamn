package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.1hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33271hp extends AbstractC29011ae {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1hq
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33271hp parseFromJson = AbstractC46977Kpw.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C33271hp c33271hp = (C33271hp) obj;
            anonymousClass182.A0d();
            if (c33271hp.A02 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c33271hp.A02;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c33271hp.A04;
                    if (str2 != null) {
                        anonymousClass182.A0S("sticker_id", str2);
                        if (c33271hp.A03 != null) {
                            anonymousClass182.A0r("store_sticker");
                            DirectStoreSticker directStoreSticker = c33271hp.A03;
                            if (directStoreSticker != null) {
                                AbstractC47870LCq.A00(anonymousClass182, directStoreSticker);
                                if (c33271hp.A01 != null) {
                                    anonymousClass182.A0r("replied_to_message");
                                    AbstractC43642JSa.A01(anonymousClass182, c33271hp.A01);
                                }
                                AbstractC47856LCb.A00(anonymousClass182, c33271hp);
                                anonymousClass182.A0a();
                                return;
                            }
                        }
                        str = "sticker";
                    } else {
                        str = "stickerId";
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
    public UserSession A00;
    public AnonymousClass442 A01;
    public DirectThreadKey A02;
    public DirectStoreSticker A03;
    public String A04;

    @Override // X.C1OW
    public final String A02() {
        return "send_store_sticker";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A01;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        DirectStoreSticker directStoreSticker = this.A03;
        if (directStoreSticker != null) {
            return directStoreSticker;
        }
        C14360o3.A0F("sticker");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1f;
    }
}
