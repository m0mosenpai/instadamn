package X;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v0 X.Rf9, still in use, count: 1, list:
  (r9v0 X.Rf9) from 0x0042: INVOKE (r0v7 android.util.SparseArray), (1 int), (r9v0 X.Rf9) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:66)
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
/* renamed from: X.Rf9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61095Rf9 {
    DEFAULT,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY,
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER,
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED;

    public static final SparseArray A00;

    static {
        EnumC61095Rf9 enumC61095Rf9 = DEFAULT;
        SparseArray A0G = AbstractC58318PtA.A0G();
        A00 = A0G;
        A0G.put(0, enumC61095Rf9);
        A0G.put(1, r9);
        A0G.put(2, r10);
        A0G.put(3, r11);
        A0G.put(4, r12);
        A0G.put(-1, r13);
    }

    public static EnumC61095Rf9 valueOf(String str) {
        return (EnumC61095Rf9) Enum.valueOf(EnumC61095Rf9.class, str);
    }

    public static EnumC61095Rf9[] values() {
        return (EnumC61095Rf9[]) A01.clone();
    }

    public EnumC61095Rf9() {
    }
}
