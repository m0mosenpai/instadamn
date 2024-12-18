package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.HCs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38943HCs extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "AudioTranslationsConsumptionFragment";
    public View.OnClickListener A00;
    public boolean A01;
    public final String A02 = "AutoTranslationsBottomSheetFragment";
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Py6 py6;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A03);
        boolean z = this.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(this, A0o, 0), AbstractC111324zv.A00(2558));
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, this.A02);
            int i = 0;
            AbstractC25229BEm.A19(A0f, 0);
            AbstractC25225BEi.A1P(A0f, "");
            A0f.A7v("is_translated", AbstractC31173DnH.A0e(A0f, AbstractC111324zv.A00(2002), "clips_dubbed_with_ai", z));
            Py6[] values = Py6.values();
            int length = values.length;
            while (true) {
                if (i < length) {
                    py6 = values[i];
                    if (AbstractC37303Gc4.A1Z(py6)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    py6 = null;
                    break;
                }
            }
            A0f.A8R(py6, "translated_language");
            A0f.Cht();
        }
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1898022466);
        super.onCreate(bundle);
        this.A01 = requireArguments().getBoolean(AbstractC111324zv.A00(1040));
        C0f9.A09(194384988, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C74P c74p;
        int A02 = C0f9.A02(295054782);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_auto_translations_bottom_sheet_fragment, viewGroup, false);
        ImageView A0D = AbstractC31176DnK.A0D(inflate, R.id.waveform_image_view);
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        Context context = getContext();
        if (context != null) {
            String A022 = AbstractC56412ia.A02(context.getResources(), R.drawable.meta_ai_waveform_alpha);
            if (A022 == null) {
                A022 = "";
            }
            String valueOf = String.valueOf(R.drawable.meta_ai_waveform_alpha);
            c74p = new C74P(context, A0r, new C74V(-1, context.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size), AbstractC166997dE.A04(context, R.dimen.audio_dubbing_gen_ai_gif_size)), C05F.A01, A022, valueOf, (String) null, 1.0f, context.getColor(R.color.fds_transparent), context.getColor(R.color.fds_transparent), false);
            c74p.A0A(1);
        } else {
            c74p = null;
        }
        A0D.setImageDrawable(c74p);
        Context context2 = getContext();
        if (context2 != null) {
            AbstractC31178DnM.A0C(inflate).setText(getString(2131953302));
            TextView A0N = AbstractC167007dF.A0N(inflate, R.id.description);
            String A0v = AbstractC25227BEk.A0v(this, 2131953301);
            C52790NXz c52790NXz = new C52790NXz(context2, this, A0v, AbstractC31174DnI.A02(context2));
            AbstractC25227BEk.A11(A0N);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31174DnI.A0w(this, A0v, 2131953299));
            AnonymousClass773.A05(A0H, c52790NXz, A0v);
            A0N.setText(A0H);
        }
        if (this.A00 != null) {
            IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.audio_dubbing_toggle);
            igdsListCell.setTextCellType(EnumC53237Nga.A04);
            igdsListCell.A06(2131953300);
            C0fQ.A00(this.A00, igdsListCell);
        }
        C0f9.A09(798129135, A02);
        return inflate;
    }
}
