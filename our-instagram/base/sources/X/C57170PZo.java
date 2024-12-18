package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel;
import com.instagram.direct.store.impl.sqlite.DirectThreadsParser;
import com.instagram.gallery.scanner.MediaScannerScheduler;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.PZo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57170PZo extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57170PZo(MagicMediaRemixViewModel magicMediaRemixViewModel, MediaScannerScheduler mediaScannerScheduler, C43901JbB c43901JbB, List list, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = 9;
        this.A05 = magicMediaRemixViewModel;
        this.A01 = c43901JbB;
        this.A08 = list;
        this.A07 = mediaScannerScheduler;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        C57170PZo c57170PZo;
        C57170PZo c57170PZo2;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        int i2;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        int i3;
        switch (this.A06) {
            case 0:
                obj2 = this.A08;
                obj3 = this.A05;
                obj4 = this.A07;
                i = 0;
                C57170PZo c57170PZo3 = new C57170PZo(obj2, obj3, obj4, interfaceC23621Ds, i);
                c57170PZo3.A01 = obj;
                return c57170PZo3;
            case 1:
                Object obj18 = this.A07;
                Object obj19 = this.A08;
                c57170PZo = new C57170PZo(interfaceC23621Ds, this.A05, this.A03, this.A02, obj18, this.A01, obj19, 1);
                c57170PZo.A04 = obj;
                return c57170PZo;
            case 2:
                Object obj20 = this.A08;
                Object obj21 = this.A05;
                Object obj22 = this.A07;
                return new C57170PZo(interfaceC23621Ds, obj21, this.A03, this.A02, obj22, this.A01, obj20, 2);
            case 3:
                obj12 = this.A01;
                obj11 = this.A04;
                obj15 = this.A08;
                obj17 = this.A03;
                obj13 = this.A05;
                obj16 = this.A02;
                obj14 = this.A07;
                i3 = 3;
                return new C57170PZo(obj11, obj12, obj13, obj14, obj15, obj16, obj17, interfaceC23621Ds, i3);
            case 4:
                obj13 = this.A05;
                obj15 = this.A08;
                obj12 = this.A01;
                obj14 = this.A07;
                obj11 = this.A04;
                obj16 = this.A02;
                obj17 = this.A03;
                i3 = 4;
                return new C57170PZo(obj11, obj12, obj13, obj14, obj15, obj16, obj17, interfaceC23621Ds, i3);
            case 5:
                obj6 = this.A07;
                obj8 = this.A02;
                obj7 = this.A03;
                obj5 = this.A04;
                obj9 = this.A01;
                obj10 = this.A08;
                i2 = 5;
                c57170PZo2 = new C57170PZo(obj6, obj10, obj5, obj7, obj9, obj8, interfaceC23621Ds, i2);
                c57170PZo2.A05 = obj;
                return c57170PZo2;
            case 6:
                obj5 = this.A04;
                obj6 = this.A07;
                obj7 = this.A03;
                obj8 = this.A02;
                obj9 = this.A01;
                obj10 = this.A08;
                i2 = 6;
                c57170PZo2 = new C57170PZo(obj6, obj10, obj5, obj7, obj9, obj8, interfaceC23621Ds, i2);
                c57170PZo2.A05 = obj;
                return c57170PZo2;
            case 7:
                c57170PZo = new C57170PZo(interfaceC23621Ds, this.A05, this.A03, this.A02, this.A07, this.A01, this.A08, 7);
                c57170PZo.A04 = obj;
                return c57170PZo;
            case 8:
                Object obj23 = this.A05;
                Object obj24 = this.A03;
                Object obj25 = this.A08;
                c57170PZo = new C57170PZo(interfaceC23621Ds, obj23, obj24, this.A02, this.A07, this.A01, obj25, 8);
                c57170PZo.A04 = obj;
                return c57170PZo;
            case 9:
                return new C57170PZo((MagicMediaRemixViewModel) this.A05, (MediaScannerScheduler) this.A07, (C43901JbB) this.A01, (List) this.A08, interfaceC23621Ds);
            case 10:
                C57170PZo c57170PZo4 = new C57170PZo((DirectThreadsParser) this.A05, (List) this.A01, (List) this.A08, interfaceC23621Ds, (C15370ps) this.A02, (C15370ps) this.A07);
                c57170PZo4.A03 = obj;
                return c57170PZo4;
            case 11:
                Object obj26 = this.A05;
                Object obj27 = this.A02;
                Object obj28 = this.A08;
                Object obj29 = this.A01;
                c57170PZo = new C57170PZo(interfaceC23621Ds, obj26, this.A03, obj27, this.A07, obj29, obj28, 11);
                c57170PZo.A04 = obj;
                return c57170PZo;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj15 = this.A08;
                obj12 = this.A01;
                obj11 = this.A04;
                obj17 = this.A03;
                obj14 = this.A07;
                obj13 = this.A05;
                obj16 = this.A02;
                i3 = 12;
                return new C57170PZo(obj11, obj12, obj13, obj14, obj15, obj16, obj17, interfaceC23621Ds, i3);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c57170PZo2 = new C57170PZo(this.A07, this.A08, this.A04, this.A03, this.A01, this.A02, interfaceC23621Ds, 13);
                c57170PZo2.A05 = obj;
                return c57170PZo2;
            case 14:
                InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A03;
                c57170PZo = new C57170PZo((C47Z) this.A01, (C47Z) this.A07, (OXD) this.A02, interfaceC23621Ds, (C15370ps) this.A08, interfaceC24741Ir);
                c57170PZo.A04 = obj;
                return c57170PZo;
            case Process.SIGTERM /* 15 */:
                obj11 = this.A04;
                obj12 = this.A01;
                obj13 = this.A05;
                obj14 = this.A07;
                obj15 = this.A08;
                obj16 = this.A02;
                obj17 = this.A03;
                i3 = 15;
                return new C57170PZo(obj11, obj12, obj13, obj14, obj15, obj16, obj17, interfaceC23621Ds, i3);
            case 16:
                return new C57170PZo(this.A08, this.A05, this.A07, interfaceC23621Ds, 16);
            case 17:
                obj2 = this.A08;
                obj3 = this.A05;
                obj4 = this.A07;
                i = 17;
                C57170PZo c57170PZo32 = new C57170PZo(obj2, obj3, obj4, interfaceC23621Ds, i);
                c57170PZo32.A01 = obj;
                return c57170PZo32;
            default:
                obj11 = this.A04;
                obj16 = this.A02;
                obj13 = this.A05;
                obj14 = this.A07;
                obj17 = this.A03;
                obj12 = this.A01;
                obj15 = this.A08;
                i3 = 18;
                return new C57170PZo(obj11, obj12, obj13, obj14, obj15, obj16, obj17, interfaceC23621Ds, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x06a3, code lost:
    
        if (r6.length() == 0) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0760, code lost:
    
        if (r7 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x049a, code lost:
    
        if (X.AnonymousClass139.A00(r29, r10) == r5) goto L172;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0502: INVOKE (r10 I:X.139), (r3 I:java.lang.Object) VIRTUAL call: X.139.A04(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1282), block:B:57:0x0502 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x09ca: INVOKE (r8 I:X.139), (r6 I:java.lang.Object) VIRTUAL call: X.139.A04(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:2506), block:B:437:0x09ca */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0347 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0628 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008b  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 2624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57170PZo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57170PZo) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57170PZo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A07 = obj4;
        this.A08 = obj5;
        this.A02 = obj6;
        this.A03 = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57170PZo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A07 = obj;
        this.A08 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A01 = obj5;
        this.A02 = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57170PZo(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A08 = obj;
        this.A05 = obj2;
        this.A07 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57170PZo(DirectThreadsParser directThreadsParser, List list, List list2, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, C15370ps c15370ps2) {
        super(2, interfaceC23621Ds);
        this.A06 = 10;
        this.A02 = c15370ps;
        this.A07 = c15370ps2;
        this.A05 = directThreadsParser;
        this.A01 = list;
        this.A08 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57170PZo(C47Z c47z, C47Z c47z2, OXD oxd, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, InterfaceC24741Ir interfaceC24741Ir) {
        super(2, interfaceC23621Ds);
        this.A06 = 14;
        this.A03 = interfaceC24741Ir;
        this.A01 = c47z;
        this.A02 = oxd;
        this.A08 = c15370ps;
        this.A07 = c47z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57170PZo(InterfaceC23621Ds interfaceC23621Ds, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A05 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A07 = obj4;
        this.A01 = obj5;
        this.A08 = obj6;
    }
}
