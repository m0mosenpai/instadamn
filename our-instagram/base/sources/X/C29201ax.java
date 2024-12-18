package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29201ax extends AbstractC29011ae implements InterfaceC29171au {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1ay
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C29201ax parseFromJson = F6S.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C29201ax c29201ax = (C29201ax) obj;
            anonymousClass182.A0d();
            if (c29201ax.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c29201ax.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    AbstractC47856LCb.A00(anonymousClass182, c29201ax);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("key");
            throw C00O.createAndThrow();
        }
    };
    public DirectThreadKey A00;

    @Override // X.C1OW
    public final String A02() {
        return "send_standard_dxma";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A0B(null, null, 12));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
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
