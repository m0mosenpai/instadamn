package com.facebook.common.json;

import X.AbstractC61761RtG;
import X.AbstractC63327Shb;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C16R;
import X.SQr;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Constructor;

/* loaded from: classes2.dex */
public class FbJsonDeserializer extends JsonDeserializer {
    public Class A00;

    public FbJsonField A0N(String str) {
        return null;
    }

    public final Object A0O() {
        try {
            Constructor declaredConstructor = this.A00.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(AnonymousClass001.A0R(this.A00.getName(), " missing default constructor"), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        try {
            Object A0O = A0O();
            while (AbstractC61761RtG.A00(c16l) != C16R.A09) {
                if (c16l.A11() == C16R.A0A) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    FbJsonField A0N = A0N(A0q);
                    if (A0N != null) {
                        A0N.deserialize(A0O, c16l, anonymousClass469);
                    } else {
                        c16l.A0z();
                    }
                }
            }
            return A0O;
        } catch (Exception e) {
            AbstractC63327Shb.A03(e);
            SQr.A00(c16l, this.A00, e);
            throw C00O.createAndThrow();
        }
    }
}
