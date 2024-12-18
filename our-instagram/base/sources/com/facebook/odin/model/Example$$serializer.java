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
import java.util.HashMap;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class Example$$serializer implements InterfaceC73823Sp {
    public static final Example$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    @Override // X.C3RB
    public final Example deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = Example.A04;
        String str = null;
        ExampleContext exampleContext = null;
        HashMap hashMap = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            hashMap = (HashMap) ADQ.AOF(hashMap, c3r9Arr[2], serialDescriptor, 2);
                            i |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        exampleContext = (ExampleContext) ADQ.AOF(exampleContext, ExampleContext$$serializer.INSTANCE, serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new Example(exampleContext, str, hashMap, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (X.C14360o3.A0K(r10.A02, new java.util.HashMap()) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r4.ASc(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        r4.ASH(r10.A02, r6[2], r3, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r4.ASH(r10.A00, com.facebook.odin.model.ExampleContext$$serializer.INSTANCE, r3, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r5 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (X.C14360o3.A0K(r10.A00, com.facebook.odin.model.ExampleContext.A05) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r5 != false) goto L13;
     */
    @Override // X.C3RA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r9, com.facebook.odin.model.Example r10) {
        /*
            r8 = this;
            r7 = 0
            X.C14360o3.A0B(r9, r7)
            r2 = 1
            X.C14360o3.A0B(r10, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r3 = com.facebook.odin.model.Example$$serializer.descriptor
            X.4D8 r4 = r9.ADR(r3)
            X.3R9[] r6 = com.facebook.odin.model.Example.A04
            r0 = r4
            X.4DB r0 = (X.C4DB) r0
            X.3Si r0 = r0.A04
            boolean r5 = r0.A09
            if (r5 != 0) goto L23
            java.lang.String r1 = r10.A01
            java.lang.String r0 = "identity"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L4c
        L23:
            java.lang.String r0 = r10.A01
            r4.ASL(r0, r3, r7)
            if (r5 == 0) goto L4c
        L2a:
            com.facebook.odin.model.ExampleContext$$serializer r1 = com.facebook.odin.model.ExampleContext$$serializer.INSTANCE
            com.facebook.odin.model.ExampleContext r0 = r10.A00
            r4.ASH(r0, r1, r3, r2)
        L31:
            r2 = 2
            if (r5 != 0) goto L41
            java.util.HashMap r1 = r10.A02
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L48
        L41:
            r1 = r6[r2]
            java.util.HashMap r0 = r10.A02
            r4.ASH(r0, r1, r3, r2)
        L48:
            r4.ASc(r3)
            return
        L4c:
            com.facebook.odin.model.ExampleContext r1 = r10.A00
            com.facebook.odin.model.ExampleContext r0 = com.facebook.odin.model.ExampleContext.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L31
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.odin.model.Example$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.odin.model.Example):void");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.odin.model.Example$$serializer, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        INSTANCE = obj;
        C73833Sq c73833Sq = new C73833Sq("com.facebook.odin.model.Example", obj, 3);
        c73833Sq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        c73833Sq.A01("exampleContext", true);
        c73833Sq.A01("features", true);
        descriptor = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C3RD.A01, ExampleContext$$serializer.INSTANCE, Example.A04[2]};
    }

    @Override // X.InterfaceC73823Sp
    public C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
