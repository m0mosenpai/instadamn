package androidx.paging;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC18560vj;
import X.AbstractC23611Dp;
import X.AnonymousClass139;
import X.C0eB;
import X.C11950ju;
import X.C14360o3;
import X.C16330re;
import X.C1JX;
import X.C51057MhB;
import X.C51058MhC;
import X.EnumC53109NeM;
import X.InterfaceC06180Ui;
import X.InterfaceC16610sE;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import X.OLR;
import X.OMK;
import X.PVA;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {232, 99}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, s = {"L$1", "L$2", "I$0"})
/* loaded from: classes9.dex */
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public int A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ EnumC53109NeM A05;
    public final /* synthetic */ PageFetcherSnapshot A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(EnumC53109NeM enumC53109NeM, PageFetcherSnapshot pageFetcherSnapshot, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A06 = pageFetcherSnapshot;
        this.A05 = enumC53109NeM;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcherSnapshot pageFetcherSnapshot = this.A06;
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(this.A05, pageFetcherSnapshot, (InterfaceC23621Ds) obj3);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.A03 = obj;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.A04 = obj2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC19960yQ interfaceC19960yQ;
        int A0H;
        PageFetcherSnapshotState$Holder pageFetcherSnapshotState$Holder;
        AnonymousClass139 anonymousClass139;
        InterfaceC19390xP pva;
        C1JX c1jx = C1JX.A02;
        int i = this.A01;
        int i2 = 1;
        try {
            if (i != 0) {
                if (i != 1) {
                    AbstractC09560e7.A00(obj);
                    return C0eB.A00;
                }
                A0H = this.A00;
                anonymousClass139 = (AnonymousClass139) this.A02;
                pageFetcherSnapshotState$Holder = (PageFetcherSnapshotState$Holder) this.A04;
                interfaceC19960yQ = (InterfaceC19960yQ) this.A03;
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                interfaceC19960yQ = (InterfaceC19960yQ) this.A03;
                A0H = AbstractC166987dD.A0H(this.A04);
                pageFetcherSnapshotState$Holder = this.A06.A01;
                anonymousClass139 = pageFetcherSnapshotState$Holder.A01;
                this.A03 = interfaceC19960yQ;
                this.A04 = pageFetcherSnapshotState$Holder;
                this.A02 = anonymousClass139;
                this.A00 = A0H;
                this.A01 = 1;
                if (AnonymousClass139.A00(this, anonymousClass139) == c1jx) {
                    return c1jx;
                }
            }
            OMK omk = pageFetcherSnapshotState$Holder.A00.A03;
            EnumC53109NeM enumC53109NeM = this.A05;
            if (C14360o3.A0K(omk.A00(enumC53109NeM), C51057MhB.A00)) {
                pva = new C11950ju(new OLR[0], 2);
            } else {
                if (!(omk.A00(enumC53109NeM) instanceof C51058MhC)) {
                    omk.A02(C51057MhB.A01, enumC53109NeM);
                }
                anonymousClass139.A04(null);
                InterfaceC06180Ui A00 = this.A06.A00.A00(enumC53109NeM);
                if (A0H == 0) {
                    i2 = 0;
                }
                pva = new PVA(new C16330re(A00, i2), A0H);
            }
            this.A03 = null;
            this.A04 = null;
            this.A02 = null;
            this.A01 = 2;
            if (AbstractC18560vj.A02(this, pva, interfaceC19960yQ) == c1jx) {
                return c1jx;
            }
            return C0eB.A00;
        } finally {
            anonymousClass139.A04(null);
        }
    }
}
