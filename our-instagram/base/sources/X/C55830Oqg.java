package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Oqg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55830Oqg implements YOz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C55830Oqg(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.YOz
    public final void onFailure() {
        if (this.A00 != 0) {
            C9GR.A0F(AbstractC31172DnG.A07(this.A01), "unarchive_highlight_failed", 2131963586);
        } else {
            AbstractC50558MTp.A07((FragmentActivity) this.A01);
        }
    }

    @Override // X.YOz
    public final void onSuccess() {
        String str;
        int i = this.A00;
        Object obj = this.A03;
        if (i != 0) {
            C145176gc c145176gc = (C145176gc) obj;
            UserSession userSession = c145176gc.A09;
            if (userSession == null) {
                str = "userSession";
            } else {
                AbstractC25651Mw.A00(userSession).E4s(new C55997OtU((Reel) this.A02));
                c145176gc.A18.CqT();
                C9GR.A07(AbstractC31172DnG.A07(this.A01), 2131963589);
                return;
            }
        } else {
            C145176gc c145176gc2 = (C145176gc) obj;
            UserSession userSession2 = c145176gc2.A09;
            str = "userSession";
            if (userSession2 != null) {
                C25671My A00 = AbstractC25651Mw.A00(userSession2);
                Reel reel = (Reel) this.A02;
                A00.E4s(new C155116y0(reel));
                UserSession userSession3 = c145176gc2.A09;
                if (userSession3 != null) {
                    AbstractC25651Mw.A00(userSession3).E4s(new C155126y1(reel));
                    c145176gc2.A18.CqT();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
