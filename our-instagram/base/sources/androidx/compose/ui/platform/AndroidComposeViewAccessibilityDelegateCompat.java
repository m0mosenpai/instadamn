package androidx.compose.ui.platform;

import X.AbstractC001800i;
import X.AbstractC004701m;
import X.AbstractC06960Yn;
import X.AbstractC09790fc;
import X.AbstractC113545Ar;
import X.AbstractC119395aw;
import X.AbstractC120865dd;
import X.AbstractC120875de;
import X.AbstractC121615fC;
import X.AbstractC16960so;
import X.AnonymousClass001;
import X.AnonymousClass051;
import X.AnonymousClass583;
import X.AnonymousClass599;
import X.C005101q;
import X.C012504o;
import X.C01F;
import X.C01I;
import X.C01J;
import X.C01M;
import X.C01N;
import X.C01O;
import X.C01T;
import X.C02V;
import X.C09530e4;
import X.C0eB;
import X.C0w5;
import X.C113485Al;
import X.C113495Am;
import X.C113505An;
import X.C113525Ap;
import X.C113535Aq;
import X.C113565At;
import X.C114205Dh;
import X.C119365at;
import X.C120895dg;
import X.C121655fH;
import X.C127055oj;
import X.C14360o3;
import X.C18740w1;
import X.C18750w2;
import X.C206999Ee;
import X.C24721Ip;
import X.C27923CSi;
import X.C29612D2n;
import X.C59U;
import X.C5B6;
import X.C5C2;
import X.C5C8;
import X.C5XQ;
import X.C6OK;
import X.C6ON;
import X.C6OW;
import X.C6OX;
import X.C9F8;
import X.C9HO;
import X.CBR;
import X.InterfaceC16610sE;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC24731Iq;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends C02V {
    public static final C01I A0Y;
    public int A00;
    public int A01;
    public long A03;
    public C0w5 A04;
    public C0w5 A05;
    public C18750w2 A06;
    public C18740w1 A07;
    public C005101q A08;
    public C005101q A09;
    public C27923CSi A0A;
    public C113535Aq A0B;
    public AccessibilityNodeInfoCompat A0C;
    public Integer A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public C01M A0I;
    public C113485Al A0J;
    public final Handler A0L;
    public final AccessibilityManager.AccessibilityStateChangeListener A0M;
    public final AccessibilityManager.TouchExplorationStateChangeListener A0N;
    public final AccessibilityManager A0O;
    public final C18750w2 A0P;
    public final C18750w2 A0Q;
    public final AndroidComposeView A0R;
    public final C113495Am A0S;
    public final Runnable A0T;
    public final List A0U;
    public final C012504o A0V;
    public final InterfaceC16660sJ A0W;
    public final InterfaceC24731Iq A0X;
    public int A02 = Integer.MIN_VALUE;
    public InterfaceC16660sJ A0K = new C206999Ee(this, 5);

    public static final String A0A(C113525Ap c113525Ap) {
        Object A0J;
        C113505An c113505An = c113525Ap.A05;
        C113565At c113565At = AbstractC113545Ar.A02;
        Map map = c113505An.A02;
        if (map.containsKey(c113565At)) {
            return AbstractC121615fC.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, (List) c113505An.A00(c113565At));
        }
        C113565At c113565At2 = AbstractC113545Ar.A04;
        if (map.containsKey(c113565At2)) {
            A0J = C5B6.A00(c113505An, c113565At2);
        } else {
            List list = (List) C5B6.A00(c113505An, AbstractC113545Ar.A0R);
            if (list == null) {
                return null;
            }
            A0J = AbstractC001800i.A0J(list);
        }
        C5C8 c5c8 = (C5C8) A0J;
        if (c5c8 != null) {
            return c5c8.A00;
        }
        return null;
    }

    public static final void A0C(Bundle bundle, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, int i) {
        int i2;
        RectF rectF;
        long j;
        C0w5 c0w5;
        int i3;
        C121655fH c121655fH = (C121655fH) A06(androidComposeViewAccessibilityDelegateCompat).A03(i);
        if (c121655fH != null) {
            C113525Ap c113525Ap = c121655fH.A01;
            String A0A = A0A(c113525Ap);
            if (C14360o3.A0K(str, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL")) {
                c0w5 = androidComposeViewAccessibilityDelegateCompat.A05;
            } else if (C14360o3.A0K(str, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL")) {
                c0w5 = androidComposeViewAccessibilityDelegateCompat.A04;
            } else {
                C113505An c113505An = c113525Ap.A05;
                C113565At c113565At = AbstractC120875de.A08;
                Map map = c113505An.A02;
                if (map.containsKey(c113565At) && bundle != null && C14360o3.A0K(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i5 > 0 && i4 >= 0) {
                        if (A0A != null) {
                            i2 = A0A.length();
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        if (i4 < i2) {
                            C127055oj A01 = AbstractC120865dd.A01(c113505An);
                            if (A01 == null) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            int i6 = 0;
                            do {
                                int i7 = i4 + i6;
                                if (i7 >= A01.A04.A03.length()) {
                                    rectF = null;
                                } else {
                                    C114205Dh A05 = A01.A05(i7);
                                    rectF = null;
                                    C59U A052 = c113525Ap.A05();
                                    if (A052 != null && A052.A0T().A08) {
                                        j = A052.Chn(0L);
                                    } else {
                                        j = 0;
                                    }
                                    C114205Dh A03 = A05.A03(j);
                                    C114205Dh A032 = c113525Ap.A03();
                                    if (A03.A05(A032)) {
                                        C114205Dh A04 = A03.A04(A032);
                                        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0R;
                                        long Cho = androidComposeView.Cho(AbstractC119395aw.A00(A04.A01, A04.A03));
                                        long Cho2 = androidComposeView.Cho(AbstractC119395aw.A00(A04.A02, A04.A00));
                                        rectF = new RectF(C119365at.A01(Cho), C119365at.A02(Cho), C119365at.A01(Cho2), C119365at.A02(Cho2));
                                    }
                                }
                                arrayList.add(rectF);
                                i6++;
                            } while (i6 < i5);
                            accessibilityNodeInfoCompat.mInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                C113565At c113565At2 = AbstractC113545Ar.A0Q;
                if (map.containsKey(c113565At2) && bundle != null && C14360o3.A0K(str, "androidx.compose.ui.semantics.testTag")) {
                    String str2 = (String) C5B6.A00(c113505An, c113565At2);
                    if (str2 == null) {
                        return;
                    }
                    accessibilityNodeInfoCompat.mInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                if (!C14360o3.A0K(str, "androidx.compose.ui.semantics.id")) {
                    return;
                }
                accessibilityNodeInfoCompat.mInfo.getExtras().putInt(str, c113525Ap.A02);
                return;
            }
            int A033 = c0w5.A03(i);
            if (A033 >= 0 && (i3 = c0w5.A03[A033]) != -1) {
                accessibilityNodeInfoCompat.mInfo.getExtras().putInt(str, i3);
            }
        }
    }

    public static final boolean A0O(C6OK c6ok, float f) {
        if (f >= 0.0f || ((Number) c6ok.A01.invoke()).floatValue() <= 0.0f) {
            if (f > 0.0f && ((Number) c6ok.A01.invoke()).floatValue() < ((Number) c6ok.A00.invoke()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        if (r13 != null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x01c1, TryCatch #0 {all -> 0x01c1, blocks: (B:12:0x0063, B:13:0x0066, B:18:0x0079, B:20:0x0081, B:22:0x008a, B:24:0x0093, B:26:0x009e, B:28:0x00ac, B:32:0x00ba, B:33:0x00bc, B:35:0x00c2, B:43:0x00d2, B:45:0x00d8, B:47:0x00dc, B:48:0x00df, B:50:0x00e5, B:59:0x00f6, B:61:0x00fe, B:62:0x010c, B:64:0x0110, B:66:0x011e, B:71:0x0138, B:73:0x0140, B:75:0x0162, B:76:0x0182, B:70:0x0134, B:81:0x0186, B:83:0x018d, B:84:0x0196, B:94:0x0076), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.01O, X.0w1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0088 -> B:13:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01b1 -> B:13:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0a(X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0a(X.1Ds):java.lang.Object");
    }

    public final boolean A0b() {
        return this.A0O.isEnabled() && (this.A0E.isEmpty() ^ true);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [X.0w4, X.01I] */
    static {
        int[] iArr = new int[32];
        System.arraycopy(new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26}, 0, iArr, 0, 27);
        System.arraycopy(new int[]{R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31}, 0, iArr, 27, 5);
        C01I c01i = C01J.A00;
        ?? c01i2 = new C01I(32);
        int i = c01i2.A00;
        if (i >= 0 && i <= i) {
            c01i2.A03(i + 32);
            int[] iArr2 = c01i2.A01;
            int i2 = c01i2.A00;
            if (i != i2) {
                AbstractC06960Yn.A0U(iArr2, iArr2, i + 32, i, i2);
            }
            AbstractC06960Yn.A0U(iArr, iArr2, i, 0, 32);
            c01i2.A00 += 32;
            A0Y = c01i2;
            return;
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, i, "Index ", " must be in 0.."));
    }

    public static final int A00(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        if (i == androidComposeViewAccessibilityDelegateCompat.A0R.A0l.A00().A02) {
            return -1;
        }
        return i;
    }

    public static final int A01(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C113525Ap c113525Ap) {
        C113505An c113505An = c113525Ap.A05;
        C113565At c113565At = AbstractC113545Ar.A02;
        Map map = c113505An.A02;
        if (!map.containsKey(c113565At)) {
            C113565At c113565At2 = AbstractC113545Ar.A0S;
            if (map.containsKey(c113565At2)) {
                return (int) (((C5C2) c113505An.A00(c113565At2)).A00 & 4294967295L);
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A00;
    }

    public static final int A02(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C113525Ap c113525Ap) {
        C113505An c113505An = c113525Ap.A05;
        C113565At c113565At = AbstractC113545Ar.A02;
        Map map = c113505An.A02;
        if (!map.containsKey(c113565At)) {
            C113565At c113565At2 = AbstractC113545Ar.A0S;
            if (map.containsKey(c113565At2)) {
                return (int) (((C5C2) c113505An.A00(c113565At2)).A00 >> 32);
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A00;
    }

    public static final Rect A03(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C121655fH c121655fH) {
        Rect rect = c121655fH.A00;
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0R;
        long Cho = androidComposeView.Cho(AbstractC119395aw.A00(rect.left, rect.top));
        long Cho2 = androidComposeView.Cho(AbstractC119395aw.A00(rect.right, rect.bottom));
        return new Rect((int) Math.floor(C119365at.A01(Cho)), (int) Math.floor(C119365at.A02(Cho)), (int) Math.ceil(C119365at.A01(Cho2)), (int) Math.ceil(C119365at.A02(Cho2)));
    }

    public static final AccessibilityEvent A05(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, CharSequence charSequence, Integer num, Integer num2, Integer num3, int i) {
        AccessibilityEvent A04 = A04(androidComposeViewAccessibilityDelegateCompat, i, 8192);
        if (num != null) {
            A04.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            A04.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            A04.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            A04.getText().add(charSequence);
        }
        return A04;
    }

    public static final C01M A06(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        C113525Ap c113525Ap;
        if (androidComposeViewAccessibilityDelegateCompat.A0G) {
            androidComposeViewAccessibilityDelegateCompat.A0G = false;
            androidComposeViewAccessibilityDelegateCompat.A0I = AbstractC120865dd.A00(androidComposeViewAccessibilityDelegateCompat.A0R.A0l);
            if (androidComposeViewAccessibilityDelegateCompat.A0b()) {
                C0w5 c0w5 = androidComposeViewAccessibilityDelegateCompat.A05;
                c0w5.A04();
                C0w5 c0w52 = androidComposeViewAccessibilityDelegateCompat.A04;
                c0w52.A04();
                C121655fH c121655fH = (C121655fH) A06(androidComposeViewAccessibilityDelegateCompat).A03(-1);
                if (c121655fH != null) {
                    c113525Ap = c121655fH.A01;
                } else {
                    c113525Ap = null;
                }
                C14360o3.A0A(c113525Ap);
                boolean z = false;
                if (c113525Ap.A04.A0D == AnonymousClass583.Rtl) {
                    z = true;
                }
                int i = 1;
                ArrayList A0B = androidComposeViewAccessibilityDelegateCompat.A0B(AbstractC16960so.A1N(c113525Ap), z);
                C14360o3.A0B(A0B, 0);
                int size = A0B.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((C113525Ap) A0B.get(i - 1)).A02;
                        int i3 = ((C113525Ap) A0B.get(i)).A02;
                        c0w5.A05(i2, i3);
                        c0w52.A05(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return androidComposeViewAccessibilityDelegateCompat.A0I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x0513, code lost:
    
        if (r15 == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0a19, code lost:
    
        if (X.C14360o3.A0K(X.C5B6.A00(r0, r10), true) != false) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x04d8, code lost:
    
        if (r4.containsKey(X.AbstractC113545Ar.A0B) != false) goto L204;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0253  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0w4, X.01I] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat A07(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r46, int r47) {
        /*
            Method dump skipped, instructions count: 2929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A07(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, int):androidx.core.view.accessibility.AccessibilityNodeInfoCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
    
        if (r5 == 0.0f) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String A09(X.C113525Ap r10) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A09(X.5Ap):java.lang.String");
    }

    private final ArrayList A0B(List list, boolean z) {
        Comparator comparator;
        C18750w2 c18750w2 = C01N.A00;
        C18750w2 c18750w22 = new C18750w2(6);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0E(c18750w22, (C113525Ap) list.get(i), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        C14360o3.A0B(arrayList, 0);
        int size2 = arrayList.size() - 1;
        int i2 = 0;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                C113525Ap c113525Ap = (C113525Ap) arrayList.get(i3);
                if (i3 != 0) {
                    float f = c113525Ap.A04().A03;
                    float f2 = c113525Ap.A04().A00;
                    boolean z2 = false;
                    if (f >= f2) {
                        z2 = true;
                    }
                    C14360o3.A0B(arrayList2, 0);
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        int i4 = 0;
                        while (true) {
                            C114205Dh c114205Dh = (C114205Dh) ((C09530e4) arrayList2.get(i4)).A00;
                            boolean z3 = false;
                            if (c114205Dh.A03 >= c114205Dh.A00) {
                                z3 = true;
                            }
                            if (!z2 && !z3) {
                                float f3 = c114205Dh.A03;
                                float max = Math.max(f, f3);
                                float f4 = c114205Dh.A00;
                                if (max < Math.min(f2, f4)) {
                                    arrayList2.set(i4, new C09530e4(new C114205Dh(Math.max(c114205Dh.A01, 0.0f), Math.max(f3, f), Math.min(c114205Dh.A02, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((C09530e4) arrayList2.get(i4)).A01));
                                    ((List) ((C09530e4) arrayList2.get(i4)).A01).add(c113525Ap);
                                    break;
                                }
                            }
                            if (i4 == size3) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
                arrayList2.add(new C09530e4(c113525Ap.A04(), AbstractC16960so.A1N(c113525Ap)));
                if (i3 == size2) {
                    break;
                }
                i3++;
            }
        }
        C01T.A1D(arrayList2, C6OW.A00);
        ArrayList arrayList3 = new ArrayList();
        int size4 = arrayList2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            C09530e4 c09530e4 = (C09530e4) arrayList2.get(i5);
            List list2 = (List) c09530e4.A01;
            if (z) {
                comparator = C29612D2n.A00;
            } else {
                comparator = C6ON.A00;
            }
            final Comparator comparator2 = comparator;
            final Comparator comparator3 = AnonymousClass599.A0Z;
            final Comparator comparator4 = new Comparator() { // from class: X.6OO
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare = comparator2.compare(obj, obj2);
                    if (compare == 0) {
                        return comparator3.compare(((C113525Ap) obj).A04, ((C113525Ap) obj2).A04);
                    }
                    return compare;
                }
            };
            C01T.A1D(list2, new Comparator() { // from class: X.6OP
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare = comparator4.compare(obj, obj2);
                    if (compare == 0) {
                        return C2BS.A00(Integer.valueOf(((C113525Ap) obj).A02), Integer.valueOf(((C113525Ap) obj2).A02));
                    }
                    return compare;
                }
            });
            arrayList3.addAll((Collection) c09530e4.A01);
        }
        final C6OX c6ox = C6OX.A00;
        C01T.A1D(arrayList3, new Comparator() { // from class: X.6OY
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                InterfaceC16620sF interfaceC16620sF = InterfaceC16620sF.this;
                C01I c01i = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
                return ((Number) interfaceC16620sF.invoke(obj, obj2)).intValue();
            }
        });
        while (true) {
            C14360o3.A0B(arrayList3, 0);
            if (i2 <= arrayList3.size() - 1) {
                List list3 = (List) c18750w22.A03(((C113525Ap) arrayList3.get(i2)).A02);
                if (list3 != null) {
                    if (!A0P((C113525Ap) arrayList3.get(i2))) {
                        arrayList3.remove(i2);
                    } else {
                        i2++;
                    }
                    arrayList3.addAll(i2, list3);
                    i2 += list3.size();
                } else {
                    i2++;
                }
            } else {
                return arrayList3;
            }
        }
    }

    private final void A0E(C18750w2 c18750w2, C113525Ap c113525Ap, ArrayList arrayList) {
        boolean z = false;
        if (c113525Ap.A04.A0D == AnonymousClass583.Rtl) {
            z = true;
        }
        Object obj = c113525Ap.A05.A02.get(AbstractC113545Ar.A0G);
        if (obj == null) {
            obj = false;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue || A0P(c113525Ap)) {
            C01M A06 = A06(this);
            int i = c113525Ap.A02;
            if (A06.A05(i)) {
                arrayList.add(c113525Ap);
            }
            if (booleanValue) {
                c18750w2.A08(i, A0B(AbstractC001800i.A0U(c113525Ap.A08(!c113525Ap.A06, false)), z));
                return;
            }
        }
        List A08 = c113525Ap.A08(!c113525Ap.A06, false);
        int size = A08.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0E(c18750w2, (C113525Ap) A08.get(i2), arrayList);
        }
    }

    public static final void A0F(AnonymousClass599 anonymousClass599, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0V.add(anonymousClass599)) {
            androidComposeViewAccessibilityDelegateCompat.A0X.F8s(C0eB.A00);
        }
    }

    public static final void A0G(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        C27923CSi c27923CSi = androidComposeViewAccessibilityDelegateCompat.A0A;
        if (c27923CSi != null) {
            int i2 = c27923CSi.A05.A02;
            if (i == i2) {
                if (SystemClock.uptimeMillis() - c27923CSi.A04 <= 1000) {
                    AccessibilityEvent A04 = A04(androidComposeViewAccessibilityDelegateCompat, A00(androidComposeViewAccessibilityDelegateCompat, i2), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
                    A04.setFromIndex(c27923CSi.A01);
                    A04.setToIndex(c27923CSi.A03);
                    A04.setAction(c27923CSi.A00);
                    A04.setMovementGranularity(c27923CSi.A02);
                    A04.getText().add(A0A(c27923CSi.A05));
                    A0D(A04, androidComposeViewAccessibilityDelegateCompat);
                }
            } else {
                return;
            }
        }
        androidComposeViewAccessibilityDelegateCompat.A0A = null;
    }

    public static final void A0H(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C9HO c9ho) {
        if (c9ho.A05.contains(c9ho)) {
            androidComposeViewAccessibilityDelegateCompat.A0R.A0b.A00(c9ho, new C9F8(6, c9ho, androidComposeViewAccessibilityDelegateCompat), androidComposeViewAccessibilityDelegateCompat.A0W);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        A0F(r19.A04, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.01O, X.0w1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0I(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r17, X.C113535Aq r18, X.C113525Ap r19) {
        /*
            int[] r0 = X.C01P.A00
            X.0w1 r12 = new X.0w1
            r12.<init>()
            long[] r0 = X.AbstractC004701m.A00
            r0 = 6
            X.C18740w1.A02(r12, r0)
            r11 = 0
            r10 = 1
            r13 = r19
            java.util.List r4 = r13.A08(r11, r10)
            int r3 = r4.size()
            r5 = 0
            r2 = 0
        L1b:
            r6 = r17
            r8 = r18
            if (r2 >= r3) goto L45
            java.lang.Object r7 = r4.get(r2)
            X.5Ap r7 = (X.C113525Ap) r7
            X.01M r1 = A06(r6)
            int r0 = r7.A02
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L42
            X.0w1 r1 = r8.A00
            int r0 = r7.A02
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L87
            int r0 = r7.A02
            r12.A06(r0)
        L42:
            int r2 = r2 + 1
            goto L1b
        L45:
            X.0w1 r0 = r8.A00
            int[] r9 = r0.A02
            long[] r8 = r0.A03
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L99
            r4 = 0
        L51:
            r18 = r8[r4]
            r14 = -1
            long r14 = r14 ^ r18
            r0 = 7
            long r14 = r14 << r0
            long r14 = r14 & r18
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r1
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto L94
            int r0 = r4 - r7
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r3 = 8
            int r2 = 8 - r0
            r1 = 0
        L70:
            if (r1 >= r2) goto L92
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r18
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L8d
            int r0 = r4 << 3
            int r0 = r0 + r1
            r0 = r9[r0]
            boolean r0 = r12.A04(r0)
            if (r0 != 0) goto L8d
        L87:
            X.599 r0 = r13.A04
            A0F(r0, r6)
        L8c:
            return
        L8d:
            long r18 = r18 >> r3
            int r1 = r1 + 1
            goto L70
        L92:
            if (r2 != r3) goto L99
        L94:
            if (r4 == r7) goto L99
            int r4 = r4 + 1
            goto L51
        L99:
            java.util.List r4 = r13.A08(r11, r10)
            int r3 = r4.size()
        La1:
            if (r5 >= r3) goto L8c
            java.lang.Object r2 = r4.get(r5)
            X.5Ap r2 = (X.C113525Ap) r2
            X.01M r1 = A06(r6)
            int r0 = r2.A02
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto Lc5
            X.0w2 r1 = r6.A06
            int r0 = r2.A02
            java.lang.Object r0 = r1.A03(r0)
            X.C14360o3.A0A(r0)
            X.5Aq r0 = (X.C113535Aq) r0
            A0I(r6, r0, r2)
        Lc5:
            int r5 = r5 + 1
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0I(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, X.5Aq, X.5Ap):void");
    }

    public static final void A0J(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Integer num, List list, int i, int i2) {
        if (i != Integer.MIN_VALUE && androidComposeViewAccessibilityDelegateCompat.A0b()) {
            AccessibilityEvent A04 = A04(androidComposeViewAccessibilityDelegateCompat, i, i2);
            if (num != null) {
                A04.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                A04.setContentDescription(AbstractC121615fC.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list));
            }
            AbstractC09790fc.A01("sendEvent", -1657607598);
            try {
                A0D(A04, androidComposeViewAccessibilityDelegateCompat);
                AbstractC09790fc.A00(-90792937);
            } catch (Throwable th) {
                AbstractC09790fc.A00(-1109672564);
                throw th;
            }
        }
    }

    public static final boolean A0L(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C113525Ap c113525Ap, int i, int i2, boolean z) {
        String A0A;
        Integer num;
        C113505An c113505An = c113525Ap.A05;
        C113565At c113565At = AbstractC120875de.A0N;
        boolean z2 = false;
        if (c113505An.A02.containsKey(c113565At) && CBR.A00(c113525Ap)) {
            InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) ((C120895dg) c113505An.A00(c113565At)).A01;
            if (interfaceC16610sE == null) {
                return false;
            }
            return ((Boolean) interfaceC16610sE.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        }
        if ((i == i2 && i2 == androidComposeViewAccessibilityDelegateCompat.A00) || (A0A = A0A(c113525Ap)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > A0A.length()) {
            i = -1;
        }
        androidComposeViewAccessibilityDelegateCompat.A00 = i;
        int length = A0A.length();
        if (length > 0) {
            z2 = true;
        }
        int i3 = c113525Ap.A02;
        int A00 = A00(androidComposeViewAccessibilityDelegateCompat, i3);
        Integer num2 = null;
        if (z2) {
            num = Integer.valueOf(i);
            num2 = Integer.valueOf(length);
        } else {
            num = null;
        }
        A0D(A05(androidComposeViewAccessibilityDelegateCompat, A0A, num, num, num2, A00), androidComposeViewAccessibilityDelegateCompat);
        A0G(androidComposeViewAccessibilityDelegateCompat, i3);
        return true;
    }

    public static final boolean A0M(C6OK c6ok) {
        InterfaceC16820sZ interfaceC16820sZ = c6ok.A01;
        if (((Number) interfaceC16820sZ.invoke()).floatValue() <= 0.0f || c6ok.A02) {
            if (((Number) interfaceC16820sZ.invoke()).floatValue() < ((Number) c6ok.A00.invoke()).floatValue() && c6ok.A02) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A0N(C6OK c6ok) {
        InterfaceC16820sZ interfaceC16820sZ = c6ok.A01;
        if (((Number) interfaceC16820sZ.invoke()).floatValue() >= ((Number) c6ok.A00.invoke()).floatValue() || c6ok.A02) {
            if (((Number) interfaceC16820sZ.invoke()).floatValue() > 0.0f && c6ok.A02) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (A0Q(r6) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0P(X.C113525Ap r6) {
        /*
            r5 = this;
            X.5An r4 = r6.A05
            X.5At r0 = X.AbstractC113545Ar.A02
            java.lang.Object r0 = X.C5B6.A00(r4, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5e
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
        L10:
            r3 = 0
            if (r0 != 0) goto L3a
            X.5At r0 = X.AbstractC113545Ar.A04
            java.lang.Object r2 = X.C5B6.A00(r4, r0)
            r1 = r2
            X.5At r0 = X.AbstractC113545Ar.A0R
            java.lang.Object r0 = X.C5B6.A00(r4, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5c
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
        L28:
            if (r2 != 0) goto L2b
            r1 = r0
        L2b:
            if (r1 != 0) goto L3a
            java.lang.String r0 = r5.A09(r6)
            if (r0 != 0) goto L3a
            boolean r0 = A0Q(r6)
            r2 = 0
            if (r0 == 0) goto L3b
        L3a:
            r2 = 1
        L3b:
            boolean r0 = r4.A01
            if (r0 != 0) goto L5a
            boolean r0 = r6.A01
            if (r0 != 0) goto L5b
            r0 = 1
            java.util.List r0 = r6.A08(r3, r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            X.599 r1 = r6.A04
            X.6OV r0 = X.C6OV.A00
            X.599 r0 = X.AbstractC120835da.A00(r1, r0)
            if (r0 != 0) goto L5b
            if (r2 == 0) goto L5b
        L5a:
            r3 = 1
        L5b:
            return r3
        L5c:
            r0 = 0
            goto L28
        L5e:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(X.5Ap):boolean");
    }

    public static final boolean A0Q(C113525Ap c113525Ap) {
        C113505An c113505An = c113525Ap.A05;
        Object A00 = C5B6.A00(c113505An, AbstractC113545Ar.A0U);
        C5XQ c5xq = (C5XQ) C5B6.A00(c113505An, AbstractC113545Ar.A0M);
        boolean z = false;
        if (A00 != null) {
            z = true;
        }
        if (C5B6.A00(c113505An, AbstractC113545Ar.A0O) != null) {
            if (c5xq == null || c5xq.A00 != 4) {
                return true;
            }
            return z;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.01F, X.0w5] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.01F, X.0w5] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.5Al] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.01O, X.0w1] */
    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.A0R = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.A0O = accessibilityManager;
        this.A03 = 100L;
        this.A0M = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: X.5Aj
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                List<AccessibilityServiceInfo> list;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                C01I c01i = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
                if (z) {
                    list = androidComposeViewAccessibilityDelegateCompat.A0O.getEnabledAccessibilityServiceList(-1);
                } else {
                    list = C16930sl.A00;
                }
                androidComposeViewAccessibilityDelegateCompat.A0E = list;
            }
        };
        this.A0N = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: X.5Ak
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                C01I c01i = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
                androidComposeViewAccessibilityDelegateCompat.A0E = androidComposeViewAccessibilityDelegateCompat.A0O.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.A0E = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.A0L = new Handler(Looper.getMainLooper());
        this.A0J = new AnonymousClass051() { // from class: X.5Al
            @Override // X.AnonymousClass051
            public final AccessibilityNodeInfoCompat A00(int i) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                C01I c01i = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
                return createAccessibilityNodeInfo(androidComposeViewAccessibilityDelegateCompat.A01);
            }

            @Override // X.AnonymousClass051
            public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
                AndroidComposeViewAccessibilityDelegateCompat.A0C(bundle, AndroidComposeViewAccessibilityDelegateCompat.this, accessibilityNodeInfoCompat, str, i);
            }

            @Override // X.AnonymousClass051
            public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                AccessibilityNodeInfoCompat A07 = AndroidComposeViewAccessibilityDelegateCompat.A07(androidComposeViewAccessibilityDelegateCompat, i);
                if (androidComposeViewAccessibilityDelegateCompat.A0H && i == androidComposeViewAccessibilityDelegateCompat.A01) {
                    androidComposeViewAccessibilityDelegateCompat.A0C = A07;
                }
                return A07;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:151:0x0213, code lost:
            
                if (r19 != 8192) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:152:0x021f, code lost:
            
                r15 = false;
                r14 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:153:0x0224, code lost:
            
                if (r19 == 16908347) goto L130;
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x0226, code lost:
            
                r14 = false;
                r13 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:155:0x022b, code lost:
            
                if (r19 == 16908344) goto L132;
             */
            /* JADX WARN: Code restructure failed: missing block: B:156:0x0234, code lost:
            
                r1 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:157:0x0235, code lost:
            
                if (r15 != false) goto L138;
             */
            /* JADX WARN: Code restructure failed: missing block: B:158:0x0237, code lost:
            
                if (r14 != false) goto L138;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x0239, code lost:
            
                if (r3 != false) goto L138;
             */
            /* JADX WARN: Code restructure failed: missing block: B:160:0x023b, code lost:
            
                r12 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:161:0x023c, code lost:
            
                if (r16 == false) goto L139;
             */
            /* JADX WARN: Code restructure failed: missing block: B:162:0x023f, code lost:
            
                if (r13 != false) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:163:0x0241, code lost:
            
                if (r1 != false) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:164:0x0243, code lost:
            
                if (r3 != false) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:165:0x0245, code lost:
            
                r11 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:166:0x0246, code lost:
            
                if (r16 == false) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:167:0x02ac, code lost:
            
                r2 = r6.A04;
                r9 = X.AbstractC119495b6.A00(r2.A0W.A06).A01();
                r4 = r6.A05;
                r3 = new java.util.ArrayList();
                r1 = (X.C120895dg) X.C5B6.A00(r4, X.AbstractC120875de.A07);
                r8 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:168:0x02ca, code lost:
            
                if (r1 == null) goto L173;
             */
            /* JADX WARN: Code restructure failed: missing block: B:169:0x02cc, code lost:
            
                r1 = (X.InterfaceC16660sJ) r1.A01;
             */
            /* JADX WARN: Code restructure failed: missing block: B:170:0x02d0, code lost:
            
                if (r1 == null) goto L173;
             */
            /* JADX WARN: Code restructure failed: missing block: B:172:0x02dc, code lost:
            
                if (((java.lang.Boolean) r1.invoke(r3)).booleanValue() == false) goto L173;
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x02de, code lost:
            
                r8 = (java.lang.Number) r3.get(0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:174:0x02e4, code lost:
            
                r5 = (X.C120895dg) X.C5B6.A00(r4, X.AbstractC120875de.A0J);
             */
            /* JADX WARN: Code restructure failed: missing block: B:175:0x02ec, code lost:
            
                if (r5 == null) goto L387;
             */
            /* JADX WARN: Code restructure failed: missing block: B:176:0x02ee, code lost:
            
                r6 = (X.C6OK) X.C5B6.A00(r4, X.AbstractC113545Ar.A08);
             */
            /* JADX WARN: Code restructure failed: missing block: B:177:0x02f7, code lost:
            
                if (r6 == null) goto L202;
             */
            /* JADX WARN: Code restructure failed: missing block: B:178:0x02f9, code lost:
            
                if (r12 == false) goto L202;
             */
            /* JADX WARN: Code restructure failed: missing block: B:179:0x02fb, code lost:
            
                if (r8 == null) goto L201;
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x02fd, code lost:
            
                r3 = r8.floatValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:181:0x0301, code lost:
            
                if (r15 != false) goto L182;
             */
            /* JADX WARN: Code restructure failed: missing block: B:182:0x0303, code lost:
            
                if (r16 == false) goto L183;
             */
            /* JADX WARN: Code restructure failed: missing block: B:184:0x0308, code lost:
            
                if (r6.A02 == false) goto L186;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x030a, code lost:
            
                r3 = -r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:187:0x030f, code lost:
            
                if (r2.A0D != X.AnonymousClass583.Rtl) goto L191;
             */
            /* JADX WARN: Code restructure failed: missing block: B:188:0x0311, code lost:
            
                if (r15 != false) goto L190;
             */
            /* JADX WARN: Code restructure failed: missing block: B:189:0x0313, code lost:
            
                if (r14 == false) goto L191;
             */
            /* JADX WARN: Code restructure failed: missing block: B:190:0x0315, code lost:
            
                r3 = -r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:192:0x031a, code lost:
            
                if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0O(r6, r3) == false) goto L202;
             */
            /* JADX WARN: Code restructure failed: missing block: B:193:0x031c, code lost:
            
                r6 = X.AbstractC120875de.A0E;
                r2 = r4.A02;
             */
            /* JADX WARN: Code restructure failed: missing block: B:194:0x0324, code lost:
            
                if (r2.containsKey(r6) != false) goto L224;
             */
            /* JADX WARN: Code restructure failed: missing block: B:196:0x032c, code lost:
            
                if (r2.containsKey(X.AbstractC120875de.A0F) != false) goto L224;
             */
            /* JADX WARN: Code restructure failed: missing block: B:197:0x032e, code lost:
            
                r2 = (X.InterfaceC16620sF) r5.A01;
             */
            /* JADX WARN: Code restructure failed: missing block: B:198:0x0332, code lost:
            
                if (r2 == null) goto L388;
             */
            /* JADX WARN: Code restructure failed: missing block: B:199:0x0334, code lost:
            
                r1 = java.lang.Float.valueOf(r3);
                r0 = java.lang.Float.valueOf(0.0f);
             */
            /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:202:0x0391, code lost:
            
                if (r3 <= 0.0f) goto L244;
             */
            /* JADX WARN: Code restructure failed: missing block: B:203:0x0393, code lost:
            
                r6 = X.AbstractC120875de.A0F;
             */
            /* JADX WARN: Code restructure failed: missing block: B:204:0x0305, code lost:
            
                r3 = -r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:205:0x0342, code lost:
            
                r3 = X.C5YC.A02(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:206:0x0347, code lost:
            
                r2 = (X.C6OK) X.C5B6.A00(r4, X.AbstractC113545Ar.A0W);
             */
            /* JADX WARN: Code restructure failed: missing block: B:207:0x034f, code lost:
            
                if (r2 == null) goto L389;
             */
            /* JADX WARN: Code restructure failed: missing block: B:208:0x0351, code lost:
            
                if (r11 == false) goto L390;
             */
            /* JADX WARN: Code restructure failed: missing block: B:209:0x0353, code lost:
            
                if (r8 == null) goto L223;
             */
            /* JADX WARN: Code restructure failed: missing block: B:210:0x0355, code lost:
            
                r3 = r8.floatValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:211:0x0359, code lost:
            
                if (r13 != false) goto L209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:212:0x035b, code lost:
            
                if (r16 == false) goto L210;
             */
            /* JADX WARN: Code restructure failed: missing block: B:214:0x0360, code lost:
            
                if (r2.A02 == false) goto L213;
             */
            /* JADX WARN: Code restructure failed: missing block: B:215:0x0362, code lost:
            
                r3 = -r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:217:0x0367, code lost:
            
                if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0O(r2, r3) == false) goto L391;
             */
            /* JADX WARN: Code restructure failed: missing block: B:218:0x0369, code lost:
            
                r6 = X.AbstractC120875de.A0G;
                r2 = r4.A02;
             */
            /* JADX WARN: Code restructure failed: missing block: B:219:0x0371, code lost:
            
                if (r2.containsKey(r6) != false) goto L227;
             */
            /* JADX WARN: Code restructure failed: missing block: B:221:0x0379, code lost:
            
                if (r2.containsKey(X.AbstractC120875de.A0D) != false) goto L227;
             */
            /* JADX WARN: Code restructure failed: missing block: B:222:0x037b, code lost:
            
                r2 = (X.InterfaceC16620sF) r5.A01;
             */
            /* JADX WARN: Code restructure failed: missing block: B:223:0x037f, code lost:
            
                if (r2 == null) goto L392;
             */
            /* JADX WARN: Code restructure failed: missing block: B:224:0x0381, code lost:
            
                r1 = java.lang.Float.valueOf(0.0f);
             */
            /* JADX WARN: Code restructure failed: missing block: B:225:?, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:227:0x0398, code lost:
            
                if (r3 <= 0.0f) goto L244;
             */
            /* JADX WARN: Code restructure failed: missing block: B:228:0x039a, code lost:
            
                r6 = X.AbstractC120875de.A0D;
             */
            /* JADX WARN: Code restructure failed: missing block: B:229:?, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:230:0x035d, code lost:
            
                r3 = -r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:231:0x038a, code lost:
            
                r3 = X.C5YC.A00(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:232:?, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:233:?, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:234:?, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:235:0x0248, code lost:
            
                r11 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:236:0x0249, code lost:
            
                if (r3 != false) goto L147;
             */
            /* JADX WARN: Code restructure failed: missing block: B:237:0x024b, code lost:
            
                if (r16 == false) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:238:0x024d, code lost:
            
                r2 = r6.A05;
                r7 = (X.C6OU) X.C5B6.A00(r2, X.AbstractC113545Ar.A0L);
                r8 = (X.C120895dg) X.C5B6.A00(r2, X.AbstractC120875de.A0M);
             */
            /* JADX WARN: Code restructure failed: missing block: B:239:0x025f, code lost:
            
                if (r7 == null) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:240:0x0261, code lost:
            
                if (r8 == null) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:241:0x0263, code lost:
            
                r1 = r7.A02;
                r5 = (java.lang.Number) r1.B1t();
                r4 = r5.floatValue();
                r3 = (java.lang.Number) r1.BzZ();
                r2 = r3.floatValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:242:0x027b, code lost:
            
                if (r4 >= r2) goto L153;
             */
            /* JADX WARN: Code restructure failed: missing block: B:243:0x027d, code lost:
            
                r4 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:244:0x027e, code lost:
            
                r3 = r3.floatValue();
                r2 = r5.floatValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:245:0x0288, code lost:
            
                if (r3 <= r2) goto L156;
             */
            /* JADX WARN: Code restructure failed: missing block: B:246:0x028a, code lost:
            
                r3 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:247:0x028b, code lost:
            
                r2 = r7.A01;
                r4 = r4 - r3;
                r1 = 20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:248:0x0290, code lost:
            
                if (r2 <= 0) goto L159;
             */
            /* JADX WARN: Code restructure failed: missing block: B:249:0x0292, code lost:
            
                r1 = r2 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:250:0x0294, code lost:
            
                r4 = r4 / r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:251:0x0296, code lost:
            
                if (r16 == false) goto L162;
             */
            /* JADX WARN: Code restructure failed: missing block: B:252:0x0298, code lost:
            
                r4 = -r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:253:0x0299, code lost:
            
                r1 = (X.InterfaceC16660sJ) r8.A01;
             */
            /* JADX WARN: Code restructure failed: missing block: B:254:0x029d, code lost:
            
                if (r1 == null) goto L386;
             */
            /* JADX WARN: Code restructure failed: missing block: B:255:0x029f, code lost:
            
                r0 = r7.A00 + r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:256:?, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:257:0x023e, code lost:
            
                r12 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:258:0x022d, code lost:
            
                r13 = false;
                r1 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:259:0x0232, code lost:
            
                if (r19 == 16908346) goto L133;
             */
            /* JADX WARN: Code restructure failed: missing block: B:261:0x021d, code lost:
            
                if (r19 != 16908345) goto L126;
             */
            /* JADX WARN: Code restructure failed: missing block: B:342:0x05a4, code lost:
            
                if (r0 != false) goto L351;
             */
            /* JADX WARN: Code restructure failed: missing block: B:347:0x05ac, code lost:
            
                if (r0 != false) goto L352;
             */
            /* JADX WARN: Code restructure failed: missing block: B:350:0x05b3, code lost:
            
                if (r0 != false) goto L338;
             */
            /* JADX WARN: Code restructure failed: missing block: B:393:0x040c, code lost:
            
                if (r0 == false) goto L253;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:21:0x003e. Please report as an issue. */
            /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0041. Please report as an issue. */
            /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0044. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:150:0x020e  */
            /* JADX WARN: Removed duplicated region for block: B:320:0x0560  */
            /* JADX WARN: Removed duplicated region for block: B:325:0x056a  */
            /* JADX WARN: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:350:0x05b3  */
            /* JADX WARN: Removed duplicated region for block: B:351:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r9v11, types: [X.Bb0, X.CoD] */
            /* JADX WARN: Type inference failed for: r9v18, types: [X.Bb1, X.CoD] */
            /* JADX WARN: Type inference failed for: r9v2, types: [X.Bay, X.CoD] */
            /* JADX WARN: Type inference failed for: r9v21, types: [X.Baz, X.CoD] */
            @Override // X.AnonymousClass051
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean performAction(int r18, int r19, android.os.Bundle r20) {
                /*
                    Method dump skipped, instructions count: 1546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C113485Al.performAction(int, int, android.os.Bundle):boolean");
            }
        };
        this.A01 = Integer.MIN_VALUE;
        this.A0P = new C18750w2(6);
        this.A0Q = new C18750w2(6);
        this.A08 = new C005101q(10);
        this.A09 = new C005101q(10);
        this.A00 = -1;
        this.A0V = new C012504o(0);
        this.A0X = new C24721Ip(1);
        this.A0G = true;
        C18750w2 c18750w2 = C01N.A00;
        C14360o3.A0C(c18750w2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A0I = c18750w2;
        ?? c01o = new C01O();
        long[] jArr = AbstractC004701m.A00;
        C18740w1.A02(c01o, 6);
        this.A07 = c01o;
        ?? c01f = new C01F();
        C0w5.A02(c01f, 6);
        this.A05 = c01f;
        ?? c01f2 = new C01F();
        C0w5.A02(c01f2, 6);
        this.A04 = c01f2;
        this.A0S = new C113495Am();
        this.A06 = new C18750w2(6);
        C113525Ap A00 = androidComposeView.A0l.A00();
        C14360o3.A0C(c18750w2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.A0B = new C113535Aq(c18750w2, A00);
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.5B8
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                C01I c01i = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
                AccessibilityManager accessibilityManager2 = androidComposeViewAccessibilityDelegateCompat.A0O;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0M);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0N);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                C01I c01i = AndroidComposeViewAccessibilityDelegateCompat.A0Y;
                androidComposeViewAccessibilityDelegateCompat.A0L.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.A0T);
                AccessibilityManager accessibilityManager2 = androidComposeViewAccessibilityDelegateCompat.A0O;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0M);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0N);
            }
        });
        this.A0T = new Runnable() { // from class: X.5B9
            /* JADX WARN: Code restructure failed: missing block: B:191:0x02fb, code lost:
            
                if (r13 == false) goto L118;
             */
            /* JADX WARN: Code restructure failed: missing block: B:209:0x0304, code lost:
            
                if (r13 != false) goto L123;
             */
            /* JADX WARN: Code restructure failed: missing block: B:291:0x0545, code lost:
            
                X.AbstractC28290Cdc.A02("no value for specified key");
             */
            /* JADX WARN: Code restructure failed: missing block: B:292:0x054e, code lost:
            
                throw X.C00O.createAndThrow();
             */
            /* JADX WARN: Code restructure failed: missing block: B:362:0x0681, code lost:
            
                if (((r24 & ((r24 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L407;
             */
            /* JADX WARN: Removed duplicated region for block: B:252:0x0145 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0161 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r9v0, types: [X.01O, X.0w1] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1882
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5B9.run():void");
            }
        };
        this.A0U = new ArrayList();
        this.A0W = new C206999Ee(this, 6);
    }

    public static final AccessibilityEvent A04(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2) {
        C121655fH c121655fH;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0R;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i);
        if (androidComposeViewAccessibilityDelegateCompat.A0b() && (c121655fH = (C121655fH) A06(androidComposeViewAccessibilityDelegateCompat).A03(i)) != null) {
            obtain.setPassword(c121655fH.A01.A05.A02.containsKey(AbstractC113545Ar.A0K));
        }
        return obtain;
    }

    public static final CharSequence A08(CharSequence charSequence) {
        int i = 100000;
        if (charSequence != null && charSequence.length() != 0 && charSequence.length() > 100000) {
            if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                i = 99999;
            }
            CharSequence subSequence = charSequence.subSequence(0, i);
            C14360o3.A0C(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return subSequence;
        }
        return charSequence;
    }

    public static final void A0D(AccessibilityEvent accessibilityEvent, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (androidComposeViewAccessibilityDelegateCompat.A0b()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                androidComposeViewAccessibilityDelegateCompat.A0H = true;
            }
            try {
                androidComposeViewAccessibilityDelegateCompat.A0K.invoke(accessibilityEvent);
            } finally {
                androidComposeViewAccessibilityDelegateCompat.A0H = false;
            }
        }
    }

    public static final void A0K(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, String str, int i, int i2) {
        AccessibilityEvent A04 = A04(androidComposeViewAccessibilityDelegateCompat, A00(androidComposeViewAccessibilityDelegateCompat, i), 32);
        A04.setContentChangeTypes(i2);
        if (str != null) {
            A04.getText().add(str);
        }
        A0D(A04, androidComposeViewAccessibilityDelegateCompat);
    }

    public final boolean A0c(long j, int i, boolean z) {
        C113565At c113565At;
        C6OK c6ok;
        if (C14360o3.A0K(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            C01M A06 = A06(this);
            if (j != 9205357640488583168L && C119365at.A09(j)) {
                if (z) {
                    c113565At = AbstractC113545Ar.A0W;
                } else {
                    c113565At = AbstractC113545Ar.A08;
                }
                Object[] objArr = A06.A04;
                long[] jArr = A06.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i2];
                        if (((((-1) ^ j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j2 & 255) < 128) {
                                    C121655fH c121655fH = (C121655fH) objArr[(i2 << 3) + i4];
                                    Rect rect = c121655fH.A00;
                                    C114205Dh c114205Dh = new C114205Dh(rect.left, rect.top, rect.right, rect.bottom);
                                    float A01 = C119365at.A01(j);
                                    if (A01 >= c114205Dh.A01 && A01 < c114205Dh.A02) {
                                        float A02 = C119365at.A02(j);
                                        if (A02 >= c114205Dh.A03 && A02 < c114205Dh.A00 && (c6ok = (C6OK) C5B6.A00(c121655fH.A01.A05, c113565At)) != null) {
                                            boolean z3 = c6ok.A02;
                                            int i5 = i;
                                            if (z3) {
                                                i5 = -i;
                                            }
                                            if ((i == 0 && z3) || i5 < 0) {
                                                if (((Number) c6ok.A01.invoke()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) c6ok.A01.invoke()).floatValue() >= ((Number) c6ok.A00.invoke()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                return z2;
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        } else {
                            return z2;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C02V
    public final AnonymousClass051 A0Z(View view) {
        return this.A0J;
    }
}
