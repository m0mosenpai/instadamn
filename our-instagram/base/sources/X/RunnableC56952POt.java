package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;
import java.util.ArrayList;

/* renamed from: X.POt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56952POt implements Runnable {
    public final /* synthetic */ C53020Ncs A00;

    public RunnableC56952POt(C53020Ncs c53020Ncs) {
        this.A00 = c53020Ncs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.A00.A0L;
        C53020Ncs c53020Ncs = igLiveWithGuestFragment.A08;
        if (c53020Ncs != null) {
            c53020Ncs.A0J();
            c53020Ncs.A0D();
            igLiveWithGuestFragment.A08 = null;
        }
        C52838NZv c52838NZv = igLiveWithGuestFragment.stateView;
        if (c52838NZv == null) {
            str2 = "stateView";
        } else {
            c52838NZv.A01();
            OMc oMc = igLiveWithGuestFragment.A07;
            if (oMc == null) {
                str2 = "reactionsPresenter";
            } else {
                oMc.A00();
                oMc.A01();
                C55852Or2 c55852Or2 = igLiveWithGuestFragment.A04;
                if (c55852Or2 == null) {
                    str2 = "igLiveQuestionsController";
                } else {
                    c55852Or2.destroy();
                    Context context = igLiveWithGuestFragment.getContext();
                    if (context != null) {
                        View A07 = AbstractC50523MSb.A07(igLiveWithGuestFragment.requireView(), R.id.iglive_livewith_capture_end_stub);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        User user = igLiveWithGuestFragment.A02;
                        if (user != null) {
                            A1E.add(user);
                        }
                        C105824pt c105824pt = igLiveWithGuestFragment.A01;
                        if (c105824pt != null) {
                            java.util.Set A06 = c105824pt.A06();
                            C14360o3.A07(A06);
                            A1E.addAll(A06);
                        }
                        C08730cb c08730cb = C17060sy.A01;
                        InterfaceC09390do interfaceC09390do = igLiveWithGuestFragment.A0G;
                        if (!A1E.contains(AbstractC31176DnK.A0g(c08730cb, interfaceC09390do))) {
                            A1E.add(AbstractC31176DnK.A0g(c08730cb, interfaceC09390do));
                        }
                        AbstractC31173DnH.A0I(A07, R.id.iglive_cobroadcast_end_facepile).setImageDrawable(AbstractC89513yr.A01(context, Float.valueOf(AbstractC166987dD.A04(AbstractC166997dE.A0N(igLiveWithGuestFragment), R.dimen.ai_agent_share_profile_sticker_padding) / AbstractC31177DnL.A02(igLiveWithGuestFragment, R.dimen.album_preview_add_item_circle_size)), Integer.valueOf(A1E.size()), "live_cobroadcast", A1E, AbstractC166997dE.A0N(igLiveWithGuestFragment).getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size), false, false, false));
                        TextView A0T = AbstractC166997dE.A0T(A07, R.id.iglive_cobroadcast_end_subtitle);
                        User user2 = igLiveWithGuestFragment.A02;
                        if (user2 != null) {
                            str = user2.getUsername();
                        } else {
                            str = "host";
                        }
                        AbstractC31177DnL.A0r(context, A0T, str, 2131964045);
                        View A0S = AbstractC166997dE.A0S(A07, R.id.iglive_end_done_button);
                        AbstractC56952jT.A01(A0S);
                        igLiveWithGuestFragment.A0B = true;
                        C56804PIv c56804PIv = igLiveWithGuestFragment.A05;
                        if (c56804PIv == null) {
                            str2 = "liveWithGuestWaterfall";
                        } else {
                            c56804PIv.A04 = Long.valueOf(SystemClock.elapsedRealtime());
                            Ok4.A00(A0S, 17, igLiveWithGuestFragment);
                        }
                    } else {
                        igLiveWithGuestFragment.A0B = true;
                        FragmentActivity activity = igLiveWithGuestFragment.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, null);
                            activity.onBackPressed();
                        }
                    }
                    C11T.A02(new RunnableC56939POg(igLiveWithGuestFragment));
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
