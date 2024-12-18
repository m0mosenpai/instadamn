package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC58319PtB;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class NumberDeserializers$CharacterDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$CharacterDeserializer A00;
    public static final NumberDeserializers$CharacterDeserializer A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer] */
    static {
        Class cls = Character.TYPE;
        Integer num = C05F.A0j;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, (char) 0, (char) 0);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Character.class, num, null, (char) 0);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        char charAt;
        int A0x = c16l.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x != 6) {
                        if (A0x != 7) {
                            AbstractC58319PtB.A1G(c16l, anonymousClass469, this);
                        } else {
                            Integer A0N = anonymousClass469.A0N(((NumberDeserializers$PrimitiveOrWrapperDeserializer) this).A00, C05F.A0C);
                            int intValue = A0N.intValue();
                            if (intValue != 0) {
                                if (intValue != 2) {
                                    if (intValue != 3) {
                                        int A0i = c16l.A0i();
                                        if (A0i >= 0 && A0i <= 65535) {
                                            charAt = (char) A0i;
                                            return Character.valueOf(charAt);
                                        }
                                        anonymousClass469.A0c(A0H(), Integer.valueOf(A0i), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                                    }
                                    return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) this).A01;
                                }
                            } else {
                                A0t(anonymousClass469, A0N, c16l.A0p(), AnonymousClass001.A0g("Integer value (", c16l.A1P(), ")"));
                            }
                        }
                    } else {
                        String A1P = c16l.A1P();
                        if (A1P.length() == 1) {
                            charAt = A1P.charAt(0);
                            return Character.valueOf(charAt);
                        }
                        Integer A0e = A0e(anonymousClass469, A1P);
                        if (A0e != C05F.A0C) {
                            if (A0e != C05F.A0N) {
                                String trim = A1P.trim();
                                if (!A0w(anonymousClass469, trim)) {
                                    anonymousClass469.A0e(A0H(), trim, "Expected either Integer value code or 1-character String", new Object[0]);
                                }
                            }
                            return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) this).A01;
                        }
                    }
                } else if (this.A03) {
                    A0r(anonymousClass469);
                }
                return BXX(anonymousClass469);
            }
            return A0g(c16l, anonymousClass469);
        }
        anonymousClass469.A0T(c16l, ((StdDeserializer) this).A00);
        throw C00O.createAndThrow();
    }
}
