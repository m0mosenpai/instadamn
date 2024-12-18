package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import java.io.StringWriter;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5jU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124155jU implements InterfaceC13050lr {
    public static final long A0A = TimeUnit.HOURS.toMillis(5);
    public C1ON A00;
    public final UserSession A01;
    public final C13920nI A08 = C13920nI.A00;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C9EU(this, 42));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C9EU(this, 44));
    public final C124165jV A02 = new InterfaceC195278kT() { // from class: X.5jV
        @Override // X.InterfaceC195278kT
        public final /* bridge */ /* synthetic */ Object AOx(String str) {
            C14360o3.A0B(str, 0);
            Keyword parseFromJson = MZ7.parseFromJson(C16V.A00(str));
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.InterfaceC195278kT
        public final /* bridge */ /* synthetic */ String AhL(Object obj) {
            Keyword keyword = (Keyword) obj;
            C14360o3.A0B(keyword, 0);
            return keyword.A04;
        }

        @Override // X.InterfaceC195278kT
        public final /* bridge */ /* synthetic */ String EOt(Object obj) {
            Keyword keyword = (Keyword) obj;
            C14360o3.A0B(keyword, 0);
            StringWriter stringWriter = new StringWriter();
            C17z A0A2 = AbstractC221915u.A00.A0A(stringWriter);
            MZ7.A00(A0A2, keyword);
            A0A2.close();
            String obj2 = stringWriter.toString();
            C14360o3.A07(obj2);
            return obj2;
        }
    };
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C9EU(this, 43));
    public final C124175jW A09 = new C1P1() { // from class: X.5jW
        @Override // X.C1P1
        public final void onFailInBackground(AbstractC115105If abstractC115105If) {
            int A03 = C0f9.A03(-1372486884);
            C124155jU c124155jU = C124155jU.this;
            synchronized (c124155jU) {
                try {
                    if (c124155jU.A00 != null) {
                        c124155jU.A00 = null;
                        ((C195298kV) c124155jU.A06.getValue()).A03();
                    }
                } catch (Throwable th) {
                    C0f9.A0A(1724793353, A03);
                    throw th;
                }
            }
            C0f9.A0A(-690748077, A03);
        }

        @Override // X.C1P1
        public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
            int A03 = C0f9.A03(1340583925);
            HAB hab = (HAB) obj;
            int A032 = C0f9.A03(2114526300);
            C14360o3.A0B(hab, 0);
            C124155jU c124155jU = C124155jU.this;
            synchronized (c124155jU) {
                try {
                    if (c124155jU.A00 != null) {
                        c124155jU.A00 = null;
                        InterfaceC09390do interfaceC09390do = c124155jU.A06;
                        ((C195298kV) interfaceC09390do.getValue()).A07(hab.A00);
                        ((C195298kV) interfaceC09390do.getValue()).A05(System.currentTimeMillis() + C124155jU.A0A);
                    }
                } catch (Throwable th) {
                    C0f9.A0A(-1554791828, A032);
                    throw th;
                }
            }
            C0f9.A0A(-676541762, A032);
            C0f9.A0A(313936072, A03);
        }
    };
    public final Comparator A04 = C127175ov.A00;
    public final Comparator A03 = C127185ow.A00;

    @Override // X.InterfaceC13050lr
    public final synchronized void onUserSessionWillEnd(boolean z) {
        if (!((Boolean) this.A07.getValue()).booleanValue()) {
            C1ON c1on = this.A00;
            if (c1on != null) {
                c1on.cancel();
                this.A00 = null;
            }
            ((C195298kV) this.A06.getValue()).A01();
        }
    }

    public static final void A00(C124155jU c124155jU) {
        if (!((Boolean) c124155jU.A07.getValue()).booleanValue() && c124155jU.A00 == null && ((Boolean) c124155jU.A05.getValue()).booleanValue()) {
            C25621Ms c25621Ms = new C25621Ms(c124155jU.A01, -2);
            c25621Ms.A06();
            c25621Ms.A0B("fbsearch/search_entity_bootstrap/");
            c25621Ms.A0R(HAB.class, IS5.class);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = c124155jU.A09;
            c124155jU.A00 = A0N;
            C1GJ.A03(A0N);
        }
    }

    public final void A01() {
        if (!((Boolean) this.A07.getValue()).booleanValue()) {
            InterfaceC09390do interfaceC09390do = this.A06;
            ((C195298kV) interfaceC09390do.getValue()).A01();
            ((C195298kV) interfaceC09390do.getValue()).A02();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.5jV] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.5jW] */
    public C124155jU(UserSession userSession) {
        this.A01 = userSession;
    }
}
