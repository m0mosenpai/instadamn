package X;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Owm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56179Owm implements InterfaceC60152ox {
    public InterfaceC58003Pnn A00;
    public boolean A01;
    public final Activity A02;
    public final GestureDetector A03;
    public final ViewGroup A04;
    public final C3I9 A05;
    public final C22985ABk A06;
    public final OMc A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC174767qC A0A;
    public final UserSession A0B;
    public final InterfaceC58088PpD A0C;
    public final AbstractC55102ObF A0D;

    public C56179Owm(Activity activity, ViewGroup viewGroup, InterfaceC174767qC interfaceC174767qC, UserSession userSession, C22985ABk c22985ABk, InterfaceC58088PpD interfaceC58088PpD, OMc oMc, AbstractC55102ObF abstractC55102ObF, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        AbstractC167007dF.A1G(viewGroup, 2, abstractC55102ObF);
        C14360o3.A0B(userSession, 8);
        this.A02 = activity;
        this.A04 = viewGroup;
        this.A0A = interfaceC174767qC;
        this.A07 = oMc;
        this.A0D = abstractC55102ObF;
        this.A0C = interfaceC58088PpD;
        this.A06 = c22985ABk;
        this.A0B = userSession;
        this.A09 = interfaceC16820sZ;
        this.A08 = interfaceC16820sZ2;
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A05 = A01;
        this.A03 = new GestureDetector(activity, new C51471MoI(this, 1));
        A01.A9e(this);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        this.A07.A02(i);
        InterfaceC58003Pnn interfaceC58003Pnn = this.A00;
        if (interfaceC58003Pnn != null) {
            interfaceC58003Pnn.DOK(i, z);
        }
    }
}
