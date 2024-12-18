package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.KPh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45802KPh extends KCM {
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveBaseFragment";
    public InterfaceC16820sZ A00 = new MHL(this, 49);
    public C19L A01;
    public final GoogleAuthController A02;
    public final InterfaceC09390do A03;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC167017dG.A0w(C12L.A00, 1705805791);
        GoogleAuthController googleAuthController = this.A02;
        FragmentActivity requireActivity = requireActivity();
        C07T lifecycle = getViewLifecycleOwner().getLifecycle();
        C47312KvN c47312KvN = new C47312KvN(this);
        C19L c19l = this.A01;
        if (c19l == null) {
            C14360o3.A0F("viewBoundBackgroundScope");
            throw C00O.createAndThrow();
        }
        C14360o3.A0B(lifecycle, 2);
        googleAuthController.A01 = c47312KvN;
        LRY lry = new LRY(requireActivity.activityResultRegistry, new C57243PbR(googleAuthController, 42), c19l, googleAuthController.A03);
        lifecycle.A09(lry);
        googleAuthController.A00 = lry;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 45), C07Y.A00(viewLifecycleOwner));
        KCM.A04(view, this);
    }

    public static void A0B(C44456JlO c44456JlO, KCM kcm, InterfaceC09390do interfaceC09390do, int i) {
        C50247MHc c50247MHc = new C50247MHc(kcm, i);
        new C47746L6o(c44456JlO.A02).A00(c44456JlO.A0D(), c44456JlO.A01, c44456JlO.A05, C05F.A0N, new MM0(c50247MHc, 33), false);
        LKa.A02(kcm.A0C(), C05F.A0j, true);
        ((C44456JlO) interfaceC09390do.getValue()).A03.A05("GDRIVE_SETUP_SUCCESS");
    }

    public final void A0D() {
        if (this instanceof C45794KOz) {
            C44462JlU.A00(((C45794KOz) this).A06).A05("GDRIVE_RESTORE_ACCOUNT_PICKER_IMPRESSION");
        } else if (this instanceof C45793KOy) {
            C44462JlU.A00(((C45793KOy) this).A05).A05("GDRIVE_RESTORE_ACCOUNT_PICKER_IMPRESSION");
        } else if (this instanceof KP0) {
            ((C44472Jle) ((KP0) this).A04.getValue()).A01.A05("GDRIVE_SETUP_ACCOUNT_PICKER_IMPRESSION");
        }
    }

    public final void A0E() {
        View view = this.mView;
        if (view != null) {
            view.post(new M0P(this));
        }
    }

    public final void A0F(boolean z) {
        View view;
        Runnable runnableC49939M3g;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        if (this instanceof C45794KOz) {
            igdsBottomButtonLayout = ((C45794KOz) this).A00;
        } else if (this instanceof C45793KOy) {
            igdsBottomButtonLayout = ((C45793KOy) this).A00;
        } else {
            if (this instanceof KP0) {
                KP0 kp0 = (KP0) this;
                view = kp0.mView;
                if (view == null) {
                    return;
                } else {
                    runnableC49939M3g = new RunnableC49940M3h(kp0, z);
                }
            } else {
                KP1 kp1 = (KP1) this;
                view = kp1.mView;
                if (view == null) {
                    return;
                } else {
                    runnableC49939M3g = new RunnableC49939M3g(kp1, z);
                }
            }
            view.post(runnableC49939M3g);
            return;
        }
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(z);
        }
    }

    public final void A0G(boolean z) {
        L69 l69 = new L69();
        View view = this.mView;
        GoogleAuthController googleAuthController = this.A02;
        C43783JXw A18 = AbstractC43592JPx.A18(this, 16);
        C43783JXw A182 = AbstractC43592JPx.A18(this, 17);
        C43603JQj c43603JQj = new C43603JQj(this, 9);
        C14360o3.A0B(googleAuthController, 2);
        AbstractC166987dD.A1Z(new C50118MBj(view, this, googleAuthController, l69, null, c43603JQj, A182, A18, z), AbstractC167017dG.A0w(C12L.A00, 1705805791));
    }

    public AbstractC45802KPh() {
        MHL mhl = new MHL(this, 48);
        InterfaceC09390do A00 = C50247MHc.A00(C50247MHc.A01(this, 0), EnumC09460dv.A02, 1);
        this.A03 = AbstractC25225BEi.A0a(C50247MHc.A01(A00, 2), mhl, new C50172MDz(0, null, A00), AbstractC25225BEi.A1D(C44456JlO.class));
        this.A02 = (GoogleAuthController) AbstractC47205Kte.A02.getValue();
    }
}
