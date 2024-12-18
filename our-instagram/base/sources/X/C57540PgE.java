package X;

import android.view.View;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.Serializable;

/* renamed from: X.PgE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57540PgE extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57540PgE(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57540PgE(obj, i));
    }

    public static InterfaceC09390do A01(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57540PgE(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        View view2;
        int i2;
        InterfaceC09390do interfaceC09390do;
        switch (this.A00) {
            case 0:
                view = (View) this.A01;
                i = R.id.profile_picture;
                return view.findViewById(i);
            case 1:
                view = (View) this.A01;
                i = R.id.username;
                return view.findViewById(i);
            case 2:
                view = (View) this.A01;
                i = R.id.wave_button;
                return view.findViewById(i);
            case 3:
            case 8:
            case 11:
            case 17:
            case 22:
            case 26:
            case 40:
            case 43:
            case 47:
                return this.A01;
            case 4:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 18:
            case 23:
            case 27:
            case Seq.NULL_REFNUM /* 41 */:
            case 44:
            case 48:
                return AbstractC25226BEj.A1C(this.A01);
            case 5:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            case 24:
            case 28:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 45:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 6:
                view2 = ((AbstractC56160OwS) this.A01).A05;
                i2 = R.id.iglive_label_image_stub;
                return C3PW.A00(view2, i2);
            case 7:
                return new NBL((UserSession) this.A01);
            case 14:
                C52823NZg c52823NZg = (C52823NZg) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c52823NZg.A00);
                Serializable serializable = c52823NZg.requireArguments().getSerializable("live_view_mode");
                C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.enums.IgLiveViewMode");
                return new NCC(A0r, (EnumC142806cg) serializable);
            case Process.SIGTERM /* 15 */:
                EnumC142806cg enumC142806cg = ((N7x) this.A01).A00;
                if (enumC142806cg != null) {
                    C52823NZg c52823NZg2 = new C52823NZg();
                    AbstractC25233BEq.A15(c52823NZg2, "live_view_mode", enumC142806cg);
                    return c52823NZg2;
                }
                C14360o3.A0F("viewMode");
                throw C00O.createAndThrow();
            case 16:
                interfaceC09390do = ((N7x) this.A01).A03;
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
                C57164PZi.A03(A0Z, AbstractC141776au.A00(A0Z), 13);
                return C0eB.A00;
            case 20:
                N7x n7x = (N7x) this.A01;
                EnumC142806cg enumC142806cg2 = n7x.A00;
                if (enumC142806cg2 != null) {
                    int ordinal = enumC142806cg2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 2) {
                            if (ordinal == 1) {
                                return new NCD(n7x, AbstractC166987dD.A0r(n7x.A02));
                            }
                            throw B4Z.A00();
                        }
                        return new NBM(AbstractC166987dD.A0r(n7x.A02));
                    }
                    return new NBN(AbstractC166987dD.A0r(n7x.A02));
                }
                C14360o3.A0F("viewMode");
                throw C00O.createAndThrow();
            case 21:
                interfaceC09390do = ((C52185N7w) this.A01).A02;
                AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(interfaceC09390do);
                C57164PZi.A03(A0Z2, AbstractC141776au.A00(A0Z2), 13);
                return C0eB.A00;
            case 25:
                C52185N7w c52185N7w = (C52185N7w) this.A01;
                EnumC142806cg enumC142806cg3 = c52185N7w.A00;
                if (enumC142806cg3 != null) {
                    int ordinal2 = enumC142806cg3.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 2) {
                            if (ordinal2 == 1) {
                                return new NCD(c52185N7w, AbstractC166987dD.A0r(c52185N7w.A01));
                            }
                            throw B4Z.A00();
                        }
                        return new NBM(AbstractC166987dD.A0r(c52185N7w.A01));
                    }
                    return new NBN(AbstractC166987dD.A0r(c52185N7w.A01));
                }
                C14360o3.A0F("viewMode");
                throw C00O.createAndThrow();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                view2 = (View) this.A01;
                i2 = R.id.iglive_capture_paused_stub;
                return C3PW.A00(view2, i2);
            case 30:
                view = (View) this.A01;
                i = R.id.iglive_cancel_button;
                return view.findViewById(i);
            case 31:
                view = (View) this.A01;
                i = R.id.iglive_capture_on;
                return view.findViewById(i);
            case 32:
                view = (View) this.A01;
                i = R.id.iglive_connecting_gradient_spinner;
                return view.findViewById(i);
            case 33:
                view = (View) this.A01;
                i = R.id.iglive_igds_cancel_button;
                return view.findViewById(i);
            case 34:
                view = MSZ.A0J(((C56159OwR) this.A01).A07);
                i = R.id.rm_checkpoint_body;
                return view.findViewById(i);
            case 35:
                view2 = (View) this.A01;
                i2 = R.id.iglive_capture_rights_manager_checkpoint_stub;
                return C3PW.A00(view2, i2);
            case 36:
                view = MSZ.A0J(((C56159OwR) this.A01).A07);
                i = R.id.finish_button;
                return view.findViewById(i);
            case 37:
                view = MSZ.A0J(((C56159OwR) this.A01).A07);
                i = R.id.resume_button;
                return view.findViewById(i);
            case 38:
                view = (View) this.A01;
                i = R.id.iglive_prepare_text_view;
                return view.findViewById(i);
            case 39:
                view = (View) this.A01;
                i = R.id.iglive_capture_prepare;
                return view.findViewById(i);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new NCJ(AbstractC166987dD.A0r(((N4G) this.A01).A00), true);
        }
    }
}
