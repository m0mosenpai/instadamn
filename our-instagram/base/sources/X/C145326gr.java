package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.6gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145326gr {
    public final /* synthetic */ C145176gc A00;

    public C145326gr(C145176gc c145176gc) {
        this.A00 = c145176gc;
    }

    public final void A00(C41181vS c41181vS) {
        String str;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            C145176gc c145176gc = this.A00;
            UserSession userSession = c145176gc.A09;
            if (userSession == null) {
                str = "userSession";
            } else {
                InterfaceC60442pS interfaceC60442pS = c145176gc.A16;
                EnumC39628Hem enumC39628Hem = EnumC39628Hem.OPEN_BLOKS_APP;
                enumC39628Hem.A00 = "com.instagram.misinformation.fact_check_sheet.action";
                AbstractC41647Ibf.A00(enumC39628Hem, EnumC39624Hei.OVERFLOW_MENU, c38321qM, interfaceC60442pS, userSession, C05F.A0C);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    linkedHashMap.put("media_id", A2u);
                    linkedHashMap.put("module", interfaceC60442pS.getModuleName());
                    C146026hz c146026hz = c145176gc.A0r;
                    if (c146026hz == null) {
                        str = "reelViewerBloksHelper";
                    } else {
                        c146026hz.A00(c41181vS, "com.instagram.misinformation.fact_check_sheet.action", linkedHashMap);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }
}
