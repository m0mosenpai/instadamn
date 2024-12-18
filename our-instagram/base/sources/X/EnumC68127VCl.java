package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v3 X.VCl, still in use, count: 1, list:
  (r1v3 X.VCl) from 0x002c: SPUT (r1v3 X.VCl) (LINE:44) X.VCl.A00 X.VCl
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
/* renamed from: X.VCl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68127VCl {
    UNKNOWN,
    HERE,
    MAPBOX,
    /* JADX INFO: Fake field, exist only in values array */
    OSM;

    public static EnumC68127VCl A00;

    static {
        A00 = r1;
    }

    public static EnumC68127VCl valueOf(String str) {
        return (EnumC68127VCl) Enum.valueOf(EnumC68127VCl.class, str);
    }

    public static EnumC68127VCl[] values() {
        return (EnumC68127VCl[]) A01.clone();
    }

    public EnumC68127VCl() {
    }
}
