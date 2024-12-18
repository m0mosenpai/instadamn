package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.Pfu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57520Pfu extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57520Pfu(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57520Pfu(obj, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        C51D c51d;
        C55177Odh c55177Odh;
        InterfaceC57854PlK interfaceC57854PlK;
        switch (this.A00) {
            case 0:
                return AbstractC37301Gc2.A0T(((View) this.A01).getResources(), R.dimen.alert_dialog_button_cell_height);
            case 1:
                PCQ pcq = (PCQ) this.A01;
                ViewPager2 viewPager2 = (ViewPager2) AbstractC166997dE.A0R(pcq.A05.getView(), R.id.view_pager);
                viewPager2.setAdapter((C2UU) pcq.A06.getValue());
                viewPager2.setOffscreenPageLimit(1);
                viewPager2.A05(new C51394Mmz(pcq, 1));
                return viewPager2;
            case 2:
                return ((PCQ) this.A01).A05.getView().requireViewById(R.id.view_pager_container);
            case 3:
                return ((PCQ) this.A01).A05.getView().requireViewById(R.id.view_pager_media_container);
            case 4:
                View findViewById = ((C51379Mme) this.A01).A07.findViewById(R.id.cowatch_playback_container);
                findViewById.setClickable(false);
                return findViewById;
            case 5:
                return ((C51379Mme) this.A01).A0D.findViewById(R.id.vertical_grid_live_frame_layout);
            case 6:
                return AbstractC37301Gc2.A0T(((C51379Mme) this.A01).A07.getResources(), R.dimen.alert_dialog_button_cell_height);
            case 7:
                return new C86013sY(AbstractC31171DnF.A07(((C51379Mme) this.A01).A07, R.id.video_cues_stub), false);
            case 8:
                ((OHM) this.A01).A00(false);
                return C0eB.A00;
            case 9:
                return AbstractC37301Gc2.A0T(((C52689NTa) this.A01).A0I.getResources(), R.dimen.abc_list_item_height_large_material);
            case 10:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C52689NTa) this.A01).A0K, 36315473201073406L);
            case 11:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C52689NTa) this.A01).A0K, 36317758123677230L);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C54768OIf(((PCI) this.A01).A09);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C51380Mmf c51380Mmf = (C51380Mmf) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new PCH(c51380Mmf.A05, new O51(c51380Mmf));
            case 14:
                C51380Mmf c51380Mmf2 = (C51380Mmf) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new PCQ(c51380Mmf2.A05, c51380Mmf2.A06, c51380Mmf2.A07);
            case Process.SIGTERM /* 15 */:
                C51380Mmf c51380Mmf3 = (C51380Mmf) this.A01;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c51380Mmf3.A05.findViewById(R.id.inset_guideline_bottom);
            case 16:
                C51380Mmf c51380Mmf4 = (C51380Mmf) this.A01;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c51380Mmf4.A05.findViewById(R.id.inset_guideline_top);
            case 17:
                C51380Mmf c51380Mmf5 = (C51380Mmf) this.A01;
                return new C51379Mme(c51380Mmf5.A05, c51380Mmf5.A06);
            case 18:
                C51380Mmf c51380Mmf6 = (C51380Mmf) this.A01;
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                PCI pci = new PCI(c51380Mmf6.A05, c51380Mmf6.A06, c51380Mmf6.A07, new O50(c51380Mmf6));
                pci.A01 = c51380Mmf6.A01;
                TextView textView = pci.A07;
                C14360o3.A06(textView);
                C52374NFq.A00(AbstractC166987dD.A0s(textView), pci, 29);
                View view = pci.A04;
                C14360o3.A06(view);
                C52374NFq.A00(AbstractC166987dD.A0s(view), pci, 30);
                IgImageView igImageView = pci.A0D;
                C14360o3.A06(igImageView);
                C52374NFq.A00(AbstractC166987dD.A0s(igImageView), pci, 31);
                CircularImageView circularImageView = pci.A0C;
                C14360o3.A06(circularImageView);
                C52374NFq.A00(AbstractC166987dD.A0s(circularImageView), pci, 32);
                TextView textView2 = pci.A08;
                C14360o3.A06(textView2);
                C52374NFq.A00(AbstractC166987dD.A0s(textView2), pci, 33);
                return pci;
            case Process.SIGSTOP /* 19 */:
                return Float.valueOf(AbstractC166987dD.A04(AbstractC25228BEl.A0M((View) this.A01), R.dimen.abc_list_item_height_large_material));
            case 20:
                PCB pcb = (PCB) this.A01;
                return AbstractC31175DnJ.A07(AbstractC25228BEl.A0P(pcb.A02), MSW.A0B(pcb.A03), R.layout.layout_debug_sheet, false);
            case 21:
                return new OI7(AbstractC166997dE.A0L(((NTT) this.A01).A04));
            case 22:
                InterfaceC08430c6 interfaceC08430c6 = (Fragment) this.A01;
                if ((interfaceC08430c6 instanceof C51D) && (c51d = (C51D) interfaceC08430c6) != null) {
                    z = c51d.isScrolledToTop();
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                return Integer.valueOf(((PCU) this.A01).A00);
            case 24:
                PCU pcu = (PCU) this.A01;
                UserSession userSession = pcu.A08;
                Activity activity = pcu.A05;
                int A09 = AbstractC167007dF.A09(activity, R.attr.igds_color_secondary_background);
                InterfaceC018407e interfaceC018407e = (InterfaceC018407e) activity;
                C87T c87t = (C87T) MSW.A0F(new C87S(AbstractC166987dD.A0O(activity), new C87R(userSession), (AnonymousClass858) new C52942bb(interfaceC018407e).A00(AnonymousClass858.class), userSession, null, null, false), interfaceC018407e).A00(C87T.class);
                C87Q c87q = new C87Q(null, null, 1);
                C14360o3.A0B(c87t, 3);
                return new C8ZD(c87t, userSession, c87q, null, A09);
            case 25:
                PCU pcu2 = (PCU) this.A01;
                C195328kY c195328kY = new C195328kY(AbstractC166997dE.A0L(pcu2.A06), pcu2, true);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                ViewGroup viewGroup = pcu2.A07;
                viewGroup.addView(c195328kY, layoutParams);
                viewGroup.setVisibility(0);
                return c195328kY;
            case 26:
                return ((NTS) this.A01).A04.getDrawable(R.drawable.instagram_call_pano_filled_24);
            case 27:
                return ((NTS) this.A01).A04.getString(2131976768);
            case 28:
                return ((NTS) this.A01).A04.getString(2131976773);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((NTS) this.A01).A04.getString(2131976769);
            case 30:
                return ((NTS) this.A01).A04.getString(2131976770);
            case 31:
                return ((NTS) this.A01).A04.getString(2131976774);
            case 32:
                return ((NTS) this.A01).A04.getString(2131976791);
            case 33:
                return ((NTS) this.A01).A04.getString(2131976792);
            case 34:
                return ((NTS) this.A01).A04.getString(2131976786);
            case 35:
                return ((NTS) this.A01).A04.getDrawable(R.drawable.instagram_video_chat_pano_filled_24);
            case 36:
                return AbstractC166987dD.A0d(((PCR) this.A01).A0D).findViewById(R.id.call_end_background);
            case 37:
                c55177Odh = ((PCR) this.A01).A03().A00.A08;
                interfaceC57854PlK = C56616PBm.A00;
                break;
            case 38:
                PCR pcr = (PCR) this.A01;
                C3PX c3px = (C3PX) pcr.A08.getValue();
                C57520Pfu c57520Pfu = new C57520Pfu(pcr, 37);
                View findViewById2 = c3px.A00().findViewById(R.id.call_again_button);
                C14360o3.A0A(findViewById2);
                AbstractC47101Krw.A00(findViewById2, c57520Pfu, null, true);
                return findViewById2;
            case 39:
                return AbstractC166987dD.A0d(((PCR) this.A01).A06).findViewById(R.id.call_again_button_image);
            case 40:
                return C3PW.A00(AbstractC166987dD.A0d(((PCR) this.A01).A0D), R.id.call_again_controls);
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            case 44:
            default:
                NTS nts = ((PCR) this.A01).A03().A00;
                nts.A0L.invoke();
                c55177Odh = nts.A08;
                interfaceC57854PlK = PFP.A00;
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                PCR pcr2 = (PCR) this.A01;
                C3PX c3px2 = (C3PX) pcr2.A08.getValue();
                C57520Pfu c57520Pfu2 = new C57520Pfu(pcr2, 41);
                View findViewById3 = c3px2.A00().findViewById(R.id.cancel_button);
                C14360o3.A0A(findViewById3);
                AbstractC47101Krw.A00(findViewById3, c57520Pfu2, null, true);
                return findViewById3;
            case 45:
                PCR pcr3 = (PCR) this.A01;
                boolean z2 = pcr3.A0R;
                View A0d = AbstractC166987dD.A0d(pcr3.A0D);
                int i6 = R.id.user_feedback_close_button;
                int i7 = 44;
                if (z2) {
                    i6 = R.id.user_feedback_close_button_unified;
                    i7 = 43;
                }
                C57520Pfu c57520Pfu3 = new C57520Pfu(pcr3, i7);
                View findViewById4 = A0d.findViewById(i6);
                if (findViewById4 == null) {
                    return findViewById4;
                }
                AbstractC47101Krw.A00(findViewById4, c57520Pfu3, null, true);
                return findViewById4;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC166987dD.A0d(((PCR) this.A01).A0D).findViewById(R.id.call_end_container);
            case 47:
                PCR pcr4 = (PCR) this.A01;
                View A0J = MSZ.A0J(pcr4.A0E);
                pcr4.A03.requestApplyInsets();
                return A0J;
            case 48:
                return C3PW.A00(((PCR) this.A01).A03, R.id.call_end_stub);
            case 49:
                return AbstractC166987dD.A0d(((PCR) this.A01).A0D).findViewById(R.id.call_end_facepile);
        }
        c55177Odh.A03(interfaceC57854PlK);
        return C0eB.A00;
    }
}
