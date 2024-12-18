package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34411jf extends AbstractC29011ae {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1jg
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34411jf parseFromJson = AbstractC46940KpL.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34411jf c34411jf = (C34411jf) obj;
            anonymousClass182.A0d();
            c34411jf.A08();
            anonymousClass182.A0r("direct_message");
            AbstractC126255nM.A00(anonymousClass182, c34411jf.A08());
            c34411jf.A07();
            anonymousClass182.A0r("direct_forwarding_params");
            FUT.A00(anonymousClass182, c34411jf.A07());
            if (c34411jf.A02 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c34411jf.A02;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    AbstractC47856LCb.A00(anonymousClass182, c34411jf);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("threadKey");
            throw C00O.createAndThrow();
        }
    };
    public DirectForwardingParams A00;
    public C83403nh A01;
    public DirectThreadKey A02;

    @Override // X.C1OW
    public final String A02() {
        return "forward_content_ref";
    }

    public final DirectForwardingParams A07() {
        DirectForwardingParams directForwardingParams = this.A00;
        if (directForwardingParams != null) {
            return directForwardingParams;
        }
        C14360o3.A0F("forwardingParams");
        throw C00O.createAndThrow();
    }

    public final C83403nh A08() {
        C83403nh c83403nh = this.A01;
        if (c83403nh != null) {
            return c83403nh;
        }
        C14360o3.A0F(DialogModule.KEY_MESSAGE);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
