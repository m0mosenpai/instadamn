package X;

import android.content.Context;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* renamed from: X.WSt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70365WSt implements InterfaceC71880X8n {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PreferenceScreen A01;
    public final /* synthetic */ W4F A02;
    public final /* synthetic */ InterfaceC55722hD A03;

    public C70365WSt(Context context, PreferenceScreen preferenceScreen, W4F w4f, InterfaceC55722hD interfaceC55722hD) {
        this.A03 = interfaceC55722hD;
        this.A00 = context;
        this.A02 = w4f;
        this.A01 = preferenceScreen;
    }

    @Override // X.InterfaceC71880X8n
    public final boolean DaD(Preference preference) {
        InterfaceC55722hD interfaceC55722hD = this.A03;
        Context context = this.A00;
        Toast.makeText(context, "Reset Force Modes", 1).show();
        this.A02.A01(context, this.A01, interfaceC55722hD);
        return true;
    }
}
