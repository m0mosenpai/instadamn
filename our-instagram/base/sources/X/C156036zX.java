package X;

import androidx.lifecycle.CoroutineLiveData;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;

/* renamed from: X.6zX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156036zX {
    public boolean A00;
    public final C2GT A01;

    public C156036zX(C07X c07x, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository) {
        C14360o3.A0B(clipsDraftPreviewItemRepository, 2);
        final InterfaceC19390xP interfaceC19390xP = clipsDraftPreviewItemRepository.A03;
        CoroutineLiveData A00 = AbstractC58232lf.A00(AnonymousClass191.A00, new InterfaceC19390xP() { // from class: X.6zY
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new C71W(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
        this.A01 = A00;
        A00.A06(c07x, new C156056zZ(new C9E2(this, 20)));
    }
}
