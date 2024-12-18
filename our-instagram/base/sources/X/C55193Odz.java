package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Odz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55193Odz {
    public static AudioAttributesCompat A0M;
    public C54832OLr A00;
    public boolean A01;
    public final Context A02;
    public final AudioManager A03;
    public final Handler A04;
    public final C53738Npq A05;
    public final InterfaceC58199Pr5 A06;
    public final C55000OUz A07;
    public final OWW A08;
    public final Queue A09;
    public final java.util.Set A0A;
    public final InterfaceC16820sZ A0B;
    public final C19L A0C;
    public final InterfaceC58136Pq0 A0D;
    public final InterfaceC58207PrD A0E;
    public final O1Y A0F;
    public final C54161Nwx A0G;
    public final ReentrantLock A0H;
    public final InterfaceC09390do A0I;
    public final C12W A0J;
    public final InterfaceC16820sZ A0K;
    public final InterfaceC16620sF A0L;

    public C55193Odz(Context context, AudioManager audioManager, C53738Npq c53738Npq, C55000OUz c55000OUz, InterfaceC58207PrD interfaceC58207PrD, O1Y o1y, C54161Nwx c54161Nwx, C12W c12w) {
        InterfaceC58199Pr5 c55741OpA;
        AbstractC25229BEm.A1I(audioManager, 2, c55000OUz);
        this.A02 = context;
        this.A03 = audioManager;
        this.A0F = o1y;
        this.A0E = interfaceC58207PrD;
        this.A0G = c54161Nwx;
        this.A07 = c55000OUz;
        this.A05 = c53738Npq;
        this.A0J = c12w;
        this.A0C = AnonymousClass194.A02(new AnonymousClass197(null).plus(c12w));
        C55744OpD c55744OpD = new C55744OpD(this);
        this.A0D = c55744OpD;
        this.A0L = new C30193DRy(this, 43);
        this.A0B = new C57549PgN(this, 18);
        this.A0K = new C57549PgN(this, 17);
        this.A0I = C57549PgN.A01(this, 16);
        this.A09 = new LinkedList();
        this.A08 = new OWW(audioManager, c55000OUz, c55744OpD);
        this.A04 = AbstractC167007dF.A0J();
        C53738Npq c53738Npq2 = this.A05;
        if (C18U.A06(C06090Tz.A05, ((N0A) c53738Npq2).A00, 36322942149208843L)) {
            c55741OpA = new C55742OpB(this.A02, this.A07);
        } else {
            c55741OpA = new C55741OpA(this.A02, this.A03, c53738Npq2, this.A07, this.A0C);
        }
        this.A06 = c55741OpA;
        this.A0A = new CopyOnWriteArraySet();
        this.A0H = new ReentrantLock();
    }

    public final synchronized void A04() {
        C55000OUz c55000OUz = this.A07;
        c55000OUz.A00("Calling Stop on the Main thread", new Object[0]);
        c55000OUz.A00("MediaPlayer stopping", new Object[0]);
        this.A08.A02();
        InterfaceC58199Pr5 interfaceC58199Pr5 = this.A06;
        interfaceC58199Pr5.release();
        interfaceC58199Pr5.reset();
        interfaceC58199Pr5.Eof();
        this.A09.clear();
    }

    public final synchronized void A05(C54832OLr c54832OLr, boolean z) {
        C14360o3.A0B(c54832OLr, 0);
        String A00 = A00(c54832OLr, this);
        if (A00 != null) {
            this.A07.A00("Request play %s RtcTone", A00);
        }
        if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            if (z) {
                this.A09.clear();
            }
            if (c54832OLr.A04) {
                this.A07.A00("Start Tone Looping on Main Thread", new Object[0]);
                A02(this);
                InterfaceC58199Pr5 interfaceC58199Pr5 = this.A06;
                interfaceC58199Pr5.ASm();
                interfaceC58199Pr5.EYb(true);
                interfaceC58199Pr5.EZm(this.A0B);
            } else {
                InterfaceC16820sZ interfaceC16820sZ = this.A0K;
                this.A07.A00("Start Tone on Main Thread", new Object[0]);
                A02(this);
                InterfaceC58199Pr5 interfaceC58199Pr52 = this.A06;
                interfaceC58199Pr52.ASm();
                interfaceC58199Pr52.EZm(interfaceC16820sZ);
            }
            A01(c54832OLr, this);
        } else {
            throw AbstractC166987dD.A14("Must be ran on the UI thread!");
        }
    }

    static {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(6);
        builder.setContentType(4);
        A0M = AbstractC50522MSa.A0M(builder);
    }

    public static final String A00(C54832OLr c54832OLr, C55193Odz c55193Odz) {
        String lastPathSegment = c54832OLr.A00.getLastPathSegment();
        if (lastPathSegment == null) {
            c55193Odz.A07.A00("Resource name for tone could not be found.", new Object[0]);
        }
        return lastPathSegment;
    }

    public static final void A01(C54832OLr c54832OLr, C55193Odz c55193Odz) {
        InterfaceC58199Pr5 interfaceC58199Pr5 = c55193Odz.A06;
        interfaceC58199Pr5.ASm();
        interfaceC58199Pr5.Eez();
        interfaceC58199Pr5.EZo(c55193Odz.A0L);
        float f = c54832OLr.A01;
        if (f != -1.0f) {
            interfaceC58199Pr5.EhH(f);
        }
        String A00 = A00(c54832OLr, c55193Odz);
        if (A00 != null) {
            try {
                c55193Odz.A07.A00("Setting up MediaPlayer for tone: %s at volume: %.2f", A00, Float.valueOf(f));
            } catch (Exception unused) {
                if (A00 != null) {
                    Arrays.copyOf(new Object[]{A00}, 1);
                }
                c55193Odz.A04();
                return;
            }
        }
        c55193Odz.A00 = c54832OLr;
        interfaceC58199Pr5.Eeb(c54832OLr, c55193Odz.A0B, new C57549PgN(c55193Odz, 19));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.9vC] */
    public static final void A02(C55193Odz c55193Odz) {
        C55000OUz c55000OUz = c55193Odz.A07;
        c55000OUz.A00("Preparing Media Player for tone", new Object[0]);
        c55000OUz.A00("MediaPlayer stopping", new Object[0]);
        OWW oww = c55193Odz.A08;
        oww.A02();
        InterfaceC58199Pr5 interfaceC58199Pr5 = c55193Odz.A06;
        interfaceC58199Pr5.reset();
        interfaceC58199Pr5.Eof();
        if (oww.A01 == null && oww.A00 == null) {
            oww.A05.A00("requesting audio focus for tones", new Object[0]);
            SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setUsage(2);
            builder.setContentType(1);
            AudioAttributesCompat A0M2 = AbstractC50522MSa.A0M(builder);
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = oww.A02;
            ?? obj = new Object();
            obj.A03 = AH6.A05;
            obj.A00 = 2;
            obj.A01(onAudioFocusChangeListener);
            obj.A03 = A0M2;
            AH6 A00 = obj.A00();
            OWW.A00(A00, oww);
            oww.A00 = A00;
        } else {
            oww.A05.A00("ignoring request for audio focus for tones", new Object[0]);
        }
        c55000OUz.A00("request audio focus on the Main thread", new Object[0]);
        interfaceC58199Pr5.COK();
    }

    public static final void A03(C55193Odz c55193Odz) {
        int i;
        C55000OUz c55000OUz = c55193Odz.A07;
        AudioManager audioManager = c55193Odz.A03;
        int size = audioManager.getActiveRecordingConfigurations().size();
        List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
        C14360o3.A07(activeRecordingConfigurations);
        boolean z = false;
        if ((activeRecordingConfigurations instanceof Collection) && activeRecordingConfigurations.isEmpty()) {
            i = 0;
        } else {
            Iterator<AudioRecordingConfiguration> it = activeRecordingConfigurations.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().isClientSilenced() && (i = i + 1) < 0) {
                    AbstractC16960so.A1T();
                    throw C00O.createAndThrow();
                }
            }
        }
        c55000OUz.A00(AnonymousClass001.A02(size, i, "updateIsAudioDisabledBySystem - size: ", ", numIsClientSilenced: "), new Object[0]);
        List<AudioRecordingConfiguration> activeRecordingConfigurations2 = audioManager.getActiveRecordingConfigurations();
        C14360o3.A07(activeRecordingConfigurations2);
        if (!(activeRecordingConfigurations2 instanceof Collection) || !activeRecordingConfigurations2.isEmpty()) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : activeRecordingConfigurations2) {
                if (!audioRecordingConfiguration.isClientSilenced() && (audioRecordingConfiguration.getClientAudioSource() == 7 || audioRecordingConfiguration.getClientAudioSource() == 6)) {
                    z = true;
                    break;
                }
            }
        }
        boolean z2 = !z;
        boolean z3 = c55193Odz.A01;
        c55193Odz.A01 = z2;
        if (z3 != z2) {
            c55193Odz.A04.postDelayed(new RunnableC56964PPf(c55193Odz, z2), 500L);
        }
    }
}
