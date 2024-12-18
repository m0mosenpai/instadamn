package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6G4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6G4 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ C6G4[] A04;
    public static final C6G4 A05;
    public static final C6G4 A06;
    public final int A00;
    public final int A01;
    public final int A02;

    public static C6G4 valueOf(String str) {
        return (C6G4) Enum.valueOf(C6G4.class, str);
    }

    public static C6G4[] values() {
        return (C6G4[]) A04.clone();
    }

    static {
        C6G4 c6g4 = new C6G4("ChevronUp", 0, R.drawable.barcelona_chevronleft_outline_24, R.drawable.barcelona_chevronright_outline_24, 2131953689);
        A05 = c6g4;
        C6G4 c6g42 = new C6G4("Up", 1, R.drawable.barcelona_outline_arrow_back_24, R.drawable.barcelona_outline_arrow_forward_24, 2131953689);
        A06 = c6g42;
        C6G4[] c6g4Arr = {c6g4, c6g42, new C6G4("Cancel", 2, R.drawable.barcelona_outline_close_24, R.drawable.barcelona_outline_close_24, 2131953688)};
        A04 = c6g4Arr;
        A03 = AbstractC12190kN.A00(c6g4Arr);
    }

    public C6G4(String str, int i, int i2, int i3, int i4) {
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
