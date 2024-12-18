package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.IuE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42657IuE implements InterfaceC43585JPa {
    public final InterfaceC686136y A00;
    public final InterfaceC65282xQ A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C692539l A04;

    public C42657IuE(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, C692539l c692539l, InterfaceC65282xQ interfaceC65282xQ) {
        C14360o3.A0B(c692539l, 4);
        this.A00 = interfaceC686136y;
        this.A03 = userSession;
        this.A02 = fragment;
        this.A04 = c692539l;
        this.A01 = interfaceC65282xQ;
    }

    @Override // X.InterfaceC43585JPa
    public final void ElW(C38321qM c38321qM, JG9 jg9, C75113Zb c75113Zb, VG2 vg2, String str) {
        C14360o3.A0B(vg2, 3);
        C692539l c692539l = this.A04;
        c692539l.A02(c38321qM, vg2, new C39454Hbg(c692539l, c38321qM, null, jg9, c75113Zb), str, null);
    }

    @Override // X.AnonymousClass371
    public final InterfaceC692739n C9D() {
        return this.A00.C9D();
    }

    @Override // X.InterfaceC43585JPa
    public final void CMs(C38321qM c38321qM, C75113Zb c75113Zb, String str, String str2, int i, boolean z, boolean z2) {
        InterfaceC65282xQ interfaceC65282xQ;
        int BK6;
        int i2 = i;
        Context context = this.A02.getContext();
        if (context != null && (BK6 = (interfaceC65282xQ = this.A01).BK6(c38321qM.getId())) != -1) {
            Object EFR = interfaceC65282xQ.EFR(BK6);
            C3YS.A00(this.A03).A02(c38321qM, true);
            if (str != null && EFR != null) {
                C36525G8x c36525G8x = new C36525G8x(this, c38321qM, c75113Zb, EFR, BK6, 0);
                if (i == 0) {
                    i2 = R.drawable.instagram_eye_off_pano_outline_24;
                }
                Drawable drawable = context.getDrawable(i2);
                if (drawable != null) {
                    IQc.A00(context, drawable, c36525G8x, str, str2, null, AbstractC53242c7.A05(context), 5000, false);
                }
            }
        }
    }

    @Override // X.InterfaceC43585JPa
    public final void E2g(C38321qM c38321qM, JG9 jg9, C75113Zb c75113Zb) {
        this.A04.A01(c38321qM, jg9, c75113Zb);
    }

    @Override // X.InterfaceC43585JPa
    public final void Ekf(C38321qM c38321qM, JG9 jg9, C75113Zb c75113Zb) {
        this.A04.A00(c38321qM, jg9);
    }
}
