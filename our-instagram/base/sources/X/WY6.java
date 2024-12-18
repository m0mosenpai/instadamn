package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class WY6 implements InterfaceC71849X7h {
    public final ImmutableList A00;
    public final String A01;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShowreelNativeDocumentAction{mType='");
        AbstractC58319PtB.A1K(sb, this.A01);
        sb.append(", mParameters=");
        return AbstractC58320PtC.A11(this.A00, sb);
    }

    public WY6(ImmutableList immutableList, String str) {
        this.A01 = str;
        this.A00 = immutableList;
    }
}
