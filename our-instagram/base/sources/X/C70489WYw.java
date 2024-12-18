package X;

import com.facebook.cvat.ctaudioeffect.CTAudioProcessor;

/* renamed from: X.WYw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70489WYw implements XLF {
    public final OMT A00;
    public final C54507O6k A01;

    @Override // X.X9T
    public final /* bridge */ /* synthetic */ InterfaceC71995XEj ALF() {
        return new CTAudioProcessor(this.A00, this.A01);
    }

    @Override // X.XLF
    public final /* bridge */ /* synthetic */ XLE ALG() {
        return new CTAudioProcessor(this.A00, this.A01);
    }

    public C70489WYw(OMT omt, C54507O6k c54507O6k) {
        this.A00 = omt;
        this.A01 = c54507O6k;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.OMT] */
    public C70489WYw() {
        this(new Object(), new C54507O6k(null, "", null));
    }
}
