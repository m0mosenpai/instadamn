package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.urlhandlers.collabs.IgEditCollaboratorsUrlHandlerActivity;

/* renamed from: X.LsB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49377LsB implements GZ7 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49377LsB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c38321qM, 0);
                InterfaceC50450MPe interfaceC50450MPe = (InterfaceC50450MPe) this.A01;
                InterfaceC84163p3 A1P = c38321qM.A1P();
                if (A1P != null && A1P.getMashupsAllowed()) {
                    interfaceC50450MPe.Dej(c38321qM);
                    return;
                } else {
                    interfaceC50450MPe.D9U();
                    return;
                }
            case 1:
                C14360o3.A0B(c38321qM, 0);
                IgEditCollaboratorsUrlHandlerActivity.A00((UserSession) this.A01, c38321qM, (IgEditCollaboratorsUrlHandlerActivity) this.A02);
                return;
            default:
                C14360o3.A0B(c38321qM, 0);
                C45495KCk c45495KCk = (C45495KCk) this.A02;
                View view = (View) this.A01;
                c45495KCk.A01 = c38321qM;
                AudioOverlayTrack audioOverlayTrack = c45495KCk.A02;
                if (audioOverlayTrack != null) {
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    if (musicAssetModel != null) {
                        boolean z = c45495KCk.A06;
                        C189988bH c189988bH = c45495KCk.A03;
                        if (c189988bH != null) {
                            if (z) {
                                c189988bH.A0K(musicAssetModel, audioOverlayTrack.A03, true);
                            } else {
                                c189988bH.A0L(musicAssetModel, true);
                            }
                        } else {
                            str = "musicOverlayEditController";
                        }
                    }
                    SimpleVideoLayout simpleVideoLayout = (SimpleVideoLayout) view.findViewById(R.id.clips_video_player);
                    C4S7 c4s7 = new C4S7(c38321qM, 0);
                    c45495KCk.A01().EYb(true);
                    ((C4QT) c45495KCk.A01()).A0Z = true;
                    c45495KCk.A01().E5v(new C4SC(simpleVideoLayout, new C4QP(false, false, false, false), c38321qM.CFR(), c4s7, null, "clips_edit_metadata_preview", 0.0f, -1, c45495KCk.A01().getCurrentPositionMs(), false));
                    return;
                }
                str = "audioTrack";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        switch (this.A00) {
            case 0:
                ((InterfaceC50450MPe) this.A01).D9U();
                return;
            case 1:
                ((Activity) this.A02).finish();
                return;
            default:
                C0w9.A03(C45495KCk.__redex_internal_original_name, AnonymousClass001.A0R("Failed to fetch media: ", str));
                return;
        }
    }
}
