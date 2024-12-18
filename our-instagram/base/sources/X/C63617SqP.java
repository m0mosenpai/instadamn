package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.SqP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63617SqP implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C63617SqP(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = obj2;
        this.A02 = obj4;
        this.A03 = obj;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        switch (this.A00) {
            case 0:
                C63406Sjd c63406Sjd = (C63406Sjd) obj;
                C14360o3.A0B(c63406Sjd, 0);
                EnumC68120VCd enumC68120VCd = c63406Sjd.A00;
                if (enumC68120VCd != EnumC68120VCd.SUCCESS && enumC68120VCd != EnumC68120VCd.ERROR) {
                    return;
                }
                C14510oO c14510oO = (C14510oO) this.A01;
                if (c14510oO.A00) {
                    c14510oO.A00 = false;
                    return;
                }
                AbstractC58318PtA.A1I(this, this.A02);
                ((WbK) this.A04).A00.A06 = Boolean.valueOf(C2FP.A01().A08.A07("1302814060304063", AbstractC31171DnF.A0l(), AbstractC31171DnF.A0l()));
                ((InterfaceC16820sZ) this.A03).invoke();
                return;
            case 1:
                C63406Sjd c63406Sjd2 = (C63406Sjd) obj;
                C58759Q7o c58759Q7o = (C58759Q7o) this.A01;
                c58759Q7o.A00.setVisibility(AbstractC167007dF.A05(C63406Sjd.A0H(c63406Sjd2) ? 1 : 0));
                if (C63406Sjd.A0J(c63406Sjd2)) {
                    AbstractC58318PtA.A1I(this, this.A04);
                    c58759Q7o.AVf((Bundle) this.A03, (C63152Se0) this.A02, null);
                    return;
                } else {
                    if (!C63406Sjd.A0G(c63406Sjd2)) {
                        return;
                    }
                    AbstractC58318PtA.A1I(this, this.A04);
                    c58759Q7o.AVf((Bundle) this.A03, null, c63406Sjd2.A02);
                    return;
                }
            case 2:
                String str = ((SBl) obj).A00;
                boolean equalsIgnoreCase = "LOCKED".equalsIgnoreCase(str);
                TextView textView = (TextView) this.A04;
                int i = 2131962293;
                if (equalsIgnoreCase) {
                    i = 2131962296;
                }
                textView.setText(i);
                int A01 = AbstractC31175DnJ.A01("DELETED".equalsIgnoreCase(str) ? 1 : 0);
                textView.setVisibility(A01);
                ((View) this.A03).setVisibility(A01);
                ((View) this.A02).setVisibility(A01);
                return;
            default:
                SMY smy = (SMY) this.A02;
                String str2 = smy.A03;
                Map map = ((SF6) this.A01).A00;
                Object obj2 = map.get(str2);
                if (obj2 == null) {
                    obj2 = EnumC61134Rfo.A05;
                }
                if (obj != obj2) {
                    EnumC61134Rfo enumC61134Rfo = EnumC61134Rfo.A02;
                    if (obj == enumC61134Rfo) {
                        ((List) this.A03).add(smy);
                    }
                    C14360o3.A0A(obj);
                    C14360o3.A0B(obj, 1);
                    map.put(str2, obj);
                    Collection values = map.values();
                    if (values == null || !values.isEmpty()) {
                        for (Object obj3 : values) {
                            if (obj3 != enumC61134Rfo && obj3 != EnumC61134Rfo.A06) {
                                if (obj != EnumC61134Rfo.A05 && obj != EnumC61134Rfo.A03) {
                                    return;
                                }
                                smy.A00();
                                return;
                            }
                        }
                    }
                    ((C2GT) this.A04).A0B(this.A03);
                    return;
                }
                return;
        }
    }
}
