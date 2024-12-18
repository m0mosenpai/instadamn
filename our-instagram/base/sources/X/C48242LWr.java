package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.LWr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48242LWr implements MPX {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r3.length() == 0) goto L5;
     */
    @Override // X.MPX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object AWi(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L9
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto La
        L9:
            r1 = 1
        La:
            r0 = 0
            if (r1 != 0) goto L15
            X.16L r1 = X.C16V.A00(r3)     // Catch: java.io.IOException -> L15
            X.KAw r0 = X.AbstractC46624Kk1.parseFromJson(r1)     // Catch: java.io.IOException -> L15
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48242LWr.AWi(java.lang.String):java.lang.Object");
    }

    @Override // X.MPX
    public final /* bridge */ /* synthetic */ String F7n(Object obj) {
        C45461KAw c45461KAw = (C45461KAw) obj;
        if (c45461KAw == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            if (c45461KAw.A00 != null) {
                C16V.A03(A0S, "cloud_accounts_list");
                for (L8l l8l : c45461KAw.A00) {
                    if (l8l != null) {
                        A0S.A0d();
                        String str = l8l.A01;
                        if (str != null) {
                            A0S.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                        }
                        String str2 = l8l.A02;
                        if (str2 != null) {
                            A0S.A0S(AbstractC50529MSi.A00(), str2);
                        }
                        String str3 = l8l.A00;
                        if (str3 != null) {
                            A0S.A0S("profile_pic_url", str3);
                        }
                        A0S.A0a();
                    }
                }
                A0S.A0Z();
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
