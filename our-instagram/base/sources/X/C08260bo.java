package X;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.0bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08260bo {
    public boolean A03 = false;
    public List A00 = Collections.emptyList();
    public boolean A02 = false;
    public List A01 = new ArrayList();

    public final void A01(String[] strArr) {
        int length;
        this.A03 = true;
        int length2 = strArr.length;
        String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, length2, 2);
        for (int i = 0; i < length2; i++) {
            strArr2[i] = new String[]{strArr[i], ".*"};
        }
        if (strArr2 != null && (length = strArr2.length) != 0) {
            try {
                this.A00 = new ArrayList(length);
                int i2 = 0;
                do {
                    String[] strArr3 = strArr2[i2];
                    ArrayList arrayList = new ArrayList(strArr3.length);
                    for (String str : strArr3) {
                        arrayList.add(Pattern.compile(str));
                    }
                    this.A00.add(arrayList);
                    i2++;
                } while (i2 < length);
            } catch (PatternSyntaxException unused) {
            }
        }
    }

    public final C08270bp A00() {
        if (this.A03 && this.A00.isEmpty()) {
            throw new IllegalStateException("Field matchers cannot be empty when we are keeping value baesd on config.");
        }
        boolean z = this.A03;
        return new C08270bp(this.A00, this.A01, z, this.A02);
    }
}
