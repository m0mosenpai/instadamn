package X;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4YN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YN {
    public long A00;
    public C4YN A01;
    public C4YM A02;
    public C4WU A03;
    public C4WI A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C4Z0 A08;
    public final Object A09;
    public final InterfaceC96074Tq[] A0A;
    public final InterfaceC97394Yz[] A0B;
    public final C4YO A0C;
    public final C4VC A0D;
    public final boolean[] A0E;

    public final long A01(C4WI c4wi, boolean[] zArr, long j, boolean z) {
        int length;
        C4WI c4wi2;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c4wi.A00) {
                break;
            }
            boolean[] zArr2 = this.A0E;
            if (z || (c4wi2 = this.A04) == null || !Util.A0I(c4wi.A03[i], c4wi2.A03[i]) || !Util.A0I(c4wi.A04[i], c4wi2.A04[i])) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        InterfaceC97394Yz[] interfaceC97394YzArr = this.A0B;
        int i2 = 0;
        while (true) {
            length = this.A0A.length;
            if (i2 >= length) {
                break;
            }
            i2++;
        }
        this.A04 = c4wi;
        C4Z0 c4z0 = this.A08;
        C4WE[] c4weArr = c4wi.A04;
        long EMx = c4z0.EMx(interfaceC97394YzArr, c4weArr, this.A0E, zArr, j);
        for (int i3 = 0; i3 < length; i3++) {
        }
        this.A06 = false;
        for (int i4 = 0; i4 < interfaceC97394YzArr.length; i4++) {
            if (interfaceC97394YzArr[i4] != null) {
                boolean z3 = false;
                if (c4wi.A03[i4] != null) {
                    z3 = true;
                }
                C4B8.A04(z3);
                this.A06 = true;
            } else {
                boolean z4 = false;
                if (c4weArr[i4] == null) {
                    z4 = true;
                }
                C4B8.A04(z4);
            }
        }
        return EMx;
    }

    public final void A05(float f) {
        this.A07 = true;
        this.A03 = this.A08.CAF();
        long A01 = A01(A02(f), new boolean[this.A0A.length], this.A02.A03, false);
        long j = this.A00;
        C4YM c4ym = this.A02;
        this.A00 = j + (c4ym.A03 - A01);
        this.A02 = c4ym.A01(A01);
    }

    public final long A00() {
        if (!this.A07) {
            return this.A02.A03;
        }
        if (this.A06) {
            long Aik = this.A08.Aik();
            if (Aik != Long.MIN_VALUE) {
                return Aik;
            }
        }
        return this.A02.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C4WI A02(float f) {
        C96394Ux c96394Ux;
        Pair create;
        String str;
        int i;
        boolean z;
        List list;
        boolean z2;
        C4WD c4wd;
        C4WE abstractC97844aP;
        String str2;
        String str3;
        AbstractCollection arrayList;
        AbstractCollection arrayList2;
        int[] iArr;
        int i2;
        C4VC c4vc = this.A0D;
        InterfaceC96074Tq[] interfaceC96074TqArr = this.A0A;
        C4WU c4wu = this.A03;
        C4VB c4vb = (C4VB) c4vc;
        int length = interfaceC96074TqArr.length;
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C4WV[][] c4wvArr = new C4WV[i3];
        int[][][] iArr3 = new int[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = c4wu.A01;
            c4wvArr[i4] = new C4WV[i5];
            iArr3[i4] = new int[i5];
        }
        int[] iArr4 = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            InterfaceC96074Tq interfaceC96074Tq = interfaceC96074TqArr[i6];
            if (!(interfaceC96074Tq instanceof AbstractC96034Tm) && !(interfaceC96074Tq instanceof AbstractC97194Ye)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            iArr4[i6] = i2;
        }
        for (int i7 = 0; i7 < c4wu.A01; i7++) {
            C4WV c4wv = (C4WV) c4wu.A02.get(i7);
            boolean z3 = false;
            if (c4wv.A02 == 5) {
                z3 = true;
            }
            int i8 = length;
            int i9 = 0;
            boolean z4 = true;
            for (int i10 = 0; i10 < length; i10++) {
                InterfaceC96074Tq interfaceC96074Tq2 = interfaceC96074TqArr[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < c4wv.A01; i12++) {
                    i11 = Math.max(i11, interfaceC96074Tq2.EpR(c4wv.A04[i12]) & 7);
                }
                boolean z5 = false;
                if (iArr2[i10] == 0) {
                    z5 = true;
                }
                int i13 = i9;
                if (i11 > i13 || (i11 == i13 && z3 && !z4 && z5)) {
                    i8 = i10;
                    z4 = z5;
                    i9 = i11;
                }
            }
            if (i8 == length) {
                iArr = new int[c4wv.A01];
            } else {
                InterfaceC96074Tq interfaceC96074Tq3 = interfaceC96074TqArr[i8];
                int i14 = c4wv.A01;
                iArr = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr[i15] = interfaceC96074Tq3.EpR(c4wv.A04[i15]);
                }
            }
            int i16 = iArr2[i8];
            c4wvArr[i8][i16] = c4wv;
            iArr3[i8][i16] = iArr;
            iArr2[i8] = i16 + 1;
        }
        C4WU[] c4wuArr = new C4WU[length];
        String[] strArr = new String[length];
        int[] iArr5 = new int[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = iArr2[i17];
            C4WV[] c4wvArr2 = c4wvArr[i17];
            boolean z6 = false;
            if (i18 <= c4wvArr2.length) {
                z6 = true;
            }
            C4B8.A03(z6);
            c4wuArr[i17] = new C4WU((C4WV[]) Arrays.copyOf(c4wvArr2, i18));
            Object[] objArr = iArr3[i17];
            boolean z7 = false;
            if (i18 <= objArr.length) {
                z7 = true;
            }
            C4B8.A03(z7);
            iArr3[i17] = Arrays.copyOf(objArr, i18);
            strArr[i17] = interfaceC96074TqArr[i17].getName();
            iArr5[i17] = ((AbstractC96044Tn) interfaceC96074TqArr[i17]).A0B;
        }
        int i19 = iArr2[length];
        C4WV[] c4wvArr3 = c4wvArr[length];
        boolean z8 = false;
        if (i19 <= c4wvArr3.length) {
            z8 = true;
        }
        C4B8.A03(z8);
        C97214Yg c97214Yg = new C97214Yg(new C4WU((C4WV[]) Arrays.copyOf(c4wvArr3, i19)), iArr5, iArr4, c4wuArr, strArr, iArr3);
        final C4VA c4va = (C4VA) c4vb;
        synchronized (c4va.A03) {
            c96394Ux = c4va.A01;
        }
        int i20 = c97214Yg.A00;
        C97224Yh[] c97224YhArr = new C97224Yh[i20];
        Pair A03 = c4va.A03(c96394Ux, c97214Yg, iArr4, iArr3);
        if (A03 != null) {
            c97224YhArr[((Number) A03.second).intValue()] = A03.first;
        }
        boolean z9 = false;
        int i21 = 0;
        while (true) {
            if (i21 >= i20) {
                break;
            }
            if (2 == c97214Yg.A03[i21] && c97214Yg.A04[i21].A01 > 0) {
                z9 = true;
                break;
            }
            i21++;
        }
        Comparator comparator = new Comparator() { // from class: X.4Yj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C97264Yl) Collections.max((Collection) obj)).compareTo((C97264Yl) Collections.max((Collection) obj2));
            }
        };
        ArrayList arrayList3 = new ArrayList();
        for (int i22 = 0; i22 < i20; i22++) {
            if (1 == c97214Yg.A03[i22]) {
                C4WU c4wu2 = c97214Yg.A04[i22];
                for (int i23 = 0; i23 < c4wu2.A01; i23++) {
                    C4WV c4wv2 = (C4WV) c4wu2.A02.get(i23);
                    Object[] objArr2 = iArr3[i22][i23];
                    InterfaceC28041Xi interfaceC28041Xi = new InterfaceC28041Xi() { // from class: X.4Yk
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
                        
                            if (r1 != false) goto L20;
                         */
                        /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001a. Please report as an issue. */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
                        @Override // X.InterfaceC28041Xi
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean apply(java.lang.Object r4) {
                            /*
                                r3 = this;
                                X.4VA r0 = X.C4VA.this
                                X.4B6 r4 = (X.C4B6) r4
                                java.lang.Object r2 = r0.A03
                                monitor-enter(r2)
                                X.4Ux r0 = r0.A01     // Catch: java.lang.Throwable -> L38
                                boolean r0 = r0.A0A     // Catch: java.lang.Throwable -> L38
                                if (r0 == 0) goto L35
                                int r1 = r4.A06     // Catch: java.lang.Throwable -> L38
                                r0 = 2
                                if (r1 <= r0) goto L35
                                java.lang.String r1 = r4.A0W     // Catch: java.lang.Throwable -> L38
                                if (r1 == 0) goto L30
                                int r0 = r1.hashCode()     // Catch: java.lang.Throwable -> L38
                                switch(r0) {
                                    case -2123537834: goto L27;
                                    case 187078296: goto L24;
                                    case 187078297: goto L21;
                                    case 1504578661: goto L1e;
                                    default: goto L1d;
                                }     // Catch: java.lang.Throwable -> L38
                            L1d:
                                goto L30
                            L1e:
                                java.lang.String r0 = "audio/eac3"
                                goto L29
                            L21:
                                java.lang.String r0 = "audio/ac4"
                                goto L29
                            L24:
                                java.lang.String r0 = "audio/ac3"
                                goto L29
                            L27:
                                java.lang.String r0 = "audio/eac3-joc"
                            L29:
                                boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L38
                                r0 = 1
                                if (r1 != 0) goto L31
                            L30:
                                r0 = 0
                            L31:
                                if (r0 != 0) goto L35
                                r0 = 0
                                goto L36
                            L35:
                                r0 = 1
                            L36:
                                monitor-exit(r2)     // Catch: java.lang.Throwable -> L38
                                return r0
                            L38:
                                r0 = move-exception
                                monitor-exit(r2)     // Catch: java.lang.Throwable -> L38
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C97254Yk.apply(java.lang.Object):boolean");
                        }
                    };
                    ImmutableList.Builder builder = ImmutableList.builder();
                    for (int i24 = 0; i24 < c4wv2.A01; i24++) {
                        builder.add((Object) new C97264Yl(c4wv2, c96394Ux, interfaceC28041Xi, i22, i24, objArr2[i24], z9));
                    }
                    ImmutableList build = builder.build();
                    boolean[] zArr = new boolean[c4wv2.A01];
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (int i25 = 0; i25 < c4wv2.A01; i25++) {
                        AbstractC97274Ym abstractC97274Ym = (AbstractC97274Ym) build.get(i25);
                        int A00 = abstractC97274Ym.A00();
                        if (!zArr[i25] && A00 != 0) {
                            if (A00 == 1) {
                                arrayList2 = ImmutableList.of((Object) abstractC97274Ym);
                                arrayList4.add(abstractC97274Ym);
                            } else {
                                arrayList2 = new ArrayList();
                                arrayList2.add(abstractC97274Ym);
                                for (int i26 = i25 + 1; i26 < c4wv2.A01; i26++) {
                                    AbstractC97274Ym abstractC97274Ym2 = (AbstractC97274Ym) build.get(i26);
                                    if (abstractC97274Ym2.A00() == 2 && abstractC97274Ym.A01(abstractC97274Ym2)) {
                                        arrayList2.add(abstractC97274Ym2);
                                        zArr[i26] = true;
                                    }
                                }
                            }
                            arrayList5.add(arrayList2);
                        }
                    }
                    if (c4va.A01.A0C && !arrayList4.isEmpty() && arrayList4.size() == c4wv2.A01) {
                        arrayList5.clear();
                        arrayList5.add(arrayList4);
                    }
                    arrayList3.addAll(arrayList5);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            create = null;
        } else {
            List list2 = (List) Collections.max(arrayList3, comparator);
            int[] iArr6 = new int[list2.size()];
            for (int i27 = 0; i27 < list2.size(); i27++) {
                iArr6[i27] = ((AbstractC97274Ym) list2.get(i27)).A01;
            }
            AbstractC97274Ym abstractC97274Ym3 = (AbstractC97274Ym) list2.get(0);
            create = Pair.create(new C97224Yh(abstractC97274Ym3.A03, iArr6), Integer.valueOf(abstractC97274Ym3.A00));
            if (create != null) {
                c97224YhArr[((Number) create.second).intValue()] = create.first;
            }
        }
        if (create == null) {
            str = null;
        } else {
            C97224Yh c97224Yh = (C97224Yh) create.first;
            str = c97224Yh.A00.A04[c97224Yh.A01[0]].A0V;
        }
        C97284Yn c97284Yn = new C97284Yn(c96394Ux, str);
        Comparator comparator2 = new Comparator() { // from class: X.4Yo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C126665o4) ((List) obj).get(0)).compareTo((C126665o4) ((List) obj2).get(0));
            }
        };
        ArrayList arrayList6 = new ArrayList();
        for (int i28 = 0; i28 < i20; i28++) {
            if (3 == c97214Yg.A03[i28]) {
                C4WU c4wu3 = c97214Yg.A04[i28];
                for (int i29 = 0; i29 < c4wu3.A01; i29++) {
                    C4WV c4wv3 = (C4WV) c4wu3.A02.get(i29);
                    Object[] objArr3 = iArr3[i28][i29];
                    C96394Ux c96394Ux2 = c97284Yn.A00;
                    String str4 = c97284Yn.A01;
                    ImmutableList.Builder builder2 = ImmutableList.builder();
                    for (int i30 = 0; i30 < c4wv3.A01; i30++) {
                        builder2.add((Object) new C126665o4(c4wv3, c96394Ux2, str4, i28, i30, objArr3[i30]));
                    }
                    ImmutableList build2 = builder2.build();
                    boolean[] zArr2 = new boolean[c4wv3.A01];
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    for (int i31 = 0; i31 < c4wv3.A01; i31++) {
                        AbstractC97274Ym abstractC97274Ym4 = (AbstractC97274Ym) build2.get(i31);
                        int A002 = abstractC97274Ym4.A00();
                        if (!zArr2[i31] && A002 != 0) {
                            if (A002 == 1) {
                                arrayList = ImmutableList.of((Object) abstractC97274Ym4);
                                arrayList7.add(abstractC97274Ym4);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(abstractC97274Ym4);
                                for (int i32 = i31 + 1; i32 < c4wv3.A01; i32++) {
                                    AbstractC97274Ym abstractC97274Ym5 = (AbstractC97274Ym) build2.get(i32);
                                    if (abstractC97274Ym5.A00() == 2 && abstractC97274Ym4.A01(abstractC97274Ym5)) {
                                        arrayList.add(abstractC97274Ym5);
                                        zArr2[i32] = true;
                                    }
                                }
                            }
                            arrayList8.add(arrayList);
                        }
                    }
                    if (c4va.A01.A0C && !arrayList7.isEmpty() && arrayList7.size() == c4wv3.A01) {
                        arrayList8.clear();
                        arrayList8.add(arrayList7);
                    }
                    arrayList6.addAll(arrayList8);
                }
            }
        }
        if (!arrayList6.isEmpty()) {
            List list3 = (List) Collections.max(arrayList6, comparator2);
            int[] iArr7 = new int[list3.size()];
            for (int i33 = 0; i33 < list3.size(); i33++) {
                iArr7[i33] = ((AbstractC97274Ym) list3.get(i33)).A01;
            }
            AbstractC97274Ym abstractC97274Ym6 = (AbstractC97274Ym) list3.get(0);
            Pair create2 = Pair.create(new C97224Yh(abstractC97274Ym6.A03, iArr7), Integer.valueOf(abstractC97274Ym6.A00));
            if (create2 != null) {
                c97224YhArr[((Number) create2.second).intValue()] = create2.first;
            }
        }
        for (int i34 = 0; i34 < i20; i34++) {
            int i35 = c97214Yg.A03[i34];
            if (i35 != 2 && i35 != 1 && i35 != 3) {
                C4WU c4wu4 = c97214Yg.A04[i34];
                Object[] objArr4 = iArr3[i34];
                C97224Yh c97224Yh2 = null;
                C4WV c4wv4 = null;
                int i36 = 0;
                for (int i37 = 0; i37 < c4wu4.A01; i37++) {
                    C4WV c4wv5 = (C4WV) c4wu4.A02.get(i37);
                    Object[] objArr5 = objArr4[i37];
                    for (int i38 = 0; i38 < c4wv5.A01; i38++) {
                        char c = objArr5[i38];
                        boolean z10 = c96394Ux.A0D;
                        int i39 = c & 7;
                        if (i39 == 4 || (z10 && i39 == 3)) {
                            c4wv4 = c4wv5;
                            i36 = i38;
                        }
                    }
                }
                if (c4wv4 != null) {
                    c97224Yh2 = new C97224Yh(c4wv4, i36);
                }
                c97224YhArr[i34] = c97224Yh2;
            }
        }
        HashMap hashMap = new HashMap();
        for (int i40 = 0; i40 < i20; i40++) {
            C4WU c4wu5 = c97214Yg.A04[i40];
            for (int i41 = 0; i41 < c4wu5.A01; i41++) {
                c96394Ux.A0G.get(c4wu5.A02.get(i41));
            }
        }
        C4WU c4wu6 = c97214Yg.A01;
        int i42 = 0;
        while (true) {
            i = c4wu6.A01;
            if (i42 >= i) {
                break;
            }
            c96394Ux.A0G.get(c4wu6.A02.get(i42));
            i42++;
        }
        for (int i43 = 0; i43 < i20; i43++) {
            hashMap.get(Integer.valueOf(c97214Yg.A03[i43]));
        }
        for (int i44 = 0; i44 < i20; i44++) {
            C4WU c4wu7 = c97214Yg.A04[i44];
            SparseArray sparseArray = c96394Ux.A00;
            Map map = (Map) sparseArray.get(i44);
            if (map != null && map.containsKey(c4wu7)) {
                Map map2 = (Map) sparseArray.get(i44);
                if (map2 != null) {
                    map2.get(c4wu7);
                }
                c97224YhArr[i44] = 0;
            }
        }
        for (int i45 = 0; i45 < i20; i45++) {
            int i46 = c97214Yg.A03[i45];
            if (c96394Ux.A01.get(i45) || c96394Ux.A0H.contains(Integer.valueOf(i46))) {
                c97224YhArr[i45] = 0;
            }
        }
        C4V8 c4v8 = c4va.A02;
        C4B8.A01(((C4VC) c4va).A01);
        C4V7 c4v7 = (C4V7) c4v8;
        C4WE[] c4weArr = new C4WE[i20];
        final boolean z11 = false;
        for (int i47 = 0; i47 < i20; i47++) {
            C97224Yh c97224Yh3 = c97224YhArr[i47];
            if (c97224Yh3 != 0 && c97224Yh3.A01.length != 0) {
                int i48 = c97224Yh3.A00.A02;
                if (3 == i48 || (c97224Yh3.A01.length == 1 && 1 != i48 && 2 != i48)) {
                    abstractC97844aP = new AbstractC97844aP(c97224Yh3.A00, new int[]{c97224Yh3.A01[0]});
                } else {
                    C4WV c4wv6 = c97224Yh3.A00;
                    int[] iArr8 = c97224Yh3.A01;
                    C2BE c2be = c4v7.A02;
                    if (c2be == null || (str3 = c4wv6.A04[0].A0S) == null || !str3.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                        c2be = c4v7.A03;
                    }
                    C4V5 c4v5 = c4v7.A00;
                    if (c4v5 == null || (str2 = c4wv6.A04[0].A0S) == null || !str2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                        c4v5 = c4v7.A01;
                    }
                    abstractC97844aP = new C97834aO(c4v5, c2be, c4v7.A04, c4v7.A05, c4wv6, iArr8);
                }
                c4weArr[i47] = abstractC97844aP;
            }
        }
        C4WD[] c4wdArr = new C4WD[i20];
        for (int i49 = 0; i49 < i20; i49++) {
            int[] iArr9 = c97214Yg.A03;
            int i50 = iArr9[i49];
            if (!c96394Ux.A01.get(i49) && !c96394Ux.A0H.contains(Integer.valueOf(i50)) && (iArr9[i49] == -2 || c4weArr[i49] != null)) {
                c4wd = C4WD.A01;
            } else {
                c4wd = null;
            }
            c4wdArr[i49] = c4wd;
        }
        if (c96394Ux.A0F) {
            boolean z12 = false;
            int i51 = -1;
            int i52 = -1;
            for (int i53 = 0; i53 < i20; i53++) {
                int i54 = c97214Yg.A03[i53];
                C4WE c4we = c4weArr[i53];
                if ((i54 == 1 || i54 == 2) && c4we != null) {
                    Object[] objArr6 = iArr3[i53];
                    int indexOf = c97214Yg.A04[i53].A02.indexOf(c4we.CAE());
                    if (indexOf < 0) {
                        indexOf = -1;
                    }
                    int i55 = 0;
                    while (true) {
                        if (i55 < c4we.length()) {
                            if ((objArr6[indexOf][c4we.BHT(i55)] & 32) == 32) {
                                i55++;
                            }
                        } else if (i54 == 1) {
                            if (i52 == -1) {
                                i52 = i53;
                            } else {
                                z2 = false;
                                break;
                            }
                        } else if (i51 == -1) {
                            i51 = i53;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                }
            }
            z2 = true;
            if (i52 != -1 && i51 != -1) {
                z12 = true;
            }
            if (z2 & z12) {
                C4WD c4wd2 = new C4WD(true);
                c4wdArr[i52] = c4wd2;
                c4wdArr[i51] = c4wd2;
            }
        }
        Pair create3 = Pair.create(c4wdArr, c4weArr);
        C4WF[] c4wfArr = (C4WF[]) create3.second;
        int length2 = c4wfArr.length;
        List[] listArr = new List[length2];
        for (int i56 = 0; i56 < length2; i56++) {
            C4WF c4wf = c4wfArr[i56];
            if (c4wf != null) {
                list = ImmutableList.of((Object) c4wf);
            } else {
                list = C16930sl.A00;
            }
            listArr[i56] = list;
        }
        ImmutableList.Builder builder3 = new ImmutableList.Builder();
        for (int i57 = 0; i57 < i20; i57++) {
            C4WU[] c4wuArr2 = c97214Yg.A04;
            C4WU c4wu8 = c4wuArr2[i57];
            List list4 = listArr[i57];
            for (int i58 = 0; i58 < c4wu8.A01; i58++) {
                final C4WV c4wv7 = (C4WV) c4wu8.A02.get(i58);
                int i59 = ((C4WV) c4wuArr2[i57].A02.get(i58)).A01;
                int[] iArr10 = new int[i59];
                int i60 = 0;
                for (int i61 = 0; i61 < i59; i61++) {
                    if ((c97214Yg.A05[i57][i58][i61] & 7) == 4) {
                        iArr10[i60] = i61;
                        i60++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr10, i60);
                int i62 = 0;
                String str5 = null;
                boolean z13 = false;
                int i63 = 0;
                int i64 = 16;
                while (i62 < copyOf.length) {
                    String str6 = ((C4WV) c4wuArr2[i57].A02.get(i58)).A04[copyOf[i62]].A0W;
                    int i65 = i63 + 1;
                    if (i63 == 0) {
                        str5 = str6;
                    } else {
                        z13 |= !Util.A0I(str5, str6);
                    }
                    i64 = Math.min(i64, c97214Yg.A05[i57][i58][i62] & 24);
                    i62++;
                    i63 = i65;
                }
                if (z13) {
                    i64 = Math.min(i64, c97214Yg.A02[i57]);
                }
                final boolean z14 = false;
                if (i64 != 0) {
                    z14 = true;
                }
                int i66 = c4wv7.A01;
                final int[] iArr11 = new int[i66];
                final boolean[] zArr3 = new boolean[i66];
                for (int i67 = 0; i67 < i66; i67++) {
                    iArr11[i67] = c97214Yg.A05[i57][i58][i67] & 7;
                    int i68 = 0;
                    while (true) {
                        if (i68 < list4.size()) {
                            C4WF c4wf2 = (C4WF) list4.get(i68);
                            if (c4wf2.CAE().equals(c4wv7) && c4wf2.CNI(i67) != -1) {
                                z = true;
                                break;
                            }
                            i68++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                    zArr3[i67] = z;
                }
                builder3.add(new Object(c4wv7, iArr11, zArr3, z14) { // from class: X.4WH
                    public final C4WV A00;
                    public final boolean A01;
                    public final int[] A02;
                    public final boolean[] A03;

                    public final boolean equals(Object obj) {
                        if (this != obj) {
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            C4WH c4wh = (C4WH) obj;
                            if (this.A01 != c4wh.A01 || !this.A00.equals(c4wh.A00) || !Arrays.equals(this.A02, c4wh.A02) || !Arrays.equals(this.A03, c4wh.A03)) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public final int hashCode() {
                        return (((((this.A00.hashCode() * 31) + (this.A01 ? 1 : 0)) * 31) + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A03);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
                    
                        if (r4 != r8.length) goto L6;
                     */
                    {
                        /*
                            r5 = this;
                            r5.<init>()
                            int r4 = r6.A01
                            int r0 = r7.length
                            r3 = 0
                            r2 = 1
                            if (r4 != r0) goto Le
                            int r1 = r8.length
                            r0 = 1
                            if (r4 == r1) goto Lf
                        Le:
                            r0 = 0
                        Lf:
                            X.C4B8.A03(r0)
                            r5.A00 = r6
                            if (r9 == 0) goto L19
                            if (r4 <= r2) goto L19
                            r3 = 1
                        L19:
                            r5.A01 = r3
                            java.lang.Object r0 = r7.clone()
                            int[] r0 = (int[]) r0
                            r5.A02 = r0
                            java.lang.Object r0 = r8.clone()
                            boolean[] r0 = (boolean[]) r0
                            r5.A03 = r0
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C4WH.<init>(X.4WV, int[], boolean[], boolean):void");
                    }
                });
            }
        }
        for (int i69 = 0; i69 < i; i69++) {
            final C4WV c4wv8 = (C4WV) c4wu6.A02.get(i69);
            int i70 = c4wv8.A01;
            final int[] iArr12 = new int[i70];
            Arrays.fill(iArr12, 0);
            final boolean[] zArr4 = new boolean[i70];
            builder3.add(new Object
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x072f: INVOKE 
                  (r18v1 'builder3' com.google.common.collect.ImmutableList$Builder)
                  (wrap:java.lang.Object:0x072a: CONSTRUCTOR 
                  (r4v9 'c4wv8' X.4WV A[DONT_INLINE])
                  (r2v21 'iArr12' int[] A[DONT_INLINE])
                  (r0v45 'zArr4' boolean[] A[DONT_INLINE])
                  (r3v9 'z11' boolean A[DONT_INLINE])
                 A[MD:(X.4WV, int[], boolean[], boolean):void (m), WRAPPED] (LINE:1834) call: X.4WH.<init>(X.4WV, int[], boolean[], boolean):void type: CONSTRUCTOR)
                 VIRTUAL call: com.google.common.collect.ImmutableList.Builder.add(java.lang.Object):com.google.common.collect.ImmutableList$Builder A[MD:(java.lang.Object):com.google.common.collect.ImmutableList$Builder (m)] (LINE:1839) in method: X.4YN.A02(float):X.4WI, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:810)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 21 more
                */
            /*
                Method dump skipped, instructions count: 1891
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C4YN.A02(float):X.4WI");
        }

        public final void A03() {
            C4YO c4yo = this.A0C;
            C4Z0 c4z0 = this.A08;
            try {
                if (c4z0 instanceof C97174Yc) {
                    c4z0 = ((C97174Yc) c4z0).A06;
                }
                c4yo.EEP(c4z0);
            } catch (RuntimeException e) {
                AbstractC46512Bo.A05("MediaPeriodHolder", "Period release failed.", e);
            }
        }

        public final void A04() {
            C4Z0 c4z0 = this.A08;
            if (c4z0 instanceof C97174Yc) {
                long j = this.A02.A01;
                if (j == -9223372036854775807L) {
                    j = Long.MIN_VALUE;
                }
                C97174Yc c97174Yc = (C97174Yc) c4z0;
                c97174Yc.A02 = 0L;
                c97174Yc.A00 = j;
            }
        }

        public final void A06(long j) {
            boolean z = false;
            if (this.A01 == null) {
                z = true;
            }
            C4B8.A04(z);
            this.A08.AJq(j - this.A00, -9223372036854775807L);
        }

        public final void A07(long j) {
            boolean z = false;
            if (this.A01 == null) {
                z = true;
            }
            C4B8.A04(z);
            if (this.A07) {
                this.A08.ECm(j - this.A00);
            }
        }

        public final void A08(C69080VhW c69080VhW) {
            boolean z = false;
            if (this.A01 == null) {
                z = true;
            }
            C4B8.A04(z);
            this.A08.AJr(new C69080VhW(c69080VhW.A01 - this.A00, c69080VhW.A02));
        }

        public final boolean A09() {
            if (this.A07) {
                if (!this.A06 || this.A08.Aik() == Long.MIN_VALUE) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public C4YN(C4YM c4ym, C4XW c4xw, C4VC c4vc, C4WI c4wi, InterfaceC96344Us interfaceC96344Us, InterfaceC96074Tq[] interfaceC96074TqArr, long j) {
            this.A0A = interfaceC96074TqArr;
            long j2 = c4ym.A03;
            this.A00 = j - j2;
            this.A0D = c4vc;
            C4WX c4wx = c4ym.A04;
            Object obj = c4wx.A04;
            obj.getClass();
            this.A09 = obj;
            this.A02 = c4ym;
            this.A03 = C4WU.A03;
            this.A04 = c4wi;
            int length = interfaceC96074TqArr.length;
            this.A0B = new InterfaceC97394Yz[length];
            this.A0E = new boolean[length];
            C4Z7 c4z7 = new C4Z7(this, c4xw);
            this.A0C = c4z7;
            long j3 = c4ym.A01;
            C4Z0 AMl = c4z7.A01.AMl(c4wx, interfaceC96344Us, j2);
            this.A08 = j3 != -9223372036854775807L ? new C97174Yc(AMl, 0L, j3) : AMl;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [X.4YO, X.5Px] */
        public C4YN(C4YM c4ym, final C5PR c5pr, C4VC c4vc, C4WI c4wi, InterfaceC96344Us interfaceC96344Us, InterfaceC96074Tq[] interfaceC96074TqArr, long j) {
            this.A0A = interfaceC96074TqArr;
            this.A00 = j;
            this.A0D = c4vc;
            ?? r2 = new C4YO() { // from class: X.5Px
                public final C4Z0 A00(C4WX c4wx, InterfaceC96344Us interfaceC96344Us2, long j2) {
                    C5PR c5pr2 = c5pr;
                    Object obj = c4wx.A04;
                    Timeline timeline = Timeline.A00;
                    Pair pair = (Pair) obj;
                    Object obj2 = pair.first;
                    C4WX A00 = c4wx.A00(pair.second);
                    Object obj3 = c5pr2.A09.get(obj2);
                    obj3.getClass();
                    C116485Pd c116485Pd = (C116485Pd) obj3;
                    c5pr2.A0A.add(c116485Pd);
                    C116675Pw c116675Pw = (C116675Pw) c5pr2.A06.get(c116485Pd);
                    if (c116675Pw != null) {
                        c116675Pw.A02.ARR(c116675Pw.A01);
                    }
                    c116485Pd.A04.add(A00);
                    C116695Py A0G = c116485Pd.A02.A0G(A00, interfaceC96344Us2, j2);
                    c5pr2.A07.put(A0G, c116485Pd);
                    C5PR.A02(c5pr2);
                    return A0G;
                }

                @Override // X.C4YO
                public final void EEP(C4Z0 c4z0) {
                    C5PR c5pr2 = c5pr;
                    IdentityHashMap identityHashMap = c5pr2.A07;
                    Object remove = identityHashMap.remove(c4z0);
                    remove.getClass();
                    C116485Pd c116485Pd = (C116485Pd) remove;
                    c116485Pd.A02.EEP(c4z0);
                    c116485Pd.A04.remove(((C116695Py) c4z0).A05);
                    if (!identityHashMap.isEmpty()) {
                        C5PR.A02(c5pr2);
                    }
                    C5PR.A01(c116485Pd, c5pr2);
                }
            };
            this.A0C = r2;
            C4WX c4wx = c4ym.A04;
            this.A09 = c4wx.A04;
            this.A02 = c4ym;
            this.A03 = C4WU.A03;
            this.A04 = c4wi;
            int length = interfaceC96074TqArr.length;
            this.A0B = new InterfaceC97394Yz[length];
            this.A0E = new boolean[length];
            long j2 = c4ym.A03;
            long j3 = c4ym.A01;
            C4Z0 A00 = r2.A00(c4wx, interfaceC96344Us, j2);
            this.A08 = j3 != -9223372036854775807L ? new C97174Yc(A00, 0L, j3) : A00;
        }
    }
