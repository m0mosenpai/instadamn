package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.Uwx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67730Uwx extends SNK {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.SNK
    public final Fragment A01(Bundle bundle, String str) {
        Fragment c67721Uwn;
        switch (AbstractC25235BEs.A07(str)) {
            case -2046736275:
                if (str.equals("see_item_details_fragment")) {
                    c67721Uwn = new C67721Uwn();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb);
            case -1704634412:
                if (str.equals("content_confirmation_fragment")) {
                    c67721Uwn = new AbstractC66388UEw();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb2.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb2);
            case -1168057020:
                if (str.equals("content_nux_fragment")) {
                    c67721Uwn = new C67726Uws();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb22 = new StringBuilder();
                sb22.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb22.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb22);
            case -1133036289:
                if (str.equals("web_view_fragment")) {
                    c67721Uwn = new C58761Q7q();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb222 = new StringBuilder();
                sb222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb222);
            case -291842573:
                if (str.equals("loading_fragment")) {
                    c67721Uwn = new AbstractC66388UEw();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb2222 = new StringBuilder();
                sb2222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb2222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb2222);
            case 506456603:
                if (str.equals(AbstractC58317Pt9.A00(264))) {
                    c67721Uwn = new AbstractC66388UEw();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb22222 = new StringBuilder();
                sb22222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb22222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb22222);
            case 675913388:
                if (str.equals("terms_condition_fragment")) {
                    c67721Uwn = new UEy();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb222222 = new StringBuilder();
                sb222222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb222222);
            case 781550889:
                if (str.equals("content_selection_fragment")) {
                    if (bundle != null) {
                        c67721Uwn = new C67725Uwr();
                        c67721Uwn.setArguments(bundle);
                        if (bundle.getString("ECP_SELECTION_FRAGMENT_COMPONENT_ID") == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        return c67721Uwn;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                StringBuilder sb2222222 = new StringBuilder();
                sb2222222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb2222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb2222222);
            case 794693246:
                if (str.equals("content_bottom_sheet_fragment")) {
                    c67721Uwn = new C67727Uwt();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb22222222 = new StringBuilder();
                sb22222222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb22222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb22222222);
            case 1056651425:
                if (str.equals(AbstractC58317Pt9.A00(908))) {
                    c67721Uwn = new C58762Q7r();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb222222222 = new StringBuilder();
                sb222222222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb222222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb222222222);
            case 1140065739:
                if (str.equals("content_nux_learn_more_fragment")) {
                    c67721Uwn = new AbstractC66388UEw();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb2222222222 = new StringBuilder();
                sb2222222222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb2222222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb2222222222);
            case 1504979396:
                if (str.equals(AbstractC111324zv.A00(2001))) {
                    if (bundle != null) {
                        c67721Uwn = new C67729Uwv();
                        c67721Uwn.setArguments(bundle);
                        return c67721Uwn;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                StringBuilder sb22222222222 = new StringBuilder();
                sb22222222222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb22222222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb22222222222);
            case 1517249061:
                if (str.equals("content_form_fragment")) {
                    c67721Uwn = new C67722Uwo();
                    c67721Uwn.setArguments(bundle);
                    return c67721Uwn;
                }
                StringBuilder sb222222222222 = new StringBuilder();
                sb222222222222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb222222222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb222222222222);
            case 1606386969:
                if (str.equals("blank_bottom_sheet_fragment")) {
                    if (bundle != null) {
                        c67721Uwn = new C67752UxP();
                        c67721Uwn.setArguments(bundle);
                        return c67721Uwn;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                StringBuilder sb2222222222222 = new StringBuilder();
                sb2222222222222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb2222222222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb2222222222222);
            default:
                StringBuilder sb22222222222222 = new StringBuilder();
                sb22222222222222.append("{ECPFragmentFactory} Fragment is not found for identifier => ");
                sb22222222222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, AbstractC58317Pt9.A00(414), sb22222222222222);
        }
    }
}
