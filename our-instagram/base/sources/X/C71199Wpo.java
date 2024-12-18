package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wpo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71199Wpo implements Iterable, InterfaceC15590qF {
    public EnumC68143VDg A00;
    public String A01 = "";
    public String A02 = "";
    public List A04 = C16930sl.A00;
    public List A03 = new ArrayList();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C71199Wpo c71199Wpo = (C71199Wpo) obj;
            if (!C14360o3.A0K(this.A01, c71199Wpo.A01) || !C14360o3.A0K(this.A02, c71199Wpo.A02) || !C14360o3.A0K(this.A03, c71199Wpo.A03) || this.A00 != c71199Wpo.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A03, this.A00});
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A03.iterator();
    }
}
