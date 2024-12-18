package X;

/* loaded from: classes11.dex */
public abstract class W6P {
    public static C4OK A00(C4OM c4om) {
        C4OM c4om2;
        if (c4om instanceof C4OK) {
            return (C4OK) c4om;
        }
        if (c4om instanceof C126895oT) {
            c4om2 = ((C126895oT) c4om).A00;
        } else if (c4om instanceof C126885oS) {
            c4om2 = ((C126885oS) c4om).A00;
        } else {
            return null;
        }
        return c4om2.ACc();
    }

    public static C4OW A01(C4OM c4om) {
        C4OM c4om2;
        if (c4om instanceof C4OW) {
            return (C4OW) c4om;
        }
        if (c4om instanceof C126895oT) {
            c4om2 = ((C126895oT) c4om).A00;
        } else if (c4om instanceof C126885oS) {
            c4om2 = ((C126885oS) c4om).A00;
        } else {
            return null;
        }
        return c4om2.ACm();
    }

    public static InterfaceC126325nT A02(C4OM c4om) {
        C4OM c4om2;
        if (c4om instanceof InterfaceC126325nT) {
            return (InterfaceC126325nT) c4om;
        }
        if (c4om instanceof C126895oT) {
            c4om2 = ((C126895oT) c4om).A00;
        } else if (c4om instanceof C126885oS) {
            c4om2 = ((C126885oS) c4om).A00;
        } else {
            return null;
        }
        return c4om2.ACn();
    }
}
