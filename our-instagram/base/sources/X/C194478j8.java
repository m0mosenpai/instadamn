package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8j8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194478j8 implements InterfaceC195648l5 {
    public List A00;
    public final C1810981l A01;
    public final C195448kk A02;
    public final C189058Yv A03;
    public final UserSession A04;
    public final C05A A05;

    public C194478j8(UserSession userSession, C1810981l c1810981l, C189058Yv c189058Yv) {
        C14360o3.A0B(c189058Yv, 2);
        this.A04 = userSession;
        this.A03 = c189058Yv;
        this.A01 = c1810981l;
        this.A02 = AbstractC195438kj.A00(userSession);
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        this.A00 = emptyList;
        this.A05 = c189058Yv.A0B;
    }

    @Override // X.InterfaceC195648l5
    public final Folder getCurrentFolder() {
        return this.A03.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0093 A[SYNTHETIC] */
    @Override // X.InterfaceC195648l5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getFolders() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194478j8.getFolders():java.util.List");
    }
}
