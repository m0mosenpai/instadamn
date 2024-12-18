package X;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.Dbi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30499Dbi extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30499Dbi(Object obj, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public static int A00(C30499Dbi c30499Dbi) {
        return AbstractC128295qy.A00(c30499Dbi.A01 | 1);
    }

    public static void A01(C5UU c5uu, Object obj, int i, int i2) {
        c5uu.A06 = new C30499Dbi(obj, i, i2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl;
        int i;
        switch (this.A00) {
            case 0:
                ((BH5) this.A02).A00(AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 1:
                C5XX.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                break;
            case 2:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-101476772, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
                    }
                    BZb bZb = ((C28749Cmh) this.A02).A00;
                    int i2 = this.A01;
                    C6Nx AXC = bZb.A02.AXC(i2);
                    ((C28758Cmq) AXC.A02).A01.invoke(C28750Cmi.A00, Integer.valueOf(i2 - AXC.A01), c5Tl, 6);
                    if (C0fH.A02()) {
                        i = 796922447;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 3:
                AbstractC137986Mz.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16610sE) this.A02, A00(this));
                break;
            case 4:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1501358099, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:78)");
                    }
                    C25740BZc c25740BZc = ((C28768Cn0) this.A02).A01;
                    int i3 = this.A01;
                    C6Nx AXC2 = c25740BZc.A00.AXC(i3);
                    ((C28759Cmr) AXC2.A02).A01.invoke(CZQ.A00, Integer.valueOf(i3 - AXC2.A01), c5Tl, 6);
                    if (C0fH.A02()) {
                        i = 1460730072;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 5:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1757381788, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:208)");
                    }
                    C25654BVq c25654BVq = (C25654BVq) this.A02;
                    C6KS c6ks = c25654BVq.A00;
                    int i4 = this.A01;
                    C6Nx AXC3 = c6ks.A00().AXC(i4);
                    ((BWC) AXC3.A02).A00.invoke(c25654BVq.A01, Integer.valueOf(i4 - AXC3.A01), c5Tl, AbstractC25227BEk.A0p());
                    if (C0fH.A02()) {
                        i = -1813875092;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 6:
                BXG.A04((BXF) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 7:
                ((C28210Cc8) this.A02).A01(AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 8:
                ((C5TM) this.A02).A06(AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 9:
                CXF.A01(AbstractC25226BEj.A0S(obj, obj2), (ImageUrl) this.A02, A00(this));
                break;
            case 10:
                CXL.A01(AbstractC25226BEj.A0S(obj, obj2), (C45126Jxv) this.A02, A00(this));
                break;
            case 11:
                AbstractC27518CCo.A00((Activity) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC27522CCs.A00((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                CD0.A00((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 14:
                AbstractC28496Chp.A07((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case Process.SIGTERM /* 15 */:
                AbstractC28496Chp.A08((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 16:
                AbstractC28292Cde.A02(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case 17:
                AbstractC28460ChC.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                break;
            case 18:
                AbstractC27535CDf.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                break;
            case Process.SIGSTOP /* 19 */:
                AbstractC25643BVf.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16620sF) this.A02, A00(this));
                break;
            case 20:
                AbstractC136596Gn.A06((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 21:
                AbstractC136596Gn.A07((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 22:
                AbstractC27561CEg.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case 23:
                AbstractC28033CXh.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                break;
            case 24:
                AbstractC28044CXw.A01(AbstractC25226BEj.A0S(obj, obj2), (CUC) this.A02, A00(this));
                break;
            case 25:
                AbstractC27595CFo.A00(AbstractC25226BEj.A0S(obj, obj2), (C169217gu) this.A02, A00(this));
                break;
            case 26:
                AbstractC27600CFt.A00(AbstractC25226BEj.A0S(obj, obj2), (ImageUrl) this.A02, A00(this));
                break;
            case 27:
                AbstractC28386Cfp.A03((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 28:
                CG6.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                ((C26086BgF) this.A02).A02(AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 30:
                CGC.A00(AbstractC25226BEj.A0S(obj, obj2), (C26087BgG) this.A02, A00(this));
                break;
            case 31:
                AbstractC25708BXt.A05(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC30938Dis) this.A02, A00(this));
                break;
            case 32:
                BI4.A0B(AbstractC25226BEj.A0S(obj, obj2), (ImageUrl) this.A02, A00(this));
                break;
            case 33:
                BY1.A03(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC30804Dgf) this.A02, A00(this));
                break;
            case 34:
                AbstractC117995Vj.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16620sF) this.A02, A00(this));
                break;
            case 35:
                BII.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                break;
            case 36:
            case 37:
            default:
                CY4.A01(AbstractC25226BEj.A0S(obj, obj2), (List) this.A02, A00(this));
                break;
            case 38:
                AbstractC27626CGx.A00((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 39:
                AbstractC28502Chv.A08((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 40:
                AbstractC28502Chv.A06(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case Seq.NULL_REFNUM /* 41 */:
                AbstractC28502Chv.A00((Bitmap) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                AbstractC28502Chv.A09((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 43:
                AbstractC28502Chv.A0A((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 44:
                CHC.A00((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 45:
                AbstractC28390Cft.A03((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                CHI.A00((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 47:
                AbstractC28308Cdu.A02((InterfaceC16820sZ) this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 48:
                CYH.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, A00(this));
                break;
            case 49:
                AbstractC28158Cb5.A00(AbstractC25226BEj.A0S(obj, obj2), (C26200BiQ) this.A02, A00(this));
                break;
        }
        return C0eB.A00;
    }
}
