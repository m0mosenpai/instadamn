package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33891ip extends AbstractC29011ae implements InterfaceC29171au, InterfaceC33901iq {
    public static final C1OZ A0C = new C1OZ() { // from class: X.1ir
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C33891ip parseFromJson = FV4.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            FV4.A00(anonymousClass182, (C33891ip) obj);
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public UQL A04;
    public DirectThreadKey A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    @Override // X.C1OW
    public final String A02() {
        return "send_prompt_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        int i = this.A00;
        String A07 = A07();
        if (i == 162) {
            UQL uql = this.A04;
            if (uql != null) {
                String str = this.A07;
                if (str != null) {
                    long currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(uql.A00);
                    List singletonList = Collections.singletonList(new C9CP(str, "web_url", null));
                    C14360o3.A07(singletonList);
                    C910143t A05 = AbstractC47996LLi.A05(null, null, null, null, null, Long.valueOf(currentTimeMillis), null, null, A07, null, null, singletonList, 18);
                    String str2 = uql.A04;
                    String str3 = uql.A05;
                    if (str3 == null) {
                        str3 = uql.A03;
                    }
                    return AbstractC16960so.A1Q(A05, AbstractC47996LLi.A09(null, null, str2, null, str3, uql.A02, null, 18, 16));
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            String str4 = this.A07;
            if (str4 != null) {
                List singletonList2 = Collections.singletonList(AbstractC47996LLi.A0G(this.A06, A07, str4, null));
                C14360o3.A07(singletonList2);
                return singletonList2;
            }
        }
        C14360o3.A0F("buttonText");
        throw C00O.createAndThrow();
    }

    public final String A07() {
        String str = this.A09;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("promptText");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC33901iq
    public final C83553nw AYd() {
        String str = this.A08;
        if (str == null) {
            str = "";
        }
        return new C83553nw(null, str, null, null, null, null, false);
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        DirectThreadKey directThreadKey = this.A05;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("key");
        throw C00O.createAndThrow();
    }
}
