package X;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.X6a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C71822X6a extends AbstractC71823X6b {
    public boolean A00;
    public int A01;
    public final JsonObject A02;
    public final SerialDescriptor A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71822X6a(String str, SerialDescriptor serialDescriptor, AbstractC73763Sg abstractC73763Sg, JsonObject jsonObject) {
        super(str, abstractC73763Sg, jsonObject);
        C14360o3.A0B(jsonObject, 2);
        this.A02 = jsonObject;
        this.A03 = serialDescriptor;
    }

    @Override // X.AbstractC71823X6b, kotlinx.serialization.encoding.Decoder
    public final C3T8 ADQ(SerialDescriptor serialDescriptor) {
        C14360o3.A0B(serialDescriptor, 0);
        SerialDescriptor serialDescriptor2 = this.A03;
        if (serialDescriptor == serialDescriptor2) {
            AbstractC73763Sg abstractC73763Sg = ((AbstractC71823X6b) this).A01;
            JsonElement A0H = A0H();
            String BtR = serialDescriptor2.BtR();
            if (A0H instanceof JsonObject) {
                return new C71822X6a(((AbstractC71823X6b) this).A00, serialDescriptor2, abstractC73763Sg, (JsonObject) A0H);
            }
            Map map = C0YZ.A03;
            String A01 = AbstractC13230m9.A01(JsonObject.class);
            Class<?> cls = A0H.getClass();
            C14360o3.A0B(cls, 1);
            throw WG2.A01(A0H.toString(), AnonymousClass001.A16("Expected ", A01, ", but had ", AbstractC13230m9.A01(cls), " as the serialized body of ", BtR, " at element: ", A0E()), -1);
        }
        return super.ADQ(serialDescriptor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r10.B0r(r4).CZW() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00be, code lost:
    
        if (r5 == false) goto L50;
     */
    @Override // X.C3T8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ANz(kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.X6Z
            if (r0 == 0) goto L15
            r2 = r9
            X.X6Z r2 = (X.X6Z) r2
            int r1 = r2.A00
            int r0 = r2.A01
            int r0 = r0 + (-1)
            r4 = -1
            if (r1 >= r0) goto L14
            int r4 = r1 + 1
            r2.A00 = r4
        L14:
            return r4
        L15:
            r3 = 0
            X.C14360o3.A0B(r10, r3)
        L19:
            int r1 = r9.A01
            int r0 = r10.B10()
            if (r1 >= r0) goto Lca
            int r1 = r9.A01
            int r0 = r1 + 1
            r9.A01 = r0
            java.lang.String r7 = r9.A0F(r10, r1)
            X.C14360o3.A0B(r7, r3)
            java.util.ArrayList r0 = r9.A01
            X.AbstractC001800i.A0L(r0)
            int r0 = r9.A01
            int r4 = r0 + (-1)
            r9.A00 = r3
            kotlinx.serialization.json.JsonObject r0 = r9.A02
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto L5f
            X.3Sg r0 = r9.A01
            X.3Si r0 = r0.A00
            boolean r0 = r0.A0A
            if (r0 != 0) goto L5a
            boolean r0 = r10.CSy(r4)
            if (r0 != 0) goto L5a
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r10.B0r(r4)
            boolean r1 = r0.CZW()
            r0 = 1
            if (r1 != 0) goto L5b
        L5a:
            r0 = 0
        L5b:
            r9.A00 = r0
            if (r0 == 0) goto L19
        L5f:
            X.3Si r0 = r9.A02
            boolean r0 = r0.A07
            if (r0 == 0) goto L14
            X.3Sg r6 = r9.A01
            boolean r8 = r10.CSy(r4)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r10.B0r(r4)
            if (r8 == 0) goto L80
            boolean r0 = r2.CZW()
            if (r0 != 0) goto L80
            kotlinx.serialization.json.JsonElement r0 = r9.A0I(r7)
            boolean r0 = r0 instanceof kotlinx.serialization.json.JsonNull
            if (r0 == 0) goto L80
            goto L19
        L80:
            X.3RG r1 = r2.BKw()
            X.4DE r0 = X.C4DE.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L14
            boolean r5 = r2.CZW()
            if (r5 == 0) goto L9b
            kotlinx.serialization.json.JsonElement r0 = r9.A0I(r7)
            boolean r0 = r0 instanceof kotlinx.serialization.json.JsonNull
            if (r0 == 0) goto L9b
            return r4
        L9b:
            kotlinx.serialization.json.JsonElement r1 = r9.A0I(r7)
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L14
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            if (r1 == 0) goto L14
            kotlinx.serialization.descriptors.SerialDescriptor r0 = X.AbstractC100754fe.A00
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonNull
            if (r0 != 0) goto L14
            java.lang.String r0 = r1.A00()
            if (r0 == 0) goto L14
            int r2 = X.C3TL.A01(r0, r2, r6)
            X.3Si r0 = r6.A00
            boolean r0 = r0.A0A
            if (r0 != 0) goto Lc0
            r1 = 1
            if (r5 != 0) goto Lc1
        Lc0:
            r1 = 0
        Lc1:
            r0 = -3
            if (r2 != r0) goto L14
            if (r8 != 0) goto L19
            if (r1 == 0) goto L14
            goto L19
        Lca:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71822X6a.ANz(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }
}
