package X;

import android.app.Application;
import com.instagram.settings.language.ContentLanguageSettingsRepository;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Mdq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50859Mdq extends C193578hc {
    public List A00;
    public final ContentLanguageSettingsRepository A01;
    public final Locale A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50859Mdq(Application application, ContentLanguageSettingsRepository contentLanguageSettingsRepository, Locale locale) {
        super(application);
        C14360o3.A0B(application, 3);
        this.A01 = contentLanguageSettingsRepository;
        this.A02 = locale;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A03 = A12;
        this.A04 = AbstractC07080Za.A03(A12);
        this.A05 = AbstractC25225BEi.A1H(new C51913Mwv(C16930sl.A00));
    }
}
