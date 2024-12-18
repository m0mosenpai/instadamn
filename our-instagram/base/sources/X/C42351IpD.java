package X;

import com.instagram.api.schemas.DirectAudioFallbackUrl;
import com.instagram.feed.audio.AudioIntf;

/* renamed from: X.IpD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42351IpD implements C5H1 {
    public final /* synthetic */ AudioIntf A00;

    @Override // X.InterfaceC224217b
    public final Long B39() {
        return null;
    }

    public C42351IpD(AudioIntf audioIntf) {
        this.A00 = audioIntf;
    }

    @Override // X.C5H1
    public final String Ae0() {
        String Ae1;
        DirectAudioFallbackUrl B4D = this.A00.B4D();
        if (B4D == null || (Ae1 = B4D.Ae1()) == null) {
            return "";
        }
        return Ae1;
    }

    @Override // X.InterfaceC224217b
    public final /* bridge */ /* synthetic */ Object B4F() {
        return null;
    }
}
