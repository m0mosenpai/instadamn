package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.drawing.FloatingIndicator;
import com.instagram.ui.widget.drawing.StrokeWidthTool;
import com.instagram.user.model.UpcomingEvent;
import go.Seq;

/* renamed from: X.PgO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57550PgO extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57550PgO(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57550PgO(obj, i));
    }

    public static C57550PgO A01(Object obj, int i) {
        return new C57550PgO(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC09390do interfaceC09390do;
        N4L n4l;
        View view;
        int i;
        String str;
        switch (this.A00) {
            case 1:
            case 6:
            case 11:
            case 17:
            case 21:
            case 25:
            case 28:
            case 32:
            case 38:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC167027dH.A0B(this.A01);
            case 2:
                C56049OuO c56049OuO = (C56049OuO) this.A01;
                UserSession userSession = c56049OuO.A0D;
                InterfaceC11380iw interfaceC11380iw = c56049OuO.A0C;
                return new NDW(c56049OuO.A04, interfaceC11380iw, userSession, c56049OuO.A0F, c56049OuO.A03);
            case 3:
                N6P n6p = (N6P) this.A01;
                return new OWa(n6p.requireActivity(), AbstractC166987dD.A0r(n6p.A01), new C56320Ozh(n6p, 1), AbstractC166997dE.A0p(n6p.requireContext(), 2131965530), n6p.requireContext().getString(2131965531), false, true, false, false);
            case 4:
            case 9:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            case 23:
            case 26:
            case 30:
            case 36:
            case 44:
            case 48:
                return this.A01;
            case 5:
            case 10:
            case 16:
            case 20:
            case 24:
            case 27:
            case 31:
            case 37:
            case 45:
            default:
                return AbstractC25226BEj.A1C(this.A01);
            case 7:
                N6P n6p2 = (N6P) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(n6p2.A01);
                String A0Y = AbstractC31175DnJ.A0Y(n6p2.requireArguments(), "prior_module_name");
                String string = n6p2.requireArguments().getString("creation_session_id");
                if (string == null) {
                    string = AbstractC167017dG.A0j();
                }
                return new C52313NDc(n6p2, A0r, (UpcomingEvent) n6p2.requireArguments().getParcelable("upcoming_live"), A0Y, string, n6p2.requireArguments().getBoolean("action_tag_upcoming_live"));
            case 8:
                N4L n4l2 = (N4L) this.A01;
                interfaceC09390do = n4l2.A00;
                n4l = n4l2;
                return new C54771OIk(n4l, AbstractC166987dD.A0r(interfaceC09390do));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                N4L n4l3 = (N4L) this.A01;
                return new NDX(n4l3, AbstractC166987dD.A0r(n4l3.A00), AbstractC167017dG.A0j());
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C56324Ozl(this.A01, 1);
            case 14:
                C52132N5g c52132N5g = (C52132N5g) this.A01;
                interfaceC09390do = c52132N5g.A00;
                n4l = c52132N5g;
                return new C54771OIk(n4l, AbstractC166987dD.A0r(interfaceC09390do));
            case 18:
                C52132N5g c52132N5g2 = (C52132N5g) this.A01;
                return new C52314NDd(c52132N5g2, AbstractC166987dD.A0r(c52132N5g2.A00), (UpcomingEvent) AbstractC153636vY.A00(c52132N5g2.requireArguments(), UpcomingEvent.class, "upcoming_live"), AbstractC153636vY.A01(c52132N5g2.requireArguments(), "prior_module_name"), AbstractC153636vY.A01(c52132N5g2.requireArguments(), "creation_session_id"));
            case 22:
                C54771OIk c54771OIk = (C54771OIk) this.A01;
                UserSession userSession2 = c54771OIk.A01;
                AbstractC59962oe abstractC59962oe = c54771OIk.A00;
                return new NDY(abstractC59962oe, userSession2, abstractC59962oe.getModuleName(), abstractC59962oe.requireArguments().getString("prior_module_name"), abstractC59962oe.requireArguments().getString("creation_session_id"));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C56044OuG c56044OuG = (C56044OuG) this.A01;
                FragmentActivity requireActivity = c56044OuG.A03.requireActivity();
                AbstractC31171DnF.A1O(requireActivity);
                return new FRV(requireActivity, new C55886Ora(c56044OuG), c56044OuG.A05);
            case 33:
                C56044OuG c56044OuG2 = (C56044OuG) this.A01;
                return new NCH(c56044OuG2.A04, c56044OuG2.A05);
            case 34:
                view = ((OyQ) this.A01).A03;
                i = R.id.done_button;
                return view.findViewById(i);
            case 35:
                OyQ oyQ = (OyQ) this.A01;
                AbstractC59962oe abstractC59962oe2 = oyQ.A04;
                Context requireContext = abstractC59962oe2.requireContext();
                UserSession userSession3 = oyQ.A05;
                View view2 = oyQ.A03;
                ViewStub viewStub = (ViewStub) view2.findViewById(R.id.brush_palette_stub);
                ViewStub viewStub2 = (ViewStub) view2.findViewById(R.id.collapsed_brush_palette_stub);
                Resources A0N = AbstractC166997dE.A0N(abstractC59962oe2);
                C57012jc c57012jc = oyQ.A00;
                if (c57012jc == null) {
                    str = "drawingViewStubHolder";
                } else {
                    C8D9 c8d9 = oyQ.A01;
                    if (c8d9 == null) {
                        str = "colorPaletteController";
                    } else {
                        ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = oyQ.A02;
                        if (viewOnTouchListenerC1829889t == null) {
                            str = "eyedropperColorPickerController";
                        } else {
                            return new C8PR(requireContext, A0N, viewStub, viewStub2, userSession3, c57012jc, c8d9, C56259Oy6.A00, oyQ, viewOnTouchListenerC1829889t, null, oyQ, (FittingTextView) AbstractC166987dD.A17(oyQ.A06), (FittingTextView) AbstractC166987dD.A17(oyQ.A08), (EyedropperColorPickerTool) view2.findViewById(R.id.eyedropper_color_picker_tool), (FloatingIndicator) view2.findViewById(R.id.floating_stroke_width_indicator), (StrokeWidthTool) view2.findViewById(R.id.stroke_width_tool), false);
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 39:
                view = ((OyQ) this.A01).A03;
                i = R.id.undo_button;
                return view.findViewById(i);
            case 40:
                return new NBV(((OyQ) this.A01).A05);
            case Seq.NULL_REFNUM /* 41 */:
                view = (View) this.A01;
                i = R.id.iglive_eyedropper_color_picker_bitmap;
                return view.findViewById(i);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                view = (View) this.A01;
                i = R.id.eyedropper_color_picker_stub;
                return view.findViewById(i);
            case 43:
                view = (View) this.A01;
                i = R.id.eyedropper_color_picker_tool;
                return view.findViewById(i);
            case 47:
                return new NBW(((C56256Oy3) this.A01).A04);
        }
    }
}
