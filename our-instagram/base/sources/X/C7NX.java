package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.7NX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NX implements C7NY {
    public C161917Nb A00;
    public C70167WEj A01;
    public final long A02;
    public final Context A03;
    public final C7NZ A04 = new C7NZ(this);
    public final UserSession A05;

    @Override // X.C7NY
    public final void ABo(C69062VhD c69062VhD, Integer num, String str) {
        WVB wvb;
        char c;
        C14360o3.A0B(num, 1);
        C70167WEj c70167WEj = this.A01;
        if (c70167WEj != null) {
            wvb = new WVB(c70167WEj);
        } else {
            wvb = null;
        }
        C4SS A00 = AbstractC68331VMr.A00(wvb, c69062VhD, str);
        switch (num.intValue()) {
            case 0:
                c = 0;
                break;
            case 1:
                c = 1;
                break;
            default:
                c = 2;
                break;
        }
        Integer num2 = C05F.A00(3)[c];
        C14360o3.A07(num2);
        C50627MWo c50627MWo = new C50627MWo(A00, num2);
        C70167WEj c70167WEj2 = this.A01;
        if (c70167WEj2 != null) {
            c70167WEj2.A04(c50627MWo);
        }
    }

    public final void A00() {
        C70167WEj c70167WEj = this.A01;
        if (c70167WEj != null) {
            c70167WEj.A0D[c70167WEj.A00 % 2].A08.A0F(null);
        }
    }

    public final void A01() {
        ViewGroup viewGroup;
        C70167WEj c70167WEj = this.A01;
        if (c70167WEj != null) {
            FrameLayout frameLayout = c70167WEj.A09;
            ViewParent parent = frameLayout.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        C70167WEj c70167WEj2 = this.A01;
        if (c70167WEj2 != null) {
            C7NZ c7nz = this.A04;
            C14360o3.A0B(c7nz, 0);
            c70167WEj2.A0A.remove(c7nz);
        }
        C70167WEj c70167WEj3 = this.A01;
        if (c70167WEj3 != null) {
            c70167WEj3.A03();
        }
    }

    public final void A02(ViewGroup viewGroup) {
        C70167WEj c70167WEj = this.A01;
        if (c70167WEj != null) {
            FrameLayout frameLayout = c70167WEj.A09;
            if (!C14360o3.A0K(frameLayout.getParent(), viewGroup)) {
                viewGroup.addView(frameLayout);
                C70167WEj.A01(c70167WEj, c70167WEj.A00 % 2);
            }
        }
        C70167WEj c70167WEj2 = this.A01;
        if (c70167WEj2 != null) {
            c70167WEj2.A0D[c70167WEj2.A00 % 2].A00();
        }
    }

    @Override // X.C7NY
    public final C51593Mql BHW() {
        long A09;
        int size;
        C70167WEj c70167WEj = this.A01;
        if (c70167WEj == null) {
            A09 = -1;
            size = -1;
        } else {
            A09 = c70167WEj.A0D[c70167WEj.A00 % 2].A08.A09() - c70167WEj.A0D[c70167WEj.A00 % 2].A08.A08();
            size = c70167WEj.A0B.size();
        }
        return new C51593Mql(size, A09, 0);
    }

    @Override // X.C7NY
    public final void E5K(C69062VhD c69062VhD) {
        String str = c69062VhD.A02;
        C41711wL A01 = C41711wL.A01(this.A05);
        C14360o3.A07(A01);
        C101644hZ c101644hZ = new C101644hZ(C05F.A00, str);
        String str2 = c69062VhD.A00;
        if (str2.length() <= 0) {
            str2 = c69062VhD.A01;
            if (str2.length() == 0) {
                str2 = "";
            }
        }
        c101644hZ.A0B = str2;
        A01.A0E(new C4AD(c101644hZ.A00(), "IgAiAgentVideoPlayer"));
    }

    public C7NX(Context context, UserSession userSession, long j) {
        this.A03 = context;
        this.A05 = userSession;
        this.A02 = j;
    }
}
