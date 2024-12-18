package X;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v3 X.0dl, still in use, count: 1, list:
  (r1v3 X.0dl) from 0x0052: INVOKE (wrap:java.util.Map:0x0050: SGET  A[WRAPPED] (LINE:80) X.0dl.A02 java.util.Map), (".spo"), (r1v3 X.0dl) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:82)
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
/* renamed from: X.0dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC09360dl {
    SUPERPACK_XZ(".spk.xz", 0),
    SUPERPACK_ZSTD(".spk.zst", 1),
    SUPERPACK_BR(".spk.br", 2),
    /* JADX INFO: Fake field, exist only in values array */
    SUPERPACK_OB(".spo", 3);

    public static Map A02;
    public final String A00;
    public final String A01;

    static {
        EnumC09360dl enumC09360dl = SUPERPACK_XZ;
        EnumC09360dl enumC09360dl2 = SUPERPACK_ZSTD;
        EnumC09360dl enumC09360dl3 = SUPERPACK_BR;
        HashMap hashMap = new HashMap();
        A02 = hashMap;
        hashMap.put(".spk.xz", enumC09360dl);
        A02.put(".spk.zst", enumC09360dl2);
        A02.put(".spk.br", enumC09360dl3);
        A02.put(".spo", r1);
    }

    public static EnumC09360dl valueOf(String str) {
        return (EnumC09360dl) Enum.valueOf(EnumC09360dl.class, str);
    }

    public static EnumC09360dl[] values() {
        return (EnumC09360dl[]) A03.clone();
    }

    public EnumC09360dl(String str, int i) {
        this.A00 = r2;
        this.A01 = str;
    }
}
