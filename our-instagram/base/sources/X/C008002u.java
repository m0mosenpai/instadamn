package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.02u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C008002u extends C10B implements C05A, InterfaceC14870p1, InterfaceC16480rt {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C008002u.class, Object.class, "_state$volatile");
    public int A00;
    public volatile /* synthetic */ Object _state$volatile;

    private final boolean A00(Object obj, Object obj2) {
        boolean z;
        int i;
        int i2;
        C20730zt c20730zt;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (obj == null || C14360o3.A0K(obj3, obj)) {
                z = true;
                if (!C14360o3.A0K(obj3, obj2)) {
                    atomicReferenceFieldUpdater.set(this, obj2);
                    int i3 = this.A00;
                    if ((i3 & 1) == 0) {
                        int i4 = i3 + 1;
                        this.A00 = i4;
                        AnonymousClass109[] anonymousClass109Arr = this.A01;
                        while (true) {
                            C0pG[] c0pGArr = (C0pG[]) anonymousClass109Arr;
                            if (c0pGArr != null) {
                                for (C0pG c0pG : c0pGArr) {
                                    if (c0pG != null) {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0pG.A00;
                                        while (true) {
                                            Object obj4 = atomicReferenceFieldUpdater2.get(c0pG);
                                            if (obj4 != null && obj4 != (c20730zt = C10E.A01)) {
                                                C20730zt c20730zt2 = C10E.A00;
                                                if (obj4 == c20730zt2) {
                                                    while (!atomicReferenceFieldUpdater2.compareAndSet(c0pG, obj4, c20730zt)) {
                                                        if (atomicReferenceFieldUpdater2.get(c0pG) != obj4) {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    while (!atomicReferenceFieldUpdater2.compareAndSet(c0pG, obj4, c20730zt2)) {
                                                        if (atomicReferenceFieldUpdater2.get(c0pG) != obj4) {
                                                            break;
                                                        }
                                                    }
                                                    ((C24891Jo) obj4).resumeWith(C0eB.A00);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            synchronized (this) {
                                i2 = this.A00;
                                if (i2 == i4) {
                                    break;
                                }
                                anonymousClass109Arr = this.A01;
                            }
                            i4 = i2;
                        }
                        i = i4 + 1;
                    } else {
                        i = i3 + 2;
                    }
                    this.A00 = i;
                }
            }
        }
        return z;
    }

    @Override // X.C10B
    public final /* bridge */ /* synthetic */ AnonymousClass109[] A0B(int i) {
        return new C0pG[2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
    
        if (r5 == (-3)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        if (r5 < 2) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:
    
        if (r5 != 0) goto L9;
     */
    @Override // X.InterfaceC14870p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC19390xP AWl(java.lang.Integer r3, X.C12W r4, int r5) {
        /*
            r2 = this;
            r0 = r2
            if (r5 < 0) goto L12
            r1 = 2
            if (r5 >= r1) goto Lc
        L6:
            java.lang.Integer r1 = X.C05F.A01
            if (r3 == r1) goto L11
            if (r5 == 0) goto L18
        Lc:
            X.02t r0 = new X.02t
            r0.<init>(r3, r4, r2, r5)
        L11:
            return r0
        L12:
            r1 = -2
            if (r5 == r1) goto L6
            r1 = -3
            if (r5 != r1) goto Lc
        L18:
            java.lang.Integer r1 = X.C05F.A00
            if (r3 != r1) goto Lc
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C008002u.AWl(java.lang.Integer, X.12W, int):X.0xP");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.109, java.lang.Object] */
    @Override // X.C10B
    public final /* bridge */ /* synthetic */ AnonymousClass109 A0A() {
        return new Object();
    }

    @Override // X.C05A
    public final boolean AIi(Object obj, Object obj2) {
        if (obj == null) {
            obj = AbstractC20780zy.A01;
        }
        if (obj2 == null) {
            obj2 = AbstractC20780zy.A01;
        }
        return A00(obj, obj2);
    }

    @Override // X.InterfaceC06180Ui
    public final void EJt() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // X.C05A
    public final void Egh(Object obj) {
        if (obj == null) {
            obj = AbstractC20780zy.A01;
        }
        A00(null, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        if (r5.equals(r11) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0110, code lost:
    
        if (r1.A0E() == r9) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2 A[Catch: all -> 0x0116, TryCatch #1 {all -> 0x0116, blocks: (B:13:0x0097, B:14:0x009a, B:16:0x00a2, B:18:0x00a8, B:19:0x00ac, B:23:0x00af, B:25:0x00d2, B:27:0x00e1, B:28:0x00fb, B:30:0x0101, B:33:0x0107, B:34:0x010c, B:39:0x00b5, B:42:0x00bb, B:48:0x00cf, B:50:0x0086, B:51:0x0089), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[Catch: all -> 0x0116, TryCatch #1 {all -> 0x0116, blocks: (B:13:0x0097, B:14:0x009a, B:16:0x00a2, B:18:0x00a8, B:19:0x00ac, B:23:0x00af, B:25:0x00d2, B:27:0x00e1, B:28:0x00fb, B:30:0x0101, B:33:0x0107, B:34:0x010c, B:39:0x00b5, B:42:0x00bb, B:48:0x00cf, B:50:0x0086, B:51:0x0089), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1 A[Catch: all -> 0x0116, TryCatch #1 {all -> 0x0116, blocks: (B:13:0x0097, B:14:0x009a, B:16:0x00a2, B:18:0x00a8, B:19:0x00ac, B:23:0x00af, B:25:0x00d2, B:27:0x00e1, B:28:0x00fb, B:30:0x0101, B:33:0x0107, B:34:0x010c, B:39:0x00b5, B:42:0x00bb, B:48:0x00cf, B:50:0x0086, B:51:0x0089), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Ds] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.10B] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00df -> B:14:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0110 -> B:14:0x009a). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC15070pN, X.InterfaceC19390xP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC19960yQ r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C008002u.collect(X.0yQ, X.1Ds):java.lang.Object");
    }

    @Override // X.C05A, X.C0UO
    public final Object getValue() {
        C20730zt c20730zt = AbstractC20780zy.A01;
        Object obj = A01.get(this);
        if (obj == c20730zt) {
            return null;
        }
        return obj;
    }

    public C008002u(Object obj) {
        this._state$volatile = obj;
    }

    @Override // X.InterfaceC15070pN
    public final List Bn0() {
        List singletonList = Collections.singletonList(getValue());
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC06180Ui
    public final boolean F8m(Object obj) {
        Egh(obj);
        return true;
    }

    @Override // X.InterfaceC06180Ui, X.InterfaceC19960yQ
    public final Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Egh(obj);
        return C0eB.A00;
    }
}
