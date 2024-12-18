package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: X.Bpq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26655Bpq extends AbstractC50792Va {

    @Comparable(type = 3)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public int A00;

    @Comparable(type = 3)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public int A01;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public C27771Wf A02;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public Object A03;

    @Comparable(type = 5)
    @Prop(optional = true, resType = EnumC27347C5c.NONE, varArg = "uri")
    public List A04;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A05;

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A12() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1.equals(r0) == false) goto L12;
     */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19(X.AbstractC50812Vc r5, boolean r6) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L54
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            X.Bpq r5 = (X.C26655Bpq) r5
            java.lang.Object r1 = r4.A03
            java.lang.Object r0 = r5.A03
            if (r1 == 0) goto L1f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
        L1e:
            return r2
        L1f:
            if (r0 == 0) goto L22
            return r2
        L22:
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L1e
            X.1Wf r1 = r4.A02
            X.1Wf r0 = r5.A02
            if (r1 == 0) goto L35
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L38
            return r2
        L35:
            if (r0 == 0) goto L38
            return r2
        L38:
            boolean r1 = r4.A05
            boolean r0 = r5.A05
            if (r1 != r0) goto L1e
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L1e
            java.util.List r1 = r4.A04
            java.util.List r0 = r5.A04
            if (r1 == 0) goto L51
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L54
            return r2
        L51:
            if (r0 == 0) goto L54
            return r2
        L54:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26655Bpq.A19(X.2Vc, boolean):boolean");
    }

    public C26655Bpq() {
        super("FrescoVitoSlideshowComponent");
        this.A05 = true;
        this.A04 = Collections.emptyList();
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0W(C2XE c2xe, C2XE c2xe2) {
        if (c2xe.A05(ContextChain.class) != null) {
            if (!c2xe.A05(ContextChain.class).equals(c2xe2.A05(ContextChain.class))) {
                return false;
            }
            return true;
        }
        if (c2xe2.A05(ContextChain.class) != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Vo, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ AbstractC50922Vo A0g() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r19v1, types: [X.0pQ, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        C26664Bpz c26664Bpz = (C26664Bpz) AbstractC25233BEq.A0M(c2xe);
        C25959Be4 c25959Be4 = (C25959Be4) obj;
        List list = this.A04;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A05;
        C27771Wf c27771Wf = this.A02;
        Object obj2 = this.A03;
        ContextChain contextChain = (ContextChain) c2xe.A05(ContextChain.class);
        int i3 = c26664Bpz.A00;
        Timer timer = c26664Bpz.A01;
        boolean z2 = c26664Bpz.A02;
        AbstractC167017dG.A1P(c25959Be4, list);
        C14360o3.A0B(timer, 12);
        C1WN A00 = C59232nO.A00();
        int i4 = c25959Be4.A00 - 1;
        int length = ((AbstractC66312U8l) c25959Be4).A04.length;
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) c25959Be4.A02((i4 + length) % length);
        if (interfaceC59242nQ != null) {
            A00.EEL(interfaceC59242nQ);
            InterfaceC59242nQ interfaceC59242nQ2 = (InterfaceC59242nQ) c25959Be4.A02(c25959Be4.A00);
            if (interfaceC59242nQ2 != null) {
                A00.EEL(interfaceC59242nQ2);
                A00.EEL(c25959Be4.A05());
                TimerTask timerTask = c25959Be4.A01;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                c25959Be4.A01 = null;
                UMM.A00(c25959Be4);
                c25959Be4.invalidateSelf();
                c25959Be4.A00 = 0;
                ((UMM) c25959Be4).A01 = i2;
                if (((UMM) c25959Be4).A03 == 1) {
                    ((UMM) c25959Be4).A03 = 0;
                }
                Resources A0M = AbstractC166997dE.A0M(c2xe.A0C);
                CCE.A00(A0M, (android.net.Uri) AbstractC167007dF.A0e(list, i3), contextChain, c25959Be4, c27771Wf, obj2);
                c25959Be4.A06();
                ((UMM) c25959Be4).A03 = 2;
                for (int i5 = 0; i5 < c25959Be4.A0C.length; i5++) {
                    int[] iArr = c25959Be4.A08;
                    int i6 = 0;
                    if (c25959Be4.A0A[i5]) {
                        i6 = 255;
                    }
                    iArr[i5] = i6;
                }
                c25959Be4.invalidateSelf();
                int size = list.size();
                if (z) {
                    if (!z2) {
                        int i7 = (i3 + 1) % size;
                        CCE.A00(A0M, (android.net.Uri) list.get(i7), contextChain, c25959Be4, c27771Wf, obj2);
                        D3U d3u = new D3U(AbstractC167007dF.A0J(), new D2X(contextChain, c25959Be4, c27771Wf, c2xe, obj2, list, new Object(), i7, size));
                        c25959Be4.A01 = d3u;
                        timer.scheduleAtFixedRate(d3u, i, i + i2);
                        return;
                    }
                    return;
                }
                if (!z2) {
                    return;
                }
                TimerTask timerTask2 = c25959Be4.A01;
                if (timerTask2 != null) {
                    timerTask2.cancel();
                }
                if (c2xe.A01 == null) {
                    return;
                }
                c2xe.A0A(new C125975mo(AbstractC25228BEl.A1b(false), Integer.MIN_VALUE));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        C25959Be4 c25959Be4 = (C25959Be4) obj;
        AbstractC167007dF.A1K(c2xe, c25959Be4);
        C1WN A00 = C59232nO.A00();
        int i = c25959Be4.A00 - 1;
        int length = ((AbstractC66312U8l) c25959Be4).A04.length;
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) c25959Be4.A02((i + length) % length);
        if (interfaceC59242nQ != null) {
            A00.EEL(interfaceC59242nQ);
            InterfaceC59242nQ interfaceC59242nQ2 = (InterfaceC59242nQ) c25959Be4.A02(c25959Be4.A00);
            if (interfaceC59242nQ2 != null) {
                A00.EEL(interfaceC59242nQ2);
                A00.EEL(c25959Be4.A05());
                TimerTask timerTask = c25959Be4.A01;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                c25959Be4.A01 = null;
                UMM.A00(c25959Be4);
                c25959Be4.invalidateSelf();
                c25959Be4.A00 = 0;
                if (c2xe.A01 != null) {
                    c2xe.A0A(new C125975mo(AbstractC25228BEl.A1b(false), Integer.MIN_VALUE));
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC50792Va
    public final void A0x(C2XE c2xe, AbstractC50922Vo abstractC50922Vo) {
        C26664Bpz c26664Bpz = (C26664Bpz) abstractC50922Vo;
        Timer timer = new Timer("Fresco Vito slideshow timer");
        c26664Bpz.A00 = 0;
        c26664Bpz.A01 = timer;
        c26664Bpz.A02 = false;
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A01;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        return new UMM(new Drawable[]{C59232nO.A00().AM5(), C59232nO.A00().AM5(), C59232nO.A00().AM5()}, -1);
    }
}
