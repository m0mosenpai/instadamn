package X;

/* loaded from: classes7.dex */
public abstract class I61 {
    public static final String A00(InterfaceC57989PnZ interfaceC57989PnZ, Integer num) {
        String str;
        AbstractC167017dG.A1N(interfaceC57989PnZ, num);
        String BOw = interfaceC57989PnZ.BOw();
        switch (num.intValue()) {
            case 0:
                str = "boolean_setting";
                break;
            case 1:
                str = "single_selection_enum_setting";
                break;
            case 2:
                str = "sleep_mode_custom_setting";
                break;
            case 3:
                str = "your_account_header_custom_setting";
                break;
            case 4:
                str = "banner_request_pending";
                break;
            default:
                str = "banner_request_pending_undo_click";
                break;
        }
        return AnonymousClass001.A0T(BOw, str, '_');
    }
}
