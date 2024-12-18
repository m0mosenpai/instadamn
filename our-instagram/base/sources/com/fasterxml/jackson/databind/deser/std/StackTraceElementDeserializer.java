package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C16R;
import X.EnumC912945i;

/* loaded from: classes10.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer {
    public StackTraceElementDeserializer() {
        super(StackTraceElement.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A0x, reason: merged with bridge method [inline-methods] */
    public final StackTraceElement A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R A10 = c16l.A10();
        if (A10 == C16R.A0D) {
            String str = "";
            String str2 = "";
            String str3 = "";
            int i = -1;
            while (true) {
                C16R A12 = c16l.A12();
                if (A12 != C16R.A09) {
                    String A0Y = c16l.A0Y();
                    if ("className".equals(A0Y)) {
                        str = c16l.A1P();
                    } else {
                        if (!"classLoaderName".equals(A0Y)) {
                            if ("fileName".equals(A0Y)) {
                                str3 = c16l.A1P();
                            } else if ("lineNumber".equals(A0Y)) {
                                if (A12.A02) {
                                    i = c16l.A0i();
                                } else {
                                    i = A0Q(c16l, anonymousClass469);
                                }
                            } else if ("methodName".equals(A0Y)) {
                                str2 = c16l.A1P();
                            } else if (!"nativeMethod".equals(A0Y)) {
                                if (!"moduleName".equals(A0Y) && !"moduleVersion".equals(A0Y)) {
                                    if (!"declaringClass".equals(A0Y) && !"format".equals(A0Y)) {
                                        A0q(c16l, anonymousClass469, this.A00, A0Y);
                                    }
                                }
                            }
                        }
                        c16l.A1P();
                    }
                    c16l.A0z();
                } else {
                    return new StackTraceElement(str, str2, str3, i);
                }
            }
        } else {
            if (A10 == C16R.A0C && anonymousClass469.A0j(EnumC912945i.A0N)) {
                c16l.A1J();
                StackTraceElement A0D = A0D(c16l, anonymousClass469);
                if (c16l.A1J() != C16R.A08) {
                    A0s(anonymousClass469);
                } else {
                    return A0D;
                }
            } else {
                anonymousClass469.A0T(c16l, this.A00);
            }
            throw C00O.createAndThrow();
        }
    }
}
