package com.facebook.common.json;

import X.AbstractC166997dE;
import X.AbstractC58319PtB;
import X.AbstractC61761RtG;
import X.AbstractC910944l;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C102274j2;
import X.C102314j6;
import X.C16L;
import X.C16R;
import X.C18C;
import X.TID;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;

/* loaded from: classes10.dex */
public class ImmutableMapDeserializer extends JsonDeserializer {
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public boolean A02 = false;
    public final AbstractC910944l A03;
    public final Class A04;

    public ImmutableMapDeserializer(AbstractC910944l abstractC910944l) {
        Class cls = abstractC910944l.A07(0).A00;
        this.A04 = cls;
        C18C.A0G(cls == String.class || Enum.class.isAssignableFrom(cls), "Map keys must be a String or an enum.");
        this.A03 = abstractC910944l.A07(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, X.400, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R A11;
        C102274j2 c102274j2 = (C102274j2) c16l.A1K();
        if (c16l.A14() && (A11 = c16l.A11()) != C16R.A0G) {
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
                ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
                while (AbstractC61761RtG.A00(c16l) != C16R.A09) {
                    if (c16l.A11() == C16R.A0A) {
                        Object A0s = AbstractC166997dE.A0s(c16l);
                        Object A0D = this.A01.A0D(c16l, anonymousClass469);
                        if (A0D != null) {
                            if (this.A00 != null) {
                                C16L A03 = c102274j2.A09.A03(AnonymousClass001.A0g("\"", A0s, "\""));
                                A03.A1J();
                                try {
                                    A0s = this.A00.A0D(A03, anonymousClass469);
                                } catch (C102314j6 unused) {
                                }
                            }
                            A0Z.put(A0s, A0D);
                        }
                    }
                }
                return A0Z.buildOrThrow();
            }
            TID A1H = c16l.A1H();
            ?? iOException = new IOException("Failed to deserialize to a map - missing start_object token", null);
            iOException.A00 = A1H;
            throw iOException;
        }
        c16l.A0z();
        return RegularImmutableMap.A02;
    }
}
