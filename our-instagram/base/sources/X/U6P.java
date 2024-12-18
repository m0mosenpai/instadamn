package X;

import android.content.Context;
import com.facebook.R;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes11.dex */
public final class U6P implements InterfaceC77833eB {
    public static final InterfaceC102914kS A02 = U6R.A00;
    public final C6FG A00;
    public final C102884kP A01;

    public static void A00() {
        if (C1LN.A01.isTracing()) {
            C1LN.A00();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.6Vr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.6Vr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.6Vr, java.lang.Object] */
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        List<C102884kP> list = (List) obj2;
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(obj, list);
        if (AbstractC103044kf.A00() != null) {
            C6FG c6fg = this.A00;
            C102884kP c102884kP = this.A01;
            Object A01 = c6fg.A01(A02, c102884kP, R.id.bk_context_key_model_extension_state);
            C14360o3.A07(A01);
            C68733VbC c68733VbC = (C68733VbC) A01;
            long A00 = AbstractC135376Am.A00(getClass(), c102884kP.A04);
            long[] jArr5 = c68733VbC.A00;
            C103054kg A002 = AbstractC103044kf.A00();
            if (A002 == null) {
                for (C102884kP c102884kP2 : list) {
                    long j = (c102884kP2.A04 << 27) | 8070450532247928832L;
                    if (jArr5 != null && !VSG.A00(j)) {
                        if (AbstractC009903n.A0Q(jArr5, j)) {
                            Object obj4 = C103054kg.A00()[1];
                            if (obj4 == null) {
                                obj4 = null;
                            }
                            C140136Vr c140136Vr = (C140136Vr) obj4;
                            if (c140136Vr != null) {
                                c140136Vr.A00(j);
                            }
                        }
                    } else {
                        C103054kg A003 = AbstractC103044kf.A00();
                        if (A003 == null) {
                            C14360o3.A08(C1339162z.A00);
                            String A0O = AnonymousClass001.A0O("bindExtension: ", c102884kP2.A05);
                            try {
                                if (C1LN.A01.isTracing()) {
                                    C1LN.A01(A0O);
                                }
                                C1LZ.A00().A09.A01(c6fg, c102884kP2, c102884kP, obj);
                            } finally {
                                A00();
                            }
                        } else {
                            ?? obj5 = new Object();
                            Object obj6 = C103054kg.A00()[1];
                            C103054kg.A00()[1] = obj5;
                            try {
                                Object obj7 = obj6;
                                if (!(obj6 instanceof C140136Vr)) {
                                    obj7 = null;
                                }
                                C140136Vr c140136Vr2 = (C140136Vr) obj7;
                                C14360o3.A08(C1339162z.A00);
                                String A0O2 = AnonymousClass001.A0O("bindExtension: ", c102884kP2.A05);
                                try {
                                    if (C1LN.A01.isTracing()) {
                                        C1LN.A01(A0O2);
                                    }
                                    C1LZ.A00().A09.A01(c6fg, c102884kP2, c102884kP, obj);
                                    A00();
                                    if (!obj5.A01() && c140136Vr2 != null) {
                                        c140136Vr2.A00(j);
                                    }
                                    C103054kg.A00()[1] = obj6;
                                    if (!obj5.A01()) {
                                        C140056Vj c140056Vj = A003.A03;
                                        LinkedHashSet linkedHashSet = obj5.A00;
                                        if (linkedHashSet != null) {
                                            jArr4 = AbstractC001800i.A0y(linkedHashSet);
                                        } else {
                                            jArr4 = null;
                                        }
                                        c140056Vj.A01(new C140126Vq(null, null, jArr4), j, false);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                C103054kg.A00()[1] = obj6;
                                throw th2;
                            }
                        }
                    }
                }
            } else {
                ?? obj8 = new Object();
                Object obj9 = C103054kg.A00()[1];
                C103054kg.A00()[1] = obj8;
                try {
                    Object obj10 = obj9;
                    if (!(obj9 instanceof C140136Vr)) {
                        obj10 = null;
                    }
                    C140136Vr c140136Vr3 = (C140136Vr) obj10;
                    for (C102884kP c102884kP3 : list) {
                        long j2 = (c102884kP3.A04 << 27) | 8070450532247928832L;
                        if (jArr5 != null && !VSG.A00(j2)) {
                            if (AbstractC009903n.A0Q(jArr5, j2)) {
                                Object obj11 = C103054kg.A00()[1];
                                if (obj11 == null) {
                                    obj11 = null;
                                }
                                C140136Vr c140136Vr4 = (C140136Vr) obj11;
                                if (c140136Vr4 != null) {
                                    c140136Vr4.A00(j2);
                                }
                            }
                        } else {
                            C103054kg A004 = AbstractC103044kf.A00();
                            if (A004 == null) {
                                C14360o3.A08(C1339162z.A00);
                                String A0O3 = AnonymousClass001.A0O("bindExtension: ", c102884kP3.A05);
                                try {
                                    if (C1LN.A01.isTracing()) {
                                        C1LN.A01(A0O3);
                                    }
                                    C1LZ.A00().A09.A01(c6fg, c102884kP3, c102884kP, obj);
                                } finally {
                                    A00();
                                }
                            } else {
                                ?? obj12 = new Object();
                                Object obj13 = C103054kg.A00()[1];
                                C103054kg.A00()[1] = obj12;
                                try {
                                    Object obj14 = obj13;
                                    if (!(obj13 instanceof C140136Vr)) {
                                        obj14 = null;
                                    }
                                    C140136Vr c140136Vr5 = (C140136Vr) obj14;
                                    C14360o3.A08(C1339162z.A00);
                                    String A0O4 = AnonymousClass001.A0O("bindExtension: ", c102884kP3.A05);
                                    try {
                                        if (C1LN.A01.isTracing()) {
                                            C1LN.A01(A0O4);
                                        }
                                        C1LZ.A00().A09.A01(c6fg, c102884kP3, c102884kP, obj);
                                        A00();
                                        if (!obj12.A01() && c140136Vr5 != null) {
                                            c140136Vr5.A00(j2);
                                        }
                                        C103054kg.A00()[1] = obj13;
                                        if (!obj12.A01()) {
                                            C140056Vj c140056Vj2 = A004.A03;
                                            LinkedHashSet linkedHashSet2 = obj12.A00;
                                            if (linkedHashSet2 != null) {
                                                jArr3 = AbstractC001800i.A0y(linkedHashSet2);
                                            } else {
                                                jArr3 = null;
                                            }
                                            c140056Vj2.A01(new C140126Vq(null, null, jArr3), j2, false);
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    C103054kg.A00()[1] = obj13;
                                    throw th4;
                                }
                            }
                        }
                    }
                    if (!obj8.A01() && c140136Vr3 != null) {
                        c140136Vr3.A00(A00);
                    }
                    C103054kg.A00()[1] = obj9;
                    if (!obj8.A01()) {
                        C140056Vj c140056Vj3 = A002.A03;
                        LinkedHashSet linkedHashSet3 = obj8.A00;
                        if (linkedHashSet3 != null) {
                            jArr = AbstractC001800i.A0y(linkedHashSet3);
                        } else {
                            jArr = null;
                        }
                        jArr2 = null;
                        c140056Vj3.A01(new C140126Vq(null, null, jArr), A00, false);
                        c68733VbC.A00 = jArr2;
                        return jArr2;
                    }
                } catch (Throwable th5) {
                    C103054kg.A00()[1] = obj9;
                    throw th5;
                }
            }
            jArr2 = null;
            c68733VbC.A00 = jArr2;
            return jArr2;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        List<C102884kP> list = (List) obj2;
        AbstractC167017dG.A1P(obj, list);
        C6FG c6fg = this.A00;
        C102884kP c102884kP = this.A01;
        Object A01 = c6fg.A01(A02, c102884kP, R.id.bk_context_key_model_extension_state);
        C14360o3.A07(A01);
        long[] jArr = ((C68733VbC) A01).A00;
        for (C102884kP c102884kP2 : list) {
            long j = (c102884kP2.A04 << 27) | 8070450532247928832L;
            if (jArr == null || (AbstractC009903n.A0Q(jArr, j) && VSG.A00(j))) {
                C14360o3.A08(C1339162z.A00);
                String A0O = AnonymousClass001.A0O("unbindExtension: ", c102884kP2.A05);
                try {
                    if (C1LN.A01.isTracing()) {
                        C1LN.A01(A0O);
                    }
                    C1LZ.A00().A09.A02(c6fg, c102884kP2, c102884kP, obj);
                } finally {
                    A00();
                }
            }
        }
    }

    public U6P(C6FG c6fg, C102884kP c102884kP) {
        this.A00 = c6fg;
        this.A01 = c102884kP;
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        C140126Vq A00;
        C103054kg A002 = AbstractC103044kf.A00();
        if (A002 != null) {
            C102884kP c102884kP = this.A01;
            long A003 = AbstractC135376Am.A00(getClass(), c102884kP.A04);
            C140056Vj c140056Vj = A002.A04;
            if (c140056Vj != null && (A00 = c140056Vj.A00(A003)) != null) {
                boolean A004 = VSG.A00(A003);
                if (!A004) {
                    Object obj5 = C103054kg.A00()[1];
                    if (obj5 == null) {
                        obj5 = null;
                    }
                    C140136Vr c140136Vr = (C140136Vr) obj5;
                    if (c140136Vr != null) {
                        c140136Vr.A00(A003);
                    }
                    return A004;
                }
                Object A01 = this.A00.A01(A02, c102884kP, R.id.bk_context_key_model_extension_state);
                C14360o3.A07(A01);
                ((C68733VbC) A01).A00 = A00.A02;
                return A004;
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }
}
