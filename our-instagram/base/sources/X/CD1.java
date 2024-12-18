package X;

import com.instagram.api.schemas.IGAIAgentType;

/* loaded from: classes5.dex */
public abstract class CD1 {
    public static final void A00(C5Tl c5Tl, C28370CfW c28370CfW, IGAIAgentType iGAIAgentType, EnumC39618HeS enumC39618HeS, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4) {
        int i5 = i;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        Integer num2 = num;
        String str10 = str6;
        EnumC39618HeS enumC39618HeS2 = enumC39618HeS;
        AbstractC25229BEm.A1I(c28370CfW, 0, str5);
        c5Tl.Enr(-1194604412);
        if ((i4 & 2) != 0) {
            i5 = 0;
        }
        if ((i4 & 4) != 0) {
            str7 = null;
        }
        if ((i4 & 8) != 0) {
            str8 = null;
        }
        if ((i4 & 16) != 0) {
            str9 = null;
        }
        if ((i4 & 128) != 0) {
            num2 = null;
        }
        if ((i4 & 512) != 0) {
            str10 = null;
        }
        if ((i4 & 1024) != 0) {
            enumC39618HeS2 = null;
        }
        if (C0fH.A02()) {
            C0fH.A01(-1341672889, "com.instagram.aistudio.home.view.launchedeffect.AiHomeImpressionEvent (AiHomeImpressionEvent.kt:23)");
        }
        C5UX.A04(c5Tl, C0eB.A00, new D4u(c28370CfW, iGAIAgentType, enumC39618HeS2, num2, str7, str8, str9, str4, str5, str10, (InterfaceC23621Ds) null, i5));
        if (C0fH.A02()) {
            C0fH.A00(-1851094738);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30325DXa(c28370CfW, iGAIAgentType, enumC39618HeS2, num2, str7, str8, str9, str4, str5, str10, i5, i2, i3, i4);
        }
    }
}
