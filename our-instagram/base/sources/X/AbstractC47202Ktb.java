package X;

/* renamed from: X.Ktb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47202Ktb {
    public static final C114675Fx A00;
    public static final C114675Fx A01;
    public static final C114675Fx A02;
    public static final C114675Fx A03;

    static {
        EnumC46247KdO enumC46247KdO = EnumC46247KdO.A0C;
        A02 = new C114675Fx(enumC46247KdO, "6", "na", "pending media not found", false, false);
        A00 = new C114675Fx(enumC46247KdO, "6", "na", "pending media failure", false, true);
        A01 = new C114675Fx(enumC46247KdO, "6", "na", "pending media never in progress failure", false, true);
        A03 = new C114675Fx(enumC46247KdO, "6", "na", "pending media permanent failure", false, false);
    }
}
