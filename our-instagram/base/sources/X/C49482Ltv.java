package X;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Ltv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49482Ltv implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C49482Ltv(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        switch (this.A00) {
            case 0:
                AbstractC166997dE.A1Y(((C25814BbV) this.A03).A09.A07, true);
                ((TextView) this.A01).setText((SpannableStringBuilder) this.A02);
                return;
            case 1:
                KDL kdl = (KDL) this.A03;
                C45526KDr c45526KDr = (C45526KDr) kdl.A07.getValue();
                C83403nh c83403nh = (C83403nh) this.A01;
                String A0h = c83403nh.A0h();
                String str = c83403nh.A1j;
                InterfaceC09390do interfaceC09390do = kdl.A06;
                String str2 = ((DirectThreadKey) interfaceC09390do.getValue()).A00;
                if (A0h != null && str != null && str2 != null) {
                    KZB kzb = c45526KDr.A00;
                    AbstractC166987dD.A1Z(new C50116MAp(kzb, str2, A0h, str, null, 2), ((C4A7) kzb).A01);
                    AbstractC31178DnM.A1N(C41451vu.A01, (C146106i8) this.A02);
                }
                ((C7G0) kdl.A04.getValue()).A00(c83403nh, (DirectThreadKey) interfaceC09390do.getValue(), "send_now");
                return;
            case 2:
                ((C37675GiC) this.A03).DZq(MediaControlEventSourceEnum.A08, (C120985dq) this.A01, (C37644Ghd) this.A02);
                return;
            case 3:
                ((C37675GiC) this.A03).DVD(MediaControlEventSourceEnum.A08, (C120985dq) this.A01, (C37644Ghd) this.A02);
                return;
            default:
                return;
        }
    }
}
