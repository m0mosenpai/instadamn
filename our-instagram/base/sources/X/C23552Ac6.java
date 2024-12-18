package X;

import android.os.Handler;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import java.io.File;
import java.util.List;

/* renamed from: X.Ac6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23552Ac6 implements C2JL {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ InterfaceC203698zY A01;
    public final /* synthetic */ C203728zf A02;
    public final /* synthetic */ C150156pL A03;
    public final /* synthetic */ XplatModelPaths A04;
    public final /* synthetic */ C1819185b A05;
    public final /* synthetic */ File A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ List A08;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        AbstractC203788zm.A00(this.A00, new RunnableC24821Ayh(this.A01, this.A03, this.A05, th));
    }

    public C23552Ac6(Handler handler, InterfaceC203698zY interfaceC203698zY, C203728zf c203728zf, C150156pL c150156pL, XplatModelPaths xplatModelPaths, C1819185b c1819185b, File file, List list, List list2) {
        this.A02 = c203728zf;
        this.A06 = file;
        this.A04 = xplatModelPaths;
        this.A08 = list;
        this.A07 = list2;
        this.A05 = c1819185b;
        this.A00 = handler;
        this.A03 = c150156pL;
        this.A01 = interfaceC203698zY;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C203728zf c203728zf = this.A02;
        File file = this.A06;
        XplatModelPaths xplatModelPaths = this.A04;
        List list = this.A08;
        if (list == null) {
            list = C16930sl.A00;
        }
        List list2 = this.A07;
        if (list2 == null) {
            list2 = C16930sl.A00;
        }
        c203728zf.A00(xplatModelPaths, this.A05, file, list, list2);
    }
}
