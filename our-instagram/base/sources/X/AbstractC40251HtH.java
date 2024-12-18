package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HtH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40251HtH {
    public static Map A00(InterfaceC38651qw interfaceC38651qw) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38651qw.BXo() != null) {
            A1I.put("num_of_stories", interfaceC38651qw.BXo());
        }
        if (interfaceC38651qw.By8() != null) {
            A1I.put("snapshot_date", interfaceC38651qw.By8());
        }
        if (interfaceC38651qw.By9() != null) {
            A1I.put("snapshot_date_string", interfaceC38651qw.By9());
        }
        if (interfaceC38651qw.ByA() != null) {
            A1I.put("snapshot_disclaimer", interfaceC38651qw.ByA());
        }
        if (interfaceC38651qw.ByB() != null) {
            A1I.put("snapshot_id", interfaceC38651qw.ByB());
        }
        List C0w = interfaceC38651qw.C0w();
        if (C0w != null) {
            ArrayList A0q = AbstractC167017dG.A0q(C0w);
            Iterator it = C0w.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1S(A0q, it);
            }
            A1I.put("stories", A0q);
        }
        if (interfaceC38651qw.C9i() != null) {
            A1I.put("total_accounts_reached", interfaceC38651qw.C9i());
        }
        if (interfaceC38651qw.C9s() != null) {
            A1I.put("total_impressions", interfaceC38651qw.C9s());
        }
        if (interfaceC38651qw.C9t() != null) {
            A1I.put("total_interactions", interfaceC38651qw.C9t());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
