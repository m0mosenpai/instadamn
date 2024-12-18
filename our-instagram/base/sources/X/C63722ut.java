package X;

import android.util.Pair;

/* renamed from: X.2ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63722ut extends AbstractC62682t7 {
    public final InterfaceC63682up A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63722ut(C1BX c1bx, InterfaceC63682up interfaceC63682up, final String str) {
        super(c1bx, new InterfaceC62702t9() { // from class: X.2uu
            @Override // X.InterfaceC62702t9
            public final String BKe(C59062n7 c59062n7) {
                String str2;
                C47K c47k;
                C14360o3.A0B(c59062n7, 0);
                String str3 = str;
                Pair pair = (Pair) c59062n7.A03;
                if (pair != null && (c47k = (C47K) pair.first) != null) {
                    str2 = c47k.A0F;
                    if (str2 == null) {
                        str2 = "";
                    }
                } else {
                    str2 = null;
                }
                return AnonymousClass001.A0u(str3, str2, "_suggested_user_card_", c59062n7.A05);
            }
        }, 250L);
        C14360o3.A0B(str, 1);
        this.A00 = interfaceC63682up;
    }
}
