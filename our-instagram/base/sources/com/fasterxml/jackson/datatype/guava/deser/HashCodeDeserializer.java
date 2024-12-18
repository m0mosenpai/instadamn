package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC50542Tz;
import X.AnonymousClass469;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.util.Locale;

/* loaded from: classes10.dex */
public class HashCodeDeserializer extends FromStringDeserializer {
    public static final HashCodeDeserializer A00 = new HashCodeDeserializer();

    public HashCodeDeserializer() {
        super(AbstractC50542Tz.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public final /* bridge */ /* synthetic */ Object A0z(AnonymousClass469 anonymousClass469, String str) {
        return AbstractC50542Tz.A01(str.toLowerCase(Locale.ENGLISH));
    }
}
