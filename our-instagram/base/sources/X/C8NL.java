package X;

import android.app.Application;
import android.graphics.Matrix;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8NL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NL extends C193578hc {
    public static final List A09 = AbstractC16960so.A1Q(new C09530e4(Float.valueOf(0.5625f), C6DO.A0A), new C09530e4(Float.valueOf(0.75f), C6DO.A08), new C09530e4(Float.valueOf(1.0f), C6DO.A07), new C09530e4(Float.valueOf(1.3333334f), C6DO.A09), new C09530e4(Float.valueOf(1.7777778f), C6DO.A06));
    public final Application A00;
    public final C2GS A01;
    public final UserSession A02;
    public final C183378Bk A03;
    public final ClipsCreationViewModel A04;
    public final InterfaceC19390xP A05;
    public final C05A A06;
    public final C0UO A07;
    public final C05A A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8NL(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel) {
        super(application);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(clipsCreationViewModel, 3);
        this.A00 = application;
        this.A02 = userSession;
        this.A04 = clipsCreationViewModel;
        this.A01 = new C2GS();
        C008002u A00 = C10E.A00(C16930sl.A00);
        this.A08 = A00;
        C008002u A002 = C10E.A00(null);
        this.A06 = A002;
        this.A07 = A00;
        this.A05 = A002;
        this.A03 = AbstractC183368Bj.A00(application, userSession);
    }

    public static final C9ZF A00(C8NL c8nl) {
        C8A8 c8a8 = (C8A8) c8nl.A01.A02();
        if (c8a8 != null) {
            return (C9ZF) c8a8.A01;
        }
        return null;
    }

    public static final Integer A01(C09530e4 c09530e4, int i) {
        int intValue;
        Number number = (Number) c09530e4.A00;
        if (i < number.intValue()) {
            intValue = number.intValue() + 50;
        } else {
            Number number2 = (Number) c09530e4.A01;
            if (i > number2.intValue()) {
                intValue = number2.intValue() - 50;
            } else {
                return null;
            }
        }
        return Integer.valueOf(intValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (r15 == 90.0f) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A02(float r14, float r15) {
        /*
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r9 = r15
            int r1 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L9
            r0 = 1
        L9:
            r1 = 1119092736(0x42b40000, float:90.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L47
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            r6 = r14
        L14:
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L1f
        L1e:
            r5 = r14
        L1f:
            java.util.List r0 = X.C8NL.A09
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0e4 r0 = (X.C09530e4) r0
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L2a
            r3.add(r1)
            goto L2a
        L47:
            float r6 = r6 / r14
            goto L14
        L49:
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r3, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L58:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r3.next()
            X.0e4 r0 = (X.C09530e4) r0
            java.lang.Object r2 = r0.A01
            float r8 = r5 * r6
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r8 = r8 / r0
            r11 = 0
            r10 = 12
            r12 = 2
            X.9Az r7 = new X.9Az
            r13 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.Float r1 = java.lang.Float.valueOf(r14)
            X.51u r0 = new X.51u
            r0.<init>(r2, r7, r1)
            r4.add(r0)
            goto L58
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NL.A02(float, float):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel] */
    public static final void A03(C206169Az c206169Az, C206169Az c206169Az2, C8NL c8nl, Integer num, boolean z) {
        ?? r3;
        ?? r6 = c8nl.A04;
        C84B c84b = (C84B) r6.A0F.A02();
        if (c84b != null) {
            C17u A0C = C17s.A0C(0, c84b.A01.size());
            r3 = new ArrayList(AbstractC06950Ym.A1E(A0C, 10));
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                int A00 = ((AbstractC16880sg) it).A00();
                Integer valueOf = Integer.valueOf(A00);
                C206169Az c206169Az3 = null;
                if (num != null && A00 == num.intValue() && c206169Az2 != null) {
                    c206169Az3 = AMG.A02(c206169Az2);
                } else {
                    AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) c84b.A04(A00);
                    if (abstractC115485Ki != null) {
                        c206169Az3 = abstractC115485Ki.A04();
                    }
                }
                C206169Az A03 = AMG.A03(AMG.A01(c206169Az3), c206169Az);
                C14360o3.A0B(A03, 0);
                float[] fArr = {A03.A00 * 0.5625f, A03.A01};
                Matrix matrix = new Matrix();
                float f = -A03.A02;
                matrix.setRotate(f);
                matrix.mapPoints(fArr);
                r3.add(new C09530e4(valueOf, AMG.A02(new C206169Az(2, A03.A03 * 1.0f, f, (fArr[0] / 0.5625f) * 1.0f, fArr[1] * 1.0f))));
            }
        } else {
            r3 = C16930sl.A00;
        }
        r6.A0k(r3, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f5, code lost:
    
        if (r5 == 90.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C9ZF r27, X.C8NL r28) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NL.A04(X.9ZF, X.8NL):void");
    }

    public final C09530e4 A0E(int i) {
        int i2;
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        C84B c84b = (C84B) clipsCreationViewModel.A0G.A02();
        if (c84b != null) {
            i2 = c84b.A01(i);
        } else {
            i2 = 0;
        }
        C05A c05a = clipsCreationViewModel.A0O.A02;
        int A01 = ((C84B) c05a.getValue()).A01(i) + ((C84B) c05a.getValue()).A00(i);
        if (A01 <= 0 || Integer.valueOf(A01) == null) {
            A01 = i2;
        }
        return new C09530e4(Integer.valueOf(i2), Integer.valueOf(A01));
    }

    public final void A0F() {
        C9ZF A00 = A00(this);
        if (A00 != null && A00.A05.A00) {
            EnumC222949sZ enumC222949sZ = EnumC222949sZ.A03;
            int i = A00.A02;
            C206169Az c206169Az = A00.A03;
            float f = A00.A00;
            float f2 = A00.A01;
            C206169Az c206169Az2 = A00.A04;
            C14360o3.A0B(c206169Az, 2);
            C14360o3.A0B(c206169Az2, 5);
            A04(new C9ZF(c206169Az, c206169Az2, enumC222949sZ, f, f2, i), this);
        }
    }

    public final boolean A0G() {
        EnumC222949sZ enumC222949sZ;
        C9ZF A00 = A00(this);
        if (A00 != null && (enumC222949sZ = A00.A05) != null && enumC222949sZ.A00) {
            return true;
        }
        return false;
    }
}
