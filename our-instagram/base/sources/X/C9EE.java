package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import go.Seq;

/* renamed from: X.9EE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9EE extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9EE(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        IgProgressImageView igProgressImageView;
        ImageView.ScaleType scaleType;
        InterfaceC56392iX interfaceC56392iX;
        switch (this.A00) {
            case 0:
                igProgressImageView = (IgProgressImageView) this.A01;
                scaleType = ImageView.ScaleType.FIT_CENTER;
                igProgressImageView.setScaleType(scaleType);
                return C0eB.A00;
            case 1:
                igProgressImageView = (IgProgressImageView) this.A01;
                scaleType = ImageView.ScaleType.CENTER_CROP;
                igProgressImageView.setScaleType(scaleType);
                return C0eB.A00;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                return new C77043cq(((C692439k) this.A01).A05.A01());
            case 10:
                return new CPA((CP9) ((C77043cq) this.A01).A00.A04.getValue());
            case 11:
                return new C100584fN((C100544fJ) ((C76303ba) ((C77043cq) this.A01).A00.A03.getValue()).A02.getValue());
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C22852A5v((C76843cW) ((C77043cq) this.A01).A00.A05.getValue());
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C107124sI((C100564fL) ((C77043cq) this.A01).A00.A07.getValue());
            case 14:
                return new C99824e4((C76423bm) ((C77043cq) this.A01).A00.A08.getValue());
            case Process.SIGTERM /* 15 */:
                return new C100624fR(((C77043cq) this.A01).A00);
            case 16:
                return new C77793e4((C76483bs) ((C77043cq) this.A01).A00.A09.getValue());
            case 17:
                return new C77963eO((C77893eH) ((C77043cq) this.A01).A00.A0A.getValue());
            case 18:
                return new CWU((CRZ) ((C77043cq) this.A01).A00.A0B.getValue());
            case Process.SIGSTOP /* 19 */:
                return new C77643do((C76313bb) ((C76303ba) ((C77043cq) this.A01).A00.A03.getValue()).A03.getValue());
            case 20:
                return new C77613dl((C76683cG) ((C77043cq) this.A01).A00.A0C.getValue());
            case 21:
                C76683cG c76683cG = (C76683cG) this.A01;
                return new C115005Hv(c76683cG.A00, c76683cG.A01);
            case 22:
                C75563aN c75563aN = (C75563aN) this.A01;
                return new C76303ba(c75563aN.A00, c75563aN.A01);
            case 23:
                return new CP9(((C75563aN) this.A01).A01);
            case 24:
                C75563aN c75563aN2 = (C75563aN) this.A01;
                return new C76843cW(c75563aN2.A00, c75563aN2.A01);
            case 25:
                return new C76363bg(((C75563aN) this.A01).A00);
            case 26:
                return new C100564fL(((C75563aN) this.A01).A01);
            case 27:
                return new C76423bm(((C75563aN) this.A01).A01);
            case 28:
                return new C76483bs(((C75563aN) this.A01).A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C77893eH(((C75563aN) this.A01).A00);
            case 30:
                C75563aN c75563aN3 = (C75563aN) this.A01;
                return new CRZ(c75563aN3.A00, c75563aN3.A01, c75563aN3.A02);
            case 31:
                C75563aN c75563aN4 = (C75563aN) this.A01;
                return new C76683cG(c75563aN4.A00, c75563aN4.A01);
            case 32:
                interfaceC56392iX = ((C81283jy) this.A01).A0K;
                return interfaceC56392iX.getView();
            case 33:
                interfaceC56392iX = ((C81283jy) this.A01).A0L;
                return interfaceC56392iX.getView();
            case 34:
                interfaceC56392iX = ((C81283jy) this.A01).A0O;
                return interfaceC56392iX.getView();
            case 35:
                C81283jy c81283jy = (C81283jy) this.A01;
                View view = c81283jy.A0P.getView();
                view.getLayoutParams().height = c81283jy.A0C;
                view.requestLayout();
                return view;
            case 36:
                interfaceC56392iX = ((C81283jy) this.A01).A0S;
                return interfaceC56392iX.getView();
            case 37:
                interfaceC56392iX = ((C81283jy) this.A01).A0T;
                return interfaceC56392iX.getView();
            case 38:
                interfaceC56392iX = ((C81283jy) this.A01).A0U;
                return interfaceC56392iX.getView();
            case 39:
                C81283jy c81283jy2 = (C81283jy) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View requireViewById = c81283jy2.A0E.requireViewById(R.id.seen_state);
                C14360o3.A07(requireViewById);
                GradientSpinner gradientSpinner = (GradientSpinner) requireViewById;
                if (!C14640oc.A02()) {
                    return gradientSpinner;
                }
                Context context = gradientSpinner.getContext();
                C14360o3.A07(context);
                float A04 = AbstractC14670of.A04(context, R.dimen.album_preview_add_item_margin, R.dimen.abc_star_medium);
                float A03 = AbstractC14670of.A03(context, R.dimen.album_preview_add_item_margin, R.dimen.afi_indicator_arrow_margin_top);
                float A02 = AbstractC14670of.A02(context, R.dimen.album_preview_add_item_margin);
                ViewGroup.LayoutParams layoutParams = gradientSpinner.getLayoutParams();
                if (layoutParams != null) {
                    int i2 = (int) A04;
                    layoutParams.width = i2;
                    layoutParams.height = i2;
                }
                gradientSpinner.A02 = A03;
                gradientSpinner.A00 = A02;
                gradientSpinner.invalidate();
                return gradientSpinner;
            case 40:
                interfaceC56392iX = ((C81283jy) this.A01).A0Z;
                return interfaceC56392iX.getView();
            case Seq.NULL_REFNUM /* 41 */:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
                return this.A01;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((C76623c7) this.A01).A01;
            case 43:
                return C0eB.A00;
            case 48:
                return new C100544fJ(((C76303ba) this.A01).A01);
            case 49:
                C76303ba c76303ba = (C76303ba) this.A01;
                return new C76313bb(c76303ba.A00, c76303ba.A01);
        }
    }
}
