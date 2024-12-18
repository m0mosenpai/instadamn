package X;

import java.util.Locale;

/* renamed from: X.5gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122575gs {
    public final Locale A00;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C122575gs)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C14360o3.A0K(this.A00.toLanguageTag(), ((C122575gs) obj).A00.toLanguageTag());
    }

    public final int hashCode() {
        return this.A00.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.A00.toLanguageTag();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C122575gs(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r5)
            java.lang.String r1 = r3.toLanguageTag()
            java.lang.String r0 = "und"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L1d
            java.lang.String r2 = "Locale"
            java.lang.String r1 = "The language tag "
            java.lang.String r0 = " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."
            java.lang.String r0 = X.AnonymousClass001.A0g(r1, r5, r0)
            android.util.Log.e(r2, r0)
        L1d:
            r4.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122575gs.<init>(java.lang.String):void");
    }

    public C122575gs(Locale locale) {
        this.A00 = locale;
    }
}
