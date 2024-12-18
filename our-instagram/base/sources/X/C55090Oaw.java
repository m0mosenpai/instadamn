package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Oaw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55090Oaw {
    public static final C55090Oaw A04 = new C55090Oaw(0, C16930sl.A00);
    public final int A00;
    public final List A01;
    public final List A02;
    public final int[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj))) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
                C55090Oaw c55090Oaw = (C55090Oaw) obj;
                if (!Arrays.equals(this.A03, c55090Oaw.A03) || !C14360o3.A0K(this.A01, c55090Oaw.A01) || this.A00 != c55090Oaw.A00 || !C14360o3.A0K(this.A02, c55090Oaw.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, Arrays.hashCode(this.A03) * 31) + this.A00) * 31) + AbstractC25235BEs.A06(this.A02);
    }

    public C55090Oaw(List list, List list2, int[] iArr, int i) {
        AbstractC167017dG.A1P(iArr, list);
        this.A03 = iArr;
        this.A01 = list;
        this.A00 = i;
        this.A02 = list2;
        if (iArr.length == 0) {
            throw AbstractC166987dD.A12("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list2 != null && list2.size() != list.size()) {
            throw AbstractC166987dD.A12(AnonymousClass001.A0X("If originalIndices (size = ", ") is provided, it must be same length as data (size = ", ')', list2.size(), list.size()));
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TransformablePage(originalPageOffsets=");
        A1C.append(Arrays.toString(this.A03));
        A1C.append(", data=");
        A1C.append(this.A01);
        A1C.append(", hintOriginalPageOffset=");
        A1C.append(this.A00);
        A1C.append(", hintOriginalIndices=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55090Oaw(int i, List list) {
        this(list, null, new int[]{i}, i);
        C14360o3.A0B(list, 2);
    }
}
