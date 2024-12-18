package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207309Fj extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207309Fj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z, boolean z2) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A06 = z;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A04 = obj5;
        this.A07 = z2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            FragmentActivity fragmentActivity = (FragmentActivity) this.A03;
            Context context = (Context) this.A01;
            boolean z = this.A06;
            InterfaceC60442pS interfaceC60442pS = ((AnonymousClass398) this.A05).A04;
            InterfaceC686036x interfaceC686036x = (InterfaceC686036x) this.A02;
            InterfaceC76043b9 BS4 = interfaceC686036x.BS4();
            return new C85993sW(context, fragmentActivity, interfaceC60442pS, (UserSession) this.A04, BS4, interfaceC686036x.Br6(), z, this.A07);
        }
        FragmentActivity fragmentActivity2 = (FragmentActivity) this.A04;
        Context context2 = (Context) this.A01;
        boolean z2 = this.A06;
        C33P c33p = (C33P) this.A03;
        InterfaceC686136y interfaceC686136y = (InterfaceC686136y) this.A02;
        InterfaceC677433o AmD = interfaceC686136y.AmD();
        C3VU AmF = interfaceC686136y.AmF();
        return new C3VW(context2, fragmentActivity2, (UserSession) this.A05, AmD, AmF, c33p, interfaceC686136y.Br6(), z2, this.A07);
    }
}
