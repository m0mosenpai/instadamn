package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.music.common.model.AudioOverlayTrack;

/* loaded from: classes8.dex */
public final class KDB extends AbstractC59962oe implements InterfaceC189488aT, C51D, JHC {
    public static final String __redex_internal_original_name = "MusicNotesEditorFragment";
    public C47363KwC A00;
    public Jn6 A01;
    public AudioOverlayTrack A02;
    public C189988bH A03;
    public Integer A04;
    public boolean A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "music_notes_editor_sheet";
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25230BEn.A0k(r9, 0), 36328048865328185L) != false) goto L17;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDB.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.JHC
    public final void DUd() {
        C189988bH c189988bH = this.A03;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0H();
    }

    @Override // X.JHC
    public final void DUe() {
        C189988bH c189988bH = this.A03;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0G();
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
        return AbstractC166987dD.A0n(this.A06);
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

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        C189988bH c189988bH = this.A03;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0G();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
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
        boolean z;
        AudioOverlayTrack audioOverlayTrack;
        int A02 = C0f9.A02(-1349369046);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_existing_track");
        } else {
            z = false;
        }
        this.A05 = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (audioOverlayTrack = (AudioOverlayTrack) bundle3.getParcelable("selected_audio_track")) != null) {
            this.A02 = audioOverlayTrack;
            C0f9.A09(-1724619064, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-1777069935, A02);
            throw A0g;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-560743555);
        C14360o3.A0B(layoutInflater, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A06, 0), 36328048865328185L);
        int i = R.layout.fragment_profile_music_editor;
        if (A06) {
            i = R.layout.fragment_music_note_editor;
        }
        if (!C1H6.A03()) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, i, false);
        C0f9.A09(954043366, A02);
        return A0C;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-599945161);
        super.onDestroyView();
        if (C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(this.A06), 36326378123114328L)) {
            C189988bH c189988bH = this.A03;
            if (c189988bH == null) {
                JQ0.A0t();
                throw C00O.createAndThrow();
            }
            AnonymousClass879 anonymousClass879 = c189988bH.A0b;
            if (anonymousClass879 != null) {
                anonymousClass879.release();
            }
        }
        C0f9.A09(-2015351789, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1307121715);
        super.onPause();
        C189988bH c189988bH = this.A03;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0I();
        C0f9.A09(1832624717, A02);
    }
}
