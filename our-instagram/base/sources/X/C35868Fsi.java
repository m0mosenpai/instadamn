package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.Fsi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35868Fsi implements AnonymousClass726, AnonymousClass725 {
    public final int A00;
    public final Object A01;

    public C35868Fsi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AnonymousClass726
    public final void Drs(C154306wf c154306wf) {
        EnumC33502Erb enumC33502Erb;
        WFS wfs;
        Integer num;
        TextView A0e;
        switch (this.A00) {
            case 0:
                int i = c154306wf.A01;
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    wfs = ((C69440VnP) this.A01).A0A;
                    num = C05F.A00;
                } else {
                    wfs = ((C69440VnP) this.A01).A0A;
                    num = C05F.A01;
                }
                WFS.A0A = num;
                WFS.A01(wfs);
                return;
            case 1:
                C32314ELd c32314ELd = (C32314ELd) this.A01;
                ArrayList arrayList = c32314ELd.A14;
                EnumC33414Epl enumC33414Epl = (EnumC33414Epl) AbstractC31173DnH.A0i(arrayList, c154306wf.A01);
                EnumC33414Epl enumC33414Epl2 = c32314ELd.A04;
                if (enumC33414Epl2 != null && enumC33414Epl2 == enumC33414Epl) {
                    return;
                }
                c32314ELd.A04 = enumC33414Epl;
                int i2 = c154306wf.A01;
                if (arrayList.get(i2) == EnumC33414Epl.A0A) {
                    enumC33502Erb = EnumC33502Erb.RESHARED_MEDIA;
                } else if (arrayList.get(i2) != EnumC33414Epl.A06) {
                    return;
                } else {
                    enumC33502Erb = EnumC33502Erb.SHARED_MEDIA;
                }
                C32314ELd.A05(enumC33502Erb, c32314ELd);
                return;
            default:
                KWN kwn = (KWN) this.A01;
                ((C44517JmN) kwn.A06.getValue()).A00 = c154306wf.A01;
                View view = c154306wf.A03;
                if (view != null && (A0e = AbstractC166987dD.A0e(view, R.id.reaction_count_text)) != null) {
                    AbstractC166987dD.A1O(kwn.requireContext(), A0e, AbstractC31173DnH.A04(kwn));
                    return;
                }
                return;
        }
    }

    @Override // X.AnonymousClass726
    public final void Drx(C154306wf c154306wf) {
        View view;
        TextView A0e;
        if (2 - this.A00 == 0 && (view = c154306wf.A03) != null && (A0e = AbstractC166987dD.A0e(view, R.id.reaction_count_text)) != null) {
            Fragment fragment = (Fragment) this.A01;
            AbstractC166987dD.A1O(fragment.requireContext(), A0e, AbstractC31180DnO.A01(fragment));
        }
    }
}
