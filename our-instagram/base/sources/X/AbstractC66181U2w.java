package X;

/* renamed from: X.U2w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66181U2w {
    public static final void A01(C18920wW c18920wW, String str, String str2, String str3, String str4) {
        AbstractC167007dF.A1E(c18920wW, 0, str3);
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_meta_ai_entrypoint_tapped");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", str2);
            A00.AAP("query_text", str3);
            A00.AAP("nav_chain", str);
            A00.AAP("serp_session_id", str4);
            A00.Cht();
        }
    }

    public static final void A00(C18920wW c18920wW, String str, String str2, String str3, String str4) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_meta_ai_entrypoint_impression");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", str2);
            A00.AAP("query_text", str3);
            A00.AAP("nav_chain", str);
            A00.AAP("serp_session_id", str4);
            A00.Cht();
        }
    }

    public static final void A02(C18920wW c18920wW, String str, String str2, String str3, String str4, long j, long j2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_search_meta_ai_bottomsheet_open_succeed");
        if (A00.isSampled()) {
            A00.AAP("entrypoint", str2);
            A00.AAP("nav_chain", str);
            A00.AAP("search_session_id", str3);
            A00.AAP("query_text", str4);
            A00.A9K(AbstractC111324zv.A00(4089), Long.valueOf(j));
            A00.A9K("bottomsheet_launched_timestamp", Long.valueOf(j2));
            A00.Cht();
        }
    }

    public static final void A03(C18920wW c18920wW, String str, String str2, String str3, String str4, long j, long j2) {
        String str5;
        AbstractC167017dG.A1N(c18920wW, str);
        switch (str2.hashCode()) {
            case -1678116978:
                if (!str2.equals("core_search_serp_meta_ai_icon")) {
                    return;
                }
                str5 = "ig_search_serp_donut";
                break;
            case -1288313125:
                if (!str2.equals(AbstractC111324zv.A00(2192))) {
                    return;
                }
                str5 = "ig_search_nullstate_airplane_send";
                break;
            case -798508124:
                if (!str2.equals(AbstractC111324zv.A00(2331))) {
                    return;
                }
                str5 = "ig_search_qp_explore_meta_ai_bottom_sheet_qp_primary_button";
                break;
            case 390440423:
                if (!str2.equals(AbstractC111324zv.A00(852))) {
                    return;
                }
                str5 = "ig_search_nullstate_recent";
                break;
            case 414604585:
                if (!str2.equals(AbstractC111324zv.A00(2191))) {
                    return;
                }
                str5 = "ig_search_nullstate_cloud";
                break;
            case 493490245:
                if (!str2.equals(AbstractC111324zv.A00(2196))) {
                    return;
                }
                str5 = "ig_search_typeahead_donut";
                break;
            case 1035397145:
                if (!str2.equals(AbstractC111324zv.A00(2332))) {
                    return;
                }
                str5 = "ig_search_qp_explore_meta_ai_bottom_sheet_qp_suggestion";
                break;
            case 1098362142:
                if (!str2.equals(AbstractC111324zv.A00(2195))) {
                    return;
                }
                str5 = "ig_search_typeahead_airplane_send";
                break;
            case 1169646015:
                if (!str2.equals(AbstractC111324zv.A00(2194))) {
                    return;
                }
                str5 = "ig_search_typeahead_keyboard_send";
                break;
            case 1713156226:
                if (!str2.equals(AbstractC111324zv.A00(2193))) {
                    return;
                }
                str5 = "ig_search_nullstate_donut";
                break;
            case 2095642643:
                if (!str2.equals(AbstractC111324zv.A00(2197))) {
                    return;
                }
                str5 = "ig_search_typeahead_suggestion";
                break;
            default:
                return;
        }
        A02(c18920wW, str, str5, str3, str4, j, j2);
    }
}
