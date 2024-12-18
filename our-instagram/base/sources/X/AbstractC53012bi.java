package X;

/* renamed from: X.2bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53012bi {
    public static final Class A00(InterfaceC16510rw interfaceC16510rw) {
        C14360o3.A0B(interfaceC16510rw, 0);
        Class BKI = ((C0s4) interfaceC16510rw).BKI();
        C14360o3.A0C(BKI, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return BKI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001a. Please report as an issue. */
    public static final Class A01(InterfaceC16510rw interfaceC16510rw) {
        String name;
        C14360o3.A0B(interfaceC16510rw, 0);
        Class BKI = ((C0s4) interfaceC16510rw).BKI();
        if (BKI.isPrimitive() && (name = BKI.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return BKI;
    }
}
