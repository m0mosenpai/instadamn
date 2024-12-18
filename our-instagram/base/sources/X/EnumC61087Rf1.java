package X;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r39v0 X.Rf1, still in use, count: 1, list:
  (r39v0 X.Rf1) from 0x0106: INVOKE (r1v19 android.util.SparseArray), (0 int), (r39v0 X.Rf1) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:262)
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
/* renamed from: X.Rf1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61087Rf1 {
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE,
    /* JADX INFO: Fake field, exist only in values array */
    WIFI,
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_MMS,
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_SUPL,
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_DUN,
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_HIPRI,
    /* JADX INFO: Fake field, exist only in values array */
    WIMAX,
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH,
    /* JADX INFO: Fake field, exist only in values array */
    DUMMY,
    /* JADX INFO: Fake field, exist only in values array */
    ETHERNET,
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_FOTA,
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IMS,
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_CBS,
    /* JADX INFO: Fake field, exist only in values array */
    WIFI_P2P,
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IA,
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_EMERGENCY,
    /* JADX INFO: Fake field, exist only in values array */
    PROXY,
    /* JADX INFO: Fake field, exist only in values array */
    VPN,
    /* JADX INFO: Fake field, exist only in values array */
    NONE;

    public static final SparseArray A00;

    static {
        SparseArray A0G = AbstractC58318PtA.A0G();
        A00 = A0G;
        A0G.put(0, r39);
        A0G.put(1, r38);
        A0G.put(2, r37);
        A0G.put(3, r36);
        A0G.put(4, r35);
        A0G.put(5, r34);
        A0G.put(6, r14);
        A0G.put(7, r13);
        A0G.put(8, r12);
        A0G.put(9, r11);
        A0G.put(10, r10);
        A0G.put(11, r9);
        A0G.put(12, r8);
        A0G.put(13, r7);
        A0G.put(14, r6);
        A0G.put(15, r5);
        A0G.put(16, r4);
        A0G.put(17, r3);
        A0G.put(-1, r2);
    }

    public static EnumC61087Rf1 valueOf(String str) {
        return (EnumC61087Rf1) Enum.valueOf(EnumC61087Rf1.class, str);
    }

    public static EnumC61087Rf1[] values() {
        return (EnumC61087Rf1[]) A01.clone();
    }

    public EnumC61087Rf1() {
    }
}
