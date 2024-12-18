package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class WY0 implements InterfaceC71848X7g {
    public final ImmutableList A00;
    public final String A01;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShowreelNativeAction{mType='");
        AbstractC58319PtB.A1K(sb, this.A01);
        sb.append(", mParameters=");
        return AbstractC58320PtC.A11(this.A00, sb);
    }

    public WY0(ImmutableList immutableList, String str) {
        this.A01 = str;
        this.A00 = immutableList;
    }
}
