package X;

import com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar;

/* renamed from: X.Oyc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56267Oyc implements C8R0 {
    public final int A00;
    public final Integer A01;
    public final /* synthetic */ C52135N5j A02;

    @Override // X.C8R0
    public final void DUH() {
    }

    @Override // X.C8R0
    public final void DiM() {
    }

    public C56267Oyc(C52135N5j c52135N5j) {
        this.A02 = c52135N5j;
        C51700MsV c51700MsV = c52135N5j.A09;
        if (c51700MsV == null) {
            C14360o3.A0F("trimData");
            throw C00O.createAndThrow();
        }
        this.A00 = c51700MsV.A02;
        this.A01 = Integer.valueOf(c52135N5j.A0R);
    }

    @Override // X.C8R0
    public final Integer BQ9() {
        return this.A01;
    }

    @Override // X.C8R0
    public final int BmJ() {
        return this.A00;
    }

    @Override // X.C8R0
    public final C115475Kh CFQ() {
        String str;
        C52135N5j c52135N5j = this.A02;
        C8RS c8rs = c52135N5j.A0C;
        if (c8rs == null) {
            str = "currentReviewMode";
        } else {
            C8RR c8rr = c52135N5j.A0G;
            if (c8rr == null) {
                str = "clipsReviewTrimMode";
            } else {
                if (c8rs == c8rr) {
                    return (C115475Kh) C51033Mgh.A01(c52135N5j.A0X).A03(c52135N5j.A04);
                }
                throw AbstractC31172DnG.A0u();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C8R0
    public final void D1v() {
        this.A02.onBackPressed();
    }

    @Override // X.C8R0
    public final void D6z() {
        C52135N5j c52135N5j = this.A02;
        InterfaceC09390do interfaceC09390do = c52135N5j.A0Y;
        AbstractC183338Bg.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0M(((C22F) AbstractC43593JPy.A0T(interfaceC09390do)).A04.A0L, "gallery_review");
        InterfaceC09390do interfaceC09390do2 = c52135N5j.A0X;
        C115475Kh c115475Kh = (C115475Kh) C51033Mgh.A01(interfaceC09390do2).A03(c52135N5j.A04);
        int i = c52135N5j.A01;
        int i2 = c52135N5j.A00;
        if (i < i2) {
            AbstractC43593JPy.A0T(interfaceC09390do).A0m(MSW.A05(c115475Kh));
            C8RR c8rr = c52135N5j.A0G;
            if (c8rr == null) {
                C14360o3.A0F("clipsReviewTrimMode");
                throw C00O.createAndThrow();
            }
            if (c8rr.A02.intValue() == 4) {
                c52135N5j.A05();
                C8K5 c8k5 = (C8K5) c52135N5j.A0W.getValue();
                C115525Km c115525Km = c115475Kh.A0G;
                AbstractC166987dD.A1Z(new PZ4(c8k5, c115525Km, null, i, i2), MSX.A0B(c8k5, c115525Km, 0));
                C51033Mgh c51033Mgh = (C51033Mgh) interfaceC09390do2.getValue();
                C84B c84b = (C84B) AbstractC55154OdI.A04(C51033Mgh.A01(interfaceC09390do2)).A00;
                C14360o3.A0B(c84b, 0);
                c51033Mgh.A00 = c84b;
                return;
            }
            return;
        }
        AbstractC183338Bg.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0B("Video is too short");
        C9GR.A07(c52135N5j.getContext(), 2131975755);
    }

    @Override // X.C8R0
    public final void DGx() {
        C52135N5j c52135N5j = this.A02;
        if (c52135N5j.A0E != null) {
            if (c52135N5j.A0O) {
                c52135N5j.A0X.getValue();
            }
            InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
            if (interfaceC58267PsB != null) {
                interfaceC58267PsB.start();
            }
            c52135N5j.A0N = false;
            c52135N5j.A0O = false;
        }
    }

    @Override // X.C8R0
    public final void DGy() {
        C52135N5j c52135N5j = this.A02;
        c52135N5j.A0N = true;
        InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.pause();
        }
    }

    @Override // X.C8R0
    public final void Djz(int i) {
        C52135N5j c52135N5j = this.A02;
        InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
        if (interfaceC58267PsB == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Failure user trimming video: startTimeInMs=");
            A1C.append(i);
            A1C.append(" mSurface=");
            AKk.A02(c52135N5j.requireContext(), C05F.A0Y, AbstractC166997dE.A0v(c52135N5j.A05, A1C), 2131974293);
            return;
        }
        interfaceC58267PsB.seekTo(i);
    }

    @Override // X.C8R0
    public final void Dvq(int i) {
        C52135N5j c52135N5j = this.A02;
        if (c52135N5j.A0E == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Failure user trimming video: endTimeInMs=");
            A1C.append(i);
            A1C.append(" mSurface=");
            AKk.A02(c52135N5j.requireContext(), C05F.A0Y, AbstractC166997dE.A0v(c52135N5j.A05, A1C), 2131974293);
            return;
        }
        c52135N5j.A0O = false;
        C52135N5j.A02(null, c52135N5j, null, null, null, Integer.valueOf(i), null);
        ClipsReviewProgressBar clipsReviewProgressBar = c52135N5j.A0I;
        if (clipsReviewProgressBar == null) {
            C14360o3.A0F("reviewProgressBar");
            throw C00O.createAndThrow();
        }
        clipsReviewProgressBar.A01(c52135N5j.A04, c52135N5j.A00 - c52135N5j.A01);
        InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
        if (interfaceC58267PsB == null) {
            return;
        }
        interfaceC58267PsB.seekTo(i);
    }

    @Override // X.C8R0
    public final void Dvs(int i) {
        C52135N5j c52135N5j = this.A02;
        if (c52135N5j.A0E == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Failure user trimming video: startTimeInMs=");
            A1C.append(i);
            A1C.append(" mSurface=");
            AKk.A02(c52135N5j.requireContext(), C05F.A0Y, AbstractC166997dE.A0v(c52135N5j.A05, A1C), 2131974293);
            return;
        }
        c52135N5j.A0O = true;
        C52135N5j.A02(null, c52135N5j, null, null, Integer.valueOf(i), null, null);
        ClipsReviewProgressBar clipsReviewProgressBar = c52135N5j.A0I;
        if (clipsReviewProgressBar == null) {
            C14360o3.A0F("reviewProgressBar");
            throw C00O.createAndThrow();
        }
        clipsReviewProgressBar.A01(c52135N5j.A04, c52135N5j.A00 - c52135N5j.A01);
        InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
        if (interfaceC58267PsB == null) {
            return;
        }
        interfaceC58267PsB.seekTo(i);
    }
}
