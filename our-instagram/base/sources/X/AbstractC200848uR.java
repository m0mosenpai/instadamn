package X;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.8uR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC200848uR {
    public final android.net.Uri A00;
    public final C0B5 A01;
    public final String A02;
    public final C200828uP A03;
    public final EnumC200798uM A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC200848uR)) {
            return false;
        }
        AbstractC200848uR abstractC200848uR = (AbstractC200848uR) obj;
        if (!this.A00.equals(abstractC200848uR.A00)) {
            return false;
        }
        C200828uP c200828uP = this.A03;
        C200828uP c200828uP2 = abstractC200848uR.A03;
        if (c200828uP == null) {
            if (c200828uP2 != null) {
                return false;
            }
        } else if (!c200828uP.equals(c200828uP2)) {
            return false;
        }
        C0B5 c0b5 = this.A01;
        C0B5 c0b52 = abstractC200848uR.A01;
        if (c0b5 == null) {
            if (c0b52 != null) {
                return false;
            }
        } else if (!c0b5.equals(c0b52)) {
            return false;
        }
        if (!this.A02.equals(abstractC200848uR.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A03, this.A04, this.A01});
    }

    public AbstractC200848uR(EnumC200798uM enumC200798uM) {
        this.A00 = android.net.Uri.EMPTY;
        this.A03 = null;
        this.A04 = enumC200798uM;
        this.A02 = "";
        this.A01 = null;
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (obj == ((AbstractC200848uR) next).A04) {
            abstractCollection.add(next);
        }
    }

    public AbstractC200848uR(C0B5 c0b5, String str, String str2, C200828uP c200828uP, EnumC200798uM enumC200798uM) {
        android.net.Uri A03 = AbstractC08820cl.A03(str);
        C14360o3.A07(A03);
        this.A00 = A03;
        this.A03 = c200828uP;
        this.A04 = enumC200798uM;
        this.A02 = str2;
        this.A01 = c0b5;
    }
}
