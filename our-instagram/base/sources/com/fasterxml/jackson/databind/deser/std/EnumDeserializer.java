package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC58320PtC;
import X.AnonymousClass469;
import X.C05F;
import X.C2I7;
import X.EnumC61060ReZ;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.TI9;
import X.TIG;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class EnumDeserializer extends StdScalarDeserializer implements InterfaceC102474jf {
    public TI9 A00;
    public Object[] A01;
    public final TI9 A02;
    public final Boolean A03;
    public final Enum A04;
    public final boolean A05;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        return true;
    }

    public EnumDeserializer(TIG tig, Boolean bool) {
        super(tig.A00);
        this.A02 = tig.A02();
        this.A01 = tig.A05;
        this.A04 = tig.A01;
        this.A03 = bool;
        this.A05 = tig.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0150, code lost:
    
        if (r2 != null) goto L87;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(X.C16L r8, X.AnonymousClass469 r9) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A1F;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return this.A04;
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        Class A0H = A0H();
        Boolean A01 = AbstractC58320PtC.A0a(interfaceC65620ToB, anonymousClass469, A0H).A01(EnumC61060ReZ.A00);
        if (A01 == null) {
            A01 = this.A03;
        }
        if (C2I7.A00(this.A03, A01)) {
            return this;
        }
        return new EnumDeserializer(this, A01);
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super(enumDeserializer);
        this.A02 = enumDeserializer.A02;
        this.A01 = enumDeserializer.A01;
        this.A04 = enumDeserializer.A04;
        this.A03 = bool;
        this.A05 = enumDeserializer.A05;
    }
}
