package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6C7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6C7 implements Appendable {
    public final StringBuilder A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public C6C7(int i) {
        this.A00 = new StringBuilder(16);
        this.A04 = new ArrayList();
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
        this.A03 = new ArrayList();
    }

    public final int A00(C5W3 c5w3) {
        C6El c6El = new C6El(c5w3, "", this.A00.length(), Integer.MIN_VALUE);
        this.A03.add(c6El);
        this.A04.add(c6El);
        return r1.size() - 1;
    }

    public final int A01(String str, String str2) {
        C6El c6El = new C6El(str2, str, this.A00.length(), Integer.MIN_VALUE);
        this.A03.add(c6El);
        this.A01.add(c6El);
        return r1.size() - 1;
    }

    public final C5C8 A02() {
        StringBuilder sb = this.A00;
        String obj = sb.toString();
        List list = this.A04;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C6El) list.get(i)).A00(sb.length()));
        }
        ArrayList arrayList2 = null;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        List list2 = this.A02;
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList3.add(((C6El) list2.get(i2)).A00(sb.length()));
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        List list3 = this.A01;
        ArrayList arrayList4 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList4.add(((C6El) list3.get(i3)).A00(sb.length()));
        }
        if (!arrayList4.isEmpty()) {
            arrayList2 = arrayList4;
        }
        return new C5C8(obj, arrayList, arrayList3, arrayList2);
    }

    public final void A03() {
        List list = this.A03;
        if (!list.isEmpty()) {
            ((C6El) list.remove(list.size() - 1)).A00 = this.A00.length();
            return;
        }
        throw new IllegalStateException("Nothing to pop.");
    }

    public final void A04(int i) {
        List list = this.A03;
        if (i >= list.size()) {
            throw new IllegalStateException(AnonymousClass001.A0P(" should be less than ", i, list.size()));
        }
        while (list.size() - 1 >= i) {
            A03();
        }
    }

    public final void A05(C5C8 c5c8) {
        StringBuilder sb = this.A00;
        int length = sb.length();
        sb.append(c5c8.A00);
        List list = c5c8.A03;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C127015of c127015of = (C127015of) list.get(i);
                A06((C5W3) c127015of.A02, c127015of.A01 + length, c127015of.A00 + length);
            }
        }
        List list2 = c5c8.A02;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C127015of c127015of2 = (C127015of) list2.get(i2);
                this.A02.add(new C6El(c127015of2.A02, "", c127015of2.A01 + length, c127015of2.A00 + length));
            }
        }
        List list3 = c5c8.A01;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C127015of c127015of3 = (C127015of) list3.get(i3);
                this.A01.add(new C6El(c127015of3.A02, c127015of3.A03, c127015of3.A01 + length, c127015of3.A00 + length));
            }
        }
    }

    public final void A06(C5W3 c5w3, int i, int i2) {
        this.A04.add(new C6El(c5w3, "", i, i2));
    }

    public final void A07(CharSequence charSequence) {
        if (charSequence instanceof C5C8) {
            A05((C5C8) charSequence);
        } else {
            this.A00.append(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    public final void A08(CharSequence charSequence, int i, int i2) {
        ?? r9;
        ?? r92;
        if (charSequence instanceof C5C8) {
            C5C8 c5c8 = (C5C8) charSequence;
            StringBuilder sb = this.A00;
            int length = sb.length();
            String str = c5c8.A00;
            sb.append((CharSequence) str, i, i2);
            List A00 = AbstractC127005oe.A00(c5c8, i, i2);
            if (A00 != null) {
                int size = A00.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C127015of c127015of = (C127015of) A00.get(i3);
                    A06((C5W3) c127015of.A02, c127015of.A01 + length, c127015of.A00 + length);
                }
            }
            if (i != i2 && (r92 = c5c8.A02) != 0) {
                if (i != 0 || i2 < str.length()) {
                    ArrayList arrayList = new ArrayList(r92.size());
                    int size2 = r92.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Object obj = r92.get(i4);
                        C127015of c127015of2 = (C127015of) obj;
                        if (AbstractC127005oe.A02(i, i2, c127015of2.A01, c127015of2.A00)) {
                            arrayList.add(obj);
                        }
                    }
                    r92 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        C127015of c127015of3 = (C127015of) arrayList.get(i5);
                        r92.add(new C127015of(c127015of3.A02, C17s.A03(c127015of3.A01, i, i2) - i, C17s.A03(c127015of3.A00, i, i2) - i));
                    }
                }
                int size4 = r92.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    C127015of c127015of4 = (C127015of) r92.get(i6);
                    this.A02.add(new C6El(c127015of4.A02, "", c127015of4.A01 + length, c127015of4.A00 + length));
                }
            }
            if (i != i2 && (r9 = c5c8.A01) != 0) {
                if (i != 0 || i2 < str.length()) {
                    ArrayList arrayList2 = new ArrayList(r9.size());
                    int size5 = r9.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        Object obj2 = r9.get(i7);
                        C127015of c127015of5 = (C127015of) obj2;
                        if (AbstractC127005oe.A02(i, i2, c127015of5.A01, c127015of5.A00)) {
                            arrayList2.add(obj2);
                        }
                    }
                    r9 = new ArrayList(arrayList2.size());
                    int size6 = arrayList2.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        C127015of c127015of6 = (C127015of) arrayList2.get(i8);
                        r9.add(new C127015of(c127015of6.A02, c127015of6.A03, C17s.A03(c127015of6.A01, i, i2) - i, C17s.A03(c127015of6.A00, i, i2) - i));
                    }
                }
                int size7 = r9.size();
                for (int i9 = 0; i9 < size7; i9++) {
                    C127015of c127015of7 = (C127015of) r9.get(i9);
                    this.A01.add(new C6El(c127015of7.A02, c127015of7.A03, c127015of7.A01 + length, c127015of7.A00 + length));
                }
                return;
            }
            return;
        }
        this.A00.append(charSequence, i, i2);
    }

    public final void A09(String str) {
        this.A00.append(str);
    }

    public final void A0A(String str, String str2, int i, int i2) {
        this.A01.add(new C6El(str2, str, i, i2));
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        this.A00.append(c);
        return this;
    }

    public C6C7() {
        this(16);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        A08(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        A07(charSequence);
        return this;
    }
}
