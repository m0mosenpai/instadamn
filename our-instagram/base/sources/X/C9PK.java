package X;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.9PK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9PK {
    public EnumC46148Kbm A00;
    public final int A01;
    public final C8BN A02;
    public final ImmutableList A03;
    public final UserSession A04;

    public C9PK(C8BN c8bn, ImmutableList immutableList, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel) {
        int i;
        AbstractC167007dF.A1F(userSession, 1, clipsCreationViewModel);
        this.A04 = userSession;
        this.A02 = c8bn;
        this.A03 = immutableList;
        this.A00 = EnumC46148Kbm.A04;
        C84B c84b = (C84B) clipsCreationViewModel.A0F.A02();
        if (c84b != null) {
            i = c84b.A00;
        } else {
            i = 0;
        }
        C185368Kc c185368Kc = clipsCreationViewModel.A0L.A00;
        if (c185368Kc != null) {
            int A0E = clipsCreationViewModel.A0E();
            if ((i == 0 && !c185368Kc.A07) || i > A0E) {
                i = A0E;
            }
        }
        this.A01 = i;
    }

    public final boolean A01(View view, JIN jin) {
        int i;
        C14360o3.A0B(view, 0);
        Integer A00 = A00(jin);
        if (A00 == C05F.A00) {
            return true;
        }
        int intValue = A00.intValue();
        if (intValue != 1) {
            i = 2131968066;
            if (intValue != 3) {
                i = 2131968068;
            }
        } else {
            i = 2131955574;
            if (this.A00.ordinal() == 2) {
                i = 2131955575;
            }
        }
        C9GR.A07(view.getContext(), i);
        return false;
    }

    public final Integer A00(JIN jin) {
        C8BN c8bn;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        C42733IvT c42733IvT;
        C8BN c8bn2;
        if (this.A00 != EnumC46148Kbm.A03) {
            return C05F.A01;
        }
        if (jin.CAB() < this.A01 && (c8bn2 = this.A02) != C8BN.TIMELINE_AUDIO_GHOST_TRACK && c8bn2 != C8BN.TIMELINE_AUDIO_REPLACE && c8bn2 != C8BN.TIMELINE_TOOLBAR_AUDIO_OPTION && !AbstractC185298Jv.A00(this.A04)) {
            return C05F.A0C;
        }
        OriginalAudioSubtype originalAudioSubtype = null;
        if ((jin instanceof C42733IvT) && (c42733IvT = (C42733IvT) jin) != null) {
            originalAudioSubtype = c42733IvT.A02.BZj();
        }
        if (originalAudioSubtype == OriginalAudioSubtype.A06 && ((c8bn = this.A02) == C8BN.TIMELINE_TOOLBAR_AUDIO_OPTION || c8bn == C8BN.TIMELINE_AUDIO_GHOST_TRACK ? !((immutableList = this.A03) == null || !(!immutableList.isEmpty())) : !((immutableList2 = this.A03) == null || immutableList2.size() < 2))) {
            return C05F.A0N;
        }
        return C05F.A00;
    }
}
