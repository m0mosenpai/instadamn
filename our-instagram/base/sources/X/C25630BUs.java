package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.BUs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25630BUs {
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;

    public C25630BUs(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3) {
        this.A01 = immutableList;
        this.A02 = immutableList2;
        this.A00 = immutableList3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShowreelNativeInteractiveAnimation{documents=");
        A1C.append(this.A01);
        A1C.append(", interactions=");
        A1C.append(this.A02);
        A1C.append(", additionalParts=");
        A1C.append(this.A00);
        A1C.append('}');
        return A1C.toString();
    }
}
