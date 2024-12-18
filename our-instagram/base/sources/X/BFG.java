package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFG {
    public static Map A00(InterfaceC84443pn interfaceC84443pn) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC84443pn.AqH() != null) {
            linkedHashMap.put("confirmation_body", interfaceC84443pn.AqH());
        }
        if (interfaceC84443pn.AqI() != null) {
            linkedHashMap.put("confirmation_icon", interfaceC84443pn.AqI());
        }
        String str4 = null;
        if (interfaceC84443pn.AqJ() != null) {
            ConfirmationStyle AqJ = interfaceC84443pn.AqJ();
            if (AqJ != null) {
                str3 = AqJ.A00;
            } else {
                str3 = null;
            }
            linkedHashMap.put("confirmation_style", str3);
        }
        if (interfaceC84443pn.AqK() != null) {
            linkedHashMap.put("confirmation_title", interfaceC84443pn.AqK());
        }
        if (interfaceC84443pn.AqL() != null) {
            ConfirmationTitleStyle AqL = interfaceC84443pn.AqL();
            if (AqL != null) {
                str2 = AqL.A00;
            } else {
                str2 = null;
            }
            linkedHashMap.put("confirmation_title_style", str2);
        }
        if (interfaceC84443pn.B1m() != null) {
            linkedHashMap.put("enable_word_wrapping", interfaceC84443pn.B1m());
        }
        if (interfaceC84443pn.B7a() != null) {
            List<InterfaceC88183wS> B7a = interfaceC84443pn.B7a();
            if (B7a != null) {
                arrayList = new ArrayList();
                for (InterfaceC88183wS interfaceC88183wS : B7a) {
                    if (interfaceC88183wS != null) {
                        arrayList.add(interfaceC88183wS.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("followup_options", arrayList);
        }
        if (interfaceC84443pn.B7b() != null) {
            InterfaceC88383wt B7b = interfaceC84443pn.B7b();
            if (B7b != null) {
                treeUpdaterJNI = B7b.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("followup_options_set", treeUpdaterJNI);
        }
        if (interfaceC84443pn.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, interfaceC84443pn.getTitle());
        }
        if (interfaceC84443pn.C92() != null) {
            MediaOptionStyle C92 = interfaceC84443pn.C92();
            if (C92 != null) {
                str = C92.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("title_style", str);
        }
        if (interfaceC84443pn.CCV() != null) {
            UndoStyle CCV = interfaceC84443pn.CCV();
            if (CCV != null) {
                str4 = CCV.A00;
            }
            linkedHashMap.put("undo_style", str4);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
