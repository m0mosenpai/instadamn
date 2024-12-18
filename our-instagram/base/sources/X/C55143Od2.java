package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Od2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55143Od2 {
    public C150486px A00;
    public OdrSnapshotHelper A01;
    public C54502O6f A02;
    public BBT A03;
    public AKN A04;
    public InterfaceC150356pk A05;
    public CameraAREffect A06;
    public UserSession A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final C47815L9x A0C;
    public final C55611Omu A0D;
    public final C55613Omw A0E;
    public final C50526MSf A0F;
    public final QuickPerformanceLogger A0G;
    public final C19L A0H;
    public final InterfaceC19390xP A0I;
    public final InterfaceC06180Ui A0J;
    public final boolean A0K;

    public C55143Od2(Context context, C47815L9x c47815L9x, C50526MSf c50526MSf, C19L c19l) {
        C14360o3.A0B(context, 2);
        this.A0H = c19l;
        this.A0B = context;
        this.A0F = c50526MSf;
        this.A0C = c47815L9x;
        this.A0D = new C55611Omu();
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 10);
        this.A0J = A00;
        this.A0I = new C06160Ug(null, A00);
        C55613Omw c55613Omw = new C55613Omw(this);
        this.A0E = c55613Omw;
        this.A0G = c47815L9x != null ? c47815L9x.A05 : null;
        boolean z = c47815L9x != null;
        this.A0K = z;
        if (z) {
            c55613Omw.A00.setFixedElapsedTimeForAnimation(1.0f);
        }
    }

    public final void A06(UserSession userSession, Context context) {
        this.A07 = userSession;
        String str = "userSession";
        InterfaceC150356pk A00 = AbstractC149806oZ.A00(userSession);
        this.A05 = A00;
        UserSession userSession2 = this.A07;
        if (userSession2 != null) {
            HashMap A01 = A01(context, this, A00, userSession2, true);
            C224679vs c224679vs = BE2.A01;
            AnonymousClass818 A002 = A00(context, this);
            UserSession userSession3 = this.A07;
            if (userSession3 != null) {
                C150486px c150486px = this.A00;
                if (c150486px == null) {
                    str = "effectManagerFactory";
                } else {
                    BBT bbt = this.A03;
                    if (bbt == null) {
                        str = "dataProvider";
                    } else {
                        C23326AVl c23326AVl = new C23326AVl(c150486px, bbt, A002, userSession3, true);
                        C14360o3.A0B(c224679vs, 0);
                        A01.put(c224679vs, c23326AVl);
                        this.A0D.A00 = new O1J(this);
                        C47815L9x c47815L9x = this.A0C;
                        if (c47815L9x != null) {
                            this.A01 = new OdrSnapshotHelper(context, c47815L9x, MSW.A1E(this, 0));
                            C224679vs c224679vs2 = A4I.A07;
                            C51737MtK c51737MtK = new C51737MtK(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 0);
                            C14360o3.A0B(c224679vs2, 0);
                            A01.put(c224679vs2, c51737MtK);
                            HashMap A1G = AbstractC166987dD.A1G();
                            A1G.putAll(A01);
                            this.A04 = new AKN(A1G);
                            return;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.83U, java.lang.Object] */
    public static final AnonymousClass818 A00(Context context, C55143Od2 c55143Od2) {
        C54502O6f c54502O6f = c55143Od2.A02;
        if (c54502O6f == null) {
            C14360o3.A0F("rendererProvider");
            throw C00O.createAndThrow();
        }
        return AbstractC201288vC.A00(context, new Object(), null, null, c54502O6f.A00, c54502O6f.A01, 0);
    }

    public static HashMap A01(Context context, C55143Od2 c55143Od2, InterfaceC150356pk interfaceC150356pk, UserSession userSession, boolean z) {
        C54502O6f c54502O6f = new C54502O6f(interfaceC150356pk, userSession);
        c55143Od2.A02 = c54502O6f;
        C150486px A00 = C150476pw.A00(context, c54502O6f.A00, c54502O6f.A01);
        C14360o3.A07(A00);
        c55143Od2.A00 = A00;
        C54502O6f c54502O6f2 = c55143Od2.A02;
        if (c54502O6f2 == null) {
            C14360o3.A0F("rendererProvider");
            throw C00O.createAndThrow();
        }
        C51966My2 c51966My2 = new C51966My2(c55143Od2, z);
        C90O c90o = c55143Od2.A0D.A01;
        C55613Omw c55613Omw = c55143Od2.A0E;
        C14360o3.A0B(c90o, 4);
        c55143Od2.A03 = new AWJ(new C22948A9s(context, A00, c55613Omw, c90o, c51966My2, c54502O6f2.A01, "rich_avatar_view"));
        HashMap hashMap = new HashMap();
        hashMap.put(A4I.A02, context);
        hashMap.put(A4I.A08, "rich_avatar_view");
        return hashMap;
    }

    public static void A02(C55143Od2 c55143Od2, Integer num) {
        c55143Od2.A0J.F8m(new C51501Mom(num));
    }

    public final Object A03(InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        OdrSnapshotHelper odrSnapshotHelper = this.A01;
        if (odrSnapshotHelper == null) {
            str = "odrSnapshotHelper";
        } else {
            AKN akn = this.A04;
            if (akn == null) {
                str = "richMediaViewerAr3d";
            } else {
                return MSX.A0b(odrSnapshotHelper.A02(akn, interfaceC23621Ds));
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A04() {
        AKN akn = this.A04;
        if (akn != null) {
            akn.A09.destroy();
        }
    }

    public final void A05(Context context, String str) {
        String str2;
        if (this.A04 != null) {
            A02(this, C05F.A00);
            QuickPerformanceLogger quickPerformanceLogger = this.A0G;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerPoint(603995461, "effect_download_start");
            }
            AKN akn = this.A04;
            if (akn == null) {
                str2 = "richMediaViewerAr3d";
            } else {
                UserSession userSession = this.A07;
                if (userSession == null) {
                    str2 = "userSession";
                } else {
                    OJA oja = new OJA(context, new C55607Omq(this), userSession, this.A0H);
                    akn.A03 = new C55610Omt(this);
                    oja.A00 = str;
                    oja.A00(akn.A0D);
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }
}
