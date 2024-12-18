package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.mediasend.PermanentMediaSenderImpl$sendVideo$1;
import com.instagram.model.direct.DirectShareTarget;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36941nr implements InterfaceC36951ns {
    public final Context A03;
    public final C19L A04 = AbstractC24771Iv.A01(72, 3);
    public WeakReference A00 = new WeakReference(null);
    public final Map A02 = new LinkedHashMap();
    public final Map A01 = new LinkedHashMap();

    public static final void A00(C26086BgF c26086BgF, Medium medium, UserSession userSession, C36941nr c36941nr, InterfaceC185598Lb interfaceC185598Lb, ACA aca, C211689Zc c211689Zc, A8X a8x, C47Z c47z, boolean z) {
        List<C45019JwA> A0g;
        if (a8x != null) {
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36323560625352050L)) {
                Map map = c36941nr.A02;
                String str = a8x.A02;
                if (!map.containsKey(str)) {
                    map.put(str, new ArrayList());
                }
                List list = (List) map.get(str);
                if (list != null) {
                    list.add(new C45019JwA(medium, c47z, a8x.A01));
                }
                if (interfaceC185598Lb != null) {
                    Map map2 = c36941nr.A01;
                    if (!map2.containsKey(str)) {
                        map2.put(str, new ArrayList());
                    }
                    List list2 = (List) map2.get(str);
                    if (list2 != null) {
                        list2.add(interfaceC185598Lb);
                    }
                }
                List list3 = (List) map.get(str);
                if (list3 != null && a8x.A00 == list3.size()) {
                    Iterable iterable = (Iterable) map.get(str);
                    if (iterable != null && (A0g = AbstractC001800i.A0g(iterable, new M7S())) != null) {
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0g, 10));
                        for (C45019JwA c45019JwA : A0g) {
                            arrayList.add(new C45029JwK(c45019JwA.A01, c45019JwA.A02));
                        }
                        c36941nr.A01(c26086BgF, userSession, new C23797Ag8(c36941nr, aca, a8x), aca, c211689Zc, arrayList, z);
                        map.remove(str);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
        }
        List singletonList = Collections.singletonList(new C45029JwK(medium, c47z));
        C14360o3.A07(singletonList);
        c36941nr.A01(c26086BgF, userSession, interfaceC185598Lb, aca, c211689Zc, singletonList, z);
    }

    @Override // X.InterfaceC36951ns
    public final void ENy(C26086BgF c26086BgF, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, InterfaceC185598Lb interfaceC185598Lb, ACA aca, C211689Zc c211689Zc, A8X a8x, C47Z c47z, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        Medium A05 = Medium.A0i.A05(new File(str));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        A05.A04 = options.outHeight;
        A05.A0B = options.outWidth;
        A05.A0G.A00(mediaUploadMetadata);
        A00(c26086BgF, A05, userSession, this, interfaceC185598Lb, aca, c211689Zc, a8x, c47z, z);
    }

    @Override // X.InterfaceC36951ns
    public final void EOg(C26086BgF c26086BgF, UserSession userSession, InterfaceC185598Lb interfaceC185598Lb, ACA aca, C211689Zc c211689Zc, A8X a8x, C47Z c47z, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(aca, 1);
        C14360o3.A0B(str, 3);
        C19L c19l = this.A04;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PermanentMediaSenderImpl$sendVideo$1(c26086BgF, userSession, this, interfaceC185598Lb, aca, c211689Zc, a8x, c47z, str, null), c19l);
    }

    private final void A01(C26086BgF c26086BgF, UserSession userSession, InterfaceC185598Lb interfaceC185598Lb, ACA aca, C211689Zc c211689Zc, List list, boolean z) {
        DirectShareTarget directShareTarget = aca.A00;
        if (directShareTarget != null) {
            String obj = C22P.A2T.toString();
            C7IR c7ir = new C7IR(userSession, new C7IP(null, obj, "direct_postcapture_camera", null), null, AbstractC165967bO.A00(userSession), new C9E4(directShareTarget, 13), new C9E4(directShareTarget, 14), C25036B6j.A00, new C9E4(c211689Zc, 15), C25037B6k.A00);
            C7FB.A00(this.A03, userSession, new C23910Aid(userSession, new A74(list.size()), interfaceC185598Lb, aca, c7ir, (C7IT) this.A00.get(), directShareTarget, c211689Zc, obj)).A06(c26086BgF, null, c211689Zc, null, list, false, z);
        }
    }

    @Override // X.InterfaceC36951ns
    public final void ENx(C26086BgF c26086BgF, UserSession userSession, InterfaceC185598Lb interfaceC185598Lb, ACA aca, C211689Zc c211689Zc, A8X a8x, C183978Ee c183978Ee, boolean z) {
        Medium medium = c183978Ee.A0F;
        if (medium != null) {
            String BcE = C7FC.A00(userSession).BcE(medium.A05);
            if (BcE != null) {
                A00(c26086BgF, medium, userSession, this, interfaceC185598Lb, aca, c211689Zc, a8x, C25A.A00(userSession).A03(BcE), z);
                return;
            }
        }
        ENy(c26086BgF, c183978Ee.A01(), userSession, interfaceC185598Lb, aca, c211689Zc, a8x, null, c183978Ee.A06(), z);
    }

    public C36941nr(Context context) {
        this.A03 = context;
    }
}
