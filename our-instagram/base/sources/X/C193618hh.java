package X;

import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193618hh implements InterfaceC13000lm {
    public final ClipsDraftLocalDataSource A00;
    public final Map A01;

    public C193618hh(ClipsDraftLocalDataSource clipsDraftLocalDataSource) {
        C14360o3.A0B(clipsDraftLocalDataSource, 1);
        this.A00 = clipsDraftLocalDataSource;
        this.A01 = new LinkedHashMap();
    }

    public final C128175qm A00(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A01;
        if (map.containsKey(str)) {
            return (C128175qm) map.get(str);
        }
        C128175qm c128175qm = (C128175qm) C2ST.A00(AnonymousClass191.A00, new C9DZ(this, str, null, 2));
        if (c128175qm != null) {
            map.put(str, c128175qm);
            return c128175qm;
        }
        return null;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }
}
