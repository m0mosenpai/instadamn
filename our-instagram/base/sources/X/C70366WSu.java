package X;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import java.util.Map;

/* renamed from: X.WSu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70366WSu implements InterfaceC71880X8n {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PreferenceScreen A01;
    public final /* synthetic */ W4F A02;
    public final /* synthetic */ InterfaceC55722hD A03;
    public final /* synthetic */ Map A04;

    public C70366WSu(Context context, PreferenceScreen preferenceScreen, W4F w4f, InterfaceC55722hD interfaceC55722hD, Map map) {
        this.A03 = interfaceC55722hD;
        this.A04 = map;
        this.A02 = w4f;
        this.A01 = preferenceScreen;
        this.A00 = context;
    }

    @Override // X.InterfaceC71880X8n
    public final boolean DaD(Preference preference) {
        IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = (IGDevToolPersistentStateHandler) this.A03;
        String str = iGDevToolPersistentStateHandler.A01.userId;
        SharedPreferencesC19650xs sharedPreferencesC19650xs = new SharedPreferencesC19650xs((InterfaceC19630xq) iGDevToolPersistentStateHandler.A02.getValue());
        C14360o3.A0B(str, 0);
        C49G c49g = new C49G(sharedPreferencesC19650xs, str, "dummy");
        for (Integer num : C05F.A00(10)) {
            C49G.A01(c49g, num);
        }
        return true;
    }
}
