package com.facebook.odin.model;

import X.AbstractC54355O0n;
import X.AbstractC68219VIb;
import X.C14360o3;
import X.C3R9;
import X.C3RD;
import X.C3T8;
import X.C73833Sq;
import X.InterfaceC73823Sp;
import X.X6K;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ExampleContext$$serializer implements InterfaceC73823Sp {
    public static final ExampleContext$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    @Override // X.C3RB
    public final ExampleContext deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = ExampleContext.A06;
        String str = null;
        Type type = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz != 3) {
                                if (ANz == 4) {
                                    map3 = (Map) ADQ.AOF(map3, c3r9Arr[4], serialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    throw new X6K(ANz);
                                }
                            } else {
                                map2 = (Map) ADQ.AOF(map2, c3r9Arr[3], serialDescriptor, 3);
                                i |= 8;
                            }
                        } else {
                            map = (Map) ADQ.AOF(map, c3r9Arr[2], serialDescriptor, 2);
                            i |= 4;
                        }
                    } else {
                        type = (Type) ADQ.AOF(type, c3r9Arr[1], serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new ExampleContext(type, str, map, map2, map3, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (X.C14360o3.A0K(r10.A03, new java.util.LinkedHashMap()) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r5 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (X.C14360o3.A0K(r10.A02, new java.util.LinkedHashMap()) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r5 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (X.C14360o3.A0K(r10.A04, new java.util.LinkedHashMap()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        r3.ASc(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r3.ASH(r10.A04, r6[4], r2, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r3.ASH(r10.A02, r6[3], r2, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        r3.ASH(r10.A03, r6[2], r2, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r3.ASH(r10.A00, r6[1], r2, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0028, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007e, code lost:
    
        if (r10.A00 != com.facebook.odin.model.Type.A0C) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r5 != false) goto L13;
     */
    @Override // X.C3RA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r9, com.facebook.odin.model.ExampleContext r10) {
        /*
            r8 = this;
            r7 = 0
            X.C14360o3.A0B(r9, r7)
            r4 = 1
            X.C14360o3.A0B(r10, r4)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = com.facebook.odin.model.ExampleContext$$serializer.descriptor
            X.4D8 r3 = r9.ADR(r2)
            X.3R9[] r6 = com.facebook.odin.model.ExampleContext.A06
            r0 = r3
            X.4DB r0 = (X.C4DB) r0
            X.3Si r0 = r0.A04
            boolean r5 = r0.A09
            if (r5 != 0) goto L23
            java.lang.String r1 = r10.A01
            java.lang.String r0 = ""
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L7a
        L23:
            java.lang.String r0 = r10.A01
            r3.ASL(r0, r2, r7)
            if (r5 == 0) goto L7a
        L2a:
            r1 = r6[r4]
            com.facebook.odin.model.Type r0 = r10.A00
            r3.ASH(r0, r1, r2, r4)
        L31:
            r4 = 2
            if (r5 != 0) goto L41
            java.util.Map r1 = r10.A03
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L48
        L41:
            r1 = r6[r4]
            java.util.Map r0 = r10.A03
            r3.ASH(r0, r1, r2, r4)
        L48:
            r4 = 3
            if (r5 != 0) goto L58
            java.util.Map r1 = r10.A02
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L5f
        L58:
            r1 = r6[r4]
            java.util.Map r0 = r10.A02
            r3.ASH(r0, r1, r2, r4)
        L5f:
            r4 = 4
            if (r5 != 0) goto L6f
            java.util.Map r1 = r10.A04
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L76
        L6f:
            r1 = r6[r4]
            java.util.Map r0 = r10.A04
            r3.ASH(r0, r1, r2, r4)
        L76:
            r3.ASc(r2)
            return
        L7a:
            com.facebook.odin.model.Type r1 = r10.A00
            com.facebook.odin.model.Type r0 = com.facebook.odin.model.Type.A0C
            if (r1 == r0) goto L31
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.odin.model.ExampleContext$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.odin.model.ExampleContext):void");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.odin.model.ExampleContext$$serializer, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.odin.model.ExampleContext", obj, 5);
        c73833Sq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        c73833Sq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, true);
        c73833Sq.A01("longMap", true);
        c73833Sq.A01("doubleMap", true);
        c73833Sq.A01("stringMap", true);
        descriptor = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = ExampleContext.A06;
        return new C3R9[]{C3RD.A01, c3r9Arr[1], c3r9Arr[2], c3r9Arr[3], c3r9Arr[4]};
    }

    @Override // X.InterfaceC73823Sp
    public C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
