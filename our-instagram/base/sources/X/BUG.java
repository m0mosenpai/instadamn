package X;

import android.util.SparseArray;
import com.facebook.R;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class BUG extends AbstractC50792Va {

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public SparseArray A00;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public C1338462s A01;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public InterfaceC62872tQ A02;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public InterfaceC125985mp A03;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public C63162tt A04;

    @Override // X.AbstractC50792Va
    public final boolean A10() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A12() {
        return true;
    }

    public BUG() {
        super("RootBloksComponent");
        this.A04 = CMM.A00;
    }

    public static C26281Bjo A03(C2XE c2xe) {
        return new C26281Bjo(c2xe, new BUG());
    }

    @Override // X.AbstractC50812Vc
    public final Object[] A0X() {
        return new Object[]{this.A04, AbstractC166997dE.A0b(), null, this.A02, this.A00, this.A03, this.A01, AbstractC166997dE.A0a()};
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0c(X.C2XE r17) {
        /*
            r16 = this;
            r5 = r17
            X.2Vo r1 = X.AbstractC25233BEq.A0M(r5)
            X.BUM r1 = (X.BUM) r1
            r4 = 0
            r0 = r16
            X.62s r0 = r0.A01
            X.6FG r11 = r1.A00
            X.COg r9 = r1.A02
            X.BUD r3 = r1.A04
            X.6Fl r7 = r1.A01
            X.BUI r6 = r1.A03
            boolean r8 = X.AnonymousClass634.A0B(r11)
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            X.62x r0 = r0.A01
            java.util.List r0 = r0.A02
            java.util.HashMap r2 = X.C1338462s.A05(r0, r1)
            X.BUH r0 = new X.BUH
            r0.<init>(r5)
            X.6Fm r10 = new X.6Fm
            r10.<init>(r0, r11)
            r14 = 0
            X.6Ab r0 = r9.A00
            if (r8 == 0) goto L89
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L3e
            X.CQA r0 = (X.CQA) r0
            X.6Vl r14 = r0.A00
        L3e:
            X.632 r0 = r7.A00
            X.632 r12 = r0.A06(r2)
            X.4kP r13 = r7.A01
            java.util.ArrayList r15 = r6.A00()
            X.6AY r1 = X.C6VY.A00(r10, r11, r12, r13, r14, r15)
            X.2W2 r0 = r1.A00
            java.lang.Object r2 = r1.A01
            r2.getClass()
            X.6Vl r2 = (X.C140076Vl) r2
            java.util.List r1 = r1.A02
            X.CQA r8 = new X.CQA
            r8.<init>(r2, r1)
        L5e:
            r7 = 0
            X.BJi r1 = new X.BJi
            r1.<init>()
            X.BUJ r6 = new X.BUJ
            r6.<init>(r5, r1)
            X.BJi r5 = r6.A01
            r5.A01 = r11
            java.util.BitSet r2 = r6.A02
            r2.set(r7)
            X.6AY r1 = new X.6AY
            r1.<init>(r0, r8, r4)
            r5.A00 = r1
            r0 = 1
            r2.set(r0)
            r5.A02 = r3
            java.lang.String[] r1 = r6.A03
            r0 = 2
            X.AbstractC77733dx.A00(r2, r1, r0)
            r6.A03()
            return r5
        L89:
            if (r0 == 0) goto Laf
            java.lang.Object r1 = r0.A02
            X.6AZ r1 = (X.C6AZ) r1
            if (r1 == 0) goto Lb0
            X.6AV r0 = r1.A01
        L93:
            X.6AV r2 = X.AbstractC136356Fo.A00(r11, r7, r0, r2)
            if (r1 == 0) goto L9b
            X.6AY r14 = r1.A00
        L9b:
            java.util.ArrayList r1 = r6.A00()
            X.62z r0 = X.C1339162z.A00
            X.6AY r0 = X.C6AW.A00(r10, r14, r2, r0, r1)
            X.6AZ r8 = new X.6AZ
            r8.<init>(r0, r2)
            X.6AY r0 = r8.A00
            X.2W2 r0 = r0.A00
            goto L5e
        Laf:
            r1 = r4
        Lb0:
            r0 = r4
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUG.A0c(X.2XE):X.2Vc");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Vo, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ AbstractC50922Vo A0g() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.COh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, X.COg] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.2Vu, X.2Vt, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final void A0x(C2XE c2xe, AbstractC50922Vo abstractC50922Vo) {
        C63C c63c;
        BUD bue;
        BUM bum = (BUM) abstractC50922Vo;
        ?? obj = new Object();
        InterfaceC62872tQ interfaceC62872tQ = this.A02;
        C1338462s c1338462s = this.A01;
        C63162tt c63162tt = this.A04;
        InterfaceC125985mp interfaceC125985mp = this.A03;
        SparseArray sparseArray = this.A00;
        Object A05 = c2xe.A05(ContextChain.class);
        SparseArray sparseArray2 = new SparseArray();
        boolean z = false;
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
        C75703ab c75703ab = c2xe.A02;
        if (!c75703ab.A01.A0M) {
            sparseArray2.put(R.id.bk_context_key_incremental_mount_enabled, false);
        }
        sparseArray2.put(R.id.bk_context_key_resolve_litho_hierarchies, false);
        if (A05 != null) {
            sparseArray2.put(R.id.bk_context_key_context_chain, A05);
        }
        sparseArray2.put(R.id.bk_context_key_litho_config, c75703ab);
        if (interfaceC62872tQ.AgS().AgW().Em2()) {
            z = true;
        }
        sparseArray2.put(R.id.bk_context_key_is_signals_enabled, Boolean.valueOf(z));
        if (sparseArray != null) {
            c63c = (C63C) sparseArray.get(R.id.bk_context_key_performance_logger);
        } else {
            c63c = null;
        }
        int andIncrement = AbstractC1339062y.A01.getAndIncrement();
        if (c63c != null) {
            c63c.ATF(5, andIncrement);
            c63c.ATA(5, andIncrement, "instance", andIncrement);
        }
        C6FG A01 = AnonymousClass634.A01(c2xe.A0C, sparseArray2, new AnonymousClass630(c1338462s, c63162tt, C1339162z.A00), interfaceC62872tQ, c1338462s.A03);
        if (c63c != null) {
            c63c.ATE(5, andIncrement);
        }
        AnonymousClass630 A02 = AnonymousClass634.A02(A01);
        BUI bui = new BUI();
        ?? obj2 = new Object();
        if (z) {
            bue = new C26974BvF(A01, obj2, bui);
        } else {
            bue = new BUE(A01, obj2, bui);
        }
        ?? obj3 = new Object();
        obj3.A00 = c2xe;
        obj.A00 = obj3;
        C136326Fl A04 = A02.A04(A01, new BUL(obj), Collections.emptyMap());
        if (interfaceC125985mp != null) {
            C29141Ct8 c29141Ct8 = (C29141Ct8) interfaceC125985mp;
            switch (c29141Ct8.A00) {
                case 2:
                    ((C29370Cx3) c29141Ct8.A01).A02 = A01;
                    break;
                case 3:
                    AtomicReference atomicReference = (AtomicReference) ((C51762Yz) c29141Ct8.A01).A03;
                    if (atomicReference != null) {
                        atomicReference.getAndSet(A01);
                        break;
                    }
                    break;
                default:
                    AbstractC25225BEi.A1U(c29141Ct8.A01, A01);
                    break;
            }
        }
        bum.A00 = A01;
        bum.A02 = obj2;
        bum.A04 = bue;
        bum.A01 = A04;
        bum.A05 = (C27818COh) obj.A00;
        bum.A03 = bui;
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        return super.A0P();
    }

    @Override // X.AbstractC50792Va
    public final void A0m(C2XE c2xe) {
        ((BUM) AbstractC25233BEq.A0M(c2xe)).A05.A00 = c2xe;
    }
}
