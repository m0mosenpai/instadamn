package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class V4U extends AbstractC65806TuP {
    public int A00;
    public Fragment A01;
    public final C6FG A02;
    public final C102884kP A03;
    public final String A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public static final void A00(V4U v4u, int i) {
        C102884kP c102884kP = v4u.A03;
        if (c102884kP.A03(31, 0) != i) {
            AnonymousClass630 A02 = AnonymousClass634.A02(v4u.A02);
            A02.A0G(new C70695WfI(c102884kP.A04), new V4X(i));
            A02.A09();
        }
    }

    public V4U(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        this.A03 = c102884kP;
        this.A02 = c6fg;
        this.A04 = "SP_SingleMediaFeedFragment";
        C17050sx A01 = AbstractC09440dt.A01(new C57239PbN(this, 3));
        this.A05 = A01;
        this.A06 = AbstractC60492pY.A02((Fragment) A01.getValue());
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }
}
