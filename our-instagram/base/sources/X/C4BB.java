package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4BB, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4BB {
    public final long A00;
    public final long A01;
    public final C4B6 A02;
    public final C4B0 A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public final InterfaceC97364Yw A00() {
        if (this instanceof C4BA) {
            return ((C4BA) this).A03;
        }
        return (C97814aM) this;
    }

    public final C4B0 A01() {
        if (this instanceof C4BA) {
            return ((C4BA) this).A02;
        }
        return null;
    }

    public String A02() {
        if (this instanceof C4BA) {
            return ((C4BA) this).A04;
        }
        return null;
    }

    public final String A03() {
        return ((C92134At) this.A04.get(0)).A03;
    }

    public final boolean A04() {
        if (!(this instanceof C4BA)) {
            C4BE c4be = ((C97814aM) this).A00;
            if (c4be instanceof C4BD) {
                return ((C4BD) c4be).A03;
            }
            return false;
        }
        return false;
    }

    public C4BB(C4B6 c4b6, AbstractC92194Az abstractC92194Az, List list, List list2, List list3, List list4) {
        C4B0 c4b0;
        long j;
        C4B8.A03(!list.isEmpty());
        this.A04 = list;
        this.A02 = c4b6;
        this.A06 = Collections.unmodifiableList(list2);
        this.A05 = list3;
        this.A07 = list4;
        if (abstractC92194Az instanceof C4BD) {
            C4BD c4bd = (C4BD) abstractC92194Az;
            CU5 cu5 = c4bd.A01;
            if (cu5 != null) {
                C4B6 c4b62 = this.A02;
                c4b0 = new C4B0(cu5.A00(c4b62.A0T, c4b62.A05, 0L, 0L), 0L, -1L);
            } else {
                c4b0 = ((AbstractC92194Az) c4bd).A02;
            }
        } else {
            c4b0 = abstractC92194Az.A02;
        }
        this.A03 = c4b0;
        this.A01 = Util.A09(abstractC92194Az.A00, 1000000L, abstractC92194Az.A01);
        if (abstractC92194Az instanceof C4BE) {
            j = ((C4BE) abstractC92194Az).A03;
        } else {
            j = 0;
        }
        this.A00 = j;
    }
}
