package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166117bf extends AbstractC166097bd {
    public final C206329Bp A00;
    public final String A01;
    public final java.util.Set A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166117bf) {
                C166117bf c166117bf = (C166117bf) obj;
                if (!C14360o3.A0K(this.A00, c166117bf.A00) || !C14360o3.A0K(this.A01, c166117bf.A01) || this.A03 != c166117bf.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public C166117bf(C206329Bp c206329Bp, String str, boolean z) {
        super(AnonymousClass001.A0R("hidden_comment_head_loading_state_", str));
        this.A00 = c206329Bp;
        this.A01 = str;
        this.A03 = z;
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        C14360o3.A07(newKeySet);
        this.A02 = newKeySet;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A00.hashCode() * 31;
        String str = this.A01;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        return i + i2;
    }
}
