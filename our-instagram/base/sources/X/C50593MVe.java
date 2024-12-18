package X;

import com.facebook.avatar.expresso.odr.asset.ODRAssetManager;
import com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler;
import com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt;
import com.instagram.creation.capture.quickcapture.autocreatedclips.util.mediastitching.ClipsMediaStitchingHelper;

/* renamed from: X.MVe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50593MVe extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public final int A0B;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A0B) {
            case 0:
                A01(obj, this);
                return ((MY6) this.A0A).A00(this);
            case 1:
                A01(obj, this);
                return ((ODRAssetManager) this.A0A).A02(null, null, null, this, null);
            case 2:
                A01(obj, this);
                return ((ODRCDLHandler.Companion) this.A0A).A00(null, null, null, null, null, null, this, null, null);
            case 3:
                A01(obj, this);
                return ((AvatarRetextureSparkPreviewController) this.A0A).A00(null, null, null, null, null, this, null);
            case 4:
                A01(obj, this);
                return CheckoutHandler.A01(null, (CheckoutHandler) this.A0A, null, null, null, null, null, null, this);
            case 5:
                this.A0A = obj;
                this.A00 |= Integer.MIN_VALUE;
                return CommentPostingRequestExtensionsKt.A02(null, null, null, null, null, null, null, null, null, this);
            case 6:
                A01(obj, this);
                return ClipsMediaStitchingHelper.A01(null, null, (ClipsMediaStitchingHelper) this.A0A, null, null, null, null, null, this);
            case 7:
                A01(obj, this);
                return AbstractC55145Od4.A01(this.A0A, this);
            case 8:
                A01(obj, this);
                return ((C50594MVf) this.A0A).A04(null, null, null, null, null, null, null, null, this);
            default:
                A01(obj, this);
                return C50594MVf.A01(null, null, null, null, (C50594MVf) this.A0A, null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50593MVe(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A0B = i;
        this.A0A = obj;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, C50593MVe c50593MVe) {
        c50593MVe.A01 = obj;
        c50593MVe.A02 = obj2;
        c50593MVe.A03 = obj3;
        c50593MVe.A04 = obj4;
    }

    public static void A01(Object obj, C50593MVe c50593MVe) {
        c50593MVe.A09 = obj;
        c50593MVe.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof C50593MVe) && ((C50593MVe) obj).A0B == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50593MVe(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0B = 5;
    }
}
