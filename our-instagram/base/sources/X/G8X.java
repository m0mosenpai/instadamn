package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class G8X implements GZB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C116155Nu A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C28031Xh A03;
    public final /* synthetic */ boolean A04;

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8X(FragmentActivity fragmentActivity, C116155Nu c116155Nu, UserSession userSession, C28031Xh c28031Xh, boolean z) {
        this.A03 = c28031Xh;
        this.A04 = z;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = c116155Nu;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0063: IGET (r0 I:boolean) = (r2 I:X.G8X) (LINE:99) X.G8X.A04 boolean, block:B:35:0x0063 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.G8X] */
    @Override // X.GZB
    public final void D3J(Context context) {
        ?? r2;
        double d;
        double d2;
        double d3;
        double d4;
        try {
            if (this.A04) {
                AbstractC31254Doc.A01(this.A02, this.A00);
                return;
            }
            C116155Nu c116155Nu = this.A01;
            String str = c116155Nu.A0k;
            String str2 = c116155Nu.A0p;
            String str3 = c116155Nu.A0m;
            String str4 = c116155Nu.A0o;
            String str5 = c116155Nu.A0q;
            AbstractC27991Xd abstractC27991Xd = AbstractC27991Xd.A00;
            if (abstractC27991Xd != null) {
                C28021Xg c28021Xg = ((C27981Xc) abstractC27991Xd).A00;
                String str6 = c116155Nu.A0l;
                if (str6 != null) {
                    d3 = Double.parseDouble(str6);
                } else {
                    d3 = 0.0d;
                }
                String str7 = c116155Nu.A0n;
                if (str7 != null) {
                    d4 = Double.parseDouble(str7);
                } else {
                    d4 = 0.0d;
                }
                String str8 = "";
                String str9 = "";
                if (str != null) {
                    str9 = str;
                }
                String str10 = "";
                if (str2 != null) {
                    str10 = str2;
                }
                String str11 = "";
                if (str3 != null) {
                    str11 = str3;
                }
                String str12 = "";
                if (str4 != null) {
                    str12 = str4;
                }
                if (str5 != null) {
                    str8 = str5;
                }
                AbstractC31177DnL.A15(c28021Xg.A00(C05F.A00, str9, str10, str11, str12, str8, d3, d4), this.A00, this.A02);
                return;
            }
            AbstractC31171DnF.A0v();
            throw C00O.createAndThrow();
        } catch (IllegalArgumentException unused) {
            if (!r2.A04) {
                UserSession userSession = r2.A02;
                C28031Xh c28031Xh = r2.A03;
                C116155Nu c116155Nu2 = r2.A01;
                String str13 = c116155Nu2.A0k;
                String str14 = c116155Nu2.A0p;
                String str15 = c116155Nu2.A0m;
                String str16 = c116155Nu2.A0o;
                String str17 = c116155Nu2.A0q;
                Bundle A0b = AbstractC166987dD.A0b();
                String str18 = c116155Nu2.A0l;
                if (str18 != null) {
                    d = Double.parseDouble(str18);
                } else {
                    d = 0.0d;
                }
                A0b.putDouble("ARG_LOCATION_LATITUDE", d);
                String str19 = c116155Nu2.A0n;
                if (str19 != null) {
                    d2 = Double.parseDouble(str19);
                } else {
                    d2 = 0.0d;
                }
                A0b.putDouble("ARG_LOCATION_LONGITUDE", d2);
                if (str13 == null) {
                    str13 = "";
                }
                A0b.putString("ARG_DEVICE_NAME", str13);
                if (str14 == null) {
                    str14 = "";
                }
                A0b.putString("ARG_TIMESTAMP", str14);
                if (str15 == null) {
                    str15 = "";
                }
                A0b.putString("ARG_LOCATION_NAME", str15);
                if (str16 == null) {
                    str16 = "";
                }
                A0b.putString("ARG_REQUEST_DEVICE_ID", str16);
                A0b.putInt("ARG_USER_ACTION", 0);
                if (str17 == null) {
                    str17 = "";
                }
                A0b.putString("ARG_TWO_FAC_IDENTIFIER", str17);
                AbstractC31173DnH.A0Z(r2.A00, A0b, userSession, ModalActivity.class, "login_notification").A0C(c28031Xh.A00);
            }
        }
    }
}
