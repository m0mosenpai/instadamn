package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.JSu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43662JSu {
    public final C51756Mtf A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    public C43662JSu(C51756Mtf c51756Mtf, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A04 = str;
        this.A03 = str2;
        this.A01 = immutableList;
        this.A02 = immutableList2;
        this.A00 = c51756Mtf;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShowreelNativeDocument{name='");
        A1C.append(this.A04);
        A1C.append("', document='");
        A1C.append(this.A03);
        A1C.append("', bitmaps=");
        A1C.append(this.A01);
        A1C.append(", states=");
        A1C.append(this.A02);
        A1C.append(", metadata=");
        A1C.append(this.A00);
        return AbstractC167027dH.A0R(A1C);
    }
}
