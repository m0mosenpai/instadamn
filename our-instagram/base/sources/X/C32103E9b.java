package X;

import java.util.HashMap;

/* renamed from: X.E9b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32103E9b extends C0T6 implements InterfaceC37110GWv {
    public final EnumC72357Xbt A00;
    public final String A01;
    public final String A02;
    public final HashMap A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32103E9b) {
                C32103E9b c32103E9b = (C32103E9b) obj;
                if (!C14360o3.A0K(this.A02, c32103E9b.A02) || this.A00 != c32103E9b.A00 || !C14360o3.A0K(this.A03, c32103E9b.A03) || !C14360o3.A0K(this.A01, c32103E9b.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02))) + AbstractC167017dG.A0O(this.A01);
    }

    public C32103E9b(EnumC72357Xbt enumC72357Xbt, String str, String str2, HashMap hashMap) {
        AbstractC167027dH.A13(str, enumC72357Xbt, hashMap);
        this.A02 = str;
        this.A00 = enumC72357Xbt;
        this.A03 = hashMap;
        this.A01 = str2;
    }
}
