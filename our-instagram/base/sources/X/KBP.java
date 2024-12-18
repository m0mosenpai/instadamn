package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import com.facebook.R;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.File;
import java.io.Serializable;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public final class KBP extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CreatorActivationSlideFragment";
    public int A00;
    public KBL A01;
    public EnumC46174KcC A02;
    public Integer A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_creator_activation_slide_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C3LX c3lx;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Integer num = this.A03;
        if (num != null) {
            int intValue = num.intValue();
            AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), AbstractC31178DnM.A0C(view), intValue);
        }
        EnumC46174KcC enumC46174KcC = this.A02;
        if (enumC46174KcC != null) {
            C58632mM c58632mM = C58632mM.A00;
            switch (enumC46174KcC.ordinal()) {
                case 0:
                    c3lx = AbstractC47207Ktg.A00;
                    break;
                case 1:
                    c3lx = AbstractC47207Ktg.A01;
                    break;
                case 2:
                    c3lx = AbstractC47207Ktg.A02;
                    break;
                case 3:
                    c3lx = AbstractC47207Ktg.A03;
                    break;
                case 4:
                    c3lx = AbstractC47207Ktg.A04;
                    break;
                case 5:
                    c3lx = AbstractC47207Ktg.A05;
                    break;
                default:
                    throw B4Z.A00();
            }
            C51755Mte c51755Mte = (C51755Mte) c58632mM.A01(c3lx, LSZ.A00, new C48128LSd(1, view, this)).A00();
            if (c51755Mte != null) {
                A00(view, c51755Mte, this);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public static final void A00(View view, C51755Mte c51755Mte, KBP kbp) {
        View A0R = AbstractC166997dE.A0R(view, R.id.video_container);
        VideoView videoView = (VideoView) AbstractC166997dE.A0R(view, R.id.video);
        if (c51755Mte != null) {
            android.net.Uri fromFile = android.net.Uri.fromFile((File) c51755Mte.A00);
            C14360o3.A07(fromFile);
            videoView.setVideoURI(fromFile);
            videoView.requestFocus();
            videoView.setOnPreparedListener(new LNA(A0R, 4));
            videoView.setOnCompletionListener(new C48030LMz(kbp, 5));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC46174KcC enumC46174KcC;
        int A02 = C0f9.A02(865457536);
        super.onCreate(bundle);
        this.A00 = requireArguments().getInt("position");
        this.A03 = AbstractC31179DnN.A0X(requireArguments(), DevServerEntity.COLUMN_DESCRIPTION);
        Serializable serializable = requireArguments().getSerializable(MediaStreamTrack.VIDEO_TRACK_KIND);
        if (serializable instanceof EnumC46174KcC) {
            enumC46174KcC = (EnumC46174KcC) serializable;
        } else {
            enumC46174KcC = null;
        }
        this.A02 = enumC46174KcC;
        C0f9.A09(1473297298, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1222378496);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_thread_null_state_slide, false);
        C0f9.A09(-2138088009, A02);
        return A0R;
    }
}
