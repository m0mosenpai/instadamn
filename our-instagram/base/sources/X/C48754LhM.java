package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.user.model.User;

/* renamed from: X.LhM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48754LhM implements InterfaceC50465MPt {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C4F7 A03;
    public final C47364KwD A04;

    public C48754LhM(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47364KwD c47364KwD, C4F7 c4f7) {
        AbstractC167007dF.A1F(userSession, 1, c4f7);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        this.A03 = c4f7;
        this.A04 = c47364KwD;
    }

    @Override // X.InterfaceC50465MPt
    public final void DW0(L5X l5x) {
        C49477Ltq c49477Ltq;
        C1348267y c1348267y;
        boolean z = false;
        C14360o3.A0B(l5x, 0);
        LKo lKo = LKo.A00;
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        boolean z2 = l5x.A0D;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C4F7 c4f7 = this.A03;
        C45216Jzw c45216Jzw = l5x.A05;
        if (c45216Jzw != null) {
            long j = c45216Jzw.A00;
            User user = c45216Jzw.A02;
            String id = user.getId();
            String username = user.getUsername();
            ImageUrl Bhu = user.Bhu();
            boolean z3 = c45216Jzw.A07;
            ContentNoteMetadata contentNoteMetadata = l5x.A04;
            C6C9 c6c9 = l5x.A03;
            if (c6c9 != null) {
                C67s c67s = c6c9.A0A;
                if (c67s != null && (c1348267y = c67s.A0B) != null) {
                    c49477Ltq = new C49477Ltq(LKX.A04(c6c9, c1348267y.A02, c1348267y.A03, AbstractC167017dG.A0K(c1348267y.A01)), l5x, this, new C48755LhN(fragmentActivity, interfaceC11380iw, userSession, 24, z));
                } else {
                    c49477Ltq = null;
                }
                lKo.A07(fragmentActivity, interfaceC11380iw, userSession, Bhu, contentNoteMetadata, c4f7, c49477Ltq, id, username, j, z2, z3, l5x.A0F);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f5, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fa, code lost:
    
        if (r10 != null) goto L16;
     */
    @Override // X.InterfaceC50465MPt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DW3(X.L5X r53) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48754LhM.DW3(X.L5X):void");
    }
}
