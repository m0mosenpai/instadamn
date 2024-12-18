package X;

import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;

/* loaded from: classes9.dex */
public final class P65 implements InterfaceC58309Pt1 {
    public P64 A00;
    public O8H A01 = new O8H(0, null);
    public final MusicSearchQueryViewModel A02;

    @Override // X.InterfaceC58309Pt1
    public final void AD4() {
        if (this.A01.A00 == 3) {
            this.A02.A02();
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        P64 p64 = this.A00;
        if (p64 != null) {
            C50979Mfm c50979Mfm = p64.A02.A0F;
            if (c50979Mfm.A09.size() <= 0 && c50979Mfm.A08.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        O8H o8h = this.A01;
        if (o8h.A00 == 3) {
            Object obj = o8h.A01;
            if (obj != null) {
                C38071Gp0 c38071Gp0 = (C38071Gp0) ((MUG) obj).A00;
                if (c38071Gp0 != null) {
                    if (c38071Gp0.A00()) {
                        return true;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC167007dF.A1P(this.A01.A00, 4);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return AbstractC167007dF.A1M(this.A01.A00);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        this.A02.A02();
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC43593JPy.A1Y(this.A01.A00);
    }

    public P65(MusicSearchQueryViewModel musicSearchQueryViewModel) {
        this.A02 = musicSearchQueryViewModel;
    }
}
