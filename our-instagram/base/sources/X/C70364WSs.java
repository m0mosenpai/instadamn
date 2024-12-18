package X;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;

/* renamed from: X.WSs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70364WSs implements InterfaceC71880X8n {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70364WSs(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC71880X8n
    public final boolean DaD(Preference preference) {
        switch (this.A00) {
            case 0:
                ((PreferenceGroup) this.A02).A00 = Integer.MAX_VALUE;
                C66426UGz c66426UGz = (C66426UGz) this.A01;
                Handler handler = c66426UGz.A02;
                Runnable runnable = c66426UGz.A03;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
                return true;
            case 1:
                IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = (IGDevToolPersistentStateHandler) ((InterfaceC55722hD) this.A02);
                String str = iGDevToolPersistentStateHandler.A01.userId;
                SharedPreferencesC19650xs sharedPreferencesC19650xs = new SharedPreferencesC19650xs((InterfaceC19630xq) iGDevToolPersistentStateHandler.A02.getValue());
                C14360o3.A0B(str, 0);
                C49G c49g = new C49G(sharedPreferencesC19650xs, str, "dummy");
                C49G.A01(c49g, C05F.A0N);
                C49G.A01(c49g, C05F.A00);
                Toast.makeText((Context) this.A01, "Delay reset", 1).show();
                return true;
            default:
                return false;
        }
    }
}
