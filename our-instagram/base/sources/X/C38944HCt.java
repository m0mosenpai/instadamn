package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.user.model.User;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.HCt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38944HCt extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "CountdownStickerConsumptionSheetFragment";
    public User A00;
    public User A01;
    public IGA A02;
    public String A03;
    public AlC A04;
    public boolean A05;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final String A06 = "reel_countdown_sticker_consumption_sheet_fragment";

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean A1T;
        FLC flc;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AlC alC = this.A04;
        if (alC != null) {
            User user = alC.A00.A00;
            Context context = view.getContext();
            TextView A0N = AbstractC167007dF.A0N(view, R.id.countdown_consumption_sheet_title);
            String str = alC.A00.A0B;
            if (str == null) {
                str = "";
            }
            A0N.setText(AnonymousClass001.A0E(str, '\"', '\"'));
            TextView A0N2 = AbstractC167007dF.A0N(view, R.id.countdown_consumption_sheet_subtitle);
            A0N2.setText(DateFormat.getDateTimeInstance(0, 3).format(new Date(TimeUnit.SECONDS.toMillis(alC.A00()))));
            if (this.A01 != null && AbstractC141456aO.A03(alC)) {
                ViewGroup viewGroup = (ViewGroup) AbstractC166987dD.A0c(view, R.id.countdown_consumption_sheet_container);
                AbstractC13880nE.A0U(A0N2, 0);
                View A0R = AbstractC25226BEj.A0R(getLayoutInflater(), viewGroup, R.layout.countdown_sticker_consumption_sheet_actions_container, true);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                NXU A0N3 = AbstractC37304Gc5.A0N(A0R, R.id.countdown_consumption_sheet_follow_button);
                String A0p = AbstractC166997dE.A0p(context, 2131956862);
                String A0p2 = AbstractC166997dE.A0p(context, 2131956864);
                InterfaceC09390do interfaceC09390do = this.A07;
                C57742kn A00 = C57742kn.A00(AbstractC166987dD.A0r(interfaceC09390do));
                String str2 = alC.A00.A06;
                if (str2 != null && A00.A0J(str2)) {
                    String str3 = alC.A00.A06;
                    if (str3 != null && (flc = (FLC) A00.A05(str3)) != null) {
                        A1T = AbstractC166997dE.A1Z(flc.A00, true);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    A1T = AbstractC167007dF.A1T(alC.A00.A03);
                }
                boolean z = !AbstractC141456aO.A01(alC);
                A0N3.A01.setSelected(A1T);
                String str4 = this.A06;
                C14360o3.A0B(str4, 2);
                Drawable drawable = context.getDrawable(R.drawable.countdown_sticker_consumption_sheet_follow_button);
                String str5 = A0p;
                if (A1T) {
                    str5 = A0p2;
                }
                AbstractC54239NyK.A00(A0N3, new OFM(null, drawable, null, new HJC(alC, A0N3, this, A0p2, A0p), str5, str4, 1.0f, false, z, false));
                AbstractC54239NyK.A00(AbstractC37304Gc5.A0N(A0R, R.id.countdown_consumption_sheet_reshare_button), new OFM(context.getDrawable(R.drawable.empty_story_badge_elevated), null, AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do).Bhu(), new C43890Jax(7, context, user, this), context.getString(2131956865), str4, 1.0f, false, true, false));
                if (!this.A05) {
                    TextView A0N4 = AbstractC167007dF.A0N(A0R, R.id.countdown_consumption_sheet_footer);
                    if (user == null) {
                        user = this.A01;
                    }
                    C14360o3.A0C(user, AbstractC43591JPw.A00(47));
                    String username = user.getUsername();
                    AnonymousClass773.A07(new C38301Gsk(1, user, this), A0N4, username, AbstractC31177DnL.A0b(context, username, 2131956866));
                }
            }
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
        return this.A06;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
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
    public final void onBottomSheetClosed() {
        User user = this.A00;
        if (user != null) {
            IGA iga = this.A02;
            if (iga != null) {
                C146036i0 c146036i0 = iga.A01;
                C1OU.A08(c146036i0.A07, C22P.A21, c146036i0.A09, iga.A00, user);
            }
            this.A00 = null;
        }
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
        int A02 = C0f9.A02(-740792020);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getString(AbstractC111324zv.A00(1295));
        this.A05 = requireArguments.getBoolean(AbstractC111324zv.A00(4784), false);
        InterfaceC09390do interfaceC09390do = this.A07;
        this.A01 = AnonymousClass189.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(requireArguments.getString(AbstractC111324zv.A00(4188)));
        try {
            String string = requireArguments.getString(AbstractC111324zv.A00(4187));
            if (string != null) {
                URL parseFromJson = AbstractC69879Vx4.parseFromJson(C07950bF.A04.A01(AbstractC166987dD.A0r(interfaceC09390do), string));
                C14360o3.A07(parseFromJson);
                this.A04 = new AlC(parseFromJson, AlC.A03);
            }
        } catch (IOException unused) {
            C0w9.A03(__redex_internal_original_name, "Could not parse json CountdownStickerModel for the countdown consumption sheet.");
        }
        C0f9.A09(1410371853, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(738074627);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_countdown_sticker_consumption_sheet, viewGroup, false);
        C0f9.A09(-1601526395, A02);
        return inflate;
    }
}
