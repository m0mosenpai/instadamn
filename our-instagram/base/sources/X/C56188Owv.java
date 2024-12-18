package X;

import com.instagram.creation.capture.quickcapture.sundial.widget.durationpickerview.DurationPickerView;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Owv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56188Owv implements C8R4 {
    public final /* synthetic */ DurationPickerView A00;

    @Override // X.C8R4
    public final void DOo(float f, float f2) {
    }

    @Override // X.C8R4
    public final void DOr(float f) {
    }

    public C56188Owv(DurationPickerView durationPickerView) {
        this.A00 = durationPickerView;
    }

    @Override // X.C8R4
    public final void DhT(float f) {
        String str;
        DurationPickerView durationPickerView = this.A00;
        durationPickerView.invalidate();
        InterfaceC57819Pkl interfaceC57819Pkl = durationPickerView.A03;
        if (interfaceC57819Pkl != null) {
            N7P n7p = (N7P) interfaceC57819Pkl;
            n7p.A00 = AbstractC166987dD.A0B(f - durationPickerView.A0D.getLeftTrimmerValue(), durationPickerView.A01) + 0;
            OHt oHt = n7p.A06;
            if (oHt == null) {
                str = "startTimeHolder";
            } else {
                oHt.A00(n7p.A01);
                OHt oHt2 = n7p.A05;
                if (oHt2 == null) {
                    str = "endTimeHolder";
                } else {
                    oHt2.A00(n7p.A01 + r2);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C8R4
    public final void DuI() {
        N7P n7p;
        AudioOverlayTrack audioOverlayTrack;
        MusicAssetModel musicAssetModel;
        InterfaceC57819Pkl interfaceC57819Pkl = this.A00.A03;
        if (interfaceC57819Pkl != null && (audioOverlayTrack = (n7p = (N7P) interfaceC57819Pkl).A08) != null && (musicAssetModel = audioOverlayTrack.A08) != null) {
            P60 p60 = n7p.A04;
            if (p60 == null) {
                C14360o3.A0F("player");
                throw C00O.createAndThrow();
            }
            int i = n7p.A01;
            int i2 = n7p.A00;
            int i3 = i2 - 2000;
            int i4 = 0;
            if (0 < i3) {
                i4 = i3;
            }
            p60.A00(audioOverlayTrack, musicAssetModel, i, i2, i4);
        }
    }

    @Override // X.C8R4
    public final void DuK() {
        String str;
        DurationPickerView durationPickerView = this.A00;
        durationPickerView.invalidate();
        InterfaceC57819Pkl interfaceC57819Pkl = durationPickerView.A03;
        if (interfaceC57819Pkl != null) {
            N7P n7p = (N7P) interfaceC57819Pkl;
            P60 p60 = n7p.A04;
            if (p60 == null) {
                str = "player";
            } else {
                InterfaceC678133v interfaceC678133v = p60.A02;
                if (interfaceC678133v.isPlaying()) {
                    interfaceC678133v.pause();
                }
                InterfaceC57940Pmk interfaceC57940Pmk = n7p.A07;
                if (interfaceC57940Pmk == null) {
                    str = "durationPicker";
                } else {
                    DurationPickerView durationPickerView2 = (DurationPickerView) interfaceC57940Pmk;
                    if (durationPickerView2.A04) {
                        durationPickerView2.A04 = false;
                        durationPickerView2.A02 = System.currentTimeMillis();
                        durationPickerView2.invalidate();
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
