package X;

import java.util.ArrayList;

/* renamed from: X.Mqg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51588Mqg extends C0T6 {
    public final String A00;
    public final ArrayList A01;

    public C51588Mqg(String str, ArrayList arrayList) {
        C14360o3.A0B(arrayList, 2);
        this.A01 = arrayList;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51588Mqg) {
                C51588Mqg c51588Mqg = (C51588Mqg) obj;
                if (!C14360o3.A0K(this.A01, c51588Mqg.A01) || !C14360o3.A0K(this.A00, c51588Mqg.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0G(this.A01));
    }
}
