package X;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39601sh {
    public final C39611sj A00;
    public final HashMap A01;
    public final InterfaceC39641sn A02;
    public final AtomicReference A03;
    public final AtomicReference A04;

    public C39601sh(String str, ByteBuffer byteBuffer) {
        int i;
        int i2;
        C14360o3.A0B(str, 2);
        this.A00 = C39611sj.A01(byteBuffer);
        this.A02 = AbstractC39621sl.A00(str);
        this.A01 = new HashMap();
        this.A04 = new AtomicReference(new HashMap());
        this.A03 = new AtomicReference();
        C39611sj c39611sj = this.A00;
        int A02 = c39611sj.A02(24);
        if (A02 != 0) {
            i = c39611sj.A04(A02);
        } else {
            i = 0;
        }
        int A022 = c39611sj.A02(26);
        if (A022 != 0) {
            i2 = c39611sj.A04(A022);
        } else {
            i2 = 0;
        }
        if (i == i2) {
            if (i > 0) {
                int i3 = i - 1;
                int A023 = c39611sj.A02(24);
                if (A023 != 0) {
                    c39611sj.A05(c39611sj.A03(A023) + (i3 * 4));
                }
                c39611sj.A06(i3);
                return;
            }
            return;
        }
        throw new RuntimeException(AnonymousClass001.A0n("Error loading flatbuffer language pack. The sizes of resource ids (", ") and resource values (", ") do not match.", i, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        if (r5 != null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00(java.lang.String r11, int[] r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39601sh.A00(java.lang.String, int[]):java.lang.String");
    }
}
