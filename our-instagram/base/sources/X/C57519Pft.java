package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Pft, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57519Pft extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57519Pft(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57519Pft(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        View inflate;
        int i;
        View inflate2;
        ArrayList<String> stringArrayList;
        switch (this.A00) {
            case 0:
                return new C55730Oow((UserSession) this.A01);
            case 1:
                return OQ9.A00(((P7G) this.A01).A00);
            case 2:
                return new C31212Dnv((UserSession) this.A01);
            case 3:
                return C07Y.A00((ComponentActivity) this.A01);
            case 4:
                ImmutableList.Builder builder = ImmutableList.builder();
                MUD mud = ((C23473Aak) this.A01).A00;
                C5S4.A00((C4OV) mud.A00, mud.A02, new C30189DRu(builder, 25));
                return builder.build();
            case 5:
                return new C55572gx((UserSession) this.A01);
            case 6:
                return new C56130Ovq((UserSession) this.A01);
            case 7:
                N4Y n4y = (N4Y) this.A01;
                return new NDB(n4y.requireContext(), AbstractC166987dD.A0r(n4y.A08), C05F.A01, AbstractC167027dH.A01(n4y.A07));
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return Integer.valueOf(AMo.A00(AbstractC31172DnG.A06(this.A01), R.dimen.clips_viewer_recommend_clips_height));
            case 9:
            case Process.SIGTERM /* 15 */:
            case 47:
                return this.A01;
            case 10:
            case 16:
            case 48:
                return AbstractC25226BEj.A1C(this.A01);
            case 11:
            case 17:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                return AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(abstractC59962oe), new NF4(abstractC59962oe));
            case 14:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                boolean z = true;
                if (bundle == null || !bundle.getBoolean("arg_show_camera_entry_point")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                N76 n76 = (N76) this.A01;
                return new L0L(n76.requireContext(), n76);
            case Process.SIGSTOP /* 19 */:
                N76 n762 = (N76) this.A01;
                Context requireContext = n762.requireContext();
                UserSession A0r = AbstractC166987dD.A0r(n762.A0G);
                Bundle bundle2 = n762.mArguments;
                if (bundle2 == null || (str = bundle2.getString("arg_quick_snap_media_id")) == null) {
                    str = "";
                }
                return new C52289NCe(requireContext, A0r, str);
            case 20:
                C8HB c8hb = (C8HB) this.A01;
                AbstractC167007dF.A0L(AbstractC50523MSb.A0H(c8hb).A0M).post(new RunnableC24479Asy(c8hb));
                break;
            case 21:
                ((C8HC) ((C8HB) this.A01).A0F.getValue()).A06();
                break;
            case 22:
                C8HB c8hb2 = (C8HB) this.A01;
                c8hb2.A08.A0B();
                C8HB.A00(c8hb2, new C57519Pft(c8hb2, 21));
                break;
            case 23:
                return AbstractC166997dE.A0S(AbstractC167007dF.A0L(((C55087Oak) this.A01).A0N), R.id.quick_snap_add_caption_button);
            case 24:
                return AbstractC166997dE.A0S(AbstractC167007dF.A0L(((C55087Oak) this.A01).A0N), R.id.quick_snap_caption_edit_text);
            case 25:
                return AbstractC166997dE.A0S(AbstractC167007dF.A0L(((C55087Oak) this.A01).A0N), R.id.quick_snap_caption_legibility_background);
            case 26:
                return AbstractC166997dE.A0S(AbstractC167007dF.A0L(((C55087Oak) this.A01).A0N), R.id.quick_snap_caption_text);
            case 27:
                C55087Oak c55087Oak = (C55087Oak) this.A01;
                InterfaceC09390do interfaceC09390do = c55087Oak.A0N;
                AbstractC50523MSb.A0m(AbstractC167007dF.A0L(interfaceC09390do), R.id.quick_snap_captured_image_stub);
                View findViewById = AbstractC167007dF.A0L(interfaceC09390do).findViewById(R.id.quick_snap_captured_image);
                C14360o3.A0A(findViewById);
                C191068d2 c191068d2 = c55087Oak.A09;
                AbstractC13880nE.A0h(findViewById, c191068d2.A00(), c191068d2.A00());
                AbstractC185998Mt.A02(findViewById, c191068d2.A00());
                return findViewById;
            case 28:
                C55087Oak c55087Oak2 = (C55087Oak) this.A01;
                ViewGroup viewGroup = c55087Oak2.A01;
                ViewStub A07 = AbstractC31171DnF.A07(viewGroup, R.id.quick_snap_creation_end_nux_stub);
                if (A07 != null && (inflate = A07.inflate()) != null) {
                    View findViewById2 = inflate.findViewById(R.id.quick_snap_end_nux_cta);
                    if (findViewById2 != null) {
                        ViewOnClickListenerC55456OkA.A00(findViewById2, 63, c55087Oak2);
                    }
                    View findViewById3 = inflate.findViewById(R.id.quick_snap_end_nux_close_button);
                    if (findViewById3 != null) {
                        ViewOnClickListenerC23249ASk.A00(findViewById3, 55, c55087Oak2);
                    }
                    View findViewById4 = inflate.findViewById(R.id.quick_snap_end_nux_info_button);
                    if (findViewById4 != null) {
                        findViewById4.setAlpha(0.0f);
                        AbstractC43594JPz.A0H(findViewById4).setStartDelay(1000L).setDuration(200L).start();
                        ViewOnClickListenerC55456OkA.A00(findViewById4, 64, c55087Oak2);
                    }
                    IgImageView A0a = AbstractC31172DnG.A0a(inflate, R.id.quick_snap_end_nux_image);
                    if (A0a != null) {
                        UserSession userSession = c55087Oak2.A03;
                        if (C18U.A06(C06090Tz.A05, userSession, 36325484770047078L)) {
                            AMo.A08(userSession, A0a, R.drawable.peek_nux_peeknuxdirectalt, c55087Oak2.A09.A00());
                        } else {
                            Context context = A0a.getContext();
                            boolean A02 = AbstractC70443Ed.A02(userSession);
                            boolean A072 = C14640oc.A07();
                            if (A02) {
                                i = R.drawable.peek_nux_qsnuxfeedstatic;
                                if (A072) {
                                    i = R.drawable.peek_nux_qsnuxfeedstaticandroid;
                                }
                            } else {
                                i = R.drawable.peek_nux_peekdirectstatic;
                                if (A072) {
                                    i = R.drawable.peek_nux_peeknuxstaticandroid;
                                }
                            }
                            AbstractC166997dE.A19(context, A0a, i);
                        }
                    }
                    TextView A0e = AbstractC166987dD.A0e(inflate, R.id.quick_snap_end_nux_title);
                    if (A0e != null) {
                        int i2 = 2131971330;
                        if (AbstractC70443Ed.A02(c55087Oak2.A03)) {
                            i2 = 2131971331;
                        }
                        A0e.setText(i2);
                    }
                }
                return AbstractC166987dD.A0c(viewGroup, R.id.quick_snap_creation_end_nux);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C55087Oak c55087Oak3 = (C55087Oak) this.A01;
                ViewGroup viewGroup2 = c55087Oak3.A01;
                ViewStub A073 = AbstractC31171DnF.A07(viewGroup2, R.id.quick_snap_creation_start_nux_stub);
                if (A073 != null && (inflate2 = A073.inflate()) != null) {
                    View findViewById5 = inflate2.findViewById(R.id.quick_snap_start_nux_cta);
                    if (findViewById5 != null) {
                        ViewOnClickListenerC55456OkA.A00(findViewById5, 65, c55087Oak3);
                    }
                    View findViewById6 = inflate2.findViewById(R.id.quick_snap_start_nux_close_button);
                    if (findViewById6 != null) {
                        ViewOnClickListenerC23249ASk.A00(findViewById6, 56, c55087Oak3);
                    }
                    IgImageView A0a2 = AbstractC31172DnG.A0a(inflate2, R.id.quick_snap_start_nux_image);
                    if (A0a2 != null) {
                        UserSession userSession2 = c55087Oak3.A03;
                        if (C18U.A06(C06090Tz.A05, userSession2, 36325484770047078L)) {
                            AMo.A08(userSession2, A0a2, R.drawable.peek_nux_peeknuxintroalt, ((NineSixteenLayoutConfigImpl) c55087Oak3.A04).A06);
                        } else {
                            Context context2 = A0a2.getContext();
                            boolean A074 = C14640oc.A07();
                            int i3 = R.drawable.peek_nux_qsnuxstatic;
                            if (A074) {
                                i3 = R.drawable.peek_nux_qsnuxstaticandroid;
                            }
                            AbstractC166997dE.A19(context2, A0a2, i3);
                        }
                    }
                    TextView A0e2 = AbstractC166987dD.A0e(inflate2, R.id.quick_snap_start_nux_bullet_one);
                    if (A0e2 != null) {
                        int i4 = 2131971335;
                        if (AbstractC70443Ed.A03(c55087Oak3.A03)) {
                            i4 = 2131971336;
                        }
                        A0e2.setText(i4);
                    }
                }
                return AbstractC166987dD.A0c(viewGroup2, R.id.quick_snap_creation_start_nux);
            case 30:
                ViewGroup viewGroup3 = ((C55087Oak) this.A01).A01;
                AbstractC50523MSb.A0m(viewGroup3, R.id.camera_controls_history_button_stub);
                return viewGroup3.findViewById(R.id.capture_history_button);
            case 31:
                ViewGroup viewGroup4 = ((C55087Oak) this.A01).A01;
                AbstractC50523MSb.A0m(viewGroup4, R.id.camera_info_button_stub);
                return viewGroup4.findViewById(R.id.camera_info_button);
            case 32:
                ViewGroup viewGroup5 = ((C55087Oak) this.A01).A01;
                AbstractC50523MSb.A0m(viewGroup5, R.id.quick_snap_practice_nux_complete_stub);
                return viewGroup5.findViewById(R.id.quick_snap_practice_nux_complete_view);
            case 33:
                ViewGroup viewGroup6 = ((C55087Oak) this.A01).A01;
                AbstractC50523MSb.A0m(viewGroup6, R.id.quick_snap_practice_nux_instructions_stub);
                return viewGroup6.findViewById(R.id.quick_snap_practice_nux_instructions);
            case 34:
                C55087Oak.A00((C55087Oak) this.A01);
                break;
            case 35:
                return AbstractC167007dF.A0L(((C55087Oak) this.A01).A0N).findViewById(R.id.quick_snap_camera_touch_blocker);
            case 36:
                C55087Oak c55087Oak4 = (C55087Oak) this.A01;
                View findViewById7 = AbstractC167007dF.A0L(c55087Oak4.A0N).findViewById(R.id.quick_snap_pre_capture_camera_container);
                C14360o3.A0A(findViewById7);
                C191068d2 c191068d22 = c55087Oak4.A09;
                AbstractC13880nE.A0h(findViewById7, c191068d22.A00(), c191068d22.A00());
                return findViewById7;
            case 37:
                ViewGroup viewGroup7 = ((C55087Oak) this.A01).A01;
                AbstractC50523MSb.A0m(viewGroup7, R.id.quick_snap_pre_capture_container_stub);
                return viewGroup7.findViewById(R.id.quick_snap_pre_capture_container);
            case 38:
                ViewGroup viewGroup8 = ((C55087Oak) this.A01).A01;
                AbstractC50523MSb.A0m(viewGroup8, R.id.quick_snap_sent_image_stub);
                View findViewById8 = viewGroup8.findViewById(R.id.quick_snap_sent_image);
                AbstractC185998Mt.A02(findViewById8, AbstractC43594JPz.A06(findViewById8.getContext()));
                return findViewById8;
            case 39:
                return new C55346Oi6(new C57748Pjb(this.A01, 44), 25);
            case 40:
                N7C n7c = (N7C) this.A01;
                return AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(n7c), new EYX(n7c));
            case Seq.NULL_REFNUM /* 41 */:
                N7C n7c2 = (N7C) this.A01;
                Bundle bundle3 = n7c2.mArguments;
                if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("ARG_AUDIENCE_LIST")) != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        User A022 = ((C18A) n7c2.A05.getValue()).A02(AbstractC166987dD.A1B(it));
                        if (A022 != null) {
                            A1E.add(A022);
                        }
                    }
                    return A1E;
                }
                return C16930sl.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC31176DnK.A0h(((N7C) this.A01).A04);
            case 43:
                C8HC c8hc = (C8HC) this.A01;
                if (!c8hc.A03) {
                    c8hc.A07();
                    break;
                }
                break;
            case 44:
                C8HC c8hc2 = (C8HC) this.A01;
                C23031Ai c23031Ai = c8hc2.A09;
                InterfaceC16530ry interfaceC16530ry = c23031Ai.A6n;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (AbstractC43594JPz.A0B(c23031Ai, interfaceC16530ry, c0yrArr, 519) < 3 && C23031Ai.A07(c23031Ai, "quick_snap_archive_tooltip_last_shown_ts", 2L)) {
                    C8HC.A03(C56507P7f.A00, c8hc2);
                    AbstractC167027dH.A16(c23031Ai, interfaceC16530ry, c0yrArr, 519);
                    c23031Ai.A6o.Egi(c23031Ai, Long.valueOf(System.currentTimeMillis()), c0yrArr[520]);
                    break;
                }
                break;
            case 45:
                C45510KCz c45510KCz = ((C47927LEw) this.A01).A02;
                View view = c45510KCz.A04;
                if (view != null) {
                    view.clearFocus();
                    View view2 = c45510KCz.A04;
                    if (view2 != null) {
                        AbstractC13880nE.A0O(view2);
                        break;
                    }
                }
                C14360o3.A0F("editText");
                throw C00O.createAndThrow();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                EM7 em7 = (EM7) this.A01;
                return new C215729go(em7.requireActivity(), AbstractC166987dD.A0r(em7.A02));
        }
        return C0eB.A00;
    }
}
