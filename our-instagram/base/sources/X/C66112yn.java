package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66112yn implements InterfaceC66092yl {
    public final UserSession A00;

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c0, code lost:
    
        if (r11 != null) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    @Override // X.InterfaceC66092yl
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADw(X.InterfaceC55362gb r13, X.C4NJ r14, X.C81413kB r15) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66112yn.ADw(X.2gb, X.4NJ, X.3kB):void");
    }

    @Override // X.InterfaceC66092yl
    public final View Csl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.inline_editing_megaphone, viewGroup, false);
        C14360o3.A07(inflate);
        return inflate;
    }

    @Override // X.InterfaceC66092yl
    public final /* bridge */ /* synthetic */ void AE0(C3OO c3oo, InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, Map map) {
        C81413kB c81413kB = (C81413kB) c3oo;
        C14360o3.A0B(c81413kB, 0);
        ADw(interfaceC55362gb, c4nj, c81413kB);
    }

    public C66112yn(UserSession userSession) {
        this.A00 = userSession;
    }
}
