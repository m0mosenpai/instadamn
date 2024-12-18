package X;

import android.content.Context;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.direct.appwidget.DirectWidgetConfig;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: X.TGq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64503TGq implements C0JG {
    public final /* synthetic */ DirectWidgetConfig A00;
    public final /* synthetic */ String A01;

    public C64503TGq(DirectWidgetConfig directWidgetConfig, String str) {
        this.A01 = str;
        this.A00 = directWidgetConfig;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        C14360o3.A0B(interfaceC03960Jm, 1);
        String str = this.A01;
        if (str == null) {
            DirectWidgetConfig directWidgetConfig = this.A00;
            Context baseContext = directWidgetConfig.getBaseContext();
            C14360o3.A07(baseContext);
            str = AbstractC58322PtE.A0G(baseContext, directWidgetConfig.A00).getString(AnonymousClass001.A0O("current_custom_chat_list", directWidgetConfig.A00), "");
        }
        int i = 0;
        if (str != null && str.length() != 0) {
            Gson gson = new Gson();
            Type type = new RVy().type;
            C14360o3.A07(type);
            Object A09 = gson.A09(str, type);
            C14360o3.A07(A09);
            Iterator A14 = AbstractC166997dE.A14((AbstractMap) A09);
            DirectWidgetConfig directWidgetConfig2 = this.A00;
            while (A14.hasNext()) {
                directWidgetConfig2.A05.put(Integer.valueOf(i), AbstractC166987dD.A1K(A14).getValue());
                i++;
            }
            DirectWidgetConfig.A01(directWidgetConfig2);
        }
        interfaceC03960Jm.AIn(null);
    }
}
