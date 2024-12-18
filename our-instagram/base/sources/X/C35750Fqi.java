package X;

import android.widget.RadioGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fqi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35750Fqi implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C29W A01;
    public final /* synthetic */ C33200Ekn A02;
    public final /* synthetic */ List A03;

    public C35750Fqi(C29W c29w, C33200Ekn c33200Ekn, List list, long j) {
        this.A03 = list;
        this.A00 = j;
        this.A01 = c29w;
        this.A02 = c33200Ekn;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        long j;
        String str = ((C35124FeR) this.A03.get(i)).A02;
        if (!C14360o3.A0K(str, "off")) {
            C14360o3.A0A(str);
            j = Integer.parseInt(str);
        } else {
            j = 0;
        }
        long j2 = j * this.A00;
        long A00 = C461529z.A00();
        C29W c29w = this.A01;
        long A002 = c29w.A00();
        C33200Ekn c33200Ekn = this.A02;
        c29w.A02(c33200Ekn, j2);
        InterfaceC09390do interfaceC09390do = c33200Ekn.A01;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        EnumC33408Epf enumC33408Epf = EnumC33408Epf.A04;
        C461329x.A06(A0r, enumC33408Epf, "daily_limit", A00, A002, AbstractC31174DnI.A07(AbstractC166987dD.A0r(interfaceC09390do)));
        if (j2 <= 0) {
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            C461329x.A02(A0r2, enumC33408Epf, C05F.A15, Long.valueOf(A002), Long.valueOf(A00), Long.valueOf(AbstractC31176DnK.A03(C455127l.A03(AbstractC166987dD.A0r(interfaceC09390do)), A0r2)), "daily_limit", null);
        }
    }
}
