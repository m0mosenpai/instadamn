package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Xbi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class EnumC72346Xbi {
    public static final EnumC72346Xbi A00;

    static {
        new C72318XbG(0);
        new C72318XbG(1);
        new C72318XbG(2);
        new C72318XbG(3);
        A00 = new C72318XbG(4);
    }

    public final int A00() {
        switch (((C72318XbG) this).A00) {
            case 0:
                return 1;
            case 1:
                return 5;
            case 2:
                return 6;
            case 3:
                return 7;
            default:
                return 13;
        }
    }

    public EnumC72346Xbi(String str, int i) {
    }
}
