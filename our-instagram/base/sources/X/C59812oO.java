package X;

import com.facebook.stash.core.FileStash;
import java.util.Map;

/* renamed from: X.2oO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59812oO extends C1MM {
    public final C59792oM A00;

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean remove(String str) {
        C14360o3.A0B(str, 0);
        this.A00.A00.A03(str);
        return super.A00.remove(str);
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean removeAll() {
        C1F5 c1f5 = this.A00.A00;
        C1F5.A00(c1f5);
        Map map = c1f5.A02;
        synchronized (map) {
            map.clear();
            c1f5.A00 = true;
        }
        C1F5.A01(c1f5);
        return super.A00.removeAll();
    }

    public C59812oO(FileStash fileStash, C59792oM c59792oM) {
        super(fileStash);
        this.A00 = c59792oM;
    }

    @Override // X.C1MM, com.facebook.stash.core.Stash
    public final boolean remove(String str, int i) {
        C14360o3.A0B(str, 0);
        this.A00.A00.A03(str);
        return super.A00.remove(str, i);
    }
}
