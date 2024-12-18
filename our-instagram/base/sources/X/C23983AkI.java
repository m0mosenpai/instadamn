package X;

import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.TrackSnippet;
import java.util.List;

/* renamed from: X.AkI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23983AkI implements InterfaceC189958bE {
    public final /* synthetic */ C214909fS A00;

    @Override // X.InterfaceC189958bE
    public final int BPv() {
        return 15;
    }

    @Override // X.InterfaceC189968bF
    public final /* synthetic */ void CMU() {
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189968bF
    public final boolean CQQ() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final void Cxy(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, boolean z) {
        List list;
        C14360o3.A0B(trackSnippet, 1);
        C214909fS c214909fS = this.A00;
        c214909fS.A06 = enumC185288Jt;
        MusicOverlayStickerModel musicOverlayStickerModel = c214909fS.A09;
        if (musicOverlayStickerModel != null) {
            if (enumC185288Jt != null) {
                list = AbstractC166987dD.A1J(new AudioFilterInfo(enumC185288Jt.A04));
            } else {
                list = null;
            }
            C23000ABz c23000ABz = new C23000ABz(musicOverlayStickerModel);
            c23000ABz.A0o = list;
            c214909fS.A09 = c23000ABz.A00();
        }
        MusicAssetModel musicAssetModel = c214909fS.A08;
        if (musicAssetModel != null && c214909fS.A0A != null) {
            if (C214909fS.A01(c214909fS) && !AbstractC185298Jv.A0A(AbstractC166987dD.A0r(c214909fS.A0P))) {
                AnonymousClass879 anonymousClass879 = c214909fS.A0B;
                if (enumC185288Jt != null) {
                    if (anonymousClass879 != null) {
                        anonymousClass879.Cq9();
                    }
                } else if (anonymousClass879 != null) {
                    anonymousClass879.F9I();
                }
            }
            C8BU c8bu = c214909fS.A05;
            if (c8bu != null) {
                c8bu.DGz(enumC185288Jt, musicAssetModel, trackSnippet, z);
            }
        }
    }

    @Override // X.InterfaceC189958bE
    public final void DBK(EnumC185288Jt enumC185288Jt, TrackSnippet trackSnippet, Integer num) {
        C189988bH c189988bH;
        MusicAssetModel musicAssetModel;
        AnonymousClass879 anonymousClass879;
        AbstractC167007dF.A1D(trackSnippet, 1, num);
        C214909fS c214909fS = this.A00;
        InterfaceC09390do interfaceC09390do = c214909fS.A0P;
        if (AbstractC185298Jv.A04(AbstractC166987dD.A0r(interfaceC09390do)) && !AbstractC185298Jv.A0A(AbstractC166987dD.A0r(interfaceC09390do)) && (anonymousClass879 = c214909fS.A0B) != null) {
            anonymousClass879.F9I();
        }
        C8BU c8bu = c214909fS.A05;
        if (c8bu != null && (c189988bH = c214909fS.A0A) != null && (musicAssetModel = c214909fS.A08) != null && musicAssetModel.A00 > 0 && trackSnippet.A01 >= 0) {
            c214909fS.A0F = true;
            C8GD c8gd = null;
            if (C214909fS.A00(c214909fS)) {
                c8gd = c189988bH.A0E();
                ClipsCreationViewModel clipsCreationViewModel = c214909fS.A07;
                if (clipsCreationViewModel == null) {
                    C14360o3.A0F("clipsCreationViewModel");
                    throw C00O.createAndThrow();
                }
                clipsCreationViewModel.A0Z.Egh(c8gd);
            } else if (C214909fS.A01(c214909fS)) {
                EnumC138556Pl enumC138556Pl = EnumC138556Pl.A0D;
                MusicOverlayStickerModel BVf = c189988bH.A0y.BVf();
                if (BVf != null) {
                    c8gd = AbstractC101614hW.A07(null, BVf, null, enumC138556Pl, -1);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            c8bu.DBJ(enumC185288Jt, musicAssetModel, trackSnippet, c8gd, num);
        }
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DTj(Integer num) {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DUK() {
    }

    @Override // X.InterfaceC189958bE
    public final /* synthetic */ void DUL() {
    }

    @Override // X.InterfaceC189968bF
    public final /* synthetic */ void Ekk() {
    }

    public C23983AkI(C214909fS c214909fS) {
        this.A00 = c214909fS;
    }

    @Override // X.InterfaceC189958bE
    public final boolean ACP() {
        return this.A00.A0J;
    }

    @Override // X.InterfaceC189968bF
    public final MusicOverlayStickerModel BVf() {
        MusicOverlayStickerModel musicOverlayStickerModel;
        C214909fS c214909fS = this.A00;
        if (C214909fS.A01(c214909fS) && (musicOverlayStickerModel = c214909fS.A09) != null) {
            return musicOverlayStickerModel;
        }
        throw AbstractC166987dD.A14("Trying to add music sticker to reels in a bad state");
    }

    @Override // X.InterfaceC189958bE
    public final String BYP(boolean z) {
        String str = this.A00.A0E;
        if (str == null) {
            C14360o3.A0F("musicEditorNux");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.InterfaceC189968bF
    public final boolean Bv6() {
        return C214909fS.A00(this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 != X.EnumC1810381f.A03) goto L10;
     */
    @Override // X.InterfaceC189958bE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CSV() {
        /*
            r3 = this;
            X.9fS r2 = r3.A00
            boolean r0 = r2.A0H
            if (r0 == 0) goto L18
            X.81f r1 = r2.A0D
            if (r1 != 0) goto L14
            java.lang.String r0 = "captureState"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L14:
            X.81f r0 = X.EnumC1810381f.A03
            if (r1 == r0) goto L1d
        L18:
            boolean r1 = r2.A0I
            r0 = 0
            if (r1 == 0) goto L1e
        L1d:
            r0 = 1
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23983AkI.CSV():boolean");
    }

    @Override // X.InterfaceC189958bE
    public final boolean CSh() {
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CXD() {
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CaV() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cbt() {
        return C214909fS.A00(this.A00);
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdO() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdP() {
        return false;
    }

    @Override // X.InterfaceC189958bE
    public final boolean CdQ() {
        return true;
    }

    @Override // X.InterfaceC189958bE, X.InterfaceC189978bG
    public final boolean Cdk() {
        return C214909fS.A00(this.A00);
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cef() {
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final void CwG() {
        C8BU c8bu = this.A00.A05;
        if (c8bu != null) {
            c8bu.Cyx(false);
        }
    }

    @Override // X.InterfaceC189958bE
    public final boolean Cyv() {
        String str;
        C214909fS c214909fS = this.A00;
        C189988bH c189988bH = c214909fS.A0A;
        if (c189988bH != null) {
            c189988bH.A0I();
        }
        C189988bH c189988bH2 = c214909fS.A0A;
        if (c189988bH2 != null) {
            c189988bH2.A0F();
        }
        if (c214909fS.A0I) {
            C8BU c8bu = c214909fS.A05;
            if (c8bu != null) {
                c8bu.D9c();
            }
        } else {
            if (!C214909fS.A00(c214909fS)) {
                ClipsCreationViewModel clipsCreationViewModel = c214909fS.A07;
                if (clipsCreationViewModel == null) {
                    str = "clipsCreationViewModel";
                } else {
                    Integer num = clipsCreationViewModel.A05;
                    EnumC1810381f enumC1810381f = c214909fS.A0D;
                    if (enumC1810381f == null) {
                        str = "captureState";
                    } else if (enumC1810381f != EnumC1810381f.A03 && num == C05F.A0C) {
                        return false;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C8BU c8bu2 = c214909fS.A05;
            if (c8bu2 != null) {
                c8bu2.Cyx(false);
                return true;
            }
        }
        return true;
    }

    @Override // X.InterfaceC189958bE
    public final void D9c() {
        C8BU c8bu = this.A00.A05;
        if (c8bu != null) {
            c8bu.D9c();
        }
    }

    @Override // X.InterfaceC189958bE
    public final void Dx9(int i) {
        C214909fS c214909fS = this.A00;
        MusicOverlayStickerModel musicOverlayStickerModel = c214909fS.A09;
        if (musicOverlayStickerModel != null) {
            Integer valueOf = Integer.valueOf(i);
            C23000ABz c23000ABz = new C23000ABz(musicOverlayStickerModel);
            c23000ABz.A0O = valueOf;
            c214909fS.A09 = c23000ABz.A00();
        }
    }

    @Override // X.InterfaceC189958bE
    public final void DxA(int i) {
        C214909fS c214909fS = this.A00;
        MusicOverlayStickerModel musicOverlayStickerModel = c214909fS.A09;
        if (musicOverlayStickerModel != null) {
            Integer valueOf = Integer.valueOf(i);
            C23000ABz c23000ABz = new C23000ABz(musicOverlayStickerModel);
            c23000ABz.A0K = valueOf;
            c214909fS.A09 = c23000ABz.A00();
        }
    }

    @Override // X.InterfaceC189958bE
    public final void ATh() {
        Cyv();
    }
}
