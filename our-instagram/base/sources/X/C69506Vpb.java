package X;

import java.util.HashMap;

/* renamed from: X.Vpb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69506Vpb {
    public final C25531Mh A00(C18920wW c18920wW, EnumC68189VFh enumC68189VFh, String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        if (enumC68189VFh != null) {
            hashMap.put("preference", AbstractC167007dF.A0h(AbstractC166987dD.A19(enumC68189VFh)));
        }
        if (str2 == null) {
            if (z) {
                str2 = "BPAT";
            } else {
                str2 = "FBAT";
            }
        }
        hashMap.put("token_info", str2);
        hashMap.put("has_permission", String.valueOf(z));
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "fulcrum_event"), 156);
        c25531Mh.A0k(str);
        ((AbstractC02600Aj) c25531Mh).A00.A9M("selected_values", hashMap);
        return c25531Mh;
    }
}
