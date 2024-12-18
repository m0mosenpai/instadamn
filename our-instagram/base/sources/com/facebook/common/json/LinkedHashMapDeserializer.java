package com.facebook.common.json;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC61761RtG;
import X.AbstractC910944l;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C102274j2;
import X.C16L;
import X.C16R;
import X.C18C;
import X.TID;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public class LinkedHashMapDeserializer extends JsonDeserializer {
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public boolean A02 = false;
    public final AbstractC910944l A03;
    public final Class A04;

    public LinkedHashMapDeserializer(AbstractC910944l abstractC910944l) {
        Class cls = abstractC910944l.A07(0).A00;
        this.A04 = cls;
        C18C.A0G(cls == String.class || Enum.class.isAssignableFrom(cls), "Map keys must be a String or an enum.");
        this.A03 = abstractC910944l.A07(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, X.400, java.io.IOException] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R A11;
        C16R c16r;
        Object obj;
        C102274j2 c102274j2 = (C102274j2) c16l.A1K();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c16l.A14() && (A11 = c16l.A11()) != (c16r = C16R.A0G)) {
            if (A11 == C16R.A0D) {
                if (!this.A02) {
                    Class cls = this.A04;
                    if (cls != String.class) {
                        this.A00 = c102274j2.A0L(anonymousClass469, cls);
                    }
                    this.A02 = true;
                }
                if (this.A01 == null) {
                    this.A01 = c102274j2.A0K(anonymousClass469, this.A03);
                }
                while (AbstractC61761RtG.A00(c16l) != C16R.A09) {
                    if (c16l.A11() == C16R.A0A) {
                        String A0s = AbstractC166997dE.A0s(c16l);
                        C16R A112 = c16l.A11();
                        JsonDeserializer jsonDeserializer = this.A01;
                        if (A112 == c16r) {
                            obj = null;
                        } else {
                            obj = jsonDeserializer.A0D(c16l, anonymousClass469);
                            if (obj == null) {
                            }
                        }
                        String str = A0s;
                        if (this.A00 != null) {
                            C16L A03 = c102274j2.A09.A03(AnonymousClass001.A0g("\"", A0s, "\""));
                            A03.A1J();
                            str = this.A00.A0D(A03, anonymousClass469);
                        }
                        A1I.put(str, obj);
                    }
                }
            } else {
                TID A1H = c16l.A1H();
                ?? iOException = new IOException("Failed to deserialize to a map - missing start_object token", null);
                iOException.A00 = A1H;
                throw iOException;
            }
        } else {
            c16l.A0z();
        }
        return A1I;
    }
}
