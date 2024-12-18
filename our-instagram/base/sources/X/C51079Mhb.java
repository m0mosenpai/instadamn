package X;

import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mhb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51079Mhb extends PagingSource {
    public boolean A00;
    public final int A01;
    public final O7B A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;

    public C51079Mhb(O7B o7b, UserSession userSession, String str, String str2, int i) {
        AbstractC167017dG.A1P(userSession, o7b);
        this.A03 = userSession;
        this.A02 = o7b;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = i;
    }
}
