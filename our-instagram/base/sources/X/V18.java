package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes11.dex */
public final class V18 extends AbstractC59962oe implements InterfaceC69913Ca {
    public static final String __redex_internal_original_name = "PromoteMediaPickerIgMediaFragment";
    public EnumC68134VCs A00;
    public W4U A01;
    public String A02;
    public C70605Wdj A03;
    public ViewOnTouchListenerC67974V4p A04;
    public final C684636j A06 = new Object();
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
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
        LJR.A02(requireActivity(), file, i);
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        C12260kU.A06(this, intent, i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_ig_media_picker";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r1 == X.EnumC68134VCs.A03) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V18.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A05.getValue();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            super.onActivityResult(i, i2, intent);
        }
        AbstractC25231BEo.A0c(requireActivity(), this.A05).A06();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        C67885V0r c67885V0r;
        int A02 = C0f9.A02(706018282);
        super.onCreate(bundle);
        if (getRootActivity() instanceof InterfaceC53892dT) {
            Fragment fragment = this.mParentFragment;
            if ((fragment instanceof C67885V0r) && (c67885V0r = (C67885V0r) fragment) != null) {
                this.A01 = c67885V0r.A00();
                this.A02 = null;
                Context requireContext = requireContext();
                InterfaceC09390do interfaceC09390do = this.A05;
                UserSession userSession = (UserSession) interfaceC09390do.getValue();
                ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = new ViewOnTouchListenerC67974V4p(requireContext, this, requireActivity().getSupportFragmentManager(), userSession, this.A06, AbstractC60952qJ.A01("promote_ig_media_picker", false, false), new C70912WkG(1), C57332k8.A0m.A00(requireContext(), (UserSession) interfaceC09390do.getValue()));
                this.A04 = viewOnTouchListenerC67974V4p;
                registerLifecycleListener(viewOnTouchListenerC67974V4p);
                C0f9.A09(-1690523925, A02);
                return;
            }
            illegalStateException = AbstractC166997dE.A0g();
            i = 1224959146;
        } else {
            illegalStateException = new IllegalStateException("The root activity of PromoteMediaPickerIgMediaFragment should be SwipeNavigationHost (IgMainActivityLegacy)");
            i = 1818433523;
        }
        C0f9.A09(i, A02);
        throw illegalStateException;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-433134816);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_ig_media_picker_content_fragment, viewGroup, false);
        C0f9.A09(1532005481, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(173272043);
        super.onDestroy();
        C70605Wdj c70605Wdj = this.A03;
        if (c70605Wdj != null) {
            c70605Wdj.destroy();
        }
        C0f9.A09(1478568353, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-443859769);
        super.onPause();
        C70605Wdj c70605Wdj = this.A03;
        if (c70605Wdj != null) {
            C70908WkB c70908WkB = c70605Wdj.A03;
            c70908WkB.A03 = false;
            C70908WkB.A03(c70908WkB, "context_switch");
        }
        C0f9.A09(1156861395, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1818650351);
        super.onResume();
        W4U w4u = this.A01;
        String str = "mediaPickerState";
        if (w4u != null) {
            w4u.A00();
            W4U w4u2 = this.A01;
            if (w4u2 != null) {
                w4u2.A01 = this.A02;
                w4u2.A00();
                W4U w4u3 = this.A01;
                if (w4u3 != null) {
                    EnumC68134VCs enumC68134VCs = this.A00;
                    if (enumC68134VCs == null) {
                        str = "mediaContentType";
                    } else {
                        w4u3.A00 = enumC68134VCs;
                        C70605Wdj c70605Wdj = this.A03;
                        if (c70605Wdj != null) {
                            C70908WkB c70908WkB = c70605Wdj.A03;
                            c70908WkB.A03 = true;
                            C70908WkB.A02(c70908WkB);
                        }
                        C0f9.A09(-239917265, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
