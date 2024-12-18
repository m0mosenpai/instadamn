package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.util.List;

/* loaded from: classes9.dex */
public final class NFV extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public NFV(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A03 = obj5;
        this.A02 = obj3;
        this.A05 = obj2;
        this.A04 = obj6;
        this.A06 = obj4;
        this.A01 = obj;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            C9GR.A0B((Context) this.A01, "shareToStory_something_went_wrong");
            return;
        }
        C55165OdT.A02((DialogInterface.OnDismissListener) this.A05, (AbstractC10360h2) this.A02);
        C9GR.A0A((Context) this.A01, "share_error");
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        if (1 - this.A00 != 0) {
            super.onFinish();
        } else {
            if (((Activity) this.A01).isDestroyed()) {
                return;
            }
            ((Dialog) this.A02).dismiss();
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        if (1 - this.A00 != 0) {
            super.onStart();
        } else {
            C0fJ.A00((Dialog) this.A02);
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        if (this.A00 != 0) {
            C14360o3.A0B(file, 0);
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A06;
            Activity activity = (Activity) this.A01;
            Fragment fragment = (Fragment) this.A04;
            C38321qM c38321qM = (C38321qM) this.A05;
            C22P c22p = (C22P) this.A03;
            if (fragment.getContext() != null) {
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putSerializable("igtv_share_entry_point", c22p);
                A0b.putString("igtv_share_media_id", c38321qM.getId());
                A0b.putString("igtv_share_media_file_path", file.getAbsolutePath());
                A0b.putParcelable("igtv_share_target_group_profile", null);
                C6XJ.A02(activity, A0b, abstractC12990ll, TransparentModalActivity.class, AbstractC111324zv.A00(5173)).A0C(fragment.getContext());
                return;
            }
            return;
        }
        C14360o3.A0B(file, 0);
        InterfaceC69973Cg interfaceC69973Cg = (InterfaceC69973Cg) this.A03;
        C55165OdT.A02((DialogInterface.OnDismissListener) this.A05, (AbstractC10360h2) this.A02);
        android.net.Uri fromFile = android.net.Uri.fromFile(file);
        C38321qM c38321qM2 = ((C41181vS) this.A04).A0b;
        if (c38321qM2 != null) {
            if (c38321qM2.Cff()) {
                UserSession userSession = (UserSession) this.A06;
                if (C18U.A06(C06090Tz.A05, userSession, 36323942876589776L)) {
                    Activity activity2 = (Activity) this.A01;
                    List A1J = AbstractC166987dD.A1J(C8IU.A03(file, 3, 0));
                    AbstractC86593tX.A0L(activity2, C22P.A4I, userSession, null, null, null, c38321qM2.getId(), A1J, false);
                    return;
                }
                C14360o3.A0A(fromFile);
                interfaceC69973Cg.Eo7(fromFile, C22P.A4I, c38321qM2.getId(), null, 3, false);
                return;
            }
            C14360o3.A0A(fromFile);
            interfaceC69973Cg.EnC(fromFile, C22P.A4I, c38321qM2.getId(), 3, 10004);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
