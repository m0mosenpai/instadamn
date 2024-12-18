package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hv9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40363Hv9 {
    public static Map A00(InterfaceC43562JLw interfaceC43562JLw) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43562JLw.Avp() != null) {
            A1I.put(DatePickerDialogModule.ARG_DATE, interfaceC43562JLw.Avp());
        }
        C38321qM Bhs = interfaceC43562JLw.Bhs();
        if (Bhs != null) {
            A1I.put("profile_pic_media_dict", Bhs.A1D());
        }
        List BjA = interfaceC43562JLw.BjA();
        if (BjA != null) {
            ArrayList A0q = AbstractC167017dG.A0q(BjA);
            Iterator it = BjA.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1S(A0q, it);
            }
            A1I.put("published_media_dicts", A0q);
        }
        if (interfaceC43562JLw.getUsername() != null) {
            A1I.put(AbstractC50531MSk.A00(), interfaceC43562JLw.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
