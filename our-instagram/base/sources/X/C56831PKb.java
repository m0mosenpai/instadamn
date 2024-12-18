package X;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

/* renamed from: X.PKb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56831PKb implements FilenameFilter {
    public final /* synthetic */ C55097Ob8 A00;
    public final /* synthetic */ String A01;

    public C56831PKb(C55097Ob8 c55097Ob8, String str) {
        this.A00 = c55097Ob8;
        this.A01 = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C14360o3.A0B(str, 1);
        C55097Ob8 c55097Ob8 = this.A00;
        Map map = C55097Ob8.A06;
        if (!AbstractC002300n.A0h(str, c55097Ob8.A02, false) || !AbstractC002300n.A0f(str, this.A01, false)) {
            return false;
        }
        return true;
    }
}
