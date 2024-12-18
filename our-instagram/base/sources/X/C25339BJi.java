package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.BJi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25339BJi extends AbstractC50792Va {

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public C6AY A00;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public C6FG A01;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public BUD A02;

    @Override // X.AbstractC50812Vc
    public final boolean A0S() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0U() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A10() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A11() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A12() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A17() {
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
            if (r4 == r5) goto L42
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            X.BJi r5 = (X.C25339BJi) r5
            X.6FG r1 = r4.A01
            X.6FG r0 = r5.A01
            if (r1 == 0) goto L1f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
        L1e:
            return r2
        L1f:
            if (r0 == 0) goto L22
            return r2
        L22:
            X.6AY r1 = r4.A00
            X.6AY r0 = r5.A00
            if (r1 == 0) goto L2f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L32
            return r2
        L2f:
            if (r0 == 0) goto L32
            return r2
        L32:
            X.BUD r1 = r4.A02
            X.BUD r0 = r5.A02
            if (r1 == 0) goto L3f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L42
            return r2
        L3f:
            if (r0 == 0) goto L42
            return r2
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25339BJi.A19(X.2Vc, boolean):boolean");
    }

    public C25339BJi() {
        super("BloksRenderComponent");
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        return new C131545wq(context);
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0V(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, AbstractC50922Vo abstractC50922Vo, AbstractC50922Vo abstractC50922Vo2) {
        C6FG c6fg;
        C6AY c6ay;
        C25339BJi c25339BJi = (C25339BJi) abstractC50812Vc;
        C25339BJi c25339BJi2 = (C25339BJi) abstractC50812Vc2;
        C6AY c6ay2 = null;
        if (c25339BJi2 == null) {
            c6fg = null;
        } else {
            c6fg = c25339BJi2.A01;
        }
        if (c25339BJi == null) {
            c6ay = null;
        } else {
            c6ay = c25339BJi.A00;
        }
        if (c25339BJi2 != null) {
            c6ay2 = c25339BJi2.A00;
        }
        if (!AnonymousClass634.A0B(c6fg) && C6AO.A00(c6ay, c6ay2)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0W(C2XE c2xe, C2XE c2xe2) {
        if (c2xe.A05(AbstractC131605ww.class) != null) {
            c2xe.A05(AbstractC131605ww.class);
            c2xe2.A05(AbstractC131605ww.class);
            throw AbstractC166987dD.A15("equals");
        }
        if (c2xe2.A05(AbstractC131605ww.class) == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2WI, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ C2WI A0e() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Vo, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ AbstractC50922Vo A0g() {
        return new Object();
    }

    @Override // X.AbstractC50792Va
    public final void A0r(C2XE c2xe, C2WI c2wi, C2Vj c2Vj, C2W6 c2w6, int i, int i2) {
        C63C c63c;
        C26663Bpy c26663Bpy = (C26663Bpy) AbstractC25233BEq.A0M(c2xe);
        C6AY c6ay = this.A00;
        C6FG c6fg = this.A01;
        C135266Ab c135266Ab = c26663Bpy.A01.A00;
        if (c6fg == null) {
            c63c = null;
        } else {
            c63c = (C63C) c6fg.A01.get(R.id.bk_context_key_performance_logger);
        }
        int andIncrement = AbstractC1339062y.A03.getAndIncrement();
        if (c63c != null) {
            c63c.ATF(6, andIncrement);
            c63c.ATA(6, andIncrement, "instance", andIncrement);
        }
        Context context = c2xe.A0C;
        AbstractC79173gO[] A00 = AbstractC135256Aa.A00(c6fg);
        if (AnonymousClass634.A0B(c6fg)) {
            c135266Ab = null;
        }
        C135276Ac c135276Ac = C135266Ab.A04;
        AbstractC167017dG.A1N(context, c6ay);
        C135266Ab A02 = c135276Ac.A02(context, c135266Ab, c6ay, c6fg, A00, -1, AbstractC78403f6.A00(i, i2));
        if (c63c != null) {
            c63c.ATE(6, andIncrement);
        }
        C79243gV c79243gV = A02.A01;
        c2Vj.A01 = c79243gV.A01();
        c2Vj.A00 = c79243gV.A00();
        ((C28936Cpk) c2wi).A00 = A02;
    }

    @Override // X.AbstractC50792Va
    public final void A0x(C2XE c2xe, AbstractC50922Vo abstractC50922Vo) {
        C26663Bpy c26663Bpy = (C26663Bpy) abstractC50922Vo;
        C6FG c6fg = this.A01;
        CRO cro = new CRO(this.A02);
        BFH bfh = new BFH(c6fg);
        c26663Bpy.A01 = cro;
        c26663Bpy.A00 = bfh;
    }

    @Override // X.AbstractC50792Va
    public final void A0y(C2WI c2wi, C2WI c2wi2) {
        C28936Cpk c28936Cpk = (C28936Cpk) c2wi;
        C28936Cpk c28936Cpk2 = (C28936Cpk) c2wi2;
        c28936Cpk.A00 = c28936Cpk2.A00;
        c28936Cpk.A01 = c28936Cpk2.A01;
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        return super.A0P();
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A0C;
    }

    @Override // X.AbstractC50792Va
    public final void A0m(C2XE c2xe) {
        C07W c07w = ((C26663Bpy) AbstractC25233BEq.A0M(c2xe)).A00;
        Object obj = c2xe.A0C;
        if (obj instanceof C07X) {
            ((C07X) obj).getLifecycle().A09(c07w);
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0n(C2XE c2xe) {
        C07W c07w = ((C26663Bpy) AbstractC25233BEq.A0M(c2xe)).A00;
        Object obj = c2xe.A0C;
        if (obj instanceof C07X) {
            ((C07X) obj).getLifecycle().A0A(c07w);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r4.A01.A00() == r14.A00()) goto L12;
     */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0s(X.C2XE r12, X.C2WI r13, X.C2W6 r14) {
        /*
            r11 = this;
            X.2Vo r0 = X.AbstractC25233BEq.A0M(r12)
            X.Bpy r0 = (X.C26663Bpy) r0
            X.6AY r5 = r11.A00
            X.6FG r6 = r11.A01
            X.CRO r0 = r0.A01
            X.Cpk r13 = (X.C28936Cpk) r13
            X.6Ab r4 = r13.A00
            if (r4 == 0) goto L5a
            X.3gV r0 = r4.A01
            int r1 = r0.A01()
            int r0 = r14.A05()
            if (r1 != r0) goto L2a
            X.3gV r0 = r4.A01
            int r1 = r0.A00()
            int r0 = r14.A00()
            if (r1 == r0) goto L57
        L2a:
            android.content.Context r3 = r12.A0C
            X.3gO[] r7 = X.AbstractC135256Aa.A00(r6)
            boolean r0 = X.AnonymousClass634.A0B(r6)
            if (r0 == 0) goto L37
            r4 = 0
        L37:
            int r0 = r14.A05()
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r14.A00()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r8 = -1
            X.6Ac r2 = X.C135266Ab.A04
            X.AbstractC167017dG.A1N(r3, r5)
            long r9 = X.AbstractC78403f6.A00(r1, r0)
            X.6Ab r4 = r2.A02(r3, r4, r5, r6, r7, r8, r9)
        L57:
            r13.A01 = r4
            return
        L5a:
            X.6Ab r4 = r0.A00
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25339BJi.A0s(X.2XE, X.2WI, X.2W6):void");
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        C26663Bpy c26663Bpy = (C26663Bpy) AbstractC25233BEq.A0M(c2xe);
        C131545wq c131545wq = (C131545wq) obj;
        c2xe.A05(AbstractC131605ww.class);
        C135266Ab c135266Ab = ((C28936Cpk) c2wi).A01;
        CRO cro = c26663Bpy.A01;
        c131545wq.A00.removeCallbacks(c131545wq.A01);
        synchronized (cro.A02) {
            cro.A00 = c135266Ab;
            BUD bud = cro.A01;
            if (bud != null) {
                bud.A00(c135266Ab);
            }
        }
        c131545wq.setRenderTree(c135266Ab.A01);
        c131545wq.post(new Runnable() { // from class: X.5wy
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC131875xN.A00.set(true);
            }
        });
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        AbstractC25233BEq.A0M(c2xe);
        C131545wq c131545wq = (C131545wq) obj;
        c2xe.A05(AbstractC131605ww.class);
        c131545wq.A00.post(c131545wq.A01);
    }
}
