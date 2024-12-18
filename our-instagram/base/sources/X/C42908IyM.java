package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IyM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42908IyM implements InterfaceC43418JGi {
    public final long A00;
    public final Fragment A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final IMI A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public C42908IyM(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
        C14360o3.A0B(fragment, 1);
        this.A01 = fragment;
        this.A03 = interfaceC60442pS;
        this.A02 = userSession;
        this.A08 = str;
        this.A06 = str4;
        this.A07 = str5;
        this.A09 = str6;
        this.A00 = j;
        this.A0A = z;
        this.A04 = new IMI(userSession, interfaceC60442pS, str, str2, str3, null);
        this.A05 = str7;
    }

    @Override // X.InterfaceC43418JGi
    public final void D2v(String str, String str2, String str3, int i, int i2) {
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1P(str2, str3);
        IMI imi = this.A04;
        String str4 = this.A06;
        Long valueOf = Long.valueOf(this.A00);
        String str5 = this.A05;
        imi.A00(valueOf, str2, str4, str5, i, i2);
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity activity = this.A01.getActivity();
        C14360o3.A0A(activity);
        c1xj.A16(activity, this.A02, Boolean.valueOf(this.A0A), valueOf, this.A03.getModuleName(), str2, this.A08, str4, this.A07, str3, null, this.A09, str5, false, false, false);
    }
}
