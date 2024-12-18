package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectShareTarget;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class V7T extends V07 implements C51D, XGm {
    public static final long A0D = AbstractC43593JPy.A09(TimeUnit.HOURS);
    public static final String __redex_internal_original_name = "DirectLocationSharingBottomSheetFragment";
    public ImageView A00;
    public TextView A01;
    public C66542ULx A02;
    public ImageUrl A03;
    public IgdsButton A04;
    public IgdsButton A05;
    public IgdsMediaButton A06;
    public IgdsMediaButton A07;
    public boolean A08;
    public boolean A09;
    public IgdsMediaButton A0A;
    public IgdsInlineSearchBox A0B;
    public final AnonymousClass987 A0C = new AnonymousClass987();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r7.A06.size() <= r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r3 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r5 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0124, code lost:
    
        if (r5 != false) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0132  */
    @Override // X.X92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void EGb(X.C69761Vuy r24) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V7T.EGb(X.Vuy):void");
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C66542ULx c66542ULx = this.A02;
        if (c66542ULx == null) {
            C14360o3.A0F("locationSharingPresenter");
            throw C00O.createAndThrow();
        }
        if (((AbstractC68892Vdo) c66542ULx).A00) {
            AbstractC66543ULy.A05(c66542ULx, "onSaveInstanceState", new Object[0]);
            bundle.putParcelable("location_sharing_presenter_state", C66542ULx.A00(c66542ULx));
        }
    }

    @Override // X.V07, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.drop_pin_button);
        this.A06 = igdsMediaButton;
        if (igdsMediaButton != null) {
            WNO.A00(igdsMediaButton, 48, this);
        }
        IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) view.requireViewById(R.id.exit_pin_button);
        this.A07 = igdsMediaButton2;
        if (igdsMediaButton2 != null) {
            WNO.A00(igdsMediaButton2, 49, this);
        }
        IgdsMediaButton igdsMediaButton3 = (IgdsMediaButton) view.requireViewById(R.id.center_location_button);
        this.A0A = igdsMediaButton3;
        if (igdsMediaButton3 != null) {
            WNO.A00(igdsMediaButton3, 50, this);
        }
        this.A04 = (IgdsButton) view.requireViewById(R.id.share_location_button);
        IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.stop_live_sharing_button);
        this.A05 = igdsButton;
        if (igdsButton != null) {
            WNO.A00(igdsButton, 51, this);
        }
        this.A01 = (TextView) view.requireViewById(R.id.location_sharing_bottom_button_footer_text);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        this.A0B = igdsInlineSearchBox;
        if (igdsInlineSearchBox != null) {
            WNO.A00(igdsInlineSearchBox, 52, this);
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0B;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.A02();
        }
        this.A00 = (ImageView) view.requireViewById(R.id.map_pin_annotation);
        C46014KYc c46014KYc = new C46014KYc(requireContext(), requireContext().getDrawable(R.drawable.direct_location_sharing_map_pin), null, AbstractC111324zv.A00(2679), 1.0f, C1H4.A01(AbstractC13880nE.A04(requireActivity(), 50)), false, false, false);
        ImageView imageView = this.A00;
        String str = "mapPinAnnotation";
        if (imageView != null) {
            imageView.setImageDrawable(c46014KYc);
            ImageView imageView2 = this.A00;
            if (imageView2 != null) {
                imageView2.setY(imageView2.getY() - (r8 / 2));
                C66542ULx c66542ULx = this.A02;
                if (c66542ULx == null) {
                    str = "locationSharingPresenter";
                } else {
                    c66542ULx.A0B(bundle);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.V07
    public final void A05(C69271Vkf c69271Vkf) {
        super.A05(c69271Vkf);
        C70453WWg c70453WWg = new C70453WWg(this);
        C70394WTw c70394WTw = c69271Vkf.A01;
        c70394WTw.A0N.add(new C70379WTh(c69271Vkf, c70453WWg, 1));
        A03();
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.V07, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        int A02 = C0f9.A02(2058204106);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Parcelable parcelable = null;
        if (bundle2 != null && (string = bundle2.getString(AbstractC111324zv.A00(1930))) != null) {
            C08730cb c08730cb = C17060sy.A01;
            InterfaceC09390do interfaceC09390do = super.A04;
            this.A03 = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).Bhu();
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                parcelable = bundle3.getParcelable(AbstractC111324zv.A00(771));
            }
            C14360o3.A0C(parcelable, AbstractC43591JPw.A00(45));
            DirectShareTarget directShareTarget = (DirectShareTarget) parcelable;
            Context requireContext = requireContext();
            UserSession userSession = (UserSession) interfaceC09390do.getValue();
            C68746VbP c68746VbP = new C68746VbP(this);
            C14360o3.A0B(userSession, 2);
            C7CR c7cr = new C7CR(requireContext, userSession);
            C69108Vhy c69108Vhy = new C69108Vhy(userSession);
            String str = ((UserSession) interfaceC09390do.getValue()).userId;
            if (!TextUtils.isEmpty(string)) {
                if (!TextUtils.isEmpty(str)) {
                    this.A02 = new C66542ULx(requireContext, this, userSession, c68746VbP, this, c69108Vhy, c7cr, directShareTarget, string, __redex_internal_original_name, "igd_composer", "igd_composer", str, true);
                    C0f9.A09(167813589, A02);
                    return;
                }
                throw new IllegalArgumentException("\"userId\" must not be null or empty");
            }
            throw new IllegalArgumentException("\"groupishId\" must not be null or empty");
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(287636948, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1185792846);
        C14360o3.A0B(layoutInflater, 0);
        this.A0C.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_location_sharing_bottomsheet, viewGroup, false);
        C0f9.A09(-1012072530, A02);
        return inflate;
    }

    @Override // X.V07, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-317738486);
        super.onDestroyView();
        C66542ULx c66542ULx = this.A02;
        if (c66542ULx == null) {
            C14360o3.A0F("locationSharingPresenter");
            throw C00O.createAndThrow();
        }
        c66542ULx.A06();
        this.A06 = null;
        this.A07 = null;
        this.A0A = null;
        this.A04 = null;
        this.A05 = null;
        this.A01 = null;
        this.A0B = null;
        C0f9.A09(-190492006, A02);
    }

    @Override // X.V07, androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1028676707);
        super.onPause();
        C66542ULx c66542ULx = this.A02;
        if (c66542ULx == null) {
            C14360o3.A0F("locationSharingPresenter");
            throw C00O.createAndThrow();
        }
        c66542ULx.A08();
        C0f9.A09(-1183861497, A02);
    }

    @Override // X.V07, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(135574572);
        super.onResume();
        C66542ULx c66542ULx = this.A02;
        if (c66542ULx == null) {
            C14360o3.A0F("locationSharingPresenter");
            throw C00O.createAndThrow();
        }
        c66542ULx.A07();
        C0f9.A09(-293883885, A02);
    }
}
