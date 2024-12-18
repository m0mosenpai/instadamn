package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C98174aw extends AbstractC97194Ye implements C4UC {
    public int A00;
    public C4B6 A01;
    public C4B6 A02;
    public C5T5 A03;
    public boolean A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final C96184Ub A09;
    public final C4UO A0A;
    public final boolean A0B;

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    public final void A0J() {
        try {
            super.A0J();
        } finally {
            if (this.A07) {
                this.A07 = false;
                this.A0A.reset();
            }
        }
    }

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    public final void A0K() {
        this.A07 = true;
        this.A02 = null;
        try {
            this.A0A.flush();
            super.A0K();
        } catch (Throwable th) {
            super.A0K();
            throw th;
        } finally {
            this.A09.A00(this.A0E);
        }
    }

    @Override // X.AbstractC96044Tn, X.InterfaceC96064Tp
    public void CK0(int i, Object obj) {
        DefaultAudioSink defaultAudioSink;
        C54373O1f c54373O1f;
        AudioDeviceInfo audioDeviceInfo;
        if (i != 2) {
            if (i != 3) {
                if (i == 6) {
                    C4UY c4uy = (C4UY) obj;
                    DefaultAudioSink defaultAudioSink2 = (DefaultAudioSink) this.A0A;
                    if (defaultAudioSink2.A0F.equals(c4uy)) {
                        return;
                    }
                    defaultAudioSink2.A0F = c4uy;
                    return;
                }
                switch (i) {
                    case 9:
                        C4UO c4uo = this.A0A;
                        DefaultAudioSink defaultAudioSink3 = (DefaultAudioSink) c4uo;
                        DefaultAudioSink.A06(DefaultAudioSink.A02(defaultAudioSink3).A02, defaultAudioSink3, ((Boolean) obj).booleanValue());
                        return;
                    case 10:
                        C4UO c4uo2 = this.A0A;
                        int intValue = ((Number) obj).intValue();
                        defaultAudioSink = (DefaultAudioSink) c4uo2;
                        if (defaultAudioSink.A01 == intValue) {
                            return;
                        }
                        defaultAudioSink.A01 = intValue;
                        boolean z = false;
                        if (intValue != 0) {
                            z = true;
                        }
                        defaultAudioSink.A0N = z;
                        break;
                    case 11:
                        this.A03 = (C5T5) obj;
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) obj;
                        DefaultAudioSink defaultAudioSink4 = (DefaultAudioSink) this.A0A;
                        if (audioDeviceInfo2 == null) {
                            c54373O1f = null;
                        } else {
                            c54373O1f = new C54373O1f(audioDeviceInfo2);
                        }
                        defaultAudioSink4.A0G = c54373O1f;
                        AudioTrack audioTrack = defaultAudioSink4.A0B;
                        if (audioTrack == null) {
                            return;
                        }
                        if (c54373O1f == null) {
                            audioDeviceInfo = null;
                        } else {
                            audioDeviceInfo = c54373O1f.A00;
                        }
                        audioTrack.setPreferredDevice(audioDeviceInfo);
                        return;
                    default:
                        return;
                }
            } else {
                C4UX c4ux = (C4UX) obj;
                defaultAudioSink = (DefaultAudioSink) this.A0A;
                if (defaultAudioSink.A0D.equals(c4ux)) {
                    return;
                }
                defaultAudioSink.A0D = c4ux;
                if (defaultAudioSink.A0U) {
                    return;
                }
            }
            defaultAudioSink.flush();
            return;
        }
        C4UO c4uo3 = this.A0A;
        float floatValue = ((Number) obj).floatValue();
        DefaultAudioSink defaultAudioSink5 = (DefaultAudioSink) c4uo3;
        if (defaultAudioSink5.A00 == floatValue) {
            return;
        }
        defaultAudioSink5.A00 = floatValue;
        AudioTrack audioTrack2 = defaultAudioSink5.A0B;
        if (audioTrack2 == null) {
            return;
        }
        audioTrack2.setVolume(floatValue);
    }

    @Override // X.InterfaceC96054To, X.InterfaceC96074Tq
    public final String getName() {
        return "MediaCodecAudioRenderer2";
    }

    public C98174aw(Context context, Handler handler, C96014Tk c96014Tk, C2VQ c2vq, C4TX c4tx, C4UO c4uo, InterfaceC117375Sw interfaceC117375Sw, C4BL c4bl, boolean z, boolean z2) {
        super(c96014Tk, c2vq, interfaceC117375Sw, c4bl, null, 44100.0f, 1, false, z2);
        this.A08 = context.getApplicationContext();
        this.A0A = c4uo;
        this.A0B = z;
        this.A09 = new C96184Ub(handler, c4tx);
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) c4uo;
        defaultAudioSink.A0E = new InterfaceC96204Ud() { // from class: X.5T3
            @Override // X.InterfaceC96204Ud
            public final void Cy6(Exception exc) {
                AbstractC46512Bo.A05("MediaCodecAudioRenderer2", "Audio sink error", exc);
                C96184Ub c96184Ub = C98174aw.this.A09;
                c96184Ub.A00.post(new RunnableC71456WuI(c96184Ub, exc));
            }

            @Override // X.InterfaceC96204Ud
            public final void CyB(C125415ln c125415ln) {
                C96184Ub c96184Ub = C98174aw.this.A09;
                c96184Ub.A00.post(new RunnableC71459WuL(c96184Ub, c125415ln));
            }

            @Override // X.InterfaceC96204Ud
            public final void CyC(C125415ln c125415ln) {
                C96184Ub c96184Ub = C98174aw.this.A09;
                c96184Ub.A00.post(new RunnableC71458WuK(c96184Ub, c125415ln));
            }

            @Override // X.InterfaceC96204Ud
            public final void DWQ() {
                C5T5 c5t5 = C98174aw.this.A03;
                if (c5t5 != null) {
                    ((C96764Wl) ((C5T4) c5t5).A00.A0n).A00.sendEmptyMessage(2);
                }
            }

            @Override // X.InterfaceC96204Ud
            public final void DWR() {
                C5T5 c5t5 = C98174aw.this.A03;
                if (c5t5 != null) {
                    ((C5T4) c5t5).A00.A0T = true;
                }
            }

            @Override // X.InterfaceC96204Ud
            public final void DZh(long j) {
                C96184Ub c96184Ub = C98174aw.this.A09;
                c96184Ub.A00.post(new RunnableC127265p4(c96184Ub));
            }

            @Override // X.InterfaceC96204Ud
            public final void DZm() {
                C98174aw.this.A04 = true;
            }

            @Override // X.InterfaceC96204Ud
            public final void Dmu(boolean z3) {
                C96184Ub c96184Ub = C98174aw.this.A09;
                c96184Ub.A00.post(new RunnableC126365nX(c96184Ub));
            }

            @Override // X.InterfaceC96204Ud
            public final void Dw8(long j, long j2, int i) {
                C96184Ub c96184Ub = C98174aw.this.A09;
                c96184Ub.A00.post(new RunnableC71290WrK(c96184Ub));
            }
        };
        defaultAudioSink.A0M = c2vq.A06;
    }

    public static ImmutableList A00(C4B6 c4b6, C4UO c4uo, C4BL c4bl, boolean z) {
        C2IG A01;
        String str = c4b6.A0W;
        if (str == null) {
            return ImmutableList.of();
        }
        if (((DefaultAudioSink) c4uo).B81(c4b6) != 0 && (A01 = C46762Co.A01("audio/raw")) != null) {
            return ImmutableList.of((Object) A01);
        }
        List Aw3 = c4bl.Aw3(str, z, false);
        String A03 = C46762Co.A03(c4b6);
        if (A03 == null) {
            return ImmutableList.copyOf((Collection) Aw3);
        }
        List Aw32 = c4bl.Aw3(A03, z, false);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(Aw3);
        builder.addAll(Aw32);
        return builder.build();
    }

    private void A01() {
        long Auj = this.A0A.Auj(CTt());
        if (Auj != Long.MIN_VALUE) {
            if (!this.A04) {
                Auj = Math.max(this.A05, Auj);
            }
            this.A05 = Auj;
            this.A04 = false;
        }
    }

    @Override // X.AbstractC97194Ye
    public final C5TF A0R(C96084Tr c96084Tr) {
        C4B6 c4b6 = c96084Tr.A00;
        c4b6.getClass();
        this.A02 = c4b6;
        C5TF A0R = super.A0R(c96084Tr);
        C96184Ub c96184Ub = this.A09;
        c96184Ub.A00.post(new RunnableC127565pZ(this.A02, c96184Ub, A0R));
        return A0R;
    }

    @Override // X.AbstractC97194Ye
    public final void A0i(C96094Ts c96094Ts) {
        if (this.A06 && (((AbstractC96104Tt) c96094Ts).A00 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            long j = c96094Ts.A01;
            if (Math.abs(j - this.A05) > 500000) {
                this.A05 = j;
            }
            this.A06 = false;
        }
    }

    @Override // X.C4UC
    public final C4TU Bdw() {
        return DefaultAudioSink.A02((DefaultAudioSink) this.A0A).A02;
    }

    @Override // X.C4UC
    public final long Beg() {
        if (((AbstractC96044Tn) this).A01 == 2) {
            A01();
        }
        return this.A05;
    }

    @Override // X.InterfaceC96054To
    public boolean CTt() {
        if (this.A0Z) {
            DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.A0A;
            if (defaultAudioSink.A0B != null) {
                if (defaultAudioSink.A0O && !defaultAudioSink.CLV()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC97194Ye, X.InterfaceC96054To
    public boolean CbZ() {
        if (!this.A0A.CLV() && !super.CbZ()) {
            return false;
        }
        return true;
    }

    @Override // X.C4UC
    public final void Eaz(C4TU c4tu) {
        this.A0A.Eaz(c4tu);
    }

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    public void A0I() {
        A01();
        this.A0A.pause();
    }

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    public void A0L(long j, boolean z) {
        super.A0L(j, z);
        this.A0A.flush();
        this.A05 = j;
        this.A06 = true;
        this.A04 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r2.A0U == false) goto L6;
     */
    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0M(boolean r5, boolean r6) {
        /*
            r4 = this;
            super.A0M(r5, r6)
            X.4Ub r3 = r4.A09
            X.4au r2 = r4.A0E
            android.os.Handler r1 = r3.A00
            X.5os r0 = new X.5os
            r0.<init>(r3, r2)
            r1.post(r0)
            X.4WD r0 = r4.A03
            r0.getClass()
            boolean r0 = r0.A00
            X.4UO r2 = r4.A0A
            com.google.android.exoplayer2.audio.DefaultAudioSink r2 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r2
            if (r0 == 0) goto L35
            r1 = 1
            boolean r0 = r2.A0N
            X.C4B8.A04(r0)
            boolean r0 = r2.A0U
            if (r0 != 0) goto L2d
        L28:
            r2.A0U = r1
            r2.flush()
        L2d:
            X.4WZ r0 = r4.A04
            r0.getClass()
            r2.A0C = r0
            return
        L35:
            boolean r0 = r2.A0U
            if (r0 == 0) goto L2d
            r1 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98174aw.A0M(boolean, boolean):void");
    }
}
