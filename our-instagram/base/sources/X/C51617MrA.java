package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import java.util.List;

/* renamed from: X.MrA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51617MrA extends C0T6 {
    public final MediaGenAIDetectionMethod A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51617MrA) {
                C51617MrA c51617MrA = (C51617MrA) obj;
                if (!C14360o3.A0K(this.A02, c51617MrA.A02) || !C14360o3.A0K(this.A04, c51617MrA.A04) || !C14360o3.A0K(this.A05, c51617MrA.A05) || !C14360o3.A0K(this.A03, c51617MrA.A03) || !C14360o3.A0K(this.A01, c51617MrA.A01) || this.A00 != c51617MrA.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, (((AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A02))) * 31 * 31 * 31 * 31 * 31) + AbstractC167017dG.A0O(this.A01)) * 31 * 31 * 31) + AbstractC53644Nnp.A00()) * 31) * 31 * 31 * 31 * 31;
    }

    public C51617MrA(MediaGenAIDetectionMethod mediaGenAIDetectionMethod, String str, String str2, List list, List list2, List list3) {
        AbstractC167027dH.A13(str, list, list2);
        C14360o3.A0B(list3, 9);
        this.A02 = str;
        this.A04 = list;
        this.A05 = list2;
        this.A03 = list3;
        this.A01 = str2;
        this.A00 = mediaGenAIDetectionMethod;
    }
}
