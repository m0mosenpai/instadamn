package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.File;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9fN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214859fN extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "RtcCallScreenCaptureShareFragment";
    public C81Y A00;
    public C81I A01;
    public DirectCameraViewModel A02;
    public boolean A03;
    public final InterfaceC25214BDm A04 = new C23766Afd(this, 4);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "videocall_screen_capture_share_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C22P c22p;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        File A11 = AbstractC166987dD.A11(requireArguments().getString(MSV.A00(1576)));
        Object obj = requireArguments().get(MSV.A00(1575));
        if (!(obj instanceof C22P) || (c22p = (C22P) obj) == null) {
            c22p = C22P.A5N;
        }
        String string = requireArguments().getString("screen_capture_share_arguments_key_face_effect_id");
        String string2 = requireArguments().getString("media_type");
        this.A03 = requireArguments().getBoolean(MSV.A00(1572));
        this.A02 = (DirectCameraViewModel) requireArguments().getParcelable(MSV.A00(1574));
        C81I c81i = new C81I();
        this.A01 = c81i;
        registerLifecycleListener(c81i);
        if (string2 != null && string2.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            i = 3;
        } else {
            C14360o3.A0B(A11, 0);
            i = 1;
        }
        Medium A03 = C8IU.A03(A11, i, 0);
        float A0A = AbstractC13880nE.A0A(requireContext());
        float A09 = AbstractC13880nE.A09(requireContext());
        AbstractC167007dF.A0z(this, new RunnableC24896Azv(AbstractC167007dF.A0G(A0A, A09), AbstractC166987dD.A0Y(A0A, A09), (ViewGroup) view.findViewById(R.id.videocall_screen_capture_share_container), c22p, A03, this, string));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        if (this.A02 == null) {
            str = "story";
        } else {
            str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        }
        A00(this, MSV.A00(974), AbstractC16960so.A1M(str), false, true);
        C81Y c81y = this.A00;
        if (c81y == null) {
            return false;
        }
        return c81y.A06();
    }

    public static final void A00(C214859fN c214859fN, String str, ArrayList arrayList, boolean z, boolean z2) {
        FragmentActivity activity = c214859fN.getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra(MSV.A00(1573), z);
            intent.putExtra(MSV.A00(1571), z2);
            intent.putExtra(MSV.A00(1570), str);
            intent.putStringArrayListExtra(MSV.A00(1577), arrayList);
            activity.setResult(-1, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1377696237);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_videocall_share_screen_capture, viewGroup, false);
        C14360o3.A07(inflate);
        C0f9.A09(-324730895, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1997290388);
        super.onDestroyView();
        this.A00 = null;
        C81I c81i = this.A01;
        if (c81i != null) {
            unregisterLifecycleListener(c81i);
            c81i.onDestroyView();
        }
        this.A01 = null;
        C0f9.A09(-821111063, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-857241524);
        super.onResume();
        Activity rootActivity = getRootActivity();
        C14360o3.A0A(rootActivity);
        this.A05.getValue();
        AbstractC65987Txg.A00(rootActivity);
        C0f9.A09(1799807907, A02);
    }
}
