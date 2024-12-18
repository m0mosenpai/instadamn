package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC167007dF;
import X.AbstractC58321PtD;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C46K;
import X.C910844k;
import X.InterfaceC65620ToB;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class StringArraySerializer extends ArraySerializerBase implements C46K {
    public final JsonSerializer A00;
    public static final AbstractC910944l A02 = C910844k.A0A.A0C(String.class);
    public static final StringArraySerializer A01 = new StringArraySerializer();

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        r2.A0A(r5, r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0018, code lost:
    
        r0 = r7[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001a, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
    
        r5.A0b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0021, code lost:
    
        if (r1 >= r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0024, code lost:
    
        r5.A0u(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
    
        r0 = r7[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        r6.A0T(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r1 >= r3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.AnonymousClass182 r5, X.AbstractC913345m r6, java.lang.String[] r7) {
        /*
            r4 = this;
            int r3 = r7.length
            if (r3 == 0) goto L28
            com.fasterxml.jackson.databind.JsonSerializer r2 = r4.A00
            r1 = 0
            if (r2 == 0) goto L18
        L8:
            r0 = r7[r1]
            if (r0 != 0) goto L14
            r6.A0T(r5)
        Lf:
            int r1 = r1 + 1
            if (r1 >= r3) goto L28
            goto L8
        L14:
            r2.A0A(r5, r6, r0)
            goto Lf
        L18:
            r0 = r7[r1]
            if (r0 != 0) goto L24
            r5.A0b()
        L1f:
            int r1 = r1 + 1
            if (r1 >= r3) goto L28
            goto L18
        L24:
            r5.A0u(r0)
            goto L1f
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.StringArraySerializer.A0E(X.182, X.45m, java.lang.String[]):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Boolean bool;
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        if (length == 1 && (((bool = this.A01) == null && AbstractC58321PtD.A1V(abstractC913345m)) || bool == Boolean.TRUE)) {
            A0E(anonymousClass182, abstractC913345m, strArr);
            return;
        }
        anonymousClass182.A0q(strArr, length);
        A0E(anonymousClass182, abstractC913345m, strArr);
        anonymousClass182.A0Z();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return AbstractC167007dF.A1N(((String[]) obj).length);
    }

    public StringArraySerializer(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, StringArraySerializer stringArraySerializer, Boolean bool) {
        super(interfaceC65620ToB, stringArraySerializer, bool);
        this.A00 = jsonSerializer;
    }

    public StringArraySerializer() {
        super(String[].class);
        this.A00 = null;
    }
}
