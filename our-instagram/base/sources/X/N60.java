package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.actionbar.ActionButton;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.io.File;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class N60 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ClipsEditMetadataFragment";
    public View A00;
    public ClipsEditMetadataController A01;
    public String A02;
    public boolean A03;
    public int A04;
    public String A05;
    public String A06;
    public final InterfaceC41501vz A0A = C56034Ou6.A00(this, 40);
    public final InterfaceC41501vz A09 = C56034Ou6.A00(this, 39);
    public final InterfaceC41501vz A08 = C56034Ou6.A00(this, 38);
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(804);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        if (clipsEditMetadataController == null) {
            C14360o3.A0F("clipsEditMetadataController");
            throw C00O.createAndThrow();
        }
        File file = clipsEditMetadataController.A0L;
        if (file != null) {
            file.delete();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        A00.A02 = AbstractC166997dE.A0N(this).getString(2131961593);
        ActionButton A002 = C31722DwR.A00(new ViewOnClickListenerC55463OkI(this, 47), interfaceC56362iU, A00);
        this.A00 = A002;
        A002.setEnabled(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(956164012);
        super.onActivityCreated(bundle);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            ((IgFragmentActivity) requireActivity).registerOnActivityResultListener(new NAp(this, 3));
        }
        C0f9.A09(1074920836, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C54839OLy c54839OLy;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i != 16) {
                if (i != 98) {
                    if (i != 1004) {
                        return;
                    }
                } else {
                    ClipsEditMetadataController clipsEditMetadataController = this.A01;
                    if (clipsEditMetadataController != null) {
                        String stringExtra = intent.getStringExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID");
                        if ("not_funded".equals(stringExtra)) {
                            stringExtra = null;
                        }
                        clipsEditMetadataController.A0N = stringExtra;
                        ClipsEditMetadataController.A07(clipsEditMetadataController);
                        ClipsEditMetadataController.A06(clipsEditMetadataController);
                        return;
                    }
                    C14360o3.A0F("clipsEditMetadataController");
                    throw C00O.createAndThrow();
                }
            }
            ClipsEditMetadataController clipsEditMetadataController2 = this.A01;
            if (clipsEditMetadataController2 != null) {
                if (i == 1004 && (c54839OLy = clipsEditMetadataController2.A0B) != null) {
                    c54839OLy.A00(intent);
                    return;
                }
                clipsEditMetadataController2.A02 = AbstractC54344O0c.A00.A04(intent, clipsEditMetadataController2.A14);
                clipsEditMetadataController2.A0I = C41747IeL.A00(intent);
                AbstractC54316Nza.A00(clipsEditMetadataController2.A02, clipsEditMetadataController2.A0z);
                ClipsEditMetadataController.A0C(clipsEditMetadataController2);
                return;
            }
            C14360o3.A0F("clipsEditMetadataController");
            throw C00O.createAndThrow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1164937943);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC153636vY.A01(requireArguments, "args_media_id");
        this.A04 = requireArguments.getInt("args_media_index");
        requireArguments.getBoolean("args_is_feed_preview_entrypoint");
        this.A06 = requireArguments.getString("args_viewer_session_id");
        this.A05 = requireArguments.getString("args_viewer_init_media_id");
        String string = requireArguments.getString("args_comment_poll");
        C101394gx c101394gx = null;
        if (string != null) {
            try {
                c101394gx = AbstractC101354gs.parseFromJson(C16V.A00(string));
            } catch (IOException e) {
                AbstractC167007dF.A15(C18950wb.A01.AEp(__redex_internal_original_name, 817902720), DialogModule.KEY_MESSAGE, "Failed to deserialize Poll from ClipsEditMetadata", e);
            }
        }
        InterfaceC09390do interfaceC09390do = this.A07;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str = this.A02;
        if (str == null) {
            C14360o3.A0F("mediaId");
            throw C00O.createAndThrow();
        }
        ClipsEditMetadataController clipsEditMetadataController = new ClipsEditMetadataController(this, this, A0r, c101394gx, this, this, str);
        this.A01 = clipsEditMetadataController;
        registerLifecycleListener(clipsEditMetadataController);
        C25671My A0Q = AbstractC31176DnK.A0Q(interfaceC09390do);
        A0Q.A01(this.A0A, C55985OtI.class);
        A0Q.A01(this.A09, C55966Osy.class);
        A0Q.A01(this.A08, C56021Ots.class);
        C0f9.A09(1341847007, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-998291640);
        C14360o3.A0B(layoutInflater, 0);
        boolean A00 = AbstractC50595MVg.A00(AbstractC166987dD.A0r(this.A07));
        int i = R.layout.layout_clips_edit_fragment;
        if (A00) {
            i = R.layout.layout_clips_edit_fragment_v2;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C0f9.A09(645387891, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(220950576);
        super.onDestroy();
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A07);
        A0Q.A02(this.A0A, C55985OtI.class);
        A0Q.A02(this.A09, C55966Osy.class);
        A0Q.A02(this.A08, C56021Ots.class);
        C0f9.A09(-527473095, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1847578807);
        super.onPause();
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        if (clipsEditMetadataController == null) {
            C14360o3.A0F("clipsEditMetadataController");
            throw C00O.createAndThrow();
        }
        clipsEditMetadataController.A0K();
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(0);
            C0f9.A09(928097749, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-25945516, A02);
            throw A0g;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(269132714);
        super.onResume();
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(16);
            C0f9.A09(-534979512, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-1215584137, A02);
            throw A0g;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-669937733);
        super.onStop();
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        if (clipsEditMetadataController == null) {
            C14360o3.A0F("clipsEditMetadataController");
            throw C00O.createAndThrow();
        }
        clipsEditMetadataController.A0K();
        C0f9.A09(-217978679, A02);
    }
}
