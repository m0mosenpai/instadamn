package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.io.IOException;

/* renamed from: X.SWz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62918SWz {
    public C6FQ A00;
    public String A01 = null;
    public Fragment A02;
    public final Context A03;
    public final C62558SGj A04;

    public static void A00(C62918SWz c62918SWz) {
        C60928Rbi c60928Rbi = new C60928Rbi(c62918SWz, 1);
        Intent A0E = AbstractC58318PtA.A0E("android.media.action.IMAGE_CAPTURE");
        try {
            Context context = c62918SWz.A03;
            File A04 = AbstractC13530mf.A04(context);
            android.net.Uri A00 = FileProvider.A00(context, A04);
            c62918SWz.A01 = AnonymousClass001.A0R("file://", A04.getCanonicalPath());
            A0E.setFlags(1);
            A0E.putExtra("output", A00);
            C6BQ.A0K(c62918SWz.A00, c60928Rbi);
            C12260kU.A07(c62918SWz.A02, A0E, 1);
        } catch (ActivityNotFoundException | IOException e) {
            C62558SGj c62558SGj = c62918SWz.A04;
            C6BQ.A0E(c62558SGj.A00, c62558SGj.A01, AbstractC58319PtB.A1Z(e));
        }
    }

    public C62918SWz(Context context, Fragment fragment, C62558SGj c62558SGj, C6FQ c6fq) {
        this.A02 = fragment;
        this.A03 = context;
        this.A00 = c6fq;
        this.A04 = c62558SGj;
    }
}
