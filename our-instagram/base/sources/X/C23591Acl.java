package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Acl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23591Acl implements InterfaceC11380iw {
    public static final AtomicBoolean A0K = AbstractC166997dE.A17();
    public static final String __redex_internal_original_name = "MediaScanner";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Bitmap A05;
    public C189268a2 A06;
    public EnumC222979sc A07;
    public A92 A08;
    public final Context A09;
    public final BitmapFactory.Options A0A;
    public final UserSession A0B;
    public final C60342pI A0C;
    public final C195618l1 A0D;
    public final A8N A0E;
    public final C60322pF A0F;
    public final C47945LFz A0G;
    public final ArrayList A0H;
    public final C19L A0I;
    public final boolean A0J;

    private final synchronized void A01(EnumC222979sc enumC222979sc) {
        this.A07 = enumC222979sc;
        A92 a92 = this.A08;
        String A0n = AbstractC167017dG.A0n(enumC222979sc, "[AMG] Exit Reason:", AbstractC166987dD.A1C());
        C23031Ai A00 = AbstractC23021Ah.A00(this.A0B);
        if (a92 != null) {
            C14360o3.A0B(A0n, 0);
            a92.A01.append(A0n);
        }
        this.A0G.A00(A0n);
        C195618l1 c195618l1 = this.A0D;
        int i = this.A00;
        InterfaceC19610xo ARD = c195618l1.A00.ARD();
        ARD.E7D("scanned_media_key", i);
        ARD.apply();
        Integer num = enumC222979sc.A00;
        Integer num2 = C05F.A00;
        if (num == num2 && this.A02 > 0) {
            AbstractC23641Du.A03(num2, C12L.A00.AOT(281480192, 3), new MCL((InterfaceC23621Ds) null, this, A00, 49), this.A0I);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "media_scanner";
    }

    public /* synthetic */ C23591Acl(UserSession userSession, C60342pI c60342pI, C60322pF c60322pF) {
        A8N a8n = new A8N(userSession);
        C19K A0w = AbstractC167017dG.A0w(C12L.A00, 426);
        C14360o3.A0B(A0w, 5);
        this.A0B = userSession;
        this.A0F = c60322pF;
        this.A0C = c60342pI;
        this.A0E = a8n;
        this.A0I = A0w;
        Context A06 = userSession.deviceSession.A06();
        this.A09 = A06;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0H = A1E;
        this.A0A = new BitmapFactory.Options();
        this.A0G = (C47945LFz) C47945LFz.A03.getValue();
        if (AbstractC166987dD.A0y().A0V()) {
            this.A08 = (A92) userSession.A01(A92.class, new C57535Pg9(49, A06.getApplicationContext(), userSession));
        }
        this.A0D = new C195618l1(userSession);
        A1E.add(new AjO(A06));
        IgVoltronModelLoader A00 = IgVoltronModelLoader.Companion.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317977167140587L) && A00.arePytorchLibrariesLoaded.get()) {
            A1E.add(new C23930AjP(A06, new C8KU(A06, new AZT(0), new C85N(A06, userSession)), userSession));
            A1E.add(new AjN(A06, new C8ED(userSession, AbstractC166987dD.A1J(C8E4.A0H.A00()))));
        }
        boolean A062 = C18U.A06(c06090Tz, userSession, 36317977169434365L);
        if ((C18U.A06(c06090Tz, userSession, 36318844750666289L) && A00.arePytorchLibrariesLoaded.get()) || (A062 && A00.areExecuTorchLibrariesLoaded.get())) {
            A1E.add(new C23931AjQ(userSession, A06, A062));
        }
        this.A0J = C18U.A06(c06090Tz, userSession, 36317977167206124L);
    }

    private final void A00() {
        Integer num;
        String str;
        int i;
        EnumC222979sc enumC222979sc = this.A07;
        if (enumC222979sc == null) {
            C0w9.A03("MediaScanner#exitedWithoutExitReason", "");
            A01(EnumC222979sc.A0B);
            num = null;
        } else {
            num = enumC222979sc.A00;
        }
        Integer num2 = C05F.A00;
        A8N a8n = this.A0E;
        if (num == num2) {
            str = enumC222979sc.name();
            i = 0;
            C14360o3.A0B(str, 0);
        } else {
            if (enumC222979sc == null || (str = enumC222979sc.name()) == null) {
                str = "UNKNOWN";
            }
            i = 1;
        }
        C57259Pbh c57259Pbh = new C57259Pbh(str, a8n, i);
        if (a8n.A00 != -1) {
            c57259Pbh.invoke();
        }
        C189268a2 c189268a2 = this.A06;
        if (c189268a2 != null) {
            c189268a2.A00.close();
        }
        if (enumC222979sc != null) {
        } else {
            throw AbstractC166997dE.A0g();
        }
    }

    private final boolean A02() {
        EnumC222979sc enumC222979sc;
        if (this.A07 == null) {
            if (this.A02 >= Integer.MAX_VALUE) {
                enumC222979sc = EnumC222979sc.A06;
            } else if (Thread.currentThread().isInterrupted()) {
                enumC222979sc = EnumC222979sc.A0A;
            } else if (AbstractC25061Kk.A00().A0E()) {
                enumC222979sc = EnumC222979sc.A07;
            } else {
                if (C18U.A06(C06090Tz.A05, this.A0B, 36322164760127520L) && !AbstractC93174Ft.A03(this.A09)) {
                    enumC222979sc = EnumC222979sc.A08;
                }
            }
            A01(enumC222979sc);
        }
        return AbstractC167007dF.A1W(this.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, X.8aB] */
    /* JADX WARN: Type inference failed for: r1v89, types: [X.8a9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23591Acl.A03():void");
    }

    public final void A04() {
        EnumC222979sc enumC222979sc = EnumC222979sc.A0A;
        synchronized (this) {
            if (this.A07 == null) {
                A01(enumC222979sc);
            }
        }
    }
}
