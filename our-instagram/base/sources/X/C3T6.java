package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.3T6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3T6 extends C3T7 implements C3TA {
    public int A00;
    public C120605d5 A01;
    public final AbstractC73763Sg A02;
    public final C73783Si A03;
    public final C3T3 A04;
    public final C5d6 A05;
    public final C3T5 A06;
    public final C73803Sk A07;

    public C3T6(SerialDescriptor serialDescriptor, AbstractC73763Sg abstractC73763Sg, C3T3 c3t3, C120605d5 c120605d5, C3T5 c3t5) {
        C5d6 c5d6;
        C14360o3.A0B(abstractC73763Sg, 1);
        C14360o3.A0B(serialDescriptor, 4);
        this.A02 = abstractC73763Sg;
        this.A06 = c3t5;
        this.A04 = c3t3;
        this.A07 = abstractC73763Sg.A02;
        this.A00 = -1;
        this.A01 = c120605d5;
        C73783Si c73783Si = abstractC73763Sg.A00;
        this.A03 = c73783Si;
        if (c73783Si.A0A) {
            c5d6 = null;
        } else {
            c5d6 = new C5d6(serialDescriptor);
        }
        this.A05 = c5d6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x00f2, code lost:
    
        if (r2 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x028f, code lost:
    
        r0 = "object";
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0096, code lost:
    
        if (r16.A02.A00.A06 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x025d, code lost:
    
        X.C14360o3.A0B(r10, 0);
        r1 = ((X.C3T2) r3).A00.subSequence(0, r3.A00).toString();
        X.C14360o3.A0B(r1, 0);
        r2 = X.AbstractC001900j.A07(r1, r10, r1.length() - 1);
        r1 = X.AnonymousClass001.A0S(X.AbstractC111324zv.A00(1604), r10, '\'');
        r0 = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0191, code lost:
    
        r1.append(r0);
        r1.append(r3.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a5, code lost:
    
        throw X.WG2.A01(((X.C3T2) r3).A00, r1.toString(), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    @Override // X.C3T8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ANz(kotlinx.serialization.descriptors.SerialDescriptor r17) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3T6.ANz(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // X.C3TA
    public final JsonElement AOA() {
        return new WEc(this.A02.A00, this.A04).A03();
    }

    @Override // X.C3T8, kotlinx.serialization.encoding.Decoder
    public final C73803Sk BtX() {
        return this.A07;
    }
}
