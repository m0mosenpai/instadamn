package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C7d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27400C7d {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC27400C7d[] A03;
    public static final EnumC27400C7d A04;
    public static final EnumC27400C7d A05;
    public static final EnumC27400C7d A06;
    public static final EnumC27400C7d A07;
    public final int A00;
    public final InterfaceC16620sF A01;

    public static EnumC27400C7d valueOf(String str) {
        return (EnumC27400C7d) Enum.valueOf(EnumC27400C7d.class, str);
    }

    public static EnumC27400C7d[] values() {
        return (EnumC27400C7d[]) A03.clone();
    }

    static {
        EnumC27400C7d enumC27400C7d = new EnumC27400C7d("AppInstallCount", C30473DbI.A00, 0, R.drawable.instagram_download_pano_filled_24);
        A04 = enumC27400C7d;
        EnumC27400C7d enumC27400C7d2 = new EnumC27400C7d("AppRatingsAndReviews", C30474DbJ.A00, 1, R.drawable.instagram_star_pano_filled_24);
        A05 = enumC27400C7d2;
        EnumC27400C7d enumC27400C7d3 = new EnumC27400C7d("BusinessCategory", C30475DbK.A00, 2, R.drawable.instagram_business_pano_filled_24);
        A06 = enumC27400C7d3;
        EnumC27400C7d enumC27400C7d4 = new EnumC27400C7d("BusinessRatingsAndReviews", C30476DbL.A00, 3, R.drawable.instagram_star_pano_filled_24);
        A07 = enumC27400C7d4;
        EnumC27400C7d[] enumC27400C7dArr = {enumC27400C7d, enumC27400C7d2, enumC27400C7d3, enumC27400C7d4};
        A03 = enumC27400C7dArr;
        A02 = AbstractC12190kN.A00(enumC27400C7dArr);
    }

    public EnumC27400C7d(String str, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        this.A00 = i2;
        this.A01 = interfaceC16620sF;
    }
}
