package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.2u5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63272u5 {
    public final FragmentActivity A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final C63262u4 A03;
    public final C63252u3 A04;
    public final String A05;

    public C63272u5(FragmentActivity fragmentActivity, C18920wW c18920wW, UserSession userSession, C63262u4 c63262u4, C63252u3 c63252u3, String str) {
        C14360o3.A0B(c63262u4, 4);
        C14360o3.A0B(str, 5);
        this.A00 = fragmentActivity;
        this.A04 = c63252u3;
        this.A01 = c18920wW;
        this.A03 = c63262u4;
        this.A05 = str;
        this.A02 = userSession;
    }

    public final void A00(Integer num) {
        int i;
        String A00;
        int intValue = num.intValue();
        if (intValue == 7) {
            AbstractC23111AHa.A01(this.A00, this.A02);
            return;
        }
        C63252u3 c63252u3 = this.A04;
        switch (intValue) {
            case 2:
                i = 3630;
                A00 = AbstractC111324zv.A00(i);
                break;
            case 3:
                i = 3626;
                A00 = AbstractC111324zv.A00(i);
                break;
            case 4:
                i = 3645;
                A00 = AbstractC111324zv.A00(i);
                break;
            case 5:
                i = 3625;
                A00 = AbstractC111324zv.A00(i);
                break;
            case 6:
                i = 3784;
                A00 = AbstractC111324zv.A00(i);
                break;
            default:
                A00 = "";
                break;
        }
        String string = this.A00.getString(C3Z6.A00(num));
        C14360o3.A07(string);
        String A01 = C3Z6.A01(num);
        c63252u3.A00(A00, string, A01, C1EP.A00(), C3Z6.A02(num), null, null);
        C18920wW c18920wW = this.A01;
        String str = this.A05;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_feed_picker_selection");
        if (!A002.isSampled()) {
            return;
        }
        A002.AAP("module", str);
        A002.AAP("detail", A01);
        A002.Cht();
    }
}
