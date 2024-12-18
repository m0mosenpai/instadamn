package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.LuZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49520LuZ implements InterfaceC189958bE, InterfaceC189978bG, InterfaceC189968bF {
    public final int A00;
    public final Object A01;

    public C49520LuZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static boolean A00(C49520LuZ c49520LuZ) {
        AudioOverlayTrack audioOverlayTrack = ((C45500KCp) c49520LuZ.A01).A01;
        if (audioOverlayTrack != null) {
            if (audioOverlayTrack.A0E != null) {
                return true;
            }
            return false;
        }
        C14360o3.A0F("audioTrack");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189958bE
    public final boolean ACP() {
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void ATh() {
        switch (this.A00) {
            case 1:
            case 6:
                Fragment fragment = (Fragment) this.A01;
                Intent intent = new Intent();
                intent.putExtra("extra_back_to_search", true);
                AbstractC31180DnO.A0y(fragment.requireActivity(), intent);
                return;
            case 2:
                AbstractC31178DnM.A1T(this.A01);
                return;
            case 3:
            case 4:
            case 5:
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // X.InterfaceC189958bE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int BPv() {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L8;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto Lf;
                case 4: goto L16;
                case 5: goto L28;
                case 6: goto L37;
                default: goto L5;
            }
        L5:
            r0 = 90
            return r0
        L8:
            java.lang.Object r0 = r1.A01
            X.KCv r0 = (X.C45506KCv) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A01
            goto L1c
        Lf:
            java.lang.Object r0 = r1.A01
            X.KDB r0 = (X.KDB) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A02
            goto L1c
        L16:
            java.lang.Object r0 = r1.A01
            X.KD1 r0 = (X.KD1) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A00
        L1c:
            if (r0 != 0) goto L34
            java.lang.String r0 = "currentAudioOverlayTrack"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L28:
            java.lang.Object r0 = r1.A01
            X.KDC r0 = (X.KDC) r0
            X.0do r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
        L34:
            int r0 = r0.A02
            return r0
        L37:
            r0 = 15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49520LuZ.BPv():int");
    }

    @Override // X.InterfaceC189968bF
    public final MusicOverlayStickerModel BVf() {
        switch (this.A00) {
            case 0:
                throw AbstractC166987dD.A14("This editor does not support adding sticker");
            case 1:
                throw AbstractC166987dD.A14("The Composer format does not support the sticker in the music editor");
            case 2:
                throw AbstractC166987dD.A14("The Composer format does not support the sticker in the music editor");
            case 3:
                throw AbstractC166987dD.A14("Music On Profile does not support the sticker in the music editor");
            case 4:
                throw AbstractC166987dD.A14("Music On Profile does not support the sticker in the music editor");
            case 5:
                throw AbstractC166987dD.A14("Sticker not supported on wall");
            default:
                throw AbstractC166987dD.A14("The clips edit format does not support the sticker in the music editor");
        }
    }

    @Override // X.InterfaceC189958bE
    public final String BYP(boolean z) {
        if (6 - this.A00 != 0) {
            return "";
        }
        return AbstractC31172DnG.A07(this.A01).getString(2131955571);
    }

    @Override // X.InterfaceC189968bF
    public final boolean Bv6() {
        return false;
    }

    @Override // X.InterfaceC189968bF
    public final /* synthetic */ void CMU() {
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189968bF
    public final boolean CQQ() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CSV() {
        switch (this.A00) {
            case 0:
                return true;
            case 6:
                return ((C45495KCk) this.A01).A06;
            default:
                return false;
        }
    }

    @Override // X.InterfaceC189958bE
    public final boolean CSh() {
        switch (this.A00) {
            case 0:
            case 6:
                return true;
            default:
                return false;
        }
    }

    @Override // X.InterfaceC189958bE
    public final boolean CXD() {
        if (6 - this.A00 != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CaV() {
        switch (this.A00) {
            case 0:
            case 6:
                return false;
            case 1:
                return !A00(this);
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return true;
        }
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cbt() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdO() {
        switch (this.A00) {
            case 0:
            case 6:
                return false;
            case 1:
                return !A00(this);
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return true;
        }
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdP() {
        switch (this.A00) {
            case 1:
                return !A00(this);
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdQ() {
        switch (this.A00) {
            case 1:
                return !A00(this);
            case 2:
            case 6:
                return true;
            case 3:
            case 4:
            case 5:
            default:
                return false;
        }
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189978bG
    public final boolean Cdk() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cef() {
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final void CwG() {
        String str;
        switch (this.A00) {
            case 0:
                C45506KCv c45506KCv = (C45506KCv) this.A01;
                C189988bH c189988bH = c45506KCv.A02;
                if (c189988bH == null) {
                    str = "musicOverlayEditController";
                } else {
                    c189988bH.A0G();
                    C8BU c8bu = c45506KCv.A00;
                    if (c8bu == null) {
                        str = "delegate";
                    } else {
                        c8bu.Cyx(false);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
            case 6:
                Fragment fragment = (Fragment) this.A01;
                Intent intent = new Intent();
                intent.putExtra("extra_back_to_search", true);
                AbstractC31180DnO.A0y(fragment.requireActivity(), intent);
                return;
            case 2:
                AbstractC31178DnM.A1T(this.A01);
                return;
            case 3:
            case 4:
            case 5:
            default:
                return;
        }
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cyv() {
        switch (this.A00) {
            case 0:
                if (((C45506KCv) this.A01).A03) {
                    return false;
                }
                CwG();
                return true;
            case 1:
            case 2:
            default:
                return false;
            case 3:
            case 4:
            case 5:
                return true;
        }
    }

    @Override // X.InterfaceC189958bE
    public final void D9c() {
        switch (this.A00) {
            case 0:
                C8BU c8bu = ((C45506KCv) this.A01).A00;
                if (c8bu == null) {
                    C14360o3.A0F("delegate");
                    throw C00O.createAndThrow();
                }
                c8bu.D9c();
                return;
            case 6:
                Fragment fragment = (Fragment) this.A01;
                AbstractC31180DnO.A0y(fragment.requireActivity(), new Intent());
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC189958bE
    public final void DBK(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, Integer num) {
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(trackSnippet, 1);
                C45506KCv c45506KCv = (C45506KCv) this.A01;
                AudioOverlayTrack audioOverlayTrack = c45506KCv.A01;
                if (audioOverlayTrack == null) {
                    str = "currentAudioOverlayTrack";
                    break;
                } else {
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    if (musicAssetModel == null) {
                        return;
                    }
                    C8BU c8bu = c45506KCv.A00;
                    if (c8bu == null) {
                        str = "delegate";
                        break;
                    } else {
                        c8bu.DBJ(null, musicAssetModel, trackSnippet, null, C05F.A0C);
                        return;
                    }
                }
            case 6:
                AbstractC167017dG.A1P(trackSnippet, num);
                C45495KCk c45495KCk = (C45495KCk) this.A01;
                AudioOverlayTrack audioOverlayTrack2 = c45495KCk.A02;
                if (audioOverlayTrack2 != null) {
                    AbstractC31180DnO.A0y(c45495KCk.requireActivity(), JQ0.A0A(audioOverlayTrack2, trackSnippet));
                    return;
                } else {
                    str = "audioTrack";
                    break;
                }
            default:
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DTj(Integer num) {
        if (3 - this.A00 == 0) {
            C14360o3.A0B(num, 0);
            ((KDB) this.A01).A04 = num;
        }
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DUK() {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DUL() {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void Dx9(int i) {
        AudioOverlayTrack audioOverlayTrack;
        switch (this.A00) {
            case 1:
                audioOverlayTrack = ((C45500KCp) this.A01).A01;
                break;
            case 2:
                audioOverlayTrack = ((C45501KCq) this.A01).A00;
                break;
            default:
                return;
        }
        if (audioOverlayTrack != null) {
            audioOverlayTrack.A02 = i;
        } else {
            C14360o3.A0F("audioTrack");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // X.InterfaceC189958bE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DxA(int r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 3: goto Ld;
                case 4: goto L6;
                case 5: goto L1f;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r1.A01
            X.KD1 r0 = (X.KD1) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A00
            goto L13
        Ld:
            java.lang.Object r0 = r1.A01
            X.KDB r0 = (X.KDB) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A02
        L13:
            if (r0 != 0) goto L2b
            java.lang.String r0 = "currentAudioOverlayTrack"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1f:
            java.lang.Object r0 = r1.A01
            X.KDC r0 = (X.KDC) r0
            X.0do r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
        L2b:
            r0.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49520LuZ.DxA(int):void");
    }

    @Override // X.InterfaceC189968bF
    public final /* synthetic */ void Ekk() {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void Cxy(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, boolean z) {
    }
}
