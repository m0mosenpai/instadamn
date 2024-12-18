package X;

/* loaded from: classes8.dex */
public abstract class LBy {
    public static final KVT A00(C160787Im c160787Im) {
        C83553nw c83553nw = c160787Im.A0e.A0N;
        if (c83553nw instanceof KVT) {
            return (KVT) c83553nw;
        }
        return null;
    }

    public static final boolean A01(C83553nw c83553nw) {
        String str = null;
        if (c83553nw instanceof KVT) {
            str = c83553nw.A02;
        }
        if (!C14360o3.A0K(str, "disappearing_mode_on_client_admin_message") && !C14360o3.A0K(str, "disappearing_mode_upgrade_from_vanish_mode_swipe_up") && !C14360o3.A0K(str, "disappearing_mode_upgrade_from_vanish_mode_update_app")) {
            return false;
        }
        return true;
    }
}
