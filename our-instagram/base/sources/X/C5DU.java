package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.5DU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DU extends C58J implements C5DV, C5DW, C5DX, C58L, C5DY, InterfaceC1129158a, C5DZ, InterfaceC114145Da, InterfaceC1129258b, InterfaceC113445Ag, InterfaceC114155Db, C59D, C5Dc, InterfaceC114165Dd {
    public C58O A00;
    public C138056Nj A01;
    public HashSet A02;
    public InterfaceC1131459c A03;

    @Override // X.C5DZ
    public final void Def(long j) {
    }

    public static final void A00(C5DU c5du) {
        if (!c5du.A08) {
            AbstractC28290Cdc.A01("unInitializeModifier called on unattached node");
            throw C00O.createAndThrow();
        }
        C58O c58o = c5du.A00;
        if ((((C58J) c5du).A01 & 32) != 0) {
            if (c58o instanceof InterfaceC118895a6) {
                C5DT c5dt = ((AndroidComposeView) AbstractC114335Dx.A05(c5du)).A0X;
                C114175De BKT = ((InterfaceC118895a6) c58o).BKT();
                c5dt.A03.A09(AbstractC114335Dx.A02(c5du));
                c5dt.A04.A09(BKT);
                if (!c5dt.A00) {
                    c5dt.A00 = true;
                    c5dt.A05.EDX(new C9EV(c5dt, 22));
                }
            }
            if (c58o instanceof InterfaceC118885a5) {
                ((InterfaceC118885a5) c58o).DTl(CO0.A00);
            }
        }
        if ((((C58J) c5du).A01 & 8) != 0) {
            AbstractC114335Dx.A05(c5du).DkU();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.6Nj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5DU r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5DU.A01(X.5DU, boolean):void");
    }

    public final void A0F() {
        if (this.A08) {
            this.A02.clear();
            ((AndroidComposeView) AbstractC114335Dx.A05(this)).A0b.A00(this, new C9EV(this, 24), CO0.A01);
        }
    }

    @Override // X.InterfaceC114145Da
    public final void AC8(C5EH c5eh) {
        AbstractC28290Cdc.A01("applyFocusProperties called on wrong node");
        throw C00O.createAndThrow();
    }

    @Override // X.C58L
    public final void ACC(InterfaceC113515Ao interfaceC113515Ao) {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        C113505An Bt8 = ((InterfaceC118625Ya) c58o).Bt8();
        C14360o3.A0C(interfaceC113515Ao, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        C113505An c113505An = (C113505An) interfaceC113515Ao;
        if (Bt8.A01) {
            c113505An.A01 = true;
        }
        if (Bt8.A00) {
            c113505An.A00 = true;
        }
        for (Map.Entry entry : Bt8.A02.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Map map = c113505An.A02;
            if (!map.containsKey(key)) {
                map.put(key, value);
            } else if (value instanceof C120895dg) {
                Object obj = map.get(key);
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C120895dg c120895dg = (C120895dg) obj;
                String str = c120895dg.A00;
                if (str == null) {
                    str = ((C120895dg) value).A00;
                }
                InterfaceC09250da interfaceC09250da = c120895dg.A01;
                if (interfaceC09250da == null) {
                    interfaceC09250da = ((C120895dg) value).A01;
                }
                map.put(key, new C120895dg(str, interfaceC09250da));
            }
        }
    }

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((InterfaceC118875a4) c58o).AQV(interfaceC1129057z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.58J] */
    @Override // X.InterfaceC1129258b
    public final Object Au8(C114175De c114175De) {
        this.A02.add(c114175De);
        C58J c58j = super.A03;
        if (c58j.A08) {
            C58J c58j2 = c58j.A04;
            AnonymousClass599 A02 = AbstractC114335Dx.A02(this);
            if (A02 != null) {
                while (true) {
                    if ((A02.A0W.A02.A00 & 32) != 0) {
                        while (c58j2 != null) {
                            if ((c58j2.A01 & 32) != 0) {
                                C5AY c5ay = c58j2;
                                ?? r0 = 0;
                                do {
                                    if (c5ay instanceof InterfaceC1129158a) {
                                        AbstractC138066Nk Biu = ((InterfaceC1129158a) c5ay).Biu();
                                        if (Biu.A01(c114175De)) {
                                            return Biu.A00(c114175De);
                                        }
                                    } else if ((c5ay.A01 & 32) != 0 && (c5ay instanceof C5AY)) {
                                        C58J c58j3 = c5ay.A00;
                                        int i = 0;
                                        r0 = r0;
                                        c5ay = c5ay;
                                        while (c58j3 != null) {
                                            if ((c58j3.A01 & 32) != 0) {
                                                i++;
                                                r0 = r0;
                                                if (i == 1) {
                                                    c5ay = c58j3;
                                                } else {
                                                    if (r0 == 0) {
                                                        r0 = new C57S(new C58J[16]);
                                                    }
                                                    if (c5ay != 0) {
                                                        r0.A09(c5ay);
                                                        c5ay = 0;
                                                    }
                                                    r0.A09(c58j3);
                                                }
                                            }
                                            c58j3 = c58j3.A02;
                                            r0 = r0;
                                            c5ay = c5ay;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    c5ay = AbstractC114335Dx.A00(r0);
                                } while (c5ay != 0);
                            }
                            c58j2 = c58j2.A04;
                        }
                    }
                    A02 = A02.A0B();
                    if (A02 == null) {
                        break;
                    }
                    C59S c59s = A02.A0W;
                    if (c59s != null) {
                        c58j2 = c59s.A05;
                    } else {
                        c58j2 = null;
                    }
                }
            }
            return c114175De.A00.invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    @Override // X.InterfaceC1129158a
    public final AbstractC138066Nk Biu() {
        C138056Nj c138056Nj = this.A01;
        if (c138056Nj == null) {
            return C25776BaF.A00;
        }
        return c138056Nj;
    }

    @Override // X.C58L
    public final /* synthetic */ boolean Buw() {
        return false;
    }

    @Override // X.C58L
    public final /* synthetic */ boolean BvB() {
        return false;
    }

    @Override // X.C5DV
    public final long Bxc() {
        return AbstractC119215ad.A01(((C59W) AbstractC114335Dx.A04(this, 128)).A03);
    }

    @Override // X.C5DX
    public final boolean COp() {
        C14360o3.A0C(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return false;
    }

    @Override // X.C59D
    public final boolean CfU() {
        return this.A08;
    }

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC118865a3) c58o).Cnl(interfaceC1131659e, interfaceC1131259a, i);
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC118865a3) c58o).Cno(interfaceC1131659e, interfaceC1131259a, i);
    }

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC118865a3) c58o).CpE(interfaceC1131559d, c59z, j);
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC118865a3) c58o).Cpg(interfaceC1131659e, interfaceC1131259a, i);
    }

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC118865a3) c58o).Cpj(interfaceC1131659e, interfaceC1131259a, i);
    }

    @Override // X.C5Dc
    public final Object Cpn(InterfaceC1128957x interfaceC1128957x, Object obj) {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((InterfaceC118915a8) c58o).Cpn(interfaceC1128957x, obj);
    }

    @Override // X.C5DX
    /* renamed from: D1u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void E0S() {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C118755Yu c118755Yu = ((C118735Ys) ((InterfaceC118745Yt) c58o)).A03;
        if (c118755Yu.A01 == C05F.A01) {
            long uptimeMillis = SystemClock.uptimeMillis();
            C118735Ys c118735Ys = c118755Yu.A02;
            C206929Dx c206929Dx = new C206929Dx(c118735Ys, 47);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            c206929Dx.invoke(obtain);
            obtain.recycle();
            c118755Yu.A01 = C05F.A00;
            c118735Ys.A02 = false;
        }
    }

    @Override // X.C5DY
    public final void DHg(InterfaceC118945aB interfaceC118945aB) {
        AbstractC28290Cdc.A01("onFocusEvent called on wrong node");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC114155Db
    public final void DJc(InterfaceC1131459c interfaceC1131459c) {
        C58O c58o = this.A00;
        C14360o3.A0C(c58o, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        AwaitFirstLayoutModifier awaitFirstLayoutModifier = (AwaitFirstLayoutModifier) ((InterfaceC118905a7) c58o);
        if (!awaitFirstLayoutModifier.A01) {
            awaitFirstLayoutModifier.A01 = true;
            InterfaceC23621Ds interfaceC23621Ds = awaitFirstLayoutModifier.A00;
            if (interfaceC23621Ds != null) {
                interfaceC23621Ds.resumeWith(C0eB.A00);
            }
            awaitFirstLayoutModifier.A00 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // X.C5DX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DZQ(X.C6KW r8, X.EnumC25334BJd r9, long r10) {
        /*
            r7 = this;
            X.58O r1 = r7.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"
            X.C14360o3.A0C(r1, r0)
            X.5Yt r1 = (X.InterfaceC118745Yt) r1
            X.5Ys r1 = (X.C118735Ys) r1
            X.5Yu r4 = r1.A03
            java.util.List r5 = r8.A03
            X.5Ys r3 = r4.A02
            boolean r0 = r3.A02
            if (r0 != 0) goto L33
            int r6 = r5.size()
            r2 = 0
        L1a:
            if (r2 >= r6) goto L35
            java.lang.Object r1 = r5.get(r2)
            X.BFo r1 = (X.BFo) r1
            boolean r0 = r1.A0C
            if (r0 != 0) goto L2a
            boolean r0 = r1.A0B
            if (r0 != 0) goto L33
        L2a:
            boolean r0 = X.AbstractC25253BFp.A02(r1)
            if (r0 != 0) goto L33
            int r2 = r2 + 1
            goto L1a
        L33:
            r2 = 1
            goto L36
        L35:
            r2 = 0
        L36:
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L4e
            X.BJd r0 = X.EnumC25334BJd.Initial
            if (r9 != r0) goto L45
            if (r2 == 0) goto L45
            X.C118755Yu.A00(r8, r4)
        L45:
            X.BJd r0 = X.EnumC25334BJd.Final
            if (r9 != r0) goto L4e
            if (r2 != 0) goto L4e
            X.C118755Yu.A00(r8, r4)
        L4e:
            X.BJd r0 = X.EnumC25334BJd.Final
            if (r9 != r0) goto L6f
            int r2 = r5.size()
            r1 = 0
        L57:
            if (r1 >= r2) goto L68
            java.lang.Object r0 = r5.get(r1)
            X.BFo r0 = (X.BFo) r0
            boolean r0 = X.AbstractC25253BFp.A02(r0)
            if (r0 == 0) goto L6f
            int r1 = r1 + 1
            goto L57
        L68:
            java.lang.Integer r0 = X.C05F.A00
            r4.A01 = r0
            r0 = 0
            r3.A02 = r0
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5DU.DZQ(X.6KW, X.BJd, long):void");
    }

    @Override // X.C5DX
    public final boolean Ehx() {
        C14360o3.A0C(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return true;
    }

    public final String toString() {
        return this.A00.toString();
    }

    @Override // X.InterfaceC113445Ag
    public final void DRD() {
        C5Zx.A00(this);
    }

    @Override // X.C5DV
    public final InterfaceC1128957x getDensity() {
        return AbstractC114335Dx.A02(this).A0C;
    }

    @Override // X.C5DV
    public final AnonymousClass583 getLayoutDirection() {
        return AbstractC114335Dx.A02(this).A0D;
    }

    @Override // X.C5DZ
    public final void DYp(InterfaceC1131459c interfaceC1131459c) {
        this.A03 = interfaceC1131459c;
    }
}
