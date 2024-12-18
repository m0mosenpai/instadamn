package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6jH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146796jH implements InterfaceC43071ya {
    public String A01;
    public String A02;
    public final UserSession A03;
    public int A00 = 1;
    public final Map A04 = new HashMap();

    public C146796jH(UserSession userSession) {
        this.A03 = userSession;
    }

    public final int A00(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 0);
        String str = c41181vS.A0k;
        C14360o3.A07(str);
        Map map = this.A04;
        if (!map.containsKey(str)) {
            C0f5 AEp = C18950wb.A01.AEp("DISPLAYED_REEL_INDEX_MISMATCH", 817903741);
            StringBuilder sb = new StringBuilder();
            sb.append("displayed_reel_index_mismatch. Could not find displayed index of (");
            sb.append(str);
            sb.append(") does not match known reels (");
            sb.append(map.keySet());
            sb.append(") which has values of ( ");
            sb.append(map.values());
            sb.append(')');
            AEp.ABW(DialogModule.KEY_MESSAGE, sb.toString());
            AEp.report();
        } else {
            Number number = (Number) map.get(str);
            if (number != null) {
                return number.intValue();
            }
        }
        return -1;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        String str2 = ((C41181vS) c59062n7.A03).A0k;
        C14360o3.A07(str2);
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        C14360o3.A07(CFq);
        if (CFq == C05F.A00 && (!AbstractC13670mt.A0G(this.A01, str2) || AbstractC13670mt.A0G(c59062n7.A05, this.A02))) {
            Map map = this.A04;
            int i = this.A00;
            this.A00 = i + 1;
            map.put(str2, Integer.valueOf(i));
            this.A01 = str2;
            str = "";
        } else if (CFq != C05F.A0C) {
            return;
        } else {
            str = c59062n7.A05;
        }
        this.A02 = str;
    }
}
