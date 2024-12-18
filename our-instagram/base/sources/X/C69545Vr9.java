package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Vr9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69545Vr9 {
    public final ImmutableList A00;
    public final String A01;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShowreelNativeEventActions{mEvent='");
        AbstractC58319PtB.A1K(sb, this.A01);
        sb.append(", mDocumentActions=");
        return AbstractC58320PtC.A11(this.A00, sb);
    }

    public C69545Vr9(ImmutableList immutableList, String str) {
        this.A01 = str;
        this.A00 = immutableList;
    }
}
