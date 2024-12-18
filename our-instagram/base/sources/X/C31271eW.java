package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1eW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31271eW extends AbstractC29011ae {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1eX
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31271eW c31271eW = (C31271eW) obj;
            anonymousClass182.A0d();
            String str = c31271eW.A02;
            if (str != null) {
                anonymousClass182.A0S("pending_media_key", str);
            }
            c31271eW.A07();
            anonymousClass182.A0r("thread_key");
            AbstractC83623o5.A00(anonymousClass182, c31271eW.A07());
            if (c31271eW.A00 != null) {
                anonymousClass182.A0r("file_media");
                C7Q4 c7q4 = c31271eW.A00;
                if (c7q4 != null) {
                    AbstractC47865LCl.A00(anonymousClass182, c7q4);
                    AbstractC47856LCb.A00(anonymousClass182, c31271eW);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("fileMedia");
            throw C00O.createAndThrow();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C31271eW parseFromJson = AbstractC46933KpE.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }
    };
    public C7Q4 A00;
    public DirectThreadKey A01;
    public String A02;

    @Override // X.C1OW
    public final String A02() {
        return "configure_file_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        C7Q4 c7q4 = this.A00;
        if (c7q4 != null) {
            return c7q4;
        }
        C14360o3.A0F("fileMedia");
        throw C00O.createAndThrow();
    }

    public final DirectThreadKey A07() {
        DirectThreadKey directThreadKey = this.A01;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("threadKey");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0u;
    }
}
