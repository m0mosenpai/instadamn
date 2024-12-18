package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125865mb {
    public final List A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C125865mb(String str) {
        ?? r2;
        C14360o3.A0B(str, 2);
        try {
            String[] split = str.split("\\.");
            C14360o3.A07(split);
            r2 = new ArrayList(split.length);
            for (String str2 : split) {
                r2.add(Integer.valueOf(Integer.parseInt(str2)));
            }
        } catch (NumberFormatException unused) {
            r2 = C16930sl.A00;
        }
        this.A00 = r2;
    }
}
