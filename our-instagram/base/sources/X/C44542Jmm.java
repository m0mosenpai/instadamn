package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Jmm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44542Jmm extends AbstractC52922bZ {
    public int A00;
    public final C2GS A01;
    public final C86I A02;
    public final L98 A03;
    public final MiniGalleryService A04;
    public final C87T A05;
    public final UserSession A06;
    public final String A07;
    public final Map A08;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r14.A07 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.PVJ A00(X.C47703L4k r14, X.C44542Jmm r15) {
        /*
            X.87T r0 = r15.A05
            java.lang.String r5 = r15.A07
            r9 = 0
            X.87R r1 = r0.A0C
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L25
            X.24Q r4 = r1.A01
            java.util.concurrent.atomic.AtomicLong r3 = r1.A03
            long r1 = r3.get()
            java.lang.String r0 = "fetching_gallery_content"
            r4.A0C(r0, r1)
            long r1 = r3.get()
            java.lang.String r0 = "category_id"
            r4.A09(r1, r0, r5)
        L25:
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r2 = r15.A04
            X.8dV r3 = X.C191258dU.A03
            X.859 r0 = r14.A00
            X.85A r1 = r0.A00
            java.lang.String r0 = r14.A01
            X.8dU r4 = r3.A01(r1, r0)
            java.lang.String r6 = r14.A02
            if (r6 == 0) goto L41
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "SAVED"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L46
        L41:
            boolean r0 = r14.A07
            r10 = 1
            if (r0 == 0) goto L47
        L46:
            r10 = 0
        L47:
            r5 = 0
            boolean r12 = r14.A06
            r7 = 3
            r11 = 1
            X.80d r3 = new X.80d
            r13 = r9
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13)
            com.instagram.ar.core.effectcollection.EffectCollectionService r0 = r2.A02
            X.0xP r1 = r0.A0F(r3)
            X.PVJ r0 = new X.PVJ
            r0.<init>(r9, r14, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44542Jmm.A00(X.L4k, X.Jmm):X.PVJ");
    }

    public final void A01() {
        String A01;
        if (this.A01.A02() != null) {
            String str = this.A07;
            if (!C14360o3.A0K(str, "SAVED")) {
                this.A05.A0A(str);
                return;
            }
        }
        L98 l98 = this.A03;
        if (!l98.A06.getAndSet(true) && !l98.A05.getAndSet(true)) {
            C24Q c24q = l98.A02;
            long A04 = c24q.A04(Integer.valueOf(UUID.randomUUID().hashCode()), null, 17633831, l98.A01);
            l98.A00 = A04;
            c24q.A0A(A04, "category_id", l98.A03);
            c24q.A0A(l98.A00, "product_id", l98.A04);
        }
        C87T c87t = this.A05;
        String str2 = this.A07;
        c87t.A0A(str2);
        AnonymousClass859 anonymousClass859 = c87t.A03;
        if ((C14360o3.A0K(str2, "FOR_YOU") || C14360o3.A0K(str2, "FOR_YOU_MG")) && C14360o3.A0K(C87T.A00(c87t), str2)) {
            A01 = AbstractC189108Zb.A01((C85D) c87t.A04.A00.getValue());
        } else {
            A01 = null;
        }
        AbstractC25232BEp.A1J(this, new MC5(this, null, 4), A00(new C47703L4k(anonymousClass859, str2, null, A01, c87t.A0G, c87t.A0I, c87t.A0M.get(), c87t.A0K.get()), this));
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A03.A01("cleared");
    }

    public /* synthetic */ C44542Jmm(MiniGalleryService miniGalleryService, C87T c87t, UserSession userSession, String str) {
        C173767oU A04 = c87t.A04();
        AbstractC25229BEm.A1I(miniGalleryService, 4, A04);
        this.A07 = str;
        this.A06 = userSession;
        this.A04 = miniGalleryService;
        this.A05 = c87t;
        this.A02 = A04;
        this.A01 = new C2GS();
        this.A03 = new L98(userSession, str, c87t.A03.A00.name());
        this.A08 = AbstractC166987dD.A1I();
        AbstractC25232BEp.A1J(this, new MCC(this, null, 12), new C43818JZg(5, C0JE.A00(new C9D3(userSession, (InterfaceC23621Ds) null, 12, 42)), this));
    }
}
