package X;

import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5sU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129095sU extends AbstractC1344165n {
    public final ThreadFetchReason A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final /* synthetic */ C4KR A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C129095sU(ThreadFetchReason threadFetchReason, C4KR c4kr, Long l, List list, boolean z) {
        super(c4kr, l);
        this.A07 = c4kr;
        this.A03 = new ArrayList();
        this.A02 = null;
        this.A04 = list;
        C01T.A1C(list);
        this.A01 = null;
        this.A05 = z;
        this.A06 = false;
        this.A00 = threadFetchReason;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        if (r0.longValue() >= r1.longValue()) goto L37;
     */
    @Override // X.AbstractC1344165n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129095sU.A04():void");
    }

    @Override // X.AbstractC1344165n, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1736351506);
        C14360o3.A0B(abstractC115105If, 0);
        this.A07.A08.A02(abstractC115105If, super.A03);
        super.onFail(abstractC115105If);
        C0f9.A0A(445629120, A03);
    }

    @Override // X.AbstractC1344165n, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1923557817);
        super.onStart();
        if (super.A00 == 1) {
            this.A07.A06.A04(super.A05, this.A02, this.A01);
        }
        C4KR c4kr = this.A07;
        c4kr.A06.A03(super.A05, this.A02, this.A01);
        c4kr.A08.A05(super.A03);
        C0f9.A0A(1231962006, A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r3 = this;
            X.JSR r2 = X.JSS.A00(r3)
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L34
            java.lang.String r0 = "threadId"
        La:
            r2.A01(r1, r0)
        Ld:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L1a
            r0 = 1222(0x4c6, float:1.712E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r2.A01(r1, r0)
        L1a:
            java.lang.Long r1 = r3.A04
            java.lang.String r0 = "seqId"
            r2.A01(r1, r0)
            java.util.List r0 = r3.A03
            int r1 = r0.size()
            java.lang.String r0 = "pendingSyncMessages"
            r2.A02(r0, r1)
            java.lang.String r0 = r2.toString()
            X.C14360o3.A07(r0)
            return r0
        L34:
            java.util.List r1 = r3.A04
            if (r1 == 0) goto Ld
            java.lang.String r0 = "recipients"
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129095sU.toString():java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C129095sU(ThreadFetchReason threadFetchReason, C4KR c4kr, Long l, String str, String str2, boolean z) {
        super(c4kr, l);
        this.A07 = c4kr;
        this.A03 = new ArrayList();
        this.A02 = str;
        this.A04 = null;
        this.A01 = str2;
        this.A05 = false;
        this.A06 = z;
        this.A00 = threadFetchReason;
    }
}
