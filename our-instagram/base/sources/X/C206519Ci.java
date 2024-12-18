package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;

/* renamed from: X.9Ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206519Ci extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final Object A08;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A04 = obj;
        this.A00 |= Integer.MIN_VALUE;
        if (i != 0) {
            return ((AvatarStickerPreRenderInteractor) this.A08).A02(null, null, this, false);
        }
        return ((ClipsDraftRepository) this.A08).A0F(null, null, this, null, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206519Ci(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A07 = i;
        this.A08 = obj;
    }
}
