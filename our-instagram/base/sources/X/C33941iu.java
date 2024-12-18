package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33941iu extends AbstractC33951iv implements InterfaceC33901iq {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1iw
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C33941iu parseFromJson = F5T.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.send.mutation.model.DirectConfigurePromptResponseMessageMutation");
            C33941iu c33941iu = (C33941iu) obj;
            anonymousClass182.A0d();
            String str = c33941iu.A03;
            if (str != null) {
                anonymousClass182.A0S("optimistic_admin_text", str);
            }
            if (c33941iu.A01 != null) {
                anonymousClass182.A0r("send_prompt_message_mutation");
                FV4.A00(anonymousClass182, c33941iu.A01);
            }
            String str2 = c33941iu.A04;
            if (str2 != null) {
                anonymousClass182.A0S("prompt_text", str2);
            }
            String str3 = c33941iu.A02;
            if (str3 != null) {
                anonymousClass182.A0S("button_text", str3);
            }
            anonymousClass182.A0Q("contribution_count", c33941iu.A00);
            FV3.A00(anonymousClass182, c33941iu);
            anonymousClass182.A0a();
        }
    };
    public int A00;
    public C33891ip A01;
    public String A02 = "";
    public String A03;
    public String A04;

    @Override // X.C1OW
    public final String A02() {
        return "configure_prompt_response_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        int i = this.A00;
        int i2 = i + 1;
        if (i > 1) {
            i2 = 3;
        }
        List singletonList = Collections.singletonList(AbstractC47996LLi.A0G(null, this.A04, this.A02, ((AbstractC33951iv) this).A03));
        C14360o3.A07(singletonList);
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(AbstractC47996LLi.A01());
        }
        return AbstractC001800i.A0S(arrayList, singletonList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3nw] */
    @Override // X.InterfaceC33901iq
    public final C83553nw AYd() {
        String str = this.A03;
        if (str != null) {
            return new C83553nw(null, str, null, null, null, null, false);
        }
        return new Object();
    }
}
