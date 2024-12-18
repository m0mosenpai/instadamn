package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Aeo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23715Aeo implements InterfaceC43071ya {
    public final /* synthetic */ C7S8 A00;
    public final /* synthetic */ HashMap A01;

    public C23715Aeo(C7S8 c7s8, HashMap hashMap) {
        this.A01 = hashMap;
        this.A00 = c7s8;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0 && intValue != 1) {
            ((C51688MsJ) c59062n7.A04).A00 = false;
            return;
        }
        C51688MsJ c51688MsJ = (C51688MsJ) c59062n7.A04;
        if (c51688MsJ.A00) {
            return;
        }
        c51688MsJ.A00 = true;
        HashMap hashMap = this.A01;
        Iterator A0l = AbstractC167007dF.A0l(hashMap);
        while (A0l.hasNext()) {
            String str = (String) AbstractC166997dE.A0l(A0l);
            UserSession userSession = this.A00.A02;
            String str2 = (String) hashMap.get(str);
            if (str != null) {
                WearablesAppAttributionType wearablesAppAttributionType = null;
                if (str2 != null) {
                    if (str2.equals("Hammerhead")) {
                        wearablesAppAttributionType = WearablesAppAttributionType.A05;
                    } else if (str2.equals("Stella")) {
                        wearablesAppAttributionType = WearablesAppAttributionType.A0A;
                    }
                }
                CZH.A01(C8i.ATTRIBUTE_IMPRESSION, wearablesAppAttributionType, userSession, str, "igd_message");
            }
        }
    }
}
