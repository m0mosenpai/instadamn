package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1j5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34051j5 extends C1OW implements InterfaceC29171au {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1j6
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34051j5 parseFromJson = AbstractC46929KpA.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34051j5 c34051j5 = (C34051j5) obj;
            anonymousClass182.A0d();
            if (c34051j5.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c34051j5.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str2 = c34051j5.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("collection_type", str2);
                        String str3 = c34051j5.A05;
                        if (str3 != null) {
                            anonymousClass182.A0S("reaction_status", str3);
                            c34051j5.A03();
                            anonymousClass182.A0S("collection_item_id", c34051j5.A03());
                            String str4 = c34051j5.A04;
                            if (str4 != null) {
                                anonymousClass182.A0S("reaction_emoji", str4);
                            }
                            String str5 = c34051j5.A03;
                            if (str5 != null) {
                                anonymousClass182.A0S("message_id", str5);
                            }
                            AbstractC43669JTd.A00(anonymousClass182, c34051j5);
                            anonymousClass182.A0a();
                            return;
                        }
                        str = "reactionStatus";
                    } else {
                        str = "collectionType";
                    }
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
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public C34051j5() {
        super(null, null, 1);
    }

    @Override // X.C1OW
    public final String A02() {
        return "broadcast_collection_item_media_reaction";
    }

    public final String A03() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("collectionItemId");
        throw C00O.createAndThrow();
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
