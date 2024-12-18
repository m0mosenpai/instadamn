package X;

import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BXL {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BXL[] A01;
    public static final BXL A02;
    public static final BXL A03;
    public static final BXL A04;
    public static final BXL A05;
    public static final BXL A06;
    public static final BXL A07;
    public static final BXL A08;
    public static final BXL A09;
    public static final BXL A0A;
    public static final BXL A0B;
    public static final BXL A0C;
    public static final BXL A0D;

    static {
        BXL bxl = new BXL("TEXT", 0);
        A0C = bxl;
        BXL bxl2 = new BXL("NUMBER", 1);
        A08 = bxl2;
        BXL bxl3 = new BXL(PaymentDetailChangeTypes$Companion.EMAIL, 2);
        A07 = bxl3;
        BXL bxl4 = new BXL("PHONE", 3);
        A0B = bxl4;
        BXL bxl5 = new BXL("PASSWORD", 4);
        A0A = bxl5;
        BXL bxl6 = new BXL("PASSCODE", 5);
        A09 = bxl6;
        BXL bxl7 = new BXL("AMOUNT", 6);
        A02 = bxl7;
        BXL bxl8 = new BXL("DATE", 7);
        A06 = bxl8;
        BXL bxl9 = new BXL("CAP_WORDS", 8);
        A05 = bxl9;
        BXL bxl10 = new BXL("CAP_SENTENCES", 9);
        A04 = bxl10;
        BXL bxl11 = new BXL("CAP_LETTERS", 10);
        A03 = bxl11;
        BXL bxl12 = new BXL("TEXT_NO_SUGGESTIONS", 11);
        A0D = bxl12;
        BXL[] bxlArr = {bxl, bxl2, bxl3, bxl4, bxl5, bxl6, bxl7, bxl8, bxl9, bxl10, bxl11, bxl12};
        A01 = bxlArr;
        A00 = AbstractC12190kN.A00(bxlArr);
    }

    public static BXL valueOf(String str) {
        return (BXL) Enum.valueOf(BXL.class, str);
    }

    public static BXL[] values() {
        return (BXL[]) A01.clone();
    }

    public final int A00() {
        switch (ordinal()) {
            case 0:
                return 131073;
            case 1:
                return 2;
            case 2:
                return 33;
            case 3:
                return 3;
            case 4:
                return 129;
            case 5:
                return 18;
            case 6:
                return ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED;
            case 7:
                return 20;
            case 8:
                return 139265;
            case 9:
                return 180225;
            case 10:
                return 135169;
            case 11:
                return 655361;
            default:
                throw B4Z.A00();
        }
    }

    public BXL(String str, int i) {
    }
}
