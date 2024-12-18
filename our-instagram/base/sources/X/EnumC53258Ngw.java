package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A0B' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Ngw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53258Ngw {
    public static final /* synthetic */ EnumC53258Ngw[] A02;
    public static final EnumC53258Ngw A03;
    public static final EnumC53258Ngw A04;
    public static final EnumC53258Ngw A05;
    public static final EnumC53258Ngw A06;
    public static final EnumC53258Ngw A07;
    public static final EnumC53258Ngw A08;
    public static final EnumC53258Ngw A09;
    public static final EnumC53258Ngw A0A;
    public static final EnumC53258Ngw A0B;
    public final float[] A00;
    public final float[] A01;

    static {
        EnumC53258Ngw enumC53258Ngw = new EnumC53258Ngw(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, AbstractC55164OdS.A03, AbstractC55164OdS.A04, 0);
        A06 = enumC53258Ngw;
        float[] fArr = AbstractC55164OdS.A09;
        EnumC53258Ngw enumC53258Ngw2 = new EnumC53258Ngw("YELLOW", fArr, fArr, 1);
        A0B = enumC53258Ngw2;
        float[] fArr2 = AbstractC55164OdS.A05;
        EnumC53258Ngw enumC53258Ngw3 = new EnumC53258Ngw("ORANGE", fArr2, fArr2, 2);
        A07 = enumC53258Ngw3;
        float[] fArr3 = AbstractC55164OdS.A08;
        EnumC53258Ngw enumC53258Ngw4 = new EnumC53258Ngw("RED", fArr3, fArr3, 3);
        A0A = enumC53258Ngw4;
        float[] fArr4 = AbstractC55164OdS.A06;
        EnumC53258Ngw enumC53258Ngw5 = new EnumC53258Ngw("PINK", fArr4, fArr4, 4);
        A08 = enumC53258Ngw5;
        float[] fArr5 = AbstractC55164OdS.A07;
        EnumC53258Ngw enumC53258Ngw6 = new EnumC53258Ngw("PURPLE", fArr5, fArr5, 5);
        A09 = enumC53258Ngw6;
        float[] fArr6 = AbstractC55164OdS.A00;
        EnumC53258Ngw enumC53258Ngw7 = new EnumC53258Ngw("BLUE", fArr6, fArr6, 6);
        A03 = enumC53258Ngw7;
        float[] fArr7 = AbstractC55164OdS.A02;
        EnumC53258Ngw enumC53258Ngw8 = new EnumC53258Ngw("LIGHTBLUE", fArr7, fArr7, 7);
        A05 = enumC53258Ngw8;
        float[] fArr8 = AbstractC55164OdS.A01;
        EnumC53258Ngw enumC53258Ngw9 = new EnumC53258Ngw("GREEN", fArr8, fArr8, 8);
        A04 = enumC53258Ngw9;
        A02 = new EnumC53258Ngw[]{enumC53258Ngw, enumC53258Ngw2, enumC53258Ngw3, enumC53258Ngw4, enumC53258Ngw5, enumC53258Ngw6, enumC53258Ngw7, enumC53258Ngw8, enumC53258Ngw9};
    }

    public static EnumC53258Ngw valueOf(String str) {
        return (EnumC53258Ngw) Enum.valueOf(EnumC53258Ngw.class, str);
    }

    public static EnumC53258Ngw[] values() {
        return (EnumC53258Ngw[]) A02.clone();
    }

    public EnumC53258Ngw(String str, float[] fArr, float[] fArr2, int i) {
        this.A00 = fArr;
        this.A01 = fArr2;
    }
}
