package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.UUID;

/* renamed from: X.56x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1126756x implements InterfaceC12870lZ, InterfaceC13000lm {
    public final Context A00;
    public final Handler A01;
    public final UserSession A02;
    public final C1CL A03;
    public final boolean A04;

    public /* synthetic */ C1126756x(UserSession userSession, boolean z) {
        C1CL c1cl = new C1CL(userSession);
        Context applicationContext = userSession.deviceSession.A06().getApplicationContext();
        Handler handler = new Handler(Looper.getMainLooper());
        C14360o3.A0B(applicationContext, 4);
        this.A02 = userSession;
        this.A04 = z;
        this.A03 = c1cl;
        this.A00 = applicationContext;
        this.A01 = handler;
        C218914p.A03(EnumC220415e.A03, this);
        handler.postDelayed(new Runnable() { // from class: X.56y
            @Override // java.lang.Runnable
            public final void run() {
                C1126756x.this.A00();
            }
        }, 10000L);
    }

    public final void A00() {
        C17790uH A00 = AbstractC17610tw.A00(this.A02);
        C1CL c1cl = this.A03;
        C17590tu c17590tu = new C17590tu(A00);
        boolean z = this.A04;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Context context = c1cl.A00;
        UserSession userSession = c1cl.A01;
        C70810WhQ A002 = C70810WhQ.A00(context, userSession);
        C70810WhQ.A01(A002);
        C69018Vfu c69018Vfu = A002.A01;
        if (!Collections.unmodifiableList(c69018Vfu.A01).isEmpty()) {
            try {
                String A003 = AbstractC69964Vyf.A00(c69018Vfu);
                if (A003 != null) {
                    linkedHashMap.put("client_feed_changelist", A003);
                }
            } catch (IOException unused) {
            }
        }
        C14360o3.A07(UUID.randomUUID().toString());
        String A004 = C1EP.A00();
        C1EN c1en = C1EN.A0J;
        C23491Cl c23491Cl = c1cl.A02;
        C1EY A01 = C1EW.A01(userSession, true);
        C16920sk A0E = AbstractC06930Yk.A0E();
        C25120B9q c25120B9q = C25120B9q.A00;
        C14360o3.A0B(A01, 5);
        C14360o3.A0B(A0E, 9);
        C14360o3.A0B(c25120B9q, 11);
        UserSession userSession2 = c23491Cl.A01;
        String A04 = C18U.A04(C06090Tz.A05, userSession2, 36886592182289118L);
        C1ES A005 = C1ER.A00(userSession2, c1en, null, null, false);
        if (A04.length() == 0) {
            A04 = null;
        }
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        C1EU c1eu = new C1EU(null, c17590tu, c1en, A005, null, A004, null, null, null, obj, A04, A0E, linkedHashMap, C1EU.A0G.incrementAndGet(), false, false);
        C25621Ms c25621Ms = new C25621Ms(userSession2, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0E = "feed/timeline/";
        c25621Ms.A0Q(new C128235qs(new C07510aQ(userSession2), A01, -20));
        AbstractC23721Ec abstractC23721Ec = (AbstractC23721Ec) c25120B9q.invoke(c25621Ms);
        AbstractC23771Ej.A02(c23491Cl.A00, abstractC23721Ec, userSession2, c1eu, c23491Cl.A02);
        abstractC23721Ec.A0G(AbstractC31192Dnb.A00(42, 10, 38), A004);
        abstractC23721Ec.A0G(AbstractC43591JPw.A00(31), "567067343352427");
        abstractC23721Ec.A0G("User-Agent", C1FO.A00());
        C25621Ms c25621Ms2 = (C25621Ms) abstractC23721Ec;
        if (z) {
            c25621Ms2.A0G("X_IG_TRANSFER_ENCODING", "chunked");
        }
        try {
            C1QW c1qw = c25621Ms2.A0O().A02;
            C1JP c1jp = c1qw.A05;
            if (c1jp != null) {
                c1jp.ACw(c1qw.A09, c1qw.A01);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC26611Qq.A00(c1qw.A07));
            sb.append(" ");
            sb.append("/api/v1/feed/timeline/");
            sb.append(" HTTP/1.1\n");
            sb.append("Host: ");
            sb.append("i.instagram.com:443");
            sb.append("\n");
            sb.append("Accept: */*\n");
            for (C23781El c23781El : c1qw.A01) {
                sb.append(c23781El.A00);
                sb.append(": ");
                sb.append(c23781El.A01);
                sb.append("\n");
            }
            InterfaceC26421Px interfaceC26421Px = c1qw.A06;
            if (interfaceC26421Px != null) {
                sb.append(interfaceC26421Px.Ar8());
                sb.append("\n");
                sb.append("Content-Length");
                sb.append(": ");
                sb.append(interfaceC26421Px.getContentLength());
                sb.append("\n");
                sb.append(interfaceC26421Px.Aqy());
                sb.append("\n");
            }
            sb.append("\n");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (interfaceC26421Px != null) {
                String obj2 = sb.toString();
                C14360o3.A07(obj2);
                byte[] bytes = obj2.getBytes(C15W.A05);
                C14360o3.A07(bytes);
                byteArrayOutputStream.write(bytes);
                InputStream E2i = interfaceC26421Px.E2i();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = E2i.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                E2i.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray != null) {
                    FileOutputStream openFileOutput = this.A00.openFileOutput("FeedPrimingRequest.bin", 0);
                    openFileOutput.write(byteArray);
                    openFileOutput.close();
                }
            }
        } catch (IOException | Exception unused2) {
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (AbstractC201688vy.A01(this.A02, C05F.A07)) {
            C218914p.A06(this);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(617321055);
        A00();
        C0f9.A0A(647717887, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1067708703, C0f9.A03(-27146086));
    }
}
