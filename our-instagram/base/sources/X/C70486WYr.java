package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WYr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70486WYr implements XLE {
    public static final int A05 = (int) Math.pow(2.0d, 15.0d);
    public static final int A06 = (int) Math.pow(2.0d, 16.0d);
    public int A00;
    public ByteBuffer A01;
    public boolean[] A03 = new boolean[0];
    public List[] A02 = new List[0];
    public final List A04 = new ArrayList();

    @Override // X.XLE
    public final ByteBuffer[] applyEffects(ByteBuffer[] byteBufferArr, long j) {
        int length = byteBufferArr.length;
        ByteBuffer[] byteBufferArr2 = new ByteBuffer[length];
        for (int i = 0; i < length; i++) {
            boolean z = this.A03[i];
            ByteBuffer byteBuffer = byteBufferArr[i];
            if (z) {
                byteBuffer = AbstractC68337VMx.A00(AbstractC68337VMx.A00(byteBuffer, this.A02[i]), this.A04);
            }
            byteBufferArr2[i] = byteBuffer;
        }
        return byteBufferArr2;
    }

    @Override // X.InterfaceC71995XEj
    public final void warmup(ByteBuffer[] byteBufferArr, long j) {
    }

    @Override // X.InterfaceC71995XEj
    public final void addEffect(MediaEffect mediaEffect) {
        if (!(mediaEffect instanceof C23503AbJ)) {
            throw new UnsupportedOperationException(AbstractC167017dG.A0n(mediaEffect, "MediaEffect: ", new StringBuilder()));
        }
        this.A04.add(mediaEffect);
    }

    @Override // X.InterfaceC71995XEj
    public final void configure(C69065VhG c69065VhG) {
        int i = c69065VhG.A00;
        this.A03 = new boolean[i];
        List[] listArr = new List[i];
        this.A02 = listArr;
        for (int i2 = 0; i2 < i; i2++) {
            listArr[i2] = new ArrayList();
        }
        this.A00 = c69065VhG.A02.A00 * 1024 * 2;
    }

    @Override // X.InterfaceC71995XEj
    public final void disableTrack(int i) {
        this.A03[i] = false;
    }

    @Override // X.InterfaceC71995XEj
    public final void enableTrack(int i) {
        this.A03[i] = true;
    }

    @Override // X.InterfaceC71995XEj
    public final /* synthetic */ int getWarmupDurationInSec() {
        return 0;
    }

    @Override // X.InterfaceC71995XEj
    public final boolean isEffectSupported(MediaEffect mediaEffect) {
        if (mediaEffect instanceof C23503AbJ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71995XEj
    public final ByteBuffer process(ByteBuffer[] byteBufferArr, long j) {
        int i;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            byteBuffer = AbstractC65702TsY.A0j(this.A00);
            this.A01 = byteBuffer;
        }
        byteBuffer.clear();
        ByteBuffer[] applyEffects = applyEffects(byteBufferArr, j);
        for (int i2 = 0; i2 < this.A00; i2 += 2) {
            short s = 0;
            for (int i3 = 0; i3 < applyEffects.length; i3++) {
                if (this.A03[i3]) {
                    short s2 = applyEffects[i3].getShort(i2);
                    int i4 = A05;
                    int i5 = s + i4;
                    int i6 = s2 + i4;
                    if (i5 < i4 && i6 < i4) {
                        i = (i5 * i6) / i4;
                    } else {
                        i = (((i5 + i6) * 2) - ((i5 * i6) / i4)) - A06;
                    }
                    int i7 = A06;
                    if (i == i7) {
                        i = i7 - 1;
                    }
                    s = (short) (i - i4);
                }
            }
            this.A01.putShort(s);
        }
        this.A01.flip();
        return this.A01;
    }

    @Override // X.InterfaceC71995XEj
    public final void removeEffect(MediaEffect mediaEffect) {
        if (!(mediaEffect instanceof C23503AbJ)) {
            throw new UnsupportedOperationException();
        }
        this.A04.remove(mediaEffect);
    }

    @Override // X.InterfaceC71995XEj
    public final void addEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue >= 0 && (mediaEffect instanceof C23503AbJ)) {
            this.A02[intValue].add(mediaEffect);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Track Index: ");
        sb.append(num);
        throw new UnsupportedOperationException(AbstractC167017dG.A0n(mediaEffect, ", MediaEffect: ", sb));
    }

    @Override // X.InterfaceC71995XEj
    public final void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue >= 0 && (mediaEffect instanceof C23503AbJ)) {
            this.A02[intValue].remove(mediaEffect);
            return;
        }
        throw new UnsupportedOperationException();
    }
}
