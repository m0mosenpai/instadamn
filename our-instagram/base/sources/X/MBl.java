package X;

import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl;
import com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel;
import com.instagram.gallery.scanner.MediaScannerScheduler;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MBl extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02 = 0;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBl(C43888Jav c43888Jav, MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl, C60352pJ c60352pJ, C47365KwG c47365KwG, MagicMediaRemixViewModel magicMediaRemixViewModel, C9ZK c9zk, List list, List list2, Map map, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = list;
        this.A0B = magicMediaRemixViewModel;
        this.A01 = c9zk;
        this.A08 = list2;
        this.A07 = c60352pJ;
        this.A09 = map;
        this.A05 = magicMediaRemixContentCompositorImpl;
        this.A04 = c43888Jav;
        this.A03 = i;
        this.A0A = c47365KwG;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            MagicMediaRemixViewModel magicMediaRemixViewModel = (MagicMediaRemixViewModel) this.A0B;
            C43901JbB c43901JbB = (C43901JbB) this.A0A;
            InterfaceC19630xq interfaceC19630xq = (InterfaceC19630xq) this.A09;
            C189268a2 c189268a2 = (C189268a2) this.A06;
            MediaScannerScheduler mediaScannerScheduler = (MediaScannerScheduler) this.A08;
            MBl mBl = new MBl((MagicMediaRemixContentCompositorImpl) this.A05, (C47365KwG) this.A07, magicMediaRemixViewModel, c189268a2, mediaScannerScheduler, c43901JbB, interfaceC19630xq, interfaceC23621Ds, (InterfaceC16660sJ) this.A04, this.A03);
            mBl.A01 = obj;
            return mBl;
        }
        List list = (List) this.A06;
        MagicMediaRemixViewModel magicMediaRemixViewModel2 = (MagicMediaRemixViewModel) this.A0B;
        C9ZK c9zk = (C9ZK) this.A01;
        List list2 = (List) this.A08;
        C60352pJ c60352pJ = (C60352pJ) this.A07;
        Map map = (Map) this.A09;
        MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl = (MagicMediaRemixContentCompositorImpl) this.A05;
        return new MBl((C43888Jav) this.A04, magicMediaRemixContentCompositorImpl, c60352pJ, (C47365KwG) this.A0A, magicMediaRemixViewModel2, c9zk, list, list2, map, interfaceC23621Ds, this.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[RETURN] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBl) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBl(MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl, C47365KwG c47365KwG, MagicMediaRemixViewModel magicMediaRemixViewModel, C189268a2 c189268a2, MediaScannerScheduler mediaScannerScheduler, C43901JbB c43901JbB, InterfaceC19630xq interfaceC19630xq, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(2, interfaceC23621Ds);
        this.A0B = magicMediaRemixViewModel;
        this.A0A = c43901JbB;
        this.A09 = interfaceC19630xq;
        this.A06 = c189268a2;
        this.A08 = mediaScannerScheduler;
        this.A05 = magicMediaRemixContentCompositorImpl;
        this.A04 = interfaceC16660sJ;
        this.A03 = i;
        this.A07 = c47365KwG;
    }
}
