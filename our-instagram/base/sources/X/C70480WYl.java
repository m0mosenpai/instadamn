package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WYl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70480WYl implements InterfaceC71995XEj {
    public ByteBuffer A00;
    public final InterfaceC71995XEj A01;
    public final List A02;

    @Override // X.InterfaceC71995XEj
    public final void addEffect(MediaEffect mediaEffect) {
        C14360o3.A0B(mediaEffect, 0);
        for (InterfaceC71995XEj interfaceC71995XEj : this.A02) {
            if (interfaceC71995XEj.isEffectSupported(mediaEffect)) {
                interfaceC71995XEj.addEffect(mediaEffect);
            }
        }
        InterfaceC71995XEj interfaceC71995XEj2 = this.A01;
        if (interfaceC71995XEj2.isEffectSupported(mediaEffect)) {
            interfaceC71995XEj2.addEffect(mediaEffect);
        }
    }

    @Override // X.InterfaceC71995XEj
    public final void configure(C69065VhG c69065VhG) {
        C14360o3.A0B(c69065VhG, 0);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC71995XEj) it.next()).configure(c69065VhG);
        }
        this.A01.configure(c69065VhG);
        int i = c69065VhG.A02.A00 * 1024 * 2;
        if (this.A00 == null) {
            this.A00 = AbstractC65702TsY.A0j(i);
        }
    }

    @Override // X.InterfaceC71995XEj
    public final boolean isEffectSupported(MediaEffect mediaEffect) {
        boolean z;
        C14360o3.A0B(mediaEffect, 0);
        loop0: while (true) {
            z = false;
            for (InterfaceC71995XEj interfaceC71995XEj : this.A02) {
                if (z || interfaceC71995XEj.isEffectSupported(mediaEffect)) {
                    z = true;
                }
            }
        }
        if (!z && !this.A01.isEffectSupported(mediaEffect)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC71995XEj
    public final ByteBuffer process(ByteBuffer[] byteBufferArr, long j) {
        C14360o3.A0B(byteBufferArr, 0);
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer != null) {
            byteBuffer.clear();
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                byteBufferArr = ((XLE) it.next()).applyEffects(byteBufferArr, j);
            }
            ByteBuffer process = this.A01.process(byteBufferArr, j);
            this.A00 = process;
            C14360o3.A0C(process, AbstractC111324zv.A00(1148));
            return process;
        }
        throw new IllegalStateException("This method should not be called without having called configure()");
    }

    @Override // X.InterfaceC71995XEj
    public final void removeEffect(MediaEffect mediaEffect) {
        C14360o3.A0B(mediaEffect, 0);
        for (InterfaceC71995XEj interfaceC71995XEj : this.A02) {
            if (interfaceC71995XEj.isEffectSupported(mediaEffect)) {
                interfaceC71995XEj.removeEffect(mediaEffect);
            }
        }
        InterfaceC71995XEj interfaceC71995XEj2 = this.A01;
        if (interfaceC71995XEj2.isEffectSupported(mediaEffect)) {
            interfaceC71995XEj2.removeEffect(mediaEffect);
        }
    }

    @Override // X.InterfaceC71995XEj
    public final void warmup(ByteBuffer[] byteBufferArr, long j) {
        C14360o3.A0B(byteBufferArr, 0);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC71995XEj) it.next()).warmup(byteBufferArr, j);
        }
        this.A01.warmup(byteBufferArr, j);
    }

    @Override // X.InterfaceC71995XEj
    public final void disableTrack(int i) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC71995XEj) it.next()).disableTrack(i);
        }
        this.A01.disableTrack(i);
    }

    @Override // X.InterfaceC71995XEj
    public final void enableTrack(int i) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC71995XEj) it.next()).enableTrack(i);
        }
        this.A01.enableTrack(i);
    }

    @Override // X.InterfaceC71995XEj
    public final int getWarmupDurationInSec() {
        Object next;
        Iterator it = this.A02.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int warmupDurationInSec = ((InterfaceC71995XEj) next).getWarmupDurationInSec();
                do {
                    Object next2 = it.next();
                    int warmupDurationInSec2 = ((InterfaceC71995XEj) next2).getWarmupDurationInSec();
                    if (warmupDurationInSec < warmupDurationInSec2) {
                        next = next2;
                        warmupDurationInSec = warmupDurationInSec2;
                    }
                } while (it.hasNext());
            }
        }
        InterfaceC71995XEj interfaceC71995XEj = (InterfaceC71995XEj) next;
        if (interfaceC71995XEj != null) {
            return interfaceC71995XEj.getWarmupDurationInSec();
        }
        return 0;
    }

    public C70480WYl(InterfaceC71995XEj interfaceC71995XEj, List list) {
        this.A02 = list;
        this.A01 = interfaceC71995XEj;
    }

    @Override // X.InterfaceC71995XEj
    public final /* bridge */ /* synthetic */ void addEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        C14360o3.A0B(mediaEffect, 1);
        for (InterfaceC71995XEj interfaceC71995XEj : this.A02) {
            if (interfaceC71995XEj.isEffectSupported(mediaEffect)) {
                interfaceC71995XEj.addEffect(Integer.valueOf(intValue), mediaEffect);
            }
        }
        InterfaceC71995XEj interfaceC71995XEj2 = this.A01;
        if (interfaceC71995XEj2.isEffectSupported(mediaEffect)) {
            interfaceC71995XEj2.addEffect(Integer.valueOf(intValue), mediaEffect);
        }
    }

    @Override // X.InterfaceC71995XEj
    public final /* bridge */ /* synthetic */ void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        C14360o3.A0B(mediaEffect, 1);
        for (InterfaceC71995XEj interfaceC71995XEj : this.A02) {
            if (interfaceC71995XEj.isEffectSupported(mediaEffect)) {
                interfaceC71995XEj.removeEffect(Integer.valueOf(intValue), mediaEffect);
            }
        }
        InterfaceC71995XEj interfaceC71995XEj2 = this.A01;
        if (interfaceC71995XEj2.isEffectSupported(mediaEffect)) {
            interfaceC71995XEj2.removeEffect(Integer.valueOf(intValue), mediaEffect);
        }
    }
}
