package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T3A implements InterfaceC65508Tld {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC65508Tld A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;

    @Override // X.InterfaceC65508Tld
    public final void DcO(String str) {
        try {
            Context context = this.A00;
            List list = this.A04;
            String str2 = this.A02;
            Map map = this.A06;
            List list2 = this.A05;
            AbstractC63312ShK.A02(context, this.A01, false, "SMS_OTP", "VERIFY_FACTOR", str2, null, null, this.A03, list, list2, map);
        } catch (RjM e) {
            this.A01.DcL(false, AbstractC25227BEk.A0o(), e);
        }
    }

    public T3A(Context context, InterfaceC65508Tld interfaceC65508Tld, String str, String str2, List list, List list2, Map map) {
        this.A00 = context;
        this.A04 = list;
        this.A02 = str;
        this.A06 = map;
        this.A05 = list2;
        this.A03 = str2;
        this.A01 = interfaceC65508Tld;
    }

    @Override // X.InterfaceC65508Tld
    public final void DcL(Boolean bool, Integer num, Throwable th) {
        this.A01.DcL(bool, num, th);
    }
}
