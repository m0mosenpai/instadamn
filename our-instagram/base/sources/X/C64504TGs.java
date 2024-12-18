package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import com.instagram.direct.appwidget.DirectWidgetConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.TGs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64504TGs implements C0JG {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ DirectWidgetConfig A02;
    public final /* synthetic */ String A03;

    public C64504TGs(Intent intent, Bundle bundle, DirectWidgetConfig directWidgetConfig, String str) {
        this.A00 = intent;
        this.A01 = bundle;
        this.A02 = directWidgetConfig;
        this.A03 = str;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        C14360o3.A0B(interfaceC03960Jm, 1);
        Intent intent = this.A00;
        intent.putExtras(this.A01);
        DirectWidgetConfig directWidgetConfig = this.A02;
        HashMap hashMap = directWidgetConfig.A05;
        if (!hashMap.isEmpty()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                String str = ((DirectThreadWidgetItem) AbstractC31176DnK.A0j(A14)).A02;
                if (str != null) {
                    A1E.add(str);
                }
            }
            intent.putStringArrayListExtra("current_custom_chat_list", AbstractC166987dD.A1F(A1E));
            String str2 = this.A03;
            if (str2 != null && !str2.equals(directWidgetConfig.getResources().getString(R.string.res_0x7f1300e8_name_removed))) {
                Iterator A142 = AbstractC166997dE.A14(hashMap);
                while (A142.hasNext()) {
                    DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) AbstractC31176DnK.A0j(A142);
                    if (C14360o3.A0K(directThreadWidgetItem.A05, str2)) {
                        intent.putExtra("current_custom_chat_id", directThreadWidgetItem.A02);
                    }
                }
            }
        }
        C12260kU.A08(directWidgetConfig, intent, 100);
        interfaceC03960Jm.AIn(null);
    }
}
