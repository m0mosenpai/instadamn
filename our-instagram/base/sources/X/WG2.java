package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes11.dex */
public abstract class WG2 {
    /* JADX WARN: Type inference failed for: r0v7, types: [X.4ff, java.lang.IllegalArgumentException] */
    public static final C100764ff A02(Number number, String str, String str2) {
        C14360o3.A0B(str2, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(" with key ");
        sb.append(str);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        String A0v = AbstractC166997dE.A0v(A00(-1, str2), sb);
        C14360o3.A0B(A0v, 1);
        return new IllegalArgumentException(A0v);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.IllegalArgumentException, X.X6e] */
    public static final C71826X6e A03(Number number, String str) {
        C14360o3.A0B(str, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        String A0v = AbstractC166997dE.A0v(A00(-1, str), sb);
        C14360o3.A0B(A0v, 1);
        return new IllegalArgumentException(A0v);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.IllegalArgumentException, X.X6e] */
    public static final C71826X6e A04(SerialDescriptor serialDescriptor) {
        StringBuilder sb = new StringBuilder();
        sb.append("Value of type '");
        sb.append(serialDescriptor.BtR());
        sb.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        sb.append(serialDescriptor.BKw());
        String A0x = AbstractC166997dE.A0x("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", sb);
        C14360o3.A0B(A0x, 1);
        return new IllegalArgumentException(A0x);
    }

    public static final void A05(Number number, C3T3 c3t3) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected special floating-point value ");
        sb.append(number);
        c3t3.A0F(AbstractC166997dE.A0x(". By default, non-finite floating point values are prohibited because they do not conform JSON specification", sb), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", c3t3.A00);
        throw C00O.createAndThrow();
    }

    public static final void A06(String str, C3T3 c3t3) {
        c3t3.A0F(AnonymousClass001.A0R("Trailing comma before the end of JSON ", str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.", c3t3.A00 - 1);
        throw C00O.createAndThrow();
    }

    public static final CharSequence A00(int i, CharSequence charSequence) {
        StringBuilder A11;
        if (charSequence.length() >= 200) {
            String str = ".....";
            if (i == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    A11 = AbstractC166997dE.A11(".....");
                    str = charSequence.subSequence(length, charSequence.length()).toString();
                } else {
                    return charSequence;
                }
            } else {
                int i2 = i - 30;
                int i3 = i + 30;
                String str2 = ".....";
                if (i2 <= 0) {
                    str2 = "";
                }
                if (i3 >= charSequence.length()) {
                    str = "";
                }
                A11 = AbstractC166997dE.A11(str2);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length2 = charSequence.length();
                if (i3 > length2) {
                    i3 = length2;
                }
                AbstractC58318PtA.A1V(A11, charSequence.subSequence(i2, i3));
            }
            return AbstractC166997dE.A0x(str, A11);
        }
        return charSequence;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.4ff, java.lang.IllegalArgumentException] */
    public static final C100764ff A01(CharSequence charSequence, String str, int i) {
        AbstractC167017dG.A1P(str, charSequence);
        StringBuilder A11 = AbstractC166997dE.A11(str);
        A11.append("\nJSON input: ");
        String A0v = AbstractC166997dE.A0v(A00(i, charSequence), A11);
        C14360o3.A0B(A0v, 1);
        if (i >= 0) {
            A0v = AnonymousClass001.A05(i, "Unexpected JSON token at offset ", ": ", A0v);
        }
        C14360o3.A0B(A0v, 1);
        return new IllegalArgumentException(A0v);
    }
}
