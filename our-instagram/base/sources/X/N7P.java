package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle;
import com.instagram.creation.capture.quickcapture.sundial.widget.durationpickerview.DurationPickerView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class N7P extends AbstractC59962oe implements C51D, InterfaceC57819Pkl {
    public static final String __redex_internal_original_name = "ClipsDurationPickerFragment";
    public int A00;
    public int A01;
    public InterfaceC185498Kr A02;
    public C8JT A03;
    public P60 A04;
    public OHt A05;
    public OHt A06;
    public InterfaceC57940Pmk A07;
    public AudioOverlayTrack A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_duration_picker";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        View view2;
        RelativeLayout.LayoutParams layoutParams;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC23249ASk.A00(AbstractC166997dE.A0S(view, R.id.set_timer_button), 36, this);
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(view, R.id.clear_timer_button);
        igdsButton.setText(2131955477);
        ViewOnClickListenerC23249ASk.A00(igdsButton, 37, this);
        Bundle bundle2 = this.mArguments;
        AudioOverlayTrack audioOverlayTrack = null;
        if (bundle2 != null) {
            audioOverlayTrack = (AudioOverlayTrack) bundle2.getParcelable("clips_track");
        }
        this.A08 = audioOverlayTrack;
        Bundle bundle3 = this.mArguments;
        int i2 = 0;
        if (bundle3 != null) {
            i = bundle3.getInt("recorded_duration_in_ms");
        } else {
            i = 0;
        }
        this.A01 = i;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            i2 = bundle4.getInt("next_segment_duration_in_ms");
        }
        this.A00 = i2;
        int i3 = this.A01 + i2;
        Context A0L = AbstractC166997dE.A0L(view);
        InterfaceC09390do interfaceC09390do = this.A0A;
        this.A04 = new P60(A0L, AbstractC166987dD.A0r(interfaceC09390do), this, new C677733r(A0L, AbstractC166987dD.A0r(interfaceC09390do)));
        InterfaceC185498Kr interfaceC185498Kr = this.A02;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        View A0U = AbstractC167017dG.A0U(view, R.id.countdown_container_stub);
        CountdownDurationToggle countdownDurationToggle = (CountdownDurationToggle) AbstractC166997dE.A0R(view, R.id.countdown_duration_toggle);
        View A0S = AbstractC166997dE.A0S(A0U, R.id.countdown_label);
        ViewGroup.LayoutParams layoutParams2 = A0S.getLayoutParams();
        if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.addRule(0, R.id.countdown_duration_toggle);
            A0S.setLayoutParams(layoutParams);
        }
        C14360o3.A0B(A0r, 0);
        int A00 = C8KL.A00(A0r);
        if (A00 != countdownDurationToggle.A00) {
            countdownDurationToggle.A00 = A00;
            CountdownDurationToggle.A00(countdownDurationToggle);
        }
        countdownDurationToggle.A03 = interfaceC185498Kr;
        C0fQ.A00(new ViewOnClickListenerC55464OkJ(35, A0r, countdownDurationToggle), countdownDurationToggle);
        OHt oHt = new OHt(AbstractC167007dF.A0N(view, R.id.start_time));
        this.A06 = oHt;
        oHt.A00(this.A01);
        OHt oHt2 = new OHt(AbstractC167007dF.A0N(view, R.id.end_time));
        this.A05 = oHt2;
        oHt2.A00(i3);
        InterfaceC57940Pmk interfaceC57940Pmk = (InterfaceC57940Pmk) view.requireViewById(R.id.duration_picker);
        this.A07 = interfaceC57940Pmk;
        if (interfaceC57940Pmk != null) {
            DurationPickerView durationPickerView = (DurationPickerView) interfaceC57940Pmk;
            durationPickerView.A03 = this;
            int A0E = ((ClipsCreationViewModel) this.A09.getValue()).A0E();
            int i4 = this.A01;
            int i5 = this.A00;
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 4);
            durationPickerView.A01 = A0E;
            C8RH c8rh = durationPickerView.A0D;
            float f = A0E;
            c8rh.setMinimumRange(100.0f / f);
            c8rh.A05(i4 / f, (i4 + i5) / f);
            durationPickerView.invalidate();
            durationPickerView.A05 = new float[c16930sl.size()];
            Iterator it = c16930sl.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    AbstractC16960so.A1U();
                    break;
                } else {
                    durationPickerView.A05[i6] = AbstractC166987dD.A0H(next) / f;
                    i6 = i7;
                }
            }
            c8rh.setSnapValues(durationPickerView.A05);
            Object obj = this.A07;
            if (obj != null) {
                if ((obj instanceof View) && (view2 = (View) obj) != null) {
                    AbstractC13880nE.A0n(view2, view);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("durationPicker");
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
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
        C8JT c8jt = this.A03;
        if (c8jt != null) {
            C8JT.A0Z(c8jt);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N7P() {
        C57523Pfx A00 = C57523Pfx.A00(this, 11);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C57523Pfx.A00(C57523Pfx.A00(this, 12), 13));
        this.A09 = AbstractC25225BEi.A0a(C57523Pfx.A00(A002, 14), A00, new C57256Pbe(7, null, A002), AbstractC25225BEi.A1D(ClipsCreationViewModel.class));
        this.A0A = AbstractC60492pY.A02(this);
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-354527127);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_duration_picker, viewGroup, false);
        C0f9.A09(-1311513298, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        String str;
        int A02 = C0f9.A02(-536563020);
        super.onPause();
        C8JT c8jt = this.A03;
        if (c8jt != null) {
            c8jt.A1T.Elu();
        }
        P60 p60 = this.A04;
        if (p60 == null) {
            str = "player";
        } else {
            p60.A02.release();
            InterfaceC57940Pmk interfaceC57940Pmk = this.A07;
            if (interfaceC57940Pmk == null) {
                str = "durationPicker";
            } else {
                DurationPickerView durationPickerView = (DurationPickerView) interfaceC57940Pmk;
                if (durationPickerView.A04) {
                    durationPickerView.A04 = false;
                    durationPickerView.A02 = System.currentTimeMillis();
                    durationPickerView.invalidate();
                }
                C0f9.A09(709385938, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        MusicAssetModel musicAssetModel;
        int A02 = C0f9.A02(1567102823);
        super.onResume();
        C8JT c8jt = this.A03;
        if (c8jt != null) {
            c8jt.A1T.Elf(c8jt.A11);
        }
        AudioOverlayTrack audioOverlayTrack = this.A08;
        if (audioOverlayTrack != null && (musicAssetModel = audioOverlayTrack.A08) != null) {
            P60 p60 = this.A04;
            if (p60 == null) {
                C14360o3.A0F("player");
                throw C00O.createAndThrow();
            }
            p60.A00(audioOverlayTrack, musicAssetModel, this.A01, this.A00, 0);
        }
        C0f9.A09(365526035, A02);
    }
}
