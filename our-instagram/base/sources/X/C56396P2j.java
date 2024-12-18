package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filter.FilterGroup;
import java.util.List;

/* renamed from: X.P2j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56396P2j implements InterfaceC58048PoZ {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC58147PqC A03;
    public final C55006OVn A04;
    public final SurfaceCropFilter A05;
    public final InterfaceC58176Pqg A06;
    public final FilterGroup A07;
    public final Integer A08;
    public final List A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;
    public final Handler A0C;
    public final C55003OVg A0D;

    public C56396P2j(Context context, UserSession userSession, InterfaceC58147PqC interfaceC58147PqC, SurfaceCropFilter surfaceCropFilter, InterfaceC58176Pqg interfaceC58176Pqg, C55003OVg c55003OVg, FilterGroup filterGroup, Integer num, List list, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, int i) {
        AbstractC167027dH.A0a(1, context, userSession, interfaceC58147PqC, interfaceC58176Pqg);
        C14360o3.A0B(c55003OVg, 12);
        this.A0C = AbstractC167007dF.A0J();
        this.A03 = interfaceC58147PqC;
        this.A07 = filterGroup;
        this.A05 = surfaceCropFilter;
        this.A08 = num;
        this.A00 = i;
        this.A06 = interfaceC58176Pqg;
        this.A0B = interfaceC08830cm;
        this.A0A = interfaceC08830cm2;
        this.A09 = list;
        this.A01 = AbstractC166987dD.A0O(context);
        this.A0D = c55003OVg;
        this.A02 = userSession;
        this.A04 = new C55006OVn(context, userSession, interfaceC58147PqC, num);
    }

    public static final void A00(EnumC53116NeT enumC53116NeT, Exception exc, String str) {
        C0f5 AEp = C18950wb.A01.AEp("ImageRenderer#renderAllConfigs", 817892527);
        AEp.ABW("renderTarget", enumC53116NeT.toString());
        AbstractC167007dF.A15(AEp, "errorType", str, exc);
    }

    @Override // X.InterfaceC58048PoZ
    public final C55003OVg C4J() {
        return this.A0D;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0 A[Catch: Exception -> 0x01f8, IllegalStateException -> 0x020d, Xdv -> 0x0222, IOException -> 0x0237, 9rn -> 0x024c, 8o4 -> 0x0261, all -> 0x0281, TryCatch #2 {8o4 -> 0x0261, blocks: (B:11:0x007e, B:22:0x0082, B:24:0x008e, B:25:0x00ab, B:27:0x00b9, B:29:0x00cb, B:30:0x00cf, B:31:0x00df, B:32:0x00e3, B:34:0x00f0, B:35:0x00f2, B:40:0x01b3, B:49:0x01c1, B:52:0x00fb, B:54:0x0102, B:55:0x0107, B:56:0x0111, B:58:0x0129, B:59:0x014a, B:60:0x012e, B:62:0x0132, B:63:0x013a, B:64:0x0151, B:14:0x01c2, B:17:0x01dd), top: B:10:0x007e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165 A[Catch: all -> 0x01c0, TRY_LEAVE, TryCatch #0 {, blocks: (B:37:0x015a, B:39:0x0165, B:43:0x01b8, B:44:0x01bf), top: B:36:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b8 A[Catch: all -> 0x01c0, TRY_ENTER, TryCatch #0 {, blocks: (B:37:0x015a, B:39:0x0165, B:43:0x01b8, B:44:0x01bf), top: B:36:0x015a }] */
    @Override // X.InterfaceC58048PoZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EGV() {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56396P2j.EGV():void");
    }
}
