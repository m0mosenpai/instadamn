package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1dW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30671dW extends AbstractC29011ae {
    public static final C1OZ A06 = new C1OZ() { // from class: X.1dX
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C30671dW parseFromJson = AbstractC46931KpC.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C30671dW c30671dW = (C30671dW) obj;
            anonymousClass182.A0d();
            String str2 = c30671dW.A02;
            if (str2 != null) {
                anonymousClass182.A0S("collection_type", str2);
            }
            String str3 = c30671dW.A03;
            if (str3 != null) {
                anonymousClass182.A0S("media_id", str3);
            }
            String str4 = c30671dW.A04;
            if (str4 != null) {
                anonymousClass182.A0S("response_id", str4);
            }
            if (c30671dW.A01 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c30671dW.A01;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    String str5 = c30671dW.A05;
                    if (str5 != null) {
                        anonymousClass182.A0S("text_response", str5);
                        if (c30671dW.A00 != null) {
                            anonymousClass182.A0r("replied_to_message");
                            AbstractC43642JSa.A01(anonymousClass182, c30671dW.A00);
                        }
                        AbstractC47856LCb.A00(anonymousClass182, c30671dW);
                        anonymousClass182.A0a();
                        return;
                    }
                    str = "textResponse";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "key";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public AnonymousClass442 A00;
    public DirectThreadKey A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // X.C1OW
    public final String A02() {
        return "send_collection_item_response";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A00;
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
