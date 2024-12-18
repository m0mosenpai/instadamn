package X;

import com.instagram.feed.audio.AudioIntf;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ge8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37428Ge8 implements C5H1 {
    public final /* synthetic */ AudioIntf A00;

    public C37428Ge8(AudioIntf audioIntf) {
        this.A00 = audioIntf;
    }

    @Override // X.C5H1
    public final String Ae0() {
        return this.A00.Ae1();
    }

    @Override // X.InterfaceC224217b
    public final Long B39() {
        AudioIntf audioIntf = this.A00;
        if (audioIntf.Ae2() != null) {
            return Long.valueOf(TimeUnit.MICROSECONDS.toMillis(AbstractC25232BEp.A0t(audioIntf.Ae2())));
        }
        return null;
    }

    @Override // X.InterfaceC224217b
    public final /* bridge */ /* synthetic */ Object B4F() {
        return new C42351IpD(this.A00);
    }
}
