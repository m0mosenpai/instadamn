package X;

import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.OzN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56302OzN implements C8BU {
    public final /* synthetic */ C56304OzP A00;

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

    public C56302OzN(C56304OzP c56304OzP) {
        this.A00 = c56304OzP;
    }

    @Override // X.C8BU
    public final void Cyx(boolean z) {
        C56304OzP c56304OzP = this.A00;
        c56304OzP.A02 = true;
        AbstractC167007dF.A16(c56304OzP.A00);
    }

    @Override // X.C8BU
    public final void D9c() {
        C56304OzP c56304OzP = this.A00;
        ((C8BE) c56304OzP.A08.getValue()).A05(null, "trending", true);
        C189478aR c189478aR = c56304OzP.A00;
        if (c189478aR != null) {
            c189478aR.A0L(null);
        }
    }

    @Override // X.C8BU
    public final void DBJ(EnumC185288Jt enumC185288Jt, MusicAssetModel musicAssetModel, TrackSnippet trackSnippet, C8GD c8gd, Integer num) {
        C56304OzP c56304OzP = this.A00;
        c56304OzP.A06.A0G.DBJ(null, musicAssetModel, trackSnippet, c8gd, C05F.A0C);
        C189478aR c189478aR = c56304OzP.A00;
        if (c189478aR != null) {
            c189478aR.A0L(null);
        }
    }
}
