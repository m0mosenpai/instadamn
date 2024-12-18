package X;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.6KL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KL extends C58J implements InterfaceC1128957x, C6KM, C6KN {
    public Object A02;
    public Object A03;
    public InterfaceC16620sF A04;
    public C6KW A05;
    public AnonymousClass195 A06;
    public C6KW A01 = C6KX.A00;
    public final C57S A07 = new C57S(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);
    public final C57S A08 = new C57S(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);
    public long A00 = 0;

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ int EL8(float f) {
        return AbstractC119105aS.A01(this, f);
    }

    @Override // X.C57y
    public final /* synthetic */ float EqG(long j) {
        return AbstractC122655h0.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqI(int i) {
        return i / Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long EqJ(long j) {
        return AbstractC119105aS.A03(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqS(long j) {
        return AbstractC119105aS.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7k(long j) {
        return AbstractC119105aS.A04(this, j);
    }

    @Override // X.C57y
    public final /* synthetic */ long F7l(float f) {
        return AbstractC122655h0.A01(this, f);
    }

    private final void A00(C6KW c6kw, EnumC25334BJd enumC25334BJd) {
        C57S c57s;
        InterfaceC24901Jp interfaceC24901Jp;
        int i;
        InterfaceC24901Jp interfaceC24901Jp2;
        C57S c57s2 = this.A07;
        synchronized (c57s2) {
            c57s = this.A08;
            c57s.A06(c57s2, c57s.A00);
        }
        try {
            int ordinal = enumC25334BJd.ordinal();
            if (ordinal != 0 && ordinal != 2) {
                if (ordinal == 1 && (i = c57s.A00) > 0) {
                    int i2 = i - 1;
                    Object[] objArr = c57s.A02;
                    do {
                        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr[i2];
                        if (enumC25334BJd == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A00 && (interfaceC24901Jp2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01) != null) {
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01 = null;
                            interfaceC24901Jp2.resumeWith(c6kw);
                        }
                        i2--;
                    } while (i2 >= 0);
                }
            } else {
                int i3 = c57s.A00;
                if (i3 > 0) {
                    int i4 = 0;
                    Object[] objArr2 = c57s.A02;
                    do {
                        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr2[i4];
                        if (enumC25334BJd == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A00 && (interfaceC24901Jp = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01) != null) {
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01 = null;
                            interfaceC24901Jp.resumeWith(c6kw);
                        }
                        i4++;
                    } while (i4 < i3);
                }
            }
        } finally {
            c57s.A01();
        }
    }

    @Override // X.C6KN
    public final Object AD9(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(this, c24891Jo);
        C57S c57s = this.A07;
        synchronized (c57s) {
            c57s.A09(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C89563yw.A01;
            new C89563yw(C1JX.A02, C1E2.A02(C1E2.A01(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, interfaceC16620sF))).resumeWith(C0eB.A00);
        }
        c24891Jo.CPA(new C206929Dx(suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, 48));
        return c24891Jo.A0E();
    }

    @Override // X.C5DX
    public final /* synthetic */ boolean COp() {
        return false;
    }

    @Override // X.C5DX
    /* renamed from: D1u */
    public final void E0S() {
        C6KW c6kw = this.A05;
        if (c6kw != null) {
            int size = c6kw.A03.size();
            for (int i = 0; i < size; i++) {
                if (!(!((BFo) r5.get(i)).A0B)) {
                    List list = c6kw.A03;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        BFo bFo = (BFo) list.get(i2);
                        long j = bFo.A05;
                        long j2 = bFo.A06;
                        long j3 = bFo.A0A;
                        float f = bFo.A03;
                        boolean z = bFo.A0B;
                        arrayList.add(new BFo(f, 1, j, j3, j2, j3, j2, 0L, false, z, z));
                    }
                    C6KW c6kw2 = new C6KW(null, arrayList);
                    this.A01 = c6kw2;
                    A00(c6kw2, EnumC25334BJd.Initial);
                    A00(c6kw2, EnumC25334BJd.Main);
                    A00(c6kw2, EnumC25334BJd.Final);
                    this.A05 = null;
                    return;
                }
            }
        }
    }

    @Override // X.C5DX
    public final void DZQ(C6KW c6kw, EnumC25334BJd enumC25334BJd, long j) {
        this.A00 = j;
        if (enumC25334BJd == EnumC25334BJd.Initial) {
            this.A01 = c6kw;
        }
        if (this.A06 == null) {
            this.A06 = AbstractC23641Du.A03(C05F.A0N, AnonymousClass191.A00, new C206639Cu(this, null, 1), A05());
        }
        A00(c6kw, enumC25334BJd);
        List list = c6kw.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!AbstractC25253BFp.A02((BFo) list.get(i))) {
                    break;
                } else {
                    i++;
                }
            } else {
                c6kw = null;
                break;
            }
        }
        this.A05 = c6kw;
    }

    @Override // X.C6KM
    public final void EJp() {
        AnonymousClass195 anonymousClass195 = this.A06;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(new C65755TtU());
            this.A06 = null;
        }
    }

    @Override // X.C5DX
    public final /* synthetic */ boolean Ehx() {
        return false;
    }

    public C6KL(Object obj, Object obj2, InterfaceC16620sF interfaceC16620sF) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = interfaceC16620sF;
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return AbstractC114335Dx.A02(this).A0C.Awk();
    }

    @Override // X.C57y
    public final float B7e() {
        return AbstractC114335Dx.A02(this).A0C.B7e();
    }

    @Override // X.C5DX
    /* renamed from: D9s */
    public final void E0S() {
        EJp();
    }

    @Override // X.C5DX
    public final void E0S() {
        EJp();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqH(float f) {
        return f / Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqT(float f) {
        return f * Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7m(float f) {
        return F7l(EqH(f));
    }
}
