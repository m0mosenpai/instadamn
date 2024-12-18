package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC64290T7z;
import X.AnonymousClass469;
import X.C63202Sf5;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

/* loaded from: classes10.dex */
public class InternetDomainNameDeserializer extends FromStringDeserializer {
    public static final InternetDomainNameDeserializer A00 = new InternetDomainNameDeserializer();

    public InternetDomainNameDeserializer() {
        super(C63202Sf5.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public final /* bridge */ /* synthetic */ Object A0z(AnonymousClass469 anonymousClass469, String str) {
        AbstractC64290T7z abstractC64290T7z = C63202Sf5.A02;
        str.getClass();
        return new C63202Sf5(str);
    }
}
