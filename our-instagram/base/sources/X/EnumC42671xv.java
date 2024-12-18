package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC42671xv {
    public static final /* synthetic */ EnumC42671xv[] A00;
    public static final EnumC42671xv A01;

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }

    static {
        EnumC42671xv enumC42671xv = new EnumC42671xv();
        A01 = enumC42671xv;
        A00 = new EnumC42671xv[]{enumC42671xv};
    }

    public static boolean A00(InterfaceC42071wx interfaceC42071wx, Object obj) {
        if (obj == A01) {
            interfaceC42071wx.onComplete();
            return true;
        }
        if (obj instanceof C42741y2) {
            interfaceC42071wx.onError(((C42741y2) obj).A00);
            return true;
        }
        interfaceC42071wx.DVo(obj);
        return false;
    }

    public static boolean A01(InterfaceC42071wx interfaceC42071wx, Object obj) {
        if (obj == A01) {
            interfaceC42071wx.onComplete();
            return true;
        }
        if (obj instanceof C42741y2) {
            interfaceC42071wx.onError(((C42741y2) obj).A00);
            return true;
        }
        if (obj instanceof C133055zU) {
            interfaceC42071wx.Dpc(((C133055zU) obj).A00);
            return false;
        }
        interfaceC42071wx.DVo(obj);
        return false;
    }

    public static EnumC42671xv valueOf(String str) {
        return (EnumC42671xv) Enum.valueOf(EnumC42671xv.class, str);
    }

    public static EnumC42671xv[] values() {
        return (EnumC42671xv[]) A00.clone();
    }
}
