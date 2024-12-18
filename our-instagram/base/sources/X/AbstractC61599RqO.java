package X;

/* renamed from: X.RqO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61599RqO {
    public final String A00() {
        switch (((QKF) this).A00) {
            case 0:
                return "com.facebook.katana";
            case 1:
                return "com.facebook.lite";
            case 2:
                return "com.facebook.mlite";
            case 3:
                return "com.facebook.orca";
            case 4:
                return "com.instagram.android";
            case 5:
                return "com.instagram.lite";
            case 6:
                return "com.instagram.barcelona";
            default:
                return "com.whatsapp";
        }
    }

    public final String toString() {
        switch (((QKF) this).A00) {
            case 0:
                return AbstractC111324zv.A00(634);
            case 1:
                return "Facebook Lite";
            case 2:
                return "Messenger Lite";
            case 3:
                return AbstractC43591JPw.A00(117);
            case 4:
                return "Instagram";
            case 5:
                return "Instagram Lite";
            case 6:
                return AbstractC111324zv.A00(1819);
            default:
                return MSV.A00(370);
        }
    }
}
