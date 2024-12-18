package X;

import java.io.File;

/* renamed from: X.84J, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84J {
    public String A00;
    public final C1QY A01;
    public final C49602Pt A02;

    public final File A00(String str) {
        File C5c;
        C14360o3.A0B(str, 0);
        if (this.A00 != null) {
            C5c = new File(this.A02.A01(), this.A00);
        } else {
            C5c = this.A02.C5c();
        }
        AbstractC189888b7.A00(C5c);
        return new File(C5c, AnonymousClass001.A0g("tts_audio_", str, ".mp3"));
    }

    public C84J(C49602Pt c49602Pt) {
        this.A02 = c49602Pt;
        C1QX c1qx = new C1QX();
        c1qx.A04 = EnumC23341Bw.API;
        c1qx.A03 = C1Ef.OnScreen;
        this.A01 = c1qx.A00();
    }
}
