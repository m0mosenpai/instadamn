package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jmp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44545Jmp extends AbstractC52922bZ {
    public String A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public int A03;
    public final C2GS A04;
    public final C86I A05;
    public final MiniGalleryService A06;
    public final C87T A07;
    public final UserSession A08;
    public final String A09;
    public final String A0A;

    /* JADX WARN: Type inference failed for: r1v8, types: [X.KiJ, java.lang.Object] */
    public static final void A01(C44545Jmp c44545Jmp, C3NY c3ny, String str, boolean z) {
        int i;
        if (c3ny instanceof C3NX) {
            if (str != null && str.length() != 0) {
                C4T6 A00 = C4T4.A00(c44545Jmp.A08);
                String str2 = c44545Jmp.A09;
                String str3 = c44545Jmp.A0A;
                C16930sl c16930sl = C16930sl.A00;
                List list = ((C47601L0l) ((C3NX) c3ny).A00).A01;
                ArrayList A0i = AbstractC167007dF.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0i.add(((CameraAREffect) it.next()).A0K);
                }
                A00.Cj3(AbstractC225599xe.A00(c44545Jmp.A07.A03), XkZ.A04, str, str2, str3, c16930sl, A0i);
            }
            C47601L0l c47601L0l = (C47601L0l) ((C3NX) c3ny).A00;
            List list2 = c47601L0l.A01;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list2) {
                if (!c44545Jmp.A05.Cnh((CameraAREffect) obj)) {
                    A1E.add(obj);
                }
            }
            ArrayList A0i2 = AbstractC167007dF.A0i(A1E);
            int i2 = 0;
            for (Object obj2 : A1E) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                CameraAREffect cameraAREffect = (CameraAREffect) obj2;
                String str4 = cameraAREffect.A0K;
                String str5 = cameraAREffect.A0S;
                SimpleImageUrl simpleImageUrl = new SimpleImageUrl(cameraAREffect.A07);
                ImageUrl imageUrl = cameraAREffect.A06;
                C87T c87t = c44545Jmp.A07;
                String str6 = cameraAREffect.A0K;
                C14360o3.A07(str6);
                boolean A02 = c87t.A04.A02(str6);
                String str7 = cameraAREffect.A0N;
                String str8 = cameraAREffect.A0O;
                boolean equals = "INSTAGRAM_CAMERA".equals(cameraAREffect.A0E);
                ?? obj3 = new Object();
                obj3.A09 = false;
                obj3.A05 = str4;
                obj3.A06 = str5;
                obj3.A04 = null;
                obj3.A01 = simpleImageUrl;
                obj3.A02 = imageUrl;
                obj3.A03 = null;
                obj3.A0B = A02;
                obj3.A00 = i2;
                obj3.A07 = str7;
                obj3.A08 = str8;
                obj3.A0A = equals;
                A0i2.add(new LHy((C46520KiJ) obj3));
                i2 = i3;
            }
            L2K l2k = new L2K(c47601L0l.A00, A0i2, z, c47601L0l.A02);
            c44545Jmp.A03 = AbstractC31172DnG.A02(l2k.A01, c44545Jmp.A03);
            c44545Jmp.A04.A0B(l2k);
            return;
        }
        if (c3ny instanceof C194848jk) {
            boolean z2 = ((C194848jk) c3ny).A00 instanceof C214569eu;
            C86K c86k = c44545Jmp.A07.A0F;
            if (z2) {
                i = 2131964574;
            } else {
                i = 2131968430;
            }
            c86k.A0B(Integer.valueOf(i));
            return;
        }
        throw B4Z.A00();
    }

    public static final InterfaceC19390xP A00(C44545Jmp c44545Jmp, String str, String str2) {
        MiniGalleryService miniGalleryService = c44545Jmp.A06;
        String str3 = c44545Jmp.A0A;
        C87T c87t = c44545Jmp.A07;
        AnonymousClass859 anonymousClass859 = c87t.A03;
        boolean z = c87t.A0M.get();
        AbstractC167007dF.A1D(anonymousClass859, 1, str);
        C191258dU A01 = C191258dU.A03.A01(anonymousClass859.A00, "search");
        if (str2 == null && str.equals(miniGalleryService.A00) && !z) {
            return AnonymousClass111.A02(new MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1(miniGalleryService, anonymousClass859, str3, str, str2, null), new AnonymousClass058(new C9DH(new C1807580d(A01, null, str2, 3L, false, true, false, true, false), (InterfaceC23621Ds) null, miniGalleryService.A02, 10)));
        }
        return MiniGalleryService.A00(miniGalleryService, anonymousClass859, str3, str, str2);
    }

    public /* synthetic */ C44545Jmp(MiniGalleryService miniGalleryService, C87T c87t, UserSession userSession, String str, String str2) {
        C173767oU A04 = c87t.A04();
        AbstractC37302Gc3.A1U(userSession, miniGalleryService);
        C14360o3.A0B(A04, 6);
        this.A09 = str;
        this.A0A = str2;
        this.A08 = userSession;
        this.A06 = miniGalleryService;
        this.A07 = c87t;
        this.A05 = A04;
        this.A04 = new C2GS();
    }
}
