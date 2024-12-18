package X;

import android.view.View;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.Ozt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56332Ozt implements MR0 {
    public final /* synthetic */ C50724MaP A00;

    @Override // X.MR0
    public final void DB1() {
    }

    @Override // X.MR0
    public final void E3n() {
    }

    @Override // X.MR0
    public final void Ekn(C49519LuY c49519LuY, boolean z) {
        C14360o3.A0B(c49519LuY, 0);
        C50724MaP c50724MaP = this.A00;
        if (C50724MaP.A0A(c50724MaP)) {
            View view = c50724MaP.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = c50724MaP.A04;
            if (view2 != null) {
                view2.bringToFront();
            }
        }
        C50724MaP.A01(c50724MaP).A08(c49519LuY, z);
    }

    public C56332Ozt(C50724MaP c50724MaP) {
        this.A00 = c50724MaP;
    }

    @Override // X.MR0
    public final void DHD(AudioOverlayTrack audioOverlayTrack) {
        AbstractC167007dF.A0x(this.A00.A00);
    }

    @Override // X.MR0
    public final void DUF() {
        C50724MaP c50724MaP = this.A00;
        AbstractC50522MSa.A1R(c50724MaP.A0H, c50724MaP);
        C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(c50724MaP.A0i), 36326464022460303L);
    }
}
