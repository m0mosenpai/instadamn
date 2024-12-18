package X;

import com.fasterxml.jackson.databind.JsonDeserializer;

/* renamed from: X.RBa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C60585RBa extends C60586RBb {
    public final EnumC61124Rfe A00;
    public final String A01;

    public final Object A0B(C16L c16l, AnonymousClass469 anonymousClass469, C914146b c914146b, String str) {
        if (this.A03 == null) {
            Object A01 = AbstractC63020Sal.A01(c16l, this.A02);
            if (A01 == null) {
                if (c16l.A16()) {
                    return A09(c16l, anonymousClass469);
                }
                if (c16l.A19(C16R.A0J) && anonymousClass469.A0j(EnumC912945i.A04) && c16l.A1P().trim().isEmpty()) {
                    return null;
                }
            } else {
                return A01;
            }
        }
        JsonDeserializer A07 = A07(anonymousClass469);
        if (A07 == null) {
            AbstractC910944l abstractC910944l = this.A02;
            if (anonymousClass469.A02.A08 != null) {
                throw AbstractC166987dD.A15("handleMissingTypeId");
            }
            String format = String.format("Could not resolve subtype of %s", abstractC910944l);
            C16L c16l2 = anonymousClass469.A07;
            if (str != null) {
                format = AnonymousClass001.A0g(format, ": ", str);
            }
            throw new RB8(c16l2, abstractC910944l, format);
        }
        if (c914146b != null) {
            c914146b.A0a();
            c16l = c914146b.A11(c16l);
            c16l.A1J();
        }
        return A07.A0D(c16l, anonymousClass469);
    }

    public C60585RBa(InterfaceC65620ToB interfaceC65620ToB, C60585RBa c60585RBa) {
        super(interfaceC65620ToB, c60585RBa);
        Object[] objArr;
        String str;
        InterfaceC65620ToB interfaceC65620ToB2 = super.A01;
        if (interfaceC65620ToB2 == null) {
            objArr = new Object[]{this.A05};
            str = "missing type id property '%s'";
        } else {
            objArr = new Object[]{this.A05, interfaceC65620ToB2.getName()};
            str = "missing type id property '%s' (for POJO property '%s')";
        }
        this.A01 = String.format(str, objArr);
        this.A00 = c60585RBa.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r6 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(X.C16L r4, X.AnonymousClass469 r5, X.C914146b r6, java.lang.String r7) {
        /*
            r3 = this;
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r3.A08(r5, r7)
            boolean r0 = r3.A07
            if (r0 == 0) goto L34
            if (r6 != 0) goto Lf
            X.46b r6 = new X.46b
            r6.<init>(r4, r5)
        Lf:
            java.lang.String r0 = r4.A0Y()
            r6.A0r(r0)
            r6.A0u(r7)
        L19:
            r4.A13()
            X.R8k r0 = r6.A11(r4)
            X.R8u r4 = X.C60579R8u.A00(r0, r4)
        L24:
            X.16R r1 = r4.A10()
            X.16R r0 = X.C16R.A09
            if (r1 == r0) goto L2f
            r4.A1J()
        L2f:
            java.lang.Object r0 = r2.A0D(r4, r5)
            return r0
        L34:
            if (r6 == 0) goto L24
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60585RBa.A0A(X.16L, X.469, X.46b, java.lang.String):java.lang.Object");
    }

    public C60585RBa(EnumC61124Rfe enumC61124Rfe, AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2, InterfaceC65565Tmr interfaceC65565Tmr, String str, boolean z) {
        super(abstractC910944l, abstractC910944l2, interfaceC65565Tmr, str, z);
        Object[] objArr;
        String str2;
        InterfaceC65620ToB interfaceC65620ToB = super.A01;
        if (interfaceC65620ToB == null) {
            objArr = new Object[]{this.A05};
            str2 = "missing type id property '%s'";
        } else {
            objArr = new Object[]{this.A05, interfaceC65620ToB.getName()};
            str2 = "missing type id property '%s' (for POJO property '%s')";
        }
        this.A01 = String.format(str2, objArr);
        this.A00 = enumC61124Rfe;
    }
}
