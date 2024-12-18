package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.JSq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43658JSq {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C43658JSq)) {
            return false;
        }
        C43658JSq c43658JSq = (C43658JSq) obj;
        if (c43658JSq.hashCode() != hashCode() || !AbstractC126965oa.A04(c43658JSq.A02, this.A02) || !AbstractC126965oa.A04(c43658JSq.A01, this.A01) || !AbstractC126965oa.A04(c43658JSq.A00, this.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00, null});
    }

    public C43658JSq(String str, String str2, String str3, List list, List list2) {
        if (!AbstractC126965oa.A03(str)) {
            if (!AbstractC126965oa.A03(str2)) {
                this.A02 = str;
                this.A01 = str2;
                this.A03 = list;
                this.A04 = list2 == null ? Collections.emptyList() : list2;
                this.A00 = str3;
                return;
            }
            throw new Exception("Content is empty");
        }
        throw new Exception("Template name is empty");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[templateName: ");
        A1C.append(this.A02);
        A1C.append(", content: ");
        A1C.append(this.A01);
        A1C.append(", assets: ");
        A1C.append(this.A03);
        A1C.append(", assetsInfo: ");
        A1C.append(this.A04);
        A1C.append(", animationPayload: ");
        A1C.append(this.A00);
        A1C.append(", audioDataSrc: ");
        A1C.append((Object) null);
        return AbstractC166997dE.A0x("]", A1C);
    }
}
