package X;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.MediaMetadataRetriever;
import android.media.SoundPool;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.OpB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55742OpB implements InterfaceC58199Pr5 {
    public int A00;
    public int A01;
    public SoundPool A02;
    public InterfaceC16820sZ A03;
    public long A04;
    public final ConcurrentHashMap A05;
    public final Context A06;
    public final Handler A07;
    public final C54516O6t A08;
    public final C55000OUz A09;

    public C55742OpB(Context context, C55000OUz c55000OUz) {
        C14360o3.A0B(c55000OUz, 2);
        this.A06 = context;
        this.A09 = c55000OUz;
        this.A01 = -1;
        this.A00 = -1;
        this.A07 = AbstractC167007dF.A0J();
        this.A08 = new C54516O6t(context);
        this.A05 = new ConcurrentHashMap();
    }

    @Override // X.InterfaceC58199Pr5
    public final void EZm(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC58199Pr5
    public final void EZo(InterfaceC16620sF interfaceC16620sF) {
    }

    @Override // X.InterfaceC58199Pr5
    public final void Eez() {
    }

    @Override // X.InterfaceC58199Pr5
    public final void Emj(C54832OLr c54832OLr) {
        String str;
        if (this.A01 == -1) {
            int i = -1;
            this.A09.A00("SoundPool starting", new Object[0]);
            SoundPool soundPool = this.A02;
            if (soundPool != null) {
                i = soundPool.play(this.A00, 1.0f, 1.0f, 1, 0, 1.0f);
            }
            this.A01 = i;
            if (this.A03 != null) {
                long j = this.A04;
                if (j > 0) {
                    this.A07.postDelayed(new PL9(this), j);
                    return;
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("No duration for sound ");
                A1C.append(c54832OLr.A00);
                A1C.append(" or ");
                try {
                    str = this.A06.getResources().getResourceName(0);
                } catch (Resources.NotFoundException unused) {
                    str = "Unknown";
                }
                String A0x = AbstractC166997dE.A0x(str, A1C);
                C14360o3.A0B(A0x, 1);
                C0K8.A0O("SoundPoolPlayer", A0x, Arrays.copyOf(new Object[0], 0));
            }
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void reset() {
    }

    @Override // X.InterfaceC58199Pr5
    public final void ASm() {
        if (this.A02 != null) {
        } else {
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void COK() {
        if (this.A02 == null) {
            this.A02 = new SoundPool.Builder().setMaxStreams(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(3).build()).build();
            this.A05.clear();
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void EYb(boolean z) {
        SoundPool soundPool;
        int i = this.A01;
        if (i != -1 && (soundPool = this.A02) != null) {
            soundPool.setLoop(i, -1);
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void Eeb(C54832OLr c54832OLr, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        StringBuilder A1C;
        String str;
        long j;
        C14360o3.A0B(interfaceC16820sZ, 1);
        Context context = this.A06;
        android.net.Uri uri = c54832OLr.A00;
        if (uri.toString() == null) {
            try {
                context.getResources().getResourceName(0);
            } catch (Resources.NotFoundException unused) {
            }
        }
        try {
            C54516O6t c54516O6t = this.A08;
            StringBuilder A0y = AbstractC31174DnI.A0y(uri);
            A0y.append('_');
            A0y.append(0);
            String obj = A0y.toString();
            HashMap hashMap = c54516O6t.A01;
            Number A0W = AbstractC31171DnF.A0W(obj, hashMap);
            if (A0W != null) {
                j = A0W.longValue();
            } else {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(uri.getPath());
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                mediaMetadataRetriever.release();
                if (extractMetadata == null) {
                    j = 0;
                } else {
                    j = Long.parseLong(extractMetadata);
                }
                MSX.A1N(obj, hashMap, j);
            }
            this.A04 = j;
            StringBuilder A0y2 = AbstractC31174DnI.A0y(uri);
            A0y2.append('_');
            A0y2.append(0);
            String obj2 = A0y2.toString();
            Number A0W2 = AbstractC31171DnF.A0W(obj2, this.A05);
            if (A0W2 != null) {
                this.A00 = A0W2.intValue();
                interfaceC16820sZ.invoke();
                return;
            }
            String path = uri.getPath();
            SoundPool soundPool = this.A02;
            if (soundPool != null) {
                soundPool.load(path, 1);
            }
            SoundPool soundPool2 = this.A02;
            if (soundPool2 != null) {
                soundPool2.setOnLoadCompleteListener(new C55341Oh6(this, obj2, interfaceC16820sZ, interfaceC16820sZ2));
            }
        } catch (Resources.NotFoundException e) {
            e = e;
            A1C = AbstractC166987dD.A1C();
            str = "Res not found: ";
            C0K8.A0F("SoundPoolPlayer", AbstractC167017dG.A0n(c54832OLr, str, A1C), e);
        } catch (FileNotFoundException e2) {
            e = e2;
            A1C = AbstractC166987dD.A1C();
            str = "File not found: ";
            C0K8.A0F("SoundPoolPlayer", AbstractC167017dG.A0n(c54832OLr, str, A1C), e);
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void EhH(float f) {
        SoundPool soundPool;
        int i = this.A01;
        if (i != -1 && (soundPool = this.A02) != null) {
            soundPool.setVolume(i, f, f);
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void Eof() {
        SoundPool soundPool = this.A02;
        if (soundPool != null) {
            soundPool.stop(this.A01);
        }
        this.A01 = -1;
    }

    @Override // X.InterfaceC58199Pr5
    public final void pause() {
        if (this.A01 != -1) {
            this.A09.A00("SoundPool paused", new Object[0]);
            SoundPool soundPool = this.A02;
            if (soundPool != null) {
                soundPool.pause(this.A01);
            }
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void release() {
        int i = this.A01;
        if (i != -1) {
            SoundPool soundPool = this.A02;
            if (soundPool != null) {
                soundPool.stop(i);
            }
            this.A01 = -1;
        }
    }
}
