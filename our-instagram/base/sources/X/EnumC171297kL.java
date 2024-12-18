package X;

import android.content.Context;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC171297kL {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC171297kL[] A01;
    public static final EnumC171297kL A02;
    public static final EnumC171297kL A03;
    public static final EnumC171297kL A04;
    public static final EnumC171297kL A05;
    public static final EnumC171297kL A06;
    public static final EnumC171297kL A07;
    public static final EnumC171297kL A08;
    public static final EnumC171297kL A09;
    public static final EnumC171297kL A0A;

    static {
        EnumC171297kL enumC171297kL = new EnumC171297kL() { // from class: X.7kM
        };
        A03 = enumC171297kL;
        EnumC171297kL enumC171297kL2 = new EnumC171297kL() { // from class: X.7kN
        };
        A08 = enumC171297kL2;
        EnumC171297kL enumC171297kL3 = new EnumC171297kL() { // from class: X.7kO
        };
        A02 = enumC171297kL3;
        EnumC171297kL enumC171297kL4 = new EnumC171297kL() { // from class: X.7kP
        };
        A0A = enumC171297kL4;
        EnumC171297kL enumC171297kL5 = new EnumC171297kL() { // from class: X.7kQ
        };
        A06 = enumC171297kL5;
        EnumC171297kL enumC171297kL6 = new EnumC171297kL() { // from class: X.7kR
        };
        A04 = enumC171297kL6;
        EnumC171297kL enumC171297kL7 = new EnumC171297kL() { // from class: X.7kS
        };
        A05 = enumC171297kL7;
        EnumC171297kL enumC171297kL8 = new EnumC171297kL() { // from class: X.7kT
        };
        A09 = enumC171297kL8;
        EnumC171297kL enumC171297kL9 = new EnumC171297kL() { // from class: X.7kU
        };
        A07 = enumC171297kL9;
        EnumC171297kL[] enumC171297kLArr = {enumC171297kL, enumC171297kL2, enumC171297kL3, enumC171297kL4, enumC171297kL5, enumC171297kL6, enumC171297kL7, enumC171297kL8, enumC171297kL9, new EnumC171297kL() { // from class: X.7kV
        }};
        A01 = enumC171297kLArr;
        A00 = AbstractC12190kN.A00(enumC171297kLArr);
    }

    public static final void A00(Context context, Integer num, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A0A(i);
        if (num != null) {
            c193328hC.A09(num.intValue());
        }
        String string = context.getResources().getString(i2);
        C14360o3.A07(string);
        c193328hC.A0Z(new DialogInterfaceOnClickListenerC23150ANp(interfaceC16820sZ), EnumC193348hE.A06, string, true);
        c193328hC.A03();
        C0fJ.A00(c193328hC.A02());
    }

    public static EnumC171297kL valueOf(String str) {
        return (EnumC171297kL) Enum.valueOf(EnumC171297kL.class, str);
    }

    public static EnumC171297kL[] values() {
        return (EnumC171297kL[]) A01.clone();
    }

    public EnumC171297kL(String str, int i) {
    }
}
