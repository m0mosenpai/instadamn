package X;

import android.text.TextUtils;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import java.util.List;

/* renamed from: X.G5s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36443G5s implements YP3 {
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final EnumC50680MYy A05;
    public final DirectShareTargetLoggingInfo A06;
    public final InterfaceC83713oG A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;

    public static C59062n7 A00(InterfaceC43071ya interfaceC43071ya, C36443G5s c36443G5s) {
        C59072n8 A00 = C59062n7.A00(c36443G5s, null, c36443G5s.A0A);
        A00.A00(interfaceC43071ya);
        return A00.A01();
    }

    @Override // X.YP3
    public final String BKg(String str) {
        return AnonymousClass001.A06(this.A03, this.A00, this.A09, str);
    }

    @Override // X.YP3
    public final /* bridge */ /* synthetic */ Object FBH(String str) {
        if (TextUtils.equals(this.A00, str)) {
            return this;
        }
        String str2 = this.A09;
        InterfaceC83713oG interfaceC83713oG = this.A07;
        List list = this.A0E;
        boolean z = this.A0F;
        boolean z2 = this.A0G;
        int i = this.A01;
        int i2 = this.A02;
        int i3 = this.A04;
        int i4 = this.A03;
        Integer num = this.A08;
        String str3 = this.A0C;
        String str4 = this.A0B;
        return new C36443G5s(this.A05, this.A06, interfaceC83713oG, num, str2, str, str3, str4, this.A0D, list, i, i2, i3, i4, z, z2);
    }

    public C36443G5s(EnumC50680MYy enumC50680MYy, DirectShareTargetLoggingInfo directShareTargetLoggingInfo, InterfaceC83713oG interfaceC83713oG, Integer num, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A09 = str;
        this.A07 = interfaceC83713oG;
        this.A0F = z;
        this.A0G = z2;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A08 = num;
        this.A00 = str2;
        this.A0C = str3;
        this.A0B = str4;
        this.A0E = list;
        this.A0A = BKg(str3);
        this.A06 = directShareTargetLoggingInfo;
        this.A05 = enumC50680MYy;
        this.A0D = str5;
    }
}
