package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FQf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34694FQf {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C1P1 A02;
    public final /* synthetic */ InterfaceC37164GZb A03;
    public final /* synthetic */ C35233FgQ A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    public C34694FQf(Activity activity, FragmentActivity fragmentActivity, C1P1 c1p1, InterfaceC37164GZb interfaceC37164GZb, C35233FgQ c35233FgQ, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = activity;
        this.A07 = z;
        this.A04 = c35233FgQ;
        this.A09 = z2;
        this.A08 = z3;
        this.A05 = str;
        this.A02 = c1p1;
        this.A01 = fragmentActivity;
        this.A0A = z4;
        this.A03 = interfaceC37164GZb;
        this.A0C = z5;
        this.A0B = z6;
        this.A06 = str2;
    }

    public final void A00(String str, boolean z, boolean z2) {
        Activity activity = this.A00;
        C35233FgQ c35233FgQ = this.A04;
        boolean z3 = this.A07;
        boolean z4 = this.A09;
        boolean z5 = this.A08;
        String str2 = this.A05;
        C1P1 c1p1 = this.A02;
        FragmentActivity fragmentActivity = this.A01;
        boolean z6 = this.A0A;
        if (AbstractC23451Ch.A04(activity, new C36166Fxg(activity, fragmentActivity, c1p1, this.A03, c35233FgQ, str, str2, this.A06, z3, z4, z5, z6, z, this.A0C, z2, this.A0B), "android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS") && !z3) {
            c35233FgQ.A03.A04(C05F.A00, str, z4);
        }
    }
}
