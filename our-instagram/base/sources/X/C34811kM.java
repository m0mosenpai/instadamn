package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1kM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34811kM extends C1OW implements InterfaceC29171au {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1kN
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34811kM parseFromJson = F5W.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34811kM c34811kM = (C34811kM) obj;
            anonymousClass182.A0d();
            if (c34811kM.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c34811kM.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    if (c34811kM.A02 != null) {
                        C16V.A03(anonymousClass182, "item_ids");
                        List<String> list = c34811kM.A02;
                        if (list != null) {
                            for (String str2 : list) {
                                if (str2 != null) {
                                    anonymousClass182.A0u(str2);
                                }
                            }
                            anonymousClass182.A0Z();
                            if (c34811kM.A01 != null) {
                                C16V.A03(anonymousClass182, "original_message_client_contexts");
                                List<String> list2 = c34811kM.A01;
                                if (list2 != null) {
                                    for (String str3 : list2) {
                                        if (str3 != null) {
                                            anonymousClass182.A0u(str3);
                                        }
                                    }
                                    anonymousClass182.A0Z();
                                    AbstractC43669JTd.A00(anonymousClass182, c34811kM);
                                    anonymousClass182.A0a();
                                    return;
                                }
                            }
                            str = "clientContexts";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                    str = "itemIds";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "key";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public DirectThreadKey A00;
    public List A01;
    public List A02;

    public C34811kM() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "delete_messages";
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        DirectThreadKey directThreadKey = this.A00;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("key");
        throw C00O.createAndThrow();
    }
}
