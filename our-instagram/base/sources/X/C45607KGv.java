package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl;
import com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel;
import com.instagram.gallery.scanner.MediaScannerScheduler;
import java.io.File;

/* renamed from: X.KGv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45607KGv extends AbstractC61132qb {
    public final int A00;
    public final Resources A01;
    public final UserSession A02;
    public final MagicMediaRemixContentCompositorImpl A03;
    public final C47365KwG A04;
    public final C47907LEb A05;
    public final C189268a2 A06;
    public final MediaScannerScheduler A07;
    public final C43901JbB A08;
    public final File A09;
    public final String A0A;
    public final C60322pF A0B;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C43901JbB c43901JbB = this.A08;
        UserSession userSession = this.A02;
        KZD A00 = AbstractC46790Kml.A00(userSession);
        C47907LEb c47907LEb = this.A05;
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A0d, MagicMediaRemixViewModel.class);
        C189268a2 c189268a2 = this.A06;
        MediaScannerScheduler mediaScannerScheduler = this.A07;
        MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl = this.A03;
        C50354MLg c50354MLg = new C50354MLg(this, 7);
        C60352pJ c60352pJ = new C60352pJ(userSession);
        int i = this.A00;
        C47365KwG c47365KwG = this.A04;
        String str = this.A0A;
        Resources resources = this.A01;
        C14360o3.A06(resources);
        return new MagicMediaRemixViewModel(resources, magicMediaRemixContentCompositorImpl, c60352pJ, c47365KwG, A00, c47907LEb, c189268a2, mediaScannerScheduler, c43901JbB, A04, str, c50354MLg, i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.2pF] */
    public C45607KGv(Context context, UserSession userSession, MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl, String str) {
        this.A02 = userSession;
        this.A03 = magicMediaRemixContentCompositorImpl;
        this.A0A = str;
        this.A05 = new C47907LEb(context, userSession);
        ?? obj = new Object();
        this.A0B = obj;
        this.A08 = AbstractC43895Jb5.A00(context, userSession, obj);
        this.A07 = AbstractC60332pG.A00(context, userSession, obj);
        this.A06 = new C189268a2(context);
        this.A00 = AbstractC167007dF.A0K(context).widthPixels;
        this.A09 = context.getCacheDir();
        this.A04 = (C47365KwG) userSession.A01(C47365KwG.class, new MHU(0, context, userSession));
        this.A01 = context.getResources();
    }
}
