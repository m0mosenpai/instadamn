package X;

import android.view.View;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;

/* renamed from: X.713, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass713 {
    public View A00;
    public final View A01;
    public final RefreshableAppBarLayoutBehavior A02;
    public final C55982hj A03;
    public final AnonymousClass711 A04;

    public AnonymousClass713(View view, AnonymousClass711 anonymousClass711, RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior) {
        this.A02 = refreshableAppBarLayoutBehavior;
        this.A04 = anonymousClass711;
        this.A01 = view;
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(C55942hf.A04(70.0d, 11.0d));
        A02.A0A(new InterfaceC55932he() { // from class: X.714
            @Override // X.InterfaceC55932he
            public final void Dnj(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnl(C55982hj c55982hj) {
            }

            @Override // X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                AnonymousClass713.this.A02.A0a((int) c55982hj.A09.A00);
            }
        });
        this.A03 = A02;
    }
}
