package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C7i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27405C7i {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC27405C7i[] A05;
    public static final EnumC27405C7i A06;
    public static final EnumC27405C7i A07;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public static EnumC27405C7i valueOf(String str) {
        return (EnumC27405C7i) Enum.valueOf(EnumC27405C7i.class, str);
    }

    public static EnumC27405C7i[] values() {
        return (EnumC27405C7i[]) A05.clone();
    }

    static {
        long j = C1132359l.A01;
        EnumC27405C7i enumC27405C7i = new EnumC27405C7i("Interested", 4278730526L << 32, 0, R.drawable.instagram_check_pano_filled_16, 2131964598, 4293393647L << 32);
        A06 = enumC27405C7i;
        EnumC27405C7i enumC27405C7i2 = new EnumC27405C7i("NotInterested", 4283760650L << 32, 1, R.drawable.instagram_x_pano_outline_16, 2131968678, 4294961387L << 32);
        A07 = enumC27405C7i2;
        EnumC27405C7i[] enumC27405C7iArr = {enumC27405C7i, enumC27405C7i2};
        A05 = enumC27405C7iArr;
        A04 = AbstractC12190kN.A00(enumC27405C7iArr);
    }

    public EnumC27405C7i(String str, long j, int i, int i2, int i3, long j2) {
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
        this.A02 = j2;
    }
}
