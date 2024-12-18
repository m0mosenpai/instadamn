package X;

import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;
import com.facebook.R;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* renamed from: X.OlP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55531OlP implements SeekBar.OnSeekBarChangeListener {
    public final int A00;
    public final Object A01;

    public C55531OlP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C51380Mmf c51380Mmf;
        OHM ohm;
        boolean z2;
        String str;
        switch (this.A00) {
            case 0:
                if (z) {
                    SeekBarPreference seekBarPreference = (SeekBarPreference) this.A01;
                    if (seekBarPreference.A09 || !seekBarPreference.A08) {
                        seekBarPreference.A0N(seekBar);
                        return;
                    }
                }
                SeekBarPreference seekBarPreference2 = (SeekBarPreference) this.A01;
                int i2 = i + seekBarPreference2.A01;
                TextView textView = seekBarPreference2.A05;
                if (textView == null) {
                    return;
                }
                MSX.A15(textView, i2);
                return;
            case 1:
            case 4:
            default:
                return;
            case 2:
                if (!z) {
                    return;
                }
                C52165N6r c52165N6r = (C52165N6r) this.A01;
                VideoPreviewView videoPreviewView = c52165N6r.A08;
                str = "videoPreviewView";
                if (videoPreviewView != null) {
                    videoPreviewView.A07(i);
                    VideoPreviewView videoPreviewView2 = c52165N6r.A08;
                    if (videoPreviewView2 != null) {
                        if (videoPreviewView2.A04 != MXU.PAUSED) {
                            return;
                        }
                        ImageView imageView = c52165N6r.A03;
                        if (imageView == null) {
                            str = "scrubberButton";
                            break;
                        } else {
                            imageView.setImageResource(R.drawable.play_icon);
                            return;
                        }
                    }
                }
                break;
            case 3:
                if (!z) {
                    return;
                }
                VideoPreviewView videoPreviewView3 = ((C52163N6p) this.A01).A03;
                if (videoPreviewView3 == null) {
                    str = "videoPreviewView";
                    break;
                } else {
                    videoPreviewView3.A07(i);
                    return;
                }
            case 5:
                if (!z || (ohm = (c51380Mmf = ((PCH) this.A01).A03.A00).A01) == null) {
                    return;
                }
                C5TA c5ta = c51380Mmf.A08.A01;
                if (c5ta != null) {
                    z2 = c5ta.A0D();
                } else {
                    z2 = false;
                }
                C52689NTa c52689NTa = ohm.A00;
                c52689NTa.A0R.A00.setStreamVolume(3, (int) ((i / 100.0d) * AbstractC41221vX.A00().A00), 0);
                C51906Mwo c51906Mwo = null;
                if (i > 0) {
                    if (z2) {
                        return;
                    }
                    c52689NTa.A0U.F7q();
                    C51906Mwo c51906Mwo2 = (C51906Mwo) ((AbstractC55206OeJ) c52689NTa).A01;
                    if (c51906Mwo2 != null) {
                        c51906Mwo = C51906Mwo.A00(null, null, c51906Mwo2, null, Integer.valueOf(OT1.A00()), null, null, 0.0f, 0, -5121, 2047, false, true, false, false, false, false, false, false);
                    }
                } else {
                    if (i != 0 || !z2) {
                        return;
                    }
                    c52689NTa.A0U.F7q();
                    C51906Mwo c51906Mwo3 = (C51906Mwo) ((AbstractC55206OeJ) c52689NTa).A01;
                    if (c51906Mwo3 != null) {
                        c51906Mwo = C51906Mwo.A00(null, null, c51906Mwo3, null, Integer.valueOf(OT1.A00()), null, null, 0.0f, 0, -5121, 2047, false, false, false, false, false, false, false, false);
                    }
                }
                c52689NTa.A0J(c51906Mwo);
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        C52689NTa c52689NTa;
        C51865Mw9 c51865Mw9;
        C51630MrN c51630MrN;
        switch (this.A00) {
            case 0:
                ((SeekBarPreference) this.A01).A08 = true;
                return;
            case 1:
                C46094Kas c46094Kas = (C46094Kas) this.A01;
                c46094Kas.A04 = true;
                C5TA c5ta = c46094Kas.A01;
                if (c5ta == null) {
                    return;
                }
                c5ta.A09("seek");
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                C51380Mmf c51380Mmf = ((PCH) this.A01).A03.A00;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C5TA c5ta2 = c51380Mmf.A08.A01;
                if (c5ta2 != null && c5ta2.A01) {
                    return;
                }
                c51380Mmf.A04 = true;
                OHM ohm = c51380Mmf.A01;
                if (ohm == null || (c51865Mw9 = (c52689NTa = ohm.A00).A00) == null || (c51630MrN = c51865Mw9.A00) == null) {
                    return;
                }
                C55095Ob6 c55095Ob6 = c52689NTa.A0W;
                String Ar1 = c51630MrN.A00.Ar1();
                Boolean valueOf = Boolean.valueOf(c52689NTa.A08);
                C14360o3.A0B(Ar1, 0);
                c55095Ob6.A04.A00(new PA2(Ar1, C05F.A0C));
                if (AbstractC166997dE.A1Z(valueOf, false)) {
                    c55095Ob6.A03.A03(EnumC53379NjU.A0B, null, AbstractC167017dG.A0r("control_action", "scrub"));
                }
                c55095Ob6.A03();
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C51906Mwo c51906Mwo;
        boolean z;
        int i;
        int i2;
        C51630MrN c51630MrN;
        InterfaceC58104PpT interfaceC58104PpT;
        InterfaceC57854PlK pf4;
        switch (this.A00) {
            case 0:
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.A01;
                seekBarPreference.A08 = false;
                if (seekBar.getProgress() + seekBarPreference.A01 == seekBarPreference.A03) {
                    return;
                }
                seekBarPreference.A0N(seekBar);
                return;
            case 1:
                C14360o3.A0B(seekBar, 0);
                C46094Kas c46094Kas = (C46094Kas) this.A01;
                c46094Kas.A04 = false;
                C5TA c5ta = c46094Kas.A01;
                if (c5ta != null) {
                    c5ta.A04(seekBar.getProgress(), true);
                }
                C5TA c5ta2 = c46094Kas.A01;
                if (c5ta2 == null) {
                    return;
                }
                c5ta2.A0B("seek", false);
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                C14360o3.A0B(seekBar, 0);
                long progress = seekBar.getProgress();
                C51380Mmf c51380Mmf = ((PCH) this.A01).A03.A00;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c51380Mmf.A04 = false;
                OHM ohm = c51380Mmf.A01;
                if (ohm == null) {
                    return;
                }
                PJO pjo = c51380Mmf.A08;
                C5TA c5ta3 = pjo.A01;
                if (c5ta3 != null) {
                    z = c5ta3.A01;
                } else {
                    z = false;
                }
                if (c5ta3 != null) {
                    i = c5ta3.A06.getCurrentPositionMs();
                } else {
                    i = 0;
                }
                long j = i;
                C5TA c5ta4 = pjo.A01;
                if (c5ta4 != null) {
                    i2 = c5ta4.A06.Azm();
                } else {
                    i2 = 0;
                }
                C52689NTa c52689NTa = ohm.A00;
                C51865Mw9 c51865Mw9 = c52689NTa.A00;
                if (c51865Mw9 == null || (c51630MrN = c51865Mw9.A00) == null || (interfaceC58104PpT = c51630MrN.A00) == null || !interfaceC58104PpT.Cff() || progress > i2 || progress < 0) {
                    return;
                }
                C55177Odh c55177Odh = c52689NTa.A0Q;
                if (z) {
                    pf4 = new PF2(progress);
                } else if (!z) {
                    pf4 = new PF4(progress, j, null);
                } else {
                    throw B4Z.A00();
                }
                c55177Odh.A03(pf4);
                return;
            case 5:
                OHM ohm2 = ((PCH) this.A01).A00;
                if (ohm2 == null) {
                    return;
                }
                C52689NTa c52689NTa2 = ohm2.A00;
                C51906Mwo c51906Mwo2 = (C51906Mwo) ((AbstractC55206OeJ) c52689NTa2).A01;
                if (c51906Mwo2 != null) {
                    c51906Mwo = C51906Mwo.A00(null, null, c51906Mwo2, null, Integer.valueOf(OT1.A00()), null, null, 0.0f, 0, -4097, 2047, false, false, false, false, false, false, false, false);
                } else {
                    c51906Mwo = null;
                }
                c52689NTa2.A0J(c51906Mwo);
                return;
        }
    }
}
