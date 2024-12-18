package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.view.TextureView;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.ArrayList;

/* renamed from: X.AzO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24863AzO implements Runnable {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ AbstractC223709uF A01;
    public final /* synthetic */ C89F A02;
    public final /* synthetic */ C89P A03;
    public final /* synthetic */ C89N A04;

    public RunnableC24863AzO(AbstractC59962oe abstractC59962oe, AbstractC223709uF abstractC223709uF, C89F c89f, C89P c89p, C89N c89n) {
        this.A02 = c89f;
        this.A00 = abstractC59962oe;
        this.A03 = c89p;
        this.A04 = c89n;
        this.A01 = abstractC223709uF;
    }

    /* JADX WARN: Type inference failed for: r19v1, types: [X.XC9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.PzK, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        C68920VeK c68920VeK;
        AAN A00 = AbstractC226279yk.A00();
        C89F c89f = this.A02;
        TextureView textureView = c89f.A0G;
        textureView.setLayoutParams(A00.A06);
        C89F.A04(c89f, A00);
        C89F.A00(this.A00, c89f, this.A03, true);
        C89F.A03(c89f);
        C89N c89n = this.A04;
        Context context = c89f.A0F;
        Medium medium = ((C215179ft) this.A01).A00;
        AbstractC167007dF.A1F(context, 0, medium);
        C22947A9r c22947A9r = c89n.A01;
        if (c22947A9r == null) {
            c22947A9r = new C22947A9r(context, c89n.A05, new A6L(c89n));
            c89n.A01 = c22947A9r;
        }
        UserSession userSession = c22947A9r.A02;
        W5s A05 = AbstractC86593tX.A05(userSession, false, false, false, false, false);
        Context context2 = c22947A9r.A01;
        C52250NAo c52250NAo = new C52250NAo(textureView, AbstractC53867Nrv.A00(userSession), AbstractC53867Nrv.A00(userSession));
        C23518AbY A002 = AbstractC224689vt.A00(context2, null, null, false);
        C50665MYi c50665MYi = new C50665MYi(userSession);
        if (A05.A0q) {
            c68920VeK = new C68920VeK(new UserFlowLoggerImpl(C006802i.A0p), 791877554);
        } else {
            c68920VeK = null;
        }
        C55208OeM c55208OeM = new C55208OeM(context2, c50665MYi, new Object(), new Object(), C55768Opc.A00, c68920VeK, null, A002, A05, c52250NAo, "", null, null, AbstractC53947NtK.A00("template_landing_page", null), 59008);
        c22947A9r.A00 = c55208OeM;
        c55208OeM.A06 = new C23605Acz(medium, c22947A9r);
        C195868lW c195868lW = new C195868lW(medium, medium.A0B, medium.A04, medium.A07);
        int i = medium.A03;
        ArrayList A1M = AbstractC16960so.A1M(new C115475Kh(null, null, null, AbstractC23036ADs.A01(c195868lW, c195868lW.A06(), 0, i, 0, i, i), null, null, null, null, String.valueOf(medium.A05), 0.0f, 0, 0, 0, 0, 0, 0, 1879039998, false, false, false, false));
        int i2 = medium.A03;
        Integer num = C05F.A0C;
        C199518rz c199518rz = new C199518rz(false);
        AssetManager assets = context2.getAssets();
        C14360o3.A07(assets);
        ImmutableList of = ImmutableList.of((Object) C23097AGh.A00.A00(new C198548q3(assets, C18U.A06(C06090Tz.A05, userSession, 36316233410285758L)), c199518rz, Float.valueOf(50.0f), Float.valueOf(0.5f), num, "blur_transition", i2, i2, 0L, i2, AbstractC166987dD.A0y().A0b()));
        C14360o3.A07(of);
        MediaComposition A003 = AbstractC54918OQs.A00(of, userSession, null, A1M, 1.0f);
        C14360o3.A0B(A003, 0);
        C55208OeM c55208OeM2 = c22947A9r.A00;
        if (c55208OeM2 != null) {
            CameraSpec cameraSpec = c22947A9r.A03;
            c55208OeM2.A0A(A003, cameraSpec.A03, cameraSpec.A02, -1, -1, 0, true);
        }
        C55208OeM c55208OeM3 = c22947A9r.A00;
        if (c55208OeM3 != null) {
            c55208OeM3.A06();
        }
    }
}
