package X;

import android.os.Debug;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.memorytimeline.MemoryTimeline;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.4pG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC105454pG implements C0TT {
    public static final EnumC105454pG A03;
    public static final EnumC105454pG A04;
    public static final EnumC105454pG A05;
    public final C0TP A00;
    public final HashMap A01 = new HashMap();
    public final HashSet A02 = new HashSet();

    @Override // X.C0TT
    public final void DES(C0TM c0tm) {
    }

    @Override // X.C0TT
    public final boolean FDw() {
        return true;
    }

    static {
        final C0TP c0tp = C0TP.A0V;
        A04 = new EnumC105454pG(c0tp) { // from class: X.4pH
            @Override // X.C0TT
            public final int BoH() {
                return 1;
            }
        };
        final C0TP c0tp2 = C0TP.A0o;
        A05 = new EnumC105454pG(c0tp2) { // from class: X.4pI
            @Override // X.C0TT
            public final int BoH() {
                return 4;
            }
        };
        final C0TP c0tp3 = C0TP.A08;
        A03 = new EnumC105454pG(c0tp3) { // from class: X.4pJ
            @Override // X.C0TT
            public final int BoH() {
                return 8;
            }
        };
    }

    public final long A00() {
        long freeMemory;
        if (this instanceof C105484pJ) {
            long[] jArr = new long[1];
            C0JC.A01(AbstractC111324zv.A00(1473), C2R5.A01, jArr);
            return jArr[0] * C2R5.A00;
        }
        if (this instanceof C105474pI) {
            freeMemory = Debug.getNativeHeapAllocatedSize();
        } else {
            Runtime runtime = Runtime.getRuntime();
            freeMemory = runtime.totalMemory() - runtime.freeMemory();
        }
        return freeMemory / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
    }

    @Override // X.C0TT
    public final void DVg(MemoryTimeline memoryTimeline, C0TS c0ts) {
        C0TJ c0tj;
        for (C0TJ c0tj2 : c0ts.A00) {
            if (this.A00.equals(c0tj2.A02)) {
                HashMap hashMap = this.A01;
                synchronized (hashMap) {
                    Iterator it = this.A02.iterator();
                    while (it.hasNext()) {
                        C105634pa c105634pa = (C105634pa) hashMap.get((Integer) it.next());
                        if (c105634pa != null && ((c0tj = c105634pa.A02) == null || C0TJ.A00(c0tj, c0tj2) == c0tj2)) {
                            c105634pa.A02 = c0tj2;
                        }
                    }
                }
            }
        }
    }

    public EnumC105454pG(C0TP c0tp, String str, int i) {
        this.A00 = c0tp;
    }
}
