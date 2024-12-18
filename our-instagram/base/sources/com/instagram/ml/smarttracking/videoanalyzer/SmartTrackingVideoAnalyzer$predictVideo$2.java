package com.instagram.ml.smarttracking.videoanalyzer;

import X.AbstractC09560e7;
import X.AbstractC12120kG;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C16930sl;
import X.C209059Mn;
import X.C50662MYe;
import X.C8MY;
import X.C8MZ;
import X.C9N5;
import X.C9N6;
import X.C9N7;
import X.C9N8;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC58173Pqd;
import X.MY3;
import X.MYG;
import X.MYH;
import X.MYJ;
import X.MYU;
import X.MYV;
import X.XOT;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ml.smarttracking.videoanalyzer.SmartTrackingVideoAnalyzer$predictVideo$2", f = "SmartTrackingVideoAnalyzer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class SmartTrackingVideoAnalyzer$predictVideo$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C8MY A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartTrackingVideoAnalyzer$predictVideo$2(C8MY c8my, String str, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A01 = c8my;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new SmartTrackingVideoAnalyzer$predictVideo$2(this.A01, this.A02, interfaceC23621Ds, this.A00);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SmartTrackingVideoAnalyzer$predictVideo$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        final Integer[] numArr = {new Integer(0), new Integer(0)};
        final ArrayList A1E = AbstractC166987dD.A1E();
        final ArrayList A1E2 = AbstractC166987dD.A1E();
        final ArrayList A1E3 = AbstractC166987dD.A1E();
        final ArrayList A1E4 = AbstractC166987dD.A1E();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final C8MY c8my = this.A01;
        HashMap hashMap = c8my.A04;
        final String str = this.A02;
        hashMap.put(str, atomicBoolean);
        Context context = c8my.A01;
        UserSession userSession = c8my.A02;
        File A11 = AbstractC166987dD.A11(str);
        final long j = this.A00 * 1000;
        MYU A00 = MYG.A00(userSession);
        MYV A002 = MYH.A00(userSession);
        final C8MZ c8mz = c8my.A03;
        final ArrayList arrayList = c8my.A00;
        InterfaceC58173Pqd interfaceC58173Pqd = new InterfaceC58173Pqd(c8mz, arrayList, A1E, A1E2, A1E3, A1E4, atomicBoolean, numArr, j) { // from class: X.9OR
            public int A00;
            public long A01;
            public final long A02;
            public final C8MZ A03;
            public final ArrayList A04;
            public final List A05;
            public final List A06;
            public final List A07;
            public final List A08;
            public final AtomicBoolean A09;
            public final Integer[] A0A;

            {
                AbstractC167007dF.A1I(c8mz, 1, arrayList);
                this.A03 = c8mz;
                this.A0A = numArr;
                this.A08 = A1E;
                this.A07 = A1E2;
                this.A05 = A1E3;
                this.A06 = A1E4;
                this.A02 = j;
                this.A04 = arrayList;
                this.A09 = atomicBoolean;
            }

            /* JADX WARN: Type inference failed for: r3v5, types: [X.A7X, java.lang.Object] */
            @Override // X.InterfaceC58173Pqd
            public final void CzY(long j2, int i, Bitmap bitmap) {
                A7X a7x;
                if (!this.A09.get()) {
                    Integer[] numArr2 = this.A0A;
                    if (numArr2[0].intValue() == 0) {
                        numArr2[0] = Integer.valueOf(bitmap.getWidth());
                        numArr2[1] = Integer.valueOf(bitmap.getHeight());
                    }
                    C8MZ c8mz2 = this.A03;
                    List list = this.A07;
                    List list2 = this.A05;
                    List list3 = this.A06;
                    C14360o3.A0B(list, 1);
                    C14360o3.A0B(list2, 2);
                    C14360o3.A0B(list3, 3);
                    final C185808Ma c185808Ma = c8mz2.A01;
                    c185808Ma.A00 = new C9P1(bitmap, c8mz2, list, list2, list3);
                    C85M c85m = c185808Ma.A01;
                    c85m.A02 = new InterfaceC203488z7() { // from class: X.9P0
                        /* JADX WARN: Type inference failed for: r5v2, types: [X.A7X, java.lang.Object] */
                        @Override // X.InterfaceC203488z7
                        public final /* bridge */ /* synthetic */ void DaC(Object obj2) {
                            Rect rect = (Rect) obj2;
                            C185808Ma c185808Ma2 = C185808Ma.this;
                            A7X a7x2 = null;
                            c185808Ma2.A01.A02 = null;
                            C9P1 c9p1 = c185808Ma2.A00;
                            if (c9p1 != null) {
                                if (rect != null) {
                                    float centerX = rect.centerX();
                                    float centerY = rect.centerY();
                                    ?? obj3 = new Object();
                                    obj3.A00 = centerX;
                                    obj3.A01 = centerY;
                                    a7x2 = obj3;
                                }
                                c9p1.A04.add(a7x2);
                                final C185818Mb c185818Mb = c9p1.A01.A00;
                                c185818Mb.A00 = new C9PI(a7x2, c9p1.A02, c9p1.A03);
                                final Bitmap bitmap2 = c9p1.A00;
                                C85X c85x = c185818Mb.A01;
                                c85x.A01 = new InterfaceC203488z7() { // from class: X.9PH
                                    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
                                    /* JADX WARN: Type inference failed for: r4v5, types: [X.A7X, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r4v6, types: [X.A7X, java.lang.Object] */
                                    @Override // X.InterfaceC203488z7
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final /* bridge */ /* synthetic */ void DaC(java.lang.Object r8) {
                                        /*
                                            r7 = this;
                                            java.lang.Number r8 = (java.lang.Number) r8
                                            r4 = 0
                                            X.8Mb r5 = r2
                                            if (r8 == 0) goto L36
                                            android.graphics.Bitmap r2 = r1
                                            int r0 = r8.intValue()
                                            if (r0 == 0) goto L36
                                            r6 = 2
                                            if (r0 < r6) goto L3b
                                            int r1 = r2.getWidth()
                                            int r1 = r1 / r6
                                            int r0 = r2.getHeight()
                                            int r0 = r0 / r6
                                            X.9PI r2 = r5.A00
                                            if (r2 == 0) goto L35
                                            float r1 = (float) r1
                                            float r0 = (float) r0
                                            X.A7X r4 = new X.A7X
                                            r4.<init>()
                                            r4.A00 = r1
                                            r4.A01 = r0
                                            java.util.List r0 = r2.A01
                                            r0.add(r4)
                                            java.util.List r0 = r2.A02
                                        L32:
                                            r0.add(r4)
                                        L35:
                                            return
                                        L36:
                                            X.9PI r2 = r5.A00
                                            if (r2 == 0) goto L35
                                            goto L71
                                        L3b:
                                            X.85X r3 = r5.A01
                                            com.instagram.ml.bodytracking.BodyTrackerJni r0 = r3.A02
                                            if (r0 == 0) goto L35
                                            int[] r0 = r0.getDetectedPeopleIds()
                                            if (r0 == 0) goto L35
                                            r2 = 0
                                            r1 = r0[r2]
                                            com.instagram.ml.bodytracking.BodyTrackerJni r0 = r3.A02
                                            if (r0 == 0) goto L35
                                            float[] r4 = r0.getBoundingBox(r1)
                                            if (r4 == 0) goto L35
                                            r3 = r4[r2]
                                            r0 = r4[r6]
                                            r2 = 1073741824(0x40000000, float:2.0)
                                            float r0 = r0 / r2
                                            float r3 = r3 + r0
                                            r0 = 1
                                            r1 = r4[r0]
                                            r0 = 3
                                            r0 = r4[r0]
                                            float r0 = r0 / r2
                                            float r1 = r1 + r0
                                            X.9PI r2 = r5.A00
                                            if (r2 == 0) goto L35
                                            X.A7X r4 = new X.A7X
                                            r4.<init>()
                                            r4.A00 = r3
                                            r4.A01 = r1
                                        L71:
                                            java.util.List r0 = r2.A01
                                            r0.add(r4)
                                            java.util.List r0 = r2.A02
                                            if (r4 != 0) goto L32
                                            X.A7X r4 = r2.A00
                                            goto L32
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C9PH.DaC(java.lang.Object):void");
                                    }
                                };
                                c85x.A00 = new C203498z8(bitmap2);
                                c85x.A00();
                            }
                        }
                    };
                    c85m.A00 = bitmap.getWidth();
                    c85m.A01 = new C203498z8(bitmap);
                    c85m.A00();
                    if (i < this.A00 && i != 0 && i % 4 == 0) {
                        A7X a7x2 = (A7X) list3.get(list3.size() - 1);
                        A7X a7x3 = (A7X) list3.get(list3.size() - 2);
                        int i2 = 1;
                        do {
                            if (a7x2 != null) {
                                if (a7x3 != null) {
                                    ?? obj2 = new Object();
                                    obj2.A00 = ((a7x3.A00 + a7x2.A00) / 4.0f) * i2;
                                    a7x = obj2;
                                } else {
                                    a7x = a7x2;
                                }
                            } else {
                                a7x = a7x3;
                            }
                            list3.add(list3.size() - 1, a7x);
                            i2++;
                        } while (i2 < 4);
                    }
                    Iterator it = this.A04.iterator();
                    C14360o3.A07(it);
                    while (it.hasNext()) {
                        Object next = it.next();
                        C14360o3.A07(next);
                        ((InterfaceC185838Md) next).Dup((int) ((100 * j2) / this.A02));
                    }
                }
            }

            @Override // X.InterfaceC58173Pqd
            public final void DMF(long j2) {
            }

            @Override // X.InterfaceC58173Pqd
            public final boolean Cs9() {
                return !this.A09.get();
            }

            @Override // X.InterfaceC58173Pqd
            public final boolean Ehv(int i, long j2) {
                this.A08.add(Integer.valueOf((int) j2));
                if (i != 0) {
                    if (i == 1) {
                        this.A00 = ((((int) ((this.A02 / (j2 - this.A01)) - 1)) - 4) / 4) * 4;
                    }
                    if (i >= this.A00 || (i % 4 == 0 && !this.A09.get())) {
                        return true;
                    }
                    return false;
                }
                this.A01 = j2;
                return true;
            }

            @Override // X.InterfaceC58173Pqd
            public final /* synthetic */ Long AVb(List list) {
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: X.9OS
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.AAL] */
            @Override // java.lang.Runnable
            public final void run() {
                if (!atomicBoolean.get()) {
                    C8MY c8my2 = c8my;
                    ArrayList arrayList2 = A1E4;
                    C14360o3.A0B(arrayList2, 0);
                    int size = arrayList2.size();
                    float[] fArr = new float[size];
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        if (arrayList2.get(i) == null) {
                            if (i > 0) {
                                fArr[i] = fArr[i - 1];
                            } else {
                                fArr[i] = 0.0f;
                            }
                        }
                        A7X a7x = (A7X) arrayList2.get(i);
                        if (a7x != null) {
                            fArr[i] = a7x.A00;
                        }
                    }
                    float[] fArr2 = new float[size];
                    double[] dArr = new double[201];
                    int i2 = -100;
                    int i3 = 0;
                    do {
                        dArr[i3] = Math.exp((-Math.pow(i2, 2.0d)) / (2.0d * Math.pow(15.0d, 2.0d))) / (15.0d * Math.sqrt(6.283185307179586d));
                        i2++;
                        i3++;
                        if (i2 > 100) {
                            break;
                        }
                    } while (i3 < 201);
                    for (int i4 = 0; i4 < size; i4++) {
                        float f = 0.0f;
                        int i5 = i4 - 100;
                        int i6 = i4 + 100;
                        if (i5 <= i6) {
                            while (true) {
                                int i7 = i5;
                                while (true) {
                                    if (i7 >= 0) {
                                        if (i7 < size) {
                                            break;
                                        }
                                    } else {
                                        i7 = -i7;
                                    }
                                    if (i7 >= size) {
                                        i7 = ((size * 2) - i7) - 2;
                                    }
                                }
                                f += (float) (((float) dArr[(i5 - i4) + 100]) * fArr[i7]);
                                if (i5 != i6) {
                                    i5++;
                                }
                            }
                        }
                        fArr2[i4] = f;
                    }
                    int size3 = arrayList2.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        A7X a7x2 = (A7X) arrayList2.get(i8);
                        if (a7x2 != null) {
                            a7x2.A00 = fArr2[i8];
                        }
                    }
                    String str2 = str;
                    Integer[] numArr2 = numArr;
                    int intValue = numArr2[0].intValue();
                    int intValue2 = numArr2[1].intValue();
                    ArrayList arrayList3 = A1E;
                    ArrayList arrayList4 = A1E2;
                    ArrayList arrayList5 = A1E3;
                    C14360o3.A0B(str2, 1);
                    AbstractC167017dG.A1S(arrayList3, arrayList4);
                    C14360o3.A0B(arrayList5, 6);
                    ?? obj2 = new Object();
                    obj2.A02 = str2;
                    obj2.A01 = intValue;
                    obj2.A00 = intValue2;
                    obj2.A06 = arrayList3;
                    obj2.A05 = arrayList4;
                    obj2.A03 = arrayList5;
                    obj2.A04 = arrayList2;
                    AbstractC185878Mh.A00(c8my2.A02).A01(obj2);
                    Iterator A13 = AbstractC166997dE.A13(c8my2.A00);
                    while (A13.hasNext()) {
                        InterfaceC185838Md interfaceC185838Md = (InterfaceC185838Md) AbstractC166997dE.A0l(A13);
                        interfaceC185838Md.Dup(100);
                        interfaceC185838Md.Duo();
                    }
                    c8my2.A04.remove(str2);
                    C11T.A02(new RunnableC24475Asu(c8my2));
                }
            }
        };
        C209059Mn c209059Mn = new C209059Mn(224);
        AbstractC167017dG.A1U(A00, A002);
        try {
            UserSession userSession2 = A002.A00;
            ClipInfo A02 = MY3.A02(userSession2, A11, j);
            C9N6 A003 = C9N5.A00(c209059Mn.A00(new Point(A02.A09, A02.A06)), c209059Mn.A00(new Point(A02.A09, A02.A06)), A02);
            C9N8 c9n8 = new C9N8(context, userSession2, C9N7.A00(context, userSession2), XOT.A01, A003);
            Point point = A003.A03;
            MYJ myj = new MYJ(context, c9n8, userSession, A00, interfaceC58173Pqd, A11, C16930sl.A00, point.x, point.y, 0L, j, false, true, false);
            myj.A04 = new C50662MYe(myj, runnable);
            myj.A01();
        } catch (RuntimeException e) {
            AbstractC12120kG.A09("VideoFrameUtil", "extractMultipleFrames failed.", e);
        }
        return C0eB.A00;
    }
}
