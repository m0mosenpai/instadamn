package X;

import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OK7 {
    public final void A01(String str, String str2, List list) {
        C52452NIw c52452NIw = (C52452NIw) this;
        AbstractC167017dG.A1N(str, list);
        c52452NIw.A01 = str;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c52452NIw.A02 = str2;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A02 = ((Venue) it.next()).A02();
            C14360o3.A07(A02);
            AbstractC31177DnL.A1R(A02, A0q);
        }
        c52452NIw.A03 = A0q;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c52452NIw.A07, "place_picker_results_loaded");
        if (A0f.isSampled()) {
            A00(A0f, c52452NIw);
            if (c52452NIw.A09) {
                String str4 = c52452NIw.A01;
                if (str4.length() != 0) {
                    str3 = str4;
                }
                A0f.AAP("query", str3);
                A0f.AAP("list_type", "TRADITIONAL");
                A0f.AAk("results_fetched", c52452NIw.A03);
                String str5 = c52452NIw.A02;
                if (str5.length() > 0) {
                    A0f.AAP("results_list_id", str5);
                }
            }
            A0f.Cht();
        }
    }

    public final void A02(String str, List list) {
        C52452NIw c52452NIw = (C52452NIw) this;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c52452NIw.A07, "place_picker_place_picked");
        if (A0f.isSampled()) {
            A00(A0f, c52452NIw);
            if (c52452NIw.A09) {
                String str2 = c52452NIw.A01;
                if (str2.length() == 0) {
                    str2 = "";
                }
                A0f.AAP("query", str2);
                A0f.AAP("list_type", "TRADITIONAL");
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A02 = ((Venue) it.next()).A02();
                    C14360o3.A07(A02);
                    AbstractC31177DnL.A1R(A02, A0q);
                }
                A0f.AAk("results_fetched", A0q);
                A0f.A9K("selected_page_id", AbstractC166997dE.A0j(str));
                String str3 = c52452NIw.A02;
                if (str3.length() > 0) {
                    A0f.AAP("results_list_id", str3);
                }
            }
            A0f.Cht();
        }
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C52452NIw c52452NIw) {
        interfaceC02590Ai.A8R(c52452NIw.A05, "surface");
        interfaceC02590Ai.AAP("place_picker_session_id", c52452NIw.A08);
        interfaceC02590Ai.A9K("milliseconds_since_start", Long.valueOf(c52452NIw.A06.now() - c52452NIw.A04));
        interfaceC02590Ai.AAP("search_type", "ig_default");
    }
}
