package X;

import com.facebook.react.modules.toast.ToastModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61135Rfp {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61135Rfp[] A01;
    public static final EnumC61135Rfp A02;
    public static final EnumC61135Rfp A03;
    public static final EnumC61135Rfp A04;
    public static final EnumC61135Rfp A05;
    public static final EnumC61135Rfp A06;
    public static final EnumC61135Rfp A07;

    public static EnumC61135Rfp valueOf(String str) {
        return (EnumC61135Rfp) Enum.valueOf(EnumC61135Rfp.class, str);
    }

    public static EnumC61135Rfp[] values() {
        return (EnumC61135Rfp[]) A01.clone();
    }

    static {
        EnumC61135Rfp enumC61135Rfp = new EnumC61135Rfp("BOOL", 0);
        A02 = enumC61135Rfp;
        EnumC61135Rfp enumC61135Rfp2 = new EnumC61135Rfp("INT", 1);
        A04 = enumC61135Rfp2;
        EnumC61135Rfp enumC61135Rfp3 = new EnumC61135Rfp("DOUBLE", 2);
        A03 = enumC61135Rfp3;
        EnumC61135Rfp enumC61135Rfp4 = new EnumC61135Rfp("STRING", 3);
        A07 = enumC61135Rfp4;
        EnumC61135Rfp enumC61135Rfp5 = new EnumC61135Rfp("MAP", 4);
        A06 = enumC61135Rfp5;
        EnumC61135Rfp enumC61135Rfp6 = new EnumC61135Rfp(ToastModule.DURATION_LONG_KEY, 5);
        A05 = enumC61135Rfp6;
        EnumC61135Rfp[] enumC61135RfpArr = {enumC61135Rfp, enumC61135Rfp2, enumC61135Rfp3, enumC61135Rfp4, enumC61135Rfp5, enumC61135Rfp6};
        A01 = enumC61135RfpArr;
        A00 = AbstractC12190kN.A00(enumC61135RfpArr);
    }

    public EnumC61135Rfp(String str, int i) {
    }
}
