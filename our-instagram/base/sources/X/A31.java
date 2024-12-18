package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class A31 {
    public static final boolean A00(C47Z c47z) {
        C38321qM c38321qM;
        C41743IeH c41743IeH;
        HashMap hashMap;
        HashSet A0j = AbstractC167007dF.A0j("standalone_fundraiser_sticker_id", "multiple_avatar_standalone_sticker_id");
        Iterator it = c47z.A4b.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                return (c47z.A2x != null || (c38321qM = c47z.A1C) == null || c38321qM.A34() == null) ? false : true;
            }
            C84823qW c84823qW = (C84823qW) it.next();
            C41743IeH c41743IeH2 = c84823qW.A1G;
            if (c41743IeH2 != null) {
                str = c41743IeH2.A09;
            }
            if (AbstractC001800i.A0u(A0j, str) && (c41743IeH = c84823qW.A1G) != null && (hashMap = c41743IeH.A0C) != null && hashMap.get(MSV.A00(112)) != null) {
                return true;
            }
        }
    }
}
