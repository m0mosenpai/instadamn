package X;

import android.content.Context;
import android.content.pm.ShortcutManager;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class RcD extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcD(Context context, String str) {
        super(2117970647, 3, false, false);
        this.A00 = context;
        this.A01 = str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.56I] */
    @Override // java.lang.Runnable
    public final void run() {
        Context applicationContext = this.A00.getApplicationContext();
        String str = this.A01;
        List<String> A1J = AbstractC166987dD.A1J(str);
        ((ShortcutManager) applicationContext.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(A1J);
        AbstractC61577Rq1 A00 = C58494PwM.A00(applicationContext);
        if (A00 instanceof ShortcutInfoCompatSaverImpl) {
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) A00;
            ArrayList A1F = AbstractC166987dD.A1F(A1J);
            shortcutInfoCompatSaverImpl.A05.submit(new RunnableC58498PwR(new Object(), shortcutInfoCompatSaverImpl, A1F));
        }
        Iterator it = C58494PwM.A02(applicationContext).iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onShortcutRemoved");
        }
        JZM.A02.remove(str);
    }
}
