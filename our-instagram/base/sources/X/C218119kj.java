package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218119kj extends ACt implements InterfaceC41501vz {
    public int A00;
    public List A01 = AbstractC166987dD.A1E();
    public boolean A02;
    public final Context A03;
    public final View A04;
    public final UserSession A05;
    public final C88Y A06;
    public final String A07;

    public static void A00(C5GJ c5gj, C218119kj c218119kj, AlC alC) {
        C88Y c88y = c218119kj.A06;
        c88y.A0A(new C220919pF(c218119kj.A03, c218119kj.A05, alC, c218119kj.A07), c5gj, C148276lx.A0f);
        if (c218119kj.A02) {
            C8TS c8ts = c88y.A00.A01;
            c8ts.A08.A0r(new C23525Abf(c8ts, false));
        }
    }

    public C218119kj(Context context, View view, UserSession userSession, C88Y c88y, String str) {
        this.A06 = c88y;
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = view;
        this.A07 = str;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        AnonymousClass891 anonymousClass891;
        int A03 = C0f9.A03(-1049480700);
        int A032 = C0f9.A03(1253385775);
        C88E c88e = this.A06.A00;
        C88M c88m = c88e.A0H;
        int intValue = Integer.valueOf(c88m.A01).intValue();
        List unmodifiableList = Collections.unmodifiableList(c88m.A08);
        C14360o3.A07(unmodifiableList);
        c88e.A00 = (C88X) unmodifiableList.get(intValue);
        c88e.A02 = false;
        if (c88e instanceof C88I) {
            anonymousClass891 = ((C88I) c88e).A01;
        } else {
            anonymousClass891 = ((C88D) c88e).A00;
        }
        anonymousClass891.A04(false);
        c88e.A0F.A01(this);
        C0f9.A0A(-1705166964, A032);
        C0f9.A0A(1354290975, A03);
    }
}
