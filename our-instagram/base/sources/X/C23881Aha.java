package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.Aha, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23881Aha implements C8BU {
    public final /* synthetic */ C23885Ahe A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    @Override // X.C8BU
    public final void D5L() {
    }

    @Override // X.C8BU
    public final void D5M() {
    }

    @Override // X.C8BU
    public final void DGz(EnumC185288Jt enumC185288Jt, MusicAssetModel musicAssetModel, TrackSnippet trackSnippet, boolean z) {
    }

    @Override // X.C8BU
    public final void DUM(boolean z) {
    }

    @Override // X.C8BU
    public final void DUf(AnonymousClass879 anonymousClass879) {
    }

    public C23881Aha(C23885Ahe c23885Ahe, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = c23885Ahe;
        this.A01 = audioOverlayTrack;
    }

    @Override // X.C8BU
    public final void Cyx(boolean z) {
        C23885Ahe c23885Ahe = this.A00;
        c23885Ahe.A03 = true;
        AbstractC167007dF.A16(c23885Ahe.A00);
    }

    @Override // X.C8BU
    public final void D9c() {
        C23885Ahe c23885Ahe = this.A00;
        ((C8BE) c23885Ahe.A07.getValue()).A04(null);
        if (C14360o3.A0K(c23885Ahe.A01, this.A01)) {
            c23885Ahe.A01 = null;
        }
        C189478aR c189478aR = c23885Ahe.A00;
        if (c189478aR != null) {
            c189478aR.A0L(null);
        }
    }

    @Override // X.C8BU
    public final void DBJ(EnumC185288Jt enumC185288Jt, MusicAssetModel musicAssetModel, TrackSnippet trackSnippet, C8GD c8gd, Integer num) {
        C23885Ahe c23885Ahe = this.A00;
        c23885Ahe.A06.A0G.DBJ(enumC185288Jt, musicAssetModel, trackSnippet, c8gd, C05F.A0C);
        AbstractC167007dF.A16(c23885Ahe.A00);
    }
}
