package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.5C8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5C8 implements CharSequence {
    public static final C5C7 A04 = C5C9.A00;
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List A02(int i) {
        ?? r1;
        List list = this.A01;
        if (list != null) {
            r1 = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                C127015of c127015of = (C127015of) obj;
                if ((c127015of.A02 instanceof AbstractC137436Ko) && AbstractC127005oe.A02(0, i, c127015of.A01, c127015of.A00)) {
                    r1.add(obj);
                }
            }
        } else {
            r1 = C16930sl.A00;
        }
        C14360o3.A0C(r1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return r1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5C8) {
                C5C8 c5c8 = (C5C8) obj;
                if (!C14360o3.A0K(this.A00, c5c8.A00) || !C14360o3.A0K(this.A03, c5c8.A03) || !C14360o3.A0K(this.A02, c5c8.A02) || !C14360o3.A0K(this.A01, c5c8.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.CharSequence
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C5C8 subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.A00.length()) {
                return this;
            }
            String substring = this.A00.substring(i, i2);
            C14360o3.A07(substring);
            return new C5C8(substring, AbstractC127005oe.A01(this.A03, i, i2), AbstractC127005oe.A01(this.A02, i, i2), AbstractC127005oe.A01(this.A01, i, i2));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0X("start (", ") should be less or equal to end (", ')', i, i2));
    }

    public final C5C8 A01(C5C8 c5c8) {
        C6C7 c6c7 = new C6C7(16);
        c6c7.A05(this);
        c6c7.A05(c5c8);
        return c6c7.A02();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List A03(int i, int i2) {
        ?? r1;
        List list = this.A01;
        if (list != null) {
            r1 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C127015of c127015of = (C127015of) obj;
                if ((c127015of.A02 instanceof String) && AbstractC127005oe.A02(i, i2, c127015of.A01, c127015of.A00)) {
                    r1.add(obj);
                }
            }
        } else {
            r1 = C16930sl.A00;
        }
        C14360o3.A0C(r1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List A04(int i, int i2) {
        ?? r1;
        List list = this.A01;
        if (list != null) {
            r1 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C127015of c127015of = (C127015of) obj;
                if ((c127015of.A02 instanceof C96) && AbstractC127005oe.A02(i, i2, c127015of.A01, c127015of.A00)) {
                    r1.add(obj);
                }
            }
        } else {
            r1 = C16930sl.A00;
        }
        C14360o3.A0C(r1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Deprecated(message = "Use LinkAnnotation API instead", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
    public final List A05(int i, int i2) {
        ?? r1;
        List list = this.A01;
        if (list != null) {
            r1 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C127015of c127015of = (C127015of) obj;
                if ((c127015of.A02 instanceof C27974CUw) && AbstractC127005oe.A02(i, i2, c127015of.A01, c127015of.A00)) {
                    r1.add(obj);
                }
            }
        } else {
            r1 = C16930sl.A00;
        }
        C14360o3.A0C(r1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List A06(String str, int i, int i2) {
        ?? r1;
        List list = this.A01;
        if (list != null) {
            r1 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C127015of c127015of = (C127015of) obj;
                if ((c127015of.A02 instanceof String) && C14360o3.A0K(str, c127015of.A03) && AbstractC127005oe.A02(i, i2, c127015of.A01, c127015of.A00)) {
                    r1.add(obj);
                }
            }
        } else {
            r1 = C16930sl.A00;
        }
        C14360o3.A0C(r1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return r1;
    }

    public final boolean A07(String str, int i, int i2) {
        List list = this.A01;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C127015of c127015of = (C127015of) list.get(i3);
            if ((c127015of.A02 instanceof String) && str.equals(c127015of.A03) && AbstractC127005oe.A02(i, i2, c127015of.A01, c127015of.A00)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.A00.charAt(i);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.A00.hashCode() * 31;
        List list = this.A03;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List list2 = this.A02;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List list3 = this.A01;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return i5 + i3;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.A00.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.A00;
    }

    public C5C8(List list, List list2, String str) {
        this(str, list.isEmpty() ? null : list, list2.isEmpty() ? null : list2, null);
    }

    public C5C8(String str, List list, List list2, List list3) {
        List A0g;
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        if (list2 != null && (A0g = AbstractC001800i.A0g(list2, new Comparator() { // from class: X.6En
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2BS.A00(Integer.valueOf(((C127015of) obj).A01), Integer.valueOf(((C127015of) obj2).A01));
            }
        })) != null) {
            int size = A0g.size();
            int i = -1;
            for (int i2 = 0; i2 < size; i2++) {
                C127015of c127015of = (C127015of) A0g.get(i2);
                if (c127015of.A01 >= i) {
                    int i3 = c127015of.A00;
                    if (i3 <= this.A00.length()) {
                        i = c127015of.A00;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0n("ParagraphStyle range [", ", ", ") is out of boundary", c127015of.A01, i3));
                    }
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
            }
        }
    }
}
