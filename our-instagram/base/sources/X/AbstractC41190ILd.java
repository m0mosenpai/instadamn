package X;

import android.location.Location;
import java.util.List;

/* renamed from: X.ILd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41190ILd {
    public final String A00;
    public final String A01;
    public final InterfaceC16660sJ A02;

    public final C41171IKk A00(Location location, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i) {
        return new C41171IKk(location, str, this.A01, str2, this.A00, str3, str4, str5, str6, str7, str8, list, this.A02, i, AbstractC25229BEm.A1Z(str3));
    }

    public AbstractC41190ILd(String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = interfaceC16660sJ;
    }
}
