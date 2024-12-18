package X;

import android.graphics.RectF;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.google.common.collect.ImmutableList;
import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.clips.model.LayoutTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AKe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23120AKe {
    public static final boolean A03(ClipSegment clipSegment, InterfaceC16660sJ interfaceC16660sJ) {
        int i;
        StringBuilder A1C;
        String str;
        C14360o3.A0B(clipSegment, 0);
        if (clipSegment instanceof ClipSegment.VideoSegment) {
            ClipSegment.VideoSegment videoSegment = (ClipSegment.VideoSegment) clipSegment;
            int i2 = videoSegment.A06;
            int i3 = videoSegment.A07;
            i = i2 - i3;
            if (i <= 0) {
                A1C = AbstractC166987dD.A1C();
                str = "VideoSegment has invalid duration: ";
            } else {
                float f = videoSegment.A00;
                float abs = Math.abs(f);
                i = videoSegment.A04;
                if (Math.min(i2 * abs, i) > Math.max(i3 * abs, 0.0f)) {
                    return true;
                }
                A1C = AbstractC166987dD.A1C();
                A1C.append("VideoSegment has invalid source time range. trimmedStartTimeMs: ");
                A1C.append(i3);
                A1C.append(", trimmedEndTimeMs: ");
                A1C.append(i2);
                A1C.append(", recordingSpeed: ");
                A1C.append(f);
                str = ", originalDurationInMs: ";
            }
        } else if (clipSegment instanceof ClipSegment.PhotoSegment) {
            i = ((ClipSegment.PhotoSegment) clipSegment).A00;
            if (i > 0) {
                return true;
            }
            A1C = AbstractC166987dD.A1C();
            str = "PhotoSegment has invalid duration: ";
        } else {
            throw B4Z.A00();
        }
        A1C.append(str);
        A1C.append(i);
        interfaceC16660sJ.invoke(A1C.toString());
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbJ] */
    public static final C1125956n A01(ClipSegment.VideoSegment videoSegment, Integer num, List list, float f, int i, int i2) {
        String str;
        if (num != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append('_');
            str = AbstractC166997dE.A0v(num, A1C);
        } else {
            str = "";
        }
        String A0c = AnonymousClass001.A0c("video_audio_", str, i);
        EnumC1125356h enumC1125356h = EnumC1125356h.AUDIO;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i2;
        C1125856m c1125856m = new C1125856m(enumC1125356h, A0c, timeUnit.toMicros(j));
        c1125856m.A02(A02(videoSegment, 0));
        c1125856m.A00(Math.abs(videoSegment.A00));
        C1125456i c1125456i = new C1125456i(timeUnit, videoSegment.A07, videoSegment.A06);
        C1125456i c1125456i2 = new C1125456i(timeUnit, j, (c1125456i.A02(timeUnit) - c1125456i.A03(timeUnit)) + j);
        float f2 = videoSegment.A01 * f;
        ?? obj = new Object();
        obj.A00 = f2;
        c1125856m.A03(new C69688VtY(c1125456i2, obj), A0c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1125856m.A03(new C69688VtY(new C1125456i(timeUnit, 0L, -1L), (MediaEffect) it.next()), null);
        }
        return new C1125956n(c1125856m);
    }

    public static final C1125756l A02(ClipSegment clipSegment, int i) {
        C1125656k c1125656k;
        if (clipSegment instanceof ClipSegment.VideoSegment) {
            ClipSegment.VideoSegment videoSegment = (ClipSegment.VideoSegment) clipSegment;
            c1125656k = new C1125656k(AbstractC166987dD.A11(videoSegment.A0E));
            float f = videoSegment.A07;
            float abs = Math.abs(videoSegment.A00);
            c1125656k.A03 = new C1125456i(TimeUnit.MILLISECONDS, Math.max(f * abs, 0.0f), Math.min(videoSegment.A06 * abs, videoSegment.A04));
        } else if (clipSegment instanceof ClipSegment.PhotoSegment) {
            c1125656k = new C1125656k(AbstractC166987dD.A11(((ClipSegment.PhotoSegment) clipSegment).A05));
            c1125656k.A02 = TimeUnit.MILLISECONDS.toMicros(r8.A00);
            if (i > 0) {
                c1125656k.A00 = i;
            }
        } else {
            throw B4Z.A00();
        }
        C1125756l A00 = c1125656k.A00();
        C14360o3.A0A(A00);
        return A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbJ] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, X.9v4] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbJ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbI] */
    /* JADX WARN: Type inference failed for: r3v106, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v110, types: [com.google.common.collect.ImmutableList, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [X.8qF] */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r71v0, types: [X.8rz] */
    public static C1126256q A00(C198548q3 c198548q3, C199518rz c199518rz, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, C190168ba c190168ba, List list, List list2, InterfaceC16660sJ interfaceC16660sJ, float f, float f2, int i, boolean z, boolean z2) {
        LayoutTransform layoutTransform;
        int i2;
        int i3;
        int i4;
        RectF A00;
        RectF rectF;
        int i5;
        long j;
        Integer num;
        C22909A8f c22909A8f;
        C199748sQ c199748sQ;
        int i6;
        Integer num2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ?? r5;
        ?? A1E;
        C1126256q c1126256q = new C1126256q();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = immutableList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ClipSegment clipSegment = (ClipSegment) next;
            C14360o3.A0A(clipSegment);
            if (A03(clipSegment, interfaceC16660sJ)) {
                A1E2.add(next);
            }
        }
        Iterator it2 = A1E2.iterator();
        int i12 = 0;
        int i13 = 0;
        loop1: while (true) {
            if (!it2.hasNext()) {
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                }
                Iterator it4 = immutableList.iterator();
                int i14 = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i15 = i14 + 1;
                    if (i14 >= 0) {
                        C23013ACn c23013ACn = (C23013ACn) next2;
                        int i16 = c23013ACn.A02;
                        if (i16 == -1) {
                            i16 = i13 - c23013ACn.A04;
                        }
                        int i17 = i16 > 0 ? i16 : -1;
                        String str = c23013ACn.A07;
                        int i18 = c23013ACn.A03;
                        float f3 = c23013ACn.A01;
                        int i19 = c23013ACn.A04;
                        String str2 = c23013ACn.A08;
                        MediaEffect mediaEffect = c23013ACn.A05;
                        float f4 = c23013ACn.A00;
                        Float f5 = c23013ACn.A06;
                        Object obj = A1I.get(str2);
                        int i20 = i19 + i17;
                        if (i17 == -1) {
                            i20 = -1;
                        }
                        long j2 = i19;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        C1125456i c1125456i = new C1125456i(timeUnit, j2, i20);
                        EnumC1125356h enumC1125356h = EnumC1125356h.AUDIO;
                        StringBuilder A11 = AbstractC166997dE.A11("audio_overlay_");
                        if (str2 == null) {
                            A11.append(i14);
                        } else {
                            A11.append(i14);
                            A11.append('_');
                            A11.append(str2);
                        }
                        C1125856m c1125856m = new C1125856m(enumC1125356h, A11.toString(), timeUnit.toMicros(j2));
                        C1125656k c1125656k = new C1125656k(AbstractC166987dD.A11(str));
                        c1125656k.A03 = new C1125456i(timeUnit, i18, i17 == -1 ? -1L : i18 + (i17 * f4));
                        c1125856m.A02(c1125656k.A00());
                        c1125856m.A00(f4);
                        if (mediaEffect != null) {
                            c1125856m.A03(new C69688VtY(c1125456i, mediaEffect), null);
                        }
                        if (f5 != null) {
                            float floatValue = f5.floatValue();
                            ?? obj2 = new Object();
                            obj2.A00 = floatValue;
                            c1125856m.A03(new C69688VtY(c1125456i, obj2), null);
                        }
                        if (obj == null) {
                            ?? obj3 = new Object();
                            obj3.A00 = f3;
                            c1125856m.A03(new C69688VtY(c1125456i, obj3), str2);
                        }
                        c1126256q.A04(new C1125956n(c1125856m));
                        i14 = i15;
                    }
                }
                Iterator it5 = immutableList3.iterator();
                while (it5.hasNext()) {
                    C23001ACa c23001ACa = (C23001ACa) it5.next();
                    c1126256q.A01(c23001ACa.A02, EnumC1125356h.VIDEO, new C23504AbK(EnumC222969sb.A0A, c23001ACa.A01));
                }
                return c1126256q;
            }
            Object next3 = it2.next();
            int i21 = i12 + 1;
            if (i12 < 0) {
                break;
            }
            ClipSegment clipSegment2 = (ClipSegment) next3;
            C14360o3.A0A(clipSegment2);
            EnumC1125356h enumC1125356h2 = EnumC1125356h.VIDEO;
            String A0O = AnonymousClass001.A0O(MSV.A00(1712), i12);
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            C1125856m c1125856m2 = new C1125856m(enumC1125356h2, A0O, timeUnit2.toMicros(i13));
            c1125856m2.A02(A02(clipSegment2, i));
            boolean z3 = clipSegment2 instanceof ClipSegment.VideoSegment;
            if (z3) {
                c1125856m2.A00(((ClipSegment.VideoSegment) clipSegment2).A00);
            }
            c1126256q.A04(new C1125956n(c1125856m2));
            if (z3 && z) {
                if (c190168ba == null) {
                    c1126256q.A04(A01((ClipSegment.VideoSegment) clipSegment2, null, list, f, i12, i13));
                } else {
                    ClipSegment.VideoSegment videoSegment = (ClipSegment.VideoSegment) clipSegment2;
                    List list3 = (List) c190168ba.A01.get(videoSegment);
                    if (list3 != null) {
                        r5 = AbstractC166987dD.A1E();
                        for (Object obj4 : list3) {
                            ACZ acz = (ACZ) obj4;
                            if (acz.A01 > videoSegment.A07 && acz.A02 < videoSegment.A06) {
                                r5.add(obj4);
                            }
                        }
                    } else {
                        r5 = C16930sl.A00;
                    }
                    if (r5.isEmpty()) {
                        A1E = ImmutableList.of((Object) A01(videoSegment, null, list, f, i12, i13));
                        C14360o3.A0A(A1E);
                    } else {
                        A1E = AbstractC166987dD.A1E();
                        int i22 = 0;
                        int i23 = ((ACZ) r5.get(0)).A02;
                        String str3 = videoSegment.A0E;
                        int i24 = videoSegment.A08;
                        int i25 = videoSegment.A03;
                        int i26 = videoSegment.A05;
                        LayoutTransform layoutTransform2 = videoSegment.A0B;
                        ImmutableList immutableList4 = videoSegment.A0A;
                        long j3 = videoSegment.A09;
                        int i27 = videoSegment.A04;
                        int i28 = videoSegment.A07;
                        float f6 = videoSegment.A00;
                        float f7 = videoSegment.A01;
                        boolean z4 = videoSegment.A0H;
                        String str4 = videoSegment.A0F;
                        String str5 = videoSegment.A0G;
                        Integer num3 = videoSegment.A0C;
                        Integer num4 = videoSegment.A0D;
                        boolean z5 = videoSegment.A0I;
                        int i29 = videoSegment.A02;
                        AbstractC167007dF.A1G(str3, 0, immutableList4);
                        ClipSegment.VideoSegment videoSegment2 = new ClipSegment.VideoSegment(immutableList4, layoutTransform2, num3, num4, str3, str4, str5, f6, f7, i24, i25, i26, i27, i28, i23, i29, j3, z4, z5);
                        if (videoSegment2.A06 - videoSegment2.A07 > 0) {
                            A1E.add(A01(videoSegment2, null, list, f, i12, i13));
                        }
                        for (Object obj5 : r5) {
                            int i30 = i22 + 1;
                            if (i22 < 0) {
                                break loop1;
                            }
                            ACZ acz2 = (ACZ) obj5;
                            String str6 = c190168ba.A00;
                            int i31 = i13 - i28;
                            int i32 = i31 + acz2.A02;
                            ArrayList A1E3 = AbstractC166987dD.A1E();
                            int i33 = acz2.A00;
                            int i34 = 0;
                            while (i33 > 0) {
                                int min = Math.min(i33, 1000);
                                C1125456i c1125456i2 = new C1125456i(timeUnit2, 0L, min);
                                EnumC1125356h enumC1125356h3 = EnumC1125356h.AUDIO;
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                A1C.append("bleep_audio_");
                                A1C.append(i12);
                                A1C.append('_');
                                A1C.append(i22);
                                A1C.append('_');
                                A1C.append(i34);
                                C1125856m c1125856m3 = new C1125856m(enumC1125356h3, A1C.toString(), timeUnit2.toMicros(i32 + (i34 * 1000)));
                                C1125656k c1125656k2 = new C1125656k(AbstractC166987dD.A11(str6));
                                c1125656k2.A03 = c1125456i2;
                                c1125856m3.A02(c1125656k2.A00());
                                ?? obj6 = new Object();
                                obj6.A00 = f;
                                c1125856m3.A03(new C69688VtY(c1125456i2, obj6), null);
                                A1E3.add(new C1125956n(c1125856m3));
                                i33 -= min;
                                i34++;
                            }
                            A1E.addAll(A1E3);
                            int i35 = acz2.A01;
                            int i36 = videoSegment.A06;
                            if (i35 < i36) {
                                if (i22 <= r5.size() - 2) {
                                    i36 = Math.min(((ACZ) r5.get(i30)).A02, i36);
                                }
                                ClipSegment.VideoSegment videoSegment3 = new ClipSegment.VideoSegment(immutableList4, layoutTransform2, num3, num4, str3, str4, str5, f6, f7, i24, i25, i26, i27, i35, i36, i29, j3, z4, z5);
                                if (videoSegment3.A06 - videoSegment3.A07 > 0) {
                                    A1E.add(A01(videoSegment3, Integer.valueOf(i22), list, f, i12, i31 + i35));
                                }
                            }
                            i22 = i30;
                        }
                    }
                    Iterator it6 = ((List) A1E).iterator();
                    while (it6.hasNext()) {
                        c1126256q.A04((C1125956n) it6.next());
                    }
                }
            }
            boolean z6 = clipSegment2 instanceof ClipSegment.PhotoSegment;
            if (z6) {
                layoutTransform = ((ClipSegment.PhotoSegment) clipSegment2).A04;
            } else {
                layoutTransform = ((ClipSegment.VideoSegment) clipSegment2).A0B;
            }
            if (layoutTransform != null) {
                i2 = layoutTransform.A06.intValue();
            } else {
                i2 = -1;
            }
            if (i2 == 1) {
                if (z6) {
                    i3 = ((ClipSegment.PhotoSegment) clipSegment2).A03;
                } else {
                    i3 = ((ClipSegment.VideoSegment) clipSegment2).A08;
                }
                float f8 = i3;
                if (z6) {
                    i4 = ((ClipSegment.PhotoSegment) clipSegment2).A01;
                } else {
                    i4 = ((ClipSegment.VideoSegment) clipSegment2).A03;
                }
                A00 = AbstractC225929yB.A00(f8 / i4, f2);
            } else if (i2 != 2) {
                if (z6) {
                    i9 = ((ClipSegment.PhotoSegment) clipSegment2).A02;
                } else {
                    i9 = ((ClipSegment.VideoSegment) clipSegment2).A05;
                }
                int i37 = i9 % 180;
                if (i37 == 0) {
                    if (z6) {
                        i10 = ((ClipSegment.PhotoSegment) clipSegment2).A03;
                    } else {
                        i10 = ((ClipSegment.VideoSegment) clipSegment2).A08;
                    }
                } else if (z6) {
                    i10 = ((ClipSegment.PhotoSegment) clipSegment2).A01;
                } else {
                    i10 = ((ClipSegment.VideoSegment) clipSegment2).A03;
                }
                float f9 = i10;
                if (i37 == 0) {
                    if (z6) {
                        i11 = ((ClipSegment.PhotoSegment) clipSegment2).A01;
                    } else {
                        i11 = ((ClipSegment.VideoSegment) clipSegment2).A03;
                    }
                } else if (z6) {
                    i11 = ((ClipSegment.PhotoSegment) clipSegment2).A03;
                } else {
                    i11 = ((ClipSegment.VideoSegment) clipSegment2).A08;
                }
                float f10 = i11;
                float f11 = f9 / f10;
                if (AbstractC166987dD.A01(f11, f2) <= 1.0E-4d) {
                    A00 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
                } else {
                    float f12 = f11 < f2 ? ((f10 - (f9 / f2)) / f10) / 2.0f : 0.0f;
                    A00 = new RectF(0.0f, f12, 1.0f, 1.0f - f12);
                }
            } else {
                if (z6) {
                    i7 = ((ClipSegment.PhotoSegment) clipSegment2).A03;
                } else {
                    i7 = ((ClipSegment.VideoSegment) clipSegment2).A08;
                }
                float f13 = i7;
                if (z6) {
                    i8 = ((ClipSegment.PhotoSegment) clipSegment2).A01;
                } else {
                    i8 = ((ClipSegment.VideoSegment) clipSegment2).A03;
                }
                A00 = AbstractC225929yB.A00(f13 / i8, 1.0f);
            }
            if (layoutTransform != null && layoutTransform.A06.intValue() == 2) {
                rectF = AbstractC225929yB.A00(f2, 1.0f);
            } else {
                rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
            }
            long j4 = i13;
            if (i12 == A1E2.size() - 1) {
                j = -1;
            } else {
                if (z6) {
                    i5 = ((ClipSegment.PhotoSegment) clipSegment2).A00;
                } else {
                    ClipSegment.VideoSegment videoSegment4 = (ClipSegment.VideoSegment) clipSegment2;
                    i5 = videoSegment4.A06 - videoSegment4.A07;
                }
                j = i5 + i13;
            }
            C1125456i c1125456i3 = new C1125456i(timeUnit2, j4, j);
            if (z2 && c198548q3 != null && c199518rz != 0) {
                C212449bD c212449bD = new C212449bD();
                if (layoutTransform != null) {
                    num2 = layoutTransform.A06;
                } else {
                    num2 = null;
                }
                Integer num5 = C05F.A0N;
                if (num2 == num5) {
                    c212449bD.A0B(layoutTransform.A00, layoutTransform.A03, layoutTransform.A02, layoutTransform.A01);
                } else {
                    c212449bD.A0B(0.0f, 0.0f, 1.0f, 0.0f);
                }
                ?? c198658qF = new C198658qF(null, c198548q3, c212449bD, null, i12, true, false, true, true, true);
                FilterGroup filterGroup = new FilterGroup();
                float[] A002 = AbstractC224629vn.A00(-16777216);
                float[] A003 = AbstractC224629vn.A00(-16777216);
                Integer num6 = C05F.A00;
                filterGroup.A00(AHL.A00(num5, num6, A002, A003, 0.0f, 0.0f, 0.0f, true), 8);
                filterGroup.A00(new ColorFilter(new TransformMatrixParams(num6, num6, 1.0f, 0.0f, 0.0f, 0.0f, false), "normal", AbstractC199498rs.A00(), AbstractC199498rs.A00(), 1.0f, true, true, true), 17);
                c198658qF.A03 = c199518rz.A00(filterGroup);
                c199748sQ = c198658qF;
            } else {
                C199748sQ c199748sQ2 = new C199748sQ();
                if (layoutTransform != null) {
                    num = layoutTransform.A06;
                } else {
                    num = null;
                }
                c199748sQ = c199748sQ2;
                if (num == C05F.A0N) {
                    if (layoutTransform != null) {
                        float f14 = layoutTransform.A00;
                        float f15 = layoutTransform.A03;
                        float f16 = layoutTransform.A02;
                        float f17 = layoutTransform.A01;
                        c22909A8f = c199748sQ2.A03;
                        c22909A8f.A01.set(A00);
                        c22909A8f.A02.set(rectF);
                        if (AbstractC166987dD.A01(f16, 1.0f) >= 1.0E-5d || Math.abs(f14) >= 1.0E-5d || Math.abs(f15) >= 1.0E-5d || Math.abs(f17) >= 1.0E-5d) {
                            C224209v4 c224209v4 = c22909A8f.A00;
                            C224209v4 c224209v42 = c224209v4;
                            if (c224209v4 == null) {
                                ?? obj7 = new Object();
                                obj7.A00 = f14;
                                obj7.A03 = f15;
                                obj7.A02 = f16;
                                obj7.A01 = f17;
                                c22909A8f.A00 = obj7;
                                c224209v42 = obj7;
                            }
                            c224209v42.A00 = f14;
                            c224209v42.A03 = f15;
                            c224209v42.A02 = f16;
                            c224209v42.A01 = f17;
                            c199748sQ2.A02.put(i12, c22909A8f);
                            AbstractC166997dE.A1W(c199748sQ2.A05, i12);
                            c199748sQ = c199748sQ2;
                        }
                    }
                } else {
                    c22909A8f = new C22909A8f();
                    c22909A8f.A01.set(A00);
                    c22909A8f.A02.set(rectF);
                }
                c22909A8f.A00 = null;
                c199748sQ2.A02.put(i12, c22909A8f);
                AbstractC166997dE.A1W(c199748sQ2.A05, i12);
                c199748sQ = c199748sQ2;
            }
            c1126256q.A01(c1125456i3, enumC1125356h2, new C23504AbK(EnumC222969sb.A06, c199748sQ));
            if (z6) {
                i6 = ((ClipSegment.PhotoSegment) clipSegment2).A00;
            } else {
                ClipSegment.VideoSegment videoSegment5 = (ClipSegment.VideoSegment) clipSegment2;
                i6 = videoSegment5.A06 - videoSegment5.A07;
            }
            i13 += i6;
            i12 = i21;
        }
        AbstractC16960so.A1U();
        throw C00O.createAndThrow();
    }
}
