package X;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r25v0 X.Rg8, still in use, count: 1, list:
  (r25v0 X.Rg8) from 0x010e: INVOKE (r12v2 android.util.SparseArray), (1 int), (r25v0 X.Rg8) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:270)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Rg8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61147Rg8 {
    UNKNOWN_MOBILE_SUBTYPE(0),
    /* JADX INFO: Fake field, exist only in values array */
    GPRS(1),
    /* JADX INFO: Fake field, exist only in values array */
    EDGE(2),
    /* JADX INFO: Fake field, exist only in values array */
    UMTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    CDMA(4),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_0(5),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_A(6),
    /* JADX INFO: Fake field, exist only in values array */
    RTT(7),
    /* JADX INFO: Fake field, exist only in values array */
    HSDPA(8),
    /* JADX INFO: Fake field, exist only in values array */
    HSUPA(9),
    /* JADX INFO: Fake field, exist only in values array */
    HSPA(10),
    /* JADX INFO: Fake field, exist only in values array */
    IDEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_B(12),
    /* JADX INFO: Fake field, exist only in values array */
    LTE(13),
    /* JADX INFO: Fake field, exist only in values array */
    EHRPD(14),
    /* JADX INFO: Fake field, exist only in values array */
    HSPAP(15),
    /* JADX INFO: Fake field, exist only in values array */
    GSM(16),
    /* JADX INFO: Fake field, exist only in values array */
    TD_SCDMA(17),
    /* JADX INFO: Fake field, exist only in values array */
    IWLAN(18),
    /* JADX INFO: Fake field, exist only in values array */
    LTE_CA(19),
    COMBINED(100);

    public static final SparseArray A01;
    public final int A00;

    static {
        EnumC61147Rg8 enumC61147Rg8 = UNKNOWN_MOBILE_SUBTYPE;
        SparseArray A0G = AbstractC58318PtA.A0G();
        A01 = A0G;
        A0G.put(0, enumC61147Rg8);
        A0G.put(1, r25);
        A0G.put(2, r24);
        A0G.put(3, r23);
        A0G.put(4, r22);
        A0G.put(5, r21);
        A0G.put(6, r20);
        A0G.put(7, r19);
        A0G.put(8, r18);
        A0G.put(9, r11);
        A0G.put(10, r10);
        A0G.put(11, r9);
        A0G.put(12, r8);
        A0G.put(13, r7);
        A0G.put(14, r6);
        A0G.put(15, r5);
        A0G.put(16, r4);
        A0G.put(17, r3);
        A0G.put(18, r2);
        A0G.put(19, r1);
    }

    public static EnumC61147Rg8 valueOf(String str) {
        return (EnumC61147Rg8) Enum.valueOf(EnumC61147Rg8.class, str);
    }

    public static EnumC61147Rg8[] values() {
        return (EnumC61147Rg8[]) A02.clone();
    }

    public EnumC61147Rg8(int i) {
        this.A00 = i;
    }
}
