package X;

import android.content.Context;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.xanalytics.XAnalyticsAdapter;
import com.instagram.distribgw.client.DGWClientHolder;

/* renamed from: X.4My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94464My extends AbstractC94474Mz {
    public ConnectionConfig A00;
    public boolean A01;
    public final Context A02;
    public final C94454Mx A03;
    public final C4N3 A04;
    public final C5N0 A05;
    public final XAnalyticsAdapter A06;
    public final DGWClientHolder A07;
    public final String A08;

    public C94464My(Context context, C94454Mx c94454Mx, C5N0 c5n0, XAnalyticsAdapter xAnalyticsAdapter, DGWClientHolder dGWClientHolder, String str, String str2, String str3, String str4) {
        super.A01 = str;
        super.A03 = str2;
        super.A02 = str3;
        A01();
        this.A02 = context;
        this.A07 = dGWClientHolder;
        this.A05 = c5n0;
        this.A06 = xAnalyticsAdapter;
        this.A08 = str4;
        this.A03 = c94454Mx;
        this.A04 = new C4N3(context, ((C74123Uq) C3UY.A00).A02(), C4N2.A00, this, C05F.A00);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:3|4|5|(2:6|7)|8|(1:10)|11|(1:13)|14|(6:16|(1:18)|19|(1:21)|22|(1:24)(13:65|66|67|68|(2:70|72)|73|74|(2:76|78)|79|80|(1:82)|83|(1:85)(2:86|87)))(1:94)|25|26|27|(1:61)(2:33|(1:60)(2:55|56))|57) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028f, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0290, code lost:
    
        X.C0K8.A0G("XplatMqttConfigManager", "Error converting user id to number for xplat client", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x029a, TryCatch #4 {, blocks: (B:5:0x0005, B:7:0x001e, B:8:0x0033, B:11:0x0041, B:14:0x004d, B:16:0x0053, B:19:0x0061, B:22:0x0099, B:25:0x0179, B:27:0x0216, B:29:0x021a, B:31:0x0220, B:33:0x022a, B:35:0x022e, B:37:0x0234, B:39:0x0238, B:41:0x023e, B:43:0x0242, B:45:0x0248, B:47:0x024c, B:49:0x0252, B:51:0x0256, B:53:0x025c, B:60:0x0265, B:61:0x027a, B:64:0x0290, B:93:0x0176, B:98:0x0030, B:66:0x00bd, B:68:0x00cd, B:70:0x00d9, B:74:0x00f2, B:76:0x00fe, B:80:0x0117, B:83:0x012e, B:85:0x0167, B:86:0x016d, B:87:0x0174, B:89:0x010e, B:91:0x00e9), top: B:4:0x0005, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021a A[Catch: NumberFormatException -> 0x028f, all -> 0x029a, TryCatch #3 {NumberFormatException -> 0x028f, blocks: (B:27:0x0216, B:29:0x021a, B:31:0x0220, B:61:0x027a), top: B:26:0x0216, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.facebook.mqtt.service.ConnectionConfig A05(X.InterfaceC93764Ji r68, X.C4MI r69, X.C4MT r70, java.util.concurrent.Executor r71) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94464My.A05(X.4Ji, X.4MI, X.4MT, java.util.concurrent.Executor):com.facebook.mqtt.service.ConnectionConfig");
    }
}
