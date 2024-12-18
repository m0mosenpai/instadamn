package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.MediaCaptureFragment;

/* renamed from: X.JhV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44279JhV implements MQQ {
    public final /* synthetic */ MediaCaptureFragment A00;

    @Override // X.MQQ
    public final void Drj(float f, float f2) {
        float f3;
        MediaCaptureFragment mediaCaptureFragment;
        if (f <= 0.0f) {
            MediaCaptureFragment mediaCaptureFragment2 = this.A00;
            MediaCaptureFragment.A02(mediaCaptureFragment2, f2);
            mediaCaptureFragment2.mActionBar.setTranslationY(mediaCaptureFragment2.A00);
            mediaCaptureFragment2.mActionBarShadow.setTranslationY(mediaCaptureFragment2.A00);
            return;
        }
        if (f <= 1.0f) {
            mediaCaptureFragment = this.A00;
            MediaCaptureFragment.A02(mediaCaptureFragment, f2);
            f3 = (float) AbstractC70163Da.A02(f, mediaCaptureFragment.A00);
        } else {
            f3 = 0.0f;
            mediaCaptureFragment = this.A00;
            MediaCaptureFragment.A02(mediaCaptureFragment, AbstractC166987dD.A07(mediaCaptureFragment.mActionBar));
        }
        mediaCaptureFragment.mActionBar.setTranslationY(f3);
        mediaCaptureFragment.mActionBarShadow.setTranslationY(f3);
    }

    @Override // X.MQQ
    public final /* synthetic */ void Drk(com.instagram.creation.base.ui.mediatabbar.Tab tab, com.instagram.creation.base.ui.mediatabbar.Tab tab2) {
    }

    public C44279JhV(MediaCaptureFragment mediaCaptureFragment) {
        this.A00 = mediaCaptureFragment;
    }

    @Override // X.MQQ
    public final void Drl(com.instagram.creation.base.ui.mediatabbar.Tab tab) {
        MediaCaptureFragment mediaCaptureFragment;
        String str;
        if (tab == AbstractC43884Jap.A00) {
            Integer num = C05F.A0B;
            mediaCaptureFragment = this.A00;
            AbstractC31718DwN.A01(mediaCaptureFragment.getSession(), num);
            str = "choose_from_library";
        } else if (tab == AbstractC43884Jap.A01) {
            Integer num2 = C05F.A0D;
            mediaCaptureFragment = this.A00;
            AbstractC31718DwN.A01(mediaCaptureFragment.getSession(), num2);
            str = "take_photo";
        } else {
            if (tab != AbstractC43884Jap.A02) {
                return;
            }
            Integer num3 = C05F.A0E;
            mediaCaptureFragment = this.A00;
            AbstractC31718DwN.A01(mediaCaptureFragment.getSession(), num3);
            str = "take_profile_video";
        }
        if (C3CZ.A0B != null) {
            C3CZ.A0C = str;
            UserSession session = mediaCaptureFragment.getSession();
            EnumC69993Ci enumC69993Ci = C3CZ.A0B;
            AbstractC167017dG.A1N(session, enumC69993Ci);
            String str2 = session.userId;
            C14360o3.A0B(str2, 0);
            AbstractC003100w.A0k(10, str2);
            AbstractC31719DwO.A00(enumC69993Ci, session, "profile_picture_bottom_sheet_item_clicked", "photo_editing", str, null, null);
        }
    }
}
