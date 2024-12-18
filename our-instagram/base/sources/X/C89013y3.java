package X;

import com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: X.3y3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89013y3 extends AbstractC89023y4 {
    public final AbstractC40011tS A00;
    public final File A01;
    public final Pattern A02;
    public final DefaultFalcoAcsProvider A03;

    public C89013y3(DefaultFalcoAcsProvider defaultFalcoAcsProvider, C88753xb c88753xb, AbstractC40011tS abstractC40011tS, File file) {
        super(c88753xb, file);
        this.A02 = Pattern.compile("<falco_acs_placeholder_claim>");
        this.A01 = file;
        this.A00 = abstractC40011tS;
        this.A03 = defaultFalcoAcsProvider;
    }
}
