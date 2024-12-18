package X;

import android.content.Context;
import java.io.File;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class OWL {
    public static Context A00;
    public static final OWL A01 = new Object();

    public final File A00(EnumC46183KcL enumC46183KcL, String str) {
        C14360o3.A0B(str, 1);
        StringBuilder A0y = AbstractC31174DnI.A0y(enumC46183KcL);
        A0y.append('_');
        A0y.append(str);
        A0y.append('_');
        String language = Locale.getDefault().getLanguage();
        C14360o3.A07(language);
        A0y.append(language);
        return MSW.A0w(MSW.A0w(A00.getFilesDir(), "superlative"), AbstractC166997dE.A0x(".png", A0y));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.OWL, java.lang.Object] */
    static {
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        A00 = context;
        File A0w = MSW.A0w(context.getFilesDir(), "superlative");
        if (!A0w.exists()) {
            A0w.mkdir();
        }
    }

    public final void A01(C38681qz c38681qz) {
        if (c38681qz != null) {
            File A0w = MSW.A0w(A00.getFilesDir(), "superlative");
            if (A0w.exists()) {
                AbstractC166987dD.A1Z(new C50534MSn(c38681qz, A0w, null, 33), AbstractC24771Iv.A02(2022716810, 3));
            }
        }
    }
}
