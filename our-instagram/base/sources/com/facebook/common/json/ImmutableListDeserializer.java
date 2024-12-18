package com.facebook.common.json;

import X.AbstractC61761RtG;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C102274j2;
import X.C16L;
import X.C16R;
import X.C910844k;
import X.RB6;
import X.TID;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes10.dex */
public class ImmutableListDeserializer extends JsonDeserializer {
    public JsonDeserializer A00;
    public final AbstractC910944l A01;
    public final Class A02;

    public ImmutableListDeserializer(AbstractC910944l abstractC910944l) {
        this.A02 = null;
        AbstractC910944l A07 = abstractC910944l.A07(0);
        this.A01 = A07 == null ? C910844k.A07 : A07;
        this.A00 = null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, X.400, java.io.IOException] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R A11;
        C102274j2 c102274j2 = (C102274j2) c16l.A1K();
        if (c16l.A14() && (A11 = c16l.A11()) != C16R.A0G) {
            if (A11 == C16R.A0C) {
                if (this.A00 == null) {
                    Type type = this.A02;
                    if (type == null) {
                        type = this.A01;
                    }
                    this.A00 = c102274j2.A0M(anonymousClass469, type);
                }
                ImmutableList.Builder builder = ImmutableList.builder();
                while (AbstractC61761RtG.A00(c16l) != C16R.A08) {
                    try {
                        Object A0D = this.A00.A0D(c16l, anonymousClass469);
                        if (A0D != null) {
                            builder.add(A0D);
                        }
                    } catch (RB6 unused) {
                    }
                }
                return builder.build();
            }
            TID A1H = c16l.A1H();
            ?? iOException = new IOException("Failed to deserialize to a list - missing start_array token", null);
            iOException.A00 = A1H;
            throw iOException;
        }
        c16l.A0z();
        return ImmutableList.of();
    }

    public ImmutableListDeserializer(JsonDeserializer jsonDeserializer) {
        this.A02 = null;
        this.A01 = null;
        this.A00 = jsonDeserializer;
    }

    public ImmutableListDeserializer(Class cls) {
        this.A02 = cls;
        this.A01 = null;
        this.A00 = null;
    }
}
