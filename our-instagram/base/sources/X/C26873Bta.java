package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;

/* renamed from: X.Bta, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26873Bta extends C53Z {
    public static final String __redex_internal_original_name = "InformationFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public C26873Bta() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = DH6.A01(this, "creator_ai_entry_point_extra", enumC09460dv, 44);
        this.A00 = DH6.A01(this, "creator_ai_creator_fbid", enumC09460dv, 45);
        this.A02 = AbstractC25235BEs.A0s(EnumC27380C6j.A03, this, "creator_ai_initial_information_tab", enumC09460dv, 45);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_ai_information_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5Hb A04;
        C26205BiV c26205BiV;
        int A02 = C0f9.A02(-1444265097);
        int i = 0;
        if (C18U.A06(C06090Tz.A05, getSession(), 36322929266207485L)) {
            A04 = AbstractC133095zb.A04(new C26205BiV(EnumC27380C6j.A02, 2131957132), new C26204BiU());
        } else {
            A04 = AbstractC133095zb.A04(new C26205BiV(EnumC27380C6j.A03, 2131957088), new C26205BiV(EnumC27380C6j.A05, 2131957121));
        }
        Iterator it = A04.iterator();
        int i2 = 0;
        while (true) {
            EnumC27380C6j enumC27380C6j = null;
            if (it.hasNext()) {
                InterfaceC30942Diw interfaceC30942Diw = (InterfaceC30942Diw) it.next();
                if ((interfaceC30942Diw instanceof C26205BiV) && (c26205BiV = (C26205BiV) interfaceC30942Diw) != null) {
                    enumC27380C6j = c26205BiV.A00;
                }
                if (enumC27380C6j == this.A02.getValue()) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        int intValue = Integer.valueOf(i2).intValue();
        if (intValue != -1) {
            i = intValue;
        }
        ComposeView A01 = AbstractC25319BIo.A01(this, C5UA.A04(C30509Dbs.A01(this, A04, new BP5(getSession(), AbstractC25225BEi.A15(this.A01)), i, 31), 1870842010, true));
        C0f9.A09(611103647, A02);
        return A01;
    }
}
