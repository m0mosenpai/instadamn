package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.io.File;

/* renamed from: X.6bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142226bf implements InterfaceC69913Ca {
    public final Activity A00;
    public final Fragment A01;
    public final UserSession A02;
    public final boolean A03;

    public C142226bf(UserSession userSession, Activity activity, Fragment fragment, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = fragment;
        this.A00 = activity;
        this.A03 = z;
    }

    @Override // X.InterfaceC69913Ca
    public final void CKE(Intent intent) {
        InterfaceC53742dD interfaceC53742dD;
        C14360o3.A0B(intent, 0);
        InterfaceC53722dB A00 = AbstractC54852fj.A00();
        C19280xC A002 = AbstractC31718DwN.A00(C05F.A0u);
        if (C14360o3.A0K(intent.getStringExtra(MSV.A00(146)), MSV.A00(147))) {
            if (!this.A03) {
                A002.A0C("return_to", "feed");
                AbstractC11060iN.A00(this.A02).EHW(A002);
                InterfaceC08430c6 interfaceC08430c6 = this.A01.mParentFragment;
                if (interfaceC08430c6 instanceof InterfaceC53742dD) {
                    C14360o3.A0C(interfaceC08430c6, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgNavigator");
                    interfaceC53742dD = (InterfaceC53742dD) interfaceC08430c6;
                } else if (A00 != null) {
                    interfaceC53742dD = (InterfaceC53742dD) A00;
                }
                AbstractC72153Lo.A00 = true;
                interfaceC53742dD.EfJ(C1QO.A0C);
                interfaceC53742dD.FBp(new PositionConfig(null, null, null, "return_from_main_camera_to_inbox", null, null, null, null, null, null, null, null, null, 0.0f, 0, false));
            }
            Activity activity = this.A00;
            if (activity instanceof ModalActivity) {
                ((IgFragmentActivity) activity).onBackPressed();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Camera activity action not handled");
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final void En7(File file, int i) {
        C14360o3.A0B(file, 0);
        LJR.A02(this.A00, file, i);
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        C12260kU.A06(this.A01, intent, i);
    }
}
