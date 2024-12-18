package androidx.compose.ui.contentcapture;

import X.AbstractC001800i;
import X.AbstractC004701m;
import X.AbstractC120865dd;
import X.AbstractC28290Cdc;
import X.C00O;
import X.C012504o;
import X.C01M;
import X.C01N;
import X.C01O;
import X.C05F;
import X.C07X;
import X.C113525Ap;
import X.C113535Aq;
import X.C119005aH;
import X.C120855dc;
import X.C14360o3;
import X.C18740w1;
import X.C18750w2;
import X.C24721Ip;
import X.InterfaceC16820sZ;
import X.InterfaceC24731Iq;
import X.InterfaceC65626Tpm;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AndroidContentCaptureManager implements InterfaceC65626Tpm, View.OnAttachStateChangeListener {
    public long A00;
    public C18750w2 A01;
    public C113535Aq A02;
    public C119005aH A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public C01M A07;
    public InterfaceC16820sZ A08;
    public final Handler A09;
    public final C012504o A0A;
    public final C18750w2 A0B = new C18750w2(6);
    public final C18740w1 A0C;
    public final AndroidComposeView A0D;
    public final Runnable A0E;
    public final InterfaceC24731Iq A0F;

    public static final void A01(AndroidContentCaptureManager androidContentCaptureManager, C113535Aq c113535Aq, C113525Ap c113525Ap) {
        List A08 = c113525Ap.A08(false, true);
        int size = A08.size();
        for (int i = 0; i < size; i++) {
            C113525Ap c113525Ap2 = (C113525Ap) A08.get(i);
            if (androidContentCaptureManager.A06().A04(c113525Ap2.A02) && !c113535Aq.A00.A04(c113525Ap2.A02)) {
                androidContentCaptureManager.A04(c113525Ap2);
            }
        }
        C18750w2 c18750w2 = androidContentCaptureManager.A01;
        int[] iArr = c18750w2.A02;
        long[] jArr = c18750w2.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i2 << 3) + i4];
                            if (!androidContentCaptureManager.A06().A04(i5)) {
                                C18750w2 c18750w22 = androidContentCaptureManager.A0B;
                                if (c18750w22.A05(i5)) {
                                    c18750w22.A07(i5);
                                } else {
                                    androidContentCaptureManager.A0C.A06(i5);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        List A082 = c113525Ap.A08(false, true);
        int size2 = A082.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C113525Ap c113525Ap3 = (C113525Ap) A082.get(i6);
            if (androidContentCaptureManager.A06().A04(c113525Ap3.A02) && c18750w2.A04(c113525Ap3.A02)) {
                Object A03 = c18750w2.A03(c113525Ap3.A02);
                if (A03 != null) {
                    A01(androidContentCaptureManager, (C113535Aq) A03, c113525Ap3);
                } else {
                    AbstractC28290Cdc.A02("node not present in pruned tree before this change");
                    throw C00O.createAndThrow();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        if (r16.A0A.add(r18.A04) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        r16.A0F.F8s(X.C0eB.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.01O, X.0w1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(androidx.compose.ui.contentcapture.AndroidContentCaptureManager r16, X.C113535Aq r17, X.C113525Ap r18) {
        /*
            r5 = 0
            X.0w1 r11 = new X.0w1
            r11.<init>()
            long[] r0 = X.AbstractC004701m.A00
            r0 = 6
            X.C18740w1.A02(r11, r0)
            r10 = 1
            r12 = r18
            java.util.List r7 = r12.A08(r5, r10)
            int r4 = r7.size()
            r3 = 0
        L18:
            r6 = r16
            r8 = r17
            if (r3 >= r4) goto L42
            java.lang.Object r2 = r7.get(r3)
            X.5Ap r2 = (X.C113525Ap) r2
            X.01M r1 = r6.A06()
            int r0 = r2.A02
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L3f
            X.0w1 r1 = r8.A00
            int r0 = r2.A02
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L84
            int r0 = r2.A02
            r11.A06(r0)
        L3f:
            int r3 = r3 + 1
            goto L18
        L42:
            X.0w1 r0 = r8.A00
            int[] r9 = r0.A02
            long[] r8 = r0.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto La2
            r4 = 0
        L4e:
            r17 = r8[r4]
            r13 = -1
            long r13 = r13 ^ r17
            r0 = 7
            long r13 = r13 << r0
            long r13 = r13 & r17
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r1
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L9d
            int r0 = r4 - r7
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r3 = 8
            int r2 = 8 - r0
            r1 = 0
        L6d:
            if (r1 >= r2) goto L9b
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L96
            int r0 = r4 << 3
            int r0 = r0 + r1
            r0 = r9[r0]
            boolean r0 = r11.A04(r0)
            if (r0 != 0) goto L96
        L84:
            X.599 r1 = r12.A04
            X.04o r0 = r6.A0A
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L95
            X.1Iq r1 = r6.A0F
            X.0eB r0 = X.C0eB.A00
            r1.F8s(r0)
        L95:
            return
        L96:
            long r17 = r17 >> r3
            int r1 = r1 + 1
            goto L6d
        L9b:
            if (r2 != r3) goto La2
        L9d:
            if (r4 == r7) goto La2
            int r4 = r4 + 1
            goto L4e
        La2:
            java.util.List r4 = r12.A08(r5, r10)
            int r3 = r4.size()
        Laa:
            if (r5 >= r3) goto L95
            java.lang.Object r2 = r4.get(r5)
            X.5Ap r2 = (X.C113525Ap) r2
            X.01M r1 = r6.A06()
            int r0 = r2.A02
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto Lcd
            X.0w2 r1 = r6.A01
            int r0 = r2.A02
            java.lang.Object r0 = r1.A03(r0)
            if (r0 == 0) goto Ld0
            X.5Aq r0 = (X.C113535Aq) r0
            A02(r6, r0, r2)
        Lcd:
            int r5 = r5 + 1
            goto Laa
        Ld0:
            java.lang.String r0 = "node not present in pruned tree before this change"
            X.AbstractC28290Cdc.A02(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A02(androidx.compose.ui.contentcapture.AndroidContentCaptureManager, X.5Aq, X.5Ap):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:12:0x004e, B:13:0x0051, B:18:0x0061, B:20:0x0069, B:24:0x0074, B:25:0x0077, B:27:0x007b, B:28:0x0084, B:38:0x005e), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0095 -> B:13:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(X.InterfaceC23621Ds r9) {
        /*
            r8 = this;
            r3 = 3
            boolean r0 = X.C206459Cc.A00(r9, r3)
            if (r0 == 0) goto L2c
            r6 = r9
            X.9Cc r6 = (X.C206459Cc) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r0 = r6.A03
            X.1JX r7 = X.C1JX.A02
            int r1 = r6.A00
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3a
            if (r1 != r5) goto L32
            java.lang.Object r3 = r6.A02
            X.1Jl r3 = (X.C24861Jl) r3
            java.lang.Object r2 = r6.A01
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r2 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r2
            goto L4e
        L2c:
            X.9Cc r6 = new X.9Cc
            r6.<init>(r8, r9, r3)
            goto L15
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L3a:
            java.lang.Object r3 = r6.A02
            X.1Jl r3 = (X.C24861Jl) r3
            java.lang.Object r2 = r6.A01
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r2 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r2
            goto L5e
        L43:
            X.AbstractC09560e7.A00(r0)
            X.1Iq r0 = r8.A0F     // Catch: java.lang.Throwable -> La4
            X.1Jl r3 = r0.CgS()     // Catch: java.lang.Throwable -> La4
            r2 = r8
            goto L51
        L4e:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> La2
        L51:
            r6.A01 = r2     // Catch: java.lang.Throwable -> La2
            r6.A02 = r3     // Catch: java.lang.Throwable -> La2
            r6.A00 = r4     // Catch: java.lang.Throwable -> La2
            java.lang.Object r0 = r3.A01(r6)     // Catch: java.lang.Throwable -> La2
            if (r0 != r7) goto L61
            goto L98
        L5e:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> La2
        L61:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L9a
            r3.A00()     // Catch: java.lang.Throwable -> La2
            X.5aH r1 = r2.A03     // Catch: java.lang.Throwable -> La2
            r0 = 0
            if (r1 == 0) goto L72
            r0 = 1
        L72:
            if (r0 == 0) goto L77
            r2.A00()     // Catch: java.lang.Throwable -> La2
        L77:
            boolean r0 = r2.A05     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L84
            r2.A05 = r4     // Catch: java.lang.Throwable -> La2
            android.os.Handler r1 = r2.A09     // Catch: java.lang.Throwable -> La2
            java.lang.Runnable r0 = r2.A0E     // Catch: java.lang.Throwable -> La2
            r1.post(r0)     // Catch: java.lang.Throwable -> La2
        L84:
            X.04o r0 = r2.A0A     // Catch: java.lang.Throwable -> La2
            r0.clear()     // Catch: java.lang.Throwable -> La2
            r0 = 100
            r6.A01 = r2     // Catch: java.lang.Throwable -> La2
            r6.A02 = r3     // Catch: java.lang.Throwable -> La2
            r6.A00 = r5     // Catch: java.lang.Throwable -> La2
            java.lang.Object r0 = X.AbstractC89993zf.A01(r6, r0)     // Catch: java.lang.Throwable -> La2
            if (r0 != r7) goto L51
            goto L99
        L98:
            return r7
        L99:
            return r7
        L9a:
            X.04o r0 = r2.A0A
            r0.clear()
            X.0eB r7 = X.C0eB.A00
            return r7
        La2:
            r1 = move-exception
            goto La6
        La4:
            r1 = move-exception
            r2 = r8
        La6:
            X.04o r0 = r2.A0A
            r0.clear()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A07(X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    private final void A00() {
        C119005aH c119005aH = this.A03;
        if (c119005aH != null && Build.VERSION.SDK_INT >= 29) {
            C18750w2 c18750w2 = this.A0B;
            boolean z = false;
            if (c18750w2.A01 != 0) {
                z = true;
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = c18750w2.A04;
                long[] jArr = c18750w2.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((j & ((j ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j & 255) < 128) {
                                    arrayList.add(objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(((C120855dc) arrayList.get(i4)).A00);
                }
                c119005aH.A04(arrayList2);
                c18750w2.A06();
            }
            C18740w1 c18740w1 = this.A0C;
            if (c18740w1.A01 != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = c18740w1.A02;
                long[] jArr2 = c18740w1.A03;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j2 = jArr2[i5];
                        if ((j2 & ((j2 ^ (-1)) << 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - (((i5 - length2) ^ (-1)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j2 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i5 << 3) + i7]));
                                }
                                j2 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i8)).intValue()));
                }
                c119005aH.A05(AbstractC001800i.A0y(arrayList4));
                c18740w1.A05();
            }
        }
    }

    public static final void A03(AndroidContentCaptureManager androidContentCaptureManager, String str, int i) {
        C119005aH c119005aH;
        if (Build.VERSION.SDK_INT >= 29 && (c119005aH = androidContentCaptureManager.A03) != null) {
            AutofillId A01 = c119005aH.A01(i);
            if (A01 != null) {
                c119005aH.A03(A01, str);
            } else {
                AbstractC28290Cdc.A02("Invalid content capture ID");
                throw C00O.createAndThrow();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c1, code lost:
    
        if (((r18 & ((r18 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(X.C113525Ap r23) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A04(X.5Ap):void");
    }

    private final void A05(C113525Ap c113525Ap) {
        if (this.A03 != null) {
            int i = c113525Ap.A02;
            C18750w2 c18750w2 = this.A0B;
            if (c18750w2.A05(i)) {
                c18750w2.A07(i);
            } else {
                this.A0C.A06(i);
            }
            List A08 = c113525Ap.A08(false, true);
            int size = A08.size();
            for (int i2 = 0; i2 < size; i2++) {
                A05((C113525Ap) A08.get(i2));
            }
        }
    }

    public final C01M A06() {
        if (this.A06) {
            this.A06 = false;
            this.A07 = AbstractC120865dd.A00(this.A0D.A0l);
            this.A00 = System.currentTimeMillis();
        }
        return this.A07;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStart(C07X c07x) {
        this.A03 = (C119005aH) this.A08.invoke();
        A04(this.A0D.A0l.A00());
        A00();
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStop(C07X c07x) {
        A05(this.A0D.A0l.A00());
        A00();
        this.A03 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A09.removeCallbacks(this.A0E);
        this.A03 = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.01O, X.0w1] */
    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, InterfaceC16820sZ interfaceC16820sZ) {
        this.A0D = androidComposeView;
        this.A08 = interfaceC16820sZ;
        ?? c01o = new C01O();
        long[] jArr = AbstractC004701m.A00;
        C18740w1.A02(c01o, 6);
        this.A0C = c01o;
        this.A04 = C05F.A00;
        this.A06 = true;
        this.A0A = new C012504o(0);
        this.A0F = new C24721Ip(1);
        this.A09 = new Handler(Looper.getMainLooper());
        C18750w2 c18750w2 = C01N.A00;
        C14360o3.A0C(c18750w2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A07 = c18750w2;
        this.A01 = new C18750w2(6);
        C113525Ap A00 = androidComposeView.A0l.A00();
        C14360o3.A0C(c18750w2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A02 = new C113535Aq(c18750w2, A00);
        this.A0E = new Runnable() { // from class: X.5BD
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                Object obj2;
                Object obj3;
                AndroidContentCaptureManager androidContentCaptureManager = AndroidContentCaptureManager.this;
                if (androidContentCaptureManager.A03 != null) {
                    AndroidComposeView androidComposeView2 = androidContentCaptureManager.A0D;
                    androidComposeView2.CpG(true);
                    C113455Ah c113455Ah = androidComposeView2.A0l;
                    AndroidContentCaptureManager.A02(androidContentCaptureManager, androidContentCaptureManager.A02, c113455Ah.A00());
                    AndroidContentCaptureManager.A01(androidContentCaptureManager, androidContentCaptureManager.A02, c113455Ah.A00());
                    C01M A06 = androidContentCaptureManager.A06();
                    int[] iArr = A06.A02;
                    long[] jArr2 = A06.A03;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr2[i];
                            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        int i4 = iArr[(i << 3) + i3];
                                        C113535Aq c113535Aq = (C113535Aq) androidContentCaptureManager.A01.A03(i4);
                                        C121655fH c121655fH = (C121655fH) A06.A03(i4);
                                        if (c121655fH != null) {
                                            C113525Ap c113525Ap = c121655fH.A01;
                                            C113505An c113505An = c113525Ap.A05;
                                            Iterator it = c113505An.iterator();
                                            if (c113535Aq == null) {
                                                while (it.hasNext()) {
                                                    Object key = ((Map.Entry) it.next()).getKey();
                                                    C113565At c113565At = AbstractC113545Ar.A0R;
                                                    if (C14360o3.A0K(key, c113565At)) {
                                                        List list = (List) C5B6.A00(c113505An, c113565At);
                                                        if (list != null) {
                                                            obj3 = AbstractC001800i.A0J(list);
                                                        } else {
                                                            obj3 = null;
                                                        }
                                                        AndroidContentCaptureManager.A03(androidContentCaptureManager, String.valueOf(obj3), c113525Ap.A02);
                                                    }
                                                }
                                            } else {
                                                while (it.hasNext()) {
                                                    Object key2 = ((Map.Entry) it.next()).getKey();
                                                    C113565At c113565At2 = AbstractC113545Ar.A0R;
                                                    if (C14360o3.A0K(key2, c113565At2)) {
                                                        List list2 = (List) C5B6.A00(c113535Aq.A01, c113565At2);
                                                        if (list2 != null) {
                                                            obj = AbstractC001800i.A0J(list2);
                                                        } else {
                                                            obj = null;
                                                        }
                                                        List list3 = (List) C5B6.A00(c113505An, c113565At2);
                                                        if (list3 != null) {
                                                            obj2 = AbstractC001800i.A0J(list3);
                                                        } else {
                                                            obj2 = null;
                                                        }
                                                        if (!C14360o3.A0K(obj, obj2)) {
                                                            AndroidContentCaptureManager.A03(androidContentCaptureManager, String.valueOf(obj2), c113525Ap.A02);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            AbstractC28290Cdc.A02("no value for specified key");
                                            throw C00O.createAndThrow();
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    C18750w2 c18750w22 = androidContentCaptureManager.A01;
                    c18750w22.A06();
                    C01M A062 = androidContentCaptureManager.A06();
                    int[] iArr2 = A062.A02;
                    Object[] objArr = A062.A04;
                    long[] jArr3 = A062.A03;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j2 = jArr3[i5];
                            if (((((-1) ^ j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - (((i5 - length2) ^ (-1)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((255 & j2) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        c18750w22.A08(iArr2[i8], new C113535Aq(androidContentCaptureManager.A06(), ((C121655fH) objArr[i8]).A01));
                                    }
                                    j2 >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                }
                            }
                            if (i5 == length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    androidContentCaptureManager.A02 = new C113535Aq(androidContentCaptureManager.A06(), c113455Ah.A00());
                    androidContentCaptureManager.A05 = false;
                }
            }
        };
    }
}
